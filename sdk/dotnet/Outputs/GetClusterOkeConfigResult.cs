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
        /// <summary>
        /// The OCID of the compartment in which to create resources (VCN, worker nodes, etc.)
        /// </summary>
        public readonly string CompartmentId;
        /// <summary>
        /// An optional custom boot volume size (in GB) for the nodes
        /// </summary>
        public readonly int? CustomBootVolumeSize;
        /// <summary>
        /// (Computed) The description for Cluster (string)
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Enable the kubernetes dashboard
        /// </summary>
        public readonly bool? EnableKubernetesDashboard;
        /// <summary>
        /// Whether Kubernetes API endpoint is a private IP only accessible from within the VCN
        /// </summary>
        public readonly bool? EnablePrivateControlPlane;
        /// <summary>
        /// Whether worker nodes are deployed into a new private subnet
        /// </summary>
        public readonly bool? EnablePrivateNodes;
        /// <summary>
        /// The fingerprint corresponding to the specified user's private API Key
        /// </summary>
        public readonly string Fingerprint;
        /// <summary>
        /// Optional number of OCPUs for nodes (requires flexible node_shape)
        /// </summary>
        public readonly int? FlexOcpus;
        /// <summary>
        /// Optional specify the OCID of the KMS Vault master key
        /// </summary>
        public readonly string? KmsKeyId;
        /// <summary>
        /// The Kubernetes version that will be used for your master *and* worker nodes e.g. v1.19.7
        /// </summary>
        public readonly string KubernetesVersion;
        /// <summary>
        /// Optional limit on the total number of nodes in the pool
        /// </summary>
        public readonly int? LimitNodeCount;
        /// <summary>
        /// The name of the first existing subnet to use for Kubernetes services / LB
        /// </summary>
        public readonly string? LoadBalancerSubnetName1;
        /// <summary>
        /// The (optional) name of a second existing subnet to use for Kubernetes services / LB
        /// </summary>
        public readonly string? LoadBalancerSubnetName2;
        /// <summary>
        /// The OS for the node image
        /// </summary>
        public readonly string NodeImage;
        /// <summary>
        /// Optional name for DNS domain of node pool subnet
        /// </summary>
        public readonly string? NodePoolDnsDomainName;
        /// <summary>
        /// Optional name for node pool subnet
        /// </summary>
        public readonly string? NodePoolSubnetName;
        /// <summary>
        /// The contents of the SSH public key file to use for the nodes
        /// </summary>
        public readonly string? NodePublicKeyContents;
        /// <summary>
        /// The shape of the node (determines number of CPUs and  amount of memory on each node)
        /// </summary>
        public readonly string NodeShape;
        /// <summary>
        /// Optional specify the pod CIDR, defaults to 10.244.0.0/16
        /// </summary>
        public readonly string? PodCidr;
        /// <summary>
        /// The private API key file contents for the specified user, in PEM format
        /// </summary>
        public readonly string PrivateKeyContents;
        /// <summary>
        /// The passphrase of the private key for the OKE cluster
        /// </summary>
        public readonly string? PrivateKeyPassphrase;
        /// <summary>
        /// Number of node subnets (defaults to creating 1 regional subnet)
        /// </summary>
        public readonly int? QuantityOfNodeSubnets;
        /// <summary>
        /// Number of worker nodes in each subnet / availability domain
        /// </summary>
        public readonly int? QuantityPerSubnet;
        /// <summary>
        /// The availability domain within the region to host the OKE cluster
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Optional specify the service CIDR, defaults to 10.96.0.0/16
        /// </summary>
        public readonly string? ServiceCidr;
        /// <summary>
        /// Optional name for DNS domain of service subnet
        /// </summary>
        public readonly string? ServiceDnsDomainName;
        /// <summary>
        /// Whether to skip deleting VCN
        /// </summary>
        public readonly bool? SkipVcnDelete;
        /// <summary>
        /// The OCID of the tenancy in which to create resources
        /// </summary>
        public readonly string TenancyId;
        /// <summary>
        /// The OCID of a user who has access to the tenancy/compartment
        /// </summary>
        public readonly string UserOcid;
        /// <summary>
        /// The OCID of the compartment (if different from compartment_id) in which to find the pre-existing virtual network set with vcn_name.
        /// </summary>
        public readonly string? VcnCompartmentId;
        /// <summary>
        /// The optional name of an existing virtual network to use for the cluster creation. A new VCN will be created if not specified.
        /// </summary>
        public readonly string? VcnName;
        /// <summary>
        /// Additional CIDR from which to allow ingress to worker nodes
        /// </summary>
        public readonly string? WorkerNodeIngressCidr;

        [OutputConstructor]
        private GetClusterOkeConfigResult(
            string compartmentId,

            int? customBootVolumeSize,

            string? description,

            bool? enableKubernetesDashboard,

            bool? enablePrivateControlPlane,

            bool? enablePrivateNodes,

            string fingerprint,

            int? flexOcpus,

            string? kmsKeyId,

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
            EnablePrivateControlPlane = enablePrivateControlPlane;
            EnablePrivateNodes = enablePrivateNodes;
            Fingerprint = fingerprint;
            FlexOcpus = flexOcpus;
            KmsKeyId = kmsKeyId;
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
