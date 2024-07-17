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
    public sealed class ClusterRkeConfigMonitoringToleration
    {
        /// <summary>
        /// The GKE taint effect (string)
        /// </summary>
        public readonly string? Effect;
        /// <summary>
        /// The GKE taint key (string)
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// The toleration seconds (int)
        /// </summary>
        public readonly int? Seconds;
        /// <summary>
        /// The GKE taint value (string)
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ClusterRkeConfigMonitoringToleration(
            string? effect,

            string key,

            string? @operator,

            int? seconds,

            string? value)
        {
            Effect = effect;
            Key = key;
            Operator = @operator;
            Seconds = seconds;
            Value = value;
        }
    }
}
