// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cloud Credential resource. This can be used to create Cloud Credential for Rancher v2.2.x and retrieve their information.
//
// amazonec2, azure, digitalocean, linode, openstack and vsphere credentials config are supported for Cloud Credential.
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
// 		_, err := rancher2.NewCloudCredential(ctx, "foo", &rancher2.CloudCredentialArgs{
// 			Amazonec2CredentialConfig: &rancher2.CloudCredentialAmazonec2CredentialConfigArgs{
// 				AccessKey: pulumi.String("<AWS_ACCESS_KEY>"),
// 				SecretKey: pulumi.String("<AWS_SECRET_KEY>"),
// 			},
// 			Description: pulumi.String("foo test"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type CloudCredential struct {
	pulumi.CustomResourceState

	// AWS config for the Cloud Credential (list maxitems:1)
	Amazonec2CredentialConfig CloudCredentialAmazonec2CredentialConfigPtrOutput `pulumi:"amazonec2CredentialConfig"`
	// Annotations for Cloud Credential object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Azure config for the Cloud Credential (list maxitems:1)
	AzureCredentialConfig CloudCredentialAzureCredentialConfigPtrOutput `pulumi:"azureCredentialConfig"`
	// Description for the Cloud Credential (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// DigitalOcean config for the Cloud Credential (list maxitems:1)
	DigitaloceanCredentialConfig CloudCredentialDigitaloceanCredentialConfigPtrOutput `pulumi:"digitaloceanCredentialConfig"`
	// (Computed) The driver of the Cloud Credential (string)
	Driver pulumi.StringOutput `pulumi:"driver"`
	// Google config for the Cloud Credential (list maxitems:1)
	GoogleCredentialConfig CloudCredentialGoogleCredentialConfigPtrOutput `pulumi:"googleCredentialConfig"`
	// Labels for Cloud Credential object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Linode config for the Cloud Credential (list maxitems:1)
	LinodeCredentialConfig CloudCredentialLinodeCredentialConfigPtrOutput `pulumi:"linodeCredentialConfig"`
	// The name of the Cloud Credential (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// OpenStack config for the Cloud Credential (list maxitems:1)
	OpenstackCredentialConfig CloudCredentialOpenstackCredentialConfigPtrOutput `pulumi:"openstackCredentialConfig"`
	// vSphere config for the Cloud Credential (list maxitems:1)
	VsphereCredentialConfig CloudCredentialVsphereCredentialConfigPtrOutput `pulumi:"vsphereCredentialConfig"`
}

