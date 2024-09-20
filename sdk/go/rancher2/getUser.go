// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v7/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 user
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
//			_, err := rancher2.LookupUser(ctx, &rancher2.LookupUserArgs{
//				Username: pulumi.StringRef("foo"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserResult
	err := ctx.Invoke("rancher2:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// Set is the user if the user is external. Default: `false` (bool)
	IsExternal *bool `pulumi:"isExternal"`
	// The name of the user (string)
	Name *string `pulumi:"name"`
	// The username of the user (string)
	Username *string `pulumi:"username"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) The user is enabled (bool)
	Enabled bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	IsExternal *bool  `pulumi:"isExternal"`
	// (Computed) Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The user common name (string)
	Name string `pulumi:"name"`
	// (Computed) The user principal IDs (list)
	PrincipalIds []string `pulumi:"principalIds"`
	Username     string   `pulumi:"username"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResultOutput, error) {
			args := v.(LookupUserArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupUserResult
			secret, err := ctx.InvokePackageRaw("rancher2:index/getUser:getUser", args, &rv, "", opts...)
			if err != nil {
				return LookupUserResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupUserResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupUserResultOutput), nil
			}
			return output, nil
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// Set is the user if the user is external. Default: `false` (bool)
	IsExternal pulumi.BoolPtrInput `pulumi:"isExternal"`
	// The name of the user (string)
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The username of the user (string)
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// (Computed) Annotations of the resource (map)
func (o LookupUserResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupUserResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) The user is enabled (bool)
func (o LookupUserResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) IsExternal() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *bool { return v.IsExternal }).(pulumi.BoolPtrOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupUserResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupUserResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The user common name (string)
func (o LookupUserResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The user principal IDs (list)
func (o LookupUserResultOutput) PrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []string { return v.PrincipalIds }).(pulumi.StringArrayOutput)
}

func (o LookupUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
