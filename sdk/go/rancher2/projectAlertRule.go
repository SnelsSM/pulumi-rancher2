// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			// Create a new Rancher2 Project
//			fooProject, err := rancher2.NewProject(ctx, "fooProject", &rancher2.ProjectArgs{
//				ClusterId:   pulumi.String("<cluster_id>"),
//				Description: pulumi.String("Terraform project "),
//				ResourceQuota: &rancher2.ProjectResourceQuotaArgs{
//					ProjectLimit: &rancher2.ProjectResourceQuotaProjectLimitArgs{
//						LimitsCpu:       pulumi.String("2000m"),
//						LimitsMemory:    pulumi.String("2000Mi"),
//						RequestsStorage: pulumi.String("2Gi"),
//					},
//					NamespaceDefaultLimit: &rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs{
//						LimitsCpu:       pulumi.String("500m"),
//						LimitsMemory:    pulumi.String("500Mi"),
//						RequestsStorage: pulumi.String("1Gi"),
//					},
//				},
//				ContainerResourceLimit: &rancher2.ProjectContainerResourceLimitArgs{
//					LimitsCpu:      pulumi.String("20m"),
//					LimitsMemory:   pulumi.String("20Mi"),
//					RequestsCpu:    pulumi.String("1m"),
//					RequestsMemory: pulumi.String("1Mi"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Create a new Rancher2 Project Alert Group
//			fooProjectAlertGroup, err := rancher2.NewProjectAlertGroup(ctx, "fooProjectAlertGroup", &rancher2.ProjectAlertGroupArgs{
//				Description:           pulumi.String("Terraform project alert group"),
//				ProjectId:             fooProject.ID(),
//				GroupIntervalSeconds:  pulumi.Int(300),
//				RepeatIntervalSeconds: pulumi.Int(3600),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a new Rancher2 Project Alert Rule
//			_, err = rancher2.NewProjectAlertRule(ctx, "fooProjectAlertRule", &rancher2.ProjectAlertRuleArgs{
//				ProjectId:             fooProjectAlertGroup.ProjectId,
//				GroupId:               fooProjectAlertGroup.ID(),
//				GroupIntervalSeconds:  pulumi.Int(600),
//				RepeatIntervalSeconds: pulumi.Int(6000),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// # Project Alert Rule can be imported using the Rancher project alert rule ID
//
// ```sh
// $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &lt;project_alert_rule_id&gt;
// ```
type ProjectAlertRule struct {
	pulumi.CustomResourceState

	// The project alert rule annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The project alert rule alert group ID (string)
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// The project alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrOutput `pulumi:"inherited"`
	// The project alert rule labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule ProjectAlertRuleMetricRulePtrOutput `pulumi:"metricRule"`
	// The project alert rule name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule ProjectAlertRulePodRulePtrOutput `pulumi:"podRule"`
	// The project id where create project alert rule (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
	// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule ProjectAlertRuleWorkloadRulePtrOutput `pulumi:"workloadRule"`
}

// NewProjectAlertRule registers a new resource with the given unique name, arguments, and options.
func NewProjectAlertRule(ctx *pulumi.Context,
	name string, args *ProjectAlertRuleArgs, opts ...pulumi.ResourceOption) (*ProjectAlertRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectAlertRule
	err := ctx.RegisterResource("rancher2:index/projectAlertRule:ProjectAlertRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectAlertRule gets an existing ProjectAlertRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectAlertRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectAlertRuleState, opts ...pulumi.ResourceOption) (*ProjectAlertRule, error) {
	var resource ProjectAlertRule
	err := ctx.ReadResource("rancher2:index/projectAlertRule:ProjectAlertRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectAlertRule resources.
type projectAlertRuleState struct {
	// The project alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The project alert rule alert group ID (string)
	GroupId *string `pulumi:"groupId"`
	// The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The project alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The project alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule *ProjectAlertRuleMetricRule `pulumi:"metricRule"`
	// The project alert rule name (string)
	Name *string `pulumi:"name"`
	// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule *ProjectAlertRulePodRule `pulumi:"podRule"`
	// The project id where create project alert rule (string)
	ProjectId *string `pulumi:"projectId"`
	// The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule *ProjectAlertRuleWorkloadRule `pulumi:"workloadRule"`
}

type ProjectAlertRuleState struct {
	// The project alert rule annotations (map)
	Annotations pulumi.MapInput
	// The project alert rule alert group ID (string)
	GroupId pulumi.StringPtrInput
	// The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The project alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The project alert rule labels (map)
	Labels pulumi.MapInput
	// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule ProjectAlertRuleMetricRulePtrInput
	// The project alert rule name (string)
	Name pulumi.StringPtrInput
	// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule ProjectAlertRulePodRulePtrInput
	// The project id where create project alert rule (string)
	ProjectId pulumi.StringPtrInput
	// The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule ProjectAlertRuleWorkloadRulePtrInput
}

func (ProjectAlertRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAlertRuleState)(nil)).Elem()
}

type projectAlertRuleArgs struct {
	// The project alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The project alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The project alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The project alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule *ProjectAlertRuleMetricRule `pulumi:"metricRule"`
	// The project alert rule name (string)
	Name *string `pulumi:"name"`
	// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule *ProjectAlertRulePodRule `pulumi:"podRule"`
	// The project id where create project alert rule (string)
	ProjectId string `pulumi:"projectId"`
	// The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule *ProjectAlertRuleWorkloadRule `pulumi:"workloadRule"`
}

// The set of arguments for constructing a ProjectAlertRule resource.
type ProjectAlertRuleArgs struct {
	// The project alert rule annotations (map)
	Annotations pulumi.MapInput
	// The project alert rule alert group ID (string)
	GroupId pulumi.StringInput
	// The project alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The project alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The project alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The project alert rule labels (map)
	Labels pulumi.MapInput
	// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
	MetricRule ProjectAlertRuleMetricRulePtrInput
	// The project alert rule name (string)
	Name pulumi.StringPtrInput
	// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
	PodRule ProjectAlertRulePodRulePtrInput
	// The project id where create project alert rule (string)
	ProjectId pulumi.StringInput
	// The project alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
	WorkloadRule ProjectAlertRuleWorkloadRulePtrInput
}

func (ProjectAlertRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAlertRuleArgs)(nil)).Elem()
}

