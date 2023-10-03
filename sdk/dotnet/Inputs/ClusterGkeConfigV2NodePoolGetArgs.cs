// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2NodePoolGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GKE node pool config autoscaling (List maxitems:1)
        /// </summary>
        [Input("autoscaling")]
        public Input<Inputs.ClusterGkeConfigV2NodePoolAutoscalingGetArgs>? Autoscaling { get; set; }

        /// <summary>
        /// The GKE node pool node config (List maxitems:1)
        /// </summary>
        [Input("config")]
        public Input<Inputs.ClusterGkeConfigV2NodePoolConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// The GKE node pool config initial node count (int)
        /// </summary>
        [Input("initialNodeCount", required: true)]
        public Input<int> InitialNodeCount { get; set; } = null!;

        /// <summary>
        /// The GKE node pool config management (List maxitems:1)
        /// </summary>
        [Input("management")]
        public Input<Inputs.ClusterGkeConfigV2NodePoolManagementGetArgs>? Management { get; set; }

        /// <summary>
        /// The GKE node pool config max pods constraint. Required for create new cluster if `ip_allocation_policy.use_ip_aliases = true` (int)
        /// </summary>
        [Input("maxPodsConstraint")]
        public Input<int>? MaxPodsConstraint { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// rancher-monitoring chart version (string)
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public ClusterGkeConfigV2NodePoolGetArgs()
        {
        }
        public static new ClusterGkeConfigV2NodePoolGetArgs Empty => new ClusterGkeConfigV2NodePoolGetArgs();
    }
}
