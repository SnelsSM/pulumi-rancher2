// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionQuestionArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionArgs Empty = new ClusterTemplateTemplateRevisionArgs();

    /**
     * Annotations for the cluster template (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for the cluster template (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster configuration (list maxitem: 1)
     * 
     */
    @Import(name="clusterConfig", required=true)
    private Output<ClusterTemplateTemplateRevisionClusterConfigArgs> clusterConfig;

    /**
     * @return Cluster configuration (list maxitem: 1)
     * 
     */
    public Output<ClusterTemplateTemplateRevisionClusterConfigArgs> clusterConfig() {
        return this.clusterConfig;
    }

    /**
     * Cluster template ID (string)
     * 
     */
    @Import(name="clusterTemplateId")
    private @Nullable Output<String> clusterTemplateId;

    /**
     * @return Cluster template ID (string)
     * 
     */
    public Optional<Output<String>> clusterTemplateId() {
        return Optional.ofNullable(this.clusterTemplateId);
    }

    /**
     * Default variable value (string)
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Default variable value (string)
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Enable cluster template revision. Default `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable cluster template revision. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The cluster template revision ID (string)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The cluster template revision ID (string)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Labels for the cluster template (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the cluster template (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The cluster template name (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The cluster template name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Cluster template questions (list)
     * 
     */
    @Import(name="questions")
    private @Nullable Output<List<ClusterTemplateTemplateRevisionQuestionArgs>> questions;

    /**
     * @return Cluster template questions (list)
     * 
     */
    public Optional<Output<List<ClusterTemplateTemplateRevisionQuestionArgs>>> questions() {
        return Optional.ofNullable(this.questions);
    }

    private ClusterTemplateTemplateRevisionArgs() {}

    private ClusterTemplateTemplateRevisionArgs(ClusterTemplateTemplateRevisionArgs $) {
        this.annotations = $.annotations;
        this.clusterConfig = $.clusterConfig;
        this.clusterTemplateId = $.clusterTemplateId;
        this.default_ = $.default_;
        this.enabled = $.enabled;
        this.id = $.id;
        this.labels = $.labels;
        this.name = $.name;
        this.questions = $.questions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterConfig Cluster configuration (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(Output<ClusterTemplateTemplateRevisionClusterConfigArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * @param clusterConfig Cluster configuration (list maxitem: 1)
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(ClusterTemplateTemplateRevisionClusterConfigArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        /**
         * @param clusterTemplateId Cluster template ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterTemplateId(@Nullable Output<String> clusterTemplateId) {
            $.clusterTemplateId = clusterTemplateId;
            return this;
        }

        /**
         * @param clusterTemplateId Cluster template ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterTemplateId(String clusterTemplateId) {
            return clusterTemplateId(Output.of(clusterTemplateId));
        }

        /**
         * @param default_ Default variable value (string)
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Default variable value (string)
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param enabled Enable cluster template revision. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable cluster template revision. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param id The cluster template revision ID (string)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The cluster template revision ID (string)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels Labels for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The cluster template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The cluster template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param questions Cluster template questions (list)
         * 
         * @return builder
         * 
         */
        public Builder questions(@Nullable Output<List<ClusterTemplateTemplateRevisionQuestionArgs>> questions) {
            $.questions = questions;
            return this;
        }

        /**
         * @param questions Cluster template questions (list)
         * 
         * @return builder
         * 
         */
        public Builder questions(List<ClusterTemplateTemplateRevisionQuestionArgs> questions) {
            return questions(Output.of(questions));
        }

        /**
         * @param questions Cluster template questions (list)
         * 
         * @return builder
         * 
         */
        public Builder questions(ClusterTemplateTemplateRevisionQuestionArgs... questions) {
            return questions(List.of(questions));
        }

        public ClusterTemplateTemplateRevisionArgs build() {
            $.clusterConfig = Objects.requireNonNull($.clusterConfig, "expected parameter 'clusterConfig' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
