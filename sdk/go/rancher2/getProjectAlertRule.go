// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 project alert rule.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/projectAlertRule.html.markdown.
func LookupProjectAlertRule(ctx *pulumi.Context, args *LookupProjectAlertRuleArgs, opts ...pulumi.InvokeOption) (*LookupProjectAlertRuleResult, error) {
	var rv LookupProjectAlertRuleResult
	err := ctx.Invoke("rancher2:index/getProjectAlertRule:getProjectAlertRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectAlertRule.
type LookupProjectAlertRuleArgs struct {
	Labels map[string]interface{} `pulumi:"labels"`
	// The project alert rule name (string)
	Name string `pulumi:"name"`
	// The project id where create project alert rule (string)
	ProjectId string `pulumi:"projectId"`
}


// A collection of values returned by getProjectAlertRule.
type LookupProjectAlertRuleResult struct {
	// (Computed) The project alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) The project alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds int `pulumi:"groupIntervalSeconds"`
	// (Computed) The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds int `pulumi:"groupWaitSeconds"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The project alert rule inherited. Default: `true` (bool)
	Inherited bool `pulumi:"inherited"`
	// (Computed) The project alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule GetProjectAlertRuleMetricRule `pulumi:"metricRule"`
	Name string `pulumi:"name"`
	// (Computed) The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule GetProjectAlertRulePodRule `pulumi:"podRule"`
	ProjectId string `pulumi:"projectId"`
	// (Computed) The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds int `pulumi:"repeatIntervalSeconds"`
	// (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity string `pulumi:"severity"`
	// (Computed) The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule GetProjectAlertRuleWorkloadRule `pulumi:"workloadRule"`
}

