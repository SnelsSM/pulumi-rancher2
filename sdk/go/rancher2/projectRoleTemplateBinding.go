// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Project Role Template Binding resource. This can be used to create Project Role Template Bindings for Rancher v2 environments and retrieve their information.
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
// 		_, err := rancher2.NewProjectRoleTemplateBinding(ctx, "foo", &rancher2.ProjectRoleTemplateBindingArgs{
// 			ProjectId:      pulumi.String("<project_id>"),
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
// Project Role Template Bindings can be imported using the Rancher Project Role Template Binding ID
//
// ```sh
//  $ pulumi import rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding foo &lt;project_role_template_binding_id&gt;
// ```
type ProjectRoleTemplateBinding struct {
	pulumi.CustomResourceState

	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringOutput `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringOutput `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringOutput `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringOutput `pulumi:"userPrincipalId"`
}

// NewProjectRoleTemplateBinding registers a new resource with the given unique name, arguments, and options.
func NewProjectRoleTemplateBinding(ctx *pulumi.Context,
	name string, args *ProjectRoleTemplateBindingArgs, opts ...pulumi.ResourceOption) (*ProjectRoleTemplateBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.RoleTemplateId == nil {
		return nil, errors.New("invalid value for required argument 'RoleTemplateId'")
	}
	var resource ProjectRoleTemplateBinding
	err := ctx.RegisterResource("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectRoleTemplateBinding gets an existing ProjectRoleTemplateBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectRoleTemplateBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectRoleTemplateBindingState, opts ...pulumi.ResourceOption) (*ProjectRoleTemplateBinding, error) {
	var resource ProjectRoleTemplateBinding
	err := ctx.ReadResource("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectRoleTemplateBinding resources.
type projectRoleTemplateBindingState struct {
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name *string `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId *string `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

type ProjectRoleTemplateBindingState struct {
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// The name of the project role template binding (string)
	Name pulumi.StringPtrInput
	// The project id where bind project role template (string)
	ProjectId pulumi.StringPtrInput
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringPtrInput
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ProjectRoleTemplateBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectRoleTemplateBindingState)(nil)).Elem()
}

type projectRoleTemplateBindingArgs struct {
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name *string `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId string `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId string `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

// The set of arguments for constructing a ProjectRoleTemplateBinding resource.
type ProjectRoleTemplateBindingArgs struct {
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// The name of the project role template binding (string)
	Name pulumi.StringPtrInput
	// The project id where bind project role template (string)
	ProjectId pulumi.StringInput
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringInput
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ProjectRoleTemplateBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectRoleTemplateBindingArgs)(nil)).Elem()
}

type ProjectRoleTemplateBindingInput interface {
	pulumi.Input

	ToProjectRoleTemplateBindingOutput() ProjectRoleTemplateBindingOutput
	ToProjectRoleTemplateBindingOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingOutput
}

func (*ProjectRoleTemplateBinding) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectRoleTemplateBinding)(nil))
}

func (i *ProjectRoleTemplateBinding) ToProjectRoleTemplateBindingOutput() ProjectRoleTemplateBindingOutput {
	return i.ToProjectRoleTemplateBindingOutputWithContext(context.Background())
}

func (i *ProjectRoleTemplateBinding) ToProjectRoleTemplateBindingOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectRoleTemplateBindingOutput)
}

func (i *ProjectRoleTemplateBinding) ToProjectRoleTemplateBindingPtrOutput() ProjectRoleTemplateBindingPtrOutput {
	return i.ToProjectRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (i *ProjectRoleTemplateBinding) ToProjectRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectRoleTemplateBindingPtrOutput)
}

type ProjectRoleTemplateBindingPtrInput interface {
	pulumi.Input

	ToProjectRoleTemplateBindingPtrOutput() ProjectRoleTemplateBindingPtrOutput
	ToProjectRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingPtrOutput
}

type projectRoleTemplateBindingPtrType ProjectRoleTemplateBindingArgs

func (*projectRoleTemplateBindingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectRoleTemplateBinding)(nil))
}

func (i *projectRoleTemplateBindingPtrType) ToProjectRoleTemplateBindingPtrOutput() ProjectRoleTemplateBindingPtrOutput {
	return i.ToProjectRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (i *projectRoleTemplateBindingPtrType) ToProjectRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectRoleTemplateBindingPtrOutput)
}

// ProjectRoleTemplateBindingArrayInput is an input type that accepts ProjectRoleTemplateBindingArray and ProjectRoleTemplateBindingArrayOutput values.
// You can construct a concrete instance of `ProjectRoleTemplateBindingArrayInput` via:
//
//          ProjectRoleTemplateBindingArray{ ProjectRoleTemplateBindingArgs{...} }
type ProjectRoleTemplateBindingArrayInput interface {
	pulumi.Input

	ToProjectRoleTemplateBindingArrayOutput() ProjectRoleTemplateBindingArrayOutput
	ToProjectRoleTemplateBindingArrayOutputWithContext(context.Context) ProjectRoleTemplateBindingArrayOutput
}

type ProjectRoleTemplateBindingArray []ProjectRoleTemplateBindingInput

func (ProjectRoleTemplateBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectRoleTemplateBinding)(nil)).Elem()
}

func (i ProjectRoleTemplateBindingArray) ToProjectRoleTemplateBindingArrayOutput() ProjectRoleTemplateBindingArrayOutput {
	return i.ToProjectRoleTemplateBindingArrayOutputWithContext(context.Background())
}

func (i ProjectRoleTemplateBindingArray) ToProjectRoleTemplateBindingArrayOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectRoleTemplateBindingArrayOutput)
}

