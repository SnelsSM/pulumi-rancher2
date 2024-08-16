// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 docker registry.
//
// Depending of the availability, there are 2 types of Rancher v2 docker registries:
// - Project registry: Available to all namespaces in the `projectId`
// - Namespaced registry: Available to just `namespaceId` in the `projectId`
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
//			// Retrieve a rancher2 Project Registry
//			_, err := rancher2.LookupRegistry(ctx, &rancher2.LookupRegistryArgs{
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
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Retrieve a rancher2 Namespaced Registry
//			_, err := rancher2.LookupRegistry(ctx, &rancher2.LookupRegistryArgs{
//				Name:        "<name>",
//				ProjectId:   "<project_id>",
//				NamespaceId: pulumi.StringRef("<namespace_id>"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRegistry(ctx *pulumi.Context, args *LookupRegistryArgs, opts ...pulumi.InvokeOption) (*LookupRegistryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRegistryResult
	err := ctx.Invoke("rancher2:index/getRegistry:getRegistry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegistry.
type LookupRegistryArgs struct {
	// The name of the registry (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the registry (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getRegistry.
type LookupRegistryResult struct {
	// (Computed) Annotations for Registry object (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) A registry description (string)
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Registry object (map)
	Labels      map[string]string `pulumi:"labels"`
	Name        string            `pulumi:"name"`
	NamespaceId *string           `pulumi:"namespaceId"`
	ProjectId   string            `pulumi:"projectId"`
	// (Computed) Registries data for registry (list)
	Registries []GetRegistryRegistry `pulumi:"registries"`
}

func LookupRegistryOutput(ctx *pulumi.Context, args LookupRegistryOutputArgs, opts ...pulumi.InvokeOption) LookupRegistryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRegistryResult, error) {
			args := v.(LookupRegistryArgs)
			r, err := LookupRegistry(ctx, &args, opts...)
			var s LookupRegistryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRegistryResultOutput)
}

// A collection of arguments for invoking getRegistry.
type LookupRegistryOutputArgs struct {
	// The name of the registry (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The namespace id where to assign the namespaced registry (string)
	NamespaceId pulumi.StringPtrInput `pulumi:"namespaceId"`
	// The project id where to assign the registry (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupRegistryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegistryArgs)(nil)).Elem()
}

// A collection of values returned by getRegistry.
type LookupRegistryResultOutput struct{ *pulumi.OutputState }

func (LookupRegistryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegistryResult)(nil)).Elem()
}

func (o LookupRegistryResultOutput) ToLookupRegistryResultOutput() LookupRegistryResultOutput {
	return o
}

func (o LookupRegistryResultOutput) ToLookupRegistryResultOutputWithContext(ctx context.Context) LookupRegistryResultOutput {
	return o
}

// (Computed) Annotations for Registry object (map)
func (o LookupRegistryResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegistryResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) A registry description (string)
func (o LookupRegistryResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistryResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRegistryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistryResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for Registry object (map)
func (o LookupRegistryResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRegistryResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupRegistryResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistryResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupRegistryResultOutput) NamespaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRegistryResult) *string { return v.NamespaceId }).(pulumi.StringPtrOutput)
}

func (o LookupRegistryResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegistryResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Computed) Registries data for registry (list)
func (o LookupRegistryResultOutput) Registries() GetRegistryRegistryArrayOutput {
	return o.ApplyT(func(v LookupRegistryResult) []GetRegistryRegistry { return v.Registries }).(GetRegistryRegistryArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRegistryResultOutput{})
}
