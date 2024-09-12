// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi {
    /**
     * @return Cluster admission configuration
     * 
     */
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration admissionConfiguration;
    private @Nullable Boolean alwaysPullImages;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog auditLog;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit eventRateLimit;
    private @Nullable Map<String,String> extraArgs;
    private @Nullable List<String> extraBinds;
    private @Nullable List<String> extraEnvs;
    private @Nullable String image;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig;
    private @Nullable String serviceClusterIpRange;
    private @Nullable String serviceNodePortRange;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi() {}
    /**
     * @return Cluster admission configuration
     * 
     */
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration> admissionConfiguration() {
        return Optional.ofNullable(this.admissionConfiguration);
    }
    public Optional<Boolean> alwaysPullImages() {
        return Optional.ofNullable(this.alwaysPullImages);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog> auditLog() {
        return Optional.ofNullable(this.auditLog);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit> eventRateLimit() {
        return Optional.ofNullable(this.eventRateLimit);
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
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig> secretsEncryptionConfig() {
        return Optional.ofNullable(this.secretsEncryptionConfig);
    }
    public Optional<String> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }
    public Optional<String> serviceNodePortRange() {
        return Optional.ofNullable(this.serviceNodePortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration admissionConfiguration;
        private @Nullable Boolean alwaysPullImages;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog auditLog;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit eventRateLimit;
        private @Nullable Map<String,String> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable String image;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig;
        private @Nullable String serviceClusterIpRange;
        private @Nullable String serviceNodePortRange;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionConfiguration = defaults.admissionConfiguration;
    	      this.alwaysPullImages = defaults.alwaysPullImages;
    	      this.auditLog = defaults.auditLog;
    	      this.eventRateLimit = defaults.eventRateLimit;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
    	      this.secretsEncryptionConfig = defaults.secretsEncryptionConfig;
    	      this.serviceClusterIpRange = defaults.serviceClusterIpRange;
    	      this.serviceNodePortRange = defaults.serviceNodePortRange;
        }

        @CustomType.Setter
        public Builder admissionConfiguration(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration admissionConfiguration) {

            this.admissionConfiguration = admissionConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder alwaysPullImages(@Nullable Boolean alwaysPullImages) {

            this.alwaysPullImages = alwaysPullImages;
            return this;
        }
        @CustomType.Setter
        public Builder auditLog(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog auditLog) {

            this.auditLog = auditLog;
            return this;
        }
        @CustomType.Setter
        public Builder eventRateLimit(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit eventRateLimit) {

            this.eventRateLimit = eventRateLimit;
            return this;
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
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder secretsEncryptionConfig(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig) {

            this.secretsEncryptionConfig = secretsEncryptionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder serviceClusterIpRange(@Nullable String serviceClusterIpRange) {

            this.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }
        @CustomType.Setter
        public Builder serviceNodePortRange(@Nullable String serviceNodePortRange) {

            this.serviceNodePortRange = serviceNodePortRange;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi();
            _resultValue.admissionConfiguration = admissionConfiguration;
            _resultValue.alwaysPullImages = alwaysPullImages;
            _resultValue.auditLog = auditLog;
            _resultValue.eventRateLimit = eventRateLimit;
            _resultValue.extraArgs = extraArgs;
            _resultValue.extraBinds = extraBinds;
            _resultValue.extraEnvs = extraEnvs;
            _resultValue.image = image;
            _resultValue.secretsEncryptionConfig = secretsEncryptionConfig;
            _resultValue.serviceClusterIpRange = serviceClusterIpRange;
            _resultValue.serviceNodePortRange = serviceNodePortRange;
            return _resultValue;
        }
    }
}
