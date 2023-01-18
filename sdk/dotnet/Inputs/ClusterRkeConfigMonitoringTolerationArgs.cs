// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigMonitoringTolerationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// The toleration key (string)
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// The toleration seconds (int)
        /// </summary>
        [Input("seconds")]
        public Input<int>? Seconds { get; set; }

        /// <summary>
        /// Rancher agent env var value (string)
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ClusterRkeConfigMonitoringTolerationArgs()
        {
        }
        public static new ClusterRkeConfigMonitoringTolerationArgs Empty => new ClusterRkeConfigMonitoringTolerationArgs();
    }
}
