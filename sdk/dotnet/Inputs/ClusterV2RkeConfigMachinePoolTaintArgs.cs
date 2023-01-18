// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachinePoolTaintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The taint effect. Default: `\"NoExecute\"` (string)
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// The taint key (string)
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Rancher agent env var value (string)
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ClusterV2RkeConfigMachinePoolTaintArgs()
        {
        }
        public static new ClusterV2RkeConfigMachinePoolTaintArgs Empty => new ClusterV2RkeConfigMachinePoolTaintArgs();
    }
}
