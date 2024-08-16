// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesKubeControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeControllerArgs Empty = new ClusterRkeConfigServicesKubeControllerArgs();

    /**
     * Cluster CIDR option for kube controller service (string)
     * 
     */
    @Import(name="clusterCidr")
    private @Nullable Output<String> clusterCidr;

    /**
     * @return Cluster CIDR option for kube controller service (string)
     * 
     */
    public Optional<Output<String>> clusterCidr() {
        return Optional.ofNullable(this.clusterCidr);
    }

    /**
     * Extra arguments for scheduler service (map)
     * 
     */
    @Import(name="extraArgs")
    private @Nullable Output<Map<String,String>> extraArgs;

    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Optional<Output<Map<String,String>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    /**
     * Extra binds for scheduler service (list)
     * 
     */
    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    /**
     * @return Extra binds for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    /**
     * Extra environment for scheduler service (list)
     * 
     */
    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    /**
     * @return Extra environment for scheduler service (list)
     * 
     */
    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Docker image for scheduler service (string)
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Docker image for scheduler service (string)
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Service Cluster ip Range option for kube controller service (string)
     * 
     */
    @Import(name="serviceClusterIpRange")
    private @Nullable Output<String> serviceClusterIpRange;

    /**
     * @return Service Cluster ip Range option for kube controller service (string)
     * 
     */
    public Optional<Output<String>> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }

    private ClusterRkeConfigServicesKubeControllerArgs() {}

    private ClusterRkeConfigServicesKubeControllerArgs(ClusterRkeConfigServicesKubeControllerArgs $) {
        this.clusterCidr = $.clusterCidr;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.image = $.image;
        this.serviceClusterIpRange = $.serviceClusterIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeControllerArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeControllerArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeControllerArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeControllerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterCidr Cluster CIDR option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterCidr(@Nullable Output<String> clusterCidr) {
            $.clusterCidr = clusterCidr;
            return this;
        }

        /**
         * @param clusterCidr Cluster CIDR option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterCidr(String clusterCidr) {
            return clusterCidr(Output.of(clusterCidr));
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(@Nullable Output<Map<String,String>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        /**
         * @param extraArgs Extra arguments for scheduler service (map)
         * 
         * @return builder
         * 
         */
        public Builder extraArgs(Map<String,String> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        /**
         * @param extraBinds Extra binds for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        /**
         * @param extraEnvs Extra environment for scheduler service (list)
         * 
         * @return builder
         * 
         */
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image for scheduler service (string)
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param serviceClusterIpRange Service Cluster ip Range option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(@Nullable Output<String> serviceClusterIpRange) {
            $.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }

        /**
         * @param serviceClusterIpRange Service Cluster ip Range option for kube controller service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceClusterIpRange(String serviceClusterIpRange) {
            return serviceClusterIpRange(Output.of(serviceClusterIpRange));
        }

        public ClusterRkeConfigServicesKubeControllerArgs build() {
            return $;
        }
    }

}
