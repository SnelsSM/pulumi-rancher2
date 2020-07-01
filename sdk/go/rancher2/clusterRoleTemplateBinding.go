// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterRoleTemplateBinding(ctx, "foo", &rancher2.ClusterRoleTemplateBindingArgs{
// 			ClusterId:      pulumi.String("<cluster_id>"),
// 			RoleTemplateId: pulumi.String("<role_template_id>"),
// 			UserId:         pulumi.String("<user_id>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ClusterRoleTemplateBinding struct {
	pulumi.CustomResourceState

	// Annotations for cluster role template binding (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where bind cluster role template binding (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The group ID to assign cluster role template binding (string)
	GroupId pulumi.StringPtrOutput `pulumi:"groupId"`
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId pulumi.StringOutput `pulumi:"groupPrincipalId"`
	// Labels for cluster role template binding (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the cluster role template binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId pulumi.StringOutput `pulumi:"roleTemplateId"`
	// The user ID to assign cluster role template binding (string)
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId pulumi.StringOutput `pulumi:"userPrincipalId"`
}

// NewClusterRoleTemplateBinding registers a new resource with the given unique name, arguments, and options.
func NewClusterRoleTemplateBinding(ctx *pulumi.Context,
	name string, args *ClusterRoleTemplateBindingArgs, opts ...pulumi.ResourceOption) (*ClusterRoleTemplateBinding, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.RoleTemplateId == nil {
		return nil, errors.New("missing required argument 'RoleTemplateId'")
	}
	if args == nil {
		args = &ClusterRoleTemplateBindingArgs{}
	}
	var resource ClusterRoleTemplateBinding
	err := ctx.RegisterResource("rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterRoleTemplateBinding gets an existing ClusterRoleTemplateBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterRoleTemplateBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterRoleTemplateBindingState, opts ...pulumi.ResourceOption) (*ClusterRoleTemplateBinding, error) {
	var resource ClusterRoleTemplateBinding
	err := ctx.ReadResource("rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterRoleTemplateBinding resources.
type clusterRoleTemplateBindingState struct {
	// Annotations for cluster role template binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where bind cluster role template binding (string)
	ClusterId *string `pulumi:"clusterId"`
	// The group ID to assign cluster role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels for cluster role template binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the cluster role template binding (string)
	Name *string `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
	// The user ID to assign cluster role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

type ClusterRoleTemplateBindingState struct {
	// Annotations for cluster role template binding (map)
	Annotations pulumi.MapInput
	// The cluster id where bind cluster role template binding (string)
	ClusterId pulumi.StringPtrInput
	// The group ID to assign cluster role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels for cluster role template binding (map)
	Labels pulumi.MapInput
	// The name of the cluster role template binding (string)
	Name pulumi.StringPtrInput
	// The role template id from create cluster role template binding (string)
	RoleTemplateId pulumi.StringPtrInput
	// The user ID to assign cluster role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ClusterRoleTemplateBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterRoleTemplateBindingState)(nil)).Elem()
}

type clusterRoleTemplateBindingArgs struct {
	// Annotations for cluster role template binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where bind cluster role template binding (string)
	ClusterId string `pulumi:"clusterId"`
	// The group ID to assign cluster role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels for cluster role template binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the cluster role template binding (string)
	Name *string `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId string `pulumi:"roleTemplateId"`
	// The user ID to assign cluster role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

// The set of arguments for constructing a ClusterRoleTemplateBinding resource.
type ClusterRoleTemplateBindingArgs struct {
	// Annotations for cluster role template binding (map)
	Annotations pulumi.MapInput
	// The cluster id where bind cluster role template binding (string)
	ClusterId pulumi.StringInput
	// The group ID to assign cluster role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels for cluster role template binding (map)
	Labels pulumi.MapInput
	// The name of the cluster role template binding (string)
	Name pulumi.StringPtrInput
	// The role template id from create cluster role template binding (string)
	RoleTemplateId pulumi.StringInput
	// The user ID to assign cluster role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ClusterRoleTemplateBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterRoleTemplateBindingArgs)(nil)).Elem()
}
