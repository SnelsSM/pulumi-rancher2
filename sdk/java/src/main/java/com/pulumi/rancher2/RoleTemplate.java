// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.RoleTemplateArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.RoleTemplateState;
import com.pulumi.rancher2.outputs.RoleTemplateExternalRule;
import com.pulumi.rancher2.outputs.RoleTemplateRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.
 * 
 * `cluster` and `project` scopes are supported for role templates.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.RoleTemplate;
 * import com.pulumi.rancher2.RoleTemplateArgs;
 * import com.pulumi.rancher2.inputs.RoleTemplateRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 cluster Role Template
 *         var foo = new RoleTemplate("foo", RoleTemplateArgs.builder()
 *             .name("foo")
 *             .context("cluster")
 *             .defaultRole(true)
 *             .description("Terraform role template acceptance test")
 *             .rules(RoleTemplateRuleArgs.builder()
 *                 .apiGroups("*")
 *                 .resources("secrets")
 *                 .verbs("create")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.RoleTemplate;
 * import com.pulumi.rancher2.RoleTemplateArgs;
 * import com.pulumi.rancher2.inputs.RoleTemplateRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 project Role Template
 *         var foo = new RoleTemplate("foo", RoleTemplateArgs.builder()
 *             .name("foo")
 *             .context("project")
 *             .defaultRole(true)
 *             .description("Terraform role template acceptance test")
 *             .rules(RoleTemplateRuleArgs.builder()
 *                 .apiGroups("*")
 *                 .resources("secrets")
 *                 .verbs("create")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Role Template can be imported using the Rancher Role Template ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/roleTemplate:RoleTemplate foo &amp;lt;role_template_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/roleTemplate:RoleTemplate")
public class RoleTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Administrative role template. Default `false` (bool)
     * 
     */
    @Export(name="administrative", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> administrative;

    /**
     * @return Administrative role template. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> administrative() {
        return Codegen.optional(this.administrative);
    }
    /**
     * Annotations for role template object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for role template object (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * (Computed) Builtin role template (string)
     * 
     */
    @Export(name="builtin", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> builtin;

    /**
     * @return (Computed) Builtin role template (string)
     * 
     */
    public Output<Boolean> builtin() {
        return this.builtin;
    }
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     * 
     */
    @Export(name="context", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> context;

    /**
     * @return Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     * 
     */
    public Output<Optional<String>> context() {
        return Codegen.optional(this.context);
    }
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     * 
     */
    @Export(name="defaultRole", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultRole;

    /**
     * @return Default role template for new created cluster or project. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> defaultRole() {
        return Codegen.optional(this.defaultRole);
    }
    /**
     * Role template description (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Role template description (string)
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * External role template. Default `false` (bool)
     * 
     */
    @Export(name="external", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> external;

    /**
     * @return External role template. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> external() {
        return Codegen.optional(this.external);
    }
    /**
     * External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     * 
     */
    @Export(name="externalRules", refs={List.class,RoleTemplateExternalRule.class}, tree="[0,1]")
    private Output<List<RoleTemplateExternalRule>> externalRules;

    /**
     * @return External rules used for authorization. This field is required when `external=true` and no underlying ClusterRole exists. (list)
     * 
     */
    public Output<List<RoleTemplateExternalRule>> externalRules() {
        return this.externalRules;
    }
    /**
     * Hidden role template. Default `false` (bool)
     * 
     */
    @Export(name="hidden", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hidden;

    /**
     * @return Hidden role template. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> hidden() {
        return Codegen.optional(this.hidden);
    }
    /**
     * Labels for role template object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for role template object (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Locked role template. Default `false` (bool)
     * 
     */
    @Export(name="locked", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> locked;

    /**
     * @return Locked role template. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> locked() {
        return Codegen.optional(this.locked);
    }
    /**
     * Role template name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Role template name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Inherit role template IDs (list)
     * 
     */
    @Export(name="roleTemplateIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roleTemplateIds;

    /**
     * @return Inherit role template IDs (list)
     * 
     */
    public Output<List<String>> roleTemplateIds() {
        return this.roleTemplateIds;
    }
    /**
     * Role template policy rules (list)
     * 
     */
    @Export(name="rules", refs={List.class,RoleTemplateRule.class}, tree="[0,1]")
    private Output<List<RoleTemplateRule>> rules;

    /**
     * @return Role template policy rules (list)
     * 
     */
    public Output<List<RoleTemplateRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleTemplate(java.lang.String name) {
        this(name, RoleTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleTemplate(java.lang.String name, @Nullable RoleTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleTemplate(java.lang.String name, @Nullable RoleTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/roleTemplate:RoleTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RoleTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable RoleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/roleTemplate:RoleTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static RoleTemplateArgs makeArgs(@Nullable RoleTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RoleTemplateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RoleTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable RoleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleTemplate(name, id, state, options);
    }
}
