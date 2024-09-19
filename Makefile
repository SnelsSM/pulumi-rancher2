# WARNING: This file is autogenerated - changes will be overwritten if not made via https://github.com/pulumi/ci-mgmt

PACK := rancher2
ORG := pulumi
PROJECT := github.com/$(ORG)/pulumi-$(PACK)
PROVIDER_PATH := provider/v7
VERSION_PATH := $(PROVIDER_PATH)/pkg/version.Version
TFGEN := pulumi-tfgen-$(PACK)
PROVIDER := pulumi-resource-$(PACK)
JAVA_GEN := pulumi-java-gen
TESTPARALLELISM := 10
WORKING_DIR := $(shell pwd)
PULUMI_PROVIDER_BUILD_PARALLELISM ?=
PULUMI_CONVERT := 1
PULUMI_MISSING_DOCS_ERROR := true

# Override during CI using `make [TARGET] PROVIDER_VERSION=""` or by setting a PROVIDER_VERSION environment variable
# Local & branch builds will just used this fixed default version unless specified
PROVIDER_VERSION ?= 7.0.0-alpha.0+dev
# Use this normalised version everywhere rather than the raw input to ensure consistency.
VERSION_GENERIC = $(shell pulumictl convert-version --language generic --version "$(PROVIDER_VERSION)")

LDFLAGS_PROJ_VERSION=-X $(PROJECT)/$(VERSION_PATH)=$(VERSION_GENERIC)
LDFLAGS_UPSTREAM_VERSION=
LDFLAGS_EXTRAS=
LDFLAGS=$(LDFLAGS_PROJ_VERSION) $(LDFLAGS_UPSTREAM_VERSION) $(LDFLAGS_EXTRAS)

development: install_plugins provider build_sdks install_sdks

build: install_plugins provider build_sdks install_sdks

build_sdks: build_nodejs build_python build_dotnet build_go build_java 

install_go_sdk:

install_java_sdk:

install_python_sdk:

install_sdks: install_dotnet_sdk install_python_sdk install_nodejs_sdk install_java_sdk

only_build: build

build_dotnet: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
build_dotnet: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
build_dotnet: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
build_dotnet: upstream
	PULUMI_CONVERT=$(PULUMI_CONVERT) PULUMI_DISABLE_AUTOMATIC_PLUGIN_ACQUISITION=$(PULUMI_CONVERT) $(WORKING_DIR)/bin/$(TFGEN) dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		printf "module fake_dotnet_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		echo "$(VERSION_GENERIC)" >version.txt && \
		dotnet build

build_go: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
build_go: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
build_go: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
build_go: upstream
	PULUMI_CONVERT=$(PULUMI_CONVERT) PULUMI_DISABLE_AUTOMATIC_PLUGIN_ACQUISITION=$(PULUMI_CONVERT) $(WORKING_DIR)/bin/$(TFGEN) go --out sdk/go/
	cd sdk && go list "$$(grep -e "^module" go.mod | cut -d ' ' -f 2)/go/..." | xargs -I {} bash -c 'go build {} && go clean -i {}'

build_java: PACKAGE_VERSION := $(VERSION_GENERIC)
build_java: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
build_java: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
build_java: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
build_java: bin/pulumi-java-gen upstream
	$(WORKING_DIR)/bin/$(JAVA_GEN) generate --schema provider/cmd/$(PROVIDER)/schema.json --out sdk/java  --build gradle-nexus
	cd sdk/java/ && \
		printf "module fake_java_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		gradle --console=plain build && \
		gradle --console=plain javadoc

build_nodejs: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
build_nodejs: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
build_nodejs: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
build_nodejs: upstream
	PULUMI_CONVERT=$(PULUMI_CONVERT) PULUMI_DISABLE_AUTOMATIC_PLUGIN_ACQUISITION=$(PULUMI_CONVERT) $(WORKING_DIR)/bin/$(TFGEN) nodejs --out sdk/nodejs/
	cd sdk/nodejs/ && \
		printf "module fake_nodejs_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		yarn install && \
		yarn run tsc && \
		cp ../../README.md ../../LICENSE* package.json yarn.lock ./bin/

build_python: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
build_python: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
build_python: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
build_python: upstream
	rm -rf sdk/python/
	PULUMI_CONVERT=$(PULUMI_CONVERT) PULUMI_DISABLE_AUTOMATIC_PLUGIN_ACQUISITION=$(PULUMI_CONVERT) $(WORKING_DIR)/bin/$(TFGEN) python --out sdk/python/
	cd sdk/python/ && \
		printf "module fake_python_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		cp ../../README.md . && \
		rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
		rm ./bin/go.mod && \
		python3 -m venv venv && \
		./venv/bin/python -m pip install build==1.2.1 && \
		cd ./bin && \
		../venv/bin/python -m build .

