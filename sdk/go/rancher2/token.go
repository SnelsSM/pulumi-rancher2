// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Token resource. This can be used to create Tokens for Rancher v2 provider user and retrieve their information.
//
// There are 2 kind of tokens:
// - no scoped: valid for global system.
// - scoped: valid for just a specific cluster (`clusterId` should be provided).
//
// Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewToken(ctx, "foo", &rancher2.TokenArgs{
// 			ClusterId:   pulumi.String("<cluster-id>"),
// 			Description: pulumi.String("foo token"),
// 			Ttl:         pulumi.Int(1200),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Token struct {
	pulumi.CustomResourceState

	// (Computed) Token access key part (string)
	AccessKey pulumi.StringOutput `pulumi:"accessKey"`
	// (Computed) Annotations of the token (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Cluster ID for scoped token (string)
	ClusterId pulumi.StringPtrOutput `pulumi:"clusterId"`
	// Token description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// (Computed) Token is enabled (bool)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// (Computed) Token is expired (bool)
	Expired pulumi.BoolOutput `pulumi:"expired"`
	// (Computed) Labels of the token (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) Token name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Renew expired or disabled token
	Renew pulumi.BoolPtrOutput `pulumi:"renew"`
	// (Computed/Sensitive) Token secret key part (string)
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
	// (Computed/Sensitive) Token value (string)
	Token pulumi.StringOutput `pulumi:"token"`
	// Token time to live in seconds. Default `0` (int)
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
	// (Computed) Token user ID (string)
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewToken registers a new resource with the given unique name, arguments, and options.
func NewToken(ctx *pulumi.Context,
	name string, args *TokenArgs, opts ...pulumi.ResourceOption) (*Token, error) {
	if args == nil {
		args = &TokenArgs{}
	}

	var resource Token
	err := ctx.RegisterResource("rancher2:index/token:Token", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetToken gets an existing Token resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TokenState, opts ...pulumi.ResourceOption) (*Token, error) {
	var resource Token
	err := ctx.ReadResource("rancher2:index/token:Token", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Token resources.
type tokenState struct {
	// (Computed) Token access key part (string)
	AccessKey *string `pulumi:"accessKey"`
	// (Computed) Annotations of the token (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster ID for scoped token (string)
	ClusterId *string `pulumi:"clusterId"`
	// Token description (string)
	Description *string `pulumi:"description"`
	// (Computed) Token is enabled (bool)
	Enabled *bool `pulumi:"enabled"`
	// (Computed) Token is expired (bool)
	Expired *bool `pulumi:"expired"`
	// (Computed) Labels of the token (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) Token name (string)
	Name *string `pulumi:"name"`
	// Renew expired or disabled token
	Renew *bool `pulumi:"renew"`
	// (Computed/Sensitive) Token secret key part (string)
	SecretKey *string `pulumi:"secretKey"`
	// (Computed/Sensitive) Token value (string)
	Token *string `pulumi:"token"`
	// Token time to live in seconds. Default `0` (int)
	Ttl *int `pulumi:"ttl"`
	// (Computed) Token user ID (string)
	UserId *string `pulumi:"userId"`
}

type TokenState struct {
	// (Computed) Token access key part (string)
	AccessKey pulumi.StringPtrInput
	// (Computed) Annotations of the token (map)
	Annotations pulumi.MapInput
	// Cluster ID for scoped token (string)
	ClusterId pulumi.StringPtrInput
	// Token description (string)
	Description pulumi.StringPtrInput
	// (Computed) Token is enabled (bool)
	Enabled pulumi.BoolPtrInput
	// (Computed) Token is expired (bool)
	Expired pulumi.BoolPtrInput
	// (Computed) Labels of the token (map)
	Labels pulumi.MapInput
	// (Computed) Token name (string)
	Name pulumi.StringPtrInput
	// Renew expired or disabled token
	Renew pulumi.BoolPtrInput
	// (Computed/Sensitive) Token secret key part (string)
	SecretKey pulumi.StringPtrInput
	// (Computed/Sensitive) Token value (string)
	Token pulumi.StringPtrInput
	// Token time to live in seconds. Default `0` (int)
	Ttl pulumi.IntPtrInput
	// (Computed) Token user ID (string)
	UserId pulumi.StringPtrInput
}

func (TokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenState)(nil)).Elem()
}

type tokenArgs struct {
	// (Computed) Annotations of the token (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster ID for scoped token (string)
	ClusterId *string `pulumi:"clusterId"`
	// Token description (string)
	Description *string `pulumi:"description"`
	// (Computed) Labels of the token (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Renew expired or disabled token
	Renew *bool `pulumi:"renew"`
	// Token time to live in seconds. Default `0` (int)
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a Token resource.
type TokenArgs struct {
	// (Computed) Annotations of the token (map)
	Annotations pulumi.MapInput
	// Cluster ID for scoped token (string)
	ClusterId pulumi.StringPtrInput
	// Token description (string)
	Description pulumi.StringPtrInput
	// (Computed) Labels of the token (map)
	Labels pulumi.MapInput
	// Renew expired or disabled token
	Renew pulumi.BoolPtrInput
	// Token time to live in seconds. Default `0` (int)
	Ttl pulumi.IntPtrInput
}

func (TokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenArgs)(nil)).Elem()
}

