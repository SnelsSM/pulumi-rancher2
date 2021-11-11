// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Etcd Backup can be imported using the Rancher etcd backup ID
//
// ```sh
//  $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
// ```
type EtcdBackup struct {
	pulumi.CustomResourceState

	// Annotations for Etcd Backup object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Backup config for etcd backup (list maxitems:1)
	BackupConfig EtcdBackupBackupConfigOutput `pulumi:"backupConfig"`
	// Cluster ID to config Etcd Backup (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Filename of the Etcd Backup (string)
	Filename pulumi.StringOutput `pulumi:"filename"`
	// Labels for Etcd Backup object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Manual execution of the Etcd Backup. Default `false` (bool)
	Manual pulumi.BoolPtrOutput `pulumi:"manual"`
	// The name of the Etcd Backup (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Description for the Etcd Backup (string)
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
}

// NewEtcdBackup registers a new resource with the given unique name, arguments, and options.
func NewEtcdBackup(ctx *pulumi.Context,
	name string, args *EtcdBackupArgs, opts ...pulumi.ResourceOption) (*EtcdBackup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	var resource EtcdBackup
	err := ctx.RegisterResource("rancher2:index/etcdBackup:EtcdBackup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEtcdBackup gets an existing EtcdBackup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEtcdBackup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EtcdBackupState, opts ...pulumi.ResourceOption) (*EtcdBackup, error) {
	var resource EtcdBackup
	err := ctx.ReadResource("rancher2:index/etcdBackup:EtcdBackup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EtcdBackup resources.
type etcdBackupState struct {
	// Annotations for Etcd Backup object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Backup config for etcd backup (list maxitems:1)
	BackupConfig *EtcdBackupBackupConfig `pulumi:"backupConfig"`
	// Cluster ID to config Etcd Backup (string)
	ClusterId *string `pulumi:"clusterId"`
	// Filename of the Etcd Backup (string)
	Filename *string `pulumi:"filename"`
	// Labels for Etcd Backup object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Manual execution of the Etcd Backup. Default `false` (bool)
	Manual *bool `pulumi:"manual"`
	// The name of the Etcd Backup (string)
	Name *string `pulumi:"name"`
	// Description for the Etcd Backup (string)
	NamespaceId *string `pulumi:"namespaceId"`
}

type EtcdBackupState struct {
	// Annotations for Etcd Backup object (map)
	Annotations pulumi.MapInput
	// Backup config for etcd backup (list maxitems:1)
	BackupConfig EtcdBackupBackupConfigPtrInput
	// Cluster ID to config Etcd Backup (string)
	ClusterId pulumi.StringPtrInput
	// Filename of the Etcd Backup (string)
	Filename pulumi.StringPtrInput
	// Labels for Etcd Backup object (map)
	Labels pulumi.MapInput
	// Manual execution of the Etcd Backup. Default `false` (bool)
	Manual pulumi.BoolPtrInput
	// The name of the Etcd Backup (string)
	Name pulumi.StringPtrInput
	// Description for the Etcd Backup (string)
	NamespaceId pulumi.StringPtrInput
}

func (EtcdBackupState) ElementType() reflect.Type {
	return reflect.TypeOf((*etcdBackupState)(nil)).Elem()
}

type etcdBackupArgs struct {
	// Annotations for Etcd Backup object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Backup config for etcd backup (list maxitems:1)
	BackupConfig *EtcdBackupBackupConfig `pulumi:"backupConfig"`
	// Cluster ID to config Etcd Backup (string)
	ClusterId string `pulumi:"clusterId"`
	// Filename of the Etcd Backup (string)
	Filename *string `pulumi:"filename"`
	// Labels for Etcd Backup object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Manual execution of the Etcd Backup. Default `false` (bool)
	Manual *bool `pulumi:"manual"`
	// The name of the Etcd Backup (string)
	Name *string `pulumi:"name"`
	// Description for the Etcd Backup (string)
	NamespaceId *string `pulumi:"namespaceId"`
}

// The set of arguments for constructing a EtcdBackup resource.
type EtcdBackupArgs struct {
	// Annotations for Etcd Backup object (map)
	Annotations pulumi.MapInput
	// Backup config for etcd backup (list maxitems:1)
	BackupConfig EtcdBackupBackupConfigPtrInput
	// Cluster ID to config Etcd Backup (string)
	ClusterId pulumi.StringInput
	// Filename of the Etcd Backup (string)
	Filename pulumi.StringPtrInput
	// Labels for Etcd Backup object (map)
	Labels pulumi.MapInput
	// Manual execution of the Etcd Backup. Default `false` (bool)
	Manual pulumi.BoolPtrInput
	// The name of the Etcd Backup (string)
	Name pulumi.StringPtrInput
	// Description for the Etcd Backup (string)
	NamespaceId pulumi.StringPtrInput
}

func (EtcdBackupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*etcdBackupArgs)(nil)).Elem()
}

type EtcdBackupInput interface {
	pulumi.Input

	ToEtcdBackupOutput() EtcdBackupOutput
	ToEtcdBackupOutputWithContext(ctx context.Context) EtcdBackupOutput
}

func (*EtcdBackup) ElementType() reflect.Type {
	return reflect.TypeOf((*EtcdBackup)(nil))
}

func (i *EtcdBackup) ToEtcdBackupOutput() EtcdBackupOutput {
	return i.ToEtcdBackupOutputWithContext(context.Background())
}

func (i *EtcdBackup) ToEtcdBackupOutputWithContext(ctx context.Context) EtcdBackupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupOutput)
}

