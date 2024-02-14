// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the file is ignored when determining whether the node should be drained before updating the node plan.
        /// </summary>
        [Input("dynamic")]
        public Input<bool>? Dynamic { get; set; }

        /// <summary>
        /// Hash is the base64 encoded value of the SHA256 checksum of the file's content. If specified, it is used to validate the integrity of the file content.
        /// </summary>
        [Input("hash")]
        public Input<string>? Hash { get; set; }

        /// <summary>
        /// Key is the name of the key of the item to retrieve.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Path is the absolute path to put the file in the target node.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Permissions is the numeric representation of the file permission. It takes precedence over the default permissions at the outer level.
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        public ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItemGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItemGetArgs Empty => new ClusterV2RkeConfigMachineSelectorFileFileSourceConfigmapItemGetArgs();
    }
}
