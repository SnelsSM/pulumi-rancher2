// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.
//
// `cluster` and `project` scopes are supported for role templates.
//
// ## Import
//
// # Role Template can be imported using the Rancher Role Template ID
//
// ```sh
//
//	$ pulumi import rancher2:index/roleTemplate:RoleTemplate foo &lt;role_template_id&gt;
//
// ```
type RoleTemplate struct {
	pulumi.CustomResourceState

	// Administrative role template. Default `false` (bool)
	Administrative pulumi.BoolPtrOutput `pulumi:"administrative"`
	// Annotations for role template object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// (Computed) Builtin role template (string)
	Builtin pulumi.BoolOutput `pulumi:"builtin"`
	// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
	Context pulumi.StringPtrOutput `pulumi:"context"`
	// Default role template for new created cluster or project. Default `false` (bool)
	DefaultRole pulumi.BoolPtrOutput `pulumi:"defaultRole"`
	// Role template description (string)
	Description pulumi.StringOutput `pulumi:"description"`
	// External role template. Default `false` (bool)
	External pulumi.BoolPtrOutput `pulumi:"external"`
	// Hidden role template. Default `false` (bool)
	Hidden pulumi.BoolPtrOutput `pulumi:"hidden"`
	// Labels for role template object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Locked role template. Default `false` (bool)
	Locked pulumi.BoolPtrOutput `pulumi:"locked"`
	// Role template name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Inherit role template IDs (list)
	RoleTemplateIds pulumi.StringArrayOutput `pulumi:"roleTemplateIds"`
	// Role template policy rules (list)
	Rules RoleTemplateRuleArrayOutput `pulumi:"rules"`
}

// NewRoleTemplate registers a new resource with the given unique name, arguments, and options.
func NewRoleTemplate(ctx *pulumi.Context,
	name string, args *RoleTemplateArgs, opts ...pulumi.ResourceOption) (*RoleTemplate, error) {
	if args == nil {
		args = &RoleTemplateArgs{}
	}

	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("rancher2:index/roleTempalte:RoleTempalte"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoleTemplate
	err := ctx.RegisterResource("rancher2:index/roleTemplate:RoleTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleTemplate gets an existing RoleTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleTemplateState, opts ...pulumi.ResourceOption) (*RoleTemplate, error) {
	var resource RoleTemplate
	err := ctx.ReadResource("rancher2:index/roleTemplate:RoleTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleTemplate resources.
type roleTemplateState struct {
	// Administrative role template. Default `false` (bool)
	Administrative *bool `pulumi:"administrative"`
	// Annotations for role template object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Builtin role template (string)
	Builtin *bool `pulumi:"builtin"`
	// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
	Context *string `pulumi:"context"`
	// Default role template for new created cluster or project. Default `false` (bool)
	DefaultRole *bool `pulumi:"defaultRole"`
	// Role template description (string)
	Description *string `pulumi:"description"`
	// External role template. Default `false` (bool)
	External *bool `pulumi:"external"`
	// Hidden role template. Default `false` (bool)
	Hidden *bool `pulumi:"hidden"`
	// Labels for role template object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Locked role template. Default `false` (bool)
	Locked *bool `pulumi:"locked"`
	// Role template name (string)
	Name *string `pulumi:"name"`
	// Inherit role template IDs (list)
	RoleTemplateIds []string `pulumi:"roleTemplateIds"`
	// Role template policy rules (list)
	Rules []RoleTemplateRule `pulumi:"rules"`
}

type RoleTemplateState struct {
	// Administrative role template. Default `false` (bool)
	Administrative pulumi.BoolPtrInput
	// Annotations for role template object (map)
	Annotations pulumi.MapInput
	// (Computed) Builtin role template (string)
	Builtin pulumi.BoolPtrInput
	// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
	Context pulumi.StringPtrInput
	// Default role template for new created cluster or project. Default `false` (bool)
	DefaultRole pulumi.BoolPtrInput
	// Role template description (string)
	Description pulumi.StringPtrInput
	// External role template. Default `false` (bool)
	External pulumi.BoolPtrInput
	// Hidden role template. Default `false` (bool)
	Hidden pulumi.BoolPtrInput
	// Labels for role template object (map)
	Labels pulumi.MapInput
	// Locked role template. Default `false` (bool)
	Locked pulumi.BoolPtrInput
	// Role template name (string)
	Name pulumi.StringPtrInput
	// Inherit role template IDs (list)
	RoleTemplateIds pulumi.StringArrayInput
	// Role template policy rules (list)
	Rules RoleTemplateRuleArrayInput
}

func (RoleTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleTemplateState)(nil)).Elem()
}

type roleTemplateArgs struct {
	// Administrative role template. Default `false` (bool)
	Administrative *bool `pulumi:"administrative"`
	// Annotations for role template object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
	Context *string `pulumi:"context"`
	// Default role template for new created cluster or project. Default `false` (bool)
	DefaultRole *bool `pulumi:"defaultRole"`
	// Role template description (string)
	Description *string `pulumi:"description"`
	// External role template. Default `false` (bool)
	External *bool `pulumi:"external"`
	// Hidden role template. Default `false` (bool)
	Hidden *bool `pulumi:"hidden"`
	// Labels for role template object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Locked role template. Default `false` (bool)
	Locked *bool `pulumi:"locked"`
	// Role template name (string)
	Name *string `pulumi:"name"`
	// Inherit role template IDs (list)
	RoleTemplateIds []string `pulumi:"roleTemplateIds"`
	// Role template policy rules (list)
	Rules []RoleTemplateRule `pulumi:"rules"`
}

// The set of arguments for constructing a RoleTemplate resource.
type RoleTemplateArgs struct {
	// Administrative role template. Default `false` (bool)
	Administrative pulumi.BoolPtrInput
	// Annotations for role template object (map)
	Annotations pulumi.MapInput
	// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
	Context pulumi.StringPtrInput
	// Default role template for new created cluster or project. Default `false` (bool)
	DefaultRole pulumi.BoolPtrInput
	// Role template description (string)
	Description pulumi.StringPtrInput
	// External role template. Default `false` (bool)
	External pulumi.BoolPtrInput
	// Hidden role template. Default `false` (bool)
	Hidden pulumi.BoolPtrInput
	// Labels for role template object (map)
	Labels pulumi.MapInput
	// Locked role template. Default `false` (bool)
	Locked pulumi.BoolPtrInput
	// Role template name (string)
	Name pulumi.StringPtrInput
	// Inherit role template IDs (list)
	RoleTemplateIds pulumi.StringArrayInput
	// Role template policy rules (list)
	Rules RoleTemplateRuleArrayInput
}

func (RoleTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleTemplateArgs)(nil)).Elem()
}

