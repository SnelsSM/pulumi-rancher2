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

// Use this data source to retrieve information about a Rancher v2 secret.
//
// Depending of the availability, there are 2 types of Rancher v2 secrets:
// - Project secret: Available to all namespaces in the `projectId`
// - Namespaced secret: Available to just `namespaceId` in the `projectId`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupSecret(ctx, &rancher2.LookupSecretArgs{
//				Name:      "<name>",
//				ProjectId: "<project_id>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupSecret(ctx, &rancher2.LookupSecretArgs{
//				Name:        "<name>",
//				NamespaceId: pulumi.StringRef("<namespace_id>"),
//				ProjectId:   "<project_id>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSecret(ctx *pulumi.Context, args *LookupSecretArgs, opts ...pulumi.InvokeOption) (*LookupSecretResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecretResult
	err := ctx.Invoke("rancher2:index/getSecret:getSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecret.
type LookupSecretArgs struct {
	// The name of the secret (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getSecret.
type LookupSecretResult struct {
	// (Computed) Annotations for secret object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Secret key/value data. Base64 encoding required for values (map)
	Data map[string]interface{} `pulumi:"data"`
	// (Computed) A secret description (string)
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for secret object (map)
	Labels      map[string]interface{} `pulumi:"labels"`
	Name        string                 `pulumi:"name"`
	NamespaceId *string                `pulumi:"namespaceId"`
	ProjectId   string                 `pulumi:"projectId"`
}

func LookupSecretOutput(ctx *pulumi.Context, args LookupSecretOutputArgs, opts ...pulumi.InvokeOption) LookupSecretResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSecretResult, error) {
			args := v.(LookupSecretArgs)
			r, err := LookupSecret(ctx, &args, opts...)
			var s LookupSecretResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSecretResultOutput)
}

// A collection of arguments for invoking getSecret.
type LookupSecretOutputArgs struct {
	// The name of the secret (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId pulumi.StringPtrInput `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupSecretOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretArgs)(nil)).Elem()
}

// A collection of values returned by getSecret.
type LookupSecretResultOutput struct{ *pulumi.OutputState }

func (LookupSecretResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretResult)(nil)).Elem()
}

func (o LookupSecretResultOutput) ToLookupSecretResultOutput() LookupSecretResultOutput {
	return o
}

func (o LookupSecretResultOutput) ToLookupSecretResultOutputWithContext(ctx context.Context) LookupSecretResultOutput {
	return o
}

func (o LookupSecretResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSecretResult] {
	return pulumix.Output[LookupSecretResult]{
		OutputState: o.OutputState,
	}
}

// (Computed) Annotations for secret object (map)
func (o LookupSecretResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Secret key/value data. Base64 encoding required for values (map)
func (o LookupSecretResultOutput) Data() pulumi.MapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]interface{} { return v.Data }).(pulumi.MapOutput)
}

// (Computed) A secret description (string)
func (o LookupSecretResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecretResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for secret object (map)
func (o LookupSecretResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupSecretResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupSecretResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSecretResultOutput) NamespaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretResult) *string { return v.NamespaceId }).(pulumi.StringPtrOutput)
}

func (o LookupSecretResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecretResultOutput{})
}
