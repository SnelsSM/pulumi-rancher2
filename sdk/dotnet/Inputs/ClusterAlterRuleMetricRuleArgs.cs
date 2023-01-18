// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlterRuleMetricRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// The cluster alert group description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ClusterAlterRuleMetricRuleArgs()
        {
        }
        public static new ClusterAlterRuleMetricRuleArgs Empty => new ClusterAlterRuleMetricRuleArgs();
    }
}
