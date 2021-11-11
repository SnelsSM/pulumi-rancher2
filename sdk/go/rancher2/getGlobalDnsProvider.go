// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher V2 Global DNS Provider data source. Use this data source to retrieve information about a Rancher v2 global DNS provider
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.LookupGlobalDnsProvider(ctx, &GetGlobalDnsProviderArgs{
// 			Name: "foo",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupGlobalDnsProvider(ctx *pulumi.Context, args *LookupGlobalDnsProviderArgs, opts ...pulumi.InvokeOption) (*LookupGlobalDnsProviderResult, error) {
	var rv LookupGlobalDnsProviderResult
	err := ctx.Invoke("rancher2:index/getGlobalDnsProvider:getGlobalDnsProvider", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalDnsProvider.
type LookupGlobalDnsProviderArgs struct {
	// The name of the global DNS provider (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getGlobalDnsProvider.
type LookupGlobalDnsProviderResult struct {
	AlidnsConfig GetGlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// (Computed) Annotations of the resource (map)
	Annotations      map[string]interface{}               `pulumi:"annotations"`
	CloudflareConfig GetGlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	DnsProvider      string                               `pulumi:"dnsProvider"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the global DNS provider (string)
	Name          string                            `pulumi:"name"`
	RootDomain    string                            `pulumi:"rootDomain"`
	Route53Config GetGlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}

func LookupGlobalDnsProviderOutput(ctx *pulumi.Context, args LookupGlobalDnsProviderOutputArgs, opts ...pulumi.InvokeOption) LookupGlobalDnsProviderResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGlobalDnsProviderResult, error) {
			args := v.(LookupGlobalDnsProviderArgs)
			r, err := LookupGlobalDnsProvider(ctx, &args, opts...)
			return *r, err
		}).(LookupGlobalDnsProviderResultOutput)
}

// A collection of arguments for invoking getGlobalDnsProvider.
type LookupGlobalDnsProviderOutputArgs struct {
	// The name of the global DNS provider (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupGlobalDnsProviderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalDnsProviderArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalDnsProvider.
type LookupGlobalDnsProviderResultOutput struct{ *pulumi.OutputState }

func (LookupGlobalDnsProviderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalDnsProviderResult)(nil)).Elem()
}

func (o LookupGlobalDnsProviderResultOutput) ToLookupGlobalDnsProviderResultOutput() LookupGlobalDnsProviderResultOutput {
	return o
}

func (o LookupGlobalDnsProviderResultOutput) ToLookupGlobalDnsProviderResultOutputWithContext(ctx context.Context) LookupGlobalDnsProviderResultOutput {
	return o
}

func (o LookupGlobalDnsProviderResultOutput) AlidnsConfig() GetGlobalDnsProviderAlidnsConfigOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) GetGlobalDnsProviderAlidnsConfig { return v.AlidnsConfig }).(GetGlobalDnsProviderAlidnsConfigOutput)
}

// (Computed) Annotations of the resource (map)
func (o LookupGlobalDnsProviderResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupGlobalDnsProviderResultOutput) CloudflareConfig() GetGlobalDnsProviderCloudflareConfigOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) GetGlobalDnsProviderCloudflareConfig { return v.CloudflareConfig }).(GetGlobalDnsProviderCloudflareConfigOutput)
}

func (o LookupGlobalDnsProviderResultOutput) DnsProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) string { return v.DnsProvider }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGlobalDnsProviderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupGlobalDnsProviderResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the global DNS provider (string)
func (o LookupGlobalDnsProviderResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupGlobalDnsProviderResultOutput) RootDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) string { return v.RootDomain }).(pulumi.StringOutput)
}

func (o LookupGlobalDnsProviderResultOutput) Route53Config() GetGlobalDnsProviderRoute53ConfigOutput {
	return o.ApplyT(func(v LookupGlobalDnsProviderResult) GetGlobalDnsProviderRoute53Config { return v.Route53Config }).(GetGlobalDnsProviderRoute53ConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGlobalDnsProviderResultOutput{})
}
