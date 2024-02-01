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
    public sealed class GetClusterV2ClusterRegistrationTokenResult
    {
        /// <summary>
        /// Annotations of the resource
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        public readonly string Command;
        /// <summary>
        /// (Computed) The ID of the resource (string)
        /// </summary>
        public readonly string Id;
        public readonly string InsecureCommand;
        public readonly string InsecureNodeCommand;
        public readonly string InsecureWindowsNodeCommand;
        /// <summary>
        /// Labels of the resource
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string ManifestUrl;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;
        public readonly string NodeCommand;
        public readonly string Token;
        public readonly string WindowsNodeCommand;

        [OutputConstructor]
        private GetClusterV2ClusterRegistrationTokenResult(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            string command,

            string id,

            string insecureCommand,

            string insecureNodeCommand,

            string insecureWindowsNodeCommand,

            ImmutableDictionary<string, object> labels,

            string manifestUrl,

            string name,

            string nodeCommand,

            string token,

            string windowsNodeCommand)
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
