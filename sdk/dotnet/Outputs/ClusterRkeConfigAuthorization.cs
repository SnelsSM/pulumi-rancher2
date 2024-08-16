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
    public sealed class ClusterRkeConfigAuthorization
    {
        /// <summary>
        /// The AKS node group mode. Default: `System` (string)
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// RKE options for network (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Options;

        [OutputConstructor]
        private ClusterRkeConfigAuthorization(
            string? mode,

            ImmutableDictionary<string, string>? options)
        {
            Mode = mode;
            Options = options;
        }
    }
}
