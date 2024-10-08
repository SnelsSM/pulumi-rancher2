// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.MultiClusterAppArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.MultiClusterAppState;
import com.pulumi.rancher2.outputs.MultiClusterAppAnswer;
import com.pulumi.rancher2.outputs.MultiClusterAppMember;
import com.pulumi.rancher2.outputs.MultiClusterAppTarget;
import com.pulumi.rancher2.outputs.MultiClusterAppUpgradeStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 multi_cluster_app resource. This can be used to deploy multi_cluster_app on Rancher v2.
 * 
 * This resource can also modify Rancher v2 multi cluster apps in 3 ways:
 * - `Add/Remove targets`: If `targets` arguments is modified, the multi cluster app targets will be updated.
 * - `Rollback`: If `revision_id` argument is provided or modified the app will be rolled back accordingly. A new `revision_id` will be generated in Rancher. It will also generate a non-empty pulumi preview that will require manual .tf file intervention. Use carefully.
 * - `Update`: If any other argument is modified the app will be upgraded.
 * 
 * Note: In case of multiple resource modification in a row, `rollback` has preference.
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
 * import com.pulumi.rancher2.MultiClusterApp;
 * import com.pulumi.rancher2.MultiClusterAppArgs;
 * import com.pulumi.rancher2.inputs.MultiClusterAppTargetArgs;
 * import com.pulumi.rancher2.inputs.MultiClusterAppAnswerArgs;
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
 *         // Create a new rancher2 Multi Cluster App
 *         var foo = new MultiClusterApp("foo", MultiClusterAppArgs.builder()
 *             .catalogName("<catalog_name>")
 *             .name("foo")
 *             .targets(MultiClusterAppTargetArgs.builder()
 *                 .projectId("<project_id>")
 *                 .build())
 *             .templateName("<template_name>")
 *             .templateVersion("<template_version>")
 *             .answers(MultiClusterAppAnswerArgs.builder()
 *                 .values(Map.of("ingress_host", "test.xip.io"))
 *                 .build())
 *             .roles("project-member")
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
 * import com.pulumi.rancher2.MultiClusterApp;
 * import com.pulumi.rancher2.MultiClusterAppArgs;
 * import com.pulumi.rancher2.inputs.MultiClusterAppTargetArgs;
 * import com.pulumi.rancher2.inputs.MultiClusterAppAnswerArgs;
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
 *         // Create a new rancher2 Multi Cluster App overriding answers
 *         var foo = new MultiClusterApp("foo", MultiClusterAppArgs.builder()
 *             .catalogName("<catalog_name>")
 *             .name("foo")
 *             .targets(            
 *                 MultiClusterAppTargetArgs.builder()
 *                     .projectId("<project_id1>")
 *                     .build(),
 *                 MultiClusterAppTargetArgs.builder()
 *                     .projectId("<project_id2>")
 *                     .build())
 *             .templateName("<template_name>")
 *             .templateVersion("<template_version>")
 *             .answers(            
 *                 MultiClusterAppAnswerArgs.builder()
 *                     .values(Map.of("ingress_host", "test.xip.io"))
 *                     .build(),
 *                 MultiClusterAppAnswerArgs.builder()
 *                     .projectId("<project_id2>")
 *                     .values(Map.of("ingress_host", "test2.xip.io"))
 *                     .build())
 *             .roles("project-member")
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
 * Multi cluster app can be imported using the multi cluster app ID in the format `&lt;multi_cluster_app_name&gt;`
 * 
 * ```sh
 * $ pulumi import rancher2:index/multiClusterApp:MultiClusterApp foo &amp;lt;MULTI_CLUSTER_APP_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/multiClusterApp:MultiClusterApp")
public class MultiClusterApp extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for multi cluster app object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for multi cluster app object (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * The multi cluster app answers (list)
     * 
     */
    @Export(name="answers", refs={List.class,MultiClusterAppAnswer.class}, tree="[0,1]")
    private Output<List<MultiClusterAppAnswer>> answers;

    /**
     * @return The multi cluster app answers (list)
     * 
     */
    public Output<List<MultiClusterAppAnswer>> answers() {
        return this.answers;
    }
    /**
     * The multi cluster app catalog name (string)
     * 
     */
    @Export(name="catalogName", refs={String.class}, tree="[0]")
    private Output<String> catalogName;

    /**
     * @return The multi cluster app catalog name (string)
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    /**
     * Labels for multi cluster app object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for multi cluster app object (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The multi cluster app answers (list)
     * 
     */
    @Export(name="members", refs={List.class,MultiClusterAppMember.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MultiClusterAppMember>> members;

    /**
     * @return The multi cluster app answers (list)
     * 
     */
    public Output<Optional<List<MultiClusterAppMember>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * The multi cluster app name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The multi cluster app name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The multi cluster app revision history limit. Default `10` (int)
     * 
     */
    @Export(name="revisionHistoryLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> revisionHistoryLimit;

    /**
     * @return The multi cluster app revision history limit. Default `10` (int)
     * 
     */
    public Output<Optional<Integer>> revisionHistoryLimit() {
        return Codegen.optional(this.revisionHistoryLimit);
    }
    /**
     * Current revision id for the multi cluster app (string)
     * 
     */
    @Export(name="revisionId", refs={String.class}, tree="[0]")
    private Output<String> revisionId;

    /**
     * @return Current revision id for the multi cluster app (string)
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * The multi cluster app roles (list)
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return The multi cluster app roles (list)
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The multi cluster app target projects (list)
     * 
     */
    @Export(name="targets", refs={List.class,MultiClusterAppTarget.class}, tree="[0,1]")
    private Output<List<MultiClusterAppTarget>> targets;

    /**
     * @return The multi cluster app target projects (list)
     * 
     */
    public Output<List<MultiClusterAppTarget>> targets() {
        return this.targets;
    }
    /**
     * The multi cluster app template name (string)
     * 
     */
    @Export(name="templateName", refs={String.class}, tree="[0]")
    private Output<String> templateName;

    /**
     * @return The multi cluster app template name (string)
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }
    /**
     * The multi cluster app template version. Default: `latest` (string)
     * 
     */
    @Export(name="templateVersion", refs={String.class}, tree="[0]")
    private Output<String> templateVersion;

    /**
     * @return The multi cluster app template version. Default: `latest` (string)
     * 
     */
    public Output<String> templateVersion() {
        return this.templateVersion;
    }
    /**
     * (Computed) The multi cluster app template version ID (string)
     * 
     */
    @Export(name="templateVersionId", refs={String.class}, tree="[0]")
    private Output<String> templateVersionId;

    /**
     * @return (Computed) The multi cluster app template version ID (string)
     * 
     */
    public Output<String> templateVersionId() {
        return this.templateVersionId;
    }
    /**
     * The multi cluster app upgrade strategy (list MaxItems:1)
     * 
     */
    @Export(name="upgradeStrategy", refs={MultiClusterAppUpgradeStrategy.class}, tree="[0]")
    private Output<MultiClusterAppUpgradeStrategy> upgradeStrategy;

    /**
     * @return The multi cluster app upgrade strategy (list MaxItems:1)
     * 
     */
    public Output<MultiClusterAppUpgradeStrategy> upgradeStrategy() {
        return this.upgradeStrategy;
    }
    /**
     * Wait until the multi cluster app is active. Default `true` (bool)
     * 
     */
    @Export(name="wait", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> wait;

    /**
     * @return Wait until the multi cluster app is active. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> wait_() {
        return Codegen.optional(this.wait);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiClusterApp(java.lang.String name) {
        this(name, MultiClusterAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiClusterApp(java.lang.String name, MultiClusterAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiClusterApp(java.lang.String name, MultiClusterAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/multiClusterApp:MultiClusterApp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MultiClusterApp(java.lang.String name, Output<java.lang.String> id, @Nullable MultiClusterAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/multiClusterApp:MultiClusterApp", name, state, makeResourceOptions(options, id), false);
    }

    private static MultiClusterAppArgs makeArgs(MultiClusterAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MultiClusterAppArgs.Empty : args;
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
    public static MultiClusterApp get(java.lang.String name, Output<java.lang.String> id, @Nullable MultiClusterAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MultiClusterApp(name, id, state, options);
    }
}
