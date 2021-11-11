// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.
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
//
// ## Import
//
// Cluster Role Template Bindings can be imported using the Rancher cluster Role Template Binding ID
//
// ```sh
//  $ pulumi import rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding foo &lt;CLUSTER_ROLE_TEMPLATE_BINDING_ID&gt;
// ```
type ClusterRoleTemplateBinding struct {
	pulumi.CustomResourceState

	// Annotations for cluster role template binding (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where bind cluster role template binding (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The group ID to assign cluster role template binding (string)
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId pulumi.StringOutput `pulumi:"groupPrincipalId"`
	// Labels for cluster role template binding (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the cluster role template binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId pulumi.StringOutput `pulumi:"roleTemplateId"`
	// The user ID to assign cluster role template binding (string)
	UserId pulumi.StringOutput `pulumi:"userId"`
	// The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId pulumi.StringOutput `pulumi:"userPrincipalId"`
}

// NewClusterRoleTemplateBinding registers a new resource with the given unique name, arguments, and options.
func NewClusterRoleTemplateBinding(ctx *pulumi.Context,
	name string, args *ClusterRoleTemplateBindingArgs, opts ...pulumi.ResourceOption) (*ClusterRoleTemplateBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.RoleTemplateId == nil {
		return nil, errors.New("invalid value for required argument 'RoleTemplateId'")
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

type ClusterRoleTemplateBindingInput interface {
	pulumi.Input

	ToClusterRoleTemplateBindingOutput() ClusterRoleTemplateBindingOutput
	ToClusterRoleTemplateBindingOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingOutput
}

func (*ClusterRoleTemplateBinding) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterRoleTemplateBinding)(nil))
}

func (i *ClusterRoleTemplateBinding) ToClusterRoleTemplateBindingOutput() ClusterRoleTemplateBindingOutput {
	return i.ToClusterRoleTemplateBindingOutputWithContext(context.Background())
}

func (i *ClusterRoleTemplateBinding) ToClusterRoleTemplateBindingOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleTemplateBindingOutput)
}

func (i *ClusterRoleTemplateBinding) ToClusterRoleTemplateBindingPtrOutput() ClusterRoleTemplateBindingPtrOutput {
	return i.ToClusterRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (i *ClusterRoleTemplateBinding) ToClusterRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleTemplateBindingPtrOutput)
}

type ClusterRoleTemplateBindingPtrInput interface {
	pulumi.Input

	ToClusterRoleTemplateBindingPtrOutput() ClusterRoleTemplateBindingPtrOutput
	ToClusterRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingPtrOutput
}

type clusterRoleTemplateBindingPtrType ClusterRoleTemplateBindingArgs

func (*clusterRoleTemplateBindingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterRoleTemplateBinding)(nil))
}

func (i *clusterRoleTemplateBindingPtrType) ToClusterRoleTemplateBindingPtrOutput() ClusterRoleTemplateBindingPtrOutput {
	return i.ToClusterRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (i *clusterRoleTemplateBindingPtrType) ToClusterRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleTemplateBindingPtrOutput)
}

// ClusterRoleTemplateBindingArrayInput is an input type that accepts ClusterRoleTemplateBindingArray and ClusterRoleTemplateBindingArrayOutput values.
// You can construct a concrete instance of `ClusterRoleTemplateBindingArrayInput` via:
//
//          ClusterRoleTemplateBindingArray{ ClusterRoleTemplateBindingArgs{...} }
type ClusterRoleTemplateBindingArrayInput interface {
	pulumi.Input

	ToClusterRoleTemplateBindingArrayOutput() ClusterRoleTemplateBindingArrayOutput
	ToClusterRoleTemplateBindingArrayOutputWithContext(context.Context) ClusterRoleTemplateBindingArrayOutput
}

type ClusterRoleTemplateBindingArray []ClusterRoleTemplateBindingInput

func (ClusterRoleTemplateBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterRoleTemplateBinding)(nil)).Elem()
}

func (i ClusterRoleTemplateBindingArray) ToClusterRoleTemplateBindingArrayOutput() ClusterRoleTemplateBindingArrayOutput {
	return i.ToClusterRoleTemplateBindingArrayOutputWithContext(context.Background())
}

func (i ClusterRoleTemplateBindingArray) ToClusterRoleTemplateBindingArrayOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleTemplateBindingArrayOutput)
}

// ClusterRoleTemplateBindingMapInput is an input type that accepts ClusterRoleTemplateBindingMap and ClusterRoleTemplateBindingMapOutput values.
// You can construct a concrete instance of `ClusterRoleTemplateBindingMapInput` via:
//
//          ClusterRoleTemplateBindingMap{ "key": ClusterRoleTemplateBindingArgs{...} }
type ClusterRoleTemplateBindingMapInput interface {
	pulumi.Input

	ToClusterRoleTemplateBindingMapOutput() ClusterRoleTemplateBindingMapOutput
	ToClusterRoleTemplateBindingMapOutputWithContext(context.Context) ClusterRoleTemplateBindingMapOutput
}

