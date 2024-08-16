// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectAlertRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectAlertRulePlainArgs Empty = new GetProjectAlertRulePlainArgs();

    /**
     * (Computed) The project alert rule labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Map<String,String> labels;

    /**
     * @return (Computed) The project alert rule labels (map)
     * 
     */
    public Optional<Map<String,String>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The project alert rule name (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The project alert rule name (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project id where create project alert rule (string)
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The project id where create project alert rule (string)
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetProjectAlertRulePlainArgs() {}

    private GetProjectAlertRulePlainArgs(GetProjectAlertRulePlainArgs $) {
        this.labels = $.labels;
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectAlertRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectAlertRulePlainArgs $;

        public Builder() {
            $ = new GetProjectAlertRulePlainArgs();
        }

        public Builder(GetProjectAlertRulePlainArgs defaults) {
            $ = new GetProjectAlertRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels (Computed) The project alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name The project alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param projectId The project id where create project alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectAlertRulePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertRulePlainArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertRulePlainArgs", "projectId");
            }
            return $;
        }
    }

}
