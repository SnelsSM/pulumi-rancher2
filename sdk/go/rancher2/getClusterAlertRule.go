// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster alert rule.
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
//			_, err := rancher2.LookupClusterAlertRule(ctx, &rancher2.LookupClusterAlertRuleArgs{
//				ClusterId: "<cluster_id>",
//				Name:      "<cluster_alert_rule_name>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupClusterAlertRule(ctx *pulumi.Context, args *LookupClusterAlertRuleArgs, opts ...pulumi.InvokeOption) (*LookupClusterAlertRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterAlertRuleResult
	err := ctx.Invoke("rancher2:index/getClusterAlertRule:getClusterAlertRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterAlertRule.
type LookupClusterAlertRuleArgs struct {
	// The cluster id where create cluster alert rule (string)
	ClusterId string `pulumi:"clusterId"`
	// (Computed) The cluster alert rule labels (map)
	Labels map[string]string `pulumi:"labels"`
	// The cluster alert rule name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterAlertRule.
type LookupClusterAlertRuleResult struct {
	// (Computed) The cluster alert rule annotations (map)
	Annotations map[string]string `pulumi:"annotations"`
	ClusterId   string            `pulumi:"clusterId"`
	// (Computed) The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"` (list Maxitems:1)
	EventRule GetClusterAlertRuleEventRule `pulumi:"eventRule"`
	// (Computed) The cluster alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds int `pulumi:"groupIntervalSeconds"`
	// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds int `pulumi:"groupWaitSeconds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The cluster alert rule inherited. Default: `true` (bool)
	Inherited bool `pulumi:"inherited"`
	// (Computed) The cluster alert rule labels (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule GetClusterAlertRuleMetricRule `pulumi:"metricRule"`
	Name       string                        `pulumi:"name"`
	// (Computed) The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule GetClusterAlertRuleNodeRule `pulumi:"nodeRule"`
	// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds int `pulumi:"repeatIntervalSeconds"`
	// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity string `pulumi:"severity"`
	// (Computed) The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule GetClusterAlertRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

func LookupClusterAlertRuleOutput(ctx *pulumi.Context, args LookupClusterAlertRuleOutputArgs, opts ...pulumi.InvokeOption) LookupClusterAlertRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterAlertRuleResult, error) {
			args := v.(LookupClusterAlertRuleArgs)
			r, err := LookupClusterAlertRule(ctx, &args, opts...)
			var s LookupClusterAlertRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterAlertRuleResultOutput)
}

// A collection of arguments for invoking getClusterAlertRule.
type LookupClusterAlertRuleOutputArgs struct {
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// (Computed) The cluster alert rule labels (map)
	Labels pulumi.StringMapInput `pulumi:"labels"`
	// The cluster alert rule name (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupClusterAlertRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterAlertRuleArgs)(nil)).Elem()
}

// A collection of values returned by getClusterAlertRule.
type LookupClusterAlertRuleResultOutput struct{ *pulumi.OutputState }

func (LookupClusterAlertRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterAlertRuleResult)(nil)).Elem()
}

func (o LookupClusterAlertRuleResultOutput) ToLookupClusterAlertRuleResultOutput() LookupClusterAlertRuleResultOutput {
	return o
}

func (o LookupClusterAlertRuleResultOutput) ToLookupClusterAlertRuleResultOutputWithContext(ctx context.Context) LookupClusterAlertRuleResultOutput {
	return o
}

// (Computed) The cluster alert rule annotations (map)
func (o LookupClusterAlertRuleResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o LookupClusterAlertRuleResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"` (list Maxitems:1)
func (o LookupClusterAlertRuleResultOutput) EventRule() GetClusterAlertRuleEventRuleOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) GetClusterAlertRuleEventRule { return v.EventRule }).(GetClusterAlertRuleEventRuleOutput)
}

// (Computed) The cluster alert rule alert group ID (string)
func (o LookupClusterAlertRuleResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
func (o LookupClusterAlertRuleResultOutput) GroupIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) int { return v.GroupIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
func (o LookupClusterAlertRuleResultOutput) GroupWaitSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) int { return v.GroupWaitSeconds }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterAlertRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule inherited. Default: `true` (bool)
func (o LookupClusterAlertRuleResultOutput) Inherited() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) bool { return v.Inherited }).(pulumi.BoolOutput)
}

// (Computed) The cluster alert rule labels (map)
func (o LookupClusterAlertRuleResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"“ (list Maxitems:1)
func (o LookupClusterAlertRuleResultOutput) MetricRule() GetClusterAlertRuleMetricRuleOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) GetClusterAlertRuleMetricRule { return v.MetricRule }).(GetClusterAlertRuleMetricRuleOutput)
}

func (o LookupClusterAlertRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"“ (list Maxitems:1)
func (o LookupClusterAlertRuleResultOutput) NodeRule() GetClusterAlertRuleNodeRuleOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) GetClusterAlertRuleNodeRule { return v.NodeRule }).(GetClusterAlertRuleNodeRuleOutput)
}

// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
func (o LookupClusterAlertRuleResultOutput) RepeatIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) int { return v.RepeatIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
func (o LookupClusterAlertRuleResultOutput) Severity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) string { return v.Severity }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"“ (list Maxitems:1)
func (o LookupClusterAlertRuleResultOutput) SystemServiceRule() GetClusterAlertRuleSystemServiceRuleOutput {
	return o.ApplyT(func(v LookupClusterAlertRuleResult) GetClusterAlertRuleSystemServiceRule { return v.SystemServiceRule }).(GetClusterAlertRuleSystemServiceRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterAlertRuleResultOutput{})
}