// NewCloudCredential registers a new resource with the given unique name, arguments, and options.
func NewCloudCredential(ctx *pulumi.Context,
	name string, args *CloudCredentialArgs, opts ...pulumi.ResourceOption) (*CloudCredential, error) {
	if args == nil {
		args = &CloudCredentialArgs{}
	}

	var resource CloudCredential
	err := ctx.RegisterResource("rancher2:index/cloudCredential:CloudCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudCredential gets an existing CloudCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudCredentialState, opts ...pulumi.ResourceOption) (*CloudCredential, error) {
	var resource CloudCredential
	err := ctx.ReadResource("rancher2:index/cloudCredential:CloudCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudCredential resources.
type cloudCredentialState struct {
	// AWS config for the Cloud Credential (list maxitems:1)
	Amazonec2CredentialConfig *CloudCredentialAmazonec2CredentialConfig `pulumi:"amazonec2CredentialConfig"`
	// Annotations for Cloud Credential object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Azure config for the Cloud Credential (list maxitems:1)
	AzureCredentialConfig *CloudCredentialAzureCredentialConfig `pulumi:"azureCredentialConfig"`
	// Description for the Cloud Credential (string)
	Description *string `pulumi:"description"`
	// DigitalOcean config for the Cloud Credential (list maxitems:1)
	DigitaloceanCredentialConfig *CloudCredentialDigitaloceanCredentialConfig `pulumi:"digitaloceanCredentialConfig"`
	// (Computed) The driver of the Cloud Credential (string)
	Driver *string `pulumi:"driver"`
	// Google config for the Cloud Credential (list maxitems:1)
	GoogleCredentialConfig *CloudCredentialGoogleCredentialConfig `pulumi:"googleCredentialConfig"`
	// Labels for Cloud Credential object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Linode config for the Cloud Credential (list maxitems:1)
	LinodeCredentialConfig *CloudCredentialLinodeCredentialConfig `pulumi:"linodeCredentialConfig"`
	// The name of the Cloud Credential (string)
	Name *string `pulumi:"name"`
	// OpenStack config for the Cloud Credential (list maxitems:1)
	OpenstackCredentialConfig *CloudCredentialOpenstackCredentialConfig `pulumi:"openstackCredentialConfig"`
	// vSphere config for the Cloud Credential (list maxitems:1)
	VsphereCredentialConfig *CloudCredentialVsphereCredentialConfig `pulumi:"vsphereCredentialConfig"`
}

type CloudCredentialState struct {
	// AWS config for the Cloud Credential (list maxitems:1)
	Amazonec2CredentialConfig CloudCredentialAmazonec2CredentialConfigPtrInput
	// Annotations for Cloud Credential object (map)
	Annotations pulumi.MapInput
	// Azure config for the Cloud Credential (list maxitems:1)
	AzureCredentialConfig CloudCredentialAzureCredentialConfigPtrInput
	// Description for the Cloud Credential (string)
	Description pulumi.StringPtrInput
	// DigitalOcean config for the Cloud Credential (list maxitems:1)
	DigitaloceanCredentialConfig CloudCredentialDigitaloceanCredentialConfigPtrInput
	// (Computed) The driver of the Cloud Credential (string)
	Driver pulumi.StringPtrInput
	// Google config for the Cloud Credential (list maxitems:1)
	GoogleCredentialConfig CloudCredentialGoogleCredentialConfigPtrInput
	// Labels for Cloud Credential object (map)
	Labels pulumi.MapInput
	// Linode config for the Cloud Credential (list maxitems:1)
	LinodeCredentialConfig CloudCredentialLinodeCredentialConfigPtrInput
	// The name of the Cloud Credential (string)
	Name pulumi.StringPtrInput
	// OpenStack config for the Cloud Credential (list maxitems:1)
	OpenstackCredentialConfig CloudCredentialOpenstackCredentialConfigPtrInput
	// vSphere config for the Cloud Credential (list maxitems:1)
	VsphereCredentialConfig CloudCredentialVsphereCredentialConfigPtrInput
}

func (CloudCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudCredentialState)(nil)).Elem()
}

type cloudCredentialArgs struct {
	// AWS config for the Cloud Credential (list maxitems:1)
	Amazonec2CredentialConfig *CloudCredentialAmazonec2CredentialConfig `pulumi:"amazonec2CredentialConfig"`
	// Annotations for Cloud Credential object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Azure config for the Cloud Credential (list maxitems:1)
	AzureCredentialConfig *CloudCredentialAzureCredentialConfig `pulumi:"azureCredentialConfig"`
	// Description for the Cloud Credential (string)
	Description *string `pulumi:"description"`
	// DigitalOcean config for the Cloud Credential (list maxitems:1)
	DigitaloceanCredentialConfig *CloudCredentialDigitaloceanCredentialConfig `pulumi:"digitaloceanCredentialConfig"`
	// Google config for the Cloud Credential (list maxitems:1)
	GoogleCredentialConfig *CloudCredentialGoogleCredentialConfig `pulumi:"googleCredentialConfig"`
	// Labels for Cloud Credential object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Linode config for the Cloud Credential (list maxitems:1)
	LinodeCredentialConfig *CloudCredentialLinodeCredentialConfig `pulumi:"linodeCredentialConfig"`
	// The name of the Cloud Credential (string)
	Name *string `pulumi:"name"`
	// OpenStack config for the Cloud Credential (list maxitems:1)
	OpenstackCredentialConfig *CloudCredentialOpenstackCredentialConfig `pulumi:"openstackCredentialConfig"`
	// vSphere config for the Cloud Credential (list maxitems:1)
	VsphereCredentialConfig *CloudCredentialVsphereCredentialConfig `pulumi:"vsphereCredentialConfig"`
}

// The set of arguments for constructing a CloudCredential resource.
type CloudCredentialArgs struct {
	// AWS config for the Cloud Credential (list maxitems:1)
	Amazonec2CredentialConfig CloudCredentialAmazonec2CredentialConfigPtrInput
	// Annotations for Cloud Credential object (map)
	Annotations pulumi.MapInput
	// Azure config for the Cloud Credential (list maxitems:1)
	AzureCredentialConfig CloudCredentialAzureCredentialConfigPtrInput
	// Description for the Cloud Credential (string)
	Description pulumi.StringPtrInput
	// DigitalOcean config for the Cloud Credential (list maxitems:1)
	DigitaloceanCredentialConfig CloudCredentialDigitaloceanCredentialConfigPtrInput
	// Google config for the Cloud Credential (list maxitems:1)
	GoogleCredentialConfig CloudCredentialGoogleCredentialConfigPtrInput
	// Labels for Cloud Credential object (map)
	Labels pulumi.MapInput
	// Linode config for the Cloud Credential (list maxitems:1)
	LinodeCredentialConfig CloudCredentialLinodeCredentialConfigPtrInput
	// The name of the Cloud Credential (string)
	Name pulumi.StringPtrInput
	// OpenStack config for the Cloud Credential (list maxitems:1)
	OpenstackCredentialConfig CloudCredentialOpenstackCredentialConfigPtrInput
	// vSphere config for the Cloud Credential (list maxitems:1)
	VsphereCredentialConfig CloudCredentialVsphereCredentialConfigPtrInput
}

func (CloudCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudCredentialArgs)(nil)).Elem()
}

