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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigResult
    {
        /// <summary>
        /// Optional duration in seconds of addon job.
        /// </summary>
        public readonly int AddonJobTimeout;
        /// <summary>
        /// Optional addons descripton to deploy on rke cluster.
        /// </summary>
        public readonly string? Addons;
        /// <summary>
        /// Optional addons yaml manisfest to deploy on rke cluster.
        /// </summary>
        public readonly ImmutableArray<string> AddonsIncludes;
        /// <summary>
        /// Kubernetes cluster authentication
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationResult Authentication;
        /// <summary>
        /// Kubernetes cluster authorization
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationResult Authorization;
        /// <summary>
        /// RKE bastion host
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostResult BastionHost;
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderResult CloudProvider;
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsResult Dns;
        /// <summary>
        /// Enable/disable using cri-dockerd
        /// </summary>
        public readonly bool? EnableCriDockerd;
        /// <summary>
        /// Optional ignore docker version on nodes
        /// </summary>
        public readonly bool? IgnoreDockerVersion;
        /// <summary>
        /// Kubernetes ingress configuration
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressResult Ingress;
        /// <summary>
        /// Optional kubernetes version to deploy
        /// </summary>
        public readonly string KubernetesVersion;
        /// <summary>
        /// Kubernetes cluster monitoring
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringResult Monitoring;
        /// <summary>
        /// Kubernetes cluster networking
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkResult Network;
        /// <summary>
        /// Optional RKE cluster nodes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeResult> Nodes;
        /// <summary>
        /// Optional prefix to customize kubernetes path
        /// </summary>
        public readonly string PrefixPath;
        /// <summary>
        /// Optional private registries for docker images
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryResult> PrivateRegistries;
        /// <summary>
        /// Kubernetes cluster services
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesResult Services;
        /// <summary>
        /// Optional use ssh agent auth
        /// </summary>
        public readonly bool? SshAgentAuth;
        /// <summary>
        /// Optional cluster level SSH certificate path
        /// </summary>
        public readonly string SshCertPath;
        /// <summary>
        /// Optional cluster level SSH private key path
        /// </summary>
        public readonly string SshKeyPath;
        /// <summary>
        /// RKE upgrade strategy
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyResult UpgradeStrategy;
        /// <summary>
        /// Optional prefix to customize kubernetes path for windows nodes
        /// </summary>
        public readonly string WinPrefixPath;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigResult(
            int addonJobTimeout,

            string? addons,

            ImmutableArray<string> addonsIncludes,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationResult authentication,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationResult authorization,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostResult bastionHost,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderResult cloudProvider,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsResult dns,

            bool? enableCriDockerd,

            bool? ignoreDockerVersion,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressResult ingress,

            string kubernetesVersion,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringResult monitoring,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkResult network,

            ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeResult> nodes,

            string prefixPath,

            ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryResult> privateRegistries,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesResult services,

            bool? sshAgentAuth,

            string sshCertPath,

            string sshKeyPath,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyResult upgradeStrategy,

            string winPrefixPath)
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
