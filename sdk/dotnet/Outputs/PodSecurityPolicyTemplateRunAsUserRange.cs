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
    public sealed class PodSecurityPolicyTemplateRunAsUserRange
    {
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int Max;
        /// <summary>
        /// (int)
        /// </summary>
        public readonly int Min;

        [OutputConstructor]
        private PodSecurityPolicyTemplateRunAsUserRange(
            int max,

            int min)
        {
            Max = max;
            Min = min;
        }
    }
}
