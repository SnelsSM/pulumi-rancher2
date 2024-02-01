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
    public sealed class GetClusterAlterRuleEventRuleResult
    {
        /// <summary>
        /// Event type
        /// </summary>
        public readonly string? EventType;
        /// <summary>
        /// Resource kind
        /// </summary>
        public readonly string ResourceKind;

        [OutputConstructor]
        private GetClusterAlterRuleEventRuleResult(
            string? eventType,

            string resourceKind)
        {
            EventType = eventType;
            ResourceKind = resourceKind;
        }
    }
}
