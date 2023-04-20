// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v4/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewEtcdBackup(ctx, "foo", &rancher2.EtcdBackupArgs{
//				BackupConfig: &rancher2.EtcdBackupBackupConfigArgs{
//					Enabled:       pulumi.Bool(true),
//					IntervalHours: pulumi.Int(20),
//					Retention:     pulumi.Int(10),
//					S3BackupConfig: &rancher2.EtcdBackupBackupConfigS3BackupConfigArgs{
//						AccessKey:  pulumi.String("access_key"),
//						BucketName: pulumi.String("bucket_name"),
//						Endpoint:   pulumi.String("endpoint"),
//						Folder:     pulumi.String("/folder"),
//						Region:     pulumi.String("region"),
//						SecretKey:  pulumi.String("secret_key"),
//					},
//				},
//				ClusterId: pulumi.String("<CLUSTER_ID>"),
//				Filename:  pulumi.String("<FILENAME>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Etcd Backup can be imported using the Rancher etcd backup ID
//
// ```sh
//
//	$ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
//
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
	return reflect.TypeOf((**EtcdBackup)(nil)).Elem()
}

func (i *EtcdBackup) ToEtcdBackupOutput() EtcdBackupOutput {
	return i.ToEtcdBackupOutputWithContext(context.Background())
}

func (i *EtcdBackup) ToEtcdBackupOutputWithContext(ctx context.Context) EtcdBackupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EtcdBackupOutput)
}

// EtcdBackupArrayInput is an input type that accepts EtcdBackupArray and EtcdBackupArrayOutput values.
// You can construct a concrete instance of `EtcdBackupArrayInput` via:
//
//	EtcdBackupArray{ EtcdBackupArgs{...} }
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
//	EtcdBackupMap{ "key": EtcdBackupArgs{...} }
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
	return reflect.TypeOf((**EtcdBackup)(nil)).Elem()
}

func (o EtcdBackupOutput) ToEtcdBackupOutput() EtcdBackupOutput {
	return o
}

func (o EtcdBackupOutput) ToEtcdBackupOutputWithContext(ctx context.Context) EtcdBackupOutput {
	return o
}

// Annotations for Etcd Backup object (map)
func (o EtcdBackupOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Backup config for etcd backup (list maxitems:1)
func (o EtcdBackupOutput) BackupConfig() EtcdBackupBackupConfigOutput {
	return o.ApplyT(func(v *EtcdBackup) EtcdBackupBackupConfigOutput { return v.BackupConfig }).(EtcdBackupBackupConfigOutput)
}

// Cluster ID to config Etcd Backup (string)
func (o EtcdBackupOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Filename of the Etcd Backup (string)
func (o EtcdBackupOutput) Filename() pulumi.StringOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.StringOutput { return v.Filename }).(pulumi.StringOutput)
}

// Labels for Etcd Backup object (map)
func (o EtcdBackupOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Manual execution of the Etcd Backup. Default `false` (bool)
func (o EtcdBackupOutput) Manual() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.BoolPtrOutput { return v.Manual }).(pulumi.BoolPtrOutput)
}

// The name of the Etcd Backup (string)
func (o EtcdBackupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Description for the Etcd Backup (string)
func (o EtcdBackupOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EtcdBackup) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

type EtcdBackupArrayOutput struct{ *pulumi.OutputState }

func (EtcdBackupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EtcdBackup)(nil)).Elem()
}

func (o EtcdBackupArrayOutput) ToEtcdBackupArrayOutput() EtcdBackupArrayOutput {
	return o
}

func (o EtcdBackupArrayOutput) ToEtcdBackupArrayOutputWithContext(ctx context.Context) EtcdBackupArrayOutput {
	return o
}

func (o EtcdBackupArrayOutput) Index(i pulumi.IntInput) EtcdBackupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EtcdBackup {
		return vs[0].([]*EtcdBackup)[vs[1].(int)]
	}).(EtcdBackupOutput)
}

type EtcdBackupMapOutput struct{ *pulumi.OutputState }

func (EtcdBackupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EtcdBackup)(nil)).Elem()
}

func (o EtcdBackupMapOutput) ToEtcdBackupMapOutput() EtcdBackupMapOutput {
	return o
}

func (o EtcdBackupMapOutput) ToEtcdBackupMapOutputWithContext(ctx context.Context) EtcdBackupMapOutput {
	return o
}

func (o EtcdBackupMapOutput) MapIndex(k pulumi.StringInput) EtcdBackupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EtcdBackup {
		return vs[0].(map[string]*EtcdBackup)[vs[1].(string)]
	}).(EtcdBackupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupInput)(nil)).Elem(), &EtcdBackup{})
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupArrayInput)(nil)).Elem(), EtcdBackupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EtcdBackupMapInput)(nil)).Elem(), EtcdBackupMap{})
	pulumi.RegisterOutputType(EtcdBackupOutput{})
	pulumi.RegisterOutputType(EtcdBackupArrayOutput{})
	pulumi.RegisterOutputType(EtcdBackupMapOutput{})
}
