// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/global_role_binding.html.markdown.
type GlobalRoleBinding struct {
	pulumi.CustomResourceState

	// Annotations for global role binding (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringOutput `pulumi:"globalRoleId"`
	// Labels for global role binding (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the global role binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewGlobalRoleBinding registers a new resource with the given unique name, arguments, and options.
func NewGlobalRoleBinding(ctx *pulumi.Context,
	name string, args *GlobalRoleBindingArgs, opts ...pulumi.ResourceOption) (*GlobalRoleBinding, error) {
	if args == nil || args.GlobalRoleId == nil {
		return nil, errors.New("missing required argument 'GlobalRoleId'")
	}
	if args == nil || args.UserId == nil {
		return nil, errors.New("missing required argument 'UserId'")
	}
	if args == nil {
		args = &GlobalRoleBindingArgs{}
	}
	var resource GlobalRoleBinding
	err := ctx.RegisterResource("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalRoleBinding gets an existing GlobalRoleBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalRoleBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalRoleBindingState, opts ...pulumi.ResourceOption) (*GlobalRoleBinding, error) {
	var resource GlobalRoleBinding
	err := ctx.ReadResource("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalRoleBinding resources.
type globalRoleBindingState struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId *string `pulumi:"globalRoleId"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the global role binding (string)
	Name *string `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId *string `pulumi:"userId"`
}

type GlobalRoleBindingState struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringPtrInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The name of the global role binding (string)
	Name pulumi.StringPtrInput
	// The user ID to assign global role binding (string)
	UserId pulumi.StringPtrInput
}

func (GlobalRoleBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleBindingState)(nil)).Elem()
}

type globalRoleBindingArgs struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId string `pulumi:"globalRoleId"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the global role binding (string)
	Name *string `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a GlobalRoleBinding resource.
type GlobalRoleBindingArgs struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The name of the global role binding (string)
	Name pulumi.StringPtrInput
	// The user ID to assign global role binding (string)
	UserId pulumi.StringInput
}

func (GlobalRoleBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleBindingArgs)(nil)).Elem()
}

