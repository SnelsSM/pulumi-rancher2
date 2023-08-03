// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config KeyCloak resource. This can be used to configure and enable Auth Config KeyCloak for Rancher v2 RKE clusters and retrieve their information.
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
//	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewAuthConfigKeycloak(ctx, "keycloak", &rancher2.AuthConfigKeycloakArgs{
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
type AuthConfigKeycloak struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringOutput `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// KeyCloak Client ID field (string)
	EntityId pulumi.StringOutput `pulumi:"entityId"`
	// KeyCloak group field (string)
	GroupsField pulumi.StringOutput `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringOutput `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringOutput `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert pulumi.StringOutput `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey pulumi.StringOutput `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// KeyCloak UID field (string)
	UidField pulumi.StringOutput `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField pulumi.StringOutput `pulumi:"userNameField"`
}

// NewAuthConfigKeycloak registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigKeycloak(ctx *pulumi.Context,
	name string, args *AuthConfigKeycloakArgs, opts ...pulumi.ResourceOption) (*AuthConfigKeycloak, error) {
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
	var resource AuthConfigKeycloak
	err := ctx.RegisterResource("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigKeycloak gets an existing AuthConfigKeycloak resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigKeycloak(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigKeycloakState, opts ...pulumi.ResourceOption) (*AuthConfigKeycloak, error) {
	var resource AuthConfigKeycloak
	err := ctx.ReadResource("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigKeycloak resources.
type authConfigKeycloakState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField *string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// KeyCloak Client ID field (string)
	EntityId *string `pulumi:"entityId"`
	// KeyCloak group field (string)
	GroupsField *string `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent *string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost *string `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert *string `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey *string `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// KeyCloak UID field (string)
	UidField *string `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField *string `pulumi:"userNameField"`
}

type AuthConfigKeycloakState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// KeyCloak Client ID field (string)
	EntityId pulumi.StringPtrInput
	// KeyCloak group field (string)
	GroupsField pulumi.StringPtrInput
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringPtrInput
	// KeyCloak SP cert (string)
	SpCert pulumi.StringPtrInput
	// KeyCloak SP key (string)
	SpKey pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// KeyCloak UID field (string)
	UidField pulumi.StringPtrInput
	// KeyCloak user name field (string)
	UserNameField pulumi.StringPtrInput
}

func (AuthConfigKeycloakState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigKeycloakState)(nil)).Elem()
}

type authConfigKeycloakArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// KeyCloak Client ID field (string)
	EntityId *string `pulumi:"entityId"`
	// KeyCloak group field (string)
	GroupsField string `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost string `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert string `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey string `pulumi:"spKey"`
	// KeyCloak UID field (string)
	UidField string `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField string `pulumi:"userNameField"`
}

// The set of arguments for constructing a AuthConfigKeycloak resource.
type AuthConfigKeycloakArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// KeyCloak Client ID field (string)
	EntityId pulumi.StringPtrInput
	// KeyCloak group field (string)
	GroupsField pulumi.StringInput
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringInput
	// KeyCloak SP cert (string)
	SpCert pulumi.StringInput
	// KeyCloak SP key (string)
	SpKey pulumi.StringInput
	// KeyCloak UID field (string)
	UidField pulumi.StringInput
	// KeyCloak user name field (string)
	UserNameField pulumi.StringInput
}

func (AuthConfigKeycloakArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigKeycloakArgs)(nil)).Elem()
}

type AuthConfigKeycloakInput interface {
	pulumi.Input

	ToAuthConfigKeycloakOutput() AuthConfigKeycloakOutput
	ToAuthConfigKeycloakOutputWithContext(ctx context.Context) AuthConfigKeycloakOutput
}

func (*AuthConfigKeycloak) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigKeycloak)(nil)).Elem()
}

func (i *AuthConfigKeycloak) ToAuthConfigKeycloakOutput() AuthConfigKeycloakOutput {
	return i.ToAuthConfigKeycloakOutputWithContext(context.Background())
}

func (i *AuthConfigKeycloak) ToAuthConfigKeycloakOutputWithContext(ctx context.Context) AuthConfigKeycloakOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigKeycloakOutput)
}

// AuthConfigKeycloakArrayInput is an input type that accepts AuthConfigKeycloakArray and AuthConfigKeycloakArrayOutput values.
// You can construct a concrete instance of `AuthConfigKeycloakArrayInput` via:
//
//	AuthConfigKeycloakArray{ AuthConfigKeycloakArgs{...} }
type AuthConfigKeycloakArrayInput interface {
	pulumi.Input

	ToAuthConfigKeycloakArrayOutput() AuthConfigKeycloakArrayOutput
	ToAuthConfigKeycloakArrayOutputWithContext(context.Context) AuthConfigKeycloakArrayOutput
}

type AuthConfigKeycloakArray []AuthConfigKeycloakInput

func (AuthConfigKeycloakArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigKeycloak)(nil)).Elem()
}

func (i AuthConfigKeycloakArray) ToAuthConfigKeycloakArrayOutput() AuthConfigKeycloakArrayOutput {
	return i.ToAuthConfigKeycloakArrayOutputWithContext(context.Background())
}

