// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class PodSecurityPolicyTemplateFsGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("ranges")]
        private InputList<Inputs.PodSecurityPolicyTemplateFsGroupRangeArgs>? _ranges;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateFsGroupRangeArgs> Ranges
        {
            get => _ranges ?? (_ranges = new InputList<Inputs.PodSecurityPolicyTemplateFsGroupRangeArgs>());
            set => _ranges = value;
        }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        public PodSecurityPolicyTemplateFsGroupArgs()
        {
        }
        public static new PodSecurityPolicyTemplateFsGroupArgs Empty => new PodSecurityPolicyTemplateFsGroupArgs();
    }
}
