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
    public sealed class ClusterAlterRuleNodeRule
    {
        public readonly string? Condition;
        public readonly int? CpuThreshold;
        public readonly int? MemThreshold;
        public readonly string? NodeId;
        public readonly ImmutableDictionary<string, object>? Selector;

        [OutputConstructor]
        private ClusterAlterRuleNodeRule(
            string? condition,

            int? cpuThreshold,

            int? memThreshold,

            string? nodeId,

            ImmutableDictionary<string, object>? selector)
        {
            Condition = condition;
            CpuThreshold = cpuThreshold;
            MemThreshold = memThreshold;
            NodeId = nodeId;
            Selector = selector;
        }
    }
}
