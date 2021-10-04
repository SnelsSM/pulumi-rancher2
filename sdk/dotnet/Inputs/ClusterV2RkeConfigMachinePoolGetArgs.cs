// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachinePoolGetArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster V2 cloud credential secret name (string)
        /// </summary>
        [Input("cloudCredentialSecretName", required: true)]
        public Input<string> CloudCredentialSecretName { get; set; } = null!;

        /// <summary>
        /// Machine pool control plane role? (bool)
        /// </summary>
        [Input("controlPlaneRole")]
        public Input<bool>? ControlPlaneRole { get; set; }

        /// <summary>
        /// Machine pool etcd role? (bool)
        /// </summary>
        [Input("etcdRole")]
        public Input<bool>? EtcdRole { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Machine pool node config (list)
        /// </summary>
        [Input("machineConfig", required: true)]
        public Input<Inputs.ClusterV2RkeConfigMachinePoolMachineConfigGetArgs> MachineConfig { get; set; } = null!;

        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Machine pool paused? (bool)
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Machine pool quantity (int)
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        /// <summary>
        /// Machine pool rolling update (List maxitems:1)
        /// </summary>
        [Input("rollingUpdate")]
        public Input<Inputs.ClusterV2RkeConfigMachinePoolRollingUpdateGetArgs>? RollingUpdate { get; set; }

        [Input("taints")]
        private InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs>? _taints;

        /// <summary>
        /// Machine pool taints (list)
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.ClusterV2RkeConfigMachinePoolTaintGetArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// Machine pool worker role? (bool)
        /// </summary>
        [Input("workerRole")]
        public Input<bool>? WorkerRole { get; set; }

        public ClusterV2RkeConfigMachinePoolGetArgs()
        {
        }
    }
}
