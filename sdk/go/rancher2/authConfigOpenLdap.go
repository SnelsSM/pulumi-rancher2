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

// Provides a Rancher v2 Auth Config OpenLdap resource. This can be used to configure and enable Auth Config OpenLdap for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type AuthConfigOpenLdap struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrOutput `pulumi:"certificate"`
	// OpenLdap connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrOutput `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringOutput `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringOutput `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringOutput `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringOutput `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringOutput `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringOutput `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   pulumi.StringOutput    `pulumi:"groupSearchBase"`
	GroupSearchFilter pulumi.StringPtrOutput `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolOutput `pulumi:"nestedGroupMembershipEnabled"`
	// OpenLdap port. Default `389` (int)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// OpenLdap servers list (list)
	Servers pulumi.StringArrayOutput `pulumi:"servers"`
	// Service account DN for access OpenLdap service (string)
	ServiceAccountDistinguishedName pulumi.StringOutput `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access OpenLdap service (string)
	ServiceAccountPassword pulumi.StringOutput `pulumi:"serviceAccountPassword"`
	StartTls               pulumi.BoolOutput   `pulumi:"startTls"`
	// Password for test access to OpenLdap service (string)
	TestPassword pulumi.StringOutput `pulumi:"testPassword"`
	// Username for test access to OpenLdap service (string)
	TestUsername pulumi.StringOutput `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls pulumi.BoolOutput `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntOutput `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringOutput `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringOutput `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringOutput `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringOutput `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringOutput `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringOutput `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   pulumi.StringOutput    `pulumi:"userSearchBase"`
	UserSearchFilter pulumi.StringPtrOutput `pulumi:"userSearchFilter"`
}

// NewAuthConfigOpenLdap registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigOpenLdap(ctx *pulumi.Context,
	name string, args *AuthConfigOpenLdapArgs, opts ...pulumi.ResourceOption) (*AuthConfigOpenLdap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Servers == nil {
		return nil, errors.New("invalid value for required argument 'Servers'")
	}
	if args.ServiceAccountDistinguishedName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountDistinguishedName'")
	}
	if args.ServiceAccountPassword == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountPassword'")
	}
	if args.TestPassword == nil {
		return nil, errors.New("invalid value for required argument 'TestPassword'")
	}
	if args.TestUsername == nil {
		return nil, errors.New("invalid value for required argument 'TestUsername'")
	}
	if args.UserSearchBase == nil {
		return nil, errors.New("invalid value for required argument 'UserSearchBase'")
	}
	if args.Certificate != nil {
		args.Certificate = pulumi.ToSecret(args.Certificate).(pulumi.StringPtrInput)
	}
	if args.ServiceAccountDistinguishedName != nil {
		args.ServiceAccountDistinguishedName = pulumi.ToSecret(args.ServiceAccountDistinguishedName).(pulumi.StringInput)
	}
	if args.ServiceAccountPassword != nil {
		args.ServiceAccountPassword = pulumi.ToSecret(args.ServiceAccountPassword).(pulumi.StringInput)
	}
	if args.TestPassword != nil {
		args.TestPassword = pulumi.ToSecret(args.TestPassword).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"certificate",
		"serviceAccountDistinguishedName",
		"serviceAccountPassword",
		"testPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfigOpenLdap
	err := ctx.RegisterResource("rancher2:index/authConfigOpenLdap:AuthConfigOpenLdap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigOpenLdap gets an existing AuthConfigOpenLdap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigOpenLdap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigOpenLdapState, opts ...pulumi.ResourceOption) (*AuthConfigOpenLdap, error) {
	var resource AuthConfigOpenLdap
	err := ctx.ReadResource("rancher2:index/authConfigOpenLdap:AuthConfigOpenLdap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigOpenLdap resources.
type authConfigOpenLdapState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// OpenLdap connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   *string `pulumi:"groupSearchBase"`
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// OpenLdap port. Default `389` (int)
	Port *int `pulumi:"port"`
	// OpenLdap servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access OpenLdap service (string)
	ServiceAccountDistinguishedName *string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access OpenLdap service (string)
	ServiceAccountPassword *string `pulumi:"serviceAccountPassword"`
	StartTls               *bool   `pulumi:"startTls"`
	// Password for test access to OpenLdap service (string)
	TestPassword *string `pulumi:"testPassword"`
	// Username for test access to OpenLdap service (string)
	TestUsername *string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// User disabled bit mask (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute *string `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   *string `pulumi:"userSearchBase"`
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

