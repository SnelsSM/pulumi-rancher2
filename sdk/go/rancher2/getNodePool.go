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

// Use this data source to retrieve information about a Rancher v2 Node Pool resource.
func LookupNodePool(ctx *pulumi.Context, args *LookupNodePoolArgs, opts ...pulumi.InvokeOption) (*LookupNodePoolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNodePoolResult
	err := ctx.Invoke("rancher2:index/getNodePool:getNodePool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodePool.
type LookupNodePoolArgs struct {
	// The RKE cluster id to use Node Pool (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the Node Pool (string)
	Name string `pulumi:"name"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId *string `pulumi:"nodeTemplateId"`
}

// A collection of values returned by getNodePool.
type LookupNodePoolResult struct {
	// (Computed) Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) RKE control plane role for created nodes (bool)
	ControlPlane bool `pulumi:"controlPlane"`
	// (Computed) Delete not ready node after secs. Default `0` (int)
	DeleteNotReadyAfterSecs int `pulumi:"deleteNotReadyAfterSecs"`
	// (Computed) RKE etcd role for created nodes (bool)
	Etcd bool `pulumi:"etcd"`
	// (Computed) The prefix for created nodes of the Node Pool (string)
	HostnamePrefix string `pulumi:"hostnamePrefix"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Node taints (List)
	NodeTaints     []GetNodePoolNodeTaint `pulumi:"nodeTaints"`
	NodeTemplateId string                 `pulumi:"nodeTemplateId"`
	// (Computed) The number of nodes to create on Node Pool (int)
	Quantity int `pulumi:"quantity"`
	// (Computed) RKE role role for created nodes (bool)
	Worker bool `pulumi:"worker"`
}

func LookupNodePoolOutput(ctx *pulumi.Context, args LookupNodePoolOutputArgs, opts ...pulumi.InvokeOption) LookupNodePoolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodePoolResult, error) {
			args := v.(LookupNodePoolArgs)
			r, err := LookupNodePool(ctx, &args, opts...)
			var s LookupNodePoolResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodePoolResultOutput)
}

// A collection of arguments for invoking getNodePool.
type LookupNodePoolOutputArgs struct {
	// The RKE cluster id to use Node Pool (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the Node Pool (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId pulumi.StringPtrInput `pulumi:"nodeTemplateId"`
}

func (LookupNodePoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodePoolArgs)(nil)).Elem()
}

// A collection of values returned by getNodePool.
type LookupNodePoolResultOutput struct{ *pulumi.OutputState }

func (LookupNodePoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodePoolResult)(nil)).Elem()
}

func (o LookupNodePoolResultOutput) ToLookupNodePoolResultOutput() LookupNodePoolResultOutput {
	return o
}

func (o LookupNodePoolResultOutput) ToLookupNodePoolResultOutputWithContext(ctx context.Context) LookupNodePoolResultOutput {
	return o
}

func (o LookupNodePoolResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupNodePoolResult] {
	return pulumix.Output[LookupNodePoolResult]{
		OutputState: o.OutputState,
	}
}

// (Computed) Annotations for Node Pool object (map)
func (o LookupNodePoolResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodePoolResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupNodePoolResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) RKE control plane role for created nodes (bool)
func (o LookupNodePoolResultOutput) ControlPlane() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNodePoolResult) bool { return v.ControlPlane }).(pulumi.BoolOutput)
}

// (Computed) Delete not ready node after secs. Default `0` (int)
func (o LookupNodePoolResultOutput) DeleteNotReadyAfterSecs() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNodePoolResult) int { return v.DeleteNotReadyAfterSecs }).(pulumi.IntOutput)
}

// (Computed) RKE etcd role for created nodes (bool)
func (o LookupNodePoolResultOutput) Etcd() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNodePoolResult) bool { return v.Etcd }).(pulumi.BoolOutput)
}

// (Computed) The prefix for created nodes of the Node Pool (string)
func (o LookupNodePoolResultOutput) HostnamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.HostnamePrefix }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNodePoolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for Node Pool object (map)
func (o LookupNodePoolResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodePoolResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupNodePoolResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Node taints (List)
func (o LookupNodePoolResultOutput) NodeTaints() GetNodePoolNodeTaintArrayOutput {
	return o.ApplyT(func(v LookupNodePoolResult) []GetNodePoolNodeTaint { return v.NodeTaints }).(GetNodePoolNodeTaintArrayOutput)
}

func (o LookupNodePoolResultOutput) NodeTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodePoolResult) string { return v.NodeTemplateId }).(pulumi.StringOutput)
}

// (Computed) The number of nodes to create on Node Pool (int)
func (o LookupNodePoolResultOutput) Quantity() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNodePoolResult) int { return v.Quantity }).(pulumi.IntOutput)
}

// (Computed) RKE role role for created nodes (bool)
func (o LookupNodePoolResultOutput) Worker() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNodePoolResult) bool { return v.Worker }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodePoolResultOutput{})
}
