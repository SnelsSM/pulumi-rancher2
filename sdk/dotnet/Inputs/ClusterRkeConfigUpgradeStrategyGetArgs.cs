// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigUpgradeStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE drain nodes. Default: `false` (bool)
        /// </summary>
        [Input("drain")]
        public Input<bool>? Drain { get; set; }

        /// <summary>
        /// RKE drain node input (list Maxitems: 1)
        /// </summary>
        [Input("drainInput")]
        public Input<Inputs.ClusterRkeConfigUpgradeStrategyDrainInputGetArgs>? DrainInput { get; set; }

        /// <summary>
        /// RKE max unavailable controlplane nodes. Default: `1` (string)
        /// </summary>
        [Input("maxUnavailableControlplane")]
        public Input<string>? MaxUnavailableControlplane { get; set; }

        /// <summary>
        /// RKE max unavailable worker nodes. Default: `10%` (string)
        /// </summary>
        [Input("maxUnavailableWorker")]
        public Input<string>? MaxUnavailableWorker { get; set; }

        public ClusterRkeConfigUpgradeStrategyGetArgs()
        {
        }
        public static new ClusterRkeConfigUpgradeStrategyGetArgs Empty => new ClusterRkeConfigUpgradeStrategyGetArgs();
    }
}
