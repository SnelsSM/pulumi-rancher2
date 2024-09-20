// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v7/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster template.
//
// Cluster Templates are available from Rancher v2.3.x and above.
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
//			_, err := rancher2.LookupClusterTemplate(ctx, &rancher2.LookupClusterTemplateArgs{
//				Name: "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupClusterTemplate(ctx *pulumi.Context, args *LookupClusterTemplateArgs, opts ...pulumi.InvokeOption) (*LookupClusterTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterTemplateResult
	err := ctx.Invoke("rancher2:index/getClusterTemplate:getClusterTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterTemplate.
type LookupClusterTemplateArgs struct {
	// (Computed) Annotations for the cluster template (map)
	Annotations map[string]string `pulumi:"annotations"`
	Description *string           `pulumi:"description"`
	// (Computed) Labels for the cluster template (map)
	Labels map[string]string `pulumi:"labels"`
	// The cluster template name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterTemplate.
type LookupClusterTemplateResult struct {
	// (Computed) Annotations for the cluster template (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) Default cluster template revision ID (string)
	DefaultRevisionId string `pulumi:"defaultRevisionId"`
	Description       string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for the cluster template (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) Cluster template members (list)
	Members []GetClusterTemplateMember `pulumi:"members"`
	Name    string                     `pulumi:"name"`
	// (Computed) Cluster template revisions (list)
	TemplateRevisions []GetClusterTemplateTemplateRevision `pulumi:"templateRevisions"`
}

func LookupClusterTemplateOutput(ctx *pulumi.Context, args LookupClusterTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupClusterTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterTemplateResultOutput, error) {
			args := v.(LookupClusterTemplateArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupClusterTemplateResult
			secret, err := ctx.InvokePackageRaw("rancher2:index/getClusterTemplate:getClusterTemplate", args, &rv, "", opts...)
			if err != nil {
				return LookupClusterTemplateResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupClusterTemplateResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupClusterTemplateResultOutput), nil
			}
			return output, nil
		}).(LookupClusterTemplateResultOutput)
}

// A collection of arguments for invoking getClusterTemplate.
type LookupClusterTemplateOutputArgs struct {
	// (Computed) Annotations for the cluster template (map)
	Annotations pulumi.StringMapInput `pulumi:"annotations"`
	Description pulumi.StringPtrInput `pulumi:"description"`
	// (Computed) Labels for the cluster template (map)
	Labels pulumi.StringMapInput `pulumi:"labels"`
	// The cluster template name (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupClusterTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getClusterTemplate.
type LookupClusterTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupClusterTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterTemplateResult)(nil)).Elem()
}

func (o LookupClusterTemplateResultOutput) ToLookupClusterTemplateResultOutput() LookupClusterTemplateResultOutput {
	return o
}

func (o LookupClusterTemplateResultOutput) ToLookupClusterTemplateResultOutputWithContext(ctx context.Context) LookupClusterTemplateResultOutput {
	return o
}

// (Computed) Annotations for the cluster template (map)
func (o LookupClusterTemplateResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) Default cluster template revision ID (string)
func (o LookupClusterTemplateResultOutput) DefaultRevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) string { return v.DefaultRevisionId }).(pulumi.StringOutput)
}

func (o LookupClusterTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for the cluster template (map)
func (o LookupClusterTemplateResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) Cluster template members (list)
func (o LookupClusterTemplateResultOutput) Members() GetClusterTemplateMemberArrayOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) []GetClusterTemplateMember { return v.Members }).(GetClusterTemplateMemberArrayOutput)
}

func (o LookupClusterTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Cluster template revisions (list)
func (o LookupClusterTemplateResultOutput) TemplateRevisions() GetClusterTemplateTemplateRevisionArrayOutput {
	return o.ApplyT(func(v LookupClusterTemplateResult) []GetClusterTemplateTemplateRevision { return v.TemplateRevisions }).(GetClusterTemplateTemplateRevisionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterTemplateResultOutput{})
}
