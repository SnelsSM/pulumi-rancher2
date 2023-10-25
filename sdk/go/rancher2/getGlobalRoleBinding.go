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

// Use this data source to retrieve information about a Rancher v2 global role binding.
func LookupGlobalRoleBinding(ctx *pulumi.Context, args *LookupGlobalRoleBindingArgs, opts ...pulumi.InvokeOption) (*LookupGlobalRoleBindingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGlobalRoleBindingResult
	err := ctx.Invoke("rancher2:index/getGlobalRoleBinding:getGlobalRoleBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalRoleBinding.
type LookupGlobalRoleBindingArgs struct {
	// The global role id (string)
	GlobalRoleId *string `pulumi:"globalRoleId"`
	// The name of the global role binding (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getGlobalRoleBinding.
type LookupGlobalRoleBindingResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations  map[string]interface{} `pulumi:"annotations"`
	GlobalRoleId string                 `pulumi:"globalRoleId"`
	// (Computed) The group principal ID to assign global role binding. Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId string `pulumi:"groupPrincipalId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) The user ID to assign global role binding (string)
	UserId string `pulumi:"userId"`
}

func LookupGlobalRoleBindingOutput(ctx *pulumi.Context, args LookupGlobalRoleBindingOutputArgs, opts ...pulumi.InvokeOption) LookupGlobalRoleBindingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGlobalRoleBindingResult, error) {
			args := v.(LookupGlobalRoleBindingArgs)
			r, err := LookupGlobalRoleBinding(ctx, &args, opts...)
			var s LookupGlobalRoleBindingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGlobalRoleBindingResultOutput)
}

// A collection of arguments for invoking getGlobalRoleBinding.
type LookupGlobalRoleBindingOutputArgs struct {
	// The global role id (string)
	GlobalRoleId pulumi.StringPtrInput `pulumi:"globalRoleId"`
	// The name of the global role binding (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupGlobalRoleBindingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalRoleBindingArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalRoleBinding.
type LookupGlobalRoleBindingResultOutput struct{ *pulumi.OutputState }

func (LookupGlobalRoleBindingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalRoleBindingResult)(nil)).Elem()
}

func (o LookupGlobalRoleBindingResultOutput) ToLookupGlobalRoleBindingResultOutput() LookupGlobalRoleBindingResultOutput {
	return o
}

func (o LookupGlobalRoleBindingResultOutput) ToLookupGlobalRoleBindingResultOutputWithContext(ctx context.Context) LookupGlobalRoleBindingResultOutput {
	return o
}

func (o LookupGlobalRoleBindingResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupGlobalRoleBindingResult] {
	return pulumix.Output[LookupGlobalRoleBindingResult]{
		OutputState: o.OutputState,
	}
}

// (Computed) Annotations of the resource (map)
func (o LookupGlobalRoleBindingResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupGlobalRoleBindingResultOutput) GlobalRoleId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) string { return v.GlobalRoleId }).(pulumi.StringOutput)
}

// (Computed) The group principal ID to assign global role binding. Rancher v2.4.0 or higher is required (string)
func (o LookupGlobalRoleBindingResultOutput) GroupPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) string { return v.GroupPrincipalId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGlobalRoleBindingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupGlobalRoleBindingResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupGlobalRoleBindingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The user ID to assign global role binding (string)
func (o LookupGlobalRoleBindingResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalRoleBindingResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGlobalRoleBindingResultOutput{})
}
