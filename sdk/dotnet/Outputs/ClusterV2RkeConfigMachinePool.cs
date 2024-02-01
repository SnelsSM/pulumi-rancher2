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
    public sealed class ClusterV2RkeConfigMachinePool
    {
        /// <summary>
        /// Annotations for the Cluster V2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Annotations;
        /// <summary>
        /// Cluster V2 cloud credential secret name (string)
        /// </summary>
        public readonly string? CloudCredentialSecretName;
        /// <summary>
        /// Machine pool control plane role? (bool)
        /// </summary>
        public readonly bool? ControlPlaneRole;
        /// <summary>
        /// Machine Pool Drain Before Delete? (bool)
        /// </summary>
        public readonly bool? DrainBeforeDelete;
        /// <summary>
        /// Machine pool etcd role? (bool)
        /// </summary>
        public readonly bool? EtcdRole;
        /// <summary>
        /// maximum length for autogenerated hostname
        /// </summary>
        public readonly int? HostnameLengthLimit;
        /// <summary>
        /// Labels for the Cluster V2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// Machine pool node config (list)
        /// </summary>
        public readonly Outputs.ClusterV2RkeConfigMachinePoolMachineConfig MachineConfig;
        /// <summary>
        /// Labels for Machine pool nodes (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? MachineLabels;
        /// <summary>
        /// Max unhealthy nodes for automated replacement to be allowed (string)
        /// </summary>
        public readonly string? MaxUnhealthy;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Seconds a machine has to drain before deletion (int)
        /// </summary>
        public readonly int? NodeDrainTimeout;
        /// <summary>
        /// Seconds a new node has to become active before it is replaced (int)
        /// </summary>
        public readonly int? NodeStartupTimeoutSeconds;
        /// <summary>
        /// Machine pool paused? (bool)
        /// </summary>
        public readonly bool? Paused;
        /// <summary>
        /// Machine pool quantity (int)
        /// </summary>
        public readonly int? Quantity;
        /// <summary>
        /// Machine pool rolling update (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterV2RkeConfigMachinePoolRollingUpdate? RollingUpdate;
        /// <summary>
        /// Machine pool taints (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterV2RkeConfigMachinePoolTaint> Taints;
        /// <summary>
        /// Seconds an unhealthy node has to become active before it is replaced (int)
        /// </summary>
        public readonly int? UnhealthyNodeTimeoutSeconds;
        /// <summary>
        /// Range of unhealthy nodes for automated replacement to be allowed (string)
        /// </summary>
        public readonly string? UnhealthyRange;
        /// <summary>
        /// Machine pool worker role? (bool)
        /// </summary>
        public readonly bool? WorkerRole;

        [OutputConstructor]
        private ClusterV2RkeConfigMachinePool(
            ImmutableDictionary<string, object>? annotations,

            string? cloudCredentialSecretName,

            bool? controlPlaneRole,

            bool? drainBeforeDelete,

            bool? etcdRole,

            int? hostnameLengthLimit,

            ImmutableDictionary<string, object>? labels,

            Outputs.ClusterV2RkeConfigMachinePoolMachineConfig machineConfig,

            ImmutableDictionary<string, object>? machineLabels,

            string? maxUnhealthy,

            string name,

            int? nodeDrainTimeout,

            int? nodeStartupTimeoutSeconds,

            bool? paused,

            int? quantity,

            Outputs.ClusterV2RkeConfigMachinePoolRollingUpdate? rollingUpdate,

            ImmutableArray<Outputs.ClusterV2RkeConfigMachinePoolTaint> taints,

            int? unhealthyNodeTimeoutSeconds,

            string? unhealthyRange,

            bool? workerRole)
        {
            Annotations = annotations;
            CloudCredentialSecretName = cloudCredentialSecretName;
            ControlPlaneRole = controlPlaneRole;
            DrainBeforeDelete = drainBeforeDelete;
            EtcdRole = etcdRole;
            HostnameLengthLimit = hostnameLengthLimit;
            Labels = labels;
            MachineConfig = machineConfig;
            MachineLabels = machineLabels;
            MaxUnhealthy = maxUnhealthy;
            Name = name;
            NodeDrainTimeout = nodeDrainTimeout;
            NodeStartupTimeoutSeconds = nodeStartupTimeoutSeconds;
            Paused = paused;
            Quantity = quantity;
            RollingUpdate = rollingUpdate;
            Taints = taints;
            UnhealthyNodeTimeoutSeconds = unhealthyNodeTimeoutSeconds;
            UnhealthyRange = unhealthyRange;
            WorkerRole = workerRole;
        }
    }
}
