// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterOkeConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The OCID of the compartment in which to create resources OKE cluster and related resources (string)
        /// </summary>
        [Input("compartmentId", required: true)]
        public Input<string> CompartmentId { get; set; } = null!;

        /// <summary>
        /// Optional custom boot volume size (GB) for all nodes. If you specify 0, it will apply the default according to the `node_image` specified. Default `0` (int)
        /// </summary>
        [Input("customBootVolumeSize")]
        public Input<int>? CustomBootVolumeSize { get; set; }

        /// <summary>
        /// An optional description of this cluster (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies whether to enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        [Input("enableKubernetesDashboard")]
        public Input<bool>? EnableKubernetesDashboard { get; set; }

        /// <summary>
        /// Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
        /// </summary>
        [Input("enablePrivateNodes")]
        public Input<bool>? EnablePrivateNodes { get; set; }

        /// <summary>
        /// The fingerprint corresponding to the specified user's private API Key (string)
        /// </summary>
        [Input("fingerprint", required: true)]
        public Input<string> Fingerprint { get; set; } = null!;

        /// <summary>
        /// Specifies number of OCPUs for nodes (requires flexible shape specified with `node_shape`) (int)
        /// </summary>
        [Input("flexOcpus")]
        public Input<int>? FlexOcpus { get; set; }

        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        /// <summary>
        /// The maximum number of worker nodes. Can limit `quantity_per_subnet`. Default `0` (no limit) (int)
        /// </summary>
        [Input("limitNodeCount")]
        public Input<int>? LimitNodeCount { get; set; }

        /// <summary>
        /// The name of the first existing subnet to use for Kubernetes services / LB. `vcn_name` is also required when specifying an existing subnet. (string)
        /// </summary>
        [Input("loadBalancerSubnetName1")]
        public Input<string>? LoadBalancerSubnetName1 { get; set; }

        /// <summary>
        /// The name of a second existing subnet to use for Kubernetes services / LB. A second subnet is only required when it is AD-specific (non-regional) (string)
        /// </summary>
        [Input("loadBalancerSubnetName2")]
        public Input<string>? LoadBalancerSubnetName2 { get; set; }

        /// <summary>
        /// The Oracle Linux OS image name to use for the OKE node(s). See [here](https://docs.cloud.oracle.com/en-us/iaas/images/) for a list of images. (string)
        /// </summary>
        [Input("nodeImage", required: true)]
        public Input<string> NodeImage { get; set; } = null!;

        /// <summary>
        /// Name for DNS domain of node pool subnet. Default `nodedns` (string)
        /// </summary>
        [Input("nodePoolDnsDomainName")]
        public Input<string>? NodePoolDnsDomainName { get; set; }

        /// <summary>
        /// Name for node pool subnet. Default `nodedns` (string)
        /// </summary>
        [Input("nodePoolSubnetName")]
        public Input<string>? NodePoolSubnetName { get; set; }

        /// <summary>
        /// The contents of the SSH public key file to use for the nodes (string)
        /// </summary>
        [Input("nodePublicKeyContents")]
        public Input<string>? NodePublicKeyContents { get; set; }

        /// <summary>
        /// The shape of the node (determines number of CPUs and  amount of memory on each OKE node) (string)
        /// </summary>
        [Input("nodeShape", required: true)]
        public Input<string> NodeShape { get; set; } = null!;

        /// <summary>
        /// A CIDR IP range from which to assign Kubernetes Pod IPs (string)
        /// </summary>
        [Input("podCidr")]
        public Input<string>? PodCidr { get; set; }

        /// <summary>
        /// The private API key file contents for the specified user, in PEM format (string)
        /// </summary>
        [Input("privateKeyContents", required: true)]
        public Input<string> PrivateKeyContents { get; set; } = null!;

        /// <summary>
        /// The passphrase (if any) of the private key for the OKE cluster (string)
        /// </summary>
        [Input("privateKeyPassphrase")]
        public Input<string>? PrivateKeyPassphrase { get; set; }

        /// <summary>
        /// Number of node subnets. Default `1` (int)
        /// </summary>
        [Input("quantityOfNodeSubnets")]
        public Input<int>? QuantityOfNodeSubnets { get; set; }

        /// <summary>
        /// Number of OKE worker nodes in each subnet / availability domain. Default `1` (int)
        /// </summary>
        [Input("quantityPerSubnet")]
        public Input<int>? QuantityPerSubnet { get; set; }

        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// A CIDR IP range from which to assign Kubernetes Service IPs (string)
        /// </summary>
        [Input("serviceCidr")]
        public Input<string>? ServiceCidr { get; set; }

        /// <summary>
        /// Name for DNS domain of service subnet. Default `svcdns` (string)
        /// </summary>
        [Input("serviceDnsDomainName")]
        public Input<string>? ServiceDnsDomainName { get; set; }

        /// <summary>
        /// Specifies whether to skip deleting the virtual cloud network (VCN) on destroy. Default `false` (bool)
        /// </summary>
        [Input("skipVcnDelete")]
        public Input<bool>? SkipVcnDelete { get; set; }

        /// <summary>
        /// The OCID of the tenancy in which to create resources (string)
        /// </summary>
        [Input("tenancyId", required: true)]
        public Input<string> TenancyId { get; set; } = null!;

        /// <summary>
        /// The OCID of a user who has access to the tenancy/compartment (string)
        /// </summary>
        [Input("userOcid", required: true)]
        public Input<string> UserOcid { get; set; } = null!;

        /// <summary>
        /// The OCID of the compartment (if different from `compartment_id`) in which to find the pre-existing virtual network set with `vcn_name`. (string)
        /// </summary>
        [Input("vcnCompartmentId")]
        public Input<string>? VcnCompartmentId { get; set; }

        /// <summary>
        /// The name of an existing virtual network to use for the cluster creation. If set, you must also set `load_balancer_subnet_name_1`. A VCN and subnets will be created if none are specified. (string)
        /// </summary>
        [Input("vcnName")]
        public Input<string>? VcnName { get; set; }

        /// <summary>
        /// Additional CIDR from which to allow ingress to worker nodes (string)
        /// </summary>
        [Input("workerNodeIngressCidr")]
        public Input<string>? WorkerNodeIngressCidr { get; set; }

        public ClusterOkeConfigArgs()
        {
        }
    }
}
