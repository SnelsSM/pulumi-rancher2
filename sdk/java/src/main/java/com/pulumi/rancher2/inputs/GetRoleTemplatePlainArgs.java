// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetRoleTemplateExternalRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleTemplatePlainArgs Empty = new GetRoleTemplatePlainArgs();

    /**
     * Role template context. `cluster` and `project` values are supported (string)
     * 
     */
    @Import(name="context")
    private @Nullable String context;

    /**
     * @return Role template context. `cluster` and `project` values are supported (string)
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * (Computed) External rules used for authorization. (list)
     * 
     */
    @Import(name="externalRules")
    private @Nullable List<GetRoleTemplateExternalRule> externalRules;

    /**
     * @return (Computed) External rules used for authorization. (list)
     * 
     */
    public Optional<List<GetRoleTemplateExternalRule>> externalRules() {
        return Optional.ofNullable(this.externalRules);
    }

    /**
     * The name of the Role Template (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Role Template (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRoleTemplatePlainArgs() {}

    private GetRoleTemplatePlainArgs(GetRoleTemplatePlainArgs $) {
        this.context = $.context;
        this.externalRules = $.externalRules;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleTemplatePlainArgs $;

        public Builder() {
            $ = new GetRoleTemplatePlainArgs();
        }

        public Builder(GetRoleTemplatePlainArgs defaults) {
            $ = new GetRoleTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Role template context. `cluster` and `project` values are supported (string)
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable String context) {
            $.context = context;
            return this;
        }

        /**
         * @param externalRules (Computed) External rules used for authorization. (list)
         * 
         * @return builder
         * 
         */
        public Builder externalRules(@Nullable List<GetRoleTemplateExternalRule> externalRules) {
            $.externalRules = externalRules;
            return this;
        }

        /**
         * @param externalRules (Computed) External rules used for authorization. (list)
         * 
         * @return builder
         * 
         */
        public Builder externalRules(GetRoleTemplateExternalRule... externalRules) {
            return externalRules(List.of(externalRules));
        }

        /**
         * @param name The name of the Role Template (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRoleTemplatePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetRoleTemplatePlainArgs", "name");
            }
            return $;
        }
    }

}
