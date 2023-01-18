// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Drain options delete empty dir data. Default `false` (bool)
        /// </summary>
        [Input("deleteEmptyDirData")]
        public Input<bool>? DeleteEmptyDirData { get; set; }

        /// <summary>
        /// Drain options disable eviction. Default `false` (bool)
        /// </summary>
        [Input("disableEviction")]
        public Input<bool>? DisableEviction { get; set; }

        /// <summary>
        /// Enable the authorized cluster endpoint. Default `false` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Drain options force. Default `false` (bool)
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// Drain options grace period (int)
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// Drain options ignore daemon sets. Default `true` (bool)
        /// </summary>
        [Input("ignoreDaemonSets")]
        public Input<bool>? IgnoreDaemonSets { get; set; }

        /// <summary>
        /// Drain options ignore errors. Default `false` (bool)
        /// </summary>
        [Input("ignoreErrors")]
        public Input<bool>? IgnoreErrors { get; set; }

        /// <summary>
        /// Drain options skip wait for delete timeout seconds (int)
        /// </summary>
        [Input("skipWaitForDeleteTimeoutSeconds")]
        public Input<int>? SkipWaitForDeleteTimeoutSeconds { get; set; }

        /// <summary>
        /// Drain options timeout (int)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptionsGetArgs()
        {
        }
        public static new ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptionsGetArgs Empty => new ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptionsGetArgs();
    }
}
