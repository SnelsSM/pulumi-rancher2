// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class MultiClusterAppUpgradeStrategyRollingUpdateGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rolling update batch size. Default `1` (int)
        /// </summary>
        [Input("batchSize")]
        public Input<int>? BatchSize { get; set; }

        /// <summary>
        /// Rolling update interval. Default `1` (int)
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        public MultiClusterAppUpgradeStrategyRollingUpdateGetArgs()
        {
        }
    }
}
