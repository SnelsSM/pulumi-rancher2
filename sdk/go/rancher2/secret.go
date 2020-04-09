// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Secret resource. This can be used to create secrets for Rancher v2 environments and retrieve their information.
//
// Depending of the availability, there are 2 types of Rancher v2 secrets:
// - Project secret: Available to all namespaces in the `projectId`
// - Namespaced secret: Available to just `namespaceId` in the `projectId`
//
//
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/secret.html.markdown.
type Secret struct {
	pulumi.CustomResourceState

	// Annotations for secret object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Secret key/value data. Base64 encoding required for values (map)
	Data pulumi.MapOutput `pulumi:"data"`
	// A secret description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels for secret object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the secret (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewSecret registers a new resource with the given unique name, arguments, and options.
func NewSecret(ctx *pulumi.Context,
	name string, args *SecretArgs, opts ...pulumi.ResourceOption) (*Secret, error) {
	if args == nil || args.Data == nil {
		return nil, errors.New("missing required argument 'Data'")
	}
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil {
		args = &SecretArgs{}
	}
	var resource Secret
	err := ctx.RegisterResource("rancher2:index/secret:Secret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecret gets an existing Secret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretState, opts ...pulumi.ResourceOption) (*Secret, error) {
	var resource Secret
	err := ctx.ReadResource("rancher2:index/secret:Secret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Secret resources.
type secretState struct {
	// Annotations for secret object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Secret key/value data. Base64 encoding required for values (map)
	Data map[string]interface{} `pulumi:"data"`
	// A secret description (string)
	Description *string `pulumi:"description"`
	// Labels for secret object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the secret (string)
	Name *string `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId *string `pulumi:"projectId"`
}

type SecretState struct {
	// Annotations for secret object (map)
	Annotations pulumi.MapInput
	// Secret key/value data. Base64 encoding required for values (map)
	Data pulumi.MapInput
	// A secret description (string)
	Description pulumi.StringPtrInput
	// Labels for secret object (map)
	Labels pulumi.MapInput
	// The name of the secret (string)
	Name pulumi.StringPtrInput
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where to assign the secret (string)
	ProjectId pulumi.StringPtrInput
}

func (SecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretState)(nil)).Elem()
}

type secretArgs struct {
	// Annotations for secret object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Secret key/value data. Base64 encoding required for values (map)
	Data map[string]interface{} `pulumi:"data"`
	// A secret description (string)
	Description *string `pulumi:"description"`
	// Labels for secret object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the secret (string)
	Name *string `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a Secret resource.
type SecretArgs struct {
	// Annotations for secret object (map)
	Annotations pulumi.MapInput
	// Secret key/value data. Base64 encoding required for values (map)
	Data pulumi.MapInput
	// A secret description (string)
	Description pulumi.StringPtrInput
	// Labels for secret object (map)
	Labels pulumi.MapInput
	// The name of the secret (string)
	Name pulumi.StringPtrInput
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId pulumi.StringPtrInput
	// The project id where to assign the secret (string)
	ProjectId pulumi.StringInput
}

func (SecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretArgs)(nil)).Elem()
}
