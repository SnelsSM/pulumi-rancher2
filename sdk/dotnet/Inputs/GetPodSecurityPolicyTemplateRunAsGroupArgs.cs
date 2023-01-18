// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateRunAsGroupInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("ranges")]
        private InputList<Inputs.GetPodSecurityPolicyTemplateRunAsGroupRangeInputArgs>? _ranges;
        public InputList<Inputs.GetPodSecurityPolicyTemplateRunAsGroupRangeInputArgs> Ranges
        {
            get => _ranges ?? (_ranges = new InputList<Inputs.GetPodSecurityPolicyTemplateRunAsGroupRangeInputArgs>());
            set => _ranges = value;
        }

        [Input("rule", required: true)]
        public Input<string> Rule { get; set; } = null!;

        public GetPodSecurityPolicyTemplateRunAsGroupInputArgs()
        {
        }
        public static new GetPodSecurityPolicyTemplateRunAsGroupInputArgs Empty => new GetPodSecurityPolicyTemplateRunAsGroupInputArgs();
    }
}
