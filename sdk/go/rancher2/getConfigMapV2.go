// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher2 configMap v2. ConfigMap v2 resource is available at Rancher v2.5.x and above.
func LookupConfigMapV2(ctx *pulumi.Context, args *LookupConfigMapV2Args, opts ...pulumi.InvokeOption) (*LookupConfigMapV2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConfigMapV2Result
	err := ctx.Invoke("rancher2:index/getConfigMapV2:getConfigMapV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigMapV2.
type LookupConfigMapV2Args struct {
	// The cluster id of the configMap V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the configMap v2 (string)
	Name string `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
}

// A collection of values returned by getConfigMapV2.
type LookupConfigMapV2Result struct {
	// (Computed) Annotations for the configMap v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The data of the configMap v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
	Immutable bool `pulumi:"immutable"`
	// (Computed) Labels for the configMap v2 (map)
	Labels    map[string]interface{} `pulumi:"labels"`
	Name      string                 `pulumi:"name"`
	Namespace *string                `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion string `pulumi:"resourceVersion"`
}

func LookupConfigMapV2Output(ctx *pulumi.Context, args LookupConfigMapV2OutputArgs, opts ...pulumi.InvokeOption) LookupConfigMapV2ResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConfigMapV2Result, error) {
			args := v.(LookupConfigMapV2Args)
			r, err := LookupConfigMapV2(ctx, &args, opts...)
			var s LookupConfigMapV2Result
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConfigMapV2ResultOutput)
}

// A collection of arguments for invoking getConfigMapV2.
type LookupConfigMapV2OutputArgs struct {
	// The cluster id of the configMap V2 (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the configMap v2 (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
}

func (LookupConfigMapV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigMapV2Args)(nil)).Elem()
}

// A collection of values returned by getConfigMapV2.
type LookupConfigMapV2ResultOutput struct{ *pulumi.OutputState }

func (LookupConfigMapV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigMapV2Result)(nil)).Elem()
}

func (o LookupConfigMapV2ResultOutput) ToLookupConfigMapV2ResultOutput() LookupConfigMapV2ResultOutput {
	return o
}

func (o LookupConfigMapV2ResultOutput) ToLookupConfigMapV2ResultOutputWithContext(ctx context.Context) LookupConfigMapV2ResultOutput {
	return o
}

// (Computed) Annotations for the configMap v2 (map)
func (o LookupConfigMapV2ResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupConfigMapV2ResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The data of the configMap v2 (map)
func (o LookupConfigMapV2ResultOutput) Data() pulumi.MapOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) map[string]interface{} { return v.Data }).(pulumi.MapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConfigMapV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
func (o LookupConfigMapV2ResultOutput) Immutable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) bool { return v.Immutable }).(pulumi.BoolOutput)
}

// (Computed) Labels for the configMap v2 (map)
func (o LookupConfigMapV2ResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupConfigMapV2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupConfigMapV2ResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// (Computed) The k8s resource version (string)
func (o LookupConfigMapV2ResultOutput) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigMapV2Result) string { return v.ResourceVersion }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConfigMapV2ResultOutput{})
}