type ClusterRoleTemplateBindingMap map[string]ClusterRoleTemplateBindingInput

func (ClusterRoleTemplateBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterRoleTemplateBinding)(nil)).Elem()
}

func (i ClusterRoleTemplateBindingMap) ToClusterRoleTemplateBindingMapOutput() ClusterRoleTemplateBindingMapOutput {
	return i.ToClusterRoleTemplateBindingMapOutputWithContext(context.Background())
}

func (i ClusterRoleTemplateBindingMap) ToClusterRoleTemplateBindingMapOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterRoleTemplateBindingMapOutput)
}

type ClusterRoleTemplateBindingOutput struct{ *pulumi.OutputState }

func (ClusterRoleTemplateBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterRoleTemplateBinding)(nil))
}

func (o ClusterRoleTemplateBindingOutput) ToClusterRoleTemplateBindingOutput() ClusterRoleTemplateBindingOutput {
	return o
}

func (o ClusterRoleTemplateBindingOutput) ToClusterRoleTemplateBindingOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingOutput {
	return o
}

func (o ClusterRoleTemplateBindingOutput) ToClusterRoleTemplateBindingPtrOutput() ClusterRoleTemplateBindingPtrOutput {
	return o.ToClusterRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (o ClusterRoleTemplateBindingOutput) ToClusterRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ClusterRoleTemplateBinding) *ClusterRoleTemplateBinding {
		return &v
	}).(ClusterRoleTemplateBindingPtrOutput)
}

type ClusterRoleTemplateBindingPtrOutput struct{ *pulumi.OutputState }

func (ClusterRoleTemplateBindingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterRoleTemplateBinding)(nil))
}

func (o ClusterRoleTemplateBindingPtrOutput) ToClusterRoleTemplateBindingPtrOutput() ClusterRoleTemplateBindingPtrOutput {
	return o
}

func (o ClusterRoleTemplateBindingPtrOutput) ToClusterRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingPtrOutput {
	return o
}

func (o ClusterRoleTemplateBindingPtrOutput) Elem() ClusterRoleTemplateBindingOutput {
	return o.ApplyT(func(v *ClusterRoleTemplateBinding) ClusterRoleTemplateBinding {
		if v != nil {
			return *v
		}
		var ret ClusterRoleTemplateBinding
		return ret
	}).(ClusterRoleTemplateBindingOutput)
}

type ClusterRoleTemplateBindingArrayOutput struct{ *pulumi.OutputState }

func (ClusterRoleTemplateBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ClusterRoleTemplateBinding)(nil))
}

func (o ClusterRoleTemplateBindingArrayOutput) ToClusterRoleTemplateBindingArrayOutput() ClusterRoleTemplateBindingArrayOutput {
	return o
}

func (o ClusterRoleTemplateBindingArrayOutput) ToClusterRoleTemplateBindingArrayOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingArrayOutput {
	return o
}

func (o ClusterRoleTemplateBindingArrayOutput) Index(i pulumi.IntInput) ClusterRoleTemplateBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ClusterRoleTemplateBinding {
		return vs[0].([]ClusterRoleTemplateBinding)[vs[1].(int)]
	}).(ClusterRoleTemplateBindingOutput)
}

type ClusterRoleTemplateBindingMapOutput struct{ *pulumi.OutputState }

func (ClusterRoleTemplateBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ClusterRoleTemplateBinding)(nil))
}

func (o ClusterRoleTemplateBindingMapOutput) ToClusterRoleTemplateBindingMapOutput() ClusterRoleTemplateBindingMapOutput {
	return o
}

func (o ClusterRoleTemplateBindingMapOutput) ToClusterRoleTemplateBindingMapOutputWithContext(ctx context.Context) ClusterRoleTemplateBindingMapOutput {
	return o
}

func (o ClusterRoleTemplateBindingMapOutput) MapIndex(k pulumi.StringInput) ClusterRoleTemplateBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ClusterRoleTemplateBinding {
		return vs[0].(map[string]ClusterRoleTemplateBinding)[vs[1].(string)]
	}).(ClusterRoleTemplateBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterRoleTemplateBindingInput)(nil)).Elem(), &ClusterRoleTemplateBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterRoleTemplateBindingPtrInput)(nil)).Elem(), &ClusterRoleTemplateBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterRoleTemplateBindingArrayInput)(nil)).Elem(), ClusterRoleTemplateBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterRoleTemplateBindingMapInput)(nil)).Elem(), ClusterRoleTemplateBindingMap{})
	pulumi.RegisterOutputType(ClusterRoleTemplateBindingOutput{})
	pulumi.RegisterOutputType(ClusterRoleTemplateBindingPtrOutput{})
	pulumi.RegisterOutputType(ClusterRoleTemplateBindingArrayOutput{})
	pulumi.RegisterOutputType(ClusterRoleTemplateBindingMapOutput{})
}