func (i *EtcdBackup) ToEtcdBackupPtrOutput() EtcdBackupPtrOutput {
	return i.ToEtcdBackupPtrOutputWithContext(context.Background())
}

func (i *EtcdBackup) ToEtcdBackupPtrOutputWithContext(ctx context.Context) EtcdBackupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupPtrOutput)
}

type EtcdBackupPtrInput interface {
	pulumi.Input

	ToEtcdBackupPtrOutput() EtcdBackupPtrOutput
	ToEtcdBackupPtrOutputWithContext(ctx context.Context) EtcdBackupPtrOutput
}

type etcdBackupPtrType EtcdBackupArgs

func (*etcdBackupPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EtcdBackup)(nil))
}

func (i *etcdBackupPtrType) ToEtcdBackupPtrOutput() EtcdBackupPtrOutput {
	return i.ToEtcdBackupPtrOutputWithContext(context.Background())
}

func (i *etcdBackupPtrType) ToEtcdBackupPtrOutputWithContext(ctx context.Context) EtcdBackupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupPtrOutput)
}

// EtcdBackupArrayInput is an input type that accepts EtcdBackupArray and EtcdBackupArrayOutput values.
// You can construct a concrete instance of `EtcdBackupArrayInput` via:
//
//          EtcdBackupArray{ EtcdBackupArgs{...} }
type EtcdBackupArrayInput interface {
	pulumi.Input

	ToEtcdBackupArrayOutput() EtcdBackupArrayOutput
	ToEtcdBackupArrayOutputWithContext(context.Context) EtcdBackupArrayOutput
}

type EtcdBackupArray []EtcdBackupInput

func (EtcdBackupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EtcdBackup)(nil)).Elem()
}

func (i EtcdBackupArray) ToEtcdBackupArrayOutput() EtcdBackupArrayOutput {
	return i.ToEtcdBackupArrayOutputWithContext(context.Background())
}

func (i EtcdBackupArray) ToEtcdBackupArrayOutputWithContext(ctx context.Context) EtcdBackupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupArrayOutput)
}

// EtcdBackupMapInput is an input type that accepts EtcdBackupMap and EtcdBackupMapOutput values.
// You can construct a concrete instance of `EtcdBackupMapInput` via:
//
//          EtcdBackupMap{ "key": EtcdBackupArgs{...} }
type EtcdBackupMapInput interface {
	pulumi.Input

	ToEtcdBackupMapOutput() EtcdBackupMapOutput
	ToEtcdBackupMapOutputWithContext(context.Context) EtcdBackupMapOutput
}