type AuthConfigOpenLdapState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.StringMapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// OpenLdap connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase   pulumi.StringPtrInput
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.StringMapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// OpenLdap port. Default `389` (int)
	Port pulumi.IntPtrInput
	// OpenLdap servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access OpenLdap service (string)
	ServiceAccountDistinguishedName pulumi.StringPtrInput
	// Service account password for access OpenLdap service (string)
	ServiceAccountPassword pulumi.StringPtrInput
	StartTls               pulumi.BoolPtrInput
	// Password for test access to OpenLdap service (string)
	TestPassword pulumi.StringPtrInput
	// Username for test access to OpenLdap service (string)
	TestUsername pulumi.StringPtrInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringPtrInput
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase   pulumi.StringPtrInput
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigOpenLdapState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigOpenLdapState)(nil)).Elem()
}

type authConfigOpenLdapArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// OpenLdap connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase   *string `pulumi:"groupSearchBase"`
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]string `pulumi:"labels"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// OpenLdap port. Default `389` (int)
	Port *int `pulumi:"port"`
	// OpenLdap servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access OpenLdap service (string)
	ServiceAccountDistinguishedName string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access OpenLdap service (string)
	ServiceAccountPassword string `pulumi:"serviceAccountPassword"`
	StartTls               *bool  `pulumi:"startTls"`
	// Password for test access to OpenLdap service (string)
	TestPassword string `pulumi:"testPassword"`
	// Username for test access to OpenLdap service (string)
	TestUsername string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// User disabled bit mask (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `uid` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute *string `pulumi:"userMemberAttribute"`
	// User name attribute. Default `givenName` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `inetorgperson` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase   string  `pulumi:"userSearchBase"`
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

// The set of arguments for constructing a AuthConfigOpenLdap resource.
type AuthConfigOpenLdapArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.StringMapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// OpenLdap connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `entryDN` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `entryDN` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `cn` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `groupOfNames` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `cn` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase   pulumi.StringPtrInput
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.StringMapInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// OpenLdap port. Default `389` (int)
	Port pulumi.IntPtrInput
	// OpenLdap servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access OpenLdap service (string)
	ServiceAccountDistinguishedName pulumi.StringInput
	// Service account password for access OpenLdap service (string)
	ServiceAccountPassword pulumi.StringInput
	StartTls               pulumi.BoolPtrInput
	// Password for test access to OpenLdap service (string)
	TestPassword pulumi.StringInput
	// Username for test access to OpenLdap service (string)
	TestUsername pulumi.StringInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// User disabled bit mask (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `uid` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User member attribute. Default `memberOf` (string)
	UserMemberAttribute pulumi.StringPtrInput
	// User name attribute. Default `givenName` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `inetorgperson` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `uid|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase   pulumi.StringInput
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigOpenLdapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigOpenLdapArgs)(nil)).Elem()
}

type AuthConfigOpenLdapInput interface {
	pulumi.Input

	ToAuthConfigOpenLdapOutput() AuthConfigOpenLdapOutput
	ToAuthConfigOpenLdapOutputWithContext(ctx context.Context) AuthConfigOpenLdapOutput
}

func (*AuthConfigOpenLdap) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigOpenLdap)(nil)).Elem()
}

func (i *AuthConfigOpenLdap) ToAuthConfigOpenLdapOutput() AuthConfigOpenLdapOutput {
	return i.ToAuthConfigOpenLdapOutputWithContext(context.Background())
}

func (i *AuthConfigOpenLdap) ToAuthConfigOpenLdapOutputWithContext(ctx context.Context) AuthConfigOpenLdapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOpenLdapOutput)
}

// AuthConfigOpenLdapArrayInput is an input type that accepts AuthConfigOpenLdapArray and AuthConfigOpenLdapArrayOutput values.
// You can construct a concrete instance of `AuthConfigOpenLdapArrayInput` via:
//
//	AuthConfigOpenLdapArray{ AuthConfigOpenLdapArgs{...} }
type AuthConfigOpenLdapArrayInput interface {
	pulumi.Input

	ToAuthConfigOpenLdapArrayOutput() AuthConfigOpenLdapArrayOutput
	ToAuthConfigOpenLdapArrayOutputWithContext(context.Context) AuthConfigOpenLdapArrayOutput
}

type AuthConfigOpenLdapArray []AuthConfigOpenLdapInput

func (AuthConfigOpenLdapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigOpenLdap)(nil)).Elem()
}

func (i AuthConfigOpenLdapArray) ToAuthConfigOpenLdapArrayOutput() AuthConfigOpenLdapArrayOutput {
	return i.ToAuthConfigOpenLdapArrayOutputWithContext(context.Background())
}

