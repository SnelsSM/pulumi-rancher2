// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional duration in seconds of addon job.
        /// </summary>
        [Input("addonJobTimeout")]
        public Input<int>? AddonJobTimeout { get; set; }

        /// <summary>
        /// Optional addons descripton to deploy on rke cluster.
        /// </summary>
        [Input("addons")]
        public Input<string>? Addons { get; set; }

        [Input("addonsIncludes")]
        private InputList<string>? _addonsIncludes;

        /// <summary>
        /// Optional addons yaml manisfest to deploy on rke cluster.
        /// </summary>
        public InputList<string> AddonsIncludes
        {
            get => _addonsIncludes ?? (_addonsIncludes = new InputList<string>());
            set => _addonsIncludes = value;
        }

        /// <summary>
        /// Kubernetes cluster authentication
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// Kubernetes cluster authorization
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationGetArgs>? Authorization { get; set; }

        /// <summary>
        /// RKE bastion host
        /// </summary>
        [Input("bastionHost")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostGetArgs>? BastionHost { get; set; }

        [Input("cloudProvider")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderGetArgs>? CloudProvider { get; set; }

        [Input("dns")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsGetArgs>? Dns { get; set; }

        /// <summary>
        /// Enable/disable using cri-dockerd
        /// </summary>
        [Input("enableCriDockerd")]
        public Input<bool>? EnableCriDockerd { get; set; }

        /// <summary>
        /// Optional ignore docker version on nodes
        /// </summary>
        [Input("ignoreDockerVersion")]
        public Input<bool>? IgnoreDockerVersion { get; set; }

        /// <summary>
        /// Kubernetes ingress configuration
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressGetArgs>? Ingress { get; set; }

        /// <summary>
        /// Optional kubernetes version to deploy
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// Kubernetes cluster monitoring
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringGetArgs>? Monitoring { get; set; }

        /// <summary>
        /// Kubernetes cluster networking
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkGetArgs>? Network { get; set; }

        [Input("nodes")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs>? _nodes;

        /// <summary>
        /// Optional RKE cluster nodes
        /// </summary>
        public InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// Optional prefix to customize kubernetes path
        /// </summary>
        [Input("prefixPath")]
        public Input<string>? PrefixPath { get; set; }

        [Input("privateRegistries")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryGetArgs>? _privateRegistries;

        /// <summary>
        /// Optional private registries for docker images
        /// </summary>
        public InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryGetArgs> PrivateRegistries
        {
            get => _privateRegistries ?? (_privateRegistries = new InputList<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryGetArgs>());
            set => _privateRegistries = value;
        }

        /// <summary>
        /// Kubernetes cluster services
        /// </summary>
        [Input("services")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesGetArgs>? Services { get; set; }

        /// <summary>
        /// Optional use ssh agent auth
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        /// <summary>
        /// Optional cluster level SSH certificate path
        /// </summary>
        [Input("sshCertPath")]
        public Input<string>? SshCertPath { get; set; }

        /// <summary>
        /// Optional cluster level SSH private key path
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// RKE upgrade strategy
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyGetArgs>? UpgradeStrategy { get; set; }

        /// <summary>
        /// Optional prefix to customize kubernetes path for windows
        /// </summary>
        [Input("winPrefixPath")]
        public Input<string>? WinPrefixPath { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigGetArgs();
    }
}
