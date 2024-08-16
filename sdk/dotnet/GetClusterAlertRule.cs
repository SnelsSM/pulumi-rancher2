// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetClusterAlertRule
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster alert rule.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetClusterAlertRule.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "&lt;cluster_alert_rule_name&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetClusterAlertRuleResult> InvokeAsync(GetClusterAlertRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterAlertRuleResult>("rancher2:index/getClusterAlertRule:getClusterAlertRule", args ?? new GetClusterAlertRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster alert rule.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetClusterAlertRule.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "&lt;cluster_alert_rule_name&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetClusterAlertRuleResult> Invoke(GetClusterAlertRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterAlertRuleResult>("rancher2:index/getClusterAlertRule:getClusterAlertRule", args ?? new GetClusterAlertRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterAlertRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("labels")]
        private Dictionary<string, string>? _labels;

        /// <summary>
        /// (Computed) The cluster alert rule labels (map)
        /// </summary>
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAlertRuleArgs()
        {
        }
        public static new GetClusterAlertRuleArgs Empty => new GetClusterAlertRuleArgs();
    }

    public sealed class GetClusterAlertRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// (Computed) The cluster alert rule labels (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterAlertRuleInvokeArgs()
        {
        }
        public static new GetClusterAlertRuleInvokeArgs Empty => new GetClusterAlertRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterAlertRuleResult
    {
        /// <summary>
        /// (Computed) The cluster alert rule annotations (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlertRuleEventRuleResult EventRule;
        /// <summary>
        /// (Computed) The cluster alert rule alert group ID (string)
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupIntervalSeconds;
        /// <summary>
        /// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupWaitSeconds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        public readonly bool Inherited;
        /// <summary>
        /// (Computed) The cluster alert rule labels (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// (Computed) The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlertRuleMetricRuleResult MetricRule;
        public readonly string Name;
        /// <summary>
        /// (Computed) The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlertRuleNodeRuleResult NodeRule;
        /// <summary>
        /// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        public readonly int RepeatIntervalSeconds;
        /// <summary>
        /// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        public readonly string Severity;
        /// <summary>
        /// (Computed) The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlertRuleSystemServiceRuleResult SystemServiceRule;

        [OutputConstructor]
        private GetClusterAlertRuleResult(
            ImmutableDictionary<string, string> annotations,

            string clusterId,

            Outputs.GetClusterAlertRuleEventRuleResult eventRule,

            string groupId,

            int groupIntervalSeconds,

            int groupWaitSeconds,

            string id,

            bool inherited,

            ImmutableDictionary<string, string>? labels,

            Outputs.GetClusterAlertRuleMetricRuleResult metricRule,

            string name,

            Outputs.GetClusterAlertRuleNodeRuleResult nodeRule,

            int repeatIntervalSeconds,

            string severity,

            Outputs.GetClusterAlertRuleSystemServiceRuleResult systemServiceRule)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            EventRule = eventRule;
            GroupId = groupId;
            GroupIntervalSeconds = groupIntervalSeconds;
            GroupWaitSeconds = groupWaitSeconds;
            Id = id;
            Inherited = inherited;
            Labels = labels;
            MetricRule = metricRule;
            Name = name;
            NodeRule = nodeRule;
            RepeatIntervalSeconds = repeatIntervalSeconds;
            Severity = severity;
            SystemServiceRule = systemServiceRule;
        }
    }
}
