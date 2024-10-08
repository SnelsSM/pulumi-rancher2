// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.CatalogArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.CatalogState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.
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
 * import com.pulumi.rancher2.Catalog;
 * import com.pulumi.rancher2.CatalogArgs;
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
 *         // Create a new Rancher2 Global Catalog
 *         var foo_global = new Catalog("foo-global", CatalogArgs.builder()
 *             .name("foo-global")
 *             .url("https://<CATALOG_URL>")
 *             .build());
 * 
 *         // Create a new Rancher2 Cluster Catalog
 *         var foo_cluster = new Catalog("foo-cluster", CatalogArgs.builder()
 *             .name("foo-cluster")
 *             .url("https://<CATALOG_URL>")
 *             .scope("cluster")
 *             .build());
 * 
 *         // Create a new Rancher2 Project Catalog
 *         var foo_project = new Catalog("foo-project", CatalogArgs.builder()
 *             .name("foo-project")
 *             .url("https://<CATALOG_URL>")
 *             .scope("project")
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
 * Catalogs can be imported using the Rancher Catalog ID and its scope.
 * 
 * ```sh
 * $ pulumi import rancher2:index/catalog:Catalog foo &amp;lt;SCOPE&amp;gt;.&amp;lt;CATALOG_ID_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/catalog:Catalog")
public class Catalog extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for the catalog (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the catalog (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * The branch of the catalog repo to use. Default `master` (string)
     * 
     */
    @Export(name="branch", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> branch;

    /**
     * @return The branch of the catalog repo to use. Default `master` (string)
     * 
     */
    public Output<Optional<String>> branch() {
        return Codegen.optional(this.branch);
    }
    /**
     * The cluster id of the catalog. Mandatory if `scope = cluster` (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return The cluster id of the catalog. Mandatory if `scope = cluster` (string)
     * 
     */
    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    /**
     * A catalog description (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A catalog description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The kind of the catalog. Just helm by the moment (string)
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kind;

    /**
     * @return The kind of the catalog. Just helm by the moment (string)
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Labels for the catalog (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for the catalog (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The name of the catalog (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the catalog (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password to access the catalog if needed (string)
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password to access the catalog if needed (string)
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The project id of the catalog. Mandatory if `scope = project` (string)
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return The project id of the catalog. Mandatory if `scope = project` (string)
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
     * 
     */
    @Export(name="refresh", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> refresh;

    /**
     * @return Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> refresh() {
        return Codegen.optional(this.refresh);
    }
    /**
     * The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * The url of the catalog repo (string)
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The url of the catalog repo (string)
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The username to access the catalog if needed (string)
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return The username to access the catalog if needed (string)
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Catalog(java.lang.String name) {
        this(name, CatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Catalog(java.lang.String name, CatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Catalog(java.lang.String name, CatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/catalog:Catalog", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Catalog(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/catalog:Catalog", name, state, makeResourceOptions(options, id), false);
    }

    private static CatalogArgs makeArgs(CatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CatalogArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password",
                "username"
            ))
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
    public static Catalog get(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Catalog(name, id, state, options);
    }
}
