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

// Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.
//
// ## Import
//
// Catalogs can be imported using the Rancher Catalog ID and its scope.
//
// ```sh
//
//	$ pulumi import rancher2:index/catalog:Catalog foo &lt;SCOPE&gt;.&lt;CATALOG_ID_ID&gt;
//
// ```
type Catalog struct {
	pulumi.CustomResourceState

	// Annotations for the catalog (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The branch of the catalog repo to use. Default `master` (string)
	Branch pulumi.StringPtrOutput `pulumi:"branch"`
	// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
	ClusterId pulumi.StringPtrOutput `pulumi:"clusterId"`
	// A catalog description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The kind of the catalog. Just helm by the moment (string)
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Labels for the catalog (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the catalog (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The password to access the catalog if needed (string)
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The project id of the catalog. Mandatory if `scope = project` (string)
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
	Refresh pulumi.BoolPtrOutput `pulumi:"refresh"`
	// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
	// The url of the catalog repo (string)
	Url pulumi.StringOutput `pulumi:"url"`
	// The username to access the catalog if needed (string)
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewCatalog registers a new resource with the given unique name, arguments, and options.
func NewCatalog(ctx *pulumi.Context,
	name string, args *CatalogArgs, opts ...pulumi.ResourceOption) (*Catalog, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	if args.Username != nil {
		args.Username = pulumi.ToSecret(args.Username).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
		"username",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Catalog
	err := ctx.RegisterResource("rancher2:index/catalog:Catalog", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalog gets an existing Catalog resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalog(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogState, opts ...pulumi.ResourceOption) (*Catalog, error) {
	var resource Catalog
	err := ctx.ReadResource("rancher2:index/catalog:Catalog", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Catalog resources.
type catalogState struct {
	// Annotations for the catalog (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The branch of the catalog repo to use. Default `master` (string)
	Branch *string `pulumi:"branch"`
	// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
	ClusterId *string `pulumi:"clusterId"`
	// A catalog description (string)
	Description *string `pulumi:"description"`
	// The kind of the catalog. Just helm by the moment (string)
	Kind *string `pulumi:"kind"`
	// Labels for the catalog (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the catalog (string)
	Name *string `pulumi:"name"`
	// The password to access the catalog if needed (string)
	Password *string `pulumi:"password"`
	// The project id of the catalog. Mandatory if `scope = project` (string)
	ProjectId *string `pulumi:"projectId"`
	// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
	Refresh *bool `pulumi:"refresh"`
	// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
	Scope *string `pulumi:"scope"`
	// The url of the catalog repo (string)
	Url *string `pulumi:"url"`
	// The username to access the catalog if needed (string)
	Username *string `pulumi:"username"`
	// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
	Version *string `pulumi:"version"`
}

type CatalogState struct {
	// Annotations for the catalog (map)
	Annotations pulumi.MapInput
	// The branch of the catalog repo to use. Default `master` (string)
	Branch pulumi.StringPtrInput
	// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
	ClusterId pulumi.StringPtrInput
	// A catalog description (string)
	Description pulumi.StringPtrInput
	// The kind of the catalog. Just helm by the moment (string)
	Kind pulumi.StringPtrInput
	// Labels for the catalog (map)
	Labels pulumi.MapInput
	// The name of the catalog (string)
	Name pulumi.StringPtrInput
	// The password to access the catalog if needed (string)
	Password pulumi.StringPtrInput
	// The project id of the catalog. Mandatory if `scope = project` (string)
	ProjectId pulumi.StringPtrInput
	// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
	Refresh pulumi.BoolPtrInput
	// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
	Scope pulumi.StringPtrInput
	// The url of the catalog repo (string)
	Url pulumi.StringPtrInput
	// The username to access the catalog if needed (string)
	Username pulumi.StringPtrInput
	// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
	Version pulumi.StringPtrInput
}

func (CatalogState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogState)(nil)).Elem()
}

type catalogArgs struct {
	// Annotations for the catalog (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The branch of the catalog repo to use. Default `master` (string)
	Branch *string `pulumi:"branch"`
	// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
	ClusterId *string `pulumi:"clusterId"`
	// A catalog description (string)
	Description *string `pulumi:"description"`
	// The kind of the catalog. Just helm by the moment (string)
	Kind *string `pulumi:"kind"`
	// Labels for the catalog (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the catalog (string)
	Name *string `pulumi:"name"`
	// The password to access the catalog if needed (string)
	Password *string `pulumi:"password"`
	// The project id of the catalog. Mandatory if `scope = project` (string)
	ProjectId *string `pulumi:"projectId"`
	// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
	Refresh *bool `pulumi:"refresh"`
	// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
	Scope *string `pulumi:"scope"`
	// The url of the catalog repo (string)
	Url string `pulumi:"url"`
	// The username to access the catalog if needed (string)
	Username *string `pulumi:"username"`
	// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
	Version *string `pulumi:"version"`
}

// The set of arguments for constructing a Catalog resource.
type CatalogArgs struct {
	// Annotations for the catalog (map)
	Annotations pulumi.MapInput
	// The branch of the catalog repo to use. Default `master` (string)
	Branch pulumi.StringPtrInput
	// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
	ClusterId pulumi.StringPtrInput
	// A catalog description (string)
	Description pulumi.StringPtrInput
	// The kind of the catalog. Just helm by the moment (string)
	Kind pulumi.StringPtrInput
	// Labels for the catalog (map)
	Labels pulumi.MapInput
	// The name of the catalog (string)
	Name pulumi.StringPtrInput
	// The password to access the catalog if needed (string)
	Password pulumi.StringPtrInput
	// The project id of the catalog. Mandatory if `scope = project` (string)
	ProjectId pulumi.StringPtrInput
	// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
	Refresh pulumi.BoolPtrInput
	// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
	Scope pulumi.StringPtrInput
	// The url of the catalog repo (string)
	Url pulumi.StringInput
	// The username to access the catalog if needed (string)
	Username pulumi.StringPtrInput
	// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
	Version pulumi.StringPtrInput
}

func (CatalogArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogArgs)(nil)).Elem()
}

type CatalogInput interface {
	pulumi.Input

	ToCatalogOutput() CatalogOutput
	ToCatalogOutputWithContext(ctx context.Context) CatalogOutput
}

func (*Catalog) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (i *Catalog) ToCatalogOutput() CatalogOutput {
	return i.ToCatalogOutputWithContext(context.Background())
}

func (i *Catalog) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogOutput)
}

func (i *Catalog) ToOutput(ctx context.Context) pulumix.Output[*Catalog] {
	return pulumix.Output[*Catalog]{
		OutputState: i.ToCatalogOutputWithContext(ctx).OutputState,
	}
}

// CatalogArrayInput is an input type that accepts CatalogArray and CatalogArrayOutput values.
// You can construct a concrete instance of `CatalogArrayInput` via:
//
//	CatalogArray{ CatalogArgs{...} }
type CatalogArrayInput interface {
	pulumi.Input

	ToCatalogArrayOutput() CatalogArrayOutput
	ToCatalogArrayOutputWithContext(context.Context) CatalogArrayOutput
}

type CatalogArray []CatalogInput

func (CatalogArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (i CatalogArray) ToCatalogArrayOutput() CatalogArrayOutput {
	return i.ToCatalogArrayOutputWithContext(context.Background())
}

func (i CatalogArray) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogArrayOutput)
}

func (i CatalogArray) ToOutput(ctx context.Context) pulumix.Output[[]*Catalog] {
	return pulumix.Output[[]*Catalog]{
		OutputState: i.ToCatalogArrayOutputWithContext(ctx).OutputState,
	}
}

// CatalogMapInput is an input type that accepts CatalogMap and CatalogMapOutput values.
// You can construct a concrete instance of `CatalogMapInput` via:
//
//	CatalogMap{ "key": CatalogArgs{...} }
type CatalogMapInput interface {
	pulumi.Input

	ToCatalogMapOutput() CatalogMapOutput
	ToCatalogMapOutputWithContext(context.Context) CatalogMapOutput
}

type CatalogMap map[string]CatalogInput

func (CatalogMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (i CatalogMap) ToCatalogMapOutput() CatalogMapOutput {
	return i.ToCatalogMapOutputWithContext(context.Background())
}

func (i CatalogMap) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogMapOutput)
}

