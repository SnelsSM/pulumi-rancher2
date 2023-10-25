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
//	$ pulumi import rancher2:index/roleTempalte:RoleTempalte foo &lt;role_template_id&gt;
//
// ```
//
// Deprecated: rancher2.RoleTempalte has been deprecated in favor of rancher2.RoleTemplate
type RoleTempalte struct {
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
	Rules RoleTempalteRuleArrayOutput `pulumi:"rules"`
}

// NewRoleTempalte registers a new resource with the given unique name, arguments, and options.
func NewRoleTempalte(ctx *pulumi.Context,
	name string, args *RoleTempalteArgs, opts ...pulumi.ResourceOption) (*RoleTempalte, error) {
	if args == nil {
		args = &RoleTempalteArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoleTempalte
	err := ctx.RegisterResource("rancher2:index/roleTempalte:RoleTempalte", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleTempalte gets an existing RoleTempalte resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleTempalte(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleTempalteState, opts ...pulumi.ResourceOption) (*RoleTempalte, error) {
	var resource RoleTempalte
	err := ctx.ReadResource("rancher2:index/roleTempalte:RoleTempalte", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleTempalte resources.
type roleTempalteState struct {
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
	Rules []RoleTempalteRule `pulumi:"rules"`
}

type RoleTempalteState struct {
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
	Rules RoleTempalteRuleArrayInput
}

func (RoleTempalteState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleTempalteState)(nil)).Elem()
}

type roleTempalteArgs struct {
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
	Rules []RoleTempalteRule `pulumi:"rules"`
}

// The set of arguments for constructing a RoleTempalte resource.
type RoleTempalteArgs struct {
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
	Rules RoleTempalteRuleArrayInput
}

func (RoleTempalteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleTempalteArgs)(nil)).Elem()
}

type RoleTempalteInput interface {
	pulumi.Input

	ToRoleTempalteOutput() RoleTempalteOutput
	ToRoleTempalteOutputWithContext(ctx context.Context) RoleTempalteOutput
}

func (*RoleTempalte) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleTempalte)(nil)).Elem()
}

func (i *RoleTempalte) ToRoleTempalteOutput() RoleTempalteOutput {
	return i.ToRoleTempalteOutputWithContext(context.Background())
}

func (i *RoleTempalte) ToRoleTempalteOutputWithContext(ctx context.Context) RoleTempalteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTempalteOutput)
}

func (i *RoleTempalte) ToOutput(ctx context.Context) pulumix.Output[*RoleTempalte] {
	return pulumix.Output[*RoleTempalte]{
		OutputState: i.ToRoleTempalteOutputWithContext(ctx).OutputState,
	}
}

// RoleTempalteArrayInput is an input type that accepts RoleTempalteArray and RoleTempalteArrayOutput values.
// You can construct a concrete instance of `RoleTempalteArrayInput` via:
//
//	RoleTempalteArray{ RoleTempalteArgs{...} }
type RoleTempalteArrayInput interface {
	pulumi.Input

	ToRoleTempalteArrayOutput() RoleTempalteArrayOutput
	ToRoleTempalteArrayOutputWithContext(context.Context) RoleTempalteArrayOutput
}

type RoleTempalteArray []RoleTempalteInput

func (RoleTempalteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleTempalte)(nil)).Elem()
}

func (i RoleTempalteArray) ToRoleTempalteArrayOutput() RoleTempalteArrayOutput {
	return i.ToRoleTempalteArrayOutputWithContext(context.Background())
}

func (i RoleTempalteArray) ToRoleTempalteArrayOutputWithContext(ctx context.Context) RoleTempalteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTempalteArrayOutput)
}

func (i RoleTempalteArray) ToOutput(ctx context.Context) pulumix.Output[[]*RoleTempalte] {
	return pulumix.Output[[]*RoleTempalte]{
		OutputState: i.ToRoleTempalteArrayOutputWithContext(ctx).OutputState,
	}
}

// RoleTempalteMapInput is an input type that accepts RoleTempalteMap and RoleTempalteMapOutput values.
// You can construct a concrete instance of `RoleTempalteMapInput` via:
//
//	RoleTempalteMap{ "key": RoleTempalteArgs{...} }
type RoleTempalteMapInput interface {
	pulumi.Input

	ToRoleTempalteMapOutput() RoleTempalteMapOutput
	ToRoleTempalteMapOutputWithContext(context.Context) RoleTempalteMapOutput
}

type RoleTempalteMap map[string]RoleTempalteInput

func (RoleTempalteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleTempalte)(nil)).Elem()
}

func (i RoleTempalteMap) ToRoleTempalteMapOutput() RoleTempalteMapOutput {
	return i.ToRoleTempalteMapOutputWithContext(context.Background())
}

func (i RoleTempalteMap) ToRoleTempalteMapOutputWithContext(ctx context.Context) RoleTempalteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleTempalteMapOutput)
}

