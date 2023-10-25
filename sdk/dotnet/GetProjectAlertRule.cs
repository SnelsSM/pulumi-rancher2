// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetProjectAlertRule
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 project alert rule.
        /// </summary>
        public static Task<GetProjectAlertRuleResult> InvokeAsync(GetProjectAlertRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectAlertRuleResult>("rancher2:index/getProjectAlertRule:getProjectAlertRule", args ?? new GetProjectAlertRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 project alert rule.
        /// </summary>
        public static Output<GetProjectAlertRuleResult> Invoke(GetProjectAlertRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectAlertRuleResult>("rancher2:index/getProjectAlertRule:getProjectAlertRule", args ?? new GetProjectAlertRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectAlertRuleArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private Dictionary<string, object>? _labels;

        /// <summary>
        /// (Computed) The project alert rule labels (map)
        /// </summary>
        public Dictionary<string, object> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert rule name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project id where create project alert rule (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectAlertRuleArgs()
        {
        }
        public static new GetProjectAlertRuleArgs Empty => new GetProjectAlertRuleArgs();
    }

    public sealed class GetProjectAlertRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (Computed) The project alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert rule name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project id where create project alert rule (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectAlertRuleInvokeArgs()
        {
        }
        public static new GetProjectAlertRuleInvokeArgs Empty => new GetProjectAlertRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectAlertRuleResult
    {
        /// <summary>
        /// (Computed) The project alert rule annotations (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) The project alert rule alert group ID (string)
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// (Computed) The project alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupIntervalSeconds;
        /// <summary>
        /// (Computed) The project alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupWaitSeconds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The project alert rule inherited. Default: `true` (bool)
        /// </summary>
        public readonly bool Inherited;
        /// <summary>
        /// (Computed) The project alert rule labels (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// (Computed) The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectAlertRuleMetricRuleResult MetricRule;
        public readonly string Name;
        /// <summary>
        /// (Computed) The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectAlertRulePodRuleResult PodRule;
        public readonly string ProjectId;
        /// <summary>
        /// (Computed) The project alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        public readonly int RepeatIntervalSeconds;
        /// <summary>
        /// (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        public readonly string Severity;
        /// <summary>
        /// (Computed) The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectAlertRuleWorkloadRuleResult WorkloadRule;

        [OutputConstructor]
        private GetProjectAlertRuleResult(
            ImmutableDictionary<string, object> annotations,

            string groupId,

            int groupIntervalSeconds,

            int groupWaitSeconds,

            string id,

            bool inherited,

            ImmutableDictionary<string, object>? labels,

            Outputs.GetProjectAlertRuleMetricRuleResult metricRule,

            string name,

            Outputs.GetProjectAlertRulePodRuleResult podRule,

            string projectId,

            int repeatIntervalSeconds,

            string severity,

            Outputs.GetProjectAlertRuleWorkloadRuleResult workloadRule)
        {
            Annotations = annotations;
            GroupId = groupId;
            GroupIntervalSeconds = groupIntervalSeconds;
            GroupWaitSeconds = groupWaitSeconds;
            Id = id;
            Inherited = inherited;
            Labels = labels;
            MetricRule = metricRule;
            Name = name;
            PodRule = podRule;
            ProjectId = projectId;
            RepeatIntervalSeconds = repeatIntervalSeconds;
            Severity = severity;
            WorkloadRule = workloadRule;
        }
    }
}
