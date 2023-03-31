// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 User resource. This can be used to create Users for Rancher v2 environments and retrieve their information.
//
// When a Rancher User is created, it doesn't have a global role binding. At least, `user-base` global role binding in needed in order to enable user login.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooUser, err := rancher2.NewUser(ctx, "fooUser", &rancher2.UserArgs{
//				Username: pulumi.String("foo"),
//				Password: pulumi.String("changeme"),
//				Enabled:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewGlobalRoleBinding(ctx, "fooGlobalRoleBinding", &rancher2.GlobalRoleBindingArgs{
//				GlobalRoleId: pulumi.String("user-base"),
//				UserId:       fooUser.ID(),
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
// # Users can be imported using the Rancher User ID
//
// ```sh
//
//	$ pulumi import rancher2:index/user:User foo &lt;user_id&gt;
//
// ```
type User struct {
	pulumi.CustomResourceState

	// Annotations for global role binding (map)
	Annotations pulumi.MapOutput     `pulumi:"annotations"`
	Enabled     pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Labels for global role binding (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The user full name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The user password (string)
	Password pulumi.StringOutput `pulumi:"password"`
	// (Computed) The user principal IDs (list)
	PrincipalIds pulumi.StringArrayOutput `pulumi:"principalIds"`
	// The user username (string)
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	var resource User
	err := ctx.RegisterResource("rancher2:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("rancher2:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	Enabled     *bool                  `pulumi:"enabled"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The user full name (string)
	Name *string `pulumi:"name"`
	// The user password (string)
	Password *string `pulumi:"password"`
	// (Computed) The user principal IDs (list)
	PrincipalIds []string `pulumi:"principalIds"`
	// The user username (string)
	Username *string `pulumi:"username"`
}

type UserState struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	Enabled     pulumi.BoolPtrInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The user full name (string)
	Name pulumi.StringPtrInput
	// The user password (string)
	Password pulumi.StringPtrInput
	// (Computed) The user principal IDs (list)
	PrincipalIds pulumi.StringArrayInput
	// The user username (string)
	Username pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	Enabled     *bool                  `pulumi:"enabled"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The user full name (string)
	Name *string `pulumi:"name"`
	// The user password (string)
	Password string `pulumi:"password"`
	// The user username (string)
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	Enabled     pulumi.BoolPtrInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The user full name (string)
	Name pulumi.StringPtrInput
	// The user password (string)
	Password pulumi.StringInput
	// The user username (string)
	Username pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// Annotations for global role binding (map)
func (o UserOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *User) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

func (o UserOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Labels for global role binding (map)
func (o UserOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *User) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The user full name (string)
func (o UserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The user password (string)
func (o UserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// (Computed) The user principal IDs (list)
func (o UserOutput) PrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.PrincipalIds }).(pulumi.StringArrayOutput)
}

// The user username (string)
func (o UserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
