// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxSurge")]
        public Input<int>? MaxSurge { get; set; }

        [Input("maxUnavailable")]
        public Input<int>? MaxUnavailable { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateArgs();
    }
}
