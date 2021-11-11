// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Cluster Driver resource.
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
// 		_, err := rancher2.LookupClusterDriver(ctx, &GetClusterDriverArgs{
// 			Name: "foo",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupClusterDriver(ctx *pulumi.Context, args *LookupClusterDriverArgs, opts ...pulumi.InvokeOption) (*LookupClusterDriverResult, error) {
	var rv LookupClusterDriverResult
	err := ctx.Invoke("rancher2:index/getClusterDriver:getClusterDriver", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterDriver.
type LookupClusterDriverArgs struct {
	// Name of the cluster driver (string)
	Name string `pulumi:"name"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url *string `pulumi:"url"`
}

// A collection of values returned by getClusterDriver.
type LookupClusterDriverResult struct {
	// (Computed) Specify if the cluster driver state (bool)
	Active bool `pulumi:"active"`
	// (Computed) Actual url of the cluster driver (string)
	ActualUrl string `pulumi:"actualUrl"`
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin bool `pulumi:"builtin"`
	// (Computed) Verify that the downloaded driver matches the expected checksum (string)
	Checksum string `pulumi:"checksum"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl string `pulumi:"uiUrl"`
	Url   string `pulumi:"url"`
	// (Computed) Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

func LookupClusterDriverOutput(ctx *pulumi.Context, args LookupClusterDriverOutputArgs, opts ...pulumi.InvokeOption) LookupClusterDriverResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterDriverResult, error) {
			args := v.(LookupClusterDriverArgs)
			r, err := LookupClusterDriver(ctx, &args, opts...)
			return *r, err
		}).(LookupClusterDriverResultOutput)
}

// A collection of arguments for invoking getClusterDriver.
type LookupClusterDriverOutputArgs struct {
	// Name of the cluster driver (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringPtrInput `pulumi:"url"`
}

func (LookupClusterDriverOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterDriverArgs)(nil)).Elem()
}

// A collection of values returned by getClusterDriver.
type LookupClusterDriverResultOutput struct{ *pulumi.OutputState }

func (LookupClusterDriverResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterDriverResult)(nil)).Elem()
}

func (o LookupClusterDriverResultOutput) ToLookupClusterDriverResultOutput() LookupClusterDriverResultOutput {
	return o
}

func (o LookupClusterDriverResultOutput) ToLookupClusterDriverResultOutputWithContext(ctx context.Context) LookupClusterDriverResultOutput {
	return o
}

// (Computed) Specify if the cluster driver state (bool)
func (o LookupClusterDriverResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// (Computed) Actual url of the cluster driver (string)
func (o LookupClusterDriverResultOutput) ActualUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.ActualUrl }).(pulumi.StringOutput)
}

// (Computed) Annotations of the resource (map)
func (o LookupClusterDriverResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Specify whether the cluster driver is an internal cluster driver or not (bool)
func (o LookupClusterDriverResultOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) bool { return v.Builtin }).(pulumi.BoolOutput)
}

// (Computed) Verify that the downloaded driver matches the expected checksum (string)
func (o LookupClusterDriverResultOutput) Checksum() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.Checksum }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterDriverResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupClusterDriverResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupClusterDriverResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The URL to load for customized Add Clusters screen for this driver (string)
func (o LookupClusterDriverResultOutput) UiUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.UiUrl }).(pulumi.StringOutput)
}

func (o LookupClusterDriverResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) string { return v.Url }).(pulumi.StringOutput)
}

// (Computed) Domains to whitelist for the ui (list)
func (o LookupClusterDriverResultOutput) WhitelistDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClusterDriverResult) []string { return v.WhitelistDomains }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterDriverResultOutput{})
}
