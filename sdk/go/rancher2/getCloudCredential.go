// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Cloud Credential.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupCloudCredential(ctx, &rancher2.LookupCloudCredentialArgs{
//				Name: "test",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCloudCredential(ctx *pulumi.Context, args *LookupCloudCredentialArgs, opts ...pulumi.InvokeOption) (*LookupCloudCredentialResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudCredentialResult
	err := ctx.Invoke("rancher2:index/getCloudCredential:getCloudCredential", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudCredential.
type LookupCloudCredentialArgs struct {
	// The Cloud Credential name.
	Name string `pulumi:"name"`
}

// A collection of values returned by getCloudCredential.
type LookupCloudCredentialResult struct {
	// (Computed) Annotations for the Cloud Credential (map)
	Annotations map[string]string `pulumi:"annotations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for the Cloud Credential (map)
	Labels map[string]string `pulumi:"labels"`
	Name   string            `pulumi:"name"`
}

func LookupCloudCredentialOutput(ctx *pulumi.Context, args LookupCloudCredentialOutputArgs, opts ...pulumi.InvokeOption) LookupCloudCredentialResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCloudCredentialResult, error) {
			args := v.(LookupCloudCredentialArgs)
			r, err := LookupCloudCredential(ctx, &args, opts...)
			var s LookupCloudCredentialResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCloudCredentialResultOutput)
}

// A collection of arguments for invoking getCloudCredential.
type LookupCloudCredentialOutputArgs struct {
	// The Cloud Credential name.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupCloudCredentialOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudCredentialArgs)(nil)).Elem()
}

// A collection of values returned by getCloudCredential.
type LookupCloudCredentialResultOutput struct{ *pulumi.OutputState }

func (LookupCloudCredentialResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudCredentialResult)(nil)).Elem()
}

func (o LookupCloudCredentialResultOutput) ToLookupCloudCredentialResultOutput() LookupCloudCredentialResultOutput {
	return o
}

func (o LookupCloudCredentialResultOutput) ToLookupCloudCredentialResultOutputWithContext(ctx context.Context) LookupCloudCredentialResultOutput {
	return o
}

// (Computed) Annotations for the Cloud Credential (map)
func (o LookupCloudCredentialResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCloudCredentialResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCloudCredentialResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudCredentialResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for the Cloud Credential (map)
func (o LookupCloudCredentialResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCloudCredentialResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupCloudCredentialResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudCredentialResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudCredentialResultOutput{})
}
