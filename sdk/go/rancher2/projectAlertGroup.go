// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Project Alert Group resource. This can be used to create Project Alert Group for Rancher v2 environments and retrieve their information.
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
// 		_, err := rancher2.NewProjectAlertGroup(ctx, "foo", &rancher2.ProjectAlertGroupArgs{
// 			Description:           pulumi.String("Terraform project alert group"),
// 			GroupIntervalSeconds:  pulumi.Int(300),
// 			ProjectId:             pulumi.String("<project_id>"),
// 			RepeatIntervalSeconds: pulumi.Int(3600),
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
// Project Alert Group can be imported using the Rancher project alert group ID
//
// ```sh
//  $ pulumi import rancher2:index/projectAlertGroup:ProjectAlertGroup foo &lt;project_alert_group_id&gt;
// ```
type ProjectAlertGroup struct {
	pulumi.CustomResourceState

	// The project alert group annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The project alert group description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The project alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The project alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// The project alert group labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The project alert group name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project id where create project alert group (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The project alert group recipients (list)
	Recipients ProjectAlertGroupRecipientArrayOutput `pulumi:"recipients"`
	// The project alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
}

// NewProjectAlertGroup registers a new resource with the given unique name, arguments, and options.
func NewProjectAlertGroup(ctx *pulumi.Context,
	name string, args *ProjectAlertGroupArgs, opts ...pulumi.ResourceOption) (*ProjectAlertGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource ProjectAlertGroup
	err := ctx.RegisterResource("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectAlertGroup gets an existing ProjectAlertGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectAlertGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectAlertGroupState, opts ...pulumi.ResourceOption) (*ProjectAlertGroup, error) {
	var resource ProjectAlertGroup
	err := ctx.ReadResource("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectAlertGroup resources.
type projectAlertGroupState struct {
	// The project alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The project alert group description (string)
	Description *string `pulumi:"description"`
	// The project alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The project alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The project alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The project alert group name (string)
	Name *string `pulumi:"name"`
	// The project id where create project alert group (string)
	ProjectId *string `pulumi:"projectId"`
	// The project alert group recipients (list)
	Recipients []ProjectAlertGroupRecipient `pulumi:"recipients"`
	// The project alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

type ProjectAlertGroupState struct {
	// The project alert group annotations (map)
	Annotations pulumi.MapInput
	// The project alert group description (string)
	Description pulumi.StringPtrInput
	// The project alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The project alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The project alert group labels (map)
	Labels pulumi.MapInput
	// The project alert group name (string)
	Name pulumi.StringPtrInput
	// The project id where create project alert group (string)
	ProjectId pulumi.StringPtrInput
	// The project alert group recipients (list)
	Recipients ProjectAlertGroupRecipientArrayInput
	// The project alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ProjectAlertGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAlertGroupState)(nil)).Elem()
}

type projectAlertGroupArgs struct {
	// The project alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The project alert group description (string)
	Description *string `pulumi:"description"`
	// The project alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The project alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The project alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The project alert group name (string)
	Name *string `pulumi:"name"`
	// The project id where create project alert group (string)
	ProjectId string `pulumi:"projectId"`
	// The project alert group recipients (list)
	Recipients []ProjectAlertGroupRecipient `pulumi:"recipients"`
	// The project alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

// The set of arguments for constructing a ProjectAlertGroup resource.
type ProjectAlertGroupArgs struct {
	// The project alert group annotations (map)
	Annotations pulumi.MapInput
	// The project alert group description (string)
	Description pulumi.StringPtrInput
	// The project alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The project alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The project alert group labels (map)
	Labels pulumi.MapInput
	// The project alert group name (string)
	Name pulumi.StringPtrInput
	// The project id where create project alert group (string)
	ProjectId pulumi.StringInput
	// The project alert group recipients (list)
	Recipients ProjectAlertGroupRecipientArrayInput
	// The project alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ProjectAlertGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectAlertGroupArgs)(nil)).Elem()
}

type ProjectAlertGroupInput interface {
	pulumi.Input

	ToProjectAlertGroupOutput() ProjectAlertGroupOutput
	ToProjectAlertGroupOutputWithContext(ctx context.Context) ProjectAlertGroupOutput
}

func (*ProjectAlertGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAlertGroup)(nil)).Elem()
}

func (i *ProjectAlertGroup) ToProjectAlertGroupOutput() ProjectAlertGroupOutput {
	return i.ToProjectAlertGroupOutputWithContext(context.Background())
}

func (i *ProjectAlertGroup) ToProjectAlertGroupOutputWithContext(ctx context.Context) ProjectAlertGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertGroupOutput)
}

// ProjectAlertGroupArrayInput is an input type that accepts ProjectAlertGroupArray and ProjectAlertGroupArrayOutput values.
// You can construct a concrete instance of `ProjectAlertGroupArrayInput` via:
//
//          ProjectAlertGroupArray{ ProjectAlertGroupArgs{...} }
type ProjectAlertGroupArrayInput interface {
	pulumi.Input

	ToProjectAlertGroupArrayOutput() ProjectAlertGroupArrayOutput
	ToProjectAlertGroupArrayOutputWithContext(context.Context) ProjectAlertGroupArrayOutput
}

type ProjectAlertGroupArray []ProjectAlertGroupInput

func (ProjectAlertGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAlertGroup)(nil)).Elem()
}

