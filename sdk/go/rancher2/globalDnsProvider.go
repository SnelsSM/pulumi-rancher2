// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`
//
// ## Import
//
// # Global DNS Providers can be imported using the Rancher Global DNS Provider ID
//
// ```sh
//
//	$ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo <global_dns_provider_id>
//
// ```
type GlobalDnsProvider struct {
	pulumi.CustomResourceState

	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrOutput `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapOutput                           `pulumi:"annotations"`
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrOutput `pulumi:"cloudflareConfig"`
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider pulumi.StringOutput `pulumi:"dnsProvider"`
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringOutput                     `pulumi:"rootDomain"`
	Route53Config GlobalDnsProviderRoute53ConfigPtrOutput `pulumi:"route53Config"`
}

// NewGlobalDnsProvider registers a new resource with the given unique name, arguments, and options.
func NewGlobalDnsProvider(ctx *pulumi.Context,
	name string, args *GlobalDnsProviderArgs, opts ...pulumi.ResourceOption) (*GlobalDnsProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RootDomain == nil {
		return nil, errors.New("invalid value for required argument 'RootDomain'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalDnsProvider
	err := ctx.RegisterResource("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalDnsProvider gets an existing GlobalDnsProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalDnsProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalDnsProviderState, opts ...pulumi.ResourceOption) (*GlobalDnsProvider, error) {
	var resource GlobalDnsProvider
	err := ctx.ReadResource("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalDnsProvider resources.
type globalDnsProviderState struct {
	AlidnsConfig *GlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      map[string]interface{}             `pulumi:"annotations"`
	CloudflareConfig *GlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider *string `pulumi:"dnsProvider"`
	// Labels for Global DNS Provider (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name *string `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    *string                         `pulumi:"rootDomain"`
	Route53Config *GlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}

type GlobalDnsProviderState struct {
	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrInput
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapInput
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrInput
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider pulumi.StringPtrInput
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapInput
	// The name of the Global DNS Provider (string)
	Name pulumi.StringPtrInput
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringPtrInput
	Route53Config GlobalDnsProviderRoute53ConfigPtrInput
}

func (GlobalDnsProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsProviderState)(nil)).Elem()
}

type globalDnsProviderArgs struct {
	AlidnsConfig *GlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      map[string]interface{}             `pulumi:"annotations"`
	CloudflareConfig *GlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	// Labels for Global DNS Provider (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name *string `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    string                          `pulumi:"rootDomain"`
	Route53Config *GlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}

// The set of arguments for constructing a GlobalDnsProvider resource.
type GlobalDnsProviderArgs struct {
	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrInput
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapInput
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrInput
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapInput
	// The name of the Global DNS Provider (string)
	Name pulumi.StringPtrInput
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringInput
	Route53Config GlobalDnsProviderRoute53ConfigPtrInput
}

func (GlobalDnsProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsProviderArgs)(nil)).Elem()
}

type GlobalDnsProviderInput interface {
	pulumi.Input

	ToGlobalDnsProviderOutput() GlobalDnsProviderOutput
	ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput
}

func (*GlobalDnsProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDnsProvider)(nil)).Elem()
}

func (i *GlobalDnsProvider) ToGlobalDnsProviderOutput() GlobalDnsProviderOutput {
	return i.ToGlobalDnsProviderOutputWithContext(context.Background())
}

func (i *GlobalDnsProvider) ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsProviderOutput)
}

func (i *GlobalDnsProvider) ToOutput(ctx context.Context) pulumix.Output[*GlobalDnsProvider] {
	return pulumix.Output[*GlobalDnsProvider]{
		OutputState: i.ToGlobalDnsProviderOutputWithContext(ctx).OutputState,
	}
}

// GlobalDnsProviderArrayInput is an input type that accepts GlobalDnsProviderArray and GlobalDnsProviderArrayOutput values.
// You can construct a concrete instance of `GlobalDnsProviderArrayInput` via:
//
//	GlobalDnsProviderArray{ GlobalDnsProviderArgs{...} }
type GlobalDnsProviderArrayInput interface {
	pulumi.Input

	ToGlobalDnsProviderArrayOutput() GlobalDnsProviderArrayOutput
	ToGlobalDnsProviderArrayOutputWithContext(context.Context) GlobalDnsProviderArrayOutput
}

type GlobalDnsProviderArray []GlobalDnsProviderInput

func (GlobalDnsProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDnsProvider)(nil)).Elem()
}

func (i GlobalDnsProviderArray) ToGlobalDnsProviderArrayOutput() GlobalDnsProviderArrayOutput {
	return i.ToGlobalDnsProviderArrayOutputWithContext(context.Background())
}

func (i GlobalDnsProviderArray) ToGlobalDnsProviderArrayOutputWithContext(ctx context.Context) GlobalDnsProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsProviderArrayOutput)
}

func (i GlobalDnsProviderArray) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalDnsProvider] {
	return pulumix.Output[[]*GlobalDnsProvider]{
		OutputState: i.ToGlobalDnsProviderArrayOutputWithContext(ctx).OutputState,
	}
}

// GlobalDnsProviderMapInput is an input type that accepts GlobalDnsProviderMap and GlobalDnsProviderMapOutput values.
// You can construct a concrete instance of `GlobalDnsProviderMapInput` via:
//
//	GlobalDnsProviderMap{ "key": GlobalDnsProviderArgs{...} }
type GlobalDnsProviderMapInput interface {
	pulumi.Input

	ToGlobalDnsProviderMapOutput() GlobalDnsProviderMapOutput
	ToGlobalDnsProviderMapOutputWithContext(context.Context) GlobalDnsProviderMapOutput
}

