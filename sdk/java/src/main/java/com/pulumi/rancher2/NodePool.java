// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.NodePoolArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.NodePoolState;
import com.pulumi.rancher2.outputs.NodePoolNodeTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.
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
 * import com.pulumi.rancher2.Cluster;
 * import com.pulumi.rancher2.ClusterArgs;
 * import com.pulumi.rancher2.inputs.ClusterRkeConfigArgs;
 * import com.pulumi.rancher2.inputs.ClusterRkeConfigNetworkArgs;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialAmazonec2CredentialConfigArgs;
 * import com.pulumi.rancher2.NodeTemplate;
 * import com.pulumi.rancher2.NodeTemplateArgs;
 * import com.pulumi.rancher2.inputs.NodeTemplateAmazonec2ConfigArgs;
 * import com.pulumi.rancher2.NodePool;
 * import com.pulumi.rancher2.NodePoolArgs;
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
 *         // Create a new rancher2 RKE Cluster 
 *         var foo_custom = new Cluster(&#34;foo-custom&#34;, ClusterArgs.builder()        
 *             .name(&#34;foo-custom&#34;)
 *             .description(&#34;Foo rancher2 custom cluster&#34;)
 *             .kind(&#34;rke&#34;)
 *             .rkeConfig(ClusterRkeConfigArgs.builder()
 *                 .network(ClusterRkeConfigNetworkArgs.builder()
 *                     .plugin(&#34;canal&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Cloud Credential
 *         var foo = new CloudCredential(&#34;foo&#34;, CloudCredentialArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .description(&#34;Terraform cloudCredential acceptance test&#34;)
 *             .amazonec2CredentialConfig(CloudCredentialAmazonec2CredentialConfigArgs.builder()
 *                 .accessKey(&#34;XXXXXXXXXXXXXXXXXXXX&#34;)
 *                 .secretKey(&#34;XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Node Template
 *         var fooNodeTemplate = new NodeTemplate(&#34;fooNodeTemplate&#34;, NodeTemplateArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .description(&#34;foo test&#34;)
 *             .cloudCredentialId(foo.id())
 *             .amazonec2Config(NodeTemplateAmazonec2ConfigArgs.builder()
 *                 .ami(&#34;&lt;AMI_ID&gt;&#34;)
 *                 .region(&#34;&lt;REGION&gt;&#34;)
 *                 .securityGroups(&#34;&lt;AWS_SECURITY_GROUP&gt;&#34;)
 *                 .subnetId(&#34;&lt;SUBNET_ID&gt;&#34;)
 *                 .vpcId(&#34;&lt;VPC_ID&gt;&#34;)
 *                 .zone(&#34;&lt;ZONE&gt;&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Node Pool
 *         var fooNodePool = new NodePool(&#34;fooNodePool&#34;, NodePoolArgs.builder()        
 *             .clusterId(foo_custom.id())
 *             .name(&#34;foo&#34;)
 *             .hostnamePrefix(&#34;foo-cluster-0&#34;)
 *             .nodeTemplateId(fooNodeTemplate.id())
 *             .quantity(1)
 *             .controlPlane(true)
 *             .etcd(true)
 *             .worker(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Node Pool can be imported using the Rancher Node Pool ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/nodePool:NodePool foo &amp;lt;node_pool_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/nodePool:NodePool")
public class NodePool extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Node Pool object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The RKE cluster id to use Node Pool (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The RKE cluster id to use Node Pool (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * RKE control plane role for created nodes (bool)
     * 
     */
    @Export(name="controlPlane", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> controlPlane;

    /**
     * @return RKE control plane role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> controlPlane() {
        return Codegen.optional(this.controlPlane);
    }
    /**
     * Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
     * 
     */
    @Export(name="deleteNotReadyAfterSecs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deleteNotReadyAfterSecs;

    /**
     * @return Delete not ready node after secs. For Rancher v2.3.3 and above. Default `0` (int)
     * 
     */
    public Output<Optional<Integer>> deleteNotReadyAfterSecs() {
        return Codegen.optional(this.deleteNotReadyAfterSecs);
    }
    /**
     * Drain nodes before delete. Default: `false` (bool)
     * 
     */
    @Export(name="drainBeforeDelete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> drainBeforeDelete;

    /**
     * @return Drain nodes before delete. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> drainBeforeDelete() {
        return Codegen.optional(this.drainBeforeDelete);
    }
    /**
     * RKE etcd role for created nodes (bool)
     * 
     */
    @Export(name="etcd", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> etcd;

    /**
     * @return RKE etcd role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> etcd() {
        return Codegen.optional(this.etcd);
    }
    /**
     * The prefix for created nodes of the Node Pool (string)
     * 
     */
    @Export(name="hostnamePrefix", refs={String.class}, tree="[0]")
    private Output<String> hostnamePrefix;

    /**
     * @return The prefix for created nodes of the Node Pool (string)
     * 
     */
    public Output<String> hostnamePrefix() {
        return this.hostnamePrefix;
    }
    /**
     * Labels for Node Pool object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the Node Pool (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Node Pool (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     * 
     */
    @Export(name="nodeTaints", refs={List.class,NodePoolNodeTaint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NodePoolNodeTaint>> nodeTaints;

    /**
     * @return Node taints. For Rancher v2.3.3 and above (List)
     * 
     */
    public Output<Optional<List<NodePoolNodeTaint>>> nodeTaints() {
        return Codegen.optional(this.nodeTaints);
    }
    /**
     * The Node Template ID to use for node creation (string)
     * 
     */
    @Export(name="nodeTemplateId", refs={String.class}, tree="[0]")
    private Output<String> nodeTemplateId;

    /**
     * @return The Node Template ID to use for node creation (string)
     * 
     */
    public Output<String> nodeTemplateId() {
        return this.nodeTemplateId;
    }
    /**
     * The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
     * 
     */
    @Export(name="quantity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> quantity;

    /**
     * @return The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
     * 
     */
    public Output<Optional<Integer>> quantity() {
        return Codegen.optional(this.quantity);
    }
    /**
     * RKE role role for created nodes (bool)
     * 
     */
    @Export(name="worker", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> worker;

    /**
     * @return RKE role role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> worker() {
        return Codegen.optional(this.worker);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodePool(String name) {
        this(name, NodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodePool(String name, NodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodePool(String name, NodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodePool:NodePool", name, args == null ? NodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodePool(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodePool:NodePool", name, state, makeResourceOptions(options, id));
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
    public static NodePool get(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, state, options);
    }
}