func (i RoleTempalteMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleTempalte] {
	return pulumix.Output[map[string]*RoleTempalte]{
		OutputState: i.ToRoleTempalteMapOutputWithContext(ctx).OutputState,
	}
}

type RoleTempalteOutput struct{ *pulumi.OutputState }

func (RoleTempalteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleTempalte)(nil)).Elem()
}

func (o RoleTempalteOutput) ToRoleTempalteOutput() RoleTempalteOutput {
	return o
}

func (o RoleTempalteOutput) ToRoleTempalteOutputWithContext(ctx context.Context) RoleTempalteOutput {
	return o
}

func (o RoleTempalteOutput) ToOutput(ctx context.Context) pulumix.Output[*RoleTempalte] {
	return pulumix.Output[*RoleTempalte]{
		OutputState: o.OutputState,
	}
}

// Administrative role template. Default `false` (bool)
func (o RoleTempalteOutput) Administrative() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolPtrOutput { return v.Administrative }).(pulumi.BoolPtrOutput)
}

// Annotations for role template object (map)
func (o RoleTempalteOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Builtin role template (string)
func (o RoleTempalteOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolOutput { return v.Builtin }).(pulumi.BoolOutput)
}

// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
func (o RoleTempalteOutput) Context() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.StringPtrOutput { return v.Context }).(pulumi.StringPtrOutput)
}

// Default role template for new created cluster or project. Default `false` (bool)
func (o RoleTempalteOutput) DefaultRole() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolPtrOutput { return v.DefaultRole }).(pulumi.BoolPtrOutput)
}

// Role template description (string)
func (o RoleTempalteOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// External role template. Default `false` (bool)
func (o RoleTempalteOutput) External() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolPtrOutput { return v.External }).(pulumi.BoolPtrOutput)
}

// Hidden role template. Default `false` (bool)
func (o RoleTempalteOutput) Hidden() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolPtrOutput { return v.Hidden }).(pulumi.BoolPtrOutput)
}

// Labels for role template object (map)
func (o RoleTempalteOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Locked role template. Default `false` (bool)
func (o RoleTempalteOutput) Locked() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.BoolPtrOutput { return v.Locked }).(pulumi.BoolPtrOutput)
}

// Role template name (string)
func (o RoleTempalteOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Inherit role template IDs (list)
func (o RoleTempalteOutput) RoleTemplateIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleTempalte) pulumi.StringArrayOutput { return v.RoleTemplateIds }).(pulumi.StringArrayOutput)
}

// Role template policy rules (list)
func (o RoleTempalteOutput) Rules() RoleTempalteRuleArrayOutput {
	return o.ApplyT(func(v *RoleTempalte) RoleTempalteRuleArrayOutput { return v.Rules }).(RoleTempalteRuleArrayOutput)
}

type RoleTempalteArrayOutput struct{ *pulumi.OutputState }

func (RoleTempalteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleTempalte)(nil)).Elem()
}

func (o RoleTempalteArrayOutput) ToRoleTempalteArrayOutput() RoleTempalteArrayOutput {
	return o
}

func (o RoleTempalteArrayOutput) ToRoleTempalteArrayOutputWithContext(ctx context.Context) RoleTempalteArrayOutput {
	return o
}

func (o RoleTempalteArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*RoleTempalte] {
	return pulumix.Output[[]*RoleTempalte]{
		OutputState: o.OutputState,
	}
}

func (o RoleTempalteArrayOutput) Index(i pulumi.IntInput) RoleTempalteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleTempalte {
		return vs[0].([]*RoleTempalte)[vs[1].(int)]
	}).(RoleTempalteOutput)
}

type RoleTempalteMapOutput struct{ *pulumi.OutputState }

func (RoleTempalteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleTempalte)(nil)).Elem()
}

func (o RoleTempalteMapOutput) ToRoleTempalteMapOutput() RoleTempalteMapOutput {
	return o
}

func (o RoleTempalteMapOutput) ToRoleTempalteMapOutputWithContext(ctx context.Context) RoleTempalteMapOutput {
	return o
}

func (o RoleTempalteMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleTempalte] {
	return pulumix.Output[map[string]*RoleTempalte]{
		OutputState: o.OutputState,
	}
}

func (o RoleTempalteMapOutput) MapIndex(k pulumi.StringInput) RoleTempalteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleTempalte {
		return vs[0].(map[string]*RoleTempalte)[vs[1].(string)]
	}).(RoleTempalteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTempalteInput)(nil)).Elem(), &RoleTempalte{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTempalteArrayInput)(nil)).Elem(), RoleTempalteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleTempalteMapInput)(nil)).Elem(), RoleTempalteMap{})
	pulumi.RegisterOutputType(RoleTempalteOutput{})
	pulumi.RegisterOutputType(RoleTempalteArrayOutput{})
	pulumi.RegisterOutputType(RoleTempalteMapOutput{})
}
