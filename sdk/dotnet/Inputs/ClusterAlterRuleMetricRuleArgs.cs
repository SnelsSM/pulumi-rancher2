// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlterRuleMetricRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ClusterAlterRuleMetricRuleArgs()
        {
        }
    }
}