// ProjectRoleTemplateBindingMapInput is an input type that accepts ProjectRoleTemplateBindingMap and ProjectRoleTemplateBindingMapOutput values.
// You can construct a concrete instance of `ProjectRoleTemplateBindingMapInput` via:
//
//          ProjectRoleTemplateBindingMap{ "key": ProjectRoleTemplateBindingArgs{...} }
type ProjectRoleTemplateBindingMapInput interface {
	pulumi.Input

	ToProjectRoleTemplateBindingMapOutput() ProjectRoleTemplateBindingMapOutput
	ToProjectRoleTemplateBindingMapOutputWithContext(context.Context) ProjectRoleTemplateBindingMapOutput
}

type ProjectRoleTemplateBindingMap map[string]ProjectRoleTemplateBindingInput

func (ProjectRoleTemplateBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectRoleTemplateBinding)(nil)).Elem()
}

func (i ProjectRoleTemplateBindingMap) ToProjectRoleTemplateBindingMapOutput() ProjectRoleTemplateBindingMapOutput {
	return i.ToProjectRoleTemplateBindingMapOutputWithContext(context.Background())
}

func (i ProjectRoleTemplateBindingMap) ToProjectRoleTemplateBindingMapOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectRoleTemplateBindingMapOutput)
}

type ProjectRoleTemplateBindingOutput struct{ *pulumi.OutputState }

func (ProjectRoleTemplateBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectRoleTemplateBinding)(nil))
}

func (o ProjectRoleTemplateBindingOutput) ToProjectRoleTemplateBindingOutput() ProjectRoleTemplateBindingOutput {
	return o
}

func (o ProjectRoleTemplateBindingOutput) ToProjectRoleTemplateBindingOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingOutput {
	return o
}

func (o ProjectRoleTemplateBindingOutput) ToProjectRoleTemplateBindingPtrOutput() ProjectRoleTemplateBindingPtrOutput {
	return o.ToProjectRoleTemplateBindingPtrOutputWithContext(context.Background())
}

func (o ProjectRoleTemplateBindingOutput) ToProjectRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProjectRoleTemplateBinding) *ProjectRoleTemplateBinding {
		return &v
	}).(ProjectRoleTemplateBindingPtrOutput)
}

type ProjectRoleTemplateBindingPtrOutput struct{ *pulumi.OutputState }

func (ProjectRoleTemplateBindingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectRoleTemplateBinding)(nil))
}

func (o ProjectRoleTemplateBindingPtrOutput) ToProjectRoleTemplateBindingPtrOutput() ProjectRoleTemplateBindingPtrOutput {
	return o
}

func (o ProjectRoleTemplateBindingPtrOutput) ToProjectRoleTemplateBindingPtrOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingPtrOutput {
	return o
}

func (o ProjectRoleTemplateBindingPtrOutput) Elem() ProjectRoleTemplateBindingOutput {
	return o.ApplyT(func(v *ProjectRoleTemplateBinding) ProjectRoleTemplateBinding {
		if v != nil {
			return *v
		}
		var ret ProjectRoleTemplateBinding
		return ret
	}).(ProjectRoleTemplateBindingOutput)
}

type ProjectRoleTemplateBindingArrayOutput struct{ *pulumi.OutputState }

func (ProjectRoleTemplateBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProjectRoleTemplateBinding)(nil))
}

func (o ProjectRoleTemplateBindingArrayOutput) ToProjectRoleTemplateBindingArrayOutput() ProjectRoleTemplateBindingArrayOutput {
	return o
}

func (o ProjectRoleTemplateBindingArrayOutput) ToProjectRoleTemplateBindingArrayOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingArrayOutput {
	return o
}

func (o ProjectRoleTemplateBindingArrayOutput) Index(i pulumi.IntInput) ProjectRoleTemplateBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProjectRoleTemplateBinding {
		return vs[0].([]ProjectRoleTemplateBinding)[vs[1].(int)]
	}).(ProjectRoleTemplateBindingOutput)
}

type ProjectRoleTemplateBindingMapOutput struct{ *pulumi.OutputState }

func (ProjectRoleTemplateBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProjectRoleTemplateBinding)(nil))
}

func (o ProjectRoleTemplateBindingMapOutput) ToProjectRoleTemplateBindingMapOutput() ProjectRoleTemplateBindingMapOutput {
	return o
}

func (o ProjectRoleTemplateBindingMapOutput) ToProjectRoleTemplateBindingMapOutputWithContext(ctx context.Context) ProjectRoleTemplateBindingMapOutput {
	return o
}

func (o ProjectRoleTemplateBindingMapOutput) MapIndex(k pulumi.StringInput) ProjectRoleTemplateBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProjectRoleTemplateBinding {
		return vs[0].(map[string]ProjectRoleTemplateBinding)[vs[1].(string)]
	}).(ProjectRoleTemplateBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectRoleTemplateBindingInput)(nil)).Elem(), &ProjectRoleTemplateBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectRoleTemplateBindingPtrInput)(nil)).Elem(), &ProjectRoleTemplateBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectRoleTemplateBindingArrayInput)(nil)).Elem(), ProjectRoleTemplateBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectRoleTemplateBindingMapInput)(nil)).Elem(), ProjectRoleTemplateBindingMap{})
	pulumi.RegisterOutputType(ProjectRoleTemplateBindingOutput{})
	pulumi.RegisterOutputType(ProjectRoleTemplateBindingPtrOutput{})
	pulumi.RegisterOutputType(ProjectRoleTemplateBindingArrayOutput{})
	pulumi.RegisterOutputType(ProjectRoleTemplateBindingMapOutput{})
}
