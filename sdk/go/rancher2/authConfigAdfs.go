// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config ADFS resource. This can be used to configure and enable Auth Config ADFS for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewAuthConfigAdfs(ctx, "adfs", &rancher2.AuthConfigAdfsArgs{
//				DisplayNameField:   pulumi.String("<DISPLAY_NAME_FIELD>"),
//				GroupsField:        pulumi.String("<GROUPS_FIELD>"),
//				IdpMetadataContent: pulumi.String("<IDP_METADATA_CONTENT>"),
//				RancherApiHost:     pulumi.String("https://<RANCHER_API_HOST>"),
//				SpCert:             pulumi.String("<SP_CERT>"),
//				SpKey:              pulumi.String("<SP_KEY>"),
//				UidField:           pulumi.String("<UID_FIELD>"),
//				UserNameField:      pulumi.String("<USER_NAME_FIELD>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuthConfigAdfs struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// ADFS display name field (string)
	DisplayNameField pulumi.StringOutput `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// ADFS group field (string)
	GroupsField pulumi.StringOutput `pulumi:"groupsField"`
	// ADFS IDP metadata content (string)
	IdpMetadataContent pulumi.StringOutput `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringOutput `pulumi:"rancherApiHost"`
	// ADFS SP cert (string)
	SpCert pulumi.StringOutput `pulumi:"spCert"`
	// ADFS SP key (string)
	SpKey pulumi.StringOutput `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// ADFS UID field (string)
	UidField pulumi.StringOutput `pulumi:"uidField"`
	// ADFS user name field (string)
	UserNameField pulumi.StringOutput `pulumi:"userNameField"`
}

// NewAuthConfigAdfs registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigAdfs(ctx *pulumi.Context,
	name string, args *AuthConfigAdfsArgs, opts ...pulumi.ResourceOption) (*AuthConfigAdfs, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayNameField == nil {
		return nil, errors.New("invalid value for required argument 'DisplayNameField'")
	}
	if args.GroupsField == nil {
		return nil, errors.New("invalid value for required argument 'GroupsField'")
	}
	if args.IdpMetadataContent == nil {
		return nil, errors.New("invalid value for required argument 'IdpMetadataContent'")
	}
	if args.RancherApiHost == nil {
		return nil, errors.New("invalid value for required argument 'RancherApiHost'")
	}
	if args.SpCert == nil {
		return nil, errors.New("invalid value for required argument 'SpCert'")
	}
	if args.SpKey == nil {
		return nil, errors.New("invalid value for required argument 'SpKey'")
	}
	if args.UidField == nil {
		return nil, errors.New("invalid value for required argument 'UidField'")
	}
	if args.UserNameField == nil {
		return nil, errors.New("invalid value for required argument 'UserNameField'")
	}
	if args.IdpMetadataContent != nil {
		args.IdpMetadataContent = pulumi.ToSecret(args.IdpMetadataContent).(pulumi.StringInput)
	}
	if args.SpCert != nil {
		args.SpCert = pulumi.ToSecret(args.SpCert).(pulumi.StringInput)
	}
	if args.SpKey != nil {
		args.SpKey = pulumi.ToSecret(args.SpKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"idpMetadataContent",
		"spCert",
		"spKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfigAdfs
	err := ctx.RegisterResource("rancher2:index/authConfigAdfs:AuthConfigAdfs", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigAdfs gets an existing AuthConfigAdfs resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigAdfs(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigAdfsState, opts ...pulumi.ResourceOption) (*AuthConfigAdfs, error) {
	var resource AuthConfigAdfs
	err := ctx.ReadResource("rancher2:index/authConfigAdfs:AuthConfigAdfs", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigAdfs resources.
type authConfigAdfsState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// ADFS display name field (string)
	DisplayNameField *string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// ADFS group field (string)
	GroupsField *string `pulumi:"groupsField"`
	// ADFS IDP metadata content (string)
	IdpMetadataContent *string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost *string `pulumi:"rancherApiHost"`
	// ADFS SP cert (string)
	SpCert *string `pulumi:"spCert"`
	// ADFS SP key (string)
	SpKey *string `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// ADFS UID field (string)
	UidField *string `pulumi:"uidField"`
	// ADFS user name field (string)
	UserNameField *string `pulumi:"userNameField"`
}

