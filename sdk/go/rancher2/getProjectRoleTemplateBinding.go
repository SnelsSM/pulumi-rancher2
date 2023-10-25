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

// Use this data source to retrieve information about a Rancher v2 project role template binding.
func LookupProjectRoleTemplateBinding(ctx *pulumi.Context, args *LookupProjectRoleTemplateBindingArgs, opts ...pulumi.InvokeOption) (*LookupProjectRoleTemplateBindingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectRoleTemplateBindingResult
	err := ctx.Invoke("rancher2:index/getProjectRoleTemplateBinding:getProjectRoleTemplateBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectRoleTemplateBinding.
type LookupProjectRoleTemplateBindingArgs struct {
	// The name of the project role template binding (string)
	Name string `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId string `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
}

// A collection of values returned by getProjectRoleTemplateBinding.
type LookupProjectRoleTemplateBindingResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) The group ID to assign project role template binding (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId string `pulumi:"groupPrincipalId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels         map[string]interface{} `pulumi:"labels"`
	Name           string                 `pulumi:"name"`
	ProjectId      string                 `pulumi:"projectId"`
	RoleTemplateId string                 `pulumi:"roleTemplateId"`
	// (Computed) The user ID to assign project role template binding (string)
	UserId string `pulumi:"userId"`
	// (Computed) The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId string `pulumi:"userPrincipalId"`
}

func LookupProjectRoleTemplateBindingOutput(ctx *pulumi.Context, args LookupProjectRoleTemplateBindingOutputArgs, opts ...pulumi.InvokeOption) LookupProjectRoleTemplateBindingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectRoleTemplateBindingResult, error) {
			args := v.(LookupProjectRoleTemplateBindingArgs)
			r, err := LookupProjectRoleTemplateBinding(ctx, &args, opts...)
			var s LookupProjectRoleTemplateBindingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectRoleTemplateBindingResultOutput)
}

// A collection of arguments for invoking getProjectRoleTemplateBinding.
type LookupProjectRoleTemplateBindingOutputArgs struct {
	// The name of the project role template binding (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringPtrInput `pulumi:"roleTemplateId"`
}

func (LookupProjectRoleTemplateBindingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectRoleTemplateBindingArgs)(nil)).Elem()
}

// A collection of values returned by getProjectRoleTemplateBinding.
type LookupProjectRoleTemplateBindingResultOutput struct{ *pulumi.OutputState }

func (LookupProjectRoleTemplateBindingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectRoleTemplateBindingResult)(nil)).Elem()
}

func (o LookupProjectRoleTemplateBindingResultOutput) ToLookupProjectRoleTemplateBindingResultOutput() LookupProjectRoleTemplateBindingResultOutput {
	return o
}

func (o LookupProjectRoleTemplateBindingResultOutput) ToLookupProjectRoleTemplateBindingResultOutputWithContext(ctx context.Context) LookupProjectRoleTemplateBindingResultOutput {
	return o
}

func (o LookupProjectRoleTemplateBindingResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupProjectRoleTemplateBindingResult] {
	return pulumix.Output[LookupProjectRoleTemplateBindingResult]{
		OutputState: o.OutputState,
	}
}

// (Computed) Annotations of the resource (map)
func (o LookupProjectRoleTemplateBindingResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) The group ID to assign project role template binding (string)
func (o LookupProjectRoleTemplateBindingResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// (Computed) The groupPrincipal ID to assign project role template binding (string)
func (o LookupProjectRoleTemplateBindingResultOutput) GroupPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.GroupPrincipalId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectRoleTemplateBindingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupProjectRoleTemplateBindingResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupProjectRoleTemplateBindingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupProjectRoleTemplateBindingResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupProjectRoleTemplateBindingResultOutput) RoleTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.RoleTemplateId }).(pulumi.StringOutput)
}

// (Computed) The user ID to assign project role template binding (string)
func (o LookupProjectRoleTemplateBindingResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.UserId }).(pulumi.StringOutput)
}

// (Computed) The userPrincipal ID to assign project role template binding (string)
func (o LookupProjectRoleTemplateBindingResultOutput) UserPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectRoleTemplateBindingResult) string { return v.UserPrincipalId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectRoleTemplateBindingResultOutput{})
}
