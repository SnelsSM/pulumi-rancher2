// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 certificate resource. This can be used to create certificates for Rancher v2 environments and retrieve their information.
//
// There are 2 types of Rancher v2 certificates:
// - Project certificate: Available to all namespaces in the `projectId`
// - Namespaced certificate: Available to just `namespaceId` in the `projectId`
type Certificate struct {
	pulumi.CustomResourceState

	// Annotations for certificate object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Base64 encoded public certs (string)
	Certs pulumi.StringOutput `pulumi:"certs"`
	// A certificate description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Base64 encoded private key (string)
	Key pulumi.StringOutput `pulumi:"key"`
	// Labels for certificate object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the certificate (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace id where the namespaced certificate should be created (string)
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// The project id where the certificate should be created  (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certs == nil {
		return nil, errors.New("invalid value for required argument 'Certs'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Key != nil {
		args.Key = pulumi.ToSecret(args.Key).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"key",
	})
	opts = append(opts, secrets)
	var resource Certificate
	err := ctx.RegisterResource("rancher2:index/certificate:Certificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificate gets an existing Certificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateState, opts ...pulumi.ResourceOption) (*Certificate, error) {
	var resource Certificate
	err := ctx.ReadResource("rancher2:index/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// Annotations for certificate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Base64 encoded public certs (string)
	Certs *string `pulumi:"certs"`
	// A certificate description (string)
	Description *string `pulumi:"description"`
	// Base64 encoded private key (string)
	Key *string `pulumi:"key"`
	// Labels for certificate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the certificate (string)
	Name *string `pulumi:"name"`
	// The namespace id where the namespaced certificate should be created (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where the certificate should be created  (string)
	ProjectId *string `pulumi:"projectId"`
}

type CertificateState struct {
	// Annotations for certificate object (map)
	Annotations pulumi.MapInput
	// Base64 encoded public certs (string)
	Certs pulumi.StringPtrInput
	// A certificate description (string)
	Description pulumi.StringPtrInput
	// Base64 encoded private key (string)
	Key pulumi.StringPtrInput
	// Labels for certificate object (map)
	Labels pulumi.MapInput
	// The name of the certificate (string)
	Name pulumi.StringPtrInput
	// The namespace id where the namespaced certificate should be created (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where the certificate should be created  (string)
	ProjectId pulumi.StringPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// Annotations for certificate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Base64 encoded public certs (string)
	Certs string `pulumi:"certs"`
	// A certificate description (string)
	Description *string `pulumi:"description"`
	// Base64 encoded private key (string)
	Key string `pulumi:"key"`
	// Labels for certificate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the certificate (string)
	Name *string `pulumi:"name"`
	// The namespace id where the namespaced certificate should be created (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where the certificate should be created  (string)
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// Annotations for certificate object (map)
	Annotations pulumi.MapInput
	// Base64 encoded public certs (string)
	Certs pulumi.StringInput
	// A certificate description (string)
	Description pulumi.StringPtrInput
	// Base64 encoded private key (string)
	Key pulumi.StringInput
	// Labels for certificate object (map)
	Labels pulumi.MapInput
	// The name of the certificate (string)
	Name pulumi.StringPtrInput
	// The namespace id where the namespaced certificate should be created (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where the certificate should be created  (string)
	ProjectId pulumi.StringInput
}

func (CertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateArgs)(nil)).Elem()
}

type CertificateInput interface {
	pulumi.Input

	ToCertificateOutput() CertificateOutput
	ToCertificateOutputWithContext(ctx context.Context) CertificateOutput
}

func (*Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

// CertificateArrayInput is an input type that accepts CertificateArray and CertificateArrayOutput values.
// You can construct a concrete instance of `CertificateArrayInput` via:
//
//	CertificateArray{ CertificateArgs{...} }
type CertificateArrayInput interface {
	pulumi.Input

	ToCertificateArrayOutput() CertificateArrayOutput
	ToCertificateArrayOutputWithContext(context.Context) CertificateArrayOutput
}

type CertificateArray []CertificateInput

func (CertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (i CertificateArray) ToCertificateArrayOutput() CertificateArrayOutput {
	return i.ToCertificateArrayOutputWithContext(context.Background())
}

func (i CertificateArray) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateArrayOutput)
}

// CertificateMapInput is an input type that accepts CertificateMap and CertificateMapOutput values.
// You can construct a concrete instance of `CertificateMapInput` via:
//
//	CertificateMap{ "key": CertificateArgs{...} }
type CertificateMapInput interface {
	pulumi.Input

	ToCertificateMapOutput() CertificateMapOutput
	ToCertificateMapOutputWithContext(context.Context) CertificateMapOutput
}

type CertificateMap map[string]CertificateInput

func (CertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (i CertificateMap) ToCertificateMapOutput() CertificateMapOutput {
	return i.ToCertificateMapOutputWithContext(context.Background())
}

func (i CertificateMap) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateMapOutput)
}

type CertificateOutput struct{ *pulumi.OutputState }

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

// Annotations for certificate object (map)
func (o CertificateOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *Certificate) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Base64 encoded public certs (string)
func (o CertificateOutput) Certs() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Certs }).(pulumi.StringOutput)
}

// A certificate description (string)
func (o CertificateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Base64 encoded private key (string)
func (o CertificateOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Labels for certificate object (map)
func (o CertificateOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Certificate) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the certificate (string)
func (o CertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The namespace id where the namespaced certificate should be created (string)
func (o CertificateOutput) NamespaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.NamespaceId }).(pulumi.StringPtrOutput)
}

// The project id where the certificate should be created  (string)
func (o CertificateOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type CertificateArrayOutput struct{ *pulumi.OutputState }

func (CertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (o CertificateArrayOutput) ToCertificateArrayOutput() CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) Index(i pulumi.IntInput) CertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].([]*Certificate)[vs[1].(int)]
	}).(CertificateOutput)
}

type CertificateMapOutput struct{ *pulumi.OutputState }

func (CertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (o CertificateMapOutput) ToCertificateMapOutput() CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) MapIndex(k pulumi.StringInput) CertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].(map[string]*Certificate)[vs[1].(string)]
	}).(CertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateInput)(nil)).Elem(), &Certificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateArrayInput)(nil)).Elem(), CertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateMapInput)(nil)).Elem(), CertificateMap{})
	pulumi.RegisterOutputType(CertificateOutput{})
	pulumi.RegisterOutputType(CertificateArrayOutput{})
	pulumi.RegisterOutputType(CertificateMapOutput{})
}
