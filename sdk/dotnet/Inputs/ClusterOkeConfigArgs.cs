// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterOkeConfigArgs : global::Pulumi.ResourceArgs
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
        /// The description for Cluster (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        [Input("enableKubernetesDashboard")]
        public Input<bool>? EnableKubernetesDashboard { get; set; }

        /// <summary>
        /// Specifies whether Kubernetes API endpoint is a private IP only accessible from within the VCN. Default `false` for Rancher v2.5.10 and above (bool)
        /// </summary>
        [Input("enablePrivateControlPlane")]
        public Input<bool>? EnablePrivateControlPlane { get; set; }

        /// <summary>
        /// Whether nodes have internal IP address only. Default `false` (bool)
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

        [Input("kmsKeyId")]
        private Input<string>? _kmsKeyId;

        /// <summary>
        /// The OCID of a KMS vault master key used to encrypt secrets at rest. See [here](https://docs.oracle.com/en-us/iaas/Content/ContEng/Tasks/contengencryptingdata.htm) for help creating a vault and master encryption key. For Rancher v2.5.9 and above (string)
        /// </summary>
        public Input<string>? KmsKeyId
        {
            get => _kmsKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _kmsKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// K8s version to deploy. Default: `Rancher default` (string) (Note - if rke_config is set at cluster_template, kubernetes_version must be set to the active cluster version so Rancher can clone the RKE template)
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
        /// A CIDR notation IP range from which to assign Kubernetes Pod IPs when \"network plugin\" is specified in \"kubenet\". Default `172.244.0.0/16` (string)
        /// </summary>
        [Input("podCidr")]
        public Input<string>? PodCidr { get; set; }

        [Input("privateKeyContents", required: true)]
        private Input<string>? _privateKeyContents;

        /// <summary>
        /// The private API key file contents for the specified user, in PEM format (string)
        /// </summary>
        public Input<string>? PrivateKeyContents
        {
            get => _privateKeyContents;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyContents = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyPassphrase")]
        private Input<string>? _privateKeyPassphrase;

        /// <summary>
        /// The passphrase (if any) of the private key for the OKE cluster (string)
        /// </summary>
        public Input<string>? PrivateKeyPassphrase
        {
            get => _privateKeyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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
        /// (string)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// A CIDR notation IP range from which to assign Kubernetes Service cluster IPs. It must not overlap with any Subnet IP ranges. Default `10.0.0.0/16` (string)
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
        public static new ClusterOkeConfigArgs Empty => new ClusterOkeConfigArgs();
    }
}
