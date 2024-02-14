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


public final class ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs Empty = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs();

    /**
     * Key is the name of the key of the item to retrieve.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key is the name of the key of the item to retrieve.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Values is a list of string values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Values is a list of string values.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs() {}

    private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs();
        }

        public Builder(ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs defaults) {
            $ = new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key is the name of the key of the item to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key is the name of the key of the item to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator Operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values Values is a list of string values.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Values is a list of string values.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Values is a list of string values.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs build() {
            return $;
        }
    }

}
