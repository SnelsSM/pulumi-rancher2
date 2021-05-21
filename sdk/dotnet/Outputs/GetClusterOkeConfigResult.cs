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
    public sealed class GetClusterOkeConfigResult
    {
        public readonly string CompartmentId;
        public readonly int? CustomBootVolumeSize;
        /// <summary>
        /// (Computed) The description for Cluster (string)
        /// </summary>
        public readonly string? Description;
        public readonly bool? EnableKubernetesDashboard;
        public readonly bool? EnablePrivateNodes;
        public readonly string Fingerprint;
        public readonly int? FlexOcpus;
        public readonly string KubernetesVersion;
        public readonly int? LimitNodeCount;
        public readonly string? LoadBalancerSubnetName1;
        public readonly string? LoadBalancerSubnetName2;
        public readonly string NodeImage;
        public readonly string? NodePoolDnsDomainName;
        public readonly string? NodePoolSubnetName;
        public readonly string? NodePublicKeyContents;
        public readonly string NodeShape;
        public readonly string? PodCidr;
        public readonly string PrivateKeyContents;
        public readonly string? PrivateKeyPassphrase;
        public readonly int? QuantityOfNodeSubnets;
        public readonly int? QuantityPerSubnet;
        public readonly string Region;
        public readonly string? ServiceCidr;
        public readonly string? ServiceDnsDomainName;
        public readonly bool? SkipVcnDelete;
        public readonly string TenancyId;
        public readonly string UserOcid;
        public readonly string? VcnCompartmentId;
        public readonly string? VcnName;
        public readonly string? WorkerNodeIngressCidr;

        [OutputConstructor]
        private GetClusterOkeConfigResult(
            string compartmentId,

            int? customBootVolumeSize,

            string? description,

            bool? enableKubernetesDashboard,

            bool? enablePrivateNodes,

            string fingerprint,

            int? flexOcpus,

            string kubernetesVersion,

            int? limitNodeCount,

            string? loadBalancerSubnetName1,

            string? loadBalancerSubnetName2,

            string nodeImage,

            string? nodePoolDnsDomainName,

            string? nodePoolSubnetName,

            string? nodePublicKeyContents,

            string nodeShape,

            string? podCidr,

            string privateKeyContents,

            string? privateKeyPassphrase,

            int? quantityOfNodeSubnets,

            int? quantityPerSubnet,

            string region,

            string? serviceCidr,

            string? serviceDnsDomainName,

            bool? skipVcnDelete,

            string tenancyId,

            string userOcid,

            string? vcnCompartmentId,

            string? vcnName,

            string? workerNodeIngressCidr)
        {
            CompartmentId = compartmentId;
            CustomBootVolumeSize = customBootVolumeSize;
            Description = description;
            EnableKubernetesDashboard = enableKubernetesDashboard;
            EnablePrivateNodes = enablePrivateNodes;
            Fingerprint = fingerprint;
            FlexOcpus = flexOcpus;
            KubernetesVersion = kubernetesVersion;
            LimitNodeCount = limitNodeCount;
            LoadBalancerSubnetName1 = loadBalancerSubnetName1;
            LoadBalancerSubnetName2 = loadBalancerSubnetName2;
            NodeImage = nodeImage;
            NodePoolDnsDomainName = nodePoolDnsDomainName;
            NodePoolSubnetName = nodePoolSubnetName;
            NodePublicKeyContents = nodePublicKeyContents;
            NodeShape = nodeShape;
            PodCidr = podCidr;
            PrivateKeyContents = privateKeyContents;
            PrivateKeyPassphrase = privateKeyPassphrase;
            QuantityOfNodeSubnets = quantityOfNodeSubnets;
            QuantityPerSubnet = quantityPerSubnet;
            Region = region;
            ServiceCidr = serviceCidr;
            ServiceDnsDomainName = serviceDnsDomainName;
            SkipVcnDelete = skipVcnDelete;
            TenancyId = tenancyId;
            UserOcid = userOcid;
            VcnCompartmentId = vcnCompartmentId;
            VcnName = vcnName;
            WorkerNodeIngressCidr = workerNodeIngressCidr;
        }
    }
}
