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
    public sealed class GetClusterRkeConfigCloudProviderAzureCloudProviderResult
    {
        public readonly string AadClientCertPassword;
        public readonly string AadClientCertPath;
        public readonly string AadClientId;
        public readonly string AadClientSecret;
        public readonly string Cloud;
        public readonly bool CloudProviderBackoff;
        public readonly int CloudProviderBackoffDuration;
        public readonly int CloudProviderBackoffExponent;
        public readonly int CloudProviderBackoffJitter;
        public readonly int CloudProviderBackoffRetries;
        public readonly bool CloudProviderRateLimit;
        public readonly int CloudProviderRateLimitBucket;
        public readonly int CloudProviderRateLimitQps;
        /// <summary>
        /// Load balancer type (basic | standard). Must be standard for auto-scaling
        /// </summary>
        public readonly string? LoadBalancerSku;
        public readonly string Location;
        public readonly int MaximumLoadBalancerRuleCount;
        public readonly string PrimaryAvailabilitySetName;
        public readonly string PrimaryScaleSetName;
        public readonly string ResourceGroup;
        public readonly string RouteTableName;
        public readonly string SecurityGroupName;
        public readonly string SubnetName;
        public readonly string SubscriptionId;
        public readonly string TenantId;
        public readonly bool UseInstanceMetadata;
        public readonly bool UseManagedIdentityExtension;
        public readonly string VmType;
        public readonly string VnetName;
        public readonly string VnetResourceGroup;

        [OutputConstructor]
        private GetClusterRkeConfigCloudProviderAzureCloudProviderResult(
            string aadClientCertPassword,

            string aadClientCertPath,

            string aadClientId,

            string aadClientSecret,

            string cloud,

            bool cloudProviderBackoff,

            int cloudProviderBackoffDuration,

            int cloudProviderBackoffExponent,

            int cloudProviderBackoffJitter,

            int cloudProviderBackoffRetries,

            bool cloudProviderRateLimit,

            int cloudProviderRateLimitBucket,

            int cloudProviderRateLimitQps,

            string? loadBalancerSku,

            string location,

            int maximumLoadBalancerRuleCount,

            string primaryAvailabilitySetName,

            string primaryScaleSetName,

            string resourceGroup,

            string routeTableName,

            string securityGroupName,

            string subnetName,

            string subscriptionId,

            string tenantId,

            bool useInstanceMetadata,

            bool useManagedIdentityExtension,

            string vmType,

            string vnetName,

            string vnetResourceGroup)
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
