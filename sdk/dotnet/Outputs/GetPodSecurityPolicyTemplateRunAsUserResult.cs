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
    public sealed class GetPodSecurityPolicyTemplateRunAsUserResult
    {
        /// <summary>
        /// ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPodSecurityPolicyTemplateRunAsUserRangeResult> Ranges;
        /// <summary>
        /// rule is the strategy that will dictate the allowable RunAsUser values that may be set.
        /// </summary>
        public readonly string Rule;

        [OutputConstructor]
        private GetPodSecurityPolicyTemplateRunAsUserResult(
            ImmutableArray<Outputs.GetPodSecurityPolicyTemplateRunAsUserRangeResult> ranges,

            string rule)
        {
            Ranges = ranges;
            Rule = rule;
        }
    }
}
