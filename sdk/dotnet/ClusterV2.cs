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
    /// Provides a Rancher v2 Cluster v2 resource. This can be used to create RKE2 and K3S Clusters for Rancher v2 environments and retrieve their information. This resource is supported as tech preview from Rancher v2.6.0 and above.
    /// 
    /// ## Example Usage
    /// ### Creating Rancher v2 custom cluster v2
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher v2 K3S custom Cluster v2
    ///         var foo = new Rancher2.ClusterV2("foo", new Rancher2.ClusterV2Args
    ///         {
    ///             DefaultClusterRoleForProjectMembers = "user",
    ///             EnableNetworkPolicy = false,
    ///             FleetNamespace = "fleet-ns",
    ///             KubernetesVersion = "v1.21.4+k3s1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// **Note** Once created, get the node command from `rancher2_cluster_v2.foo.cluster_registration_token`
    /// 
    /// ## Import
    /// 
    /// Clusters v2 can be imported using the Rancher Cluster v2 ID, that is in the form &amp;lt;FLEET_NAMESPACE&amp;gt;/&amp;lt;CLUSTER_NAME&amp;gt;
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/clusterV2:ClusterV2 foo &amp;lt;FLEET_NAMESPACE&amp;gt;/&amp;lt;CLUSTER_NAME&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/clusterV2:ClusterV2")]
    public partial class ClusterV2 : Pulumi.CustomResource
    {
        /// <summary>
        /// Optional Agent Env Vars for Rancher agent (list)
        /// </summary>
        [Output("agentEnvVars")]
        public Output<ImmutableArray<Outputs.ClusterV2AgentEnvVar>> AgentEnvVars { get; private set; } = null!;

        /// <summary>
        /// Annotations for cluster registration token object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Cluster V2 cloud credential secret name (string)
        /// </summary>
        [Output("cloudCredentialSecretName")]
        public Output<string?> CloudCredentialSecretName { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
        /// </summary>
        [Output("clusterRegistrationToken")]
        public Output<Outputs.ClusterV2ClusterRegistrationToken> ClusterRegistrationToken { get; private set; } = null!;

        /// <summary>
        /// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
        /// </summary>
        [Output("clusterV1Id")]
        public Output<string> ClusterV1Id { get; private set; } = null!;

        /// <summary>
        /// Cluster V2 default cluster role for project members (string)
        /// </summary>
        [Output("defaultClusterRoleForProjectMembers")]
        public Output<string?> DefaultClusterRoleForProjectMembers { get; private set; } = null!;

        /// <summary>
        /// Cluster V2 default pod security policy template name (string)
        /// </summary>
        [Output("defaultPodSecurityPolicyTemplateName")]
        public Output<string?> DefaultPodSecurityPolicyTemplateName { get; private set; } = null!;

        /// <summary>
        /// Enable k8s network policy at Cluster V2 (bool)
        /// </summary>
        [Output("enableNetworkPolicy")]
        public Output<bool> EnableNetworkPolicy { get; private set; } = null!;

        /// <summary>
        /// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
        /// </summary>
        [Output("fleetNamespace")]
        public Output<string?> FleetNamespace { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
        /// </summary>
        [Output("kubeConfig")]
        public Output<string> KubeConfig { get; private set; } = null!;

        /// <summary>
        /// The kubernetes version of the Cluster v2 (list maxitems:1)
        /// </summary>
        [Output("kubernetesVersion")]
        public Output<string> KubernetesVersion { get; private set; } = null!;

        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Computed) Cluster v2 k8s resource version (string)
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;

        /// <summary>
        /// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
        /// </summary>
        [Output("rkeConfig")]
        public Output<Outputs.ClusterV2RkeConfig> RkeConfig { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterV2(string name, ClusterV2Args args, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterV2:ClusterV2", name, args ?? new ClusterV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterV2(string name, Input<string> id, ClusterV2State? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterV2:ClusterV2", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClusterV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterV2 Get(string name, Input<string> id, ClusterV2State? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterV2(name, id, state, options);
        }
    }

    public sealed class ClusterV2Args : Pulumi.ResourceArgs
    {
        [Input("agentEnvVars")]
        private InputList<Inputs.ClusterV2AgentEnvVarArgs>? _agentEnvVars;

        /// <summary>
        /// Optional Agent Env Vars for Rancher agent (list)
        /// </summary>
        public InputList<Inputs.ClusterV2AgentEnvVarArgs> AgentEnvVars
        {
            get => _agentEnvVars ?? (_agentEnvVars = new InputList<Inputs.ClusterV2AgentEnvVarArgs>());
            set => _agentEnvVars = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster V2 cloud credential secret name (string)
        /// </summary>
        [Input("cloudCredentialSecretName")]
        public Input<string>? CloudCredentialSecretName { get; set; }

        /// <summary>
        /// Cluster V2 default cluster role for project members (string)
        /// </summary>
        [Input("defaultClusterRoleForProjectMembers")]
        public Input<string>? DefaultClusterRoleForProjectMembers { get; set; }

        /// <summary>
        /// Cluster V2 default pod security policy template name (string)
        /// </summary>
        [Input("defaultPodSecurityPolicyTemplateName")]
        public Input<string>? DefaultPodSecurityPolicyTemplateName { get; set; }

        /// <summary>
        /// Enable k8s network policy at Cluster V2 (bool)
        /// </summary>
        [Input("enableNetworkPolicy")]
        public Input<bool>? EnableNetworkPolicy { get; set; }

        /// <summary>
        /// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        /// <summary>
        /// The kubernetes version of the Cluster v2 (list maxitems:1)
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
        /// </summary>
        [Input("rkeConfig")]
        public Input<Inputs.ClusterV2RkeConfigArgs>? RkeConfig { get; set; }

        public ClusterV2Args()
        {
        }
    }

    public sealed class ClusterV2State : Pulumi.ResourceArgs
    {
        [Input("agentEnvVars")]
        private InputList<Inputs.ClusterV2AgentEnvVarGetArgs>? _agentEnvVars;

        /// <summary>
        /// Optional Agent Env Vars for Rancher agent (list)
        /// </summary>
        public InputList<Inputs.ClusterV2AgentEnvVarGetArgs> AgentEnvVars
        {
            get => _agentEnvVars ?? (_agentEnvVars = new InputList<Inputs.ClusterV2AgentEnvVarGetArgs>());
            set => _agentEnvVars = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster V2 cloud credential secret name (string)
        /// </summary>
        [Input("cloudCredentialSecretName")]
        public Input<string>? CloudCredentialSecretName { get; set; }

        /// <summary>
        /// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
        /// </summary>
        [Input("clusterRegistrationToken")]
        public Input<Inputs.ClusterV2ClusterRegistrationTokenGetArgs>? ClusterRegistrationToken { get; set; }

        /// <summary>
        /// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2_sync`) (string)
        /// </summary>
        [Input("clusterV1Id")]
        public Input<string>? ClusterV1Id { get; set; }

        /// <summary>
        /// Cluster V2 default cluster role for project members (string)
        /// </summary>
        [Input("defaultClusterRoleForProjectMembers")]
        public Input<string>? DefaultClusterRoleForProjectMembers { get; set; }

        /// <summary>
        /// Cluster V2 default pod security policy template name (string)
        /// </summary>
        [Input("defaultPodSecurityPolicyTemplateName")]
        public Input<string>? DefaultPodSecurityPolicyTemplateName { get; set; }

        /// <summary>
        /// Enable k8s network policy at Cluster V2 (bool)
        /// </summary>
        [Input("enableNetworkPolicy")]
        public Input<bool>? EnableNetworkPolicy { get; set; }

        /// <summary>
        /// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
        /// </summary>
        [Input("kubeConfig")]
        public Input<string>? KubeConfig { get; set; }

        /// <summary>
        /// The kubernetes version of the Cluster v2 (list maxitems:1)
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Computed) Cluster v2 k8s resource version (string)
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        /// <summary>
        /// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
        /// </summary>
        [Input("rkeConfig")]
        public Input<Inputs.ClusterV2RkeConfigGetArgs>? RkeConfig { get; set; }

        public ClusterV2State()
        {
        }
    }
}