func (i CatalogMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Catalog] {
	return pulumix.Output[map[string]*Catalog]{
		OutputState: i.ToCatalogMapOutputWithContext(ctx).OutputState,
	}
}

type CatalogOutput struct{ *pulumi.OutputState }

func (CatalogOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (o CatalogOutput) ToCatalogOutput() CatalogOutput {
	return o
}

func (o CatalogOutput) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return o
}

func (o CatalogOutput) ToOutput(ctx context.Context) pulumix.Output[*Catalog] {
	return pulumix.Output[*Catalog]{
		OutputState: o.OutputState,
	}
}

// Annotations for the catalog (map)
func (o CatalogOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *Catalog) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The branch of the catalog repo to use. Default `master` (string)
func (o CatalogOutput) Branch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Branch }).(pulumi.StringPtrOutput)
}

// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
func (o CatalogOutput) ClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.ClusterId }).(pulumi.StringPtrOutput)
}

// A catalog description (string)
func (o CatalogOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The kind of the catalog. Just helm by the moment (string)
func (o CatalogOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Labels for the catalog (map)
func (o CatalogOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Catalog) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the catalog (string)
func (o CatalogOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password to access the catalog if needed (string)
func (o CatalogOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The project id of the catalog. Mandatory if `scope = project` (string)
func (o CatalogOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
func (o CatalogOutput) Refresh() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.BoolPtrOutput { return v.Refresh }).(pulumi.BoolPtrOutput)
}

// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
func (o CatalogOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Scope }).(pulumi.StringPtrOutput)
}

// The url of the catalog repo (string)
func (o CatalogOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// The username to access the catalog if needed (string)
func (o CatalogOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// Helm version for the catalog. Available options: `helmV2` and `helmV3` (string)
func (o CatalogOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type CatalogArrayOutput struct{ *pulumi.OutputState }

func (CatalogArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (o CatalogArrayOutput) ToCatalogArrayOutput() CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Catalog] {
	return pulumix.Output[[]*Catalog]{
		OutputState: o.OutputState,
	}
}

func (o CatalogArrayOutput) Index(i pulumi.IntInput) CatalogOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].([]*Catalog)[vs[1].(int)]
	}).(CatalogOutput)
}

type CatalogMapOutput struct{ *pulumi.OutputState }

func (CatalogMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (o CatalogMapOutput) ToCatalogMapOutput() CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Catalog] {
	return pulumix.Output[map[string]*Catalog]{
		OutputState: o.OutputState,
	}
}

func (o CatalogMapOutput) MapIndex(k pulumi.StringInput) CatalogOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].(map[string]*Catalog)[vs[1].(string)]
	}).(CatalogOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogInput)(nil)).Elem(), &Catalog{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogArrayInput)(nil)).Elem(), CatalogArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogMapInput)(nil)).Elem(), CatalogMap{})
	pulumi.RegisterOutputType(CatalogOutput{})
	pulumi.RegisterOutputType(CatalogArrayOutput{})
	pulumi.RegisterOutputType(CatalogMapOutput{})
}
