// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooClusterAlertGroup, err := rancher2.NewClusterAlertGroup(ctx, "fooClusterAlertGroup", &rancher2.ClusterAlertGroupArgs{
// 			ClusterId:             pulumi.String("<cluster_id>"),
// 			Description:           pulumi.String("Terraform cluster alert group"),
// 			GroupIntervalSeconds:  pulumi.Int(300),
// 			RepeatIntervalSeconds: pulumi.Int(3600),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewClusterAlertRule(ctx, "fooClusterAlertRule", &rancher2.ClusterAlertRuleArgs{
// 			ClusterId:             fooClusterAlertGroup.ClusterId,
// 			GroupId:               fooClusterAlertGroup.ID(),
// 			GroupIntervalSeconds:  pulumi.Int(600),
// 			RepeatIntervalSeconds: pulumi.Int(6000),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
//
// ```sh
//  $ pulumi import rancher2:index/clusterAlterRule:ClusterAlterRule foo &lt;CLUSTER_ALERT_RULE_ID&gt;
// ```
//
// Deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule
type ClusterAlterRule struct {
	pulumi.CustomResourceState

	// The cluster alert rule annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrOutput `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrOutput `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlterRuleMetricRulePtrOutput `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrOutput `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrOutput `pulumi:"systemServiceRule"`
}

// NewClusterAlterRule registers a new resource with the given unique name, arguments, and options.
func NewClusterAlterRule(ctx *pulumi.Context,
	name string, args *ClusterAlterRuleArgs, opts ...pulumi.ResourceOption) (*ClusterAlterRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	var resource ClusterAlterRule
	err := ctx.RegisterResource("rancher2:index/clusterAlterRule:ClusterAlterRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlterRule gets an existing ClusterAlterRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlterRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAlterRuleState, opts ...pulumi.ResourceOption) (*ClusterAlterRule, error) {
	var resource ClusterAlterRule
	err := ctx.ReadResource("rancher2:index/clusterAlterRule:ClusterAlterRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlterRule resources.
type clusterAlterRuleState struct {
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId *string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId *string `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

type ClusterAlterRuleState struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringPtrInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrInput
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringPtrInput
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The cluster alert rule labels (map)
	Labels pulumi.MapInput
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleState)(nil)).Elem()
}

type clusterAlterRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

// The set of arguments for constructing a ClusterAlterRule resource.
type ClusterAlterRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrInput
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringInput
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The cluster alert rule labels (map)
	Labels pulumi.MapInput
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleArgs)(nil)).Elem()
}

type ClusterAlterRuleInput interface {
	pulumi.Input

	ToClusterAlterRuleOutput() ClusterAlterRuleOutput
	ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput
}

func (*ClusterAlterRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlterRule)(nil)).Elem()
}

func (i *ClusterAlterRule) ToClusterAlterRuleOutput() ClusterAlterRuleOutput {
	return i.ToClusterAlterRuleOutputWithContext(context.Background())
}

func (i *ClusterAlterRule) ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleOutput)
}

// ClusterAlterRuleArrayInput is an input type that accepts ClusterAlterRuleArray and ClusterAlterRuleArrayOutput values.
// You can construct a concrete instance of `ClusterAlterRuleArrayInput` via:
//
//          ClusterAlterRuleArray{ ClusterAlterRuleArgs{...} }
type ClusterAlterRuleArrayInput interface {
	pulumi.Input

	ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput
	ToClusterAlterRuleArrayOutputWithContext(context.Context) ClusterAlterRuleArrayOutput
}

type ClusterAlterRuleArray []ClusterAlterRuleInput

func (ClusterAlterRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlterRule)(nil)).Elem()
}

func (i ClusterAlterRuleArray) ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput {
	return i.ToClusterAlterRuleArrayOutputWithContext(context.Background())
}

func (i ClusterAlterRuleArray) ToClusterAlterRuleArrayOutputWithContext(ctx context.Context) ClusterAlterRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleArrayOutput)
}

// ClusterAlterRuleMapInput is an input type that accepts ClusterAlterRuleMap and ClusterAlterRuleMapOutput values.
// You can construct a concrete instance of `ClusterAlterRuleMapInput` via:
//
//          ClusterAlterRuleMap{ "key": ClusterAlterRuleArgs{...} }
type ClusterAlterRuleMapInput interface {
	pulumi.Input

	ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput
	ToClusterAlterRuleMapOutputWithContext(context.Context) ClusterAlterRuleMapOutput
}

type ClusterAlterRuleMap map[string]ClusterAlterRuleInput

func (ClusterAlterRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlterRule)(nil)).Elem()
}

func (i ClusterAlterRuleMap) ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput {
	return i.ToClusterAlterRuleMapOutputWithContext(context.Background())
}

func (i ClusterAlterRuleMap) ToClusterAlterRuleMapOutputWithContext(ctx context.Context) ClusterAlterRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleMapOutput)
}

type ClusterAlterRuleOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleOutput) ToClusterAlterRuleOutput() ClusterAlterRuleOutput {
	return o
}

func (o ClusterAlterRuleOutput) ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput {
	return o
}

type ClusterAlterRuleArrayOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleArrayOutput) ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput {
	return o
}

func (o ClusterAlterRuleArrayOutput) ToClusterAlterRuleArrayOutputWithContext(ctx context.Context) ClusterAlterRuleArrayOutput {
	return o
}

func (o ClusterAlterRuleArrayOutput) Index(i pulumi.IntInput) ClusterAlterRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterAlterRule {
		return vs[0].([]*ClusterAlterRule)[vs[1].(int)]
	}).(ClusterAlterRuleOutput)
}

type ClusterAlterRuleMapOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleMapOutput) ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput {
	return o
}

func (o ClusterAlterRuleMapOutput) ToClusterAlterRuleMapOutputWithContext(ctx context.Context) ClusterAlterRuleMapOutput {
	return o
}

func (o ClusterAlterRuleMapOutput) MapIndex(k pulumi.StringInput) ClusterAlterRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterAlterRule {
		return vs[0].(map[string]*ClusterAlterRule)[vs[1].(string)]
	}).(ClusterAlterRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleInput)(nil)).Elem(), &ClusterAlterRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleArrayInput)(nil)).Elem(), ClusterAlterRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleMapInput)(nil)).Elem(), ClusterAlterRuleMap{})
	pulumi.RegisterOutputType(ClusterAlterRuleOutput{})
	pulumi.RegisterOutputType(ClusterAlterRuleArrayOutput{})
	pulumi.RegisterOutputType(ClusterAlterRuleMapOutput{})
}