func (i AuthConfigOpenLdapArray) ToAuthConfigOpenLdapArrayOutputWithContext(ctx context.Context) AuthConfigOpenLdapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOpenLdapArrayOutput)
}

// AuthConfigOpenLdapMapInput is an input type that accepts AuthConfigOpenLdapMap and AuthConfigOpenLdapMapOutput values.
// You can construct a concrete instance of `AuthConfigOpenLdapMapInput` via:
//
//	AuthConfigOpenLdapMap{ "key": AuthConfigOpenLdapArgs{...} }
type AuthConfigOpenLdapMapInput interface {
	pulumi.Input

	ToAuthConfigOpenLdapMapOutput() AuthConfigOpenLdapMapOutput
	ToAuthConfigOpenLdapMapOutputWithContext(context.Context) AuthConfigOpenLdapMapOutput
}

type AuthConfigOpenLdapMap map[string]AuthConfigOpenLdapInput

func (AuthConfigOpenLdapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigOpenLdap)(nil)).Elem()
}

func (i AuthConfigOpenLdapMap) ToAuthConfigOpenLdapMapOutput() AuthConfigOpenLdapMapOutput {
	return i.ToAuthConfigOpenLdapMapOutputWithContext(context.Background())
}

func (i AuthConfigOpenLdapMap) ToAuthConfigOpenLdapMapOutputWithContext(ctx context.Context) AuthConfigOpenLdapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOpenLdapMapOutput)
}

type AuthConfigOpenLdapOutput struct{ *pulumi.OutputState }

func (AuthConfigOpenLdapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigOpenLdap)(nil)).Elem()
}

func (o AuthConfigOpenLdapOutput) ToAuthConfigOpenLdapOutput() AuthConfigOpenLdapOutput {
	return o
}

func (o AuthConfigOpenLdapOutput) ToAuthConfigOpenLdapOutputWithContext(ctx context.Context) AuthConfigOpenLdapOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigOpenLdapOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
func (o AuthConfigOpenLdapOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigOpenLdapOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
func (o AuthConfigOpenLdapOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringPtrOutput { return v.Certificate }).(pulumi.StringPtrOutput)
}

// OpenLdap connection timeout. Default `5000` (int)
func (o AuthConfigOpenLdapOutput) ConnectionTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.IntPtrOutput { return v.ConnectionTimeout }).(pulumi.IntPtrOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigOpenLdapOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Group DN attribute. Default `entryDN` (string)
func (o AuthConfigOpenLdapOutput) GroupDnAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupDnAttribute }).(pulumi.StringOutput)
}

// Group member mapping attribute. Default `member` (string)
func (o AuthConfigOpenLdapOutput) GroupMemberMappingAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupMemberMappingAttribute }).(pulumi.StringOutput)
}

// Group member user attribute. Default `entryDN` (string)
func (o AuthConfigOpenLdapOutput) GroupMemberUserAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupMemberUserAttribute }).(pulumi.StringOutput)
}

// Group name attribute. Default `cn` (string)
func (o AuthConfigOpenLdapOutput) GroupNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupNameAttribute }).(pulumi.StringOutput)
}

// Group object class. Default `groupOfNames` (string)
func (o AuthConfigOpenLdapOutput) GroupObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupObjectClass }).(pulumi.StringOutput)
}

// Group search attribute. Default `cn` (string)
func (o AuthConfigOpenLdapOutput) GroupSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupSearchAttribute }).(pulumi.StringOutput)
}

// Group search base (string)
func (o AuthConfigOpenLdapOutput) GroupSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.GroupSearchBase }).(pulumi.StringOutput)
}

func (o AuthConfigOpenLdapOutput) GroupSearchFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringPtrOutput { return v.GroupSearchFilter }).(pulumi.StringPtrOutput)
}

// Labels of the resource (map)
func (o AuthConfigOpenLdapOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigOpenLdapOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Nested group membership enable. Default `false` (bool)
func (o AuthConfigOpenLdapOutput) NestedGroupMembershipEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.BoolOutput { return v.NestedGroupMembershipEnabled }).(pulumi.BoolOutput)
}

// OpenLdap port. Default `389` (int)
func (o AuthConfigOpenLdapOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// OpenLdap servers list (list)
func (o AuthConfigOpenLdapOutput) Servers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringArrayOutput { return v.Servers }).(pulumi.StringArrayOutput)
}

// Service account DN for access OpenLdap service (string)
func (o AuthConfigOpenLdapOutput) ServiceAccountDistinguishedName() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.ServiceAccountDistinguishedName }).(pulumi.StringOutput)
}