type RoleTemplateInput interface {
	pulumi.Input

	ToRoleTemplateOutput() RoleTemplateOutput
	ToRoleTemplateOutputWithContext(ctx context.Context) RoleTemplateOutput
}

func (*RoleTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleTemplate)(nil)).Elem()
}

func (i *RoleTemplate) ToRoleTemplateOutput() RoleTemplateOutput {
	return i.ToRoleTemplateOutputWithContext(context.Background())
}

func (i *RoleTemplate) ToRoleTemplateOutputWithContext(ctx context.Context) RoleTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTemplateOutput)
}

func (i *RoleTemplate) ToOutput(ctx context.Context) pulumix.Output[*RoleTemplate] {
	return pulumix.Output[*RoleTemplate]{
		OutputState: i.ToRoleTemplateOutputWithContext(ctx).OutputState,
	}
}

// RoleTemplateArrayInput is an input type that accepts RoleTemplateArray and RoleTemplateArrayOutput values.
// You can construct a concrete instance of `RoleTemplateArrayInput` via:
//
//	RoleTemplateArray{ RoleTemplateArgs{...} }
type RoleTemplateArrayInput interface {
	pulumi.Input

	ToRoleTemplateArrayOutput() RoleTemplateArrayOutput
	ToRoleTemplateArrayOutputWithContext(context.Context) RoleTemplateArrayOutput
}

type RoleTemplateArray []RoleTemplateInput

func (RoleTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleTemplate)(nil)).Elem()
}

func (i RoleTemplateArray) ToRoleTemplateArrayOutput() RoleTemplateArrayOutput {
	return i.ToRoleTemplateArrayOutputWithContext(context.Background())
}

func (i RoleTemplateArray) ToRoleTemplateArrayOutputWithContext(ctx context.Context) RoleTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTemplateArrayOutput)
}

func (i RoleTemplateArray) ToOutput(ctx context.Context) pulumix.Output[[]*RoleTemplate] {
	return pulumix.Output[[]*RoleTemplate]{
		OutputState: i.ToRoleTemplateArrayOutputWithContext(ctx).OutputState,
	}
}

// RoleTemplateMapInput is an input type that accepts RoleTemplateMap and RoleTemplateMapOutput values.
// You can construct a concrete instance of `RoleTemplateMapInput` via:
//
//	RoleTemplateMap{ "key": RoleTemplateArgs{...} }
type RoleTemplateMapInput interface {
	pulumi.Input

	ToRoleTemplateMapOutput() RoleTemplateMapOutput
	ToRoleTemplateMapOutputWithContext(context.Context) RoleTemplateMapOutput
}

type RoleTemplateMap map[string]RoleTemplateInput

func (RoleTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleTemplate)(nil)).Elem()
}

func (i RoleTemplateMap) ToRoleTemplateMapOutput() RoleTemplateMapOutput {
	return i.ToRoleTemplateMapOutputWithContext(context.Background())
}

func (i RoleTemplateMap) ToRoleTemplateMapOutputWithContext(ctx context.Context) RoleTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTemplateMapOutput)
}

