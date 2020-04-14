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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDns
    {
        public readonly ImmutableDictionary<string, object>? NodeSelector;
        public readonly string? Provider;
        public readonly ImmutableArray<string> ReverseCidrs;
        public readonly ImmutableArray<string> UpstreamNameservers;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDns(
            ImmutableDictionary<string, object>? nodeSelector,

            string? provider,

            ImmutableArray<string> reverseCidrs,

            ImmutableArray<string> upstreamNameservers)
        {
            NodeSelector = nodeSelector;
            Provider = provider;
            ReverseCidrs = reverseCidrs;
            UpstreamNameservers = upstreamNameservers;
        }
    }
}
