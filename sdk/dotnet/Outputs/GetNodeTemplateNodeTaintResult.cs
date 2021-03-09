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
    public sealed class GetNodeTemplateNodeTaintResult
    {
        public readonly string? Effect;
        public readonly string Key;
        public readonly string TimeAdded;
        public readonly string Value;

        [OutputConstructor]
        private GetNodeTemplateNodeTaintResult(
            string? effect,

            string key,

            string timeAdded,

            string value)
        {
            Effect = effect;
            Key = key;
            TimeAdded = timeAdded;
            Value = value;
        }
    }
}
