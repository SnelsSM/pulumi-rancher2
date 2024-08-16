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
    public sealed class ClusterRkeConfigServicesScheduler
    {
        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ExtraArgs;
        /// <summary>
        /// Extra binds for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraBinds;
        /// <summary>
        /// Extra environment for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraEnvs;
        /// <summary>
        /// Docker image for scheduler service (string)
        /// </summary>
        public readonly string? Image;

        [OutputConstructor]
        private ClusterRkeConfigServicesScheduler(
            ImmutableDictionary<string, string>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            string? image)
        {
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Image = image;
        }
    }
}
