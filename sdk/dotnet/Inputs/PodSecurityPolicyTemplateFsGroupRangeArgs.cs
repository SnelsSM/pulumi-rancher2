// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class PodSecurityPolicyTemplateFsGroupRangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (int)
        /// </summary>
        [Input("max", required: true)]
        public Input<int> Max { get; set; } = null!;

        /// <summary>
        /// (int)
        /// </summary>
        [Input("min", required: true)]
        public Input<int> Min { get; set; } = null!;

        public PodSecurityPolicyTemplateFsGroupRangeArgs()
        {
        }
        public static new PodSecurityPolicyTemplateFsGroupRangeArgs Empty => new PodSecurityPolicyTemplateFsGroupRangeArgs();
    }
}
