// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureState extends com.pulumi.resources.ResourceArgs {

    public static final FeatureState Empty = new FeatureState();

    /**
     * Annotations for feature object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for feature object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Labels for feature object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for feature object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the feature (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the feature. Default: `false` (bool)
     * 
     */
    @Import(name="value")
    private @Nullable Output<Boolean> value;

    /**
     * @return The value of the feature. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> value() {
        return Optional.ofNullable(this.value);
    }

    private FeatureState() {}

    private FeatureState(FeatureState $) {
        this.annotations = $.annotations;
        this.labels = $.labels;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureState $;

        public Builder() {
            $ = new FeatureState();
        }

        public Builder(FeatureState defaults) {
            $ = new FeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for feature object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for feature object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param labels Labels for feature object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for feature object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the feature (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the feature. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Boolean> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the feature. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public FeatureState build() {
            return $;
        }
    }

}
