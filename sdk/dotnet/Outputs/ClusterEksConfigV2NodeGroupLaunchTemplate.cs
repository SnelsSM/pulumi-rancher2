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
    public sealed class ClusterEksConfigV2NodeGroupLaunchTemplate
    {
        /// <summary>
        /// The EKS node group launch template ID (string)
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// rancher-monitoring chart version (string)
        /// </summary>
        public readonly int? Version;

        [OutputConstructor]
        private ClusterEksConfigV2NodeGroupLaunchTemplate(
            string id,

            string? name,

            int? version)
        {
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
