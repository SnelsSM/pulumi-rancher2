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
    public sealed class GetClusterAksConfigV2Result
    {
        /// <summary>
        /// The AKS auth base url
        /// </summary>
        public readonly string? AuthBaseUrl;
        /// <summary>
        /// The AKS authorized ip ranges
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedIpRanges;
        /// <summary>
        /// The AKS base url
        /// </summary>
        public readonly string? BaseUrl;
        /// <summary>
        /// The AKS Cloud Credential ID to use
        /// </summary>
        public readonly string CloudCredentialId;
        /// <summary>
        /// The AKS dns prefix. Required if `import=false`
        /// </summary>
        public readonly string? DnsPrefix;
        /// <summary>
        /// Enable AKS http application routing?
        /// </summary>
        public readonly bool HttpApplicationRouting;
        /// <summary>
        /// Is AKS cluster imported?
        /// </summary>
        public readonly bool? Imported;
        /// <summary>
        /// The kubernetes master version. Required if `import=false`
        /// </summary>
        public readonly string? KubernetesVersion;
        /// <summary>
        /// The AKS linux admin username
        /// </summary>
        public readonly string LinuxAdminUsername;
        /// <summary>
        /// The AKS linux ssh public key
        /// </summary>
        public readonly string LinuxSshPublicKey;
        /// <summary>
        /// The AKS load balancer sku
        /// </summary>
        public readonly string LoadBalancerSku;
        /// <summary>
        /// The AKS log analytics workspace group
        /// </summary>
        public readonly string LogAnalyticsWorkspaceGroup;
        /// <summary>
        /// The AKS log analytics workspace name
        /// </summary>
        public readonly string LogAnalyticsWorkspaceName;
        /// <summary>
        /// Is AKS cluster monitoring enabled?
        /// </summary>
        public readonly bool Monitoring;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The AKS network dns service ip
        /// </summary>
        public readonly string NetworkDnsServiceIp;
        /// <summary>
        /// The AKS network docker bridge cidr
        /// </summary>
        public readonly string NetworkDockerBridgeCidr;
        /// <summary>
        /// The AKS network plugin. Required if `import=false`
        /// </summary>
        public readonly string? NetworkPlugin;
        /// <summary>
        /// The AKS network pod cidr
        /// </summary>
        public readonly string NetworkPodCidr;
        /// <summary>
        /// The AKS network policy
        /// </summary>
        public readonly string NetworkPolicy;
        /// <summary>
        /// The AKS network service cidr
        /// </summary>
        public readonly string NetworkServiceCidr;
        /// <summary>
        /// The AKS node pools to use. Required if `import=false`
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterAksConfigV2NodePoolResult> NodePools;
        /// <summary>
        /// The AKS node resource group name
        /// </summary>
        public readonly string NodeResourceGroup;
        /// <summary>
        /// Is AKS cluster private?
        /// </summary>
        public readonly bool PrivateCluster;
        /// <summary>
        /// The AKS resource group
        /// </summary>
        public readonly string ResourceGroup;
        /// <summary>
        /// The AKS resource location
        /// </summary>
        public readonly string ResourceLocation;
        /// <summary>
        /// The AKS subnet
        /// </summary>
        public readonly string Subnet;
        /// <summary>
        /// The AKS cluster tags
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// The AKS virtual network
        /// </summary>
        public readonly string VirtualNetwork;
        /// <summary>
        /// The AKS virtual network resource group
        /// </summary>
        public readonly string VirtualNetworkResourceGroup;

        [OutputConstructor]
        private GetClusterAksConfigV2Result(
            string? authBaseUrl,

            ImmutableArray<string> authorizedIpRanges,

            string? baseUrl,

            string cloudCredentialId,

            string? dnsPrefix,

            bool httpApplicationRouting,

            bool? imported,

            string? kubernetesVersion,

            string linuxAdminUsername,

            string linuxSshPublicKey,

            string loadBalancerSku,

            string logAnalyticsWorkspaceGroup,

            string logAnalyticsWorkspaceName,

            bool monitoring,

            string name,

            string networkDnsServiceIp,

            string networkDockerBridgeCidr,

            string? networkPlugin,

            string networkPodCidr,

            string networkPolicy,

            string networkServiceCidr,

            ImmutableArray<Outputs.GetClusterAksConfigV2NodePoolResult> nodePools,

            string nodeResourceGroup,

            bool privateCluster,

            string resourceGroup,

            string resourceLocation,

            string subnet,

            ImmutableDictionary<string, object> tags,

            string virtualNetwork,

            string virtualNetworkResourceGroup)
        {
            AuthBaseUrl = authBaseUrl;
            AuthorizedIpRanges = authorizedIpRanges;
            BaseUrl = baseUrl;
            CloudCredentialId = cloudCredentialId;
            DnsPrefix = dnsPrefix;
            HttpApplicationRouting = httpApplicationRouting;
            Imported = imported;
            KubernetesVersion = kubernetesVersion;
            LinuxAdminUsername = linuxAdminUsername;
            LinuxSshPublicKey = linuxSshPublicKey;
            LoadBalancerSku = loadBalancerSku;
            LogAnalyticsWorkspaceGroup = logAnalyticsWorkspaceGroup;
            LogAnalyticsWorkspaceName = logAnalyticsWorkspaceName;
            Monitoring = monitoring;
            Name = name;
            NetworkDnsServiceIp = networkDnsServiceIp;
            NetworkDockerBridgeCidr = networkDockerBridgeCidr;
            NetworkPlugin = networkPlugin;
            NetworkPodCidr = networkPodCidr;
            NetworkPolicy = networkPolicy;
            NetworkServiceCidr = networkServiceCidr;
            NodePools = nodePools;
            NodeResourceGroup = nodeResourceGroup;
            PrivateCluster = privateCluster;
            ResourceGroup = resourceGroup;
            ResourceLocation = resourceLocation;
            Subnet = subnet;
            Tags = tags;
            VirtualNetwork = virtualNetwork;
            VirtualNetworkResourceGroup = virtualNetworkResourceGroup;
        }
    }
}
