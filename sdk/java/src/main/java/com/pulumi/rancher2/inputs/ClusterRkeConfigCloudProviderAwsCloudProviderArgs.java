// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderAwsCloudProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderAwsCloudProviderArgs Empty = new ClusterRkeConfigCloudProviderAwsCloudProviderArgs();

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="global")
    private @Nullable Output<ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs> global;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs>> global() {
        return Optional.ofNullable(this.global);
    }

    /**
     * (list)
     * 
     */
    @Import(name="serviceOverrides")
    private @Nullable Output<List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs>> serviceOverrides;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs>>> serviceOverrides() {
        return Optional.ofNullable(this.serviceOverrides);
    }

    private ClusterRkeConfigCloudProviderAwsCloudProviderArgs() {}

    private ClusterRkeConfigCloudProviderAwsCloudProviderArgs(ClusterRkeConfigCloudProviderAwsCloudProviderArgs $) {
        this.global = $.global;
        this.serviceOverrides = $.serviceOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderAwsCloudProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderAwsCloudProviderArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderAwsCloudProviderArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderAwsCloudProviderArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderAwsCloudProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(@Nullable Output<ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs> global) {
            $.global = global;
            return this;
        }

        /**
         * @param global (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder global(ClusterRkeConfigCloudProviderAwsCloudProviderGlobalArgs global) {
            return global(Output.of(global));
        }

        /**
         * @param serviceOverrides (list)
         * 
         * @return builder
         * 
         */
        public Builder serviceOverrides(@Nullable Output<List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs>> serviceOverrides) {
            $.serviceOverrides = serviceOverrides;
            return this;
        }

        /**
         * @param serviceOverrides (list)
         * 
         * @return builder
         * 
         */
        public Builder serviceOverrides(List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs> serviceOverrides) {
            return serviceOverrides(Output.of(serviceOverrides));
        }

        /**
         * @param serviceOverrides (list)
         * 
         * @return builder
         * 
         */
        public Builder serviceOverrides(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs... serviceOverrides) {
            return serviceOverrides(List.of(serviceOverrides));
        }

        public ClusterRkeConfigCloudProviderAwsCloudProviderArgs build() {
            return $;
        }
    }

}
