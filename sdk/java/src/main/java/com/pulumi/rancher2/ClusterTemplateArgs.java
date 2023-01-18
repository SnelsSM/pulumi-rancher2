// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateMemberArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateArgs Empty = new ClusterTemplateArgs();

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
     * Cluster template description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Cluster template description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * Cluster template members (list)
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<ClusterTemplateMemberArgs>> members;

    /**
     * @return Cluster template members (list)
     * 
     */
    public Optional<Output<List<ClusterTemplateMemberArgs>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The cluster template name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The cluster template name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Cluster template revisions (list)
     * 
     */
    @Import(name="templateRevisions")
    private @Nullable Output<List<ClusterTemplateTemplateRevisionArgs>> templateRevisions;

    /**
     * @return Cluster template revisions (list)
     * 
     */
    public Optional<Output<List<ClusterTemplateTemplateRevisionArgs>>> templateRevisions() {
        return Optional.ofNullable(this.templateRevisions);
    }

    private ClusterTemplateArgs() {}

    private ClusterTemplateArgs(ClusterTemplateArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.labels = $.labels;
        this.members = $.members;
        this.name = $.name;
        this.templateRevisions = $.templateRevisions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateArgs $;

        public Builder() {
            $ = new ClusterTemplateArgs();
        }

        public Builder(ClusterTemplateArgs defaults) {
            $ = new ClusterTemplateArgs(Objects.requireNonNull(defaults));
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
         * @param description Cluster template description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Cluster template description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param members Cluster template members (list)
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<ClusterTemplateMemberArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Cluster template members (list)
         * 
         * @return builder
         * 
         */
        public Builder members(List<ClusterTemplateMemberArgs> members) {
            return members(Output.of(members));
        }

        /**
         * @param members Cluster template members (list)
         * 
         * @return builder
         * 
         */
        public Builder members(ClusterTemplateMemberArgs... members) {
            return members(List.of(members));
        }

        /**
         * @param name The cluster template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
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
         * @param templateRevisions Cluster template revisions (list)
         * 
         * @return builder
         * 
         */
        public Builder templateRevisions(@Nullable Output<List<ClusterTemplateTemplateRevisionArgs>> templateRevisions) {
            $.templateRevisions = templateRevisions;
            return this;
        }

        /**
         * @param templateRevisions Cluster template revisions (list)
         * 
         * @return builder
         * 
         */
        public Builder templateRevisions(List<ClusterTemplateTemplateRevisionArgs> templateRevisions) {
            return templateRevisions(Output.of(templateRevisions));
        }

        /**
         * @param templateRevisions Cluster template revisions (list)
         * 
         * @return builder
         * 
         */
        public Builder templateRevisions(ClusterTemplateTemplateRevisionArgs... templateRevisions) {
            return templateRevisions(List.of(templateRevisions));
        }

        public ClusterTemplateArgs build() {
            return $;
        }
    }

}