type AuthConfigAdfsState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// ADFS display name field (string)
	DisplayNameField pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// ADFS group field (string)
	GroupsField pulumi.StringPtrInput
	// ADFS IDP metadata content (string)
	IdpMetadataContent pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringPtrInput
	// ADFS SP cert (string)
	SpCert pulumi.StringPtrInput
	// ADFS SP key (string)
	SpKey pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// ADFS UID field (string)
	UidField pulumi.StringPtrInput
	// ADFS user name field (string)
	UserNameField pulumi.StringPtrInput
}

func (AuthConfigAdfsState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAdfsState)(nil)).Elem()
}

type authConfigAdfsArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// ADFS display name field (string)
	DisplayNameField string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// ADFS group field (string)
	GroupsField string `pulumi:"groupsField"`
	// ADFS IDP metadata content (string)
	IdpMetadataContent string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost string `pulumi:"rancherApiHost"`
	// ADFS SP cert (string)
	SpCert string `pulumi:"spCert"`
	// ADFS SP key (string)
	SpKey string `pulumi:"spKey"`
	// ADFS UID field (string)
	UidField string `pulumi:"uidField"`
	// ADFS user name field (string)
	UserNameField string `pulumi:"userNameField"`
}

// The set of arguments for constructing a AuthConfigAdfs resource.
type AuthConfigAdfsArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// ADFS display name field (string)
	DisplayNameField pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// ADFS group field (string)
	GroupsField pulumi.StringInput
	// ADFS IDP metadata content (string)
	IdpMetadataContent pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringInput
	// ADFS SP cert (string)
	SpCert pulumi.StringInput
	// ADFS SP key (string)
	SpKey pulumi.StringInput
	// ADFS UID field (string)
	UidField pulumi.StringInput
	// ADFS user name field (string)
	UserNameField pulumi.StringInput
}

func (AuthConfigAdfsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAdfsArgs)(nil)).Elem()
}

type AuthConfigAdfsInput interface {
	pulumi.Input

	ToAuthConfigAdfsOutput() AuthConfigAdfsOutput
	ToAuthConfigAdfsOutputWithContext(ctx context.Context) AuthConfigAdfsOutput
}

func (*AuthConfigAdfs) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigAdfs)(nil)).Elem()
}

func (i *AuthConfigAdfs) ToAuthConfigAdfsOutput() AuthConfigAdfsOutput {
	return i.ToAuthConfigAdfsOutputWithContext(context.Background())
}

func (i *AuthConfigAdfs) ToAuthConfigAdfsOutputWithContext(ctx context.Context) AuthConfigAdfsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAdfsOutput)
}

// AuthConfigAdfsArrayInput is an input type that accepts AuthConfigAdfsArray and AuthConfigAdfsArrayOutput values.
// You can construct a concrete instance of `AuthConfigAdfsArrayInput` via:
//
//	AuthConfigAdfsArray{ AuthConfigAdfsArgs{...} }
type AuthConfigAdfsArrayInput interface {
	pulumi.Input

	ToAuthConfigAdfsArrayOutput() AuthConfigAdfsArrayOutput
	ToAuthConfigAdfsArrayOutputWithContext(context.Context) AuthConfigAdfsArrayOutput
}

type AuthConfigAdfsArray []AuthConfigAdfsInput

func (AuthConfigAdfsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigAdfs)(nil)).Elem()
}

func (i AuthConfigAdfsArray) ToAuthConfigAdfsArrayOutput() AuthConfigAdfsArrayOutput {
	return i.ToAuthConfigAdfsArrayOutputWithContext(context.Background())
}

func (i AuthConfigAdfsArray) ToAuthConfigAdfsArrayOutputWithContext(ctx context.Context) AuthConfigAdfsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAdfsArrayOutput)
}

// AuthConfigAdfsMapInput is an input type that accepts AuthConfigAdfsMap and AuthConfigAdfsMapOutput values.
// You can construct a concrete instance of `AuthConfigAdfsMapInput` via:
//
//	AuthConfigAdfsMap{ "key": AuthConfigAdfsArgs{...} }
type AuthConfigAdfsMapInput interface {
	pulumi.Input

	ToAuthConfigAdfsMapOutput() AuthConfigAdfsMapOutput
	ToAuthConfigAdfsMapOutputWithContext(context.Context) AuthConfigAdfsMapOutput
}

