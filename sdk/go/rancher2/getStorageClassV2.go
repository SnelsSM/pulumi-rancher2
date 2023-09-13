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

// Use this data source to retrieve information about a Rancher2 Storage Class v2. Storage Class v2 resource is available at Rancher v2.5.x and above.
func LookupStorageClassV2(ctx *pulumi.Context, args *LookupStorageClassV2Args, opts ...pulumi.InvokeOption) (*LookupStorageClassV2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStorageClassV2Result
	err := ctx.Invoke("rancher2:index/getStorageClassV2:getStorageClassV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStorageClassV2.
type LookupStorageClassV2Args struct {
	// The cluster id of the storageClass V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the storageClass v2 (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getStorageClassV2.
type LookupStorageClassV2Result struct {
	// (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
	AllowVolumeExpansion bool `pulumi:"allowVolumeExpansion"`
	// (Computed) Annotations for the storageClass v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The provisioner of the storageClass v2 (string)
	K8sProvisioner string `pulumi:"k8sProvisioner"`
	// (Computed) Labels for the storageClass v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The mount options for storageClass v2 (list)
	MountOptions []string `pulumi:"mountOptions"`
	Name         string   `pulumi:"name"`
	// (Computed) The parameters for storageClass v2 (string)
	Parameters map[string]interface{} `pulumi:"parameters"`
	// (Computed) The reclaim policy for storageClass v2 (string)
	ReclaimPolicy string `pulumi:"reclaimPolicy"`
	// (Computed) The k8s resource version (string)
	ResourceVersion string `pulumi:"resourceVersion"`
	// (Computed) The volume binding mode for storageClass v2 (string)
	VolumeBindingMode string `pulumi:"volumeBindingMode"`
}

func LookupStorageClassV2Output(ctx *pulumi.Context, args LookupStorageClassV2OutputArgs, opts ...pulumi.InvokeOption) LookupStorageClassV2ResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStorageClassV2Result, error) {
			args := v.(LookupStorageClassV2Args)
			r, err := LookupStorageClassV2(ctx, &args, opts...)
			var s LookupStorageClassV2Result
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupStorageClassV2ResultOutput)
}

// A collection of arguments for invoking getStorageClassV2.
type LookupStorageClassV2OutputArgs struct {
	// The cluster id of the storageClass V2 (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the storageClass v2 (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupStorageClassV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStorageClassV2Args)(nil)).Elem()
}

// A collection of values returned by getStorageClassV2.
type LookupStorageClassV2ResultOutput struct{ *pulumi.OutputState }

func (LookupStorageClassV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStorageClassV2Result)(nil)).Elem()
}

func (o LookupStorageClassV2ResultOutput) ToLookupStorageClassV2ResultOutput() LookupStorageClassV2ResultOutput {
	return o
}

func (o LookupStorageClassV2ResultOutput) ToLookupStorageClassV2ResultOutputWithContext(ctx context.Context) LookupStorageClassV2ResultOutput {
	return o
}

func (o LookupStorageClassV2ResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupStorageClassV2Result] {
	return pulumix.Output[LookupStorageClassV2Result]{
		OutputState: o.OutputState,
	}
}

// (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
func (o LookupStorageClassV2ResultOutput) AllowVolumeExpansion() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) bool { return v.AllowVolumeExpansion }).(pulumi.BoolOutput)
}

// (Computed) Annotations for the storageClass v2 (map)
func (o LookupStorageClassV2ResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupStorageClassV2ResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupStorageClassV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The provisioner of the storageClass v2 (string)
func (o LookupStorageClassV2ResultOutput) K8sProvisioner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.K8sProvisioner }).(pulumi.StringOutput)
}

// (Computed) Labels for the storageClass v2 (map)
func (o LookupStorageClassV2ResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The mount options for storageClass v2 (list)
func (o LookupStorageClassV2ResultOutput) MountOptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) []string { return v.MountOptions }).(pulumi.StringArrayOutput)
}

func (o LookupStorageClassV2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The parameters for storageClass v2 (string)
func (o LookupStorageClassV2ResultOutput) Parameters() pulumi.MapOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) map[string]interface{} { return v.Parameters }).(pulumi.MapOutput)
}

// (Computed) The reclaim policy for storageClass v2 (string)
func (o LookupStorageClassV2ResultOutput) ReclaimPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.ReclaimPolicy }).(pulumi.StringOutput)
}

// (Computed) The k8s resource version (string)
func (o LookupStorageClassV2ResultOutput) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.ResourceVersion }).(pulumi.StringOutput)
}

// (Computed) The volume binding mode for storageClass v2 (string)
func (o LookupStorageClassV2ResultOutput) VolumeBindingMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStorageClassV2Result) string { return v.VolumeBindingMode }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStorageClassV2ResultOutput{})
}
