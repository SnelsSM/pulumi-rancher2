// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetPodSecurityPolicyTemplateHostPortArgs : Pulumi.InvokeArgs
    {
        [Input("max", required: true)]
        public int Max { get; set; }

        [Input("min", required: true)]
        public int Min { get; set; }

        public GetPodSecurityPolicyTemplateHostPortArgs()
        {
        }
    }
}
