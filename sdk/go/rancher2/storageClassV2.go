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

// Provides a Rancher Storage Class v2 resource. This can be used to manage k8s storage classes for Rancher v2 clusters and retrieve their information. Storage Class v2 resource is available at Rancher v2.5.x and above.
//
// ## Import
//
// V2 storage classs can be imported using the Rancher cluster ID and StorageClass V2 name.
//
// ```sh
// $ pulumi import rancher2:index/storageClassV2:StorageClassV2 foo &lt;CLUSTER_ID&gt;.&lt;STORAGE_CLASS_V2_NAME&gt;
// ```
type StorageClassV2 struct {
	pulumi.CustomResourceState

	// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion pulumi.BoolOutput `pulumi:"allowVolumeExpansion"`
	// Annotations for the storageClass v2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id of the storageClass V2 (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The provisioner of the storageClass v2 (string)
	K8sProvisioner pulumi.StringOutput `pulumi:"k8sProvisioner"`
	// Labels for the storageClass v2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The mount options for storageClass v2 (list)
	MountOptions pulumi.StringArrayOutput `pulumi:"mountOptions"`
	// The name of the storageClass v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The parameters for storageClass v2 (string)
	Parameters pulumi.MapOutput `pulumi:"parameters"`
	// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
	ReclaimPolicy pulumi.StringPtrOutput `pulumi:"reclaimPolicy"`
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
	VolumeBindingMode pulumi.StringPtrOutput `pulumi:"volumeBindingMode"`
}

// NewStorageClassV2 registers a new resource with the given unique name, arguments, and options.
func NewStorageClassV2(ctx *pulumi.Context,
	name string, args *StorageClassV2Args, opts ...pulumi.ResourceOption) (*StorageClassV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.K8sProvisioner == nil {
		return nil, errors.New("invalid value for required argument 'K8sProvisioner'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StorageClassV2
	err := ctx.RegisterResource("rancher2:index/storageClassV2:StorageClassV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageClassV2 gets an existing StorageClassV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageClassV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageClassV2State, opts ...pulumi.ResourceOption) (*StorageClassV2, error) {
	var resource StorageClassV2
	err := ctx.ReadResource("rancher2:index/storageClassV2:StorageClassV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageClassV2 resources.
type storageClassV2State struct {
	// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion *bool `pulumi:"allowVolumeExpansion"`
	// Annotations for the storageClass v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the storageClass V2 (string)
	ClusterId *string `pulumi:"clusterId"`
	// The provisioner of the storageClass v2 (string)
	K8sProvisioner *string `pulumi:"k8sProvisioner"`
	// Labels for the storageClass v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The mount options for storageClass v2 (list)
	MountOptions []string `pulumi:"mountOptions"`
	// The name of the storageClass v2 (string)
	Name *string `pulumi:"name"`
	// The parameters for storageClass v2 (string)
	Parameters map[string]interface{} `pulumi:"parameters"`
	// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
	ReclaimPolicy *string `pulumi:"reclaimPolicy"`
	// (Computed) The k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
	VolumeBindingMode *string `pulumi:"volumeBindingMode"`
}

type StorageClassV2State struct {
	// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion pulumi.BoolPtrInput
	// Annotations for the storageClass v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the storageClass V2 (string)
	ClusterId pulumi.StringPtrInput
	// The provisioner of the storageClass v2 (string)
	K8sProvisioner pulumi.StringPtrInput
	// Labels for the storageClass v2 (map)
	Labels pulumi.MapInput
	// The mount options for storageClass v2 (list)
	MountOptions pulumi.StringArrayInput
	// The name of the storageClass v2 (string)
	Name pulumi.StringPtrInput
	// The parameters for storageClass v2 (string)
	Parameters pulumi.MapInput
	// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
	ReclaimPolicy pulumi.StringPtrInput
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
	VolumeBindingMode pulumi.StringPtrInput
}

func (StorageClassV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*storageClassV2State)(nil)).Elem()
}

type storageClassV2Args struct {
	// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion *bool `pulumi:"allowVolumeExpansion"`
	// Annotations for the storageClass v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the storageClass V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The provisioner of the storageClass v2 (string)
	K8sProvisioner string `pulumi:"k8sProvisioner"`
	// Labels for the storageClass v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The mount options for storageClass v2 (list)
	MountOptions []string `pulumi:"mountOptions"`
	// The name of the storageClass v2 (string)
	Name *string `pulumi:"name"`
	// The parameters for storageClass v2 (string)
	Parameters map[string]interface{} `pulumi:"parameters"`
	// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
	ReclaimPolicy *string `pulumi:"reclaimPolicy"`
	// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
	VolumeBindingMode *string `pulumi:"volumeBindingMode"`
}

// The set of arguments for constructing a StorageClassV2 resource.
type StorageClassV2Args struct {
	// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion pulumi.BoolPtrInput
	// Annotations for the storageClass v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the storageClass V2 (string)
	ClusterId pulumi.StringInput
	// The provisioner of the storageClass v2 (string)
	K8sProvisioner pulumi.StringInput
	// Labels for the storageClass v2 (map)
	Labels pulumi.MapInput
	// The mount options for storageClass v2 (list)
	MountOptions pulumi.StringArrayInput
	// The name of the storageClass v2 (string)
	Name pulumi.StringPtrInput
	// The parameters for storageClass v2 (string)
	Parameters pulumi.MapInput
	// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
	ReclaimPolicy pulumi.StringPtrInput
	// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
	VolumeBindingMode pulumi.StringPtrInput
}

func (StorageClassV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*storageClassV2Args)(nil)).Elem()
}

type StorageClassV2Input interface {
	pulumi.Input

	ToStorageClassV2Output() StorageClassV2Output
	ToStorageClassV2OutputWithContext(ctx context.Context) StorageClassV2Output
}

func (*StorageClassV2) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageClassV2)(nil)).Elem()
}