type AuthConfigAdfsMap map[string]AuthConfigAdfsInput

func (AuthConfigAdfsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigAdfs)(nil)).Elem()
}

func (i AuthConfigAdfsMap) ToAuthConfigAdfsMapOutput() AuthConfigAdfsMapOutput {
	return i.ToAuthConfigAdfsMapOutputWithContext(context.Background())
}

func (i AuthConfigAdfsMap) ToAuthConfigAdfsMapOutputWithContext(ctx context.Context) AuthConfigAdfsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAdfsMapOutput)
}

type AuthConfigAdfsOutput struct{ *pulumi.OutputState }

func (AuthConfigAdfsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigAdfs)(nil)).Elem()
}

func (o AuthConfigAdfsOutput) ToAuthConfigAdfsOutput() AuthConfigAdfsOutput {
	return o
}

func (o AuthConfigAdfsOutput) ToAuthConfigAdfsOutputWithContext(ctx context.Context) AuthConfigAdfsOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigAdfsOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
func (o AuthConfigAdfsOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigAdfsOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// ADFS display name field (string)
func (o AuthConfigAdfsOutput) DisplayNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.DisplayNameField }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigAdfsOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// ADFS group field (string)
func (o AuthConfigAdfsOutput) GroupsField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.GroupsField }).(pulumi.StringOutput)
}

// ADFS IDP metadata content (string)
func (o AuthConfigAdfsOutput) IdpMetadataContent() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.IdpMetadataContent }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigAdfsOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigAdfsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
func (o AuthConfigAdfsOutput) RancherApiHost() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.RancherApiHost }).(pulumi.StringOutput)
}

// ADFS SP cert (string)
func (o AuthConfigAdfsOutput) SpCert() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.SpCert }).(pulumi.StringOutput)
}

// ADFS SP key (string)
func (o AuthConfigAdfsOutput) SpKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.SpKey }).(pulumi.StringOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigAdfsOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// ADFS UID field (string)
func (o AuthConfigAdfsOutput) UidField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.UidField }).(pulumi.StringOutput)
}

// ADFS user name field (string)
func (o AuthConfigAdfsOutput) UserNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAdfs) pulumi.StringOutput { return v.UserNameField }).(pulumi.StringOutput)
}

type AuthConfigAdfsArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigAdfsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigAdfs)(nil)).Elem()
}

func (o AuthConfigAdfsArrayOutput) ToAuthConfigAdfsArrayOutput() AuthConfigAdfsArrayOutput {
	return o
}

func (o AuthConfigAdfsArrayOutput) ToAuthConfigAdfsArrayOutputWithContext(ctx context.Context) AuthConfigAdfsArrayOutput {
	return o
}

func (o AuthConfigAdfsArrayOutput) Index(i pulumi.IntInput) AuthConfigAdfsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigAdfs {
		return vs[0].([]*AuthConfigAdfs)[vs[1].(int)]
	}).(AuthConfigAdfsOutput)
}

type AuthConfigAdfsMapOutput struct{ *pulumi.OutputState }

func (AuthConfigAdfsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigAdfs)(nil)).Elem()
}

func (o AuthConfigAdfsMapOutput) ToAuthConfigAdfsMapOutput() AuthConfigAdfsMapOutput {
	return o
}

func (o AuthConfigAdfsMapOutput) ToAuthConfigAdfsMapOutputWithContext(ctx context.Context) AuthConfigAdfsMapOutput {
	return o
}

func (o AuthConfigAdfsMapOutput) MapIndex(k pulumi.StringInput) AuthConfigAdfsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigAdfs {
		return vs[0].(map[string]*AuthConfigAdfs)[vs[1].(string)]
	}).(AuthConfigAdfsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAdfsInput)(nil)).Elem(), &AuthConfigAdfs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAdfsArrayInput)(nil)).Elem(), AuthConfigAdfsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAdfsMapInput)(nil)).Elem(), AuthConfigAdfsMap{})
	pulumi.RegisterOutputType(AuthConfigAdfsOutput{})
	pulumi.RegisterOutputType(AuthConfigAdfsArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigAdfsMapOutput{})
}
