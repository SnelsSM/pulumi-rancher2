// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs();

    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="provider")
    private @Nullable Output<String> provider;

    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * Monitoring add-on tolerations
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs>> tolerations;

    /**
     * @return Monitoring add-on tolerations
     * 
     */
    public Optional<Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    /**
     * Update deployment strategy
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs> updateStrategy;

    /**
     * @return Update deployment strategy
     * 
     */
    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs $) {
        this.nodeSelector = $.nodeSelector;
        this.options = $.options;
        this.provider = $.provider;
        this.replicas = $.replicas;
        this.tolerations = $.tolerations;
        this.updateStrategy = $.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param tolerations Monitoring add-on tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(@Nullable Output<List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        /**
         * @param tolerations Monitoring add-on tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        /**
         * @param tolerations Monitoring add-on tolerations
         * 
         * @return builder
         * 
         */
        public Builder tolerations(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringTolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        /**
         * @param updateStrategy Update deployment strategy
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy Update deployment strategy
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringArgs build() {
            return $;
        }
    }

}
