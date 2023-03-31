// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher ConfigMap v2 resource. This can be used to create k8s configMaps for Rancher v2 environments and retrieve their information. ConfigMap v2 resource is available at Rancher v2.5.x and above.
//
// ## Import
//
// V2 configMaps can be imported using the Rancher cluster ID, ConfigMap V2 namespace and name.
//
// ```sh
//
//	$ pulumi import rancher2:index/configMapV2:ConfigMapV2 foo &lt;CLUSTER_ID&gt;.&lt;SECRET_V2_NAMESPACE&gt;/&lt;SECRET_V2_NAME&gt;
//
// ```
type ConfigMapV2 struct {
	pulumi.CustomResourceState

	// Annotations for the configMap v2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id of the configMap V2 (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The data of the configMap v2 (map)
	Data pulumi.MapOutput `pulumi:"data"`
	// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrOutput `pulumi:"immutable"`
	// Labels for the configMap v2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the configMap v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
}

// NewConfigMapV2 registers a new resource with the given unique name, arguments, and options.
func NewConfigMapV2(ctx *pulumi.Context,
	name string, args *ConfigMapV2Args, opts ...pulumi.ResourceOption) (*ConfigMapV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Data == nil {
		return nil, errors.New("invalid value for required argument 'Data'")
	}
	var resource ConfigMapV2
	err := ctx.RegisterResource("rancher2:index/configMapV2:ConfigMapV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConfigMapV2 gets an existing ConfigMapV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConfigMapV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConfigMapV2State, opts ...pulumi.ResourceOption) (*ConfigMapV2, error) {
	var resource ConfigMapV2
	err := ctx.ReadResource("rancher2:index/configMapV2:ConfigMapV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConfigMapV2 resources.
type configMapV2State struct {
	// Annotations for the configMap v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the configMap V2 (string)
	ClusterId *string `pulumi:"clusterId"`
	// The data of the configMap v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable *bool `pulumi:"immutable"`
	// Labels for the configMap v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the configMap v2 (string)
	Name *string `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
}

type ConfigMapV2State struct {
	// Annotations for the configMap v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the configMap V2 (string)
	ClusterId pulumi.StringPtrInput
	// The data of the configMap v2 (map)
	Data pulumi.MapInput
	// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrInput
	// Labels for the configMap v2 (map)
	Labels pulumi.MapInput
	// The name of the configMap v2 (string)
	Name pulumi.StringPtrInput
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace pulumi.StringPtrInput
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
}

func (ConfigMapV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*configMapV2State)(nil)).Elem()
}

type configMapV2Args struct {
	// Annotations for the configMap v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the configMap V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The data of the configMap v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable *bool `pulumi:"immutable"`
	// Labels for the configMap v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the configMap v2 (string)
	Name *string `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
}

// The set of arguments for constructing a ConfigMapV2 resource.
type ConfigMapV2Args struct {
	// Annotations for the configMap v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the configMap V2 (string)
	ClusterId pulumi.StringInput
	// The data of the configMap v2 (map)
	Data pulumi.MapInput
	// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrInput
	// Labels for the configMap v2 (map)
	Labels pulumi.MapInput
	// The name of the configMap v2 (string)
	Name pulumi.StringPtrInput
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace pulumi.StringPtrInput
}

func (ConfigMapV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*configMapV2Args)(nil)).Elem()
}

type ConfigMapV2Input interface {
	pulumi.Input

	ToConfigMapV2Output() ConfigMapV2Output
	ToConfigMapV2OutputWithContext(ctx context.Context) ConfigMapV2Output
}

func (*ConfigMapV2) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigMapV2)(nil)).Elem()
}

func (i *ConfigMapV2) ToConfigMapV2Output() ConfigMapV2Output {
	return i.ToConfigMapV2OutputWithContext(context.Background())
}

func (i *ConfigMapV2) ToConfigMapV2OutputWithContext(ctx context.Context) ConfigMapV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigMapV2Output)
}

// ConfigMapV2ArrayInput is an input type that accepts ConfigMapV2Array and ConfigMapV2ArrayOutput values.
// You can construct a concrete instance of `ConfigMapV2ArrayInput` via:
//
//	ConfigMapV2Array{ ConfigMapV2Args{...} }
type ConfigMapV2ArrayInput interface {
	pulumi.Input

	ToConfigMapV2ArrayOutput() ConfigMapV2ArrayOutput
	ToConfigMapV2ArrayOutputWithContext(context.Context) ConfigMapV2ArrayOutput
}

type ConfigMapV2Array []ConfigMapV2Input