func (i AuthConfigKeycloakArray) ToAuthConfigKeycloakArrayOutputWithContext(ctx context.Context) AuthConfigKeycloakArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigKeycloakArrayOutput)
}

// AuthConfigKeycloakMapInput is an input type that accepts AuthConfigKeycloakMap and AuthConfigKeycloakMapOutput values.
// You can construct a concrete instance of `AuthConfigKeycloakMapInput` via:
//
//	AuthConfigKeycloakMap{ "key": AuthConfigKeycloakArgs{...} }
type AuthConfigKeycloakMapInput interface {
	pulumi.Input

	ToAuthConfigKeycloakMapOutput() AuthConfigKeycloakMapOutput
	ToAuthConfigKeycloakMapOutputWithContext(context.Context) AuthConfigKeycloakMapOutput
}

type AuthConfigKeycloakMap map[string]AuthConfigKeycloakInput

func (AuthConfigKeycloakMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigKeycloak)(nil)).Elem()
}

func (i AuthConfigKeycloakMap) ToAuthConfigKeycloakMapOutput() AuthConfigKeycloakMapOutput {
	return i.ToAuthConfigKeycloakMapOutputWithContext(context.Background())
}

func (i AuthConfigKeycloakMap) ToAuthConfigKeycloakMapOutputWithContext(ctx context.Context) AuthConfigKeycloakMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigKeycloakMapOutput)
}

type AuthConfigKeycloakOutput struct{ *pulumi.OutputState }

func (AuthConfigKeycloakOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigKeycloak)(nil)).Elem()
}

func (o AuthConfigKeycloakOutput) ToAuthConfigKeycloakOutput() AuthConfigKeycloakOutput {
	return o
}

func (o AuthConfigKeycloakOutput) ToAuthConfigKeycloakOutputWithContext(ctx context.Context) AuthConfigKeycloakOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigKeycloakOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
func (o AuthConfigKeycloakOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigKeycloakOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// KeyCloak display name field (string)
func (o AuthConfigKeycloakOutput) DisplayNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.DisplayNameField }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigKeycloakOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// KeyCloak Client ID field (string)
func (o AuthConfigKeycloakOutput) EntityId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.EntityId }).(pulumi.StringOutput)
}

// KeyCloak group field (string)
func (o AuthConfigKeycloakOutput) GroupsField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.GroupsField }).(pulumi.StringOutput)
}

// KeyCloak IDP metadata content (string)
func (o AuthConfigKeycloakOutput) IdpMetadataContent() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.IdpMetadataContent }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigKeycloakOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigKeycloakOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
func (o AuthConfigKeycloakOutput) RancherApiHost() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.RancherApiHost }).(pulumi.StringOutput)
}

// KeyCloak SP cert (string)
func (o AuthConfigKeycloakOutput) SpCert() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.SpCert }).(pulumi.StringOutput)
}

// KeyCloak SP key (string)
func (o AuthConfigKeycloakOutput) SpKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.SpKey }).(pulumi.StringOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigKeycloakOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// KeyCloak UID field (string)
func (o AuthConfigKeycloakOutput) UidField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.UidField }).(pulumi.StringOutput)
}

// KeyCloak user name field (string)
func (o AuthConfigKeycloakOutput) UserNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigKeycloak) pulumi.StringOutput { return v.UserNameField }).(pulumi.StringOutput)
}

type AuthConfigKeycloakArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigKeycloakArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigKeycloak)(nil)).Elem()
}

func (o AuthConfigKeycloakArrayOutput) ToAuthConfigKeycloakArrayOutput() AuthConfigKeycloakArrayOutput {
	return o
}

func (o AuthConfigKeycloakArrayOutput) ToAuthConfigKeycloakArrayOutputWithContext(ctx context.Context) AuthConfigKeycloakArrayOutput {
	return o
}

func (o AuthConfigKeycloakArrayOutput) Index(i pulumi.IntInput) AuthConfigKeycloakOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigKeycloak {
		return vs[0].([]*AuthConfigKeycloak)[vs[1].(int)]
	}).(AuthConfigKeycloakOutput)
}

type AuthConfigKeycloakMapOutput struct{ *pulumi.OutputState }

func (AuthConfigKeycloakMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigKeycloak)(nil)).Elem()
}

func (o AuthConfigKeycloakMapOutput) ToAuthConfigKeycloakMapOutput() AuthConfigKeycloakMapOutput {
	return o
}

func (o AuthConfigKeycloakMapOutput) ToAuthConfigKeycloakMapOutputWithContext(ctx context.Context) AuthConfigKeycloakMapOutput {
	return o
}

func (o AuthConfigKeycloakMapOutput) MapIndex(k pulumi.StringInput) AuthConfigKeycloakOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigKeycloak {
		return vs[0].(map[string]*AuthConfigKeycloak)[vs[1].(string)]
	}).(AuthConfigKeycloakOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigKeycloakInput)(nil)).Elem(), &AuthConfigKeycloak{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigKeycloakArrayInput)(nil)).Elem(), AuthConfigKeycloakArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigKeycloakMapInput)(nil)).Elem(), AuthConfigKeycloakMap{})
	pulumi.RegisterOutputType(AuthConfigKeycloakOutput{})
	pulumi.RegisterOutputType(AuthConfigKeycloakArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigKeycloakMapOutput{})
}