func (i *StorageClassV2) ToStorageClassV2Output() StorageClassV2Output {
	return i.ToStorageClassV2OutputWithContext(context.Background())
}

func (i *StorageClassV2) ToStorageClassV2OutputWithContext(ctx context.Context) StorageClassV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(StorageClassV2Output)
}

// StorageClassV2ArrayInput is an input type that accepts StorageClassV2Array and StorageClassV2ArrayOutput values.
// You can construct a concrete instance of `StorageClassV2ArrayInput` via:
//
//	StorageClassV2Array{ StorageClassV2Args{...} }
type StorageClassV2ArrayInput interface {
	pulumi.Input

	ToStorageClassV2ArrayOutput() StorageClassV2ArrayOutput
	ToStorageClassV2ArrayOutputWithContext(context.Context) StorageClassV2ArrayOutput
}

type StorageClassV2Array []StorageClassV2Input

func (StorageClassV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageClassV2)(nil)).Elem()
}

func (i StorageClassV2Array) ToStorageClassV2ArrayOutput() StorageClassV2ArrayOutput {
	return i.ToStorageClassV2ArrayOutputWithContext(context.Background())
}

func (i StorageClassV2Array) ToStorageClassV2ArrayOutputWithContext(ctx context.Context) StorageClassV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageClassV2ArrayOutput)
}

// StorageClassV2MapInput is an input type that accepts StorageClassV2Map and StorageClassV2MapOutput values.
// You can construct a concrete instance of `StorageClassV2MapInput` via:
//
//	StorageClassV2Map{ "key": StorageClassV2Args{...} }
type StorageClassV2MapInput interface {
	pulumi.Input

	ToStorageClassV2MapOutput() StorageClassV2MapOutput
	ToStorageClassV2MapOutputWithContext(context.Context) StorageClassV2MapOutput
}

type StorageClassV2Map map[string]StorageClassV2Input

func (StorageClassV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageClassV2)(nil)).Elem()
}

func (i StorageClassV2Map) ToStorageClassV2MapOutput() StorageClassV2MapOutput {
	return i.ToStorageClassV2MapOutputWithContext(context.Background())
}

