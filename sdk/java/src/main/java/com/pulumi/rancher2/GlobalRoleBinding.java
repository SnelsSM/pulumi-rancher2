// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.GlobalRoleBindingArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.GlobalRoleBindingState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalRoleBinding;
 * import com.pulumi.rancher2.GlobalRoleBindingArgs;
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
 *         // Create a new rancher2 Global Role Binding using user_id
 *         var foo = new GlobalRoleBinding(&#34;foo&#34;, GlobalRoleBindingArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .globalRoleId(&#34;admin&#34;)
 *             .userId(&#34;user-XXXXX&#34;)
 *             .build());
 * 
 *         // Create a new rancher2 Global Role Binding using group_principal_id
 *         var foo2 = new GlobalRoleBinding(&#34;foo2&#34;, GlobalRoleBindingArgs.builder()        
 *             .name(&#34;foo2&#34;)
 *             .globalRoleId(&#34;admin&#34;)
 *             .groupPrincipalId(&#34;local://g-XXXXX&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Global Role Bindings can be imported using the Rancher Global Role Binding ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/globalRoleBinding:GlobalRoleBinding foo &amp;lt;GLOBAL_ROLE_BINDING_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/globalRoleBinding:GlobalRoleBinding")
public class GlobalRoleBinding extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for global role binding (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for global role binding (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The role id from create global role binding (string)
     * 
     */
    @Export(name="globalRoleId", refs={String.class}, tree="[0]")
    private Output<String> globalRoleId;

    /**
     * @return The role id from create global role binding (string)
     * 
     */
    public Output<String> globalRoleId() {
        return this.globalRoleId;
    }
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     * 
     */
    @Export(name="groupPrincipalId", refs={String.class}, tree="[0]")
    private Output<String> groupPrincipalId;

    /**
     * @return The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     * 
     */
    public Output<String> groupPrincipalId() {
        return this.groupPrincipalId;
    }
    /**
     * Labels for global role binding (map)
     * 
     * **Note:** user `user_id` OR group `group_principal_id` must be defined
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for global role binding (map)
     * 
     * **Note:** user `user_id` OR group `group_principal_id` must be defined
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the global role binding (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the global role binding (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The user ID to assign global role binding (string)
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The user ID to assign global role binding (string)
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalRoleBinding(String name) {
        this(name, GlobalRoleBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalRoleBinding(String name, GlobalRoleBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalRoleBinding(String name, GlobalRoleBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, args == null ? GlobalRoleBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalRoleBinding(String name, Output<String> id, @Nullable GlobalRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static GlobalRoleBinding get(String name, Output<String> id, @Nullable GlobalRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalRoleBinding(name, id, state, options);
    }
}
