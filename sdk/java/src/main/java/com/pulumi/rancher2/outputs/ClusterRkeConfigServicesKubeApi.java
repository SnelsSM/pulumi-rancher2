// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeApiAuditLog;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeApiEventRateLimit;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigServicesKubeApi {
    /**
     * @return Admission configuration (map)
     * 
     */
    private @Nullable Map<String,Object> admissionConfiguration;
    /**
     * @return Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) Default: `false` (bool)
     * 
     */
    private @Nullable Boolean alwaysPullImages;
    /**
     * @return K8s audit log configuration. (list maxitems: 1)
     * 
     */
    private @Nullable ClusterRkeConfigServicesKubeApiAuditLog auditLog;
    /**
     * @return K8s event rate limit configuration. (list maxitems: 1)
     * 
     */
    private @Nullable ClusterRkeConfigServicesKubeApiEventRateLimit eventRateLimit;
    /**
     * @return Extra arguments for RKE Ingress (map)
     * 
     */
    private @Nullable Map<String,Object> extraArgs;
    /**
     * @return Extra binds for etcd service (list)
     * 
     */
    private @Nullable List<String> extraBinds;
    /**
     * @return Extra environment for etcd service (list)
     * 
     */
    private @Nullable List<String> extraEnvs;
    /**
     * @return Docker image for etcd service (string)
     * 
     */
    private @Nullable String image;
    /**
     * @return Pod Security Policy option for kube API service. Default `false` (bool)
     * 
     */
    private @Nullable Boolean podSecurityPolicy;
    /**
     * @return [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
     * 
     */
    private @Nullable ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig;
    /**
     * @return Service Cluster IP Range option for kube API service (string)
     * 
     */
    private @Nullable String serviceClusterIpRange;
    /**
     * @return Service Node Port Range option for kube API service (string)
     * 
     */
    private @Nullable String serviceNodePortRange;

    private ClusterRkeConfigServicesKubeApi() {}
    /**
     * @return Admission configuration (map)
     * 
     */
    public Map<String,Object> admissionConfiguration() {
        return this.admissionConfiguration == null ? Map.of() : this.admissionConfiguration;
    }
    /**
     * @return Enable [AlwaysPullImages](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/#alwayspullimages) Admission controller plugin. [Rancher docs](https://rancher.com/docs/rke/latest/en/config-options/services/#kubernetes-api-server-options) Default: `false` (bool)
     * 
     */
    public Optional<Boolean> alwaysPullImages() {
        return Optional.ofNullable(this.alwaysPullImages);
    }
    /**
     * @return K8s audit log configuration. (list maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeApiAuditLog> auditLog() {
        return Optional.ofNullable(this.auditLog);
    }
    /**
     * @return K8s event rate limit configuration. (list maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeApiEventRateLimit> eventRateLimit() {
        return Optional.ofNullable(this.eventRateLimit);
    }
    /**
     * @return Extra arguments for RKE Ingress (map)
     * 
     */
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return Extra binds for etcd service (list)
     * 
     */
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    /**
     * @return Extra environment for etcd service (list)
     * 
     */
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    /**
     * @return Docker image for etcd service (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Pod Security Policy option for kube API service. Default `false` (bool)
     * 
     */
    public Optional<Boolean> podSecurityPolicy() {
        return Optional.ofNullable(this.podSecurityPolicy);
    }
    /**
     * @return [Encrypt k8s secret data configration](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/). (list maxitem: 1)
     * 
     */
    public Optional<ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig> secretsEncryptionConfig() {
        return Optional.ofNullable(this.secretsEncryptionConfig);
    }
    /**
     * @return Service Cluster IP Range option for kube API service (string)
     * 
     */
    public Optional<String> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }
    /**
     * @return Service Node Port Range option for kube API service (string)
     * 
     */
    public Optional<String> serviceNodePortRange() {
        return Optional.ofNullable(this.serviceNodePortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesKubeApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> admissionConfiguration;
        private @Nullable Boolean alwaysPullImages;
        private @Nullable ClusterRkeConfigServicesKubeApiAuditLog auditLog;
        private @Nullable ClusterRkeConfigServicesKubeApiEventRateLimit eventRateLimit;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable String image;
        private @Nullable Boolean podSecurityPolicy;
        private @Nullable ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig;
        private @Nullable String serviceClusterIpRange;
        private @Nullable String serviceNodePortRange;
        public Builder() {}
        public Builder(ClusterRkeConfigServicesKubeApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionConfiguration = defaults.admissionConfiguration;
    	      this.alwaysPullImages = defaults.alwaysPullImages;
    	      this.auditLog = defaults.auditLog;
    	      this.eventRateLimit = defaults.eventRateLimit;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
    	      this.podSecurityPolicy = defaults.podSecurityPolicy;
    	      this.secretsEncryptionConfig = defaults.secretsEncryptionConfig;
    	      this.serviceClusterIpRange = defaults.serviceClusterIpRange;
    	      this.serviceNodePortRange = defaults.serviceNodePortRange;
        }

        @CustomType.Setter
        public Builder admissionConfiguration(@Nullable Map<String,Object> admissionConfiguration) {
            this.admissionConfiguration = admissionConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder alwaysPullImages(@Nullable Boolean alwaysPullImages) {
            this.alwaysPullImages = alwaysPullImages;
            return this;
        }
        @CustomType.Setter
        public Builder auditLog(@Nullable ClusterRkeConfigServicesKubeApiAuditLog auditLog) {
            this.auditLog = auditLog;
            return this;
        }
        @CustomType.Setter
        public Builder eventRateLimit(@Nullable ClusterRkeConfigServicesKubeApiEventRateLimit eventRateLimit) {
            this.eventRateLimit = eventRateLimit;
            return this;
        }
        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
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
        public Builder podSecurityPolicy(@Nullable Boolean podSecurityPolicy) {
            this.podSecurityPolicy = podSecurityPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder secretsEncryptionConfig(@Nullable ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig secretsEncryptionConfig) {
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
        public ClusterRkeConfigServicesKubeApi build() {
            final var o = new ClusterRkeConfigServicesKubeApi();
            o.admissionConfiguration = admissionConfiguration;
            o.alwaysPullImages = alwaysPullImages;
            o.auditLog = auditLog;
            o.eventRateLimit = eventRateLimit;
            o.extraArgs = extraArgs;
            o.extraBinds = extraBinds;
            o.extraEnvs = extraEnvs;
            o.image = image;
            o.podSecurityPolicy = podSecurityPolicy;
            o.secretsEncryptionConfig = secretsEncryptionConfig;
            o.serviceClusterIpRange = serviceClusterIpRange;
            o.serviceNodePortRange = serviceNodePortRange;
            return o;
        }
    }
}
