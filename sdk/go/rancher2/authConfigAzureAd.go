// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Auth Config AzureAD resource. This can be used to configure and enable Auth Config AzureAD for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewAuthConfigAzureAd(ctx, "azuread", &rancher2.AuthConfigAzureAdArgs{
// 			ApplicationId:     pulumi.String("<AZUREAD_APP_ID>"),
// 			ApplicationSecret: pulumi.String("<AZUREAD_APP_SECRET>"),
// 			AuthEndpoint:      pulumi.String("<AZUREAD_AUTH_ENDPOINT>"),
// 			GraphEndpoint:     pulumi.String("<AZUREAD_GRAPH_ENDPOINT>"),
// 			RancherUrl:        pulumi.String("<RANCHER_URL>"),
// 			TenantId:          pulumi.String("<AZUREAD_TENANT_ID>"),
// 			TokenEndpoint:     pulumi.String("<AZUREAD_TOKEN_ENDPOINT>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AuthConfigAzureAd struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringOutput `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringOutput `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringOutput `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringOutput `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringOutput `pulumi:"tokenEndpoint"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAuthConfigAzureAd registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigAzureAd(ctx *pulumi.Context,
	name string, args *AuthConfigAzureAdArgs, opts ...pulumi.ResourceOption) (*AuthConfigAzureAd, error) {
	if args == nil || args.ApplicationId == nil {
		return nil, errors.New("missing required argument 'ApplicationId'")
	}
	if args == nil || args.ApplicationSecret == nil {
		return nil, errors.New("missing required argument 'ApplicationSecret'")
	}
	if args == nil || args.AuthEndpoint == nil {
		return nil, errors.New("missing required argument 'AuthEndpoint'")
	}
	if args == nil || args.GraphEndpoint == nil {
		return nil, errors.New("missing required argument 'GraphEndpoint'")
	}
	if args == nil || args.RancherUrl == nil {
		return nil, errors.New("missing required argument 'RancherUrl'")
	}
	if args == nil || args.TenantId == nil {
		return nil, errors.New("missing required argument 'TenantId'")
	}
	if args == nil || args.TokenEndpoint == nil {
		return nil, errors.New("missing required argument 'TokenEndpoint'")
	}
	if args == nil {
		args = &AuthConfigAzureAdArgs{}
	}
	var resource AuthConfigAzureAd
	err := ctx.RegisterResource("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigAzureAd gets an existing AuthConfigAzureAd resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigAzureAd(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigAzureAdState, opts ...pulumi.ResourceOption) (*AuthConfigAzureAd, error) {
	var resource AuthConfigAzureAd
	err := ctx.ReadResource("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigAzureAd resources.
type authConfigAzureAdState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId *string `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret *string `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint *string `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint *string `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint *string `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl *string `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId *string `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint *string `pulumi:"tokenEndpoint"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
}

type AuthConfigAzureAdState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringPtrInput
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringPtrInput
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrInput
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringPtrInput
	// AzureAD tenant ID (string)
	TenantId pulumi.StringPtrInput
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
}

func (AuthConfigAzureAdState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAzureAdState)(nil)).Elem()
}

type authConfigAzureAdArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId string `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret string `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint string `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint *string `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint string `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl string `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId string `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint string `pulumi:"tokenEndpoint"`
}

// The set of arguments for constructing a AuthConfigAzureAd resource.
type AuthConfigAzureAdArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringInput
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringInput
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrInput
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringInput
	// AzureAD tenant ID (string)
	TenantId pulumi.StringInput
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringInput
}

func (AuthConfigAzureAdArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAzureAdArgs)(nil)).Elem()
}
