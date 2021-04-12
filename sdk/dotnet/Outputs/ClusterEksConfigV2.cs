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
    public sealed class ClusterEksConfigV2
    {
        /// <summary>
        /// The EKS cloud_credential id (string)
        /// </summary>
        public readonly string CloudCredentialId;
        /// <summary>
        /// Set to `true` to import EKS cluster. Default: `false` (bool)
        /// </summary>
        public readonly bool? Imported;
        /// <summary>
        /// The AWS kms key to use (string)
        /// </summary>
        public readonly string? KmsKey;
        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        public readonly string? KubernetesVersion;
        /// <summary>
        /// The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
        /// </summary>
        public readonly ImmutableArray<string> LoggingTypes;
        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The EKS cluster name to import. Required to create a new cluster (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterEksConfigV2NodeGroup> NodeGroups;
        /// <summary>
        /// The EKS cluster has private access. Default: `false` (bool)
        /// </summary>
        public readonly bool? PrivateAccess;
        /// <summary>
        /// The EKS cluster has public access. Default: `true` (bool)
        /// </summary>
        public readonly bool? PublicAccess;
        /// <summary>
        /// The EKS cluster public access sources (map)
        /// </summary>
        public readonly ImmutableArray<string> PublicAccessSources;
        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Enable EKS cluster secret encryption. Default: `false` (bool)
        /// </summary>
        public readonly bool? SecretsEncryption;
        /// <summary>
        /// List of security groups to use for the cluster (list)
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// The AWS service role to use (string)
        /// </summary>
        public readonly string? ServiceRole;
        /// <summary>
        /// The EKS node group subnets (list string)
        /// </summary>
        public readonly ImmutableArray<string> Subnets;
        /// <summary>
        /// The EKS cluster tags (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private ClusterEksConfigV2(
            string cloudCredentialId,

            bool? imported,

            string? kmsKey,

            string? kubernetesVersion,

            ImmutableArray<string> loggingTypes,

            string? name,

            ImmutableArray<Outputs.ClusterEksConfigV2NodeGroup> nodeGroups,

            bool? privateAccess,

            bool? publicAccess,

            ImmutableArray<string> publicAccessSources,

            string? region,

            bool? secretsEncryption,

            ImmutableArray<string> securityGroups,

            string? serviceRole,

            ImmutableArray<string> subnets,

            ImmutableDictionary<string, object>? tags)
        {
            CloudCredentialId = cloudCredentialId;
            Imported = imported;
            KmsKey = kmsKey;
            KubernetesVersion = kubernetesVersion;
            LoggingTypes = loggingTypes;
            Name = name;
            NodeGroups = nodeGroups;
            PrivateAccess = privateAccess;
            PublicAccess = publicAccess;
            PublicAccessSources = publicAccessSources;
            Region = region;
            SecretsEncryption = secretsEncryption;
            SecurityGroups = securityGroups;
            ServiceRole = serviceRole;
            Subnets = subnets;
            Tags = tags;
        }
    }
}
