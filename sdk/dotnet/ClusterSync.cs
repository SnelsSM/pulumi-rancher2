// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    [Rancher2ResourceType("rancher2:index/clusterSync:ClusterSync")]
    public partial class ClusterSync : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster ID that is syncing (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// (Computed) Default project ID for the cluster sync (string)
        /// </summary>
        [Output("defaultProjectId")]
        public Output<string> DefaultProjectId { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
        /// </summary>
        [Output("kubeConfig")]
        public Output<string> KubeConfig { get; private set; } = null!;

        /// <summary>
        /// The node pool IDs used by the cluster id (list)
        /// </summary>
        [Output("nodePoolIds")]
        public Output<ImmutableArray<string>> NodePoolIds { get; private set; } = null!;

        /// <summary>
        /// (Computed) The cluster nodes (list).
        /// </summary>
        [Output("nodes")]
        public Output<ImmutableArray<Outputs.ClusterSyncNode>> Nodes { get; private set; } = null!;

        /// <summary>
        /// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
        /// 
        /// **Note:** `state_confirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `state_confirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `state_confirm = 3` assure at least 10 seconds, etc
        /// </summary>
        [Output("stateConfirm")]
        public Output<int?> StateConfirm { get; private set; } = null!;

        [Output("synced")]
        public Output<bool?> Synced { get; private set; } = null!;

        /// <summary>
        /// (Computed) System project ID for the cluster sync (string)
        /// </summary>
        [Output("systemProjectId")]
        public Output<string> SystemProjectId { get; private set; } = null!;

        /// <summary>
        /// Wait until alerting is up and running. Default: `false` (bool)
        /// </summary>
        [Output("waitAlerting")]
        public Output<bool?> WaitAlerting { get; private set; } = null!;

        /// <summary>
        /// Wait until all catalogs are downloaded and active. Default: `false` (bool)
        /// </summary>
        [Output("waitCatalogs")]
        public Output<bool?> WaitCatalogs { get; private set; } = null!;

        /// <summary>
        /// Wait until monitoring is up and running. Default: `false` (bool)
        /// </summary>
        [Output("waitMonitoring")]
        public Output<bool?> WaitMonitoring { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterSync resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterSync(string name, ClusterSyncArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterSync:ClusterSync", name, args ?? new ClusterSyncArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterSync(string name, Input<string> id, ClusterSyncState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterSync:ClusterSync", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "kubeConfig",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClusterSync resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterSync Get(string name, Input<string> id, ClusterSyncState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterSync(name, id, state, options);
        }
    }

    public sealed class ClusterSyncArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID that is syncing (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("nodePoolIds")]
        private InputList<string>? _nodePoolIds;

        /// <summary>
        /// The node pool IDs used by the cluster id (list)
        /// </summary>
        public InputList<string> NodePoolIds
        {
            get => _nodePoolIds ?? (_nodePoolIds = new InputList<string>());
            set => _nodePoolIds = value;
        }

        /// <summary>
        /// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
        /// 
        /// **Note:** `state_confirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `state_confirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `state_confirm = 3` assure at least 10 seconds, etc
        /// </summary>
        [Input("stateConfirm")]
        public Input<int>? StateConfirm { get; set; }

        [Input("synced")]
        public Input<bool>? Synced { get; set; }

        /// <summary>
        /// Wait until alerting is up and running. Default: `false` (bool)
        /// </summary>
        [Input("waitAlerting")]
        public Input<bool>? WaitAlerting { get; set; }

        /// <summary>
        /// Wait until all catalogs are downloaded and active. Default: `false` (bool)
        /// </summary>
        [Input("waitCatalogs")]
        public Input<bool>? WaitCatalogs { get; set; }

        /// <summary>
        /// Wait until monitoring is up and running. Default: `false` (bool)
        /// </summary>
        [Input("waitMonitoring")]
        public Input<bool>? WaitMonitoring { get; set; }

        public ClusterSyncArgs()
        {
        }
        public static new ClusterSyncArgs Empty => new ClusterSyncArgs();
    }

    public sealed class ClusterSyncState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID that is syncing (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// (Computed) Default project ID for the cluster sync (string)
        /// </summary>
        [Input("defaultProjectId")]
        public Input<string>? DefaultProjectId { get; set; }

        [Input("kubeConfig")]
        private Input<string>? _kubeConfig;

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
        /// </summary>
        public Input<string>? KubeConfig
        {
            get => _kubeConfig;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _kubeConfig = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("nodePoolIds")]
        private InputList<string>? _nodePoolIds;

        /// <summary>
        /// The node pool IDs used by the cluster id (list)
        /// </summary>
        public InputList<string> NodePoolIds
        {
            get => _nodePoolIds ?? (_nodePoolIds = new InputList<string>());
            set => _nodePoolIds = value;
        }

        [Input("nodes")]
        private InputList<Inputs.ClusterSyncNodeGetArgs>? _nodes;

        /// <summary>
        /// (Computed) The cluster nodes (list).
        /// </summary>
        public InputList<Inputs.ClusterSyncNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.ClusterSyncNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
        /// 
        /// **Note:** `state_confirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `state_confirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `state_confirm = 3` assure at least 10 seconds, etc
        /// </summary>
        [Input("stateConfirm")]
        public Input<int>? StateConfirm { get; set; }

        [Input("synced")]
        public Input<bool>? Synced { get; set; }

        /// <summary>
        /// (Computed) System project ID for the cluster sync (string)
        /// </summary>
        [Input("systemProjectId")]
        public Input<string>? SystemProjectId { get; set; }

        /// <summary>
        /// Wait until alerting is up and running. Default: `false` (bool)
        /// </summary>
        [Input("waitAlerting")]
        public Input<bool>? WaitAlerting { get; set; }

        /// <summary>
        /// Wait until all catalogs are downloaded and active. Default: `false` (bool)
        /// </summary>
        [Input("waitCatalogs")]
        public Input<bool>? WaitCatalogs { get; set; }

        /// <summary>
        /// Wait until monitoring is up and running. Default: `false` (bool)
        /// </summary>
        [Input("waitMonitoring")]
        public Input<bool>? WaitMonitoring { get; set; }

        public ClusterSyncState()
        {
        }
        public static new ClusterSyncState Empty => new ClusterSyncState();
    }
}
