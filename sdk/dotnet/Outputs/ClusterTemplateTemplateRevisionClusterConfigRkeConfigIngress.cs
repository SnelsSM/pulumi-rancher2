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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress
    {
        public readonly string? DnsPolicy;
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        public readonly ImmutableDictionary<string, object>? NodeSelector;
        public readonly ImmutableDictionary<string, object>? Options;
        public readonly string? Provider;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress(
            string? dnsPolicy,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableDictionary<string, object>? nodeSelector,

            ImmutableDictionary<string, object>? options,

            string? provider)
        {
            DnsPolicy = dnsPolicy;
            ExtraArgs = extraArgs;
            NodeSelector = nodeSelector;
            Options = options;
            Provider = provider;
        }
    }
}