func (ConfigMapV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigMapV2)(nil)).Elem()
}

func (i ConfigMapV2Array) ToConfigMapV2ArrayOutput() ConfigMapV2ArrayOutput {
	return i.ToConfigMapV2ArrayOutputWithContext(context.Background())
}

func (i ConfigMapV2Array) ToConfigMapV2ArrayOutputWithContext(ctx context.Context) ConfigMapV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigMapV2ArrayOutput)
}

// ConfigMapV2MapInput is an input type that accepts ConfigMapV2Map and ConfigMapV2MapOutput values.
// You can construct a concrete instance of `ConfigMapV2MapInput` via:
//
//	ConfigMapV2Map{ "key": ConfigMapV2Args{...} }
type ConfigMapV2MapInput interface {
	pulumi.Input

	ToConfigMapV2MapOutput() ConfigMapV2MapOutput
	ToConfigMapV2MapOutputWithContext(context.Context) ConfigMapV2MapOutput
}

type ConfigMapV2Map map[string]ConfigMapV2Input

func (ConfigMapV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigMapV2)(nil)).Elem()
}

func (i ConfigMapV2Map) ToConfigMapV2MapOutput() ConfigMapV2MapOutput {
	return i.ToConfigMapV2MapOutputWithContext(context.Background())
}

func (i ConfigMapV2Map) ToConfigMapV2MapOutputWithContext(ctx context.Context) ConfigMapV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigMapV2MapOutput)
}

type ConfigMapV2Output struct{ *pulumi.OutputState }

func (ConfigMapV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigMapV2)(nil)).Elem()
}

func (o ConfigMapV2Output) ToConfigMapV2Output() ConfigMapV2Output {
	return o
}

func (o ConfigMapV2Output) ToConfigMapV2OutputWithContext(ctx context.Context) ConfigMapV2Output {
	return o
}

// Annotations for the configMap v2 (map)
func (o ConfigMapV2Output) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The cluster id of the configMap V2 (string)
func (o ConfigMapV2Output) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The data of the configMap v2 (map)
func (o ConfigMapV2Output) Data() pulumi.MapOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.MapOutput { return v.Data }).(pulumi.MapOutput)
}

// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
func (o ConfigMapV2Output) Immutable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.BoolPtrOutput { return v.Immutable }).(pulumi.BoolPtrOutput)
}

// Labels for the configMap v2 (map)
func (o ConfigMapV2Output) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the configMap v2 (string)
func (o ConfigMapV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The namespaces of the configMap v2. Default: `default` (string)
func (o ConfigMapV2Output) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// (Computed) The k8s resource version (string)
func (o ConfigMapV2Output) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ConfigMapV2) pulumi.StringOutput { return v.ResourceVersion }).(pulumi.StringOutput)
}

type ConfigMapV2ArrayOutput struct{ *pulumi.OutputState }

func (ConfigMapV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigMapV2)(nil)).Elem()
}

func (o ConfigMapV2ArrayOutput) ToConfigMapV2ArrayOutput() ConfigMapV2ArrayOutput {
	return o
}

func (o ConfigMapV2ArrayOutput) ToConfigMapV2ArrayOutputWithContext(ctx context.Context) ConfigMapV2ArrayOutput {
	return o
}

func (o ConfigMapV2ArrayOutput) Index(i pulumi.IntInput) ConfigMapV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConfigMapV2 {
		return vs[0].([]*ConfigMapV2)[vs[1].(int)]
	}).(ConfigMapV2Output)
}

type ConfigMapV2MapOutput struct{ *pulumi.OutputState }

func (ConfigMapV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigMapV2)(nil)).Elem()
}

func (o ConfigMapV2MapOutput) ToConfigMapV2MapOutput() ConfigMapV2MapOutput {
	return o
}

func (o ConfigMapV2MapOutput) ToConfigMapV2MapOutputWithContext(ctx context.Context) ConfigMapV2MapOutput {
	return o
}

func (o ConfigMapV2MapOutput) MapIndex(k pulumi.StringInput) ConfigMapV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConfigMapV2 {
		return vs[0].(map[string]*ConfigMapV2)[vs[1].(string)]
	}).(ConfigMapV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigMapV2Input)(nil)).Elem(), &ConfigMapV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigMapV2ArrayInput)(nil)).Elem(), ConfigMapV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigMapV2MapInput)(nil)).Elem(), ConfigMapV2Map{})
	pulumi.RegisterOutputType(ConfigMapV2Output{})
	pulumi.RegisterOutputType(ConfigMapV2ArrayOutput{})
	pulumi.RegisterOutputType(ConfigMapV2MapOutput{})
}
