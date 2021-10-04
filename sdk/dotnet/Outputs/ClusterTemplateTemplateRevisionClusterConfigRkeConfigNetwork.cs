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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork
    {
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider? CalicoNetworkProvider;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider? CanalNetworkProvider;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider? FlannelNetworkProvider;
        public readonly int? Mtu;
        public readonly ImmutableDictionary<string, object>? Options;
        public readonly string? Plugin;
        public readonly ImmutableArray<Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> Tolerations;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider? WeaveNetworkProvider;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork(
            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider? calicoNetworkProvider,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCanalNetworkProvider? canalNetworkProvider,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider? flannelNetworkProvider,

            int? mtu,

            ImmutableDictionary<string, object>? options,

            string? plugin,

            ImmutableArray<Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkToleration> tolerations,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkWeaveNetworkProvider? weaveNetworkProvider)
        {
            CalicoNetworkProvider = calicoNetworkProvider;
            CanalNetworkProvider = canalNetworkProvider;
            FlannelNetworkProvider = flannelNetworkProvider;
            Mtu = mtu;
            Options = options;
            Plugin = plugin;
            Tolerations = tolerations;
            WeaveNetworkProvider = weaveNetworkProvider;
        }
    }
}
