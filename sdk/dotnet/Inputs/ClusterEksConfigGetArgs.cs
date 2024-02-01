// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterEksConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        private Input<string>? _accessKey;

        /// <summary>
        /// The AWS Client ID to use (string)
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// AMI ID to use for the worker nodes instead of the default (string)
        /// </summary>
        [Input("ami")]
        public Input<string>? Ami { get; set; }

        /// <summary>
        /// Associate public ip EKS worker nodes. Default `true` (bool)
        /// </summary>
        [Input("associateWorkerNodePublicIp")]
        public Input<bool>? AssociateWorkerNodePublicIp { get; set; }

        /// <summary>
        /// The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
        /// </summary>
        [Input("desiredNodes")]
        public Input<int>? DesiredNodes { get; set; }

        /// <summary>
        /// Enables EBS encryption of worker nodes
        /// </summary>
        [Input("ebsEncryption")]
        public Input<bool>? EbsEncryption { get; set; }

        /// <summary>
        /// The EKS node group instance type. Default: `t3.medium` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        /// <summary>
        /// The maximum number of worker nodes. Default `3` (int)
        /// </summary>
        [Input("maximumNodes")]
        public Input<int>? MaximumNodes { get; set; }

        /// <summary>
        /// The minimum number of worker nodes. Default `1` (int)
        /// </summary>
        [Input("minimumNodes")]
        public Input<int>? MinimumNodes { get; set; }

        /// <summary>
        /// The volume size for each node. Default `20` (int)
        /// </summary>
        [Input("nodeVolumeSize")]
        public Input<int>? NodeVolumeSize { get; set; }

        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretKey", required: true)]
        private Input<string>? _secretKey;

        /// <summary>
        /// The AWS Client Secret associated with the Client ID (string)
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// List of security groups to use for the cluster (list)
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The AWS service role to use (string)
        /// </summary>
        [Input("serviceRole")]
        public Input<string>? ServiceRole { get; set; }

        [Input("sessionToken")]
        private Input<string>? _sessionToken;

        /// <summary>
        /// A session token to use with the client key and secret if applicable (string)
        /// </summary>
        public Input<string>? SessionToken
        {
            get => _sessionToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sessionToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// The EKS node group subnets (list string)
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        /// <summary>
        /// The EKS node group user data (string)
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The name of the virtual network to use. If it's not specified Rancher will create a new VPC (string)
        /// </summary>
        [Input("virtualNetwork")]
        public Input<string>? VirtualNetwork { get; set; }

        public ClusterEksConfigGetArgs()
        {
        }
        public static new ClusterEksConfigGetArgs Empty => new ClusterEksConfigGetArgs();
    }
}
