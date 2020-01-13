// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/cluster_alert_rule.html.markdown.
    /// </summary>
    public partial class ClusterAlterRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("eventRule")]
        public Output<Outputs.ClusterAlterRuleEventRule?> EventRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Output("groupIntervalSeconds")]
        public Output<int?> GroupIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Output("groupWaitSeconds")]
        public Output<int?> GroupWaitSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Output("inherited")]
        public Output<bool?> Inherited { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("metricRule")]
        public Output<Outputs.ClusterAlterRuleMetricRule?> MetricRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("nodeRule")]
        public Output<Outputs.ClusterAlterRuleNodeRule?> NodeRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Output("repeatIntervalSeconds")]
        public Output<int?> RepeatIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Output("severity")]
        public Output<string?> Severity { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
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
            : base("rancher2:index/clusterAlterRule:ClusterAlterRule", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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

    public sealed class ClusterAlterRuleArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlterRuleEventRuleArgs>? EventRule { get; set; }

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlterRuleMetricRuleArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlterRuleNodeRuleArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlterRuleSystemServiceRuleArgs>? SystemServiceRule { get; set; }

        public ClusterAlterRuleArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlterRuleEventRuleGetArgs>? EventRule { get; set; }

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlterRuleMetricRuleGetArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlterRuleNodeRuleGetArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlterRuleSystemServiceRuleGetArgs>? SystemServiceRule { get; set; }

        public ClusterAlterRuleState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ClusterAlterRuleEventRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
        /// </summary>
        [Input("eventType")]
        public Input<string>? EventType { get; set; }

        /// <summary>
        /// Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)
        /// </summary>
        [Input("resourceKind", required: true)]
        public Input<string> ResourceKind { get; set; } = null!;

        public ClusterAlterRuleEventRuleArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleEventRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
        /// </summary>
        [Input("eventType")]
        public Input<string>? EventType { get; set; }

        /// <summary>
        /// Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)
        /// </summary>
        [Input("resourceKind", required: true)]
        public Input<string> ResourceKind { get; set; } = null!;

        public ClusterAlterRuleEventRuleGetArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleMetricRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ClusterAlterRuleMetricRuleArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleMetricRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ClusterAlterRuleMetricRuleGetArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleNodeRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Node rule cpu threshold. Default: `70` (int)
        /// </summary>
        [Input("cpuThreshold")]
        public Input<int>? CpuThreshold { get; set; }

        /// <summary>
        /// Node rule mem threshold. Default: `70` (int)
        /// </summary>
        [Input("memThreshold")]
        public Input<int>? MemThreshold { get; set; }

        /// <summary>
        /// Node ID (string)
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;

        /// <summary>
        /// Node rule selector (map)
        /// </summary>
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        public ClusterAlterRuleNodeRuleArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleNodeRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Node rule cpu threshold. Default: `70` (int)
        /// </summary>
        [Input("cpuThreshold")]
        public Input<int>? CpuThreshold { get; set; }

        /// <summary>
        /// Node rule mem threshold. Default: `70` (int)
        /// </summary>
        [Input("memThreshold")]
        public Input<int>? MemThreshold { get; set; }

        /// <summary>
        /// Node ID (string)
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;

        /// <summary>
        /// Node rule selector (map)
        /// </summary>
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        public ClusterAlterRuleNodeRuleGetArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleSystemServiceRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        public ClusterAlterRuleSystemServiceRuleArgs()
        {
        }
    }

    public sealed class ClusterAlterRuleSystemServiceRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        public ClusterAlterRuleSystemServiceRuleGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ClusterAlterRuleEventRule
    {
        /// <summary>
        /// Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
        /// </summary>
        public readonly string? EventType;
        /// <summary>
        /// Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)
        /// </summary>
        public readonly string ResourceKind;

        [OutputConstructor]
        private ClusterAlterRuleEventRule(
            string? eventType,
            string resourceKind)
        {
            EventType = eventType;
            ResourceKind = resourceKind;
        }
    }

    [OutputType]
    public sealed class ClusterAlterRuleMetricRule
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        public readonly string? Comparison;
        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        public readonly double ThresholdValue;

        [OutputConstructor]
        private ClusterAlterRuleMetricRule(
            string? comparison,
            string? description,
            string duration,
            string expression,
            double thresholdValue)
        {
            Comparison = comparison;
            Description = description;
            Duration = duration;
            Expression = expression;
            ThresholdValue = thresholdValue;
        }
    }

    [OutputType]
    public sealed class ClusterAlterRuleNodeRule
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        public readonly string? Condition;
        /// <summary>
        /// Node rule cpu threshold. Default: `70` (int)
        /// </summary>
        public readonly int? CpuThreshold;
        /// <summary>
        /// Node rule mem threshold. Default: `70` (int)
        /// </summary>
        public readonly int? MemThreshold;
        /// <summary>
        /// Node ID (string)
        /// </summary>
        public readonly string? NodeId;
        /// <summary>
        /// Node rule selector (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Selector;

        [OutputConstructor]
        private ClusterAlterRuleNodeRule(
            string? condition,
            int? cpuThreshold,
            int? memThreshold,
            string? nodeId,
            ImmutableDictionary<string, object>? selector)
        {
            Condition = condition;
            CpuThreshold = cpuThreshold;
            MemThreshold = memThreshold;
            NodeId = nodeId;
            Selector = selector;
        }
    }

    [OutputType]
    public sealed class ClusterAlterRuleSystemServiceRule
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        public readonly string? Condition;

        [OutputConstructor]
        private ClusterAlterRuleSystemServiceRule(string? condition)
        {
            Condition = condition;
        }
    }
    }
}
