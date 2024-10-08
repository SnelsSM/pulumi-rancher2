// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalRoleBindingState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalRoleBindingState Empty = new GlobalRoleBindingState();

    /**
     * Annotations for global role binding (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for global role binding (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The role id from create global role binding (string)
     * 
     */
    @Import(name="globalRoleId")
    private @Nullable Output<String> globalRoleId;

    /**
     * @return The role id from create global role binding (string)
     * 
     */
    public Optional<Output<String>> globalRoleId() {
        return Optional.ofNullable(this.globalRoleId);
    }

    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     * 
     */
    @Import(name="groupPrincipalId")
    private @Nullable Output<String> groupPrincipalId;

    /**
     * @return The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     * 
     */
    public Optional<Output<String>> groupPrincipalId() {
        return Optional.ofNullable(this.groupPrincipalId);
    }

    /**
     * Labels for global role binding (map)
     * 
     * **Note:** user `user_id` OR group `group_principal_id` must be defined
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for global role binding (map)
     * 
     * **Note:** user `user_id` OR group `group_principal_id` must be defined
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the global role binding (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the global role binding (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The user ID to assign global role binding (string)
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID to assign global role binding (string)
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GlobalRoleBindingState() {}

    private GlobalRoleBindingState(GlobalRoleBindingState $) {
        this.annotations = $.annotations;
        this.globalRoleId = $.globalRoleId;
        this.groupPrincipalId = $.groupPrincipalId;
        this.labels = $.labels;
        this.name = $.name;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalRoleBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalRoleBindingState $;

        public Builder() {
            $ = new GlobalRoleBindingState();
        }

        public Builder(GlobalRoleBindingState defaults) {
            $ = new GlobalRoleBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for global role binding (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for global role binding (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param globalRoleId The role id from create global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder globalRoleId(@Nullable Output<String> globalRoleId) {
            $.globalRoleId = globalRoleId;
            return this;
        }

        /**
         * @param globalRoleId The role id from create global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder globalRoleId(String globalRoleId) {
            return globalRoleId(Output.of(globalRoleId));
        }

        /**
         * @param groupPrincipalId The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(@Nullable Output<String> groupPrincipalId) {
            $.groupPrincipalId = groupPrincipalId;
            return this;
        }

        /**
         * @param groupPrincipalId The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(String groupPrincipalId) {
            return groupPrincipalId(Output.of(groupPrincipalId));
        }

        /**
         * @param labels Labels for global role binding (map)
         * 
         * **Note:** user `user_id` OR group `group_principal_id` must be defined
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for global role binding (map)
         * 
         * **Note:** user `user_id` OR group `group_principal_id` must be defined
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param userId The user ID to assign global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID to assign global role binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GlobalRoleBindingState build() {
            return $;
        }
    }

}
