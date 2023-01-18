// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRke2ConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE upgrade strategy (list maxitems:1)
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterRke2ConfigUpgradeStrategyGetArgs>? UpgradeStrategy { get; set; }

        /// <summary>
        /// RKE2 kubernetes version (string)
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ClusterRke2ConfigGetArgs()
        {
        }
        public static new ClusterRke2ConfigGetArgs Empty => new ClusterRke2ConfigGetArgs();
    }
}
