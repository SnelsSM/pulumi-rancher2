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
    public sealed class GetClusterV2RkeConfigMachinePoolResult
    {
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Cluster V2 cloud credential secret name (string)
        /// </summary>
        public readonly string CloudCredentialSecretName;
        public readonly bool? ControlPlaneRole;
        public readonly bool? DrainBeforeDelete;
        public readonly bool? EtcdRole;
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly Outputs.GetClusterV2RkeConfigMachinePoolMachineConfigResult MachineConfig;
        public readonly ImmutableDictionary<string, object> MachineLabels;
        public readonly string? MaxUnhealthy;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;
        public readonly int? NodeDrainTimeout;
        public readonly int? NodeStartupTimeoutSeconds;
        public readonly bool? Paused;
        public readonly int? Quantity;
        public readonly Outputs.GetClusterV2RkeConfigMachinePoolRollingUpdateResult? RollingUpdate;
        public readonly ImmutableArray<Outputs.GetClusterV2RkeConfigMachinePoolTaintResult> Taints;
        public readonly int? UnhealthyNodeTimeoutSeconds;
        public readonly string? UnhealthyRange;
        public readonly bool? WorkerRole;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachinePoolResult(
            ImmutableDictionary<string, object> annotations,

            string cloudCredentialSecretName,

            bool? controlPlaneRole,

            bool? drainBeforeDelete,

            bool? etcdRole,

            ImmutableDictionary<string, object> labels,

            Outputs.GetClusterV2RkeConfigMachinePoolMachineConfigResult machineConfig,

            ImmutableDictionary<string, object> machineLabels,

            string? maxUnhealthy,

            string name,

            int? nodeDrainTimeout,

            int? nodeStartupTimeoutSeconds,

            bool? paused,

            int? quantity,

            Outputs.GetClusterV2RkeConfigMachinePoolRollingUpdateResult? rollingUpdate,

            ImmutableArray<Outputs.GetClusterV2RkeConfigMachinePoolTaintResult> taints,

            int? unhealthyNodeTimeoutSeconds,

            string? unhealthyRange,

            bool? workerRole)
        {
            Annotations = annotations;
            CloudCredentialSecretName = cloudCredentialSecretName;
            ControlPlaneRole = controlPlaneRole;
            DrainBeforeDelete = drainBeforeDelete;
            EtcdRole = etcdRole;
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
