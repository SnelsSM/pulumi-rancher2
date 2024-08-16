// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterEksConfigV2GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Cloud Credential ID to use
        /// </summary>
        [Input("cloudCredentialId", required: true)]
        public Input<string> CloudCredentialId { get; set; } = null!;

        /// <summary>
        /// Is EKS cluster imported?
        /// </summary>
        [Input("imported")]
        public Input<bool>? Imported { get; set; }

        /// <summary>
        /// The AWS kms key to use
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// The kubernetes master version
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("loggingTypes")]
        private InputList<string>? _loggingTypes;

        /// <summary>
        /// The AWS logging types
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
        private InputList<Inputs.ClusterEksConfigV2NodeGroupGetArgs>? _nodeGroups;

        /// <summary>
        /// The AWS node groups to use
        /// </summary>
        public InputList<Inputs.ClusterEksConfigV2NodeGroupGetArgs> NodeGroups
        {
            get => _nodeGroups ?? (_nodeGroups = new InputList<Inputs.ClusterEksConfigV2NodeGroupGetArgs>());
            set => _nodeGroups = value;
        }

        /// <summary>
        /// The EKS cluster has private access
        /// </summary>
        [Input("privateAccess")]
        public Input<bool>? PrivateAccess { get; set; }

        /// <summary>
        /// The EKS cluster has public access
        /// </summary>
        [Input("publicAccess")]
        public Input<bool>? PublicAccess { get; set; }

        [Input("publicAccessSources")]
        private InputList<string>? _publicAccessSources;

        /// <summary>
        /// The EKS cluster public access sources
        /// </summary>
        public InputList<string> PublicAccessSources
        {
            get => _publicAccessSources ?? (_publicAccessSources = new InputList<string>());
            set => _publicAccessSources = value;
        }

        /// <summary>
        /// The AWS Region to create the EKS cluster in
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Enable EKS cluster secret encryption
        /// </summary>
        [Input("secretsEncryption")]
        public Input<bool>? SecretsEncryption { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// List of security groups to use for the cluster
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The AWS service role to use
        /// </summary>
        [Input("serviceRole")]
        public Input<string>? ServiceRole { get; set; }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// List of subnets in the virtual network to use
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The EKS cluster tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ClusterEksConfigV2GetArgs()
        {
        }
        public static new ClusterEksConfigV2GetArgs Empty => new ClusterEksConfigV2GetArgs();
    }
}
