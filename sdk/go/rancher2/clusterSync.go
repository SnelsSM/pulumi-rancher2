// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type ClusterSync struct {
	pulumi.CustomResourceState

	// The cluster ID that is syncing (string)
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
	//
	// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
	StateConfirm pulumi.IntPtrOutput  `pulumi:"stateConfirm"`
	Synced       pulumi.BoolPtrOutput `pulumi:"synced"`
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId pulumi.StringOutput `pulumi:"systemProjectId"`
	// Wait until alerting is up and running. Default: `false` (bool)
	WaitAlerting pulumi.BoolPtrOutput `pulumi:"waitAlerting"`
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
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"kubeConfig",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// The cluster ID that is syncing (string)
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
	//
	// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
	StateConfirm *int  `pulumi:"stateConfirm"`
	Synced       *bool `pulumi:"synced"`
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId *string `pulumi:"systemProjectId"`
	// Wait until alerting is up and running. Default: `false` (bool)
	WaitAlerting *bool `pulumi:"waitAlerting"`
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs *bool `pulumi:"waitCatalogs"`
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring *bool `pulumi:"waitMonitoring"`
}

type ClusterSyncState struct {
	// The cluster ID that is syncing (string)
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
	//
	// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
	StateConfirm pulumi.IntPtrInput
	Synced       pulumi.BoolPtrInput
	// (Computed) System project ID for the cluster sync (string)
	SystemProjectId pulumi.StringPtrInput
	// Wait until alerting is up and running. Default: `false` (bool)
	WaitAlerting pulumi.BoolPtrInput
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs pulumi.BoolPtrInput
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring pulumi.BoolPtrInput
}

func (ClusterSyncState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterSyncState)(nil)).Elem()
}

type clusterSyncArgs struct {
	// The cluster ID that is syncing (string)
	ClusterId string `pulumi:"clusterId"`
	// The node pool IDs used by the cluster id (list)
	NodePoolIds []string `pulumi:"nodePoolIds"`
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	//
	// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
	StateConfirm *int  `pulumi:"stateConfirm"`
	Synced       *bool `pulumi:"synced"`
	// Wait until alerting is up and running. Default: `false` (bool)
	WaitAlerting *bool `pulumi:"waitAlerting"`
	// Wait until all catalogs are downloaded and active. Default: `false` (bool)
	WaitCatalogs *bool `pulumi:"waitCatalogs"`
	// Wait until monitoring is up and running. Default: `false` (bool)
	WaitMonitoring *bool `pulumi:"waitMonitoring"`
}

// The set of arguments for constructing a ClusterSync resource.
type ClusterSyncArgs struct {
	// The cluster ID that is syncing (string)
	ClusterId pulumi.StringInput
	// The node pool IDs used by the cluster id (list)
	NodePoolIds pulumi.StringArrayInput
	// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
	//
	// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
	StateConfirm pulumi.IntPtrInput
	Synced       pulumi.BoolPtrInput
	// Wait until alerting is up and running. Default: `false` (bool)
	WaitAlerting pulumi.BoolPtrInput
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
	return reflect.TypeOf((**ClusterSync)(nil)).Elem()
}

func (i *ClusterSync) ToClusterSyncOutput() ClusterSyncOutput {
	return i.ToClusterSyncOutputWithContext(context.Background())
}

func (i *ClusterSync) ToClusterSyncOutputWithContext(ctx context.Context) ClusterSyncOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncOutput)
}

func (i *ClusterSync) ToOutput(ctx context.Context) pulumix.Output[*ClusterSync] {
	return pulumix.Output[*ClusterSync]{
		OutputState: i.ToClusterSyncOutputWithContext(ctx).OutputState,
	}
}

// ClusterSyncArrayInput is an input type that accepts ClusterSyncArray and ClusterSyncArrayOutput values.
// You can construct a concrete instance of `ClusterSyncArrayInput` via:
//
//	ClusterSyncArray{ ClusterSyncArgs{...} }
type ClusterSyncArrayInput interface {
	pulumi.Input

	ToClusterSyncArrayOutput() ClusterSyncArrayOutput
	ToClusterSyncArrayOutputWithContext(context.Context) ClusterSyncArrayOutput
}

type ClusterSyncArray []ClusterSyncInput

func (ClusterSyncArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterSync)(nil)).Elem()
}

func (i ClusterSyncArray) ToClusterSyncArrayOutput() ClusterSyncArrayOutput {
	return i.ToClusterSyncArrayOutputWithContext(context.Background())
}

func (i ClusterSyncArray) ToClusterSyncArrayOutputWithContext(ctx context.Context) ClusterSyncArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncArrayOutput)
}

func (i ClusterSyncArray) ToOutput(ctx context.Context) pulumix.Output[[]*ClusterSync] {
	return pulumix.Output[[]*ClusterSync]{
		OutputState: i.ToClusterSyncArrayOutputWithContext(ctx).OutputState,
	}
}

// ClusterSyncMapInput is an input type that accepts ClusterSyncMap and ClusterSyncMapOutput values.
// You can construct a concrete instance of `ClusterSyncMapInput` via:
//
//	ClusterSyncMap{ "key": ClusterSyncArgs{...} }
type ClusterSyncMapInput interface {
	pulumi.Input

	ToClusterSyncMapOutput() ClusterSyncMapOutput
	ToClusterSyncMapOutputWithContext(context.Context) ClusterSyncMapOutput
}

type ClusterSyncMap map[string]ClusterSyncInput

