// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterRkeConfig
    {
        /// <summary>
        /// Duration in seconds of addon job (int)
        /// </summary>
        public readonly int? AddonJobTimeout;
        /// <summary>
        /// Addons descripton to deploy on RKE cluster.
        /// </summary>
        public readonly string? Addons;
        /// <summary>
        /// Addons yaml manifests to deploy on RKE cluster (list)
        /// </summary>
        public readonly ImmutableArray<string> AddonsIncludes;
        /// <summary>
        /// Kubernetes cluster authentication (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigAuthentication? Authentication;
        /// <summary>
        /// Kubernetes cluster authorization (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigAuthorization? Authorization;
        /// <summary>
        /// RKE bastion host (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigBastionHost? BastionHost;
        /// <summary>
        /// RKE cloud provider [rke-cloud-providers](https://rancher.com/docs/rke/v0.1.x/en/config-options/cloud-providers/) (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigCloudProvider? CloudProvider;
        /// <summary>
        /// RKE dns add-on. For Rancher v2.2.x (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigDns? Dns;
        /// <summary>
        /// Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
        /// </summary>
        public readonly bool? EnableCriDockerd;
        /// <summary>
        /// Ignore docker version. Default `true` (bool)
        /// </summary>
        public readonly bool? IgnoreDockerVersion;
        /// <summary>
        /// Kubernetes ingress configuration (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigIngress? Ingress;
        /// <summary>
        /// K8s version to deploy. Default: `Rancher default` (string) (Note - if rke_config is set at cluster_template, kubernetes_version must be set to the active cluster version so Rancher can clone the RKE template)
        /// </summary>
        public readonly string? KubernetesVersion;
        /// <summary>
        /// Kubernetes cluster monitoring (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigMonitoring? Monitoring;
        /// <summary>
        /// Kubernetes cluster networking (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetwork? Network;
        /// <summary>
        /// RKE cluster nodes (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterRkeConfigNode> Nodes;
        /// <summary>
        /// Prefix to customize Kubernetes path (string)
        /// </summary>
        public readonly string? PrefixPath;
        /// <summary>
        /// private registries for docker images (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterRkeConfigPrivateRegistry> PrivateRegistries;
        /// <summary>
        /// Kubernetes cluster services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServices? Services;
        /// <summary>
        /// Use ssh agent auth. Default `false`
        /// </summary>
        public readonly bool? SshAgentAuth;
        /// <summary>
        /// Cluster level SSH certificate path (string)
        /// </summary>
        public readonly string? SshCertPath;
        /// <summary>
        /// Cluster level SSH private key path (string)
        /// </summary>
        public readonly string? SshKeyPath;
        /// <summary>
        /// RKE upgrade strategy (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigUpgradeStrategy? UpgradeStrategy;
        /// <summary>
        /// Prefix to customize Kubernetes path for windows (string)
        /// </summary>
        public readonly string? WinPrefixPath;

        [OutputConstructor]
        private ClusterRkeConfig(
            int? addonJobTimeout,

            string? addons,

            ImmutableArray<string> addonsIncludes,

            Outputs.ClusterRkeConfigAuthentication? authentication,

            Outputs.ClusterRkeConfigAuthorization? authorization,

            Outputs.ClusterRkeConfigBastionHost? bastionHost,

            Outputs.ClusterRkeConfigCloudProvider? cloudProvider,

            Outputs.ClusterRkeConfigDns? dns,

            bool? enableCriDockerd,

            bool? ignoreDockerVersion,

            Outputs.ClusterRkeConfigIngress? ingress,

            string? kubernetesVersion,

            Outputs.ClusterRkeConfigMonitoring? monitoring,

            Outputs.ClusterRkeConfigNetwork? network,

            ImmutableArray<Outputs.ClusterRkeConfigNode> nodes,

            string? prefixPath,

            ImmutableArray<Outputs.ClusterRkeConfigPrivateRegistry> privateRegistries,

            Outputs.ClusterRkeConfigServices? services,

            bool? sshAgentAuth,

            string? sshCertPath,

            string? sshKeyPath,

            Outputs.ClusterRkeConfigUpgradeStrategy? upgradeStrategy,

            string? winPrefixPath)
        {
            AddonJobTimeout = addonJobTimeout;
            Addons = addons;
            AddonsIncludes = addonsIncludes;
            Authentication = authentication;
            Authorization = authorization;
            BastionHost = bastionHost;
            CloudProvider = cloudProvider;
            Dns = dns;
            EnableCriDockerd = enableCriDockerd;
            IgnoreDockerVersion = ignoreDockerVersion;
            Ingress = ingress;
            KubernetesVersion = kubernetesVersion;
            Monitoring = monitoring;
            Network = network;
            Nodes = nodes;
            PrefixPath = prefixPath;
            PrivateRegistries = privateRegistries;
            Services = services;
            SshAgentAuth = sshAgentAuth;
            SshCertPath = sshCertPath;
            SshKeyPath = sshKeyPath;
            UpgradeStrategy = upgradeStrategy;
            WinPrefixPath = winPrefixPath;
        }
    }
}
