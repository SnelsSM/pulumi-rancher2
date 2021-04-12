// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type ClusterSync struct {
	pulumi.CustomResourceState

	// The Cluster ID of the node (string).
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// (Computed) Default project ID for the cluster sync (string)
	DefaultProjectId pulumi.StringOutput `pulumi:"defaultProjectId"`
	// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
	KubeConfig pulumi.StringOutput `pulumi:"kubeConfig"`
	// The node pool IDs used by the cluster id (list)
	NodePoolIds pulumi.StringArrayOutput `pulumi:"nodePoolIds"`
	// (Computed) The cluster nodes (list).
	Nodes ClusterSyncNodeArrayOutput `pulumi:"nodes"`
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	StateConfirm pulumi.IntPtrOutput  `pulumi:"stateConfirm"`
	Synced       pulumi.BoolPtrOutput `pulumi:"synced"`
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId pulumi.StringOutput `pulumi:"systemProjectId"`
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs pulumi.BoolPtrOutput `pulumi:"waitCatalogs"`
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring pulumi.BoolPtrOutput `pulumi:"waitMonitoring"`
}

// NewClusterSync registers a new resource with the given unique name, arguments, and options.
func NewClusterSync(ctx *pulumi.Context,
	name string, args *ClusterSyncArgs, opts ...pulumi.ResourceOption) (*ClusterSync, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	var resource ClusterSync
	err := ctx.RegisterResource("rancher2:index/clusterSync:ClusterSync", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterSync gets an existing ClusterSync resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterSync(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterSyncState, opts ...pulumi.ResourceOption) (*ClusterSync, error) {
	var resource ClusterSync
	err := ctx.ReadResource("rancher2:index/clusterSync:ClusterSync", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterSync resources.
type clusterSyncState struct {
	// The Cluster ID of the node (string).
	ClusterId *string `pulumi:"clusterId"`
	// (Computed) Default project ID for the cluster sync (string)
	DefaultProjectId *string `pulumi:"defaultProjectId"`
	// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
	KubeConfig *string `pulumi:"kubeConfig"`
	// The node pool IDs used by the cluster id (list)
	NodePoolIds []string `pulumi:"nodePoolIds"`
	// (Computed) The cluster nodes (list).
	Nodes []ClusterSyncNode `pulumi:"nodes"`
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	StateConfirm *int  `pulumi:"stateConfirm"`
	Synced       *bool `pulumi:"synced"`
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId *string `pulumi:"systemProjectId"`
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs *bool `pulumi:"waitCatalogs"`
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring *bool `pulumi:"waitMonitoring"`
}

type ClusterSyncState struct {
	// The Cluster ID of the node (string).
	ClusterId pulumi.StringPtrInput
	// (Computed) Default project ID for the cluster sync (string)
	DefaultProjectId pulumi.StringPtrInput
	// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
	KubeConfig pulumi.StringPtrInput
	// The node pool IDs used by the cluster id (list)
	NodePoolIds pulumi.StringArrayInput
	// (Computed) The cluster nodes (list).
	Nodes ClusterSyncNodeArrayInput
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	StateConfirm pulumi.IntPtrInput
	Synced       pulumi.BoolPtrInput
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId pulumi.StringPtrInput
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs pulumi.BoolPtrInput
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring pulumi.BoolPtrInput
}

func (ClusterSyncState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterSyncState)(nil)).Elem()
}

type clusterSyncArgs struct {
	// The Cluster ID of the node (string).
	ClusterId string `pulumi:"clusterId"`
	// The node pool IDs used by the cluster id (list)
	NodePoolIds []string `pulumi:"nodePoolIds"`
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	StateConfirm *int  `pulumi:"stateConfirm"`
	Synced       *bool `pulumi:"synced"`
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs *bool `pulumi:"waitCatalogs"`
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring *bool `pulumi:"waitMonitoring"`
}

// The set of arguments for constructing a ClusterSync resource.
type ClusterSyncArgs struct {
	// The Cluster ID of the node (string).
	ClusterId pulumi.StringInput
	// The node pool IDs used by the cluster id (list)
	NodePoolIds pulumi.StringArrayInput
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	StateConfirm pulumi.IntPtrInput
	Synced       pulumi.BoolPtrInput
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs pulumi.BoolPtrInput
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring pulumi.BoolPtrInput
}

func (ClusterSyncArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterSyncArgs)(nil)).Elem()
}

type ClusterSyncInput interface {
	pulumi.Input

	ToClusterSyncOutput() ClusterSyncOutput
	ToClusterSyncOutputWithContext(ctx context.Context) ClusterSyncOutput
}

func (*ClusterSync) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterSync)(nil))
}

func (i *ClusterSync) ToClusterSyncOutput() ClusterSyncOutput {
	return i.ToClusterSyncOutputWithContext(context.Background())
}

func (i *ClusterSync) ToClusterSyncOutputWithContext(ctx context.Context) ClusterSyncOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncOutput)
}

func (i *ClusterSync) ToClusterSyncPtrOutput() ClusterSyncPtrOutput {
	return i.ToClusterSyncPtrOutputWithContext(context.Background())
}

func (i *ClusterSync) ToClusterSyncPtrOutputWithContext(ctx context.Context) ClusterSyncPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncPtrOutput)
}

type ClusterSyncPtrInput interface {
	pulumi.Input

	ToClusterSyncPtrOutput() ClusterSyncPtrOutput
	ToClusterSyncPtrOutputWithContext(ctx context.Context) ClusterSyncPtrOutput
}

