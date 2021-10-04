// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2NodePoolConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GKE node config disk size Gb (int)
        /// </summary>
        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        /// <summary>
        /// The GKE node config disk type (string)
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// The GKE node config image type (string)
        /// </summary>
        [Input("imageType")]
        public Input<string>? ImageType { get; set; }

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
        /// The GKE node config local ssd count (int)
        /// </summary>
        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        /// <summary>
        /// The GKE node config machine type (string)
        /// </summary>
        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        [Input("oauthScopes")]
        private InputList<string>? _oauthScopes;

        /// <summary>
        /// The GKE node config oauth scopes (List)
        /// </summary>
        public InputList<string> OauthScopes
        {
            get => _oauthScopes ?? (_oauthScopes = new InputList<string>());
            set => _oauthScopes = value;
        }

        /// <summary>
        /// Enable GKE node config preemptible. Default: `false` (bool)
        /// </summary>
        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The GKE node config tags (List)
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.ClusterGkeConfigV2NodePoolConfigTaintGetArgs>? _taints;

        /// <summary>
        /// The GKE node config taints (List)
        /// </summary>
        public InputList<Inputs.ClusterGkeConfigV2NodePoolConfigTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.ClusterGkeConfigV2NodePoolConfigTaintGetArgs>());
            set => _taints = value;
        }

        public ClusterGkeConfigV2NodePoolConfigGetArgs()
        {
        }
    }
}
