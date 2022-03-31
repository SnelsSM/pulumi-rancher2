// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 rke Cluster 
    ///         var foo_customCluster = new Rancher2.Cluster("foo-customCluster", new Rancher2.ClusterArgs
    ///         {
    ///             Description = "Foo rancher2 custom cluster",
    ///             RkeConfig = new Rancher2.Inputs.ClusterRkeConfigArgs
    ///             {
    ///                 Network = new Rancher2.Inputs.ClusterRkeConfigNetworkArgs
    ///                 {
    ///                     Plugin = "canal",
    ///                 },
    ///             },
    ///         });
    ///         // Create a new rancher2 Node Template
    ///         var fooNodeTemplate = new Rancher2.NodeTemplate("fooNodeTemplate", new Rancher2.NodeTemplateArgs
    ///         {
    ///             Description = "foo test",
    ///             Amazonec2Config = new Rancher2.Inputs.NodeTemplateAmazonec2ConfigArgs
    ///             {
    ///                 AccessKey = "&lt;AWS_ACCESS_KEY&gt;",
    ///                 SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///                 Ami = "&lt;AMI_ID&gt;",
    ///                 Region = "&lt;REGION&gt;",
    ///                 SecurityGroups = 
    ///                 {
    ///                     "&lt;AWS_SECURITY_GROUP&gt;",
    ///                 },
    ///                 SubnetId = "&lt;SUBNET_ID&gt;",
    ///                 VpcId = "&lt;VPC_ID&gt;",
    ///                 Zone = "&lt;ZONE&gt;",
    ///             },
    ///         });
    ///         // Create a new rancher2 Node Pool
    ///         var fooNodePool = new Rancher2.NodePool("fooNodePool", new Rancher2.NodePoolArgs
    ///         {
    ///             ClusterId = foo_customCluster.Id,
    ///             HostnamePrefix = "foo-cluster-0",
    ///             NodeTemplateId = fooNodeTemplate.Id,
    ///             Quantity = 3,
    ///             ControlPlane = true,
    ///             Etcd = true,
    ///             Worker = true,
    ///         });
    ///         // Create a new rancher2 Cluster Sync
    ///         var foo_customClusterSync = new Rancher2.ClusterSync("foo-customClusterSync", new Rancher2.ClusterSyncArgs
    ///         {
    ///             ClusterId = foo_customCluster.Id,
    ///             NodePoolIds = 
    ///             {
    ///                 fooNodePool.Id,
    ///             },
    ///         });
    ///         // Create a new rancher2 Project
    ///         var fooProject = new Rancher2.Project("fooProject", new Rancher2.ProjectArgs
    ///         {
    ///             ClusterId = foo_customClusterSync.Id,
    ///             Description = "Terraform namespace acceptance test",
    ///             ResourceQuota = new Rancher2.Inputs.ProjectResourceQuotaArgs
    ///             {
    ///                 ProjectLimit = new Rancher2.Inputs.ProjectResourceQuotaProjectLimitArgs
    ///                 {
    ///                     LimitsCpu = "2000m",
    ///                     LimitsMemory = "2000Mi",
    ///                     RequestsStorage = "2Gi",
    ///                 },
    ///                 NamespaceDefaultLimit = new Rancher2.Inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs
    ///                 {
    ///                     LimitsCpu = "500m",
    ///                     LimitsMemory = "500Mi",
    ///                     RequestsStorage = "1Gi",
    ///                 },
    ///             },
    ///             ContainerResourceLimit = new Rancher2.Inputs.ProjectContainerResourceLimitArgs
    ///             {
    ///                 LimitsCpu = "20m",
    ///                 LimitsMemory = "20Mi",
    ///                 RequestsCpu = "1m",
    ///                 RequestsMemory = "1Mi",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/clusterSync:ClusterSync")]
    public partial class ClusterSync : Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster ID of the node (string).
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

    public sealed class ClusterSyncArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cluster ID of the node (string).
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
    }

    public sealed class ClusterSyncState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cluster ID of the node (string).
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// (Computed) Default project ID for the cluster sync (string)
        /// </summary>
        [Input("defaultProjectId")]
        public Input<string>? DefaultProjectId { get; set; }

        /// <summary>
        /// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
        /// </summary>
        [Input("kubeConfig")]
        public Input<string>? KubeConfig { get; set; }

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
    }
}
