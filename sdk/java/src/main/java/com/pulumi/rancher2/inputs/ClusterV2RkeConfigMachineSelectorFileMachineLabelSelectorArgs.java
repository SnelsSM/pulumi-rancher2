// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs Empty = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs();

    /**
     * Label selector match expressions
     * 
     */
    @Import(name="matchExpressions")
    private @Nullable Output<List<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs>> matchExpressions;

    /**
     * @return Label selector match expressions
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs>>> matchExpressions() {
        return Optional.ofNullable(this.matchExpressions);
    }

    /**
     * Label selector match labels
     * 
     */
    @Import(name="matchLabels")
    private @Nullable Output<Map<String,String>> matchLabels;

    /**
     * @return Label selector match labels
     * 
     */
    public Optional<Output<Map<String,String>>> matchLabels() {
        return Optional.ofNullable(this.matchLabels);
    }

    private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs() {}

    private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs $) {
        this.matchExpressions = $.matchExpressions;
        this.matchLabels = $.matchLabels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs();
        }

        public Builder(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs defaults) {
            $ = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchExpressions Label selector match expressions
         * 
         * @return builder
         * 
         */
        public Builder matchExpressions(@Nullable Output<List<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs>> matchExpressions) {
            $.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * @param matchExpressions Label selector match expressions
         * 
         * @return builder
         * 
         */
        public Builder matchExpressions(List<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs> matchExpressions) {
            return matchExpressions(Output.of(matchExpressions));
        }

        /**
         * @param matchExpressions Label selector match expressions
         * 
         * @return builder
         * 
         */
        public Builder matchExpressions(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }

        /**
         * @param matchLabels Label selector match labels
         * 
         * @return builder
         * 
         */
        public Builder matchLabels(@Nullable Output<Map<String,String>> matchLabels) {
            $.matchLabels = matchLabels;
            return this;
        }

        /**
         * @param matchLabels Label selector match labels
         * 
         * @return builder
         * 
         */
        public Builder matchLabels(Map<String,String> matchLabels) {
            return matchLabels(Output.of(matchLabels));
        }

        public ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs build() {
            return $;
        }
    }

}
