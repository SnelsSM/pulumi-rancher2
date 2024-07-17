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
    public sealed class ClusterSyncNode
    {
        /// <summary>
        /// Annotations of the resource
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Annotations;
        /// <summary>
        /// The total resources of a node (map).
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Capacity;
        /// <summary>
        /// The cluster ID that is syncing (string)
        /// </summary>
        public readonly string? ClusterId;
        /// <summary>
        /// The external IP address of the node (string).
        /// </summary>
        public readonly string? ExternalIpAddress;
        /// <summary>
        /// The hostname of the node (string).
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// (Computed) The ID of the resource. Same as `cluster_id` (string)
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The private IP address of the node (string).
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// Labels of the resource
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// The name of the node (string).
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Node Pool ID of the node (string).
        /// </summary>
        public readonly string? NodePoolId;
        /// <summary>
        /// The Node Template ID of the node (string).
        /// </summary>
        public readonly string? NodeTemplateId;
        /// <summary>
        /// The Provider ID of the node (string).
        /// </summary>
        public readonly string? ProviderId;
        /// <summary>
        /// The requested hostname (string).
        /// </summary>
        public readonly string? RequestedHostname;
        /// <summary>
        /// Roles of the node. `controlplane`, `etcd` and `worker`. (list)
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        /// <summary>
        /// The user to connect to the node (string).
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? SystemInfo;

        [OutputConstructor]
        private ClusterSyncNode(
            ImmutableDictionary<string, object>? annotations,

            ImmutableDictionary<string, object>? capacity,

            string? clusterId,

            string? externalIpAddress,

            string? hostname,

            string? id,

            string? ipAddress,

            ImmutableDictionary<string, object>? labels,

            string? name,

            string? nodePoolId,

            string? nodeTemplateId,

            string? providerId,

            string? requestedHostname,

            ImmutableArray<string> roles,

            string? sshUser,

            ImmutableDictionary<string, object>? systemInfo)
        {
            Annotations = annotations;
            Capacity = capacity;
            ClusterId = clusterId;
            ExternalIpAddress = externalIpAddress;
            Hostname = hostname;
            Id = id;
            IpAddress = ipAddress;
            Labels = labels;
            Name = name;
            NodePoolId = nodePoolId;
            NodeTemplateId = nodeTemplateId;
            ProviderId = providerId;
            RequestedHostname = requestedHostname;
            Roles = roles;
            SshUser = sshUser;
            SystemInfo = systemInfo;
        }
    }
}