type CloudCredentialInput interface {
	pulumi.Input

	ToCloudCredentialOutput() CloudCredentialOutput
	ToCloudCredentialOutputWithContext(ctx context.Context) CloudCredentialOutput
}

func (*CloudCredential) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudCredential)(nil))
}

func (i *CloudCredential) ToCloudCredentialOutput() CloudCredentialOutput {
	return i.ToCloudCredentialOutputWithContext(context.Background())
}

func (i *CloudCredential) ToCloudCredentialOutputWithContext(ctx context.Context) CloudCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudCredentialOutput)
}

func (i *CloudCredential) ToCloudCredentialPtrOutput() CloudCredentialPtrOutput {
	return i.ToCloudCredentialPtrOutputWithContext(context.Background())
}

func (i *CloudCredential) ToCloudCredentialPtrOutputWithContext(ctx context.Context) CloudCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudCredentialPtrOutput)
}

type CloudCredentialPtrInput interface {
	pulumi.Input

	ToCloudCredentialPtrOutput() CloudCredentialPtrOutput
	ToCloudCredentialPtrOutputWithContext(ctx context.Context) CloudCredentialPtrOutput
}

type cloudCredentialPtrType CloudCredentialArgs

func (*cloudCredentialPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudCredential)(nil))
}

func (i *cloudCredentialPtrType) ToCloudCredentialPtrOutput() CloudCredentialPtrOutput {
	return i.ToCloudCredentialPtrOutputWithContext(context.Background())
}

func (i *cloudCredentialPtrType) ToCloudCredentialPtrOutputWithContext(ctx context.Context) CloudCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudCredentialPtrOutput)
}

// CloudCredentialArrayInput is an input type that accepts CloudCredentialArray and CloudCredentialArrayOutput values.
// You can construct a concrete instance of `CloudCredentialArrayInput` via:
//
//          CloudCredentialArray{ CloudCredentialArgs{...} }
type CloudCredentialArrayInput interface {
	pulumi.Input

	ToCloudCredentialArrayOutput() CloudCredentialArrayOutput
	ToCloudCredentialArrayOutputWithContext(context.Context) CloudCredentialArrayOutput
}

type CloudCredentialArray []CloudCredentialInput

func (CloudCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CloudCredential)(nil))
}

func (i CloudCredentialArray) ToCloudCredentialArrayOutput() CloudCredentialArrayOutput {
	return i.ToCloudCredentialArrayOutputWithContext(context.Background())
}