// Service account password for access OpenLdap service (string)
func (o AuthConfigOpenLdapOutput) ServiceAccountPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.ServiceAccountPassword }).(pulumi.StringOutput)
}

func (o AuthConfigOpenLdapOutput) StartTls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.BoolOutput { return v.StartTls }).(pulumi.BoolOutput)
}

// Password for test access to OpenLdap service (string)
func (o AuthConfigOpenLdapOutput) TestPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.TestPassword }).(pulumi.StringOutput)
}

// Username for test access to OpenLdap service (string)
func (o AuthConfigOpenLdapOutput) TestUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.TestUsername }).(pulumi.StringOutput)
}

// Enable TLS connection (bool)
func (o AuthConfigOpenLdapOutput) Tls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.BoolOutput { return v.Tls }).(pulumi.BoolOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigOpenLdapOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User disabled bit mask (int)
func (o AuthConfigOpenLdapOutput) UserDisabledBitMask() pulumi.IntOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.IntOutput { return v.UserDisabledBitMask }).(pulumi.IntOutput)
}

// User enable attribute (string)
func (o AuthConfigOpenLdapOutput) UserEnabledAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserEnabledAttribute }).(pulumi.StringOutput)
}

// User login attribute. Default `uid` (string)
func (o AuthConfigOpenLdapOutput) UserLoginAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserLoginAttribute }).(pulumi.StringOutput)
}

// User member attribute. Default `memberOf` (string)
func (o AuthConfigOpenLdapOutput) UserMemberAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserMemberAttribute }).(pulumi.StringOutput)
}

// User name attribute. Default `givenName` (string)
func (o AuthConfigOpenLdapOutput) UserNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserNameAttribute }).(pulumi.StringOutput)
}

// User object class. Default `inetorgperson` (string)
func (o AuthConfigOpenLdapOutput) UserObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserObjectClass }).(pulumi.StringOutput)
}

// User search attribute. Default `uid|sn|givenName` (string)
func (o AuthConfigOpenLdapOutput) UserSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserSearchAttribute }).(pulumi.StringOutput)
}

// User search base DN (string)
func (o AuthConfigOpenLdapOutput) UserSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringOutput { return v.UserSearchBase }).(pulumi.StringOutput)
}

func (o AuthConfigOpenLdapOutput) UserSearchFilter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigOpenLdap) pulumi.StringPtrOutput { return v.UserSearchFilter }).(pulumi.StringPtrOutput)
}

type AuthConfigOpenLdapArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigOpenLdapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigOpenLdap)(nil)).Elem()
}

func (o AuthConfigOpenLdapArrayOutput) ToAuthConfigOpenLdapArrayOutput() AuthConfigOpenLdapArrayOutput {
	return o
}

func (o AuthConfigOpenLdapArrayOutput) ToAuthConfigOpenLdapArrayOutputWithContext(ctx context.Context) AuthConfigOpenLdapArrayOutput {
	return o
}

func (o AuthConfigOpenLdapArrayOutput) Index(i pulumi.IntInput) AuthConfigOpenLdapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigOpenLdap {
		return vs[0].([]*AuthConfigOpenLdap)[vs[1].(int)]
	}).(AuthConfigOpenLdapOutput)
}

type AuthConfigOpenLdapMapOutput struct{ *pulumi.OutputState }

func (AuthConfigOpenLdapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigOpenLdap)(nil)).Elem()
}

func (o AuthConfigOpenLdapMapOutput) ToAuthConfigOpenLdapMapOutput() AuthConfigOpenLdapMapOutput {
	return o
}

func (o AuthConfigOpenLdapMapOutput) ToAuthConfigOpenLdapMapOutputWithContext(ctx context.Context) AuthConfigOpenLdapMapOutput {
	return o
}

func (o AuthConfigOpenLdapMapOutput) MapIndex(k pulumi.StringInput) AuthConfigOpenLdapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigOpenLdap {
		return vs[0].(map[string]*AuthConfigOpenLdap)[vs[1].(string)]
	}).(AuthConfigOpenLdapOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOpenLdapInput)(nil)).Elem(), &AuthConfigOpenLdap{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOpenLdapArrayInput)(nil)).Elem(), AuthConfigOpenLdapArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOpenLdapMapInput)(nil)).Elem(), AuthConfigOpenLdapMap{})
	pulumi.RegisterOutputType(AuthConfigOpenLdapOutput{})
	pulumi.RegisterOutputType(AuthConfigOpenLdapArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigOpenLdapMapOutput{})
}
