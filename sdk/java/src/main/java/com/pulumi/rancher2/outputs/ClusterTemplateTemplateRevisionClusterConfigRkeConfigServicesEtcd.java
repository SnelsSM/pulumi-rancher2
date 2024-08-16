// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd {
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfig backupConfig;
    private @Nullable String caCert;
    private @Nullable String cert;
    private @Nullable String creation;
    private @Nullable List<String> externalUrls;
    private @Nullable Map<String,String> extraArgs;
    private @Nullable List<String> extraBinds;
    private @Nullable List<String> extraEnvs;
    private @Nullable Integer gid;
    private @Nullable String image;
    private @Nullable String key;
    private @Nullable String path;
    private @Nullable String retention;
    private @Nullable Boolean snapshot;
    private @Nullable Integer uid;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd() {}
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfig> backupConfig() {
        return Optional.ofNullable(this.backupConfig);
    }
    public Optional<String> caCert() {
        return Optional.ofNullable(this.caCert);
    }
    public Optional<String> cert() {
        return Optional.ofNullable(this.cert);
    }
    public Optional<String> creation() {
        return Optional.ofNullable(this.creation);
    }
    public List<String> externalUrls() {
        return this.externalUrls == null ? List.of() : this.externalUrls;
    }
    public Map<String,String> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    public Optional<Integer> gid() {
        return Optional.ofNullable(this.gid);
    }
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> retention() {
        return Optional.ofNullable(this.retention);
    }
    public Optional<Boolean> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    public Optional<Integer> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfig backupConfig;
        private @Nullable String caCert;
        private @Nullable String cert;
        private @Nullable String creation;
        private @Nullable List<String> externalUrls;
        private @Nullable Map<String,String> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable Integer gid;
        private @Nullable String image;
        private @Nullable String key;
        private @Nullable String path;
        private @Nullable String retention;
        private @Nullable Boolean snapshot;
        private @Nullable Integer uid;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupConfig = defaults.backupConfig;
    	      this.caCert = defaults.caCert;
    	      this.cert = defaults.cert;
    	      this.creation = defaults.creation;
    	      this.externalUrls = defaults.externalUrls;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.gid = defaults.gid;
    	      this.image = defaults.image;
    	      this.key = defaults.key;
    	      this.path = defaults.path;
    	      this.retention = defaults.retention;
    	      this.snapshot = defaults.snapshot;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder backupConfig(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfig backupConfig) {

            this.backupConfig = backupConfig;
            return this;
        }
        @CustomType.Setter
        public Builder caCert(@Nullable String caCert) {

            this.caCert = caCert;
            return this;
        }
        @CustomType.Setter
        public Builder cert(@Nullable String cert) {

            this.cert = cert;
            return this;
        }
        @CustomType.Setter
        public Builder creation(@Nullable String creation) {

            this.creation = creation;
            return this;
        }
        @CustomType.Setter
        public Builder externalUrls(@Nullable List<String> externalUrls) {

            this.externalUrls = externalUrls;
            return this;
        }
        public Builder externalUrls(String... externalUrls) {
            return externalUrls(List.of(externalUrls));
        }
        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,String> extraArgs) {

            this.extraArgs = extraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder extraBinds(@Nullable List<String> extraBinds) {

            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        @CustomType.Setter
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {

            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        @CustomType.Setter
        public Builder gid(@Nullable Integer gid) {

            this.gid = gid;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder retention(@Nullable String retention) {

            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder snapshot(@Nullable Boolean snapshot) {

            this.snapshot = snapshot;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable Integer uid) {

            this.uid = uid;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd();
            _resultValue.backupConfig = backupConfig;
            _resultValue.caCert = caCert;
            _resultValue.cert = cert;
            _resultValue.creation = creation;
            _resultValue.externalUrls = externalUrls;
            _resultValue.extraArgs = extraArgs;
            _resultValue.extraBinds = extraBinds;
            _resultValue.extraEnvs = extraEnvs;
            _resultValue.gid = gid;
            _resultValue.image = image;
            _resultValue.key = key;
            _resultValue.path = path;
            _resultValue.retention = retention;
            _resultValue.snapshot = snapshot;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
