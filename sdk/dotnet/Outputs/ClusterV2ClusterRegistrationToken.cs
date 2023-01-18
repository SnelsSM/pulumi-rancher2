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
    public sealed class ClusterV2ClusterRegistrationToken
    {
        /// <summary>
        /// Annotations for the Cluster V2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Annotations;
        /// <summary>
        /// Cluster ID (string)
        /// </summary>
        public readonly string? ClusterId;
        /// <summary>
        /// Command to execute in a imported k8s cluster (string)
        /// </summary>
        public readonly string? Command;
        /// <summary>
        /// (Computed) The ID of the resource (string)
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Insecure command to execute in a imported k8s cluster (string)
        /// </summary>
        public readonly string? InsecureCommand;
        /// <summary>
        /// Insecure node command to execute in a imported k8s cluster (string)
        /// </summary>
        public readonly string? InsecureNodeCommand;
        /// <summary>
        /// Insecure windows command to execute in a imported k8s cluster (string)
        /// </summary>
        public readonly string? InsecureWindowsNodeCommand;
        /// <summary>
        /// Labels for the Cluster V2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
        /// </summary>
        public readonly string? ManifestUrl;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Node command to execute in linux nodes for custom k8s cluster (string)
        /// </summary>
        public readonly string? NodeCommand;
        /// <summary>
        /// Token for cluster registration token object (string)
        /// </summary>
        public readonly string? Token;
        /// <summary>
        /// Node command to execute in windows nodes for custom k8s cluster (string)
        /// </summary>
        public readonly string? WindowsNodeCommand;

        [OutputConstructor]
        private ClusterV2ClusterRegistrationToken(
            ImmutableDictionary<string, object>? annotations,

            string? clusterId,

            string? command,

            string? id,

            string? insecureCommand,

            string? insecureNodeCommand,

            string? insecureWindowsNodeCommand,

            ImmutableDictionary<string, object>? labels,

            string? manifestUrl,

            string? name,

            string? nodeCommand,

            string? token,

            string? windowsNodeCommand)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            Command = command;
            Id = id;
            InsecureCommand = insecureCommand;
            InsecureNodeCommand = insecureNodeCommand;
            InsecureWindowsNodeCommand = insecureWindowsNodeCommand;
            Labels = labels;
            ManifestUrl = manifestUrl;
            Name = name;
            NodeCommand = nodeCommand;
            Token = token;
            WindowsNodeCommand = windowsNodeCommand;
        }
    }
}
