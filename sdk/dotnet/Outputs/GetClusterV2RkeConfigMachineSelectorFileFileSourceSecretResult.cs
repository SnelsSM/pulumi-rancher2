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
    public sealed class GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretResult
    {
        /// <summary>
        /// The default permissions to be applied when they are not set at the item level
        /// </summary>
        public readonly string? DefaultPermissions;
        /// <summary>
        /// Items(files) to retrieve from the K8s object
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemResult> Items;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretResult(
            string? defaultPermissions,

            ImmutableArray<Outputs.GetClusterV2RkeConfigMachineSelectorFileFileSourceSecretItemResult> items,

            string name)
        {
            DefaultPermissions = defaultPermissions;
            Items = items;
            Name = name;
        }
    }
}
