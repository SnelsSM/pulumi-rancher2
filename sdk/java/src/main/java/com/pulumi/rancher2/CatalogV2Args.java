// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogV2Args extends com.pulumi.resources.ResourceArgs {

    public static final CatalogV2Args Empty = new CatalogV2Args();

    /**
     * Annotations for the catalog v2 (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the catalog v2 (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
     * 
     */
    @Import(name="caBundle")
    private @Nullable Output<String> caBundle;

    /**
     * @return CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
     * 
     */
    public Optional<Output<String>> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }

    /**
     * The cluster id of the catalog V2 (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id of the catalog V2 (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Git Repository branch containing Helm chart definitions. Default `master` (string)
     * 
     */
    @Import(name="gitBranch")
    private @Nullable Output<String> gitBranch;

    /**
     * @return Git Repository branch containing Helm chart definitions. Default `master` (string)
     * 
     */
    public Optional<Output<String>> gitBranch() {
        return Optional.ofNullable(this.gitBranch);
    }

    /**
     * The url of the catalog v2 repo. Conflicts with `url` (string)
     * 
     */
    @Import(name="gitRepo")
    private @Nullable Output<String> gitRepo;

    /**
     * @return The url of the catalog v2 repo. Conflicts with `url` (string)
     * 
     */
    public Optional<Output<String>> gitRepo() {
        return Optional.ofNullable(this.gitRepo);
    }

    /**
     * Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * Labels for the catalog v2 (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for the catalog v2 (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the catalog v2 (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the catalog v2 (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * K8s secret name to be used to connect to the repo (string)
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return K8s secret name to be used to connect to the repo (string)
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    /**
     * K8s secret namespace (string)
     * 
     */
    @Import(name="secretNamespace")
    private @Nullable Output<String> secretNamespace;

    /**
     * @return K8s secret namespace (string)
     * 
     */
    public Optional<Output<String>> secretNamespace() {
        return Optional.ofNullable(this.secretNamespace);
    }

    /**
     * K8s service account used to deploy charts instead of the end users credentials (string)
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return K8s service account used to deploy charts instead of the end users credentials (string)
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The username to access the catalog if needed (string)
     * 
     */
    @Import(name="serviceAccountNamespace")
    private @Nullable Output<String> serviceAccountNamespace;

    /**
     * @return The username to access the catalog if needed (string)
     * 
     */
    public Optional<Output<String>> serviceAccountNamespace() {
        return Optional.ofNullable(this.serviceAccountNamespace);
    }

    /**
     * URL to an index generated by Helm. Conflicts with `git_repo` (string)
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return URL to an index generated by Helm. Conflicts with `git_repo` (string)
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private CatalogV2Args() {}

    private CatalogV2Args(CatalogV2Args $) {
        this.annotations = $.annotations;
        this.caBundle = $.caBundle;
        this.clusterId = $.clusterId;
        this.enabled = $.enabled;
        this.gitBranch = $.gitBranch;
        this.gitRepo = $.gitRepo;
        this.insecure = $.insecure;
        this.labels = $.labels;
        this.name = $.name;
        this.secretName = $.secretName;
        this.secretNamespace = $.secretNamespace;
        this.serviceAccount = $.serviceAccount;
        this.serviceAccountNamespace = $.serviceAccountNamespace;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogV2Args $;

        public Builder() {
            $ = new CatalogV2Args();
        }

        public Builder(CatalogV2Args defaults) {
            $ = new CatalogV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for the catalog v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the catalog v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param caBundle CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
         * 
         * @return builder
         * 
         */
        public Builder caBundle(@Nullable Output<String> caBundle) {
            $.caBundle = caBundle;
            return this;
        }

        /**
         * @param caBundle CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
         * 
         * @return builder
         * 
         */
        public Builder caBundle(String caBundle) {
            return caBundle(Output.of(caBundle));
        }

        /**
         * @param clusterId The cluster id of the catalog V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id of the catalog V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param enabled If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param gitBranch Git Repository branch containing Helm chart definitions. Default `master` (string)
         * 
         * @return builder
         * 
         */
        public Builder gitBranch(@Nullable Output<String> gitBranch) {
            $.gitBranch = gitBranch;
            return this;
        }

        /**
         * @param gitBranch Git Repository branch containing Helm chart definitions. Default `master` (string)
         * 
         * @return builder
         * 
         */
        public Builder gitBranch(String gitBranch) {
            return gitBranch(Output.of(gitBranch));
        }

        /**
         * @param gitRepo The url of the catalog v2 repo. Conflicts with `url` (string)
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(@Nullable Output<String> gitRepo) {
            $.gitRepo = gitRepo;
            return this;
        }

        /**
         * @param gitRepo The url of the catalog v2 repo. Conflicts with `url` (string)
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(String gitRepo) {
            return gitRepo(Output.of(gitRepo));
        }

        /**
         * @param insecure Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param labels Labels for the catalog v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the catalog v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the catalog v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the catalog v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secretName K8s secret name to be used to connect to the repo (string)
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName K8s secret name to be used to connect to the repo (string)
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param secretNamespace K8s secret namespace (string)
         * 
         * @return builder
         * 
         */
        public Builder secretNamespace(@Nullable Output<String> secretNamespace) {
            $.secretNamespace = secretNamespace;
            return this;
        }

        /**
         * @param secretNamespace K8s secret namespace (string)
         * 
         * @return builder
         * 
         */
        public Builder secretNamespace(String secretNamespace) {
            return secretNamespace(Output.of(secretNamespace));
        }

        /**
         * @param serviceAccount K8s service account used to deploy charts instead of the end users credentials (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount K8s service account used to deploy charts instead of the end users credentials (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param serviceAccountNamespace The username to access the catalog if needed (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountNamespace(@Nullable Output<String> serviceAccountNamespace) {
            $.serviceAccountNamespace = serviceAccountNamespace;
            return this;
        }

        /**
         * @param serviceAccountNamespace The username to access the catalog if needed (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountNamespace(String serviceAccountNamespace) {
            return serviceAccountNamespace(Output.of(serviceAccountNamespace));
        }

        /**
         * @param url URL to an index generated by Helm. Conflicts with `git_repo` (string)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL to an index generated by Helm. Conflicts with `git_repo` (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public CatalogV2Args build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("CatalogV2Args", "clusterId");
            }
            return $;
        }
    }

}
