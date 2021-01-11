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
    public sealed class GetClusterRkeConfigDnsLinearAutoscalerParamsResult
    {
        public readonly double? CoresPerReplica;
        public readonly int? Max;
        public readonly int? Min;
        public readonly double? NodesPerReplica;
        public readonly bool? PreventSinglePointFailure;

        [OutputConstructor]
        private GetClusterRkeConfigDnsLinearAutoscalerParamsResult(
            double? coresPerReplica,

            int? max,

            int? min,

            double? nodesPerReplica,

            bool? preventSinglePointFailure)
        {
            CoresPerReplica = coresPerReplica;
            Max = max;
            Min = min;
            NodesPerReplica = nodesPerReplica;
            PreventSinglePointFailure = preventSinglePointFailure;
        }
    }
}
