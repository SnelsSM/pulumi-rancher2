// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigUpgradeStrategyDrainInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Delete RKE node local data. Default: `false` (bool)
        /// </summary>
        [Input("deleteLocalData")]
        public Input<bool>? DeleteLocalData { get; set; }

        /// <summary>
        /// Force RKE node drain. Default: `false` (bool)
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// RKE node drain grace period. Default: `-1` (int)
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// Ignore RKE daemon sets. Default: `true` (bool)
        /// </summary>
        [Input("ignoreDaemonSets")]
        public Input<bool>? IgnoreDaemonSets { get; set; }

        /// <summary>
        /// Timeout in seconds for etcd backup. Default: `300`. Just for Rancher v2.5.6 and above (int)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterRkeConfigUpgradeStrategyDrainInputArgs()
        {
        }
        public static new ClusterRkeConfigUpgradeStrategyDrainInputArgs Empty => new ClusterRkeConfigUpgradeStrategyDrainInputArgs();
    }
}
