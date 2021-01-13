// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Auth Config FreeIpa resource. This can be used to configure and enable Auth Config FreeIpa for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type AuthConfigFreeIpa struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrOutput `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
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
	GroupSearchBase pulumi.StringOutput `pulumi:"groupSearchBase"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolOutput `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayOutput `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringOutput `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringOutput `pulumi:"serviceAccountPassword"`
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringOutput `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
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
	UserSearchBase pulumi.StringOutput `pulumi:"userSearchBase"`
}

// NewAuthConfigFreeIpa registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigFreeIpa(ctx *pulumi.Context,
	name string, args *AuthConfigFreeIpaArgs, opts ...pulumi.ResourceOption) (*AuthConfigFreeIpa, error) {
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
	var resource AuthConfigFreeIpa
	err := ctx.RegisterResource("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigFreeIpa gets an existing AuthConfigFreeIpa resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigFreeIpa(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigFreeIpaState, opts ...pulumi.ResourceOption) (*AuthConfigFreeIpa, error) {
	var resource AuthConfigFreeIpa
	err := ctx.ReadResource("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigFreeIpa resources.
type authConfigFreeIpaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
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
	GroupSearchBase *string `pulumi:"groupSearchBase"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port *int `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName *string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword *string `pulumi:"serviceAccountPassword"`
	// Password for test access to FreeIpa service (string)
	TestPassword *string `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
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
	UserSearchBase *string `pulumi:"userSearchBase"`
}

type AuthConfigFreeIpaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// FreeIpa connection timeout. Default `5000` (int)
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
	GroupSearchBase pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrInput
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringPtrInput
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringPtrInput
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringPtrInput
	// Username for test access to FreeIpa service (string)
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
	UserSearchBase pulumi.StringPtrInput
}

func (AuthConfigFreeIpaState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigFreeIpaState)(nil)).Elem()
}

type authConfigFreeIpaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate *string `pulumi:"certificate"`
	// FreeIpa connection timeout. Default `5000` (int)
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
	GroupSearchBase *string `pulumi:"groupSearchBase"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// FreeIpa port. Default `389` (int)
	Port *int `pulumi:"port"`
	// FreeIpa servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName string `pulumi:"serviceAccountDistinguishedName"`
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword string `pulumi:"serviceAccountPassword"`
	// Password for test access to FreeIpa service (string)
	TestPassword string `pulumi:"testPassword"`
	// Username for test access to FreeIpa service (string)
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
	UserSearchBase string `pulumi:"userSearchBase"`
}

// The set of arguments for constructing a AuthConfigFreeIpa resource.
type AuthConfigFreeIpaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
	Certificate pulumi.StringPtrInput
	// FreeIpa connection timeout. Default `5000` (int)
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
	GroupSearchBase pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// FreeIpa port. Default `389` (int)
	Port pulumi.IntPtrInput
	// FreeIpa servers list (list)
	Servers pulumi.StringArrayInput
	// Service account DN for access FreeIpa service (string)
	ServiceAccountDistinguishedName pulumi.StringInput
	// Service account password for access FreeIpa service (string)
	ServiceAccountPassword pulumi.StringInput
	// Password for test access to FreeIpa service (string)
	TestPassword pulumi.StringInput
	// Username for test access to FreeIpa service (string)
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
	UserSearchBase pulumi.StringInput
}

func (AuthConfigFreeIpaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigFreeIpaArgs)(nil)).Elem()
}

type AuthConfigFreeIpaInput interface {
	pulumi.Input

	ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput
	ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput
}

func (AuthConfigFreeIpa) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthConfigFreeIpa)(nil)).Elem()
}

func (i AuthConfigFreeIpa) ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput {
	return i.ToAuthConfigFreeIpaOutputWithContext(context.Background())
}

func (i AuthConfigFreeIpa) ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigFreeIpaOutput)
}

type AuthConfigFreeIpaOutput struct {
	*pulumi.OutputState
}

func (AuthConfigFreeIpaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthConfigFreeIpaOutput)(nil)).Elem()
}

func (o AuthConfigFreeIpaOutput) ToAuthConfigFreeIpaOutput() AuthConfigFreeIpaOutput {
	return o
}

func (o AuthConfigFreeIpaOutput) ToAuthConfigFreeIpaOutputWithContext(ctx context.Context) AuthConfigFreeIpaOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AuthConfigFreeIpaOutput{})
}
