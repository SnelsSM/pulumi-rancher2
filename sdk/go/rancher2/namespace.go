// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Namespace resource. This can be used to create namespaces for Rancher v2 environments and retrieve their information.
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
// 		_, err := rancher2.NewNamespace(ctx, "foo", &rancher2.NamespaceArgs{
// 			ContainerResourceLimit: &NamespaceContainerResourceLimitArgs{
// 				LimitsCpu:      pulumi.String("20m"),
// 				LimitsMemory:   pulumi.String("20Mi"),
// 				RequestsCpu:    pulumi.String("1m"),
// 				RequestsMemory: pulumi.String("1Mi"),
// 			},
// 			Description: pulumi.String("foo namespace"),
// 			ProjectId:   pulumi.String("<PROJECT_ID>"),
// 			ResourceQuota: &NamespaceResourceQuotaArgs{
// 				Limit: &NamespaceResourceQuotaLimitArgs{
// 					LimitsCpu:       pulumi.String("100m"),
// 					LimitsMemory:    pulumi.String("100Mi"),
// 					RequestsStorage: pulumi.String("1Gi"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
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
// 		_, err := rancher2.NewCluster(ctx, "foo-custom", &rancher2.ClusterArgs{
// 			Description: pulumi.String("Foo rancher2 custom cluster"),
// 			RkeConfig: &ClusterRkeConfigArgs{
// 				Network: &ClusterRkeConfigNetworkArgs{
// 					Plugin: pulumi.String("canal"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewNamespace(ctx, "foo", &rancher2.NamespaceArgs{
// 			ProjectId:   foo_custom.DefaultProjectId,
// 			Description: pulumi.String("foo namespace"),
// 			ResourceQuota: &NamespaceResourceQuotaArgs{
// 				Limit: &NamespaceResourceQuotaLimitArgs{
// 					LimitsCpu:       pulumi.String("100m"),
// 					LimitsMemory:    pulumi.String("100Mi"),
// 					RequestsStorage: pulumi.String("1Gi"),
// 				},
// 			},
// 			ContainerResourceLimit: &NamespaceContainerResourceLimitArgs{
// 				LimitsCpu:      pulumi.String("20m"),
// 				LimitsMemory:   pulumi.String("20Mi"),
// 				RequestsCpu:    pulumi.String("1m"),
// 				RequestsMemory: pulumi.String("1Mi"),
// 			},
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
// Namespaces can be imported using the namespace ID in the format `<project_id>.<namespace_id>`
//
// ```sh
//  $ pulumi import rancher2:index/namespace:Namespace foo &lt;project_id&gt;.&lt;namespaces_id&gt;
// ```
//
//  `<project_id>` is in the format `<cluster_id>:<id>`, but <id> part is optional:
//
// - If full project_id is provided, `<project_id>=<cluster_id>:<id>`, the namespace'll be assigned to corresponding cluster project once it's imported.
//
// - If `<id>` part is omitted `<project_id>=<cluster_id>`, the namespace'll not be assigned to any project. To move it into a project, `<project_id>=<cluster_id>:<id>` needs to be updated in tf file. Namespace movement is only supported inside same `cluster_id`.
type Namespace struct {
	pulumi.CustomResourceState

	// Annotations for Node Pool object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit NamespaceContainerResourceLimitPtrOutput `pulumi:"containerResourceLimit"`
	// A namespace description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels for Node Pool object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the namespace (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota NamespaceResourceQuotaOutput `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrOutput `pulumi:"waitForCluster"`
}

