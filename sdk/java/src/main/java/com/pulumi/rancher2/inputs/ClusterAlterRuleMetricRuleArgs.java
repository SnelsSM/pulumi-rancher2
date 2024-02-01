// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAlterRuleMetricRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlterRuleMetricRuleArgs Empty = new ClusterAlterRuleMetricRuleArgs();

    /**
     * Metric rule comparison
     * 
     */
    @Import(name="comparison")
    private @Nullable Output<String> comparison;

    /**
     * @return Metric rule comparison
     * 
     */
    public Optional<Output<String>> comparison() {
        return Optional.ofNullable(this.comparison);
    }

    /**
     * The cluster alert group description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The cluster alert group description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Metric rule duration
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return Metric rule duration
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Metric rule expression
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Metric rule expression
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Metric rule threshold value
     * 
     */
    @Import(name="thresholdValue", required=true)
    private Output<Double> thresholdValue;

    /**
     * @return Metric rule threshold value
     * 
     */
    public Output<Double> thresholdValue() {
        return this.thresholdValue;
    }

    private ClusterAlterRuleMetricRuleArgs() {}

    private ClusterAlterRuleMetricRuleArgs(ClusterAlterRuleMetricRuleArgs $) {
        this.comparison = $.comparison;
        this.description = $.description;
        this.duration = $.duration;
        this.expression = $.expression;
        this.thresholdValue = $.thresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlterRuleMetricRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlterRuleMetricRuleArgs $;

        public Builder() {
            $ = new ClusterAlterRuleMetricRuleArgs();
        }

        public Builder(ClusterAlterRuleMetricRuleArgs defaults) {
            $ = new ClusterAlterRuleMetricRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparison Metric rule comparison
         * 
         * @return builder
         * 
         */
        public Builder comparison(@Nullable Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param comparison Metric rule comparison
         * 
         * @return builder
         * 
         */
        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        /**
         * @param description The cluster alert group description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The cluster alert group description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param duration Metric rule duration
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Metric rule duration
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param expression Metric rule expression
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Metric rule expression
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param thresholdValue Metric rule threshold value
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(Output<Double> thresholdValue) {
            $.thresholdValue = thresholdValue;
            return this;
        }

        /**
         * @param thresholdValue Metric rule threshold value
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(Double thresholdValue) {
            return thresholdValue(Output.of(thresholdValue));
        }

        public ClusterAlterRuleMetricRuleArgs build() {
            if ($.duration == null) {
                throw new MissingRequiredPropertyException("ClusterAlterRuleMetricRuleArgs", "duration");
            }
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("ClusterAlterRuleMetricRuleArgs", "expression");
            }
            if ($.thresholdValue == null) {
                throw new MissingRequiredPropertyException("ClusterAlterRuleMetricRuleArgs", "thresholdValue");
            }
            return $;
        }
    }

}
