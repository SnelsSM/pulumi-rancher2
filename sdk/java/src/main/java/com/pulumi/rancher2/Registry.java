// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.RegistryArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.RegistryState;
import com.pulumi.rancher2.outputs.RegistryRegistry;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Registry resource. This resource creates Kubernetes secrets with the type `kubernetes.io/dockerconfigjson` for authenticating against Docker registries for Rancher v2 environments and retrieving their information.
 * 
 * Depending on the availability, there are 2 types of Rancher v2 Docker registry resources:
 * - Project registry resource: Available to all namespaces in the `project_id`.
 * - Namespaced registry resource: Available to `namespace_id` in the `project_id`.
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
 * import com.pulumi.rancher2.Registry;
 * import com.pulumi.rancher2.RegistryArgs;
 * import com.pulumi.rancher2.inputs.RegistryRegistryArgs;
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
 *         // Create a new rancher2 Project Registry
 *         var foo = new Registry(&#34;foo&#34;, RegistryArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .description(&#34;Terraform registry foo&#34;)
 *             .projectId(&#34;&lt;project_id&gt;&#34;)
 *             .registries(RegistryRegistryArgs.builder()
 *                 .address(&#34;test.io&#34;)
 *                 .username(&#34;user&#34;)
 *                 .password(&#34;pass&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Registry;
 * import com.pulumi.rancher2.RegistryArgs;
 * import com.pulumi.rancher2.inputs.RegistryRegistryArgs;
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
 *         // Create a new rancher2 Namespaced Registry
 *         var foo = new Registry(&#34;foo&#34;, RegistryArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .description(&#34;Terraform registry foo&#34;)
 *             .projectId(&#34;&lt;project_id&gt;&#34;)
 *             .namespaceId(&#34;&lt;namespace_id&gt;&#34;)
 *             .registries(RegistryRegistryArgs.builder()
 *                 .address(&#34;test.io&#34;)
 *                 .username(&#34;user2&#34;)
 *                 .password(&#34;pass&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Registries can be imported using the registry ID in the format `&lt;namespace_id&gt;.&lt;project_id&gt;.&lt;registry_id&gt;`
 * 
 * ```sh
 * $ pulumi import rancher2:index/registry:Registry foo &amp;lt;namespace_id&amp;gt;.&amp;lt;project_id&amp;gt;.&amp;lt;registry_id&amp;gt;
 * ```
 * `&lt;namespace_id&gt;` is optional, just needed for namespaced registry.
 * 
 */
@ResourceType(type="rancher2:index/registry:Registry")
public class Registry extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Registry object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Registry object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * A registry description (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A registry description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Labels for Registry object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Registry object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the registry (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the registry (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace id where to assign the namespaced registry (string)
     * 
     */
    @Export(name="namespaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespaceId;

    /**
     * @return The namespace id where to assign the namespaced registry (string)
     * 
     */
    public Output<Optional<String>> namespaceId() {
        return Codegen.optional(this.namespaceId);
    }
    /**
     * The project id where to assign the registry (string)
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The project id where to assign the registry (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Registries data for registry (list)
     * 
     */
    @Export(name="registries", refs={List.class,RegistryRegistry.class}, tree="[0,1]")
    private Output<List<RegistryRegistry>> registries;

    /**
     * @return Registries data for registry (list)
     * 
     */
    public Output<List<RegistryRegistry>> registries() {
        return this.registries;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registry(String name) {
        this(name, RegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registry(String name, RegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registry(String name, RegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/registry:Registry", name, args == null ? RegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Registry(String name, Output<String> id, @Nullable RegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/registry:Registry", name, state, makeResourceOptions(options, id));
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
    public static Registry get(String name, Output<String> id, @Nullable RegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Registry(name, id, state, options);
    }
}