func (ClusterSyncMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterSync)(nil)).Elem()
}

func (i ClusterSyncMap) ToClusterSyncMapOutput() ClusterSyncMapOutput {
	return i.ToClusterSyncMapOutputWithContext(context.Background())
}

func (i ClusterSyncMap) ToClusterSyncMapOutputWithContext(ctx context.Context) ClusterSyncMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterSyncMapOutput)
}

func (i ClusterSyncMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClusterSync] {
	return pulumix.Output[map[string]*ClusterSync]{
		OutputState: i.ToClusterSyncMapOutputWithContext(ctx).OutputState,
	}
}

type ClusterSyncOutput struct{ *pulumi.OutputState }

func (ClusterSyncOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterSync)(nil)).Elem()
}

func (o ClusterSyncOutput) ToClusterSyncOutput() ClusterSyncOutput {
	return o
}

func (o ClusterSyncOutput) ToClusterSyncOutputWithContext(ctx context.Context) ClusterSyncOutput {
	return o
}

func (o ClusterSyncOutput) ToOutput(ctx context.Context) pulumix.Output[*ClusterSync] {
	return pulumix.Output[*ClusterSync]{
		OutputState: o.OutputState,
	}
}

// The cluster ID that is syncing (string)
func (o ClusterSyncOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) Default project ID for the cluster sync (string)
func (o ClusterSyncOutput) DefaultProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.StringOutput { return v.DefaultProjectId }).(pulumi.StringOutput)
}

// (Computed/Sensitive) Kube Config generated for the cluster sync (string)
func (o ClusterSyncOutput) KubeConfig() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.StringOutput { return v.KubeConfig }).(pulumi.StringOutput)
}

// The node pool IDs used by the cluster id (list)
func (o ClusterSyncOutput) NodePoolIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.StringArrayOutput { return v.NodePoolIds }).(pulumi.StringArrayOutput)
}

// (Computed) The cluster nodes (list).
func (o ClusterSyncOutput) Nodes() ClusterSyncNodeArrayOutput {
	return o.ApplyT(func(v *ClusterSync) ClusterSyncNodeArrayOutput { return v.Nodes }).(ClusterSyncNodeArrayOutput)
}

// Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
//
// **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
func (o ClusterSyncOutput) StateConfirm() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.IntPtrOutput { return v.StateConfirm }).(pulumi.IntPtrOutput)
}

func (o ClusterSyncOutput) Synced() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.BoolPtrOutput { return v.Synced }).(pulumi.BoolPtrOutput)
}

// (Computed) System project ID for the cluster sync (string)
func (o ClusterSyncOutput) SystemProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.StringOutput { return v.SystemProjectId }).(pulumi.StringOutput)
}

// Wait until alerting is up and running. Default: `false` (bool)
func (o ClusterSyncOutput) WaitAlerting() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.BoolPtrOutput { return v.WaitAlerting }).(pulumi.BoolPtrOutput)
}

// Wait until all catalogs are downloaded and active. Default: `false` (bool)
func (o ClusterSyncOutput) WaitCatalogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.BoolPtrOutput { return v.WaitCatalogs }).(pulumi.BoolPtrOutput)
}

// Wait until monitoring is up and running. Default: `false` (bool)
func (o ClusterSyncOutput) WaitMonitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterSync) pulumi.BoolPtrOutput { return v.WaitMonitoring }).(pulumi.BoolPtrOutput)
}

type ClusterSyncArrayOutput struct{ *pulumi.OutputState }

func (ClusterSyncArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterSync)(nil)).Elem()
}

func (o ClusterSyncArrayOutput) ToClusterSyncArrayOutput() ClusterSyncArrayOutput {
	return o
}

func (o ClusterSyncArrayOutput) ToClusterSyncArrayOutputWithContext(ctx context.Context) ClusterSyncArrayOutput {
	return o
}

func (o ClusterSyncArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ClusterSync] {
	return pulumix.Output[[]*ClusterSync]{
		OutputState: o.OutputState,
	}
}

func (o ClusterSyncArrayOutput) Index(i pulumi.IntInput) ClusterSyncOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterSync {
		return vs[0].([]*ClusterSync)[vs[1].(int)]
	}).(ClusterSyncOutput)
}

type ClusterSyncMapOutput struct{ *pulumi.OutputState }

func (ClusterSyncMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterSync)(nil)).Elem()
}

func (o ClusterSyncMapOutput) ToClusterSyncMapOutput() ClusterSyncMapOutput {
	return o
}

func (o ClusterSyncMapOutput) ToClusterSyncMapOutputWithContext(ctx context.Context) ClusterSyncMapOutput {
	return o
}

func (o ClusterSyncMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClusterSync] {
	return pulumix.Output[map[string]*ClusterSync]{
		OutputState: o.OutputState,
	}
}

func (o ClusterSyncMapOutput) MapIndex(k pulumi.StringInput) ClusterSyncOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterSync {
		return vs[0].(map[string]*ClusterSync)[vs[1].(string)]
	}).(ClusterSyncOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterSyncInput)(nil)).Elem(), &ClusterSync{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterSyncArrayInput)(nil)).Elem(), ClusterSyncArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterSyncMapInput)(nil)).Elem(), ClusterSyncMap{})
	pulumi.RegisterOutputType(ClusterSyncOutput{})
	pulumi.RegisterOutputType(ClusterSyncArrayOutput{})
	pulumi.RegisterOutputType(ClusterSyncMapOutput{})
}
