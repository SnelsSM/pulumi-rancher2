// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 project alert rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupProjectAlertRule(ctx, &rancher2.LookupProjectAlertRuleArgs{
//				ProjectId: "<project_id>",
//				Name:      "<project_alert_rule_name>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupProjectAlertRule(ctx *pulumi.Context, args *LookupProjectAlertRuleArgs, opts ...pulumi.InvokeOption) (*LookupProjectAlertRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectAlertRuleResult
	err := ctx.Invoke("rancher2:index/getProjectAlertRule:getProjectAlertRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectAlertRule.
type LookupProjectAlertRuleArgs struct {
	// (Computed) The project alert rule labels (map)
	Labels map[string]string `pulumi:"labels"`
	// The project alert rule name (string)
	Name string `pulumi:"name"`
	// The project id where create project alert rule (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectAlertRule.
type LookupProjectAlertRuleResult struct {
	// (Computed) The project alert rule annotations (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) The project alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds int `pulumi:"groupIntervalSeconds"`
	// (Computed) The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds int `pulumi:"groupWaitSeconds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The project alert rule inherited. Default: `true` (bool)
	Inherited bool `pulumi:"inherited"`
	// (Computed) The project alert rule labels (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule GetProjectAlertRuleMetricRule `pulumi:"metricRule"`
	Name       string                        `pulumi:"name"`
	// (Computed) The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule   GetProjectAlertRulePodRule `pulumi:"podRule"`
	ProjectId string                     `pulumi:"projectId"`
	// (Computed) The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds int `pulumi:"repeatIntervalSeconds"`
	// (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity string `pulumi:"severity"`
	// (Computed) The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule GetProjectAlertRuleWorkloadRule `pulumi:"workloadRule"`
}

func LookupProjectAlertRuleOutput(ctx *pulumi.Context, args LookupProjectAlertRuleOutputArgs, opts ...pulumi.InvokeOption) LookupProjectAlertRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectAlertRuleResult, error) {
			args := v.(LookupProjectAlertRuleArgs)
			r, err := LookupProjectAlertRule(ctx, &args, opts...)
			var s LookupProjectAlertRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectAlertRuleResultOutput)
}

// A collection of arguments for invoking getProjectAlertRule.
type LookupProjectAlertRuleOutputArgs struct {
	// (Computed) The project alert rule labels (map)
	Labels pulumi.StringMapInput `pulumi:"labels"`
	// The project alert rule name (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The project id where create project alert rule (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupProjectAlertRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectAlertRuleArgs)(nil)).Elem()
}

// A collection of values returned by getProjectAlertRule.
type LookupProjectAlertRuleResultOutput struct{ *pulumi.OutputState }

func (LookupProjectAlertRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectAlertRuleResult)(nil)).Elem()
}

func (o LookupProjectAlertRuleResultOutput) ToLookupProjectAlertRuleResultOutput() LookupProjectAlertRuleResultOutput {
	return o
}

func (o LookupProjectAlertRuleResultOutput) ToLookupProjectAlertRuleResultOutputWithContext(ctx context.Context) LookupProjectAlertRuleResultOutput {
	return o
}

// (Computed) The project alert rule annotations (map)
func (o LookupProjectAlertRuleResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) The project alert rule alert group ID (string)
func (o LookupProjectAlertRuleResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// (Computed) The project alert rule group interval seconds. Default: `180` (int)
func (o LookupProjectAlertRuleResultOutput) GroupIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) int { return v.GroupIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The project alert rule group wait seconds. Default: `180` (int)
func (o LookupProjectAlertRuleResultOutput) GroupWaitSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) int { return v.GroupWaitSeconds }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectAlertRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The project alert rule inherited. Default: `true` (bool)
func (o LookupProjectAlertRuleResultOutput) Inherited() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) bool { return v.Inherited }).(pulumi.BoolOutput)
}

// (Computed) The project alert rule labels (map)
func (o LookupProjectAlertRuleResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"“ (list Maxitems:1)
func (o LookupProjectAlertRuleResultOutput) MetricRule() GetProjectAlertRuleMetricRuleOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) GetProjectAlertRuleMetricRule { return v.MetricRule }).(GetProjectAlertRuleMetricRuleOutput)
}

func (o LookupProjectAlertRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"“ (list Maxitems:1)
func (o LookupProjectAlertRuleResultOutput) PodRule() GetProjectAlertRulePodRuleOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) GetProjectAlertRulePodRule { return v.PodRule }).(GetProjectAlertRulePodRuleOutput)
}

func (o LookupProjectAlertRuleResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Computed) The project alert rule wait seconds. Default: `3600` (int)
func (o LookupProjectAlertRuleResultOutput) RepeatIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) int { return v.RepeatIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
func (o LookupProjectAlertRuleResultOutput) Severity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) string { return v.Severity }).(pulumi.StringOutput)
}

// (Computed) The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"“ (list Maxitems:1)
func (o LookupProjectAlertRuleResultOutput) WorkloadRule() GetProjectAlertRuleWorkloadRuleOutput {
	return o.ApplyT(func(v LookupProjectAlertRuleResult) GetProjectAlertRuleWorkloadRule { return v.WorkloadRule }).(GetProjectAlertRuleWorkloadRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectAlertRuleResultOutput{})
}
