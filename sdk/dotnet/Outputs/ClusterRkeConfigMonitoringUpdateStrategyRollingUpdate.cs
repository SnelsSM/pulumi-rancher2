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
    public sealed class ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate
    {
        /// <summary>
        /// The AKS node pool max surge (string), example value: `25%`
        /// </summary>
        public readonly int? MaxSurge;
        /// <summary>
        /// Monitoring deployment rolling update max unavailable. Default: `1` (int)
        /// </summary>
        public readonly int? MaxUnavailable;

        [OutputConstructor]
        private ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate(
            int? maxSurge,

            int? maxUnavailable)
        {
            MaxSurge = maxSurge;
            MaxUnavailable = maxUnavailable;
        }
    }
}