type GlobalDnsProviderMap map[string]GlobalDnsProviderInput

func (GlobalDnsProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDnsProvider)(nil)).Elem()
}

func (i GlobalDnsProviderMap) ToGlobalDnsProviderMapOutput() GlobalDnsProviderMapOutput {
	return i.ToGlobalDnsProviderMapOutputWithContext(context.Background())
}

func (i GlobalDnsProviderMap) ToGlobalDnsProviderMapOutputWithContext(ctx context.Context) GlobalDnsProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsProviderMapOutput)
}

func (i GlobalDnsProviderMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalDnsProvider] {
	return pulumix.Output[map[string]*GlobalDnsProvider]{
		OutputState: i.ToGlobalDnsProviderMapOutputWithContext(ctx).OutputState,
	}
}

type GlobalDnsProviderOutput struct{ *pulumi.OutputState }

func (GlobalDnsProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDnsProvider)(nil)).Elem()
}

func (o GlobalDnsProviderOutput) ToGlobalDnsProviderOutput() GlobalDnsProviderOutput {
	return o
}

func (o GlobalDnsProviderOutput) ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput {
	return o
}

func (o GlobalDnsProviderOutput) ToOutput(ctx context.Context) pulumix.Output[*GlobalDnsProvider] {
	return pulumix.Output[*GlobalDnsProvider]{
		OutputState: o.OutputState,
	}
}

func (o GlobalDnsProviderOutput) AlidnsConfig() GlobalDnsProviderAlidnsConfigPtrOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) GlobalDnsProviderAlidnsConfigPtrOutput { return v.AlidnsConfig }).(GlobalDnsProviderAlidnsConfigPtrOutput)
}

// Annotations for Global DNS Provider (map)
func (o GlobalDnsProviderOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

func (o GlobalDnsProviderOutput) CloudflareConfig() GlobalDnsProviderCloudflareConfigPtrOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) GlobalDnsProviderCloudflareConfigPtrOutput { return v.CloudflareConfig }).(GlobalDnsProviderCloudflareConfigPtrOutput)
}

// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
func (o GlobalDnsProviderOutput) DnsProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) pulumi.StringOutput { return v.DnsProvider }).(pulumi.StringOutput)
}

// Labels for Global DNS Provider (map)
func (o GlobalDnsProviderOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the Global DNS Provider (string)
func (o GlobalDnsProviderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The user ID to assign Global DNS Provider (string)
func (o GlobalDnsProviderOutput) RootDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) pulumi.StringOutput { return v.RootDomain }).(pulumi.StringOutput)
}

func (o GlobalDnsProviderOutput) Route53Config() GlobalDnsProviderRoute53ConfigPtrOutput {
	return o.ApplyT(func(v *GlobalDnsProvider) GlobalDnsProviderRoute53ConfigPtrOutput { return v.Route53Config }).(GlobalDnsProviderRoute53ConfigPtrOutput)
}

type GlobalDnsProviderArrayOutput struct{ *pulumi.OutputState }

func (GlobalDnsProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDnsProvider)(nil)).Elem()
}

func (o GlobalDnsProviderArrayOutput) ToGlobalDnsProviderArrayOutput() GlobalDnsProviderArrayOutput {
	return o
}

func (o GlobalDnsProviderArrayOutput) ToGlobalDnsProviderArrayOutputWithContext(ctx context.Context) GlobalDnsProviderArrayOutput {
	return o
}

func (o GlobalDnsProviderArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalDnsProvider] {
	return pulumix.Output[[]*GlobalDnsProvider]{
		OutputState: o.OutputState,
	}
}

func (o GlobalDnsProviderArrayOutput) Index(i pulumi.IntInput) GlobalDnsProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalDnsProvider {
		return vs[0].([]*GlobalDnsProvider)[vs[1].(int)]
	}).(GlobalDnsProviderOutput)
}

type GlobalDnsProviderMapOutput struct{ *pulumi.OutputState }

func (GlobalDnsProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDnsProvider)(nil)).Elem()
}

func (o GlobalDnsProviderMapOutput) ToGlobalDnsProviderMapOutput() GlobalDnsProviderMapOutput {
	return o
}

func (o GlobalDnsProviderMapOutput) ToGlobalDnsProviderMapOutputWithContext(ctx context.Context) GlobalDnsProviderMapOutput {
	return o
}

func (o GlobalDnsProviderMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalDnsProvider] {
	return pulumix.Output[map[string]*GlobalDnsProvider]{
		OutputState: o.OutputState,
	}
}

func (o GlobalDnsProviderMapOutput) MapIndex(k pulumi.StringInput) GlobalDnsProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalDnsProvider {
		return vs[0].(map[string]*GlobalDnsProvider)[vs[1].(string)]
	}).(GlobalDnsProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsProviderInput)(nil)).Elem(), &GlobalDnsProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsProviderArrayInput)(nil)).Elem(), GlobalDnsProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsProviderMapInput)(nil)).Elem(), GlobalDnsProviderMap{})
	pulumi.RegisterOutputType(GlobalDnsProviderOutput{})
	pulumi.RegisterOutputType(GlobalDnsProviderArrayOutput{})
	pulumi.RegisterOutputType(GlobalDnsProviderMapOutput{})
}