type clusterSyncPtrType ClusterSyncArgs

func (*clusterSyncPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterSync)(nil))
}

func (i *clusterSyncPtrType) ToClusterSyncPtrOutput() ClusterSyncPtrOutput {
	return i.ToClusterSyncPtrOutputWithContext(context.Background())
}

func (i *clusterSyncPtrType) ToClusterSyncPtrOutputWithContext(ctx context.Context) ClusterSyncPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncPtrOutput)
}

// ClusterSyncArrayInput is an input type that accepts ClusterSyncArray and ClusterSyncArrayOutput values.
// You can construct a concrete instance of `ClusterSyncArrayInput` via:
//
//          ClusterSyncArray{ ClusterSyncArgs{...} }
type ClusterSyncArrayInput interface {
	pulumi.Input

	ToClusterSyncArrayOutput() ClusterSyncArrayOutput
	ToClusterSyncArrayOutputWithContext(context.Context) ClusterSyncArrayOutput
}

type ClusterSyncArray []ClusterSyncInput

func (ClusterSyncArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ClusterSync)(nil))
}

func (i ClusterSyncArray) ToClusterSyncArrayOutput() ClusterSyncArrayOutput {
	return i.ToClusterSyncArrayOutputWithContext(context.Background())
}

func (i ClusterSyncArray) ToClusterSyncArrayOutputWithContext(ctx context.Context) ClusterSyncArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncArrayOutput)
}

// ClusterSyncMapInput is an input type that accepts ClusterSyncMap and ClusterSyncMapOutput values.
// You can construct a concrete instance of `ClusterSyncMapInput` via:
//
//          ClusterSyncMap{ "key": ClusterSyncArgs{...} }
type ClusterSyncMapInput interface {
	pulumi.Input

	ToClusterSyncMapOutput() ClusterSyncMapOutput
	ToClusterSyncMapOutputWithContext(context.Context) ClusterSyncMapOutput
}

type ClusterSyncMap map[string]ClusterSyncInput

func (ClusterSyncMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ClusterSync)(nil))
}

func (i ClusterSyncMap) ToClusterSyncMapOutput() ClusterSyncMapOutput {
	return i.ToClusterSyncMapOutputWithContext(context.Background())
}

func (i ClusterSyncMap) ToClusterSyncMapOutputWithContext(ctx context.Context) ClusterSyncMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncMapOutput)
}

type ClusterSyncOutput struct {
	*pulumi.OutputState
}

func (ClusterSyncOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterSync)(nil))
}

func (o ClusterSyncOutput) ToClusterSyncOutput() ClusterSyncOutput {
	return o
}

func (o ClusterSyncOutput) ToClusterSyncOutputWithContext(ctx context.Context) ClusterSyncOutput {
	return o
}

func (o ClusterSyncOutput) ToClusterSyncPtrOutput() ClusterSyncPtrOutput {
	return o.ToClusterSyncPtrOutputWithContext(context.Background())
}

func (o ClusterSyncOutput) ToClusterSyncPtrOutputWithContext(ctx context.Context) ClusterSyncPtrOutput {
	return o.ApplyT(func(v ClusterSync) *ClusterSync {
		return &v
	}).(ClusterSyncPtrOutput)
}

type ClusterSyncPtrOutput struct {
	*pulumi.OutputState
}

func (ClusterSyncPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterSync)(nil))
}

func (o ClusterSyncPtrOutput) ToClusterSyncPtrOutput() ClusterSyncPtrOutput {
	return o
}

func (o ClusterSyncPtrOutput) ToClusterSyncPtrOutputWithContext(ctx context.Context) ClusterSyncPtrOutput {
	return o
}

type ClusterSyncArrayOutput struct{ *pulumi.OutputState }

func (ClusterSyncArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ClusterSync)(nil))
}

func (o ClusterSyncArrayOutput) ToClusterSyncArrayOutput() ClusterSyncArrayOutput {
	return o
}

func (o ClusterSyncArrayOutput) ToClusterSyncArrayOutputWithContext(ctx context.Context) ClusterSyncArrayOutput {
	return o
}

func (o ClusterSyncArrayOutput) Index(i pulumi.IntInput) ClusterSyncOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ClusterSync {
		return vs[0].([]ClusterSync)[vs[1].(int)]
	}).(ClusterSyncOutput)
}

type ClusterSyncMapOutput struct{ *pulumi.OutputState }

func (ClusterSyncMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ClusterSync)(nil))
}

func (o ClusterSyncMapOutput) ToClusterSyncMapOutput() ClusterSyncMapOutput {
	return o
}

func (o ClusterSyncMapOutput) ToClusterSyncMapOutputWithContext(ctx context.Context) ClusterSyncMapOutput {
	return o
}

func (o ClusterSyncMapOutput) MapIndex(k pulumi.StringInput) ClusterSyncOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ClusterSync {
		return vs[0].(map[string]ClusterSync)[vs[1].(string)]
	}).(ClusterSyncOutput)
}

func init() {
	pulumi.RegisterOutputType(ClusterSyncOutput{})
	pulumi.RegisterOutputType(ClusterSyncPtrOutput{})
	pulumi.RegisterOutputType(ClusterSyncArrayOutput{})
	pulumi.RegisterOutputType(ClusterSyncMapOutput{})
}
