// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewFeature(ctx, "fleet", &rancher2.FeatureArgs{
//				Value: pulumi.Bool("<VALUE>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Feature struct {
	pulumi.CustomResourceState

	// Annotations for feature object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Labels for feature object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the feature (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The value of the feature. Default: `false` (bool)
	Value pulumi.BoolPtrOutput `pulumi:"value"`
}

// NewFeature registers a new resource with the given unique name, arguments, and options.
func NewFeature(ctx *pulumi.Context,
	name string, args *FeatureArgs, opts ...pulumi.ResourceOption) (*Feature, error) {
	if args == nil {
		args = &FeatureArgs{}
	}

	var resource Feature
	err := ctx.RegisterResource("rancher2:index/feature:Feature", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFeature gets an existing Feature resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFeature(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FeatureState, opts ...pulumi.ResourceOption) (*Feature, error) {
	var resource Feature
	err := ctx.ReadResource("rancher2:index/feature:Feature", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Feature resources.
type featureState struct {
	// Annotations for feature object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Labels for feature object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the feature (string)
	Name *string `pulumi:"name"`
	// The value of the feature. Default: `false` (bool)
	Value *bool `pulumi:"value"`
}

type FeatureState struct {
	// Annotations for feature object (map)
	Annotations pulumi.MapInput
	// Labels for feature object (map)
	Labels pulumi.MapInput
	// The name of the feature (string)
	Name pulumi.StringPtrInput
	// The value of the feature. Default: `false` (bool)
	Value pulumi.BoolPtrInput
}

func (FeatureState) ElementType() reflect.Type {
	return reflect.TypeOf((*featureState)(nil)).Elem()
}

type featureArgs struct {
	// Annotations for feature object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Labels for feature object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the feature (string)
	Name *string `pulumi:"name"`
	// The value of the feature. Default: `false` (bool)
	Value *bool `pulumi:"value"`
}

// The set of arguments for constructing a Feature resource.
type FeatureArgs struct {
	// Annotations for feature object (map)
	Annotations pulumi.MapInput
	// Labels for feature object (map)
	Labels pulumi.MapInput
	// The name of the feature (string)
	Name pulumi.StringPtrInput
	// The value of the feature. Default: `false` (bool)
	Value pulumi.BoolPtrInput
}

func (FeatureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*featureArgs)(nil)).Elem()
}

type FeatureInput interface {
	pulumi.Input

	ToFeatureOutput() FeatureOutput
	ToFeatureOutputWithContext(ctx context.Context) FeatureOutput
}

func (*Feature) ElementType() reflect.Type {
	return reflect.TypeOf((**Feature)(nil)).Elem()
}

func (i *Feature) ToFeatureOutput() FeatureOutput {
	return i.ToFeatureOutputWithContext(context.Background())
}

func (i *Feature) ToFeatureOutputWithContext(ctx context.Context) FeatureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureOutput)
}

// FeatureArrayInput is an input type that accepts FeatureArray and FeatureArrayOutput values.
// You can construct a concrete instance of `FeatureArrayInput` via:
//
//	FeatureArray{ FeatureArgs{...} }
type FeatureArrayInput interface {
	pulumi.Input

	ToFeatureArrayOutput() FeatureArrayOutput
	ToFeatureArrayOutputWithContext(context.Context) FeatureArrayOutput
}

type FeatureArray []FeatureInput

func (FeatureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Feature)(nil)).Elem()
}

func (i FeatureArray) ToFeatureArrayOutput() FeatureArrayOutput {
	return i.ToFeatureArrayOutputWithContext(context.Background())
}

func (i FeatureArray) ToFeatureArrayOutputWithContext(ctx context.Context) FeatureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureArrayOutput)
}

// FeatureMapInput is an input type that accepts FeatureMap and FeatureMapOutput values.
// You can construct a concrete instance of `FeatureMapInput` via:
//
//	FeatureMap{ "key": FeatureArgs{...} }
type FeatureMapInput interface {
	pulumi.Input

	ToFeatureMapOutput() FeatureMapOutput
	ToFeatureMapOutputWithContext(context.Context) FeatureMapOutput
}

type FeatureMap map[string]FeatureInput

func (FeatureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Feature)(nil)).Elem()
}

func (i FeatureMap) ToFeatureMapOutput() FeatureMapOutput {
	return i.ToFeatureMapOutputWithContext(context.Background())
}

func (i FeatureMap) ToFeatureMapOutputWithContext(ctx context.Context) FeatureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureMapOutput)
}

type FeatureOutput struct{ *pulumi.OutputState }

func (FeatureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Feature)(nil)).Elem()
}

func (o FeatureOutput) ToFeatureOutput() FeatureOutput {
	return o
}

func (o FeatureOutput) ToFeatureOutputWithContext(ctx context.Context) FeatureOutput {
	return o
}

// Annotations for feature object (map)
func (o FeatureOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *Feature) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Labels for feature object (map)
func (o FeatureOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Feature) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the feature (string)
func (o FeatureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Feature) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The value of the feature. Default: `false` (bool)
func (o FeatureOutput) Value() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Feature) pulumi.BoolPtrOutput { return v.Value }).(pulumi.BoolPtrOutput)
}

type FeatureArrayOutput struct{ *pulumi.OutputState }

func (FeatureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Feature)(nil)).Elem()
}

func (o FeatureArrayOutput) ToFeatureArrayOutput() FeatureArrayOutput {
	return o
}

func (o FeatureArrayOutput) ToFeatureArrayOutputWithContext(ctx context.Context) FeatureArrayOutput {
	return o
}

func (o FeatureArrayOutput) Index(i pulumi.IntInput) FeatureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Feature {
		return vs[0].([]*Feature)[vs[1].(int)]
	}).(FeatureOutput)
}

type FeatureMapOutput struct{ *pulumi.OutputState }

func (FeatureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Feature)(nil)).Elem()
}

func (o FeatureMapOutput) ToFeatureMapOutput() FeatureMapOutput {
	return o
}

func (o FeatureMapOutput) ToFeatureMapOutputWithContext(ctx context.Context) FeatureMapOutput {
	return o
}

func (o FeatureMapOutput) MapIndex(k pulumi.StringInput) FeatureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Feature {
		return vs[0].(map[string]*Feature)[vs[1].(string)]
	}).(FeatureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureInput)(nil)).Elem(), &Feature{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureArrayInput)(nil)).Elem(), FeatureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureMapInput)(nil)).Elem(), FeatureMap{})
	pulumi.RegisterOutputType(FeatureOutput{})
	pulumi.RegisterOutputType(FeatureArrayOutput{})
	pulumi.RegisterOutputType(FeatureMapOutput{})
}
