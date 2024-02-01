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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateResult
    {
        /// <summary>
        /// Rolling update max surge
        /// </summary>
        public readonly int? MaxSurge;
        /// <summary>
        /// Rolling update max unavailable
        /// </summary>
        public readonly int? MaxUnavailable;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateResult(
            int? maxSurge,

            int? maxUnavailable)
        {
            MaxSurge = maxSurge;
            MaxUnavailable = maxUnavailable;
        }
    }
}