clean:
	rm -rf sdk/{dotnet,nodejs,go,python}

cleanup:
	rm -r $(WORKING_DIR)/bin
	rm -f provider/cmd/$(PROVIDER)/schema.go

help:
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
	expand -t20

install_dotnet_sdk:
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} $(WORKING_DIR)/nuget \;

install_nodejs_sdk:
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_plugins: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
install_plugins: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
install_plugins: .pulumi/bin/pulumi
	.pulumi/bin/pulumi plugin install resource std 1.6.2
	.pulumi/bin/pulumi plugin install converter terraform 1.0.16

lint_provider: provider
	cd provider && golangci-lint run --path-prefix provider -c ../.golangci.yml

# `lint_provider.fix` is a utility target meant to be run manually
# that will run the linter and fix errors when possible.
lint_provider.fix:
	cd provider && golangci-lint run --path-prefix provider -c ../.golangci.yml --fix

# `make provider_no_deps` builds the provider binary directly, without ensuring that
# `cmd/pulumi-resource-rancher2/schema.json` is valid and up to date.
# To create a release ready binary, you should use `make provider`.
provider_no_deps:
	(cd provider && go build $(PULUMI_PROVIDER_BUILD_PARALLELISM) -o $(WORKING_DIR)/bin/$(PROVIDER) -ldflags "$(LDFLAGS)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(PROVIDER))

provider: tfgen provider_no_deps

test: export PATH := $(WORKING_DIR)/bin:$(PATH)
test:
	cd examples && go test -v -tags=all -parallel $(TESTPARALLELISM) -timeout 2h

test_provider:
	@echo ""
	@echo "== test_provider ==================================================================="
	@echo ""
	cd provider && go test -v -short ./... -parallel $(TESTPARALLELISM)

tfgen: install_plugins upstream tfgen_no_deps

tfgen_no_deps: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
tfgen_no_deps: export PATH := $(WORKING_DIR)/.pulumi/bin:$(PATH)
tfgen_no_deps: export PULUMI_CONVERT := $(PULUMI_CONVERT)
tfgen_no_deps: export PULUMI_CONVERT_EXAMPLES_CACHE_DIR := $(WORKING_DIR)/.pulumi/examples-cache
tfgen_no_deps: export PULUMI_DISABLE_AUTOMATIC_PLUGIN_ACQUISITION := $(PULUMI_CONVERT)
tfgen_no_deps: export PULUMI_MISSING_DOCS_ERROR := $(PULUMI_MISSING_DOCS_ERROR)
tfgen_no_deps: tfgen_build_only
	$(WORKING_DIR)/bin/$(TFGEN) schema --out provider/cmd/$(PROVIDER)
	(cd provider && VERSION=$(VERSION_GENERIC) go generate cmd/$(PROVIDER)/main.go)

tfgen_build_only:
	(cd provider && go build $(PULUMI_PROVIDER_BUILD_PARALLELISM) -o $(WORKING_DIR)/bin/$(TFGEN) -ldflags "$(LDFLAGS_PROJ_VERSION) $(LDFLAGS_EXTRAS)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(TFGEN))

upstream:
ifneq ("$(wildcard upstream)","")
	./upstream.sh init
endif

bin/pulumi-java-gen: .pulumi-java-gen.version
	pulumictl download-binary -n pulumi-language-java -v v$(shell cat .pulumi-java-gen.version) -r pulumi/pulumi-java

# To make an immediately observable change to .ci-mgmt.yaml:
#
# - Edit .ci-mgmt.yaml
# - Run make ci-mgmt to apply the change locally.
#
ci-mgmt: .ci-mgmt.yaml
	find .github/workflows/*.yml -type f ! -name "$(PACK)*.yml" -delete
	go run github.com/pulumi/ci-mgmt/provider-ci@master generate \
		--name $(ORG)/pulumi-$(PACK) \
		--out . \
		--template bridged-provider \
		--config $<

# Because some codegen depends on the version of the CLI used, we install a local CLI
# version pinned to the same version as `provider/go.mod`.
#
# This logic compares the version of .pulumi/bin/pulumi already installed. If it matches
# the desired version, we just print. Otherwise we (re)install pulumi at the desired
# version.
.pulumi/bin/pulumi: .pulumi/version
	@if [ -x .pulumi/bin/pulumi ] && [ "v$$(cat .pulumi/version)" = "$$(.pulumi/bin/pulumi version)" ]; then \
		echo "pulumi/bin/pulumi version: v$$(cat .pulumi/version)"; \
	else \
		curl -fsSL https://get.pulumi.com | \
			HOME=$(WORKING_DIR) sh -s -- --version "$$(cat .pulumi/version)"; \
	fi

# Compute the version of Pulumi to use by inspecting the Go dependencies of the provider.
.pulumi/version: provider/go.mod
	@mkdir -p .pulumi
	@cd provider && go list -f "{{slice .Version 1}}" -m github.com/pulumi/pulumi/pkg/v3 | tee ../$@

# Start debug server for tfgen
debug_tfgen:
	dlv  --listen=:2345 --headless=true --api-version=2  exec $(WORKING_DIR)/bin/$(TFGEN) -- schema --out provider/cmd/$(PROVIDER)

.PHONY: development build build_sdks install_go_sdk install_java_sdk install_python_sdk install_sdks only_build build_dotnet build_go build_java build_nodejs build_python clean cleanup help install_dotnet_sdk install_nodejs_sdk install_plugins lint_provider provider provider_no_deps test tfgen upstream ci-mgmt test_provider debug_tfgen tfgen_build_only

# Provider cross-platform build & packaging

# These targets assume that the schema-embed.json exists - it's generated by tfgen.
# We disable CGO to ensure that the binary is statically linked.
bin/linux-amd64/$(PROVIDER): TARGET := linux-amd64
bin/linux-arm64/$(PROVIDER): TARGET := linux-arm64
bin/darwin-amd64/$(PROVIDER): TARGET := darwin-amd64
bin/darwin-arm64/$(PROVIDER): TARGET := darwin-arm64
bin/windows-amd64/$(PROVIDER).exe: TARGET := windows-amd64
bin/%/$(PROVIDER) bin/%/$(PROVIDER).exe:
	@# check the TARGET is set
	test $(TARGET)
	cd provider && \
		export GOOS=$$(echo "$(TARGET)" | cut -d "-" -f 1) && \
		export GOARCH=$$(echo "$(TARGET)" | cut -d "-" -f 2) && \
		export CGO_ENABLED=0 && \
		go build -o "${WORKING_DIR}/$@" $(PULUMI_PROVIDER_BUILD_PARALLELISM) -ldflags "$(LDFLAGS)" "$(PROJECT)/$(PROVIDER_PATH)/cmd/$(PROVIDER)"

bin/$(PROVIDER)-v$(VERSION_GENERIC)-linux-amd64.tar.gz: bin/linux-amd64/$(PROVIDER)
bin/$(PROVIDER)-v$(VERSION_GENERIC)-linux-arm64.tar.gz: bin/linux-arm64/$(PROVIDER)
bin/$(PROVIDER)-v$(VERSION_GENERIC)-darwin-amd64.tar.gz: bin/darwin-amd64/$(PROVIDER)
bin/$(PROVIDER)-v$(VERSION_GENERIC)-darwin-arm64.tar.gz: bin/darwin-arm64/$(PROVIDER)
bin/$(PROVIDER)-v$(VERSION_GENERIC)-windows-amd64.tar.gz: bin/windows-amd64/$(PROVIDER).exe
bin/$(PROVIDER)-v$(VERSION_GENERIC)-%.tar.gz:
	@mkdir -p dist
	@# $< is the last dependency (the binary path from above) e.g. bin/linux-amd64/pulumi-resource-xyz
	@# $@ is the current target e.g. bin/pulumi-resource-xyz-v1.2.3-linux-amd64.tar.gz
	tar --gzip -cf $@ README.md LICENSE -C $$(dirname $<) .

provider_dist-linux-amd64: bin/$(PROVIDER)-v$(VERSION_GENERIC)-linux-amd64.tar.gz
provider_dist-linux-arm64: bin/$(PROVIDER)-v$(VERSION_GENERIC)-linux-arm64.tar.gz
provider_dist-darwin-amd64: bin/$(PROVIDER)-v$(VERSION_GENERIC)-darwin-amd64.tar.gz
provider_dist-darwin-arm64: bin/$(PROVIDER)-v$(VERSION_GENERIC)-darwin-arm64.tar.gz
provider_dist-windows-amd64: bin/$(PROVIDER)-v$(VERSION_GENERIC)-windows-amd64.tar.gz
provider_dist: provider_dist-linux-amd64 provider_dist-linux-arm64 provider_dist-darwin-amd64 provider_dist-darwin-arm64 provider_dist-windows-amd64
.PHONY: provider_dist-linux-amd64 provider_dist-linux-arm64 provider_dist-darwin-amd64 provider_dist-darwin-arm64 provider_dist-windows-amd64 provider_dist