type TokenInput interface {
	pulumi.Input

	ToTokenOutput() TokenOutput
	ToTokenOutputWithContext(ctx context.Context) TokenOutput
}

func (*Token) ElementType() reflect.Type {
	return reflect.TypeOf((*Token)(nil))
}

func (i *Token) ToTokenOutput() TokenOutput {
	return i.ToTokenOutputWithContext(context.Background())
}

func (i *Token) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenOutput)
}

func (i *Token) ToTokenPtrOutput() TokenPtrOutput {
	return i.ToTokenPtrOutputWithContext(context.Background())
}

func (i *Token) ToTokenPtrOutputWithContext(ctx context.Context) TokenPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenPtrOutput)
}

type TokenPtrInput interface {
	pulumi.Input

	ToTokenPtrOutput() TokenPtrOutput
	ToTokenPtrOutputWithContext(ctx context.Context) TokenPtrOutput
}

type tokenPtrType TokenArgs

func (*tokenPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil))
}

func (i *tokenPtrType) ToTokenPtrOutput() TokenPtrOutput {
	return i.ToTokenPtrOutputWithContext(context.Background())
}

func (i *tokenPtrType) ToTokenPtrOutputWithContext(ctx context.Context) TokenPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenPtrOutput)
}

// TokenArrayInput is an input type that accepts TokenArray and TokenArrayOutput values.
// You can construct a concrete instance of `TokenArrayInput` via:
//
//          TokenArray{ TokenArgs{...} }
type TokenArrayInput interface {
	pulumi.Input

	ToTokenArrayOutput() TokenArrayOutput
	ToTokenArrayOutputWithContext(context.Context) TokenArrayOutput
}

type TokenArray []TokenInput

func (TokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Token)(nil)).Elem()
}

func (i TokenArray) ToTokenArrayOutput() TokenArrayOutput {
	return i.ToTokenArrayOutputWithContext(context.Background())
}

func (i TokenArray) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenArrayOutput)
}

// TokenMapInput is an input type that accepts TokenMap and TokenMapOutput values.
// You can construct a concrete instance of `TokenMapInput` via:
//
//          TokenMap{ "key": TokenArgs{...} }
type TokenMapInput interface {
	pulumi.Input

	ToTokenMapOutput() TokenMapOutput
	ToTokenMapOutputWithContext(context.Context) TokenMapOutput
}

type TokenMap map[string]TokenInput

func (TokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Token)(nil)).Elem()
}

func (i TokenMap) ToTokenMapOutput() TokenMapOutput {
	return i.ToTokenMapOutputWithContext(context.Background())
}

func (i TokenMap) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenMapOutput)
}

type TokenOutput struct{ *pulumi.OutputState }

func (TokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Token)(nil))
}

func (o TokenOutput) ToTokenOutput() TokenOutput {
	return o
}

func (o TokenOutput) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return o
}

func (o TokenOutput) ToTokenPtrOutput() TokenPtrOutput {
	return o.ToTokenPtrOutputWithContext(context.Background())
}

func (o TokenOutput) ToTokenPtrOutputWithContext(ctx context.Context) TokenPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Token) *Token {
		return &v
	}).(TokenPtrOutput)
}

type TokenPtrOutput struct{ *pulumi.OutputState }

func (TokenPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil))
}

func (o TokenPtrOutput) ToTokenPtrOutput() TokenPtrOutput {
	return o
}

func (o TokenPtrOutput) ToTokenPtrOutputWithContext(ctx context.Context) TokenPtrOutput {
	return o
}

func (o TokenPtrOutput) Elem() TokenOutput {
	return o.ApplyT(func(v *Token) Token {
		if v != nil {
			return *v
		}
		var ret Token
		return ret
	}).(TokenOutput)
}

type TokenArrayOutput struct{ *pulumi.OutputState }

func (TokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Token)(nil))
}

func (o TokenArrayOutput) ToTokenArrayOutput() TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) Index(i pulumi.IntInput) TokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Token {
		return vs[0].([]Token)[vs[1].(int)]
	}).(TokenOutput)
}

type TokenMapOutput struct{ *pulumi.OutputState }

func (TokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Token)(nil))
}

func (o TokenMapOutput) ToTokenMapOutput() TokenMapOutput {
	return o
}

func (o TokenMapOutput) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return o
}

func (o TokenMapOutput) MapIndex(k pulumi.StringInput) TokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Token {
		return vs[0].(map[string]Token)[vs[1].(string)]
	}).(TokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TokenInput)(nil)).Elem(), &Token{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenPtrInput)(nil)).Elem(), &Token{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenArrayInput)(nil)).Elem(), TokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenMapInput)(nil)).Elem(), TokenMap{})
	pulumi.RegisterOutputType(TokenOutput{})
	pulumi.RegisterOutputType(TokenPtrOutput{})
	pulumi.RegisterOutputType(TokenArrayOutput{})
	pulumi.RegisterOutputType(TokenMapOutput{})
}
