// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption Empty = new GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption();

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @Import(name="level")
    private @Nullable String level;

    /**
     * @return Level is SELinux level label that applies to the container.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @Import(name="role")
    private @Nullable String role;

    /**
     * @return Role is a SELinux role label that applies to the container.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Type is a SELinux type label that applies to the container.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @Import(name="user")
    private @Nullable String user;

    /**
     * @return User is a SELinux user label that applies to the container.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    private GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption() {}

    private GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption(GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption $) {
        this.level = $.level;
        this.role = $.role;
        this.type = $.type;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption();
        }

        public Builder(GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption defaults) {
            $ = new GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption(Objects.requireNonNull(defaults));
        }

        /**
         * @param level Level is SELinux level label that applies to the container.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable String level) {
            $.level = level;
            return this;
        }

        /**
         * @param role Role is a SELinux role label that applies to the container.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable String role) {
            $.role = role;
            return this;
        }

        /**
         * @param type Type is a SELinux type label that applies to the container.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param user User is a SELinux user label that applies to the container.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable String user) {
            $.user = user;
            return this;
        }

        public GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption build() {
            return $;
        }
    }

}
