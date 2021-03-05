// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duration in seconds of addon job (int)
        /// </summary>
        [Input("addonJobTimeout")]
        public Input<int>? AddonJobTimeout { get; set; }

        /// <summary>
        /// Addons descripton to deploy on RKE cluster.
        /// </summary>
        [Input("addons")]
        public Input<string>? Addons { get; set; }

        [Input("addonsIncludes")]
        private InputList<string>? _addonsIncludes;

        /// <summary>
        /// Addons yaml manifests to deploy on RKE cluster (list)
        /// </summary>
        public InputList<string> AddonsIncludes
        {
            get => _addonsIncludes ?? (_addonsIncludes = new InputList<string>());
            set => _addonsIncludes = value;
        }

        /// <summary>
        /// Kubernetes cluster authentication (list maxitems:1)
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.ClusterRkeConfigAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// Kubernetes cluster authorization (list maxitems:1)
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.ClusterRkeConfigAuthorizationGetArgs>? Authorization { get; set; }

        /// <summary>
        /// RKE bastion host (list maxitems:1)
        /// </summary>
        [Input("bastionHost")]
        public Input<Inputs.ClusterRkeConfigBastionHostGetArgs>? BastionHost { get; set; }

        /// <summary>
        /// RKE options for Calico network provider (string)
        /// </summary>
        [Input("cloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderGetArgs>? CloudProvider { get; set; }

        /// <summary>
        /// RKE dns add-on. Just for Rancher v2.2.x (list maxitems:1)
        /// </summary>
        [Input("dns")]
        public Input<Inputs.ClusterRkeConfigDnsGetArgs>? Dns { get; set; }

        /// <summary>
        /// Ignore docker version. Default `true` (bool)
        /// </summary>
        [Input("ignoreDockerVersion")]
        public Input<bool>? IgnoreDockerVersion { get; set; }

        /// <summary>
        /// Kubernetes ingress configuration (list maxitems:1)
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.ClusterRkeConfigIngressGetArgs>? Ingress { get; set; }

        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// Kubernetes cluster monitoring (list maxitems:1)
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.ClusterRkeConfigMonitoringGetArgs>? Monitoring { get; set; }

        /// <summary>
        /// Network for GKE cluster (string)
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterRkeConfigNetworkGetArgs>? Network { get; set; }

        [Input("nodes")]
        private InputList<Inputs.ClusterRkeConfigNodeGetArgs>? _nodes;

        /// <summary>
        /// RKE cluster nodes (list)
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ClusterRkeConfigNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// Prefix to customize Kubernetes path (string)
        /// </summary>
        [Input("prefixPath")]
        public Input<string>? PrefixPath { get; set; }

        [Input("privateRegistries")]
        private InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs>? _privateRegistries;

        /// <summary>
        /// private registries for docker images (list)
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs> PrivateRegistries
        {
            get => _privateRegistries ?? (_privateRegistries = new InputList<Inputs.ClusterRkeConfigPrivateRegistryGetArgs>());
            set => _privateRegistries = value;
        }

        /// <summary>
        /// Kubernetes cluster services (list maxitems:1)
        /// </summary>
        [Input("services")]
        public Input<Inputs.ClusterRkeConfigServicesGetArgs>? Services { get; set; }

        /// <summary>
        /// Use ssh agent auth. Default `false` (bool)
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        /// <summary>
        /// Cluster level SSH certificate path (string)
        /// </summary>
        [Input("sshCertPath")]
        public Input<string>? SshCertPath { get; set; }

        /// <summary>
        /// Node SSH private key path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// K3S upgrade strategy (List maxitems: 1)
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterRkeConfigUpgradeStrategyGetArgs>? UpgradeStrategy { get; set; }

        /// <summary>
        /// Prefix to customize Kubernetes path for windows (string)
        /// </summary>
        [Input("winPrefixPath")]
        public Input<string>? WinPrefixPath { get; set; }

        public ClusterRkeConfigGetArgs()
        {
        }
    }
}
