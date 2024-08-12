// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.MachineConfigV2Args;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.MachineConfigV2State;
import com.pulumi.rancher2.outputs.MachineConfigV2Amazonec2Config;
import com.pulumi.rancher2.outputs.MachineConfigV2AzureConfig;
import com.pulumi.rancher2.outputs.MachineConfigV2DigitaloceanConfig;
import com.pulumi.rancher2.outputs.MachineConfigV2HarvesterConfig;
import com.pulumi.rancher2.outputs.MachineConfigV2LinodeConfig;
import com.pulumi.rancher2.outputs.MachineConfigV2OpenstackConfig;
import com.pulumi.rancher2.outputs.MachineConfigV2VsphereConfig;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is available from Rancher v2.6.0 and above.
 * 
 * The supported cloud providers includes `amazonec2`, `azure`, `digitalocean`, `harvester`, `linode`, `openstack`, and `vsphere`.
 * 
 * ### Using the Harvester Node Driver
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Rancher2Functions;
 * import com.pulumi.rancher2.inputs.GetClusterV2Args;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialHarvesterCredentialConfigArgs;
 * import com.pulumi.rancher2.MachineConfigV2;
 * import com.pulumi.rancher2.MachineConfigV2Args;
 * import com.pulumi.rancher2.inputs.MachineConfigV2HarvesterConfigArgs;
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
 *         // Get imported harvester cluster info
 *         final var foo-harvester = Rancher2Functions.getClusterV2(GetClusterV2Args.builder()
 *             .name("foo-harvester")
 *             .build());
 * 
 *         // Create a new Cloud Credential for an imported Harvester cluster
 *         var foo_harvesterCloudCredential = new CloudCredential("foo-harvesterCloudCredential", CloudCredentialArgs.builder()
 *             .name("foo-harvester")
 *             .harvesterCredentialConfig(CloudCredentialHarvesterCredentialConfigArgs.builder()
 *                 .clusterId(foo_harvester.clusterV1Id())
 *                 .clusterType("imported")
 *                 .kubeconfigContent(foo_harvester.kubeConfig())
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 machine config v2 using harvester node_driver
 *         var foo_harvester_v2 = new MachineConfigV2("foo-harvester-v2", MachineConfigV2Args.builder()
 *             .generateName("foo-harvester-v2")
 *             .harvesterConfig(MachineConfigV2HarvesterConfigArgs.builder()
 *                 .vmNamespace("default")
 *                 .cpuCount("2")
 *                 .memorySize("4")
 *                 .diskInfo("""
 *     {
 *         "disks": [{
 *             "imageName": "harvester-public/image-57hzg",
 *             "size": 40,
 *             "bootOrder": 1
 *         }]
 *     }
 *                 """)
 *                 .networkInfo("""
 *     {
 *         "interfaces": [{
 *             "networkName": "harvester-public/vlan1"
 *         }]
 *     }
 *                 """)
 *                 .sshUser("ubuntu")
 *                 .userData("""
 *     package_update: true
 *     packages:
 *       - qemu-guest-agent
 *       - iptables
 *     runcmd:
 *       - - systemctl
 *         - enable
 *         - '--now'
 *         - qemu-guest-agent.service
 *                 """)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="rancher2:index/machineConfigV2:MachineConfigV2")
public class MachineConfigV2 extends com.pulumi.resources.CustomResource {
    /**
     * AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="amazonec2Config", refs={MachineConfigV2Amazonec2Config.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2Amazonec2Config> amazonec2Config;

    /**
     * @return AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2Amazonec2Config>> amazonec2Config() {
        return Codegen.optional(this.amazonec2Config);
    }
    /**
     * Annotations for Machine Config V2 object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Machine Config V2 object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="azureConfig", refs={MachineConfigV2AzureConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2AzureConfig> azureConfig;

    /**
     * @return Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2AzureConfig>> azureConfig() {
        return Codegen.optional(this.azureConfig);
    }
    /**
     * Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="digitaloceanConfig", refs={MachineConfigV2DigitaloceanConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2DigitaloceanConfig> digitaloceanConfig;

    /**
     * @return Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2DigitaloceanConfig>> digitaloceanConfig() {
        return Codegen.optional(this.digitaloceanConfig);
    }
    /**
     * Cluster V2 fleet namespace
     * 
     */
    @Export(name="fleetNamespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fleetNamespace;

    /**
     * @return Cluster V2 fleet namespace
     * 
     */
    public Output<Optional<String>> fleetNamespace() {
        return Codegen.optional(this.fleetNamespace);
    }
    /**
     * Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\&#34;prod-pool1\&#34; will generate \&#34;nc-prod-pool1-?????\&#34; name computed at `name` attribute (string)
     * 
     */
    @Export(name="generateName", refs={String.class}, tree="[0]")
    private Output<String> generateName;

    /**
     * @return Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\&#34;prod-pool1\&#34; will generate \&#34;nc-prod-pool1-?????\&#34; name computed at `name` attribute (string)
     * 
     */
    public Output<String> generateName() {
        return this.generateName;
    }
    /**
     * Harvester config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="harvesterConfig", refs={MachineConfigV2HarvesterConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2HarvesterConfig> harvesterConfig;

    /**
     * @return Harvester config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2HarvesterConfig>> harvesterConfig() {
        return Codegen.optional(this.harvesterConfig);
    }
    /**
     * (Computed) The machine config kind (string)
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return (Computed) The machine config kind (string)
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Labels for Machine Config V2 object (map)
     * 
     * **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Machine Config V2
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Machine Config V2 object (map)
     * 
     * **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Machine Config V2
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="linodeConfig", refs={MachineConfigV2LinodeConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2LinodeConfig> linodeConfig;

    /**
     * @return Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2LinodeConfig>> linodeConfig() {
        return Codegen.optional(this.linodeConfig);
    }
    /**
     * (Computed) The machine config name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Computed) The machine config name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    @Export(name="openstackConfig", refs={MachineConfigV2OpenstackConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2OpenstackConfig> openstackConfig;

    /**
     * @return Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `vsphere_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2OpenstackConfig>> openstackConfig() {
        return Codegen.optional(this.openstackConfig);
    }
    /**
     * (Computed) The machine config k8s resource version (string)
     * 
     */
    @Export(name="resourceVersion", refs={String.class}, tree="[0]")
    private Output<String> resourceVersion;

    /**
     * @return (Computed) The machine config k8s resource version (string)
     * 
     */
    public Output<String> resourceVersion() {
        return this.resourceVersion;
    }
    /**
     * vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `openstack_config` (list maxitems:1)
     * 
     */
    @Export(name="vsphereConfig", refs={MachineConfigV2VsphereConfig.class}, tree="[0]")
    private Output</* @Nullable */ MachineConfigV2VsphereConfig> vsphereConfig;

    /**
     * @return vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `openstack_config` (list maxitems:1)
     * 
     */
    public Output<Optional<MachineConfigV2VsphereConfig>> vsphereConfig() {
        return Codegen.optional(this.vsphereConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineConfigV2(java.lang.String name) {
        this(name, MachineConfigV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineConfigV2(java.lang.String name, MachineConfigV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineConfigV2(java.lang.String name, MachineConfigV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/machineConfigV2:MachineConfigV2", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MachineConfigV2(java.lang.String name, Output<java.lang.String> id, @Nullable MachineConfigV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/machineConfigV2:MachineConfigV2", name, state, makeResourceOptions(options, id), false);
    }

    private static MachineConfigV2Args makeArgs(MachineConfigV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MachineConfigV2Args.Empty : args;
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
    public static MachineConfigV2 get(java.lang.String name, Output<java.lang.String> id, @Nullable MachineConfigV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineConfigV2(name, id, state, options);
    }
}
