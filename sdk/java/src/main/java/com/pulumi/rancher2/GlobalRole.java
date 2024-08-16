// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.GlobalRoleArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.GlobalRoleState;
import com.pulumi.rancher2.outputs.GlobalRoleRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Global Role resource. This can be used to create Global Role for Rancher v2 and retrieve their information.
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
 * import com.pulumi.rancher2.GlobalRole;
 * import com.pulumi.rancher2.GlobalRoleArgs;
 * import com.pulumi.rancher2.inputs.GlobalRoleRuleArgs;
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
 *         // Create a new rancher2 Global Role
 *         var foo = new GlobalRole("foo", GlobalRoleArgs.builder()
 *             .name("foo")
 *             .newUserDefault(true)
 *             .description("Terraform global role acceptance test")
 *             .rules(GlobalRoleRuleArgs.builder()
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
 * Global Role can be imported using the Rancher Global Role ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/globalRole:GlobalRole foo &amp;lt;global_role_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/globalRole:GlobalRole")
public class GlobalRole extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for global role object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for global role object (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * (Computed) Builtin global role (bool)
     * 
     */
    @Export(name="builtin", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> builtin;

    /**
     * @return (Computed) Builtin global role (bool)
     * 
     */
    public Output<Boolean> builtin() {
        return this.builtin;
    }
    /**
     * Global role description (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Global role description (string)
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     * 
     */
    @Export(name="inheritedClusterRoles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> inheritedClusterRoles;

    /**
     * @return Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
     * 
     */
    public Output<Optional<List<String>>> inheritedClusterRoles() {
        return Codegen.optional(this.inheritedClusterRoles);
    }
    /**
     * Labels for global role object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for global role object (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Global role name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Global role name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    @Export(name="newUserDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> newUserDefault;

    /**
     * @return Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> newUserDefault() {
        return Codegen.optional(this.newUserDefault);
    }
    /**
     * Global role policy rules (list)
     * 
     */
    @Export(name="rules", refs={List.class,GlobalRoleRule.class}, tree="[0,1]")
    private Output<List<GlobalRoleRule>> rules;

    /**
     * @return Global role policy rules (list)
     * 
     */
    public Output<List<GlobalRoleRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalRole(java.lang.String name) {
        this(name, GlobalRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalRole(java.lang.String name, @Nullable GlobalRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalRole(java.lang.String name, @Nullable GlobalRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalRole:GlobalRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GlobalRole(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalRole:GlobalRole", name, state, makeResourceOptions(options, id), false);
    }

    private static GlobalRoleArgs makeArgs(@Nullable GlobalRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GlobalRoleArgs.Empty : args;
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
    public static GlobalRole get(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalRole(name, id, state, options);
    }
}
