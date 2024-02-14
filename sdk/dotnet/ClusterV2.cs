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
    /// ## Import
    /// 
    /// Clusters v2 can be imported using the Rancher Cluster v2 ID, that is in the form &amp;lt;FLEET_NAMESPACE&amp;gt;/&amp;lt;CLUSTER_NAME&amp;gt;
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/clusterV2:ClusterV2 foo &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/clusterV2:ClusterV2")]
    public partial class ClusterV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
        /// </summary>
        [Output("agentEnvVars")]
        public Output<ImmutableArray<Outputs.ClusterV2AgentEnvVar>> AgentEnvVars { get; private set; } = null!;

        /// <summary>
        /// Annotations for the Cluster.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
        /// </summary>
        [Output("cloudCredentialSecretName")]
        public Output<string?> CloudCredentialSecretName { get; private set; } = null!;

        /// <summary>
        /// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
        /// </summary>
        [Output("clusterAgentDeploymentCustomizations")]
        public Output<ImmutableArray<Outputs.ClusterV2ClusterAgentDeploymentCustomization>> ClusterAgentDeploymentCustomizations { get; private set; } = null!;

        /// <summary>
        /// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
        /// </summary>
        [Output("clusterRegistrationToken")]
        public Output<Outputs.ClusterV2ClusterRegistrationToken> ClusterRegistrationToken { get; private set; } = null!;

        /// <summary>
        /// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2_sync`).
        /// </summary>
        [Output("clusterV1Id")]
        public Output<string> ClusterV1Id { get; private set; } = null!;

        /// <summary>
        /// Default cluster role for project members.
        /// </summary>
        [Output("defaultClusterRoleForProjectMembers")]
        public Output<string?> DefaultClusterRoleForProjectMembers { get; private set; } = null!;

        /// <summary>
        /// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
        /// </summary>
        [Output("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public Output<string?> DefaultPodSecurityAdmissionConfigurationTemplateName { get; private set; } = null!;

        /// <summary>
        /// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
        /// </summary>
        [Output("defaultPodSecurityPolicyTemplateName")]
        public Output<string?> DefaultPodSecurityPolicyTemplateName { get; private set; } = null!;

        /// <summary>
        /// Enable k8s network policy on the cluster.
        /// </summary>
        [Output("enableNetworkPolicy")]
        public Output<bool> EnableNetworkPolicy { get; private set; } = null!;

        /// <summary>
        /// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
        /// </summary>
        [Output("fleetAgentDeploymentCustomizations")]
        public Output<ImmutableArray<Outputs.ClusterV2FleetAgentDeploymentCustomization>> FleetAgentDeploymentCustomizations { get; private set; } = null!;

        /// <summary>
        /// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
        /// </summary>
        [Output("fleetNamespace")]
        public Output<string?> FleetNamespace { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected`.
        /// </summary>
        [Output("kubeConfig")]
        public Output<string> KubeConfig { get; private set; } = null!;

        /// <summary>
        /// The RKE2 or K3s version for the cluster.
        /// </summary>
        [Output("kubernetesVersion")]
        public Output<string> KubernetesVersion { get; private set; } = null!;

        /// <summary>
        /// Labels for the Cluster.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
        /// </summary>
        [Output("localAuthEndpoint")]
        public Output<Outputs.ClusterV2LocalAuthEndpoint?> LocalAuthEndpoint { get; private set; } = null!;

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Computed, string) Cluster's k8s resource version.
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;

        /// <summary>
        /// The RKE configuration for the cluster.
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
                AdditionalSecretOutputs =
                {
                    "clusterRegistrationToken",
                    "kubeConfig",
                },
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

    public sealed class ClusterV2Args : global::Pulumi.ResourceArgs
    {
        [Input("agentEnvVars")]
        private InputList<Inputs.ClusterV2AgentEnvVarArgs>? _agentEnvVars;

        /// <summary>
        /// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
        /// </summary>
        public InputList<Inputs.ClusterV2AgentEnvVarArgs> AgentEnvVars
        {
            get => _agentEnvVars ?? (_agentEnvVars = new InputList<Inputs.ClusterV2AgentEnvVarArgs>());
            set => _agentEnvVars = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the Cluster.
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
        /// </summary>
        [Input("cloudCredentialSecretName")]
        public Input<string>? CloudCredentialSecretName { get; set; }

        [Input("clusterAgentDeploymentCustomizations")]
        private InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationArgs>? _clusterAgentDeploymentCustomizations;

        /// <summary>
        /// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
        /// </summary>
        public InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationArgs> ClusterAgentDeploymentCustomizations
        {
            get => _clusterAgentDeploymentCustomizations ?? (_clusterAgentDeploymentCustomizations = new InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationArgs>());
            set => _clusterAgentDeploymentCustomizations = value;
        }

        /// <summary>
        /// Default cluster role for project members.
        /// </summary>
        [Input("defaultClusterRoleForProjectMembers")]
        public Input<string>? DefaultClusterRoleForProjectMembers { get; set; }

        /// <summary>
        /// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
        /// </summary>
        [Input("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public Input<string>? DefaultPodSecurityAdmissionConfigurationTemplateName { get; set; }

        /// <summary>
        /// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
        /// </summary>
        [Input("defaultPodSecurityPolicyTemplateName")]
        public Input<string>? DefaultPodSecurityPolicyTemplateName { get; set; }

        /// <summary>
        /// Enable k8s network policy on the cluster.
        /// </summary>
        [Input("enableNetworkPolicy")]
        public Input<bool>? EnableNetworkPolicy { get; set; }

        [Input("fleetAgentDeploymentCustomizations")]
        private InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationArgs>? _fleetAgentDeploymentCustomizations;

        /// <summary>
        /// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
        /// </summary>
        public InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationArgs> FleetAgentDeploymentCustomizations
        {
            get => _fleetAgentDeploymentCustomizations ?? (_fleetAgentDeploymentCustomizations = new InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationArgs>());
            set => _fleetAgentDeploymentCustomizations = value;
        }

        /// <summary>
        /// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        /// <summary>
        /// The RKE2 or K3s version for the cluster.
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the Cluster.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
        /// </summary>
        [Input("localAuthEndpoint")]
        public Input<Inputs.ClusterV2LocalAuthEndpointArgs>? LocalAuthEndpoint { get; set; }

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The RKE configuration for the cluster.
        /// </summary>
        [Input("rkeConfig")]
        public Input<Inputs.ClusterV2RkeConfigArgs>? RkeConfig { get; set; }

        public ClusterV2Args()
        {
        }
        public static new ClusterV2Args Empty => new ClusterV2Args();
    }

    public sealed class ClusterV2State : global::Pulumi.ResourceArgs
    {
        [Input("agentEnvVars")]
        private InputList<Inputs.ClusterV2AgentEnvVarGetArgs>? _agentEnvVars;

        /// <summary>
        /// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
        /// </summary>
        public InputList<Inputs.ClusterV2AgentEnvVarGetArgs> AgentEnvVars
        {
            get => _agentEnvVars ?? (_agentEnvVars = new InputList<Inputs.ClusterV2AgentEnvVarGetArgs>());
            set => _agentEnvVars = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the Cluster.
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
        /// </summary>
        [Input("cloudCredentialSecretName")]
        public Input<string>? CloudCredentialSecretName { get; set; }

        [Input("clusterAgentDeploymentCustomizations")]
        private InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationGetArgs>? _clusterAgentDeploymentCustomizations;

        /// <summary>
        /// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
        /// </summary>
        public InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationGetArgs> ClusterAgentDeploymentCustomizations
        {
            get => _clusterAgentDeploymentCustomizations ?? (_clusterAgentDeploymentCustomizations = new InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationGetArgs>());
            set => _clusterAgentDeploymentCustomizations = value;
        }

        [Input("clusterRegistrationToken")]
        private Input<Inputs.ClusterV2ClusterRegistrationTokenGetArgs>? _clusterRegistrationToken;

        /// <summary>
        /// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
        /// </summary>
        public Input<Inputs.ClusterV2ClusterRegistrationTokenGetArgs>? ClusterRegistrationToken
        {
            get => _clusterRegistrationToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clusterRegistrationToken = Output.Tuple<Input<Inputs.ClusterV2ClusterRegistrationTokenGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2_sync`).
        /// </summary>
        [Input("clusterV1Id")]
        public Input<string>? ClusterV1Id { get; set; }

        /// <summary>
        /// Default cluster role for project members.
        /// </summary>
        [Input("defaultClusterRoleForProjectMembers")]
        public Input<string>? DefaultClusterRoleForProjectMembers { get; set; }

        /// <summary>
        /// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
        /// </summary>
        [Input("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public Input<string>? DefaultPodSecurityAdmissionConfigurationTemplateName { get; set; }

        /// <summary>
        /// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
        /// </summary>
        [Input("defaultPodSecurityPolicyTemplateName")]
        public Input<string>? DefaultPodSecurityPolicyTemplateName { get; set; }

        /// <summary>
        /// Enable k8s network policy on the cluster.
        /// </summary>
        [Input("enableNetworkPolicy")]
        public Input<bool>? EnableNetworkPolicy { get; set; }

        [Input("fleetAgentDeploymentCustomizations")]
        private InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationGetArgs>? _fleetAgentDeploymentCustomizations;

        /// <summary>
        /// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
        /// </summary>
        public InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationGetArgs> FleetAgentDeploymentCustomizations
        {
            get => _fleetAgentDeploymentCustomizations ?? (_fleetAgentDeploymentCustomizations = new InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationGetArgs>());
            set => _fleetAgentDeploymentCustomizations = value;
        }

        /// <summary>
        /// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        [Input("kubeConfig")]
        private Input<string>? _kubeConfig;

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `local_auth_endpoint` enabled, the kube_config will not be available until the cluster is `connected`.
        /// </summary>
        public Input<string>? KubeConfig
        {
            get => _kubeConfig;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _kubeConfig = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The RKE2 or K3s version for the cluster.
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the Cluster.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
        /// </summary>
        [Input("localAuthEndpoint")]
        public Input<Inputs.ClusterV2LocalAuthEndpointGetArgs>? LocalAuthEndpoint { get; set; }

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Computed, string) Cluster's k8s resource version.
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        /// <summary>
        /// The RKE configuration for the cluster.
        /// </summary>
        [Input("rkeConfig")]
        public Input<Inputs.ClusterV2RkeConfigGetArgs>? RkeConfig { get; set; }

        public ClusterV2State()
        {
        }
        public static new ClusterV2State Empty => new ClusterV2State();
    }
}
