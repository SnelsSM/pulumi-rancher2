// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterEksConfigV2NodeGroupLaunchTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The EKS node group launch template ID (string)
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// RKE2 kubernetes version (string)
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ClusterEksConfigV2NodeGroupLaunchTemplateArgs()
        {
        }
        public static new ClusterEksConfigV2NodeGroupLaunchTemplateArgs Empty => new ClusterEksConfigV2NodeGroupLaunchTemplateArgs();
    }
}
