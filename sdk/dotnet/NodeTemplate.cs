// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.
    /// 
    /// amazonec2, azure, digitalocean, harvester, linode, opennebula, openstack, outscale, hetzner and vsphere drivers are supported for node templates.
    /// 
    /// **Note** If you are upgrading to Rancher v2.3.3, please take a look to final section
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Node Template up to Rancher 2.1.x
    ///     var foo = new Rancher2.NodeTemplate("foo", new()
    ///     {
    ///         Amazonec2Config = new Rancher2.Inputs.NodeTemplateAmazonec2ConfigArgs
    ///         {
    ///             AccessKey = "AWS_ACCESS_KEY",
    ///             Ami = "&lt;AMI_ID&gt;",
    ///             Region = "&lt;REGION&gt;",
    ///             SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///             SecurityGroups = new[]
    ///             {
    ///                 "&lt;AWS_SECURITY_GROUP&gt;",
    ///             },
    ///             SubnetId = "&lt;SUBNET_ID&gt;",
    ///             VpcId = "&lt;VPC_ID&gt;",
    ///             Zone = "&lt;ZONE&gt;",
    ///         },
    ///         Description = "foo test",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Node Template from Rancher 2.2.x
    ///     var fooCloudCredential = new Rancher2.CloudCredential("fooCloudCredential", new()
    ///     {
    ///         Description = "foo test",
    ///         Amazonec2CredentialConfig = new Rancher2.Inputs.CloudCredentialAmazonec2CredentialConfigArgs
    ///         {
    ///             AccessKey = "&lt;AWS_ACCESS_KEY&gt;",
    ///             SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///         },
    ///     });
    /// 
    ///     var fooNodeTemplate = new Rancher2.NodeTemplate("fooNodeTemplate", new()
    ///     {
    ///         Description = "foo test",
    ///         CloudCredentialId = fooCloudCredential.Id,
    ///         Amazonec2Config = new Rancher2.Inputs.NodeTemplateAmazonec2ConfigArgs
    ///         {
    ///             Ami = "&lt;AMI_ID&gt;",
    ///             Region = "&lt;REGION&gt;",
    ///             SecurityGroups = new[]
    ///             {
    ///                 "&lt;AWS_SECURITY_GROUP&gt;",
    ///             },
    ///             SubnetId = "&lt;SUBNET_ID&gt;",
    ///             VpcId = "&lt;VPC_ID&gt;",
    ///             Zone = "&lt;ZONE&gt;",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Using the Harvester Node Driver
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo_harvesterClusterV2 = Rancher2.GetClusterV2.Invoke(new()
    ///     {
    ///         Name = "foo-harvester",
    ///     });
    /// 
    ///     // Create a new Cloud Credential for an imported Harvester cluster
    ///     var foo_harvesterCloudCredential = new Rancher2.CloudCredential("foo-harvesterCloudCredential", new()
    ///     {
    ///         HarvesterCredentialConfig = new Rancher2.Inputs.CloudCredentialHarvesterCredentialConfigArgs
    ///         {
    ///             ClusterId = foo_harvesterClusterV2.Apply(foo_harvesterClusterV2 =&gt; foo_harvesterClusterV2.Apply(getClusterV2Result =&gt; getClusterV2Result.ClusterV1Id)),
    ///             ClusterType = "imported",
    ///             KubeconfigContent = foo_harvesterClusterV2.Apply(foo_harvesterClusterV2 =&gt; foo_harvesterClusterV2.Apply(getClusterV2Result =&gt; getClusterV2Result.KubeConfig)),
    ///         },
    ///     });
    /// 
    ///     // Create a new rancher2 Node Template using harvester node_driver
    ///     var foo_harvesterNodeTemplate = new Rancher2.NodeTemplate("foo-harvesterNodeTemplate", new()
    ///     {
    ///         CloudCredentialId = foo_harvesterCloudCredential.Id,
    ///         EngineInstallUrl = "https://releases.rancher.com/install-docker/20.10.sh",
    ///         HarvesterConfig = new Rancher2.Inputs.NodeTemplateHarvesterConfigArgs
    ///         {
    ///             VmNamespace = "default",
    ///             CpuCount = "2",
    ///             MemorySize = "4",
    ///             DiskSize = "40",
    ///             NetworkName = "harvester-public/vlan1",
    ///             ImageName = "harvester-public/image-57hzg",
    ///             SshUser = "ubuntu",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Using the Hetzner Node Driver
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Node Template using hetzner node_driver
    ///     var hetznerNodeDriver = new Rancher2.NodeDriver("hetznerNodeDriver", new()
    ///     {
    ///         Active = true,
    ///         Builtin = false,
    ///         UiUrl = "https://storage.googleapis.com/hcloud-rancher-v2-ui-driver/component.js",
    ///         Url = "https://github.com/JonasProgrammer/docker-machine-driver-hetzner/releases/download/3.6.0/docker-machine-driver-hetzner_3.6.0_linux_amd64.tar.gz",
    ///         WhitelistDomains = new[]
    ///         {
    ///             "storage.googleapis.com",
    ///         },
    ///     });
    /// 
    ///     var myHetznerNodeTemplate = new Rancher2.NodeTemplate("myHetznerNodeTemplate", new()
    ///     {
    ///         DriverId = hetznerNodeDriver.Id,
    ///         HetznerConfig = new Rancher2.Inputs.NodeTemplateHetznerConfigArgs
    ///         {
    ///             ApiToken = "XXXXXXXXXX",
    ///             Image = "ubuntu-18.04",
    ///             ServerLocation = "nbg1",
    ///             ServerType = "cx11",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Node Template can be imported using the Rancher Node Template ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/nodeTemplate:NodeTemplate foo &amp;lt;node_template_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/nodeTemplate:NodeTemplate")]
    public partial class NodeTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("amazonec2Config")]
        public Output<Outputs.NodeTemplateAmazonec2Config?> Amazonec2Config { get; private set; } = null!;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        [Output("authCertificateAuthority")]
        public Output<string?> AuthCertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        [Output("authKey")]
        public Output<string?> AuthKey { get; private set; } = null!;

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("azureConfig")]
        public Output<Outputs.NodeTemplateAzureConfig?> AzureConfig { get; private set; } = null!;

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Output("cloudCredentialId")]
        public Output<string?> CloudCredentialId { get; private set; } = null!;

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("digitaloceanConfig")]
        public Output<Outputs.NodeTemplateDigitaloceanConfig?> DigitaloceanConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The driver of the node template (string)
        /// </summary>
        [Output("driver")]
        public Output<string> Driver { get; private set; } = null!;

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Output("driverId")]
        public Output<string> DriverId { get; private set; } = null!;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        [Output("engineEnv")]
        public Output<ImmutableDictionary<string, object>?> EngineEnv { get; private set; } = null!;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        [Output("engineInsecureRegistries")]
        public Output<ImmutableArray<string>> EngineInsecureRegistries { get; private set; } = null!;

        /// <summary>
        /// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Output("engineInstallUrl")]
        public Output<string> EngineInstallUrl { get; private set; } = null!;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        [Output("engineLabel")]
        public Output<ImmutableDictionary<string, object>?> EngineLabel { get; private set; } = null!;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        [Output("engineOpt")]
        public Output<ImmutableDictionary<string, object>?> EngineOpt { get; private set; } = null!;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        [Output("engineRegistryMirrors")]
        public Output<ImmutableArray<string>> EngineRegistryMirrors { get; private set; } = null!;

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Output("engineStorageDriver")]
        public Output<string?> EngineStorageDriver { get; private set; } = null!;

        /// <summary>
        /// Harvester config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("harvesterConfig")]
        public Output<Outputs.NodeTemplateHarvesterConfig?> HarvesterConfig { get; private set; } = null!;

        /// <summary>
        /// Hetzner config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("hetznerConfig")]
        public Output<Outputs.NodeTemplateHetznerConfig?> HetznerConfig { get; private set; } = null!;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("linodeConfig")]
        public Output<Outputs.NodeTemplateLinodeConfig?> LinodeConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        [Output("nodeTaints")]
        public Output<ImmutableArray<Outputs.NodeTemplateNodeTaint>> NodeTaints { get; private set; } = null!;

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("opennebulaConfig")]
        public Output<Outputs.NodeTemplateOpennebulaConfig?> OpennebulaConfig { get; private set; } = null!;

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("openstackConfig")]
        public Output<Outputs.NodeTemplateOpenstackConfig?> OpenstackConfig { get; private set; } = null!;

        /// <summary>
        /// Outscale config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("outscaleConfig")]
        public Output<Outputs.NodeTemplateOutscaleConfig?> OutscaleConfig { get; private set; } = null!;

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Output("useInternalIpAddress")]
        public Output<bool?> UseInternalIpAddress { get; private set; } = null!;

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("vsphereConfig")]
        public Output<Outputs.NodeTemplateVsphereConfig?> VsphereConfig { get; private set; } = null!;


        /// <summary>
        /// Create a NodeTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodeTemplate(string name, NodeTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeTemplate:NodeTemplate", name, args ?? new NodeTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodeTemplate(string name, Input<string> id, NodeTemplateState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeTemplate:NodeTemplate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "authCertificateAuthority",
                    "authKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NodeTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodeTemplate Get(string name, Input<string> id, NodeTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new NodeTemplate(name, id, state, options);
        }
    }

    public sealed class NodeTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.NodeTemplateAmazonec2ConfigArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("authCertificateAuthority")]
        private Input<string>? _authCertificateAuthority;

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        public Input<string>? AuthCertificateAuthority
        {
            get => _authCertificateAuthority;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authCertificateAuthority = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("authKey")]
        private Input<string>? _authKey;

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        public Input<string>? AuthKey
        {
            get => _authKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.NodeTemplateAzureConfigArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Input("cloudCredentialId")]
        public Input<string>? CloudCredentialId { get; set; }

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.NodeTemplateDigitaloceanConfigArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Input("driverId")]
        public Input<string>? DriverId { get; set; }

        [Input("engineEnv")]
        private InputMap<object>? _engineEnv;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        public InputMap<object> EngineEnv
        {
            get => _engineEnv ?? (_engineEnv = new InputMap<object>());
            set => _engineEnv = value;
        }

        [Input("engineInsecureRegistries")]
        private InputList<string>? _engineInsecureRegistries;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        public InputList<string> EngineInsecureRegistries
        {
            get => _engineInsecureRegistries ?? (_engineInsecureRegistries = new InputList<string>());
            set => _engineInsecureRegistries = value;
        }

        /// <summary>
        /// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Input("engineInstallUrl")]
        public Input<string>? EngineInstallUrl { get; set; }

        [Input("engineLabel")]
        private InputMap<object>? _engineLabel;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        public InputMap<object> EngineLabel
        {
            get => _engineLabel ?? (_engineLabel = new InputMap<object>());
            set => _engineLabel = value;
        }

        [Input("engineOpt")]
        private InputMap<object>? _engineOpt;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        public InputMap<object> EngineOpt
        {
            get => _engineOpt ?? (_engineOpt = new InputMap<object>());
            set => _engineOpt = value;
        }

        [Input("engineRegistryMirrors")]
        private InputList<string>? _engineRegistryMirrors;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        public InputList<string> EngineRegistryMirrors
        {
            get => _engineRegistryMirrors ?? (_engineRegistryMirrors = new InputList<string>());
            set => _engineRegistryMirrors = value;
        }

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Input("engineStorageDriver")]
        public Input<string>? EngineStorageDriver { get; set; }

        /// <summary>
        /// Harvester config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("harvesterConfig")]
        public Input<Inputs.NodeTemplateHarvesterConfigArgs>? HarvesterConfig { get; set; }

        /// <summary>
        /// Hetzner config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("hetznerConfig")]
        public Input<Inputs.NodeTemplateHetznerConfigArgs>? HetznerConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.NodeTemplateLinodeConfigArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodeTemplateNodeTaintArgs>? _nodeTaints;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        public InputList<Inputs.NodeTemplateNodeTaintArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodeTemplateNodeTaintArgs>());
            set => _nodeTaints = value;
        }

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("opennebulaConfig")]
        public Input<Inputs.NodeTemplateOpennebulaConfigArgs>? OpennebulaConfig { get; set; }

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.NodeTemplateOpenstackConfigArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// Outscale config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("outscaleConfig")]
        public Input<Inputs.NodeTemplateOutscaleConfigArgs>? OutscaleConfig { get; set; }

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Input("useInternalIpAddress")]
        public Input<bool>? UseInternalIpAddress { get; set; }

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.NodeTemplateVsphereConfigArgs>? VsphereConfig { get; set; }

        public NodeTemplateArgs()
        {
        }
        public static new NodeTemplateArgs Empty => new NodeTemplateArgs();
    }

    public sealed class NodeTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.NodeTemplateAmazonec2ConfigGetArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("authCertificateAuthority")]
        private Input<string>? _authCertificateAuthority;

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        public Input<string>? AuthCertificateAuthority
        {
            get => _authCertificateAuthority;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authCertificateAuthority = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("authKey")]
        private Input<string>? _authKey;

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        public Input<string>? AuthKey
        {
            get => _authKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.NodeTemplateAzureConfigGetArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Input("cloudCredentialId")]
        public Input<string>? CloudCredentialId { get; set; }

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.NodeTemplateDigitaloceanConfigGetArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// (Computed) The driver of the node template (string)
        /// </summary>
        [Input("driver")]
        public Input<string>? Driver { get; set; }

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Input("driverId")]
        public Input<string>? DriverId { get; set; }

        [Input("engineEnv")]
        private InputMap<object>? _engineEnv;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        public InputMap<object> EngineEnv
        {
            get => _engineEnv ?? (_engineEnv = new InputMap<object>());
            set => _engineEnv = value;
        }

        [Input("engineInsecureRegistries")]
        private InputList<string>? _engineInsecureRegistries;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        public InputList<string> EngineInsecureRegistries
        {
            get => _engineInsecureRegistries ?? (_engineInsecureRegistries = new InputList<string>());
            set => _engineInsecureRegistries = value;
        }

        /// <summary>
        /// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Input("engineInstallUrl")]
        public Input<string>? EngineInstallUrl { get; set; }

        [Input("engineLabel")]
        private InputMap<object>? _engineLabel;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        public InputMap<object> EngineLabel
        {
            get => _engineLabel ?? (_engineLabel = new InputMap<object>());
            set => _engineLabel = value;
        }

        [Input("engineOpt")]
        private InputMap<object>? _engineOpt;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        public InputMap<object> EngineOpt
        {
            get => _engineOpt ?? (_engineOpt = new InputMap<object>());
            set => _engineOpt = value;
        }

        [Input("engineRegistryMirrors")]
        private InputList<string>? _engineRegistryMirrors;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        public InputList<string> EngineRegistryMirrors
        {
            get => _engineRegistryMirrors ?? (_engineRegistryMirrors = new InputList<string>());
            set => _engineRegistryMirrors = value;
        }

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Input("engineStorageDriver")]
        public Input<string>? EngineStorageDriver { get; set; }

        /// <summary>
        /// Harvester config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("harvesterConfig")]
        public Input<Inputs.NodeTemplateHarvesterConfigGetArgs>? HarvesterConfig { get; set; }

        /// <summary>
        /// Hetzner config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("hetznerConfig")]
        public Input<Inputs.NodeTemplateHetznerConfigGetArgs>? HetznerConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.NodeTemplateLinodeConfigGetArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodeTemplateNodeTaintGetArgs>? _nodeTaints;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        public InputList<Inputs.NodeTemplateNodeTaintGetArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodeTemplateNodeTaintGetArgs>());
            set => _nodeTaints = value;
        }

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("opennebulaConfig")]
        public Input<Inputs.NodeTemplateOpennebulaConfigGetArgs>? OpennebulaConfig { get; set; }

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.NodeTemplateOpenstackConfigGetArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// Outscale config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("outscaleConfig")]
        public Input<Inputs.NodeTemplateOutscaleConfigGetArgs>? OutscaleConfig { get; set; }

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Input("useInternalIpAddress")]
        public Input<bool>? UseInternalIpAddress { get; set; }

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.NodeTemplateVsphereConfigGetArgs>? VsphereConfig { get; set; }

        public NodeTemplateState()
        {
        }
        public static new NodeTemplateState Empty => new NodeTemplateState();
    }
}
