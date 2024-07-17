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
    public sealed class ClusterRkeConfigCloudProviderAzureCloudProvider
    {
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? AadClientCertPassword;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? AadClientCertPath;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string AadClientId;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string AadClientSecret;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Cloud;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? CloudProviderBackoff;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderBackoffDuration;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderBackoffExponent;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderBackoffJitter;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderBackoffRetries;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? CloudProviderRateLimit;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderRateLimitBucket;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? CloudProviderRateLimitQps;
        /// <summary>
        /// Load balancer type (basic | standard). Must be standard for auto-scaling
        /// </summary>
        public readonly string? LoadBalancerSku;
        /// <summary>
        /// Azure Kubernetes cluster location. Default `eastus` (string)
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int? MaximumLoadBalancerRuleCount;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? PrimaryAvailabilitySetName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? PrimaryScaleSetName;
        /// <summary>
        /// The AKS resource group (string)
        /// </summary>
        public readonly string? ResourceGroup;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? RouteTableName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SecurityGroupName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SubnetName;
        /// <summary>
        /// Subscription credentials which uniquely identify Microsoft Azure subscription (string)
        /// </summary>
        public readonly string SubscriptionId;
        /// <summary>
        /// Azure tenant ID to use (string)
        /// </summary>
        public readonly string TenantId;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? UseInstanceMetadata;
        /// <summary>
        /// (bool)
        /// </summary>
        public readonly bool? UseManagedIdentityExtension;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? VmType;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? VnetName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? VnetResourceGroup;

        [OutputConstructor]
        private ClusterRkeConfigCloudProviderAzureCloudProvider(
            string? aadClientCertPassword,

            string? aadClientCertPath,

            string aadClientId,

            string aadClientSecret,

            string? cloud,

            bool? cloudProviderBackoff,

            int? cloudProviderBackoffDuration,

            int? cloudProviderBackoffExponent,

            int? cloudProviderBackoffJitter,

            int? cloudProviderBackoffRetries,

            bool? cloudProviderRateLimit,

            int? cloudProviderRateLimitBucket,

            int? cloudProviderRateLimitQps,

            string? loadBalancerSku,

            string? location,

            int? maximumLoadBalancerRuleCount,

            string? primaryAvailabilitySetName,

            string? primaryScaleSetName,

            string? resourceGroup,

            string? routeTableName,

            string? securityGroupName,

            string? subnetName,

            string subscriptionId,

            string tenantId,

            bool? useInstanceMetadata,

            bool? useManagedIdentityExtension,

            string? vmType,

            string? vnetName,

            string? vnetResourceGroup)
        {
            AadClientCertPassword = aadClientCertPassword;
            AadClientCertPath = aadClientCertPath;
            AadClientId = aadClientId;
            AadClientSecret = aadClientSecret;
            Cloud = cloud;
            CloudProviderBackoff = cloudProviderBackoff;
            CloudProviderBackoffDuration = cloudProviderBackoffDuration;
            CloudProviderBackoffExponent = cloudProviderBackoffExponent;
            CloudProviderBackoffJitter = cloudProviderBackoffJitter;
            CloudProviderBackoffRetries = cloudProviderBackoffRetries;
            CloudProviderRateLimit = cloudProviderRateLimit;
            CloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            CloudProviderRateLimitQps = cloudProviderRateLimitQps;
            LoadBalancerSku = loadBalancerSku;
            Location = location;
            MaximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            PrimaryAvailabilitySetName = primaryAvailabilitySetName;
            PrimaryScaleSetName = primaryScaleSetName;
            ResourceGroup = resourceGroup;
            RouteTableName = routeTableName;
            SecurityGroupName = securityGroupName;
            SubnetName = subnetName;
            SubscriptionId = subscriptionId;
            TenantId = tenantId;
            UseInstanceMetadata = useInstanceMetadata;
            UseManagedIdentityExtension = useManagedIdentityExtension;
            VmType = vmType;
            VnetName = vnetName;
            VnetResourceGroup = vnetResourceGroup;
        }
    }
}