func (i ProjectAlertGroupArray) ToProjectAlertGroupArrayOutput() ProjectAlertGroupArrayOutput {
	return i.ToProjectAlertGroupArrayOutputWithContext(context.Background())
}

func (i ProjectAlertGroupArray) ToProjectAlertGroupArrayOutputWithContext(ctx context.Context) ProjectAlertGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertGroupArrayOutput)
}

// ProjectAlertGroupMapInput is an input type that accepts ProjectAlertGroupMap and ProjectAlertGroupMapOutput values.
// You can construct a concrete instance of `ProjectAlertGroupMapInput` via:
//
//          ProjectAlertGroupMap{ "key": ProjectAlertGroupArgs{...} }
type ProjectAlertGroupMapInput interface {
	pulumi.Input

	ToProjectAlertGroupMapOutput() ProjectAlertGroupMapOutput
	ToProjectAlertGroupMapOutputWithContext(context.Context) ProjectAlertGroupMapOutput
}

type ProjectAlertGroupMap map[string]ProjectAlertGroupInput

func (ProjectAlertGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAlertGroup)(nil)).Elem()
}

func (i ProjectAlertGroupMap) ToProjectAlertGroupMapOutput() ProjectAlertGroupMapOutput {
	return i.ToProjectAlertGroupMapOutputWithContext(context.Background())
}

func (i ProjectAlertGroupMap) ToProjectAlertGroupMapOutputWithContext(ctx context.Context) ProjectAlertGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectAlertGroupMapOutput)
}

type ProjectAlertGroupOutput struct{ *pulumi.OutputState }

func (ProjectAlertGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectAlertGroup)(nil)).Elem()
}

func (o ProjectAlertGroupOutput) ToProjectAlertGroupOutput() ProjectAlertGroupOutput {
	return o
}

func (o ProjectAlertGroupOutput) ToProjectAlertGroupOutputWithContext(ctx context.Context) ProjectAlertGroupOutput {
	return o
}

type ProjectAlertGroupArrayOutput struct{ *pulumi.OutputState }

func (ProjectAlertGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectAlertGroup)(nil)).Elem()
}

func (o ProjectAlertGroupArrayOutput) ToProjectAlertGroupArrayOutput() ProjectAlertGroupArrayOutput {
	return o
}

func (o ProjectAlertGroupArrayOutput) ToProjectAlertGroupArrayOutputWithContext(ctx context.Context) ProjectAlertGroupArrayOutput {
	return o
}

func (o ProjectAlertGroupArrayOutput) Index(i pulumi.IntInput) ProjectAlertGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectAlertGroup {
		return vs[0].([]*ProjectAlertGroup)[vs[1].(int)]
	}).(ProjectAlertGroupOutput)
}

type ProjectAlertGroupMapOutput struct{ *pulumi.OutputState }

func (ProjectAlertGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectAlertGroup)(nil)).Elem()
}

func (o ProjectAlertGroupMapOutput) ToProjectAlertGroupMapOutput() ProjectAlertGroupMapOutput {
	return o
}

func (o ProjectAlertGroupMapOutput) ToProjectAlertGroupMapOutputWithContext(ctx context.Context) ProjectAlertGroupMapOutput {
	return o
}

func (o ProjectAlertGroupMapOutput) MapIndex(k pulumi.StringInput) ProjectAlertGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectAlertGroup {
		return vs[0].(map[string]*ProjectAlertGroup)[vs[1].(string)]
	}).(ProjectAlertGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertGroupInput)(nil)).Elem(), &ProjectAlertGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertGroupArrayInput)(nil)).Elem(), ProjectAlertGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectAlertGroupMapInput)(nil)).Elem(), ProjectAlertGroupMap{})
	pulumi.RegisterOutputType(ProjectAlertGroupOutput{})
	pulumi.RegisterOutputType(ProjectAlertGroupArrayOutput{})
	pulumi.RegisterOutputType(ProjectAlertGroupMapOutput{})
}
