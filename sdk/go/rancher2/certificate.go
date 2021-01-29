// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
	return reflect.TypeOf((*Certificate)(nil))
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

type CertificateOutput struct {
	*pulumi.OutputState
}

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Certificate)(nil))
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CertificateOutput{})
}
