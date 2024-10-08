// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterTemplateArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterTemplateState;
import com.pulumi.rancher2.outputs.ClusterTemplateMember;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevision;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.
 * 
 * Cluster Templates are available from Rancher v2.3.x and above.
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
 * import com.pulumi.rancher2.ClusterTemplate;
 * import com.pulumi.rancher2.ClusterTemplateArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateMemberArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs;
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
 *         // Create a new rancher2 Cluster Template
 *         var foo = new ClusterTemplate("foo", ClusterTemplateArgs.builder()
 *             .name("foo")
 *             .members(ClusterTemplateMemberArgs.builder()
 *                 .accessType("owner")
 *                 .userPrincipalId("local://user-XXXXX")
 *                 .build())
 *             .templateRevisions(ClusterTemplateTemplateRevisionArgs.builder()
 *                 .name("V1")
 *                 .clusterConfig(ClusterTemplateTemplateRevisionClusterConfigArgs.builder()
 *                     .rkeConfig(ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs.builder()
 *                         .network(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs.builder()
 *                             .plugin("canal")
 *                             .build())
 *                         .services(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs.builder()
 *                             .etcd(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs.builder()
 *                                 .creation("6h")
 *                                 .retention("24h")
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .default_(true)
 *                 .build())
 *             .description("Terraform cluster template foo")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x and above.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.ClusterTemplate;
 * import com.pulumi.rancher2.ClusterTemplateArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateMemberArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs;
 * import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyArgs;
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
 *         // Create a new rancher2 Cluster Template
 *         var foo = new ClusterTemplate("foo", ClusterTemplateArgs.builder()
 *             .name("foo")
 *             .members(ClusterTemplateMemberArgs.builder()
 *                 .accessType("owner")
 *                 .userPrincipalId("local://user-XXXXX")
 *                 .build())
 *             .templateRevisions(ClusterTemplateTemplateRevisionArgs.builder()
 *                 .name("V1")
 *                 .clusterConfig(ClusterTemplateTemplateRevisionClusterConfigArgs.builder()
 *                     .rkeConfig(ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs.builder()
 *                         .network(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs.builder()
 *                             .plugin("canal")
 *                             .build())
 *                         .services(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs.builder()
 *                             .etcd(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs.builder()
 *                                 .creation("6h")
 *                                 .retention("24h")
 *                                 .build())
 *                             .build())
 *                         .upgradeStrategy(ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyArgs.builder()
 *                             .drain(true)
 *                             .maxUnavailableWorker("20%")
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .default_(true)
 *                 .build())
 *             .description("Terraform cluster template foo")
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
 * Cluster Template can be imported using the rancher Cluster Template ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &amp;lt;CLUSTER_TEMPLATE_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/clusterTemplate:ClusterTemplate")
public class ClusterTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for the cluster template (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the cluster template (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * (Computed) Default cluster template revision ID (string)
     * 
     */
    @Export(name="defaultRevisionId", refs={String.class}, tree="[0]")
    private Output<String> defaultRevisionId;

    /**
     * @return (Computed) Default cluster template revision ID (string)
     * 
     */
    public Output<String> defaultRevisionId() {
        return this.defaultRevisionId;
    }
    /**
     * Cluster template description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Cluster template description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Labels for the cluster template (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for the cluster template (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Cluster template members (list)
     * 
     */
    @Export(name="members", refs={List.class,ClusterTemplateMember.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterTemplateMember>> members;

    /**
     * @return Cluster template members (list)
     * 
     */
    public Output<Optional<List<ClusterTemplateMember>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * The cluster template name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The cluster template name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Cluster template revisions (list)
     * 
     */
    @Export(name="templateRevisions", refs={List.class,ClusterTemplateTemplateRevision.class}, tree="[0,1]")
    private Output<List<ClusterTemplateTemplateRevision>> templateRevisions;

    /**
     * @return Cluster template revisions (list)
     * 
     */
    public Output<List<ClusterTemplateTemplateRevision>> templateRevisions() {
        return this.templateRevisions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterTemplate(java.lang.String name) {
        this(name, ClusterTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterTemplate(java.lang.String name, @Nullable ClusterTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterTemplate(java.lang.String name, @Nullable ClusterTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterTemplate:ClusterTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ClusterTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterTemplate:ClusterTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static ClusterTemplateArgs makeArgs(@Nullable ClusterTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClusterTemplateArgs.Empty : args;
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
    public static ClusterTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterTemplate(name, id, state, options);
    }
}
