// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.GlobalRoleRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalRoleState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalRoleState Empty = new GlobalRoleState();

    /**
     * Annotations for global role object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for global role object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * (Computed) Builtin global role (bool)
     * 
     */
    @Import(name="builtin")
    private @Nullable Output<Boolean> builtin;

    /**
     * @return (Computed) Builtin global role (bool)
     * 
     */
    public Optional<Output<Boolean>> builtin() {
        return Optional.ofNullable(this.builtin);
    }

    /**
     * Global role description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Global role description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     * 
     */
    @Import(name="inheritedClusterRoles")
    private @Nullable Output<List<String>> inheritedClusterRoles;

    /**
     * @return Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     * 
     */
    public Optional<Output<List<String>>> inheritedClusterRoles() {
        return Optional.ofNullable(this.inheritedClusterRoles);
    }

    /**
     * Labels for global role object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for global role object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Global role name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Global role name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    @Import(name="newUserDefault")
    private @Nullable Output<Boolean> newUserDefault;

    /**
     * @return Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> newUserDefault() {
        return Optional.ofNullable(this.newUserDefault);
    }

    /**
     * Global role policy rules (list)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<GlobalRoleRuleArgs>> rules;

    /**
     * @return Global role policy rules (list)
     * 
     */
    public Optional<Output<List<GlobalRoleRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private GlobalRoleState() {}

    private GlobalRoleState(GlobalRoleState $) {
        this.annotations = $.annotations;
        this.builtin = $.builtin;
        this.description = $.description;
        this.inheritedClusterRoles = $.inheritedClusterRoles;
        this.labels = $.labels;
        this.name = $.name;
        this.newUserDefault = $.newUserDefault;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalRoleState $;

        public Builder() {
            $ = new GlobalRoleState();
        }

        public Builder(GlobalRoleState defaults) {
            $ = new GlobalRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param builtin (Computed) Builtin global role (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(@Nullable Output<Boolean> builtin) {
            $.builtin = builtin;
            return this;
        }

        /**
         * @param builtin (Computed) Builtin global role (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(Boolean builtin) {
            return builtin(Output.of(builtin));
        }

        /**
         * @param description Global role description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Global role description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param inheritedClusterRoles Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder inheritedClusterRoles(@Nullable Output<List<String>> inheritedClusterRoles) {
            $.inheritedClusterRoles = inheritedClusterRoles;
            return this;
        }

        /**
         * @param inheritedClusterRoles Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder inheritedClusterRoles(List<String> inheritedClusterRoles) {
            return inheritedClusterRoles(Output.of(inheritedClusterRoles));
        }

        /**
         * @param inheritedClusterRoles Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder inheritedClusterRoles(String... inheritedClusterRoles) {
            return inheritedClusterRoles(List.of(inheritedClusterRoles));
        }

        /**
         * @param labels Labels for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Global role name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Global role name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newUserDefault Whether or not this role should be added to new users. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder newUserDefault(@Nullable Output<Boolean> newUserDefault) {
            $.newUserDefault = newUserDefault;
            return this;
        }

        /**
         * @param newUserDefault Whether or not this role should be added to new users. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder newUserDefault(Boolean newUserDefault) {
            return newUserDefault(Output.of(newUserDefault));
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<GlobalRoleRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<GlobalRoleRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(GlobalRoleRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GlobalRoleState build() {
            return $;
        }
    }

}