type ProjectAlertRuleInput interface {
	pulumi.Input

	ToProjectAlertRuleOutput() ProjectAlertRuleOutput
	ToProjectAlertRuleOutputWithContext(ctx context.Context) ProjectAlertRuleOutput
}

func (*ProjectAlertRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAlertRule)(nil)).Elem()
}

func (i *ProjectAlertRule) ToProjectAlertRuleOutput() ProjectAlertRuleOutput {
	return i.ToProjectAlertRuleOutputWithContext(context.Background())
}

func (i *ProjectAlertRule) ToProjectAlertRuleOutputWithContext(ctx context.Context) ProjectAlertRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertRuleOutput)
}

// ProjectAlertRuleArrayInput is an input type that accepts ProjectAlertRuleArray and ProjectAlertRuleArrayOutput values.
// You can construct a concrete instance of `ProjectAlertRuleArrayInput` via:
//
//	ProjectAlertRuleArray{ ProjectAlertRuleArgs{...} }
type ProjectAlertRuleArrayInput interface {
	pulumi.Input

	ToProjectAlertRuleArrayOutput() ProjectAlertRuleArrayOutput
	ToProjectAlertRuleArrayOutputWithContext(context.Context) ProjectAlertRuleArrayOutput
}

type ProjectAlertRuleArray []ProjectAlertRuleInput

func (ProjectAlertRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAlertRule)(nil)).Elem()
}

func (i ProjectAlertRuleArray) ToProjectAlertRuleArrayOutput() ProjectAlertRuleArrayOutput {
	return i.ToProjectAlertRuleArrayOutputWithContext(context.Background())
}

func (i ProjectAlertRuleArray) ToProjectAlertRuleArrayOutputWithContext(ctx context.Context) ProjectAlertRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertRuleArrayOutput)
}

// ProjectAlertRuleMapInput is an input type that accepts ProjectAlertRuleMap and ProjectAlertRuleMapOutput values.
// You can construct a concrete instance of `ProjectAlertRuleMapInput` via:
//
//	ProjectAlertRuleMap{ "key": ProjectAlertRuleArgs{...} }
type ProjectAlertRuleMapInput interface {
	pulumi.Input

	ToProjectAlertRuleMapOutput() ProjectAlertRuleMapOutput
	ToProjectAlertRuleMapOutputWithContext(context.Context) ProjectAlertRuleMapOutput
}

type ProjectAlertRuleMap map[string]ProjectAlertRuleInput

func (ProjectAlertRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAlertRule)(nil)).Elem()
}

func (i ProjectAlertRuleMap) ToProjectAlertRuleMapOutput() ProjectAlertRuleMapOutput {
	return i.ToProjectAlertRuleMapOutputWithContext(context.Background())
}

func (i ProjectAlertRuleMap) ToProjectAlertRuleMapOutputWithContext(ctx context.Context) ProjectAlertRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertRuleMapOutput)
}

type ProjectAlertRuleOutput struct{ *pulumi.OutputState }

