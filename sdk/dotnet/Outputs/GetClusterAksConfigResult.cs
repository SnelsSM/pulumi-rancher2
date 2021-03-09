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
    public sealed class GetClusterAksConfigResult
    {
        public readonly string? AadServerAppSecret;
        public readonly string? AadTenantId;
        public readonly string? AddClientAppId;
        public readonly string? AddServerAppId;
        public readonly string? AdminUsername;
        public readonly string AgentDnsPrefix;
        public readonly int? AgentOsDiskSize;
        public readonly string? AgentPoolName;
        public readonly string? AgentStorageProfile;
        public readonly string? AgentVmSize;
        public readonly string? AuthBaseUrl;
        public readonly string? BaseUrl;
        public readonly string ClientId;
        public readonly string ClientSecret;
        public readonly int? Count;
        public readonly string? DnsServiceIp;
        public readonly string? DockerBridgeCidr;
        public readonly bool? EnableHttpApplicationRouting;
        public readonly bool? EnableMonitoring;
        public readonly string KubernetesVersion;
        public readonly string LoadBalancerSku;
        public readonly string? Location;
        public readonly string? LogAnalyticsWorkspace;
        public readonly string? LogAnalyticsWorkspaceResourceGroup;
        public readonly string MasterDnsPrefix;
        public readonly int? MaxPods;
        public readonly string? NetworkPlugin;
        public readonly string? NetworkPolicy;
        public readonly string? PodCidr;
        public readonly string ResourceGroup;
        public readonly string? ServiceCidr;
        public readonly string SshPublicKeyContents;
        public readonly string Subnet;
        public readonly string SubscriptionId;
        public readonly ImmutableDictionary<string, object> Tag;
        public readonly string TenantId;
        public readonly string VirtualNetwork;
        public readonly string VirtualNetworkResourceGroup;

        [OutputConstructor]
        private GetClusterAksConfigResult(
            string? aadServerAppSecret,

            string? aadTenantId,

            string? addClientAppId,

            string? addServerAppId,

            string? adminUsername,

            string agentDnsPrefix,

            int? agentOsDiskSize,

            string? agentPoolName,

            string? agentStorageProfile,

            string? agentVmSize,

            string? authBaseUrl,

            string? baseUrl,

            string clientId,

            string clientSecret,

            int? count,

            string? dnsServiceIp,

            string? dockerBridgeCidr,

            bool? enableHttpApplicationRouting,

            bool? enableMonitoring,

            string kubernetesVersion,

            string loadBalancerSku,

            string? location,

            string? logAnalyticsWorkspace,

            string? logAnalyticsWorkspaceResourceGroup,

            string masterDnsPrefix,

            int? maxPods,

            string? networkPlugin,

            string? networkPolicy,

            string? podCidr,

            string resourceGroup,

            string? serviceCidr,

            string sshPublicKeyContents,

            string subnet,

            string subscriptionId,

            ImmutableDictionary<string, object> tag,

            string tenantId,

            string virtualNetwork,

            string virtualNetworkResourceGroup)
        {
            AadServerAppSecret = aadServerAppSecret;
            AadTenantId = aadTenantId;
            AddClientAppId = addClientAppId;
            AddServerAppId = addServerAppId;
            AdminUsername = adminUsername;
            AgentDnsPrefix = agentDnsPrefix;
            AgentOsDiskSize = agentOsDiskSize;
            AgentPoolName = agentPoolName;
            AgentStorageProfile = agentStorageProfile;
            AgentVmSize = agentVmSize;
            AuthBaseUrl = authBaseUrl;
            BaseUrl = baseUrl;
            ClientId = clientId;
            ClientSecret = clientSecret;
            Count = count;
            DnsServiceIp = dnsServiceIp;
            DockerBridgeCidr = dockerBridgeCidr;
            EnableHttpApplicationRouting = enableHttpApplicationRouting;
            EnableMonitoring = enableMonitoring;
            KubernetesVersion = kubernetesVersion;
            LoadBalancerSku = loadBalancerSku;
            Location = location;
            LogAnalyticsWorkspace = logAnalyticsWorkspace;
            LogAnalyticsWorkspaceResourceGroup = logAnalyticsWorkspaceResourceGroup;
            MasterDnsPrefix = masterDnsPrefix;
            MaxPods = maxPods;
            NetworkPlugin = networkPlugin;
            NetworkPolicy = networkPolicy;
            PodCidr = podCidr;
            ResourceGroup = resourceGroup;
            ServiceCidr = serviceCidr;
            SshPublicKeyContents = sshPublicKeyContents;
            Subnet = subnet;
            SubscriptionId = subscriptionId;
            Tag = tag;
            TenantId = tenantId;
            VirtualNetwork = virtualNetwork;
            VirtualNetworkResourceGroup = virtualNetworkResourceGroup;
        }
    }
}
