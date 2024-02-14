// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterEksConfigV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The EKS cloud_credential id (string)
        /// </summary>
        [Input("cloudCredentialId", required: true)]
        public Input<string> CloudCredentialId { get; set; } = null!;

        /// <summary>
        /// Is GKE cluster imported? Default: `false` (bool)
        /// </summary>
        [Input("imported")]
        public Input<bool>? Imported { get; set; }

        /// <summary>
        /// The AWS kms label ARN to use (string, e.g. arn:aws:kms:&lt;ZONE&gt;:&lt;123456789100&gt;:alias/&lt;NAME&gt;)
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("loggingTypes")]
        private InputList<string>? _loggingTypes;

        /// <summary>
        /// The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
        /// </summary>
        public InputList<string> LoggingTypes
        {
            get => _loggingTypes ?? (_loggingTypes = new InputList<string>());
            set => _loggingTypes = value;
        }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeGroups")]
        private InputList<Inputs.ClusterEksConfigV2NodeGroupArgs>? _nodeGroups;

        /// <summary>
        /// The EKS cluster name to import. Required to create a new cluster (list)
        /// </summary>
        public InputList<Inputs.ClusterEksConfigV2NodeGroupArgs> NodeGroups
        {
            get => _nodeGroups ?? (_nodeGroups = new InputList<Inputs.ClusterEksConfigV2NodeGroupArgs>());
            set => _nodeGroups = value;
        }

        /// <summary>
        /// The EKS cluster has private access (bool)
        /// </summary>
        [Input("privateAccess")]
        public Input<bool>? PrivateAccess { get; set; }

        /// <summary>
        /// The EKS cluster has public access (bool)
        /// </summary>
        [Input("publicAccess")]
        public Input<bool>? PublicAccess { get; set; }

        [Input("publicAccessSources")]
        private InputList<string>? _publicAccessSources;

        /// <summary>
        /// The EKS cluster public access sources (map)
        /// </summary>
        public InputList<string> PublicAccessSources
        {
            get => _publicAccessSources ?? (_publicAccessSources = new InputList<string>());
            set => _publicAccessSources = value;
        }

        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Enable EKS cluster secret encryption (bool)
        /// </summary>
        [Input("secretsEncryption")]
        public Input<bool>? SecretsEncryption { get; set; }

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

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The GKE node config tags (List)
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public ClusterEksConfigV2Args()
        {
        }
        public static new ClusterEksConfigV2Args Empty => new ClusterEksConfigV2Args();
    }
}
