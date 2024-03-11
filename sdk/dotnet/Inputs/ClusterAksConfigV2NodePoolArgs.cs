// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAksConfigV2NodePoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// The AKS node pool availability zones (list)
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The AKS node pool count. Default: `1` (int)
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// Is AKS node pool auto scaling enabled? Default: `false` (bool)
        /// </summary>
        [Input("enableAutoScaling")]
        public Input<bool>? EnableAutoScaling { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the Cluster (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
        /// </summary>
        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// The AKS node pool max pods. Default: `110` (int)
        /// </summary>
        [Input("maxPods")]
        public Input<int>? MaxPods { get; set; }

        /// <summary>
        /// The AKS node pool max surge (string), example value: `25%!`(MISSING)
        /// </summary>
        [Input("maxSurge")]
        public Input<string>? MaxSurge { get; set; }

        /// <summary>
        /// The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
        /// </summary>
        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// The AKS node group mode. Default: `System` (string)
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The AKS node pool orchestrator version (string)
        /// </summary>
        [Input("orchestratorVersion")]
        public Input<string>? OrchestratorVersion { get; set; }

        /// <summary>
        /// The AKS node pool os disk size gb. Default: `128` (int)
        /// </summary>
        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        /// <summary>
        /// The AKS node pool os disk type. Default: `Managed` (string)
        /// </summary>
        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        /// <summary>
        /// The AKS node pool os type. Default: `Linux` (string)
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("taints")]
        private InputList<string>? _taints;

        /// <summary>
        /// The GKE node config taints (List)
        /// </summary>
        public InputList<string> Taints
        {
            get => _taints ?? (_taints = new InputList<string>());
            set => _taints = value;
        }

        /// <summary>
        /// The AKS node pool orchestrator version (string)
        /// </summary>
        [Input("vmSize")]
        public Input<string>? VmSize { get; set; }

        public ClusterAksConfigV2NodePoolArgs()
        {
        }
        public static new ClusterAksConfigV2NodePoolArgs Empty => new ClusterAksConfigV2NodePoolArgs();
    }
}
