// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateSeLinuxArgs : Pulumi.InvokeArgs
    {
        [Input("rule", required: true)]
        public string Rule { get; set; } = null!;

        [Input("seLinuxOption")]
        public Inputs.GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs? SeLinuxOption { get; set; }

        public GetPodSecurityPolicyTemplateSeLinuxArgs()
        {
        }
    }
}
