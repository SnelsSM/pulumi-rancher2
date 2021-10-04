// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigUpgradeStrategyGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// How many controlplane nodes should be upgrade at time, 0 is infinite. Percentages are also accepted (string)
        /// </summary>
        [Input("controlPlaneConcurrency")]
        public Input<string>? ControlPlaneConcurrency { get; set; }

        /// <summary>
        /// Controlplane nodes drain options (list maxitems:1)
        /// </summary>
        [Input("controlPlaneDrainOptions")]
        public Input<Inputs.ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptionsGetArgs>? ControlPlaneDrainOptions { get; set; }

        /// <summary>
        /// How many worker nodes should be upgrade at time. Percentages are also accepted (string)
        /// </summary>
        [Input("workerConcurrency")]
        public Input<string>? WorkerConcurrency { get; set; }

        /// <summary>
        /// Worker nodes drain options (list maxitems:1)
        /// </summary>
        [Input("workerDrainOptions")]
        public Input<Inputs.ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptionsGetArgs>? WorkerDrainOptions { get; set; }

        public ClusterV2RkeConfigUpgradeStrategyGetArgs()
        {
        }
    }
}