// NewNamespace registers a new resource with the given unique name, arguments, and options.
func NewNamespace(ctx *pulumi.Context,
	name string, args *NamespaceArgs, opts ...pulumi.ResourceOption) (*Namespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource Namespace
	err := ctx.RegisterResource("rancher2:index/namespace:Namespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespace gets an existing Namespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceState, opts ...pulumi.ResourceOption) (*Namespace, error) {
	var resource Namespace
	err := ctx.ReadResource("rancher2:index/namespace:Namespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Namespace resources.
type namespaceState struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit *NamespaceContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A namespace description (string)
	Description *string `pulumi:"description"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the namespace (string)
	Name *string `pulumi:"name"`
	// The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
	ProjectId *string `pulumi:"projectId"`
	// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *NamespaceResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

type NamespaceState struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit NamespaceContainerResourceLimitPtrInput
	// A namespace description (string)
	Description pulumi.StringPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the namespace (string)
	Name pulumi.StringPtrInput
	// The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
	ProjectId pulumi.StringPtrInput
	// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota NamespaceResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (NamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceState)(nil)).Elem()
}

type namespaceArgs struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit *NamespaceContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A namespace description (string)
	Description *string `pulumi:"description"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the namespace (string)
	Name *string `pulumi:"name"`
	// The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
	ProjectId string `pulumi:"projectId"`
	// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *NamespaceResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

// The set of arguments for constructing a Namespace resource.
type NamespaceArgs struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit NamespaceContainerResourceLimitPtrInput
	// A namespace description (string)
	Description pulumi.StringPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the namespace (string)
	Name pulumi.StringPtrInput
	// The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
	ProjectId pulumi.StringInput
	// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota NamespaceResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (NamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceArgs)(nil)).Elem()
}

type NamespaceInput interface {
	pulumi.Input

	ToNamespaceOutput() NamespaceOutput
	ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput
}

func (*Namespace) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (i *Namespace) ToNamespaceOutput() NamespaceOutput {
	return i.ToNamespaceOutputWithContext(context.Background())
}

func (i *Namespace) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceOutput)
}

// NamespaceArrayInput is an input type that accepts NamespaceArray and NamespaceArrayOutput values.
// You can construct a concrete instance of `NamespaceArrayInput` via:
//
//          NamespaceArray{ NamespaceArgs{...} }
type NamespaceArrayInput interface {
	pulumi.Input

	ToNamespaceArrayOutput() NamespaceArrayOutput
	ToNamespaceArrayOutputWithContext(context.Context) NamespaceArrayOutput
}

type NamespaceArray []NamespaceInput

func (NamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (i NamespaceArray) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return i.ToNamespaceArrayOutputWithContext(context.Background())
}

func (i NamespaceArray) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceArrayOutput)
}

// NamespaceMapInput is an input type that accepts NamespaceMap and NamespaceMapOutput values.
// You can construct a concrete instance of `NamespaceMapInput` via:
//
//          NamespaceMap{ "key": NamespaceArgs{...} }
type NamespaceMapInput interface {
	pulumi.Input

	ToNamespaceMapOutput() NamespaceMapOutput
	ToNamespaceMapOutputWithContext(context.Context) NamespaceMapOutput
}

type NamespaceMap map[string]NamespaceInput

func (NamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (i NamespaceMap) ToNamespaceMapOutput() NamespaceMapOutput {
	return i.ToNamespaceMapOutputWithContext(context.Background())
}

func (i NamespaceMap) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceMapOutput)
}

type NamespaceOutput struct{ *pulumi.OutputState }

func (NamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (o NamespaceOutput) ToNamespaceOutput() NamespaceOutput {
	return o
}

func (o NamespaceOutput) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return o
}

type NamespaceArrayOutput struct{ *pulumi.OutputState }

func (NamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) Index(i pulumi.IntInput) NamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].([]*Namespace)[vs[1].(int)]
	}).(NamespaceOutput)
}

type NamespaceMapOutput struct{ *pulumi.OutputState }

func (NamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (o NamespaceMapOutput) ToNamespaceMapOutput() NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) MapIndex(k pulumi.StringInput) NamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].(map[string]*Namespace)[vs[1].(string)]
	}).(NamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceInput)(nil)).Elem(), &Namespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceArrayInput)(nil)).Elem(), NamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceMapInput)(nil)).Elem(), NamespaceMap{})
	pulumi.RegisterOutputType(NamespaceOutput{})
	pulumi.RegisterOutputType(NamespaceArrayOutput{})
	pulumi.RegisterOutputType(NamespaceMapOutput{})
}
