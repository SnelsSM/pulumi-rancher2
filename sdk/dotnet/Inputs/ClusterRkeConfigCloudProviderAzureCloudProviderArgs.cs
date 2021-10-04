// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderAzureCloudProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("aadClientCertPassword")]
        public Input<string>? AadClientCertPassword { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("aadClientCertPath")]
        public Input<string>? AadClientCertPath { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("aadClientId", required: true)]
        public Input<string> AadClientId { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("aadClientSecret", required: true)]
        public Input<string> AadClientSecret { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("cloudProviderBackoff")]
        public Input<bool>? CloudProviderBackoff { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderBackoffDuration")]
        public Input<int>? CloudProviderBackoffDuration { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderBackoffExponent")]
        public Input<int>? CloudProviderBackoffExponent { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderBackoffJitter")]
        public Input<int>? CloudProviderBackoffJitter { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderBackoffRetries")]
        public Input<int>? CloudProviderBackoffRetries { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("cloudProviderRateLimit")]
        public Input<bool>? CloudProviderRateLimit { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderRateLimitBucket")]
        public Input<int>? CloudProviderRateLimitBucket { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("cloudProviderRateLimitQps")]
        public Input<int>? CloudProviderRateLimitQps { get; set; }

        /// <summary>
        /// The AKS load balancer sku (string)
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        /// <summary>
        /// Azure Kubernetes cluster location. Default `eastus` (string)
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// (int)
        /// </summary>
        [Input("maximumLoadBalancerRuleCount")]
        public Input<int>? MaximumLoadBalancerRuleCount { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("primaryAvailabilitySetName")]
        public Input<string>? PrimaryAvailabilitySetName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("primaryScaleSetName")]
        public Input<string>? PrimaryScaleSetName { get; set; }

        /// <summary>
        /// The AKS resource group (string)
        /// </summary>
        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("routeTableName")]
        public Input<string>? RouteTableName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("subnetName")]
        public Input<string>? SubnetName { get; set; }

        /// <summary>
        /// Subscription credentials which uniquely identify Microsoft Azure subscription (string)
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        /// <summary>
        /// Azure tenant ID to use (string)
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("useInstanceMetadata")]
        public Input<bool>? UseInstanceMetadata { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("useManagedIdentityExtension")]
        public Input<bool>? UseManagedIdentityExtension { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("vmType")]
        public Input<string>? VmType { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("vnetResourceGroup")]
        public Input<string>? VnetResourceGroup { get; set; }

        public ClusterRkeConfigCloudProviderAzureCloudProviderArgs()
        {
        }
    }
}