func (i RoleTemplateMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleTemplate] {
	return pulumix.Output[map[string]*RoleTemplate]{
		OutputState: i.ToRoleTemplateMapOutputWithContext(ctx).OutputState,
	}
}

type RoleTemplateOutput struct{ *pulumi.OutputState }

func (RoleTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleTemplate)(nil)).Elem()
}

func (o RoleTemplateOutput) ToRoleTemplateOutput() RoleTemplateOutput {
	return o
}

func (o RoleTemplateOutput) ToRoleTemplateOutputWithContext(ctx context.Context) RoleTemplateOutput {
	return o
}

func (o RoleTemplateOutput) ToOutput(ctx context.Context) pulumix.Output[*RoleTemplate] {
	return pulumix.Output[*RoleTemplate]{
		OutputState: o.OutputState,
	}
}

// Administrative role template. Default `false` (bool)
func (o RoleTemplateOutput) Administrative() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolPtrOutput { return v.Administrative }).(pulumi.BoolPtrOutput)
}

// Annotations for role template object (map)
func (o RoleTemplateOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Builtin role template (string)
func (o RoleTemplateOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolOutput { return v.Builtin }).(pulumi.BoolOutput)
}

// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
func (o RoleTemplateOutput) Context() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.StringPtrOutput { return v.Context }).(pulumi.StringPtrOutput)
}

// Default role template for new created cluster or project. Default `false` (bool)
func (o RoleTemplateOutput) DefaultRole() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolPtrOutput { return v.DefaultRole }).(pulumi.BoolPtrOutput)
}

// Role template description (string)
func (o RoleTemplateOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// External role template. Default `false` (bool)
func (o RoleTemplateOutput) External() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolPtrOutput { return v.External }).(pulumi.BoolPtrOutput)
}

// Hidden role template. Default `false` (bool)
func (o RoleTemplateOutput) Hidden() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolPtrOutput { return v.Hidden }).(pulumi.BoolPtrOutput)
}

// Labels for role template object (map)
func (o RoleTemplateOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Locked role template. Default `false` (bool)
func (o RoleTemplateOutput) Locked() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.BoolPtrOutput { return v.Locked }).(pulumi.BoolPtrOutput)
}

// Role template name (string)
func (o RoleTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Inherit role template IDs (list)
func (o RoleTemplateOutput) RoleTemplateIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleTemplate) pulumi.StringArrayOutput { return v.RoleTemplateIds }).(pulumi.StringArrayOutput)
}

// Role template policy rules (list)
func (o RoleTemplateOutput) Rules() RoleTemplateRuleArrayOutput {
	return o.ApplyT(func(v *RoleTemplate) RoleTemplateRuleArrayOutput { return v.Rules }).(RoleTemplateRuleArrayOutput)
}

type RoleTemplateArrayOutput struct{ *pulumi.OutputState }

func (RoleTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleTemplate)(nil)).Elem()
}

func (o RoleTemplateArrayOutput) ToRoleTemplateArrayOutput() RoleTemplateArrayOutput {
	return o
}

func (o RoleTemplateArrayOutput) ToRoleTemplateArrayOutputWithContext(ctx context.Context) RoleTemplateArrayOutput {
	return o
}

func (o RoleTemplateArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*RoleTemplate] {
	return pulumix.Output[[]*RoleTemplate]{
		OutputState: o.OutputState,
	}
}

func (o RoleTemplateArrayOutput) Index(i pulumi.IntInput) RoleTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleTemplate {
		return vs[0].([]*RoleTemplate)[vs[1].(int)]
	}).(RoleTemplateOutput)
}

type RoleTemplateMapOutput struct{ *pulumi.OutputState }

func (RoleTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleTemplate)(nil)).Elem()
}

func (o RoleTemplateMapOutput) ToRoleTemplateMapOutput() RoleTemplateMapOutput {
	return o
}

func (o RoleTemplateMapOutput) ToRoleTemplateMapOutputWithContext(ctx context.Context) RoleTemplateMapOutput {
	return o
}

func (o RoleTemplateMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleTemplate] {
	return pulumix.Output[map[string]*RoleTemplate]{
		OutputState: o.OutputState,
	}
}

func (o RoleTemplateMapOutput) MapIndex(k pulumi.StringInput) RoleTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleTemplate {
		return vs[0].(map[string]*RoleTemplate)[vs[1].(string)]
	}).(RoleTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTemplateInput)(nil)).Elem(), &RoleTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTemplateArrayInput)(nil)).Elem(), RoleTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTemplateMapInput)(nil)).Elem(), RoleTemplateMap{})
	pulumi.RegisterOutputType(RoleTemplateOutput{})
	pulumi.RegisterOutputType(RoleTemplateArrayOutput{})
	pulumi.RegisterOutputType(RoleTemplateMapOutput{})
}
