// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs Empty = new ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs();

    /**
     * The taint key (string)
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The taint key (string)
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Machine selector label match expressions operator (string)
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Machine selector label match expressions operator (string)
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Machine selector label match expressions values (List string)
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Machine selector label match expressions values (List string)
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs() {}

    private ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs(ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs();
        }

        public Builder(ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs defaults) {
            $ = new ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The taint key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator Machine selector label match expressions operator (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Machine selector label match expressions operator (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values Machine selector label match expressions values (List string)
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Machine selector label match expressions values (List string)
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Machine selector label match expressions values (List string)
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs build() {
            return $;
        }
    }

}