func (ProjectAlertRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAlertRule)(nil)).Elem()
}

func (o ProjectAlertRuleOutput) ToProjectAlertRuleOutput() ProjectAlertRuleOutput {
	return o
}

func (o ProjectAlertRuleOutput) ToProjectAlertRuleOutputWithContext(ctx context.Context) ProjectAlertRuleOutput {
	return o
}

// The project alert rule annotations (map)
func (o ProjectAlertRuleOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The project alert rule alert group ID (string)
func (o ProjectAlertRuleOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The project alert rule group interval seconds. Default: `180` (int)
func (o ProjectAlertRuleOutput) GroupIntervalSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.IntPtrOutput { return v.GroupIntervalSeconds }).(pulumi.IntPtrOutput)
}

// The project alert rule group wait seconds. Default: `180` (int)
func (o ProjectAlertRuleOutput) GroupWaitSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.IntPtrOutput { return v.GroupWaitSeconds }).(pulumi.IntPtrOutput)
}

// The project alert rule inherited. Default: `true` (bool)
func (o ProjectAlertRuleOutput) Inherited() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.BoolPtrOutput { return v.Inherited }).(pulumi.BoolPtrOutput)
}

// The project alert rule labels (map)
func (o ProjectAlertRuleOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"“ (list Maxitems:1)
func (o ProjectAlertRuleOutput) MetricRule() ProjectAlertRuleMetricRulePtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) ProjectAlertRuleMetricRulePtrOutput { return v.MetricRule }).(ProjectAlertRuleMetricRulePtrOutput)
}

// The project alert rule name (string)
func (o ProjectAlertRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"“ (list Maxitems:1)
func (o ProjectAlertRuleOutput) PodRule() ProjectAlertRulePodRulePtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) ProjectAlertRulePodRulePtrOutput { return v.PodRule }).(ProjectAlertRulePodRulePtrOutput)
}

// The project id where create project alert rule (string)
func (o ProjectAlertRuleOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The project alert rule wait seconds. Default: `3600` (int)
func (o ProjectAlertRuleOutput) RepeatIntervalSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.IntPtrOutput { return v.RepeatIntervalSeconds }).(pulumi.IntPtrOutput)
}

// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
func (o ProjectAlertRuleOutput) Severity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) pulumi.StringPtrOutput { return v.Severity }).(pulumi.StringPtrOutput)
}

// The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"“ (list Maxitems:1)
func (o ProjectAlertRuleOutput) WorkloadRule() ProjectAlertRuleWorkloadRulePtrOutput {
	return o.ApplyT(func(v *ProjectAlertRule) ProjectAlertRuleWorkloadRulePtrOutput { return v.WorkloadRule }).(ProjectAlertRuleWorkloadRulePtrOutput)
}

type ProjectAlertRuleArrayOutput struct{ *pulumi.OutputState }

func (ProjectAlertRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAlertRule)(nil)).Elem()
}

func (o ProjectAlertRuleArrayOutput) ToProjectAlertRuleArrayOutput() ProjectAlertRuleArrayOutput {
	return o
}

func (o ProjectAlertRuleArrayOutput) ToProjectAlertRuleArrayOutputWithContext(ctx context.Context) ProjectAlertRuleArrayOutput {
	return o
}

func (o ProjectAlertRuleArrayOutput) Index(i pulumi.IntInput) ProjectAlertRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectAlertRule {
		return vs[0].([]*ProjectAlertRule)[vs[1].(int)]
	}).(ProjectAlertRuleOutput)
}

type ProjectAlertRuleMapOutput struct{ *pulumi.OutputState }

func (ProjectAlertRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAlertRule)(nil)).Elem()
}

func (o ProjectAlertRuleMapOutput) ToProjectAlertRuleMapOutput() ProjectAlertRuleMapOutput {
	return o
}

func (o ProjectAlertRuleMapOutput) ToProjectAlertRuleMapOutputWithContext(ctx context.Context) ProjectAlertRuleMapOutput {
	return o
}

func (o ProjectAlertRuleMapOutput) MapIndex(k pulumi.StringInput) ProjectAlertRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectAlertRule {
		return vs[0].(map[string]*ProjectAlertRule)[vs[1].(string)]
	}).(ProjectAlertRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertRuleInput)(nil)).Elem(), &ProjectAlertRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertRuleArrayInput)(nil)).Elem(), ProjectAlertRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertRuleMapInput)(nil)).Elem(), ProjectAlertRuleMap{})
	pulumi.RegisterOutputType(ProjectAlertRuleOutput{})
	pulumi.RegisterOutputType(ProjectAlertRuleArrayOutput{})
	pulumi.RegisterOutputType(ProjectAlertRuleMapOutput{})
}
