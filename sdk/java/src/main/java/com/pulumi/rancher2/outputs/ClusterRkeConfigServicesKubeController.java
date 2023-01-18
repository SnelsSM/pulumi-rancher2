// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigServicesKubeController {
    /**
     * @return Cluster CIDR option for kube controller service (string)
     * 
     */
    private @Nullable String clusterCidr;
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
     * @return Service Cluster IP Range option for kube API service (string)
     * 
     */
    private @Nullable String serviceClusterIpRange;

    private ClusterRkeConfigServicesKubeController() {}
    /**
     * @return Cluster CIDR option for kube controller service (string)
     * 
     */
    public Optional<String> clusterCidr() {
        return Optional.ofNullable(this.clusterCidr);
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
     * @return Service Cluster IP Range option for kube API service (string)
     * 
     */
    public Optional<String> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesKubeController defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterCidr;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable String image;
        private @Nullable String serviceClusterIpRange;
        public Builder() {}
        public Builder(ClusterRkeConfigServicesKubeController defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterCidr = defaults.clusterCidr;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
    	      this.serviceClusterIpRange = defaults.serviceClusterIpRange;
        }

        @CustomType.Setter
        public Builder clusterCidr(@Nullable String clusterCidr) {
            this.clusterCidr = clusterCidr;
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
        public Builder serviceClusterIpRange(@Nullable String serviceClusterIpRange) {
            this.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }
        public ClusterRkeConfigServicesKubeController build() {
            final var o = new ClusterRkeConfigServicesKubeController();
            o.clusterCidr = clusterCidr;
            o.extraArgs = extraArgs;
            o.extraBinds = extraBinds;
            o.extraEnvs = extraEnvs;
            o.image = image;
            o.serviceClusterIpRange = serviceClusterIpRange;
            return o;
        }
    }
}
