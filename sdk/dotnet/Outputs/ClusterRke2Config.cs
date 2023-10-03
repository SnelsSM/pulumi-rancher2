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
    public sealed class ClusterRke2Config
    {
        /// <summary>
        /// K3S upgrade strategy (List maxitems: 1)
        /// </summary>
        public readonly Outputs.ClusterRke2ConfigUpgradeStrategy? UpgradeStrategy;
        /// <summary>
        /// rancher-monitoring chart version (string)
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private ClusterRke2Config(
            Outputs.ClusterRke2ConfigUpgradeStrategy? upgradeStrategy,

            string? version)
        {
            UpgradeStrategy = upgradeStrategy;
            Version = version;
        }
    }
}
