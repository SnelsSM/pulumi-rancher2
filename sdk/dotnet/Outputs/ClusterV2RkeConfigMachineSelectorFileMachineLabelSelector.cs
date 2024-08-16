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
    public sealed class ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector
    {
        /// <summary>
        /// Label selector match expressions
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpression> MatchExpressions;
        /// <summary>
        /// Label selector match labels
        /// </summary>
        public readonly ImmutableDictionary<string, string>? MatchLabels;

        [OutputConstructor]
        private ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector(
            ImmutableArray<Outputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpression> matchExpressions,

            ImmutableDictionary<string, string>? matchLabels)
        {
            MatchExpressions = matchExpressions;
            MatchLabels = matchLabels;
        }
    }
}
