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
    /// Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Rancher2 Cluster Alert Group
    ///     var foo = new Rancher2.ClusterAlertGroup("foo", new()
    ///     {
    ///         ClusterId = "&lt;cluster_id&gt;",
    ///         Description = "Terraform cluster alert group",
    ///         GroupIntervalSeconds = 300,
    ///         RepeatIntervalSeconds = 3600,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cluster Alert Group can be imported using the Rancher cluster alert group ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/clusterAlterRule:ClusterAlterRule foo &amp;lt;CLUSTER_ALERT_GROUP_ID&amp;gt;
    /// ```
    /// </summary>
    [Obsolete(@"rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")]
    [Rancher2ResourceType("rancher2:index/clusterAlterRule:ClusterAlterRule")]
    public partial class ClusterAlterRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster alert group annotations (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id where create cluster alert group (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Alert event rule
        /// </summary>
        [Output("eventRule")]
        public Output<Outputs.ClusterAlterRuleEventRule?> EventRule { get; private set; } = null!;

        /// <summary>
        /// Alert rule group ID
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The cluster alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Output("groupIntervalSeconds")]
        public Output<int?> GroupIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Output("groupWaitSeconds")]
        public Output<int?> GroupWaitSeconds { get; private set; } = null!;

        /// <summary>
        /// Alert rule inherited
        /// </summary>
        [Output("inherited")]
        public Output<bool?> Inherited { get; private set; } = null!;

        /// <summary>
        /// The cluster alert group labels (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Alert metric rule
        /// </summary>
        [Output("metricRule")]
        public Output<Outputs.ClusterAlterRuleMetricRule?> MetricRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert group name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Alert node rule
        /// </summary>
        [Output("nodeRule")]
        public Output<Outputs.ClusterAlterRuleNodeRule?> NodeRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Output("repeatIntervalSeconds")]
        public Output<int?> RepeatIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// Alert rule severity
        /// </summary>
        [Output("severity")]
        public Output<string?> Severity { get; private set; } = null!;

        /// <summary>
        /// Alert system service rule
        /// </summary>
        [Output("systemServiceRule")]
        public Output<Outputs.ClusterAlterRuleSystemServiceRule?> SystemServiceRule { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterAlterRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterAlterRule(string name, ClusterAlterRuleArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterAlterRule:ClusterAlterRule", name, args ?? new ClusterAlterRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterAlterRule(string name, Input<string> id, ClusterAlterRuleState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterAlterRule:ClusterAlterRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClusterAlterRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterAlterRule Get(string name, Input<string> id, ClusterAlterRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterAlterRule(name, id, state, options);
        }
    }

    public sealed class ClusterAlterRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert group annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert group (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Alert event rule
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlterRuleEventRuleArgs>? EventRule { get; set; }

        /// <summary>
        /// Alert rule group ID
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The cluster alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// Alert rule inherited
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert group labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Alert metric rule
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlterRuleMetricRuleArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert group name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Alert node rule
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlterRuleNodeRuleArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// Alert rule severity
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// Alert system service rule
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlterRuleSystemServiceRuleArgs>? SystemServiceRule { get; set; }

        public ClusterAlterRuleArgs()
        {
        }
        public static new ClusterAlterRuleArgs Empty => new ClusterAlterRuleArgs();
    }

    public sealed class ClusterAlterRuleState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert group annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert group (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Alert event rule
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlterRuleEventRuleGetArgs>? EventRule { get; set; }

        /// <summary>
        /// Alert rule group ID
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The cluster alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// Alert rule inherited
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert group labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Alert metric rule
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlterRuleMetricRuleGetArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert group name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Alert node rule
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlterRuleNodeRuleGetArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// Alert rule severity
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// Alert system service rule
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlterRuleSystemServiceRuleGetArgs>? SystemServiceRule { get; set; }

        public ClusterAlterRuleState()
        {
        }
        public static new ClusterAlterRuleState Empty => new ClusterAlterRuleState();
    }
}
