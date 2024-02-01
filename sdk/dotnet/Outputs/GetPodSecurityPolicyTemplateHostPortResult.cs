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
    public sealed class GetPodSecurityPolicyTemplateHostPortResult
    {
        /// <summary>
        /// max is the end of the range, inclusive.
        /// </summary>
        public readonly int Max;
        /// <summary>
        /// min is the start of the range, inclusive.
        /// </summary>
        public readonly int Min;

        [OutputConstructor]
        private GetPodSecurityPolicyTemplateHostPortResult(
            int max,

            int min)
        {
            Max = max;
            Min = min;
        }
    }
}
