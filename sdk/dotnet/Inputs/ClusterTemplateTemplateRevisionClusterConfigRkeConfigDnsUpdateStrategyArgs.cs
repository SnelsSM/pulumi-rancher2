// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs : global::Pulumi.ResourceArgs
    {
        [Input("rollingUpdate")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyRollingUpdateArgs>? RollingUpdate { get; set; }

        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyArgs();
    }
}
