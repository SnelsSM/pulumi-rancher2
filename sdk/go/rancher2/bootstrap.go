// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Bootstrap struct {
	pulumi.CustomResourceState

	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringOutput `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringOutput `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrOutput `pulumi:"telemetry"`
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken pulumi.StringOutput `pulumi:"tempToken"`
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId pulumi.StringOutput `pulumi:"tempTokenId"`
	// (Computed) Generated API token for Admin User (string)
	Token pulumi.StringOutput `pulumi:"token"`
	// (Computed) Generated API token id for Admin User (string)
	TokenId pulumi.StringOutput `pulumi:"tokenId"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrOutput `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrOutput `pulumi:"tokenUpdate"`
	// (Computed) URL set as server-url (string)
	Url pulumi.StringOutput `pulumi:"url"`
	// (Computed) Admin username (string)
	User pulumi.StringOutput `pulumi:"user"`
}

// NewBootstrap registers a new resource with the given unique name, arguments, and options.
func NewBootstrap(ctx *pulumi.Context,
	name string, args *BootstrapArgs, opts ...pulumi.ResourceOption) (*Bootstrap, error) {
	if args == nil {
		args = &BootstrapArgs{}
	}
	var resource Bootstrap
	err := ctx.RegisterResource("rancher2:index/bootstrap:Bootstrap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBootstrap gets an existing Bootstrap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBootstrap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BootstrapState, opts ...pulumi.ResourceOption) (*Bootstrap, error) {
	var resource Bootstrap
	err := ctx.ReadResource("rancher2:index/bootstrap:Bootstrap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Bootstrap resources.
type bootstrapState struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword *string `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password *string `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry *bool `pulumi:"telemetry"`
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken *string `pulumi:"tempToken"`
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId *string `pulumi:"tempTokenId"`
	// (Computed) Generated API token for Admin User (string)
	Token *string `pulumi:"token"`
	// (Computed) Generated API token id for Admin User (string)
	TokenId *string `pulumi:"tokenId"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl *int `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate *bool `pulumi:"tokenUpdate"`
	// (Computed) URL set as server-url (string)
	Url *string `pulumi:"url"`
	// (Computed) Admin username (string)
	User *string `pulumi:"user"`
}

type BootstrapState struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringPtrInput
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringPtrInput
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrInput
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken pulumi.StringPtrInput
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId pulumi.StringPtrInput
	// (Computed) Generated API token for Admin User (string)
	Token pulumi.StringPtrInput
	// (Computed) Generated API token id for Admin User (string)
	TokenId pulumi.StringPtrInput
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrInput
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrInput
	// (Computed) URL set as server-url (string)
	Url pulumi.StringPtrInput
	// (Computed) Admin username (string)
	User pulumi.StringPtrInput
}

func (BootstrapState) ElementType() reflect.Type {
	return reflect.TypeOf((*bootstrapState)(nil)).Elem()
}

type bootstrapArgs struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword *string `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password *string `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry *bool `pulumi:"telemetry"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl *int `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate *bool `pulumi:"tokenUpdate"`
}

// The set of arguments for constructing a Bootstrap resource.
type BootstrapArgs struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringPtrInput
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringPtrInput
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrInput
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrInput
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrInput
}

func (BootstrapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bootstrapArgs)(nil)).Elem()
}