func (i StorageClassV2Map) ToStorageClassV2MapOutputWithContext(ctx context.Context) StorageClassV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageClassV2MapOutput)
}

type StorageClassV2Output struct{ *pulumi.OutputState }

func (StorageClassV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageClassV2)(nil)).Elem()
}

func (o StorageClassV2Output) ToStorageClassV2Output() StorageClassV2Output {
	return o
}

func (o StorageClassV2Output) ToStorageClassV2OutputWithContext(ctx context.Context) StorageClassV2Output {
	return o
}

// Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
func (o StorageClassV2Output) AllowVolumeExpansion() pulumi.BoolOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.BoolOutput { return v.AllowVolumeExpansion }).(pulumi.BoolOutput)
}

// Annotations for the storageClass v2 (map)
func (o StorageClassV2Output) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The cluster id of the storageClass V2 (string)
func (o StorageClassV2Output) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The provisioner of the storageClass v2 (string)
func (o StorageClassV2Output) K8sProvisioner() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringOutput { return v.K8sProvisioner }).(pulumi.StringOutput)
}

// Labels for the storageClass v2 (map)
func (o StorageClassV2Output) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The mount options for storageClass v2 (list)
func (o StorageClassV2Output) MountOptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringArrayOutput { return v.MountOptions }).(pulumi.StringArrayOutput)
}

// The name of the storageClass v2 (string)
func (o StorageClassV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parameters for storageClass v2 (string)
func (o StorageClassV2Output) Parameters() pulumi.MapOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.MapOutput { return v.Parameters }).(pulumi.MapOutput)
}

// The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
func (o StorageClassV2Output) ReclaimPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringPtrOutput { return v.ReclaimPolicy }).(pulumi.StringPtrOutput)
}

// (Computed) The k8s resource version (string)
func (o StorageClassV2Output) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringOutput { return v.ResourceVersion }).(pulumi.StringOutput)
}

// The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
func (o StorageClassV2Output) VolumeBindingMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageClassV2) pulumi.StringPtrOutput { return v.VolumeBindingMode }).(pulumi.StringPtrOutput)
}

type StorageClassV2ArrayOutput struct{ *pulumi.OutputState }

func (StorageClassV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageClassV2)(nil)).Elem()
}

func (o StorageClassV2ArrayOutput) ToStorageClassV2ArrayOutput() StorageClassV2ArrayOutput {
	return o
}

func (o StorageClassV2ArrayOutput) ToStorageClassV2ArrayOutputWithContext(ctx context.Context) StorageClassV2ArrayOutput {
	return o
}

func (o StorageClassV2ArrayOutput) Index(i pulumi.IntInput) StorageClassV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageClassV2 {
		return vs[0].([]*StorageClassV2)[vs[1].(int)]
	}).(StorageClassV2Output)
}

type StorageClassV2MapOutput struct{ *pulumi.OutputState }

func (StorageClassV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageClassV2)(nil)).Elem()
}

func (o StorageClassV2MapOutput) ToStorageClassV2MapOutput() StorageClassV2MapOutput {
	return o
}

func (o StorageClassV2MapOutput) ToStorageClassV2MapOutputWithContext(ctx context.Context) StorageClassV2MapOutput {
	return o
}

func (o StorageClassV2MapOutput) MapIndex(k pulumi.StringInput) StorageClassV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageClassV2 {
		return vs[0].(map[string]*StorageClassV2)[vs[1].(string)]
	}).(StorageClassV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageClassV2Input)(nil)).Elem(), &StorageClassV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageClassV2ArrayInput)(nil)).Elem(), StorageClassV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageClassV2MapInput)(nil)).Elem(), StorageClassV2Map{})
	pulumi.RegisterOutputType(StorageClassV2Output{})
	pulumi.RegisterOutputType(StorageClassV2ArrayOutput{})
	pulumi.RegisterOutputType(StorageClassV2MapOutput{})
}
