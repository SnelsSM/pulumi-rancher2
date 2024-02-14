// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Node Template resource.
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
//			_, err := rancher2.LookupNodeTemplate(ctx, &rancher2.LookupNodeTemplateArgs{
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
func LookupNodeTemplate(ctx *pulumi.Context, args *LookupNodeTemplateArgs, opts ...pulumi.InvokeOption) (*LookupNodeTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNodeTemplateResult
	err := ctx.Invoke("rancher2:index/getNodeTemplate:getNodeTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeTemplate.
type LookupNodeTemplateArgs struct {
	// The name of the Node Template (string)
	Name string `pulumi:"name"`
	// (Computed) Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
}

// A collection of values returned by getNodeTemplate.
type LookupNodeTemplateResult struct {
	// (Computed) Annotations for Node Template object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId string `pulumi:"cloudCredentialId"`
	// (Computed) Description for the Node Template (string)
	Description string `pulumi:"description"`
	// (Computed) The driver of the node template (string)
	Driver string `pulumi:"driver"`
	// (Computed) Engine environment for the node template (string)
	EngineEnv map[string]interface{} `pulumi:"engineEnv"`
	// (Computed) Insecure registry for the node template (list)
	EngineInsecureRegistries []string `pulumi:"engineInsecureRegistries"`
	// (Computed) Docker engine install URL for the node template (string)
	EngineInstallUrl string `pulumi:"engineInstallUrl"`
	// (Computed) Engine label for the node template (string)
	EngineLabel map[string]interface{} `pulumi:"engineLabel"`
	// (Computed) Engine options for the node template (map)
	EngineOpt map[string]interface{} `pulumi:"engineOpt"`
	// (Computed) Engine registry mirror for the node template (list)
	EngineRegistryMirrors []string `pulumi:"engineRegistryMirrors"`
	// (Computed) Engine storage driver for the node template (string)
	EngineStorageDriver string `pulumi:"engineStorageDriver"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Node Template object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Node taints (List)
	NodeTaints []GetNodeTemplateNodeTaint `pulumi:"nodeTaints"`
	// (Computed) Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
}

func LookupNodeTemplateOutput(ctx *pulumi.Context, args LookupNodeTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupNodeTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodeTemplateResult, error) {
			args := v.(LookupNodeTemplateArgs)
			r, err := LookupNodeTemplate(ctx, &args, opts...)
			var s LookupNodeTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodeTemplateResultOutput)
}

// A collection of arguments for invoking getNodeTemplate.
type LookupNodeTemplateOutputArgs struct {
	// The name of the Node Template (string)
	Name pulumi.StringInput `pulumi:"name"`
	// (Computed) Engine storage driver for the node template (bool)
	UseInternalIpAddress pulumi.BoolPtrInput `pulumi:"useInternalIpAddress"`
}

func (LookupNodeTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getNodeTemplate.
type LookupNodeTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupNodeTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeTemplateResult)(nil)).Elem()
}

func (o LookupNodeTemplateResultOutput) ToLookupNodeTemplateResultOutput() LookupNodeTemplateResultOutput {
	return o
}

func (o LookupNodeTemplateResultOutput) ToLookupNodeTemplateResultOutputWithContext(ctx context.Context) LookupNodeTemplateResultOutput {
	return o
}

// (Computed) Annotations for Node Template object (map)
func (o LookupNodeTemplateResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
func (o LookupNodeTemplateResultOutput) CloudCredentialId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.CloudCredentialId }).(pulumi.StringOutput)
}

// (Computed) Description for the Node Template (string)
func (o LookupNodeTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) The driver of the node template (string)
func (o LookupNodeTemplateResultOutput) Driver() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.Driver }).(pulumi.StringOutput)
}

// (Computed) Engine environment for the node template (string)
func (o LookupNodeTemplateResultOutput) EngineEnv() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) map[string]interface{} { return v.EngineEnv }).(pulumi.MapOutput)
}

// (Computed) Insecure registry for the node template (list)
func (o LookupNodeTemplateResultOutput) EngineInsecureRegistries() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) []string { return v.EngineInsecureRegistries }).(pulumi.StringArrayOutput)
}

// (Computed) Docker engine install URL for the node template (string)
func (o LookupNodeTemplateResultOutput) EngineInstallUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.EngineInstallUrl }).(pulumi.StringOutput)
}

// (Computed) Engine label for the node template (string)
func (o LookupNodeTemplateResultOutput) EngineLabel() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) map[string]interface{} { return v.EngineLabel }).(pulumi.MapOutput)
}

// (Computed) Engine options for the node template (map)
func (o LookupNodeTemplateResultOutput) EngineOpt() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) map[string]interface{} { return v.EngineOpt }).(pulumi.MapOutput)
}

// (Computed) Engine registry mirror for the node template (list)
func (o LookupNodeTemplateResultOutput) EngineRegistryMirrors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) []string { return v.EngineRegistryMirrors }).(pulumi.StringArrayOutput)
}

// (Computed) Engine storage driver for the node template (string)
func (o LookupNodeTemplateResultOutput) EngineStorageDriver() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.EngineStorageDriver }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNodeTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for Node Template object (map)
func (o LookupNodeTemplateResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupNodeTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Node taints (List)
func (o LookupNodeTemplateResultOutput) NodeTaints() GetNodeTemplateNodeTaintArrayOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) []GetNodeTemplateNodeTaint { return v.NodeTaints }).(GetNodeTemplateNodeTaintArrayOutput)
}

// (Computed) Engine storage driver for the node template (bool)
func (o LookupNodeTemplateResultOutput) UseInternalIpAddress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupNodeTemplateResult) *bool { return v.UseInternalIpAddress }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodeTemplateResultOutput{})
}