func (i CloudCredentialArray) ToCloudCredentialArrayOutputWithContext(ctx context.Context) CloudCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudCredentialArrayOutput)
}

// CloudCredentialMapInput is an input type that accepts CloudCredentialMap and CloudCredentialMapOutput values.
// You can construct a concrete instance of `CloudCredentialMapInput` via:
//
//          CloudCredentialMap{ "key": CloudCredentialArgs{...} }
type CloudCredentialMapInput interface {
	pulumi.Input

	ToCloudCredentialMapOutput() CloudCredentialMapOutput
	ToCloudCredentialMapOutputWithContext(context.Context) CloudCredentialMapOutput
}

type CloudCredentialMap map[string]CloudCredentialInput

func (CloudCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CloudCredential)(nil))
}

func (i CloudCredentialMap) ToCloudCredentialMapOutput() CloudCredentialMapOutput {
	return i.ToCloudCredentialMapOutputWithContext(context.Background())
}

func (i CloudCredentialMap) ToCloudCredentialMapOutputWithContext(ctx context.Context) CloudCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudCredentialMapOutput)
}

type CloudCredentialOutput struct {
	*pulumi.OutputState
}

func (CloudCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudCredential)(nil))
}

func (o CloudCredentialOutput) ToCloudCredentialOutput() CloudCredentialOutput {
	return o
}

func (o CloudCredentialOutput) ToCloudCredentialOutputWithContext(ctx context.Context) CloudCredentialOutput {
	return o
}

func (o CloudCredentialOutput) ToCloudCredentialPtrOutput() CloudCredentialPtrOutput {
	return o.ToCloudCredentialPtrOutputWithContext(context.Background())
}

func (o CloudCredentialOutput) ToCloudCredentialPtrOutputWithContext(ctx context.Context) CloudCredentialPtrOutput {
	return o.ApplyT(func(v CloudCredential) *CloudCredential {
		return &v
	}).(CloudCredentialPtrOutput)
}

type CloudCredentialPtrOutput struct {
	*pulumi.OutputState
}

func (CloudCredentialPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudCredential)(nil))
}

func (o CloudCredentialPtrOutput) ToCloudCredentialPtrOutput() CloudCredentialPtrOutput {
	return o
}

func (o CloudCredentialPtrOutput) ToCloudCredentialPtrOutputWithContext(ctx context.Context) CloudCredentialPtrOutput {
	return o
}

type CloudCredentialArrayOutput struct{ *pulumi.OutputState }

func (CloudCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CloudCredential)(nil))
}

func (o CloudCredentialArrayOutput) ToCloudCredentialArrayOutput() CloudCredentialArrayOutput {
	return o
}

func (o CloudCredentialArrayOutput) ToCloudCredentialArrayOutputWithContext(ctx context.Context) CloudCredentialArrayOutput {
	return o
}

func (o CloudCredentialArrayOutput) Index(i pulumi.IntInput) CloudCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CloudCredential {
		return vs[0].([]CloudCredential)[vs[1].(int)]
	}).(CloudCredentialOutput)
}

type CloudCredentialMapOutput struct{ *pulumi.OutputState }

func (CloudCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CloudCredential)(nil))
}

func (o CloudCredentialMapOutput) ToCloudCredentialMapOutput() CloudCredentialMapOutput {
	return o
}

func (o CloudCredentialMapOutput) ToCloudCredentialMapOutputWithContext(ctx context.Context) CloudCredentialMapOutput {
	return o
}

func (o CloudCredentialMapOutput) MapIndex(k pulumi.StringInput) CloudCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CloudCredential {
		return vs[0].(map[string]CloudCredential)[vs[1].(string)]
	}).(CloudCredentialOutput)
}

func init() {
	pulumi.RegisterOutputType(CloudCredentialOutput{})
	pulumi.RegisterOutputType(CloudCredentialPtrOutput{})
	pulumi.RegisterOutputType(CloudCredentialArrayOutput{})
	pulumi.RegisterOutputType(CloudCredentialMapOutput{})
}
