// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v7/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster role template binding.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v7/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupClusterRoleTemplateBinding(ctx, &rancher2.LookupClusterRoleTemplateBindingArgs{
//				Name:      "foo",
//				ClusterId: "foo_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupClusterRoleTemplateBinding(ctx *pulumi.Context, args *LookupClusterRoleTemplateBindingArgs, opts ...pulumi.InvokeOption) (*LookupClusterRoleTemplateBindingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterRoleTemplateBindingResult
	err := ctx.Invoke("rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingArgs struct {
	// The cluster id where bind cluster role template (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the cluster role template binding (string)
	Name string `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
}

// A collection of values returned by getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	ClusterId   string            `pulumi:"clusterId"`
	// (Computed) The group ID to assign cluster role template binding (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId string `pulumi:"groupPrincipalId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels         map[string]string `pulumi:"labels"`
	Name           string            `pulumi:"name"`
	RoleTemplateId string            `pulumi:"roleTemplateId"`
	// (Computed) The user ID to assign cluster role template binding (string)
	UserId string `pulumi:"userId"`
	// (Computed) The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId string `pulumi:"userPrincipalId"`
}

func LookupClusterRoleTemplateBindingOutput(ctx *pulumi.Context, args LookupClusterRoleTemplateBindingOutputArgs, opts ...pulumi.InvokeOption) LookupClusterRoleTemplateBindingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterRoleTemplateBindingResult, error) {
			args := v.(LookupClusterRoleTemplateBindingArgs)
			r, err := LookupClusterRoleTemplateBinding(ctx, &args, opts...)
			var s LookupClusterRoleTemplateBindingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterRoleTemplateBindingResultOutput)
}

// A collection of arguments for invoking getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingOutputArgs struct {
	// The cluster id where bind cluster role template (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the cluster role template binding (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId pulumi.StringPtrInput `pulumi:"roleTemplateId"`
}

func (LookupClusterRoleTemplateBindingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterRoleTemplateBindingArgs)(nil)).Elem()
}

// A collection of values returned by getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingResultOutput struct{ *pulumi.OutputState }

func (LookupClusterRoleTemplateBindingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterRoleTemplateBindingResult)(nil)).Elem()
}

func (o LookupClusterRoleTemplateBindingResultOutput) ToLookupClusterRoleTemplateBindingResultOutput() LookupClusterRoleTemplateBindingResultOutput {
	return o
}

func (o LookupClusterRoleTemplateBindingResultOutput) ToLookupClusterRoleTemplateBindingResultOutputWithContext(ctx context.Context) LookupClusterRoleTemplateBindingResultOutput {
	return o
}

// (Computed) Annotations of the resource (map)
func (o LookupClusterRoleTemplateBindingResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o LookupClusterRoleTemplateBindingResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The group ID to assign cluster role template binding (string)
func (o LookupClusterRoleTemplateBindingResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// (Computed) The groupPrincipal ID to assign cluster role template binding (string)
func (o LookupClusterRoleTemplateBindingResultOutput) GroupPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.GroupPrincipalId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterRoleTemplateBindingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupClusterRoleTemplateBindingResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupClusterRoleTemplateBindingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupClusterRoleTemplateBindingResultOutput) RoleTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.RoleTemplateId }).(pulumi.StringOutput)
}

// (Computed) The user ID to assign cluster role template binding (string)
func (o LookupClusterRoleTemplateBindingResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.UserId }).(pulumi.StringOutput)
}

// (Computed) The userPrincipal ID to assign cluster role template binding (string)
func (o LookupClusterRoleTemplateBindingResultOutput) UserPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterRoleTemplateBindingResult) string { return v.UserPrincipalId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterRoleTemplateBindingResultOutput{})
}