type EtcdBackupMap map[string]EtcdBackupInput

func (EtcdBackupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EtcdBackup)(nil)).Elem()
}

func (i EtcdBackupMap) ToEtcdBackupMapOutput() EtcdBackupMapOutput {
	return i.ToEtcdBackupMapOutputWithContext(context.Background())
}

func (i EtcdBackupMap) ToEtcdBackupMapOutputWithContext(ctx context.Context) EtcdBackupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupMapOutput)
}

type EtcdBackupOutput struct{ *pulumi.OutputState }

func (EtcdBackupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EtcdBackup)(nil))
}

func (o EtcdBackupOutput) ToEtcdBackupOutput() EtcdBackupOutput {
	return o
}

func (o EtcdBackupOutput) ToEtcdBackupOutputWithContext(ctx context.Context) EtcdBackupOutput {
	return o
}

func (o EtcdBackupOutput) ToEtcdBackupPtrOutput() EtcdBackupPtrOutput {
	return o.ToEtcdBackupPtrOutputWithContext(context.Background())
}

func (o EtcdBackupOutput) ToEtcdBackupPtrOutputWithContext(ctx context.Context) EtcdBackupPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v EtcdBackup) *EtcdBackup {
		return &v
	}).(EtcdBackupPtrOutput)
}

type EtcdBackupPtrOutput struct{ *pulumi.OutputState }

func (EtcdBackupPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EtcdBackup)(nil))
}

func (o EtcdBackupPtrOutput) ToEtcdBackupPtrOutput() EtcdBackupPtrOutput {
	return o
}

func (o EtcdBackupPtrOutput) ToEtcdBackupPtrOutputWithContext(ctx context.Context) EtcdBackupPtrOutput {
	return o
}

func (o EtcdBackupPtrOutput) Elem() EtcdBackupOutput {
	return o.ApplyT(func(v *EtcdBackup) EtcdBackup {
		if v != nil {
			return *v
		}
		var ret EtcdBackup
		return ret
	}).(EtcdBackupOutput)
}

type EtcdBackupArrayOutput struct{ *pulumi.OutputState }

func (EtcdBackupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EtcdBackup)(nil))
}

func (o EtcdBackupArrayOutput) ToEtcdBackupArrayOutput() EtcdBackupArrayOutput {
	return o
}

func (o EtcdBackupArrayOutput) ToEtcdBackupArrayOutputWithContext(ctx context.Context) EtcdBackupArrayOutput {
	return o
}

func (o EtcdBackupArrayOutput) Index(i pulumi.IntInput) EtcdBackupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EtcdBackup {
		return vs[0].([]EtcdBackup)[vs[1].(int)]
	}).(EtcdBackupOutput)
}

type EtcdBackupMapOutput struct{ *pulumi.OutputState }

func (EtcdBackupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EtcdBackup)(nil))
}

func (o EtcdBackupMapOutput) ToEtcdBackupMapOutput() EtcdBackupMapOutput {
	return o
}

func (o EtcdBackupMapOutput) ToEtcdBackupMapOutputWithContext(ctx context.Context) EtcdBackupMapOutput {
	return o
}

func (o EtcdBackupMapOutput) MapIndex(k pulumi.StringInput) EtcdBackupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EtcdBackup {
		return vs[0].(map[string]EtcdBackup)[vs[1].(string)]
	}).(EtcdBackupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupInput)(nil)).Elem(), &EtcdBackup{})
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupPtrInput)(nil)).Elem(), &EtcdBackup{})
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupArrayInput)(nil)).Elem(), EtcdBackupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupMapInput)(nil)).Elem(), EtcdBackupMap{})
	pulumi.RegisterOutputType(EtcdBackupOutput{})
	pulumi.RegisterOutputType(EtcdBackupPtrOutput{})
	pulumi.RegisterOutputType(EtcdBackupArrayOutput{})
	pulumi.RegisterOutputType(EtcdBackupMapOutput{})
}
