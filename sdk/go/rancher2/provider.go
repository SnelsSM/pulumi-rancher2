// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the rancher2 package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// API Key used to authenticate with the rancher server
	AccessKey pulumi.StringPtrOutput `pulumi:"accessKey"`
	// The URL to the rancher API
	ApiUrl pulumi.StringOutput `pulumi:"apiUrl"`
	// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
	CaCerts pulumi.StringPtrOutput `pulumi:"caCerts"`
	// API secret used to authenticate with the rancher server
	SecretKey pulumi.StringPtrOutput `pulumi:"secretKey"`
	// Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
	Timeout pulumi.StringPtrOutput `pulumi:"timeout"`
	// API token used to authenticate with the rancher server
	TokenKey pulumi.StringPtrOutput `pulumi:"tokenKey"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiUrl == nil {
		return nil, errors.New("invalid value for required argument 'ApiUrl'")
	}
	if args.Bootstrap == nil {
		args.Bootstrap = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "RANCHER_BOOTSTRAP").(bool))
	}
	if args.Insecure == nil {
		args.Insecure = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "RANCHER_INSECURE").(bool))
	}
	if args.AccessKey != nil {
		args.AccessKey = pulumi.ToSecret(args.AccessKey).(pulumi.StringPtrInput)
	}
	if args.SecretKey != nil {
		args.SecretKey = pulumi.ToSecret(args.SecretKey).(pulumi.StringPtrInput)
	}
	if args.TokenKey != nil {
		args.TokenKey = pulumi.ToSecret(args.TokenKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessKey",
		"secretKey",
		"tokenKey",
	})
	opts = append(opts, secrets)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:rancher2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// API Key used to authenticate with the rancher server
	AccessKey *string `pulumi:"accessKey"`
	// The URL to the rancher API
	ApiUrl string `pulumi:"apiUrl"`
	// Bootstrap rancher server
	Bootstrap *bool `pulumi:"bootstrap"`
	// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
	CaCerts *string `pulumi:"caCerts"`
	// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
	Insecure *bool `pulumi:"insecure"`
	// Rancher connection retries
	//
	// Deprecated: Use timeout instead
	Retries *int `pulumi:"retries"`
	// API secret used to authenticate with the rancher server
	SecretKey *string `pulumi:"secretKey"`
	// Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
	Timeout *string `pulumi:"timeout"`
	// API token used to authenticate with the rancher server
	TokenKey *string `pulumi:"tokenKey"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// API Key used to authenticate with the rancher server
	AccessKey pulumi.StringPtrInput
	// The URL to the rancher API
	ApiUrl pulumi.StringInput
	// Bootstrap rancher server
	Bootstrap pulumi.BoolPtrInput
	// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
	CaCerts pulumi.StringPtrInput
	// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
	Insecure pulumi.BoolPtrInput
	// Rancher connection retries
	//
	// Deprecated: Use timeout instead
	Retries pulumi.IntPtrInput
	// API secret used to authenticate with the rancher server
	SecretKey pulumi.StringPtrInput
	// Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
	Timeout pulumi.StringPtrInput
	// API token used to authenticate with the rancher server
	TokenKey pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// API Key used to authenticate with the rancher server
func (o ProviderOutput) AccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AccessKey }).(pulumi.StringPtrOutput)
}

// The URL to the rancher API
func (o ProviderOutput) ApiUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.ApiUrl }).(pulumi.StringOutput)
}

// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
func (o ProviderOutput) CaCerts() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.CaCerts }).(pulumi.StringPtrOutput)
}

// API secret used to authenticate with the rancher server
func (o ProviderOutput) SecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SecretKey }).(pulumi.StringPtrOutput)
}

// Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
func (o ProviderOutput) Timeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Timeout }).(pulumi.StringPtrOutput)
}

// API token used to authenticate with the rancher server
func (o ProviderOutput) TokenKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TokenKey }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
