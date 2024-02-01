// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateHostPortInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// max is the end of the range, inclusive.
        /// </summary>
        [Input("max", required: true)]
        public Input<int> Max { get; set; } = null!;

        /// <summary>
        /// min is the start of the range, inclusive.
        /// </summary>
        [Input("min", required: true)]
        public Input<int> Min { get; set; } = null!;

        public GetPodSecurityPolicyTemplateHostPortInputArgs()
        {
        }
        public static new GetPodSecurityPolicyTemplateHostPortInputArgs Empty => new GetPodSecurityPolicyTemplateHostPortInputArgs();
    }
}
