// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 certificate.
//
// Depending of the availability, there are 2 types of Rancher v2 certificates:
// - Project certificate: Available to all namespaces in the `projectId`
// - Namespaced certificate: Available to just `namespaceId` in the `projectId`
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
//			_, err := rancher2.LookupCertificate(ctx, &rancher2.LookupCertificateArgs{
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
//			_, err := rancher2.LookupCertificate(ctx, &rancher2.LookupCertificateArgs{
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
func LookupCertificate(ctx *pulumi.Context, args *LookupCertificateArgs, opts ...pulumi.InvokeOption) (*LookupCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCertificateResult
	err := ctx.Invoke("rancher2:index/getCertificate:getCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateArgs struct {
	// The name of the certificate (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced certificate (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the certificate (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCertificate.
type LookupCertificateResult struct {
	// (Computed) Annotations for certificate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Base64 encoded certs (string)
	Certs string `pulumi:"certs"`
	// (Computed) A certificate description (string)
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for certificate object (map)
	Labels      map[string]interface{} `pulumi:"labels"`
	Name        string                 `pulumi:"name"`
	NamespaceId *string                `pulumi:"namespaceId"`
	ProjectId   string                 `pulumi:"projectId"`
}

func LookupCertificateOutput(ctx *pulumi.Context, args LookupCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupCertificateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCertificateResult, error) {
			args := v.(LookupCertificateArgs)
			r, err := LookupCertificate(ctx, &args, opts...)
			var s LookupCertificateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCertificateResultOutput)
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateOutputArgs struct {
	// The name of the certificate (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The namespace id where to assign the namespaced certificate (string)
	NamespaceId pulumi.StringPtrInput `pulumi:"namespaceId"`
	// The project id where to assign the certificate (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getCertificate.
type LookupCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateResult)(nil)).Elem()
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutput() LookupCertificateResultOutput {
	return o
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutputWithContext(ctx context.Context) LookupCertificateResultOutput {
	return o
}

// (Computed) Annotations for certificate object (map)
func (o LookupCertificateResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupCertificateResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Base64 encoded certs (string)
func (o LookupCertificateResultOutput) Certs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Certs }).(pulumi.StringOutput)
}

// (Computed) A certificate description (string)
func (o LookupCertificateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for certificate object (map)
func (o LookupCertificateResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupCertificateResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupCertificateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) NamespaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCertificateResult) *string { return v.NamespaceId }).(pulumi.StringPtrOutput)
}

func (o LookupCertificateResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCertificateResultOutput{})
}
