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
    public sealed class ClusterRkeConfigIngress
    {
        /// <summary>
        /// Enable ingress default backend. Default: `true` (bool)
        /// </summary>
        public readonly bool? DefaultBackend;
        /// <summary>
        /// Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
        /// </summary>
        public readonly string? DnsPolicy;
        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ExtraArgs;
        /// <summary>
        /// HTTP port for RKE Ingress (int)
        /// </summary>
        public readonly int? HttpPort;
        /// <summary>
        /// HTTPS port for RKE Ingress (int)
        /// </summary>
        public readonly int? HttpsPort;
        /// <summary>
        /// Network mode for RKE Ingress (string)
        /// </summary>
        public readonly string? NetworkMode;
        /// <summary>
        /// RKE monitoring node selector (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? NodeSelector;
        /// <summary>
        /// RKE options for network (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Options;
        /// <summary>
        /// RKE monitoring provider (string)
        /// </summary>
        public readonly string? Provider;
        /// <summary>
        /// Ingress add-on tolerations
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterRkeConfigIngressToleration> Tolerations;
        /// <summary>
        /// Update daemon set strategy
        /// </summary>
        public readonly Outputs.ClusterRkeConfigIngressUpdateStrategy? UpdateStrategy;

        [OutputConstructor]
        private ClusterRkeConfigIngress(
            bool? defaultBackend,

            string? dnsPolicy,

            ImmutableDictionary<string, string>? extraArgs,

            int? httpPort,

            int? httpsPort,

            string? networkMode,

            ImmutableDictionary<string, string>? nodeSelector,

            ImmutableDictionary<string, string>? options,

            string? provider,

            ImmutableArray<Outputs.ClusterRkeConfigIngressToleration> tolerations,

            Outputs.ClusterRkeConfigIngressUpdateStrategy? updateStrategy)
        {
            DefaultBackend = defaultBackend;
            DnsPolicy = dnsPolicy;
            ExtraArgs = extraArgs;
            HttpPort = httpPort;
            HttpsPort = httpsPort;
            NetworkMode = networkMode;
            NodeSelector = nodeSelector;
            Options = options;
            Provider = provider;
            Tolerations = tolerations;
            UpdateStrategy = updateStrategy;
        }
    }
}
