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
    public sealed class GetClusterGkeConfigV2NodePoolAutoscalingResult
    {
        /// <summary>
        /// Enable GKE node pool config autoscaling
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The GKE node pool config max node count
        /// </summary>
        public readonly int MaxNodeCount;
        /// <summary>
        /// The GKE node pool config min node count
        /// </summary>
        public readonly int MinNodeCount;

        [OutputConstructor]
        private GetClusterGkeConfigV2NodePoolAutoscalingResult(
            bool? enabled,

            int maxNodeCount,

            int minNodeCount)
        {
            Enabled = enabled;
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
        }
    }
}
