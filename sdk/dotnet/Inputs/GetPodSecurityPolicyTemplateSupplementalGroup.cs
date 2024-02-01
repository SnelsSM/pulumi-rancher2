// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateSupplementalGroupArgs : global::Pulumi.InvokeArgs
    {
        [Input("ranges", required: true)]
        private List<Inputs.GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs>? _ranges;

        /// <summary>
        /// ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
        /// </summary>
        public List<Inputs.GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs> Ranges
        {
            get => _ranges ?? (_ranges = new List<Inputs.GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs>());
            set => _ranges = value;
        }

        /// <summary>
        /// rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
        /// </summary>
        [Input("rule")]
        public string? Rule { get; set; }

        public GetPodSecurityPolicyTemplateSupplementalGroupArgs()
        {
        }
        public static new GetPodSecurityPolicyTemplateSupplementalGroupArgs Empty => new GetPodSecurityPolicyTemplateSupplementalGroupArgs();
    }
}
