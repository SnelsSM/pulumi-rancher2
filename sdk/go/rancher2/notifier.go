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

// Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.
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
//			_, err := rancher2.NewNotifier(ctx, "foo", &rancher2.NotifierArgs{
//				ClusterId:   pulumi.String("<cluster_id>"),
//				Description: pulumi.String("Terraform notifier acceptance test"),
//				PagerdutyConfig: &rancher2.NotifierPagerdutyConfigArgs{
//					ProxyUrl:   pulumi.String("http://proxy.test.io"),
//					ServiceKey: pulumi.String("XXXXXXXX"),
//				},
//				SendResolved: pulumi.Bool(true),
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
// # Notifiers can be imported using the Rancher nNtifier ID
//
// ```sh
//
//	$ pulumi import rancher2:index/notifier:Notifier foo &lt;notifier_id&gt;
//
// ```
type Notifier struct {
	pulumi.CustomResourceState

	// Annotations for notifier object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The notifier description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrOutput `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrOutput `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrOutput `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrOutput `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrOutput `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrOutput `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrOutput `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrOutput `pulumi:"wechatConfig"`
}

// NewNotifier registers a new resource with the given unique name, arguments, and options.
func NewNotifier(ctx *pulumi.Context,
	name string, args *NotifierArgs, opts ...pulumi.ResourceOption) (*Notifier, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Notifier
	err := ctx.RegisterResource("rancher2:index/notifier:Notifier", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotifier gets an existing Notifier resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotifier(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotifierState, opts ...pulumi.ResourceOption) (*Notifier, error) {
	var resource Notifier
	err := ctx.ReadResource("rancher2:index/notifier:Notifier", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Notifier resources.
type notifierState struct {
	// Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId *string `pulumi:"clusterId"`
	// The notifier description (string)
	Description *string `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *NotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *NotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name *string `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved *bool `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig *NotifierSlackConfig `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig *NotifierSmtpConfig `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig *NotifierWechatConfig `pulumi:"wechatConfig"`
}

type NotifierState struct {
	// Annotations for notifier object (map)
	Annotations pulumi.MapInput
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringPtrInput
	// The notifier description (string)
	Description pulumi.StringPtrInput
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrInput
	// Labels for notifier object (map)
	Labels pulumi.MapInput
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrInput
	// The name of the notifier (string)
	Name pulumi.StringPtrInput
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrInput
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrInput
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrInput
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrInput
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrInput
}

func (NotifierState) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierState)(nil)).Elem()
}

type notifierArgs struct {
	// Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId string `pulumi:"clusterId"`
	// The notifier description (string)
	Description *string `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *NotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *NotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name *string `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved *bool `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig *NotifierSlackConfig `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig *NotifierSmtpConfig `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig *NotifierWechatConfig `pulumi:"wechatConfig"`
}

// The set of arguments for constructing a Notifier resource.
type NotifierArgs struct {
	// Annotations for notifier object (map)
	Annotations pulumi.MapInput
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringInput
	// The notifier description (string)
	Description pulumi.StringPtrInput
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrInput
	// Labels for notifier object (map)
	Labels pulumi.MapInput
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrInput
	// The name of the notifier (string)
	Name pulumi.StringPtrInput
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrInput
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrInput
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrInput
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrInput
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrInput
}

func (NotifierArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierArgs)(nil)).Elem()
}

type NotifierInput interface {
	pulumi.Input

	ToNotifierOutput() NotifierOutput
	ToNotifierOutputWithContext(ctx context.Context) NotifierOutput
}

func (*Notifier) ElementType() reflect.Type {
	return reflect.TypeOf((**Notifier)(nil)).Elem()
}

func (i *Notifier) ToNotifierOutput() NotifierOutput {
	return i.ToNotifierOutputWithContext(context.Background())
}

func (i *Notifier) ToNotifierOutputWithContext(ctx context.Context) NotifierOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotifierOutput)
}

func (i *Notifier) ToOutput(ctx context.Context) pulumix.Output[*Notifier] {
	return pulumix.Output[*Notifier]{
		OutputState: i.ToNotifierOutputWithContext(ctx).OutputState,
	}
}

// NotifierArrayInput is an input type that accepts NotifierArray and NotifierArrayOutput values.
// You can construct a concrete instance of `NotifierArrayInput` via:
//
//	NotifierArray{ NotifierArgs{...} }
type NotifierArrayInput interface {
	pulumi.Input

	ToNotifierArrayOutput() NotifierArrayOutput
	ToNotifierArrayOutputWithContext(context.Context) NotifierArrayOutput
}

type NotifierArray []NotifierInput

func (NotifierArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Notifier)(nil)).Elem()
}

func (i NotifierArray) ToNotifierArrayOutput() NotifierArrayOutput {
	return i.ToNotifierArrayOutputWithContext(context.Background())
}

func (i NotifierArray) ToNotifierArrayOutputWithContext(ctx context.Context) NotifierArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotifierArrayOutput)
}

func (i NotifierArray) ToOutput(ctx context.Context) pulumix.Output[[]*Notifier] {
	return pulumix.Output[[]*Notifier]{
		OutputState: i.ToNotifierArrayOutputWithContext(ctx).OutputState,
	}
}

// NotifierMapInput is an input type that accepts NotifierMap and NotifierMapOutput values.
// You can construct a concrete instance of `NotifierMapInput` via:
//
//	NotifierMap{ "key": NotifierArgs{...} }
type NotifierMapInput interface {
	pulumi.Input

	ToNotifierMapOutput() NotifierMapOutput
	ToNotifierMapOutputWithContext(context.Context) NotifierMapOutput
}

type NotifierMap map[string]NotifierInput

func (NotifierMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Notifier)(nil)).Elem()
}

func (i NotifierMap) ToNotifierMapOutput() NotifierMapOutput {
	return i.ToNotifierMapOutputWithContext(context.Background())
}

func (i NotifierMap) ToNotifierMapOutputWithContext(ctx context.Context) NotifierMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotifierMapOutput)
}

func (i NotifierMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Notifier] {
	return pulumix.Output[map[string]*Notifier]{
		OutputState: i.ToNotifierMapOutputWithContext(ctx).OutputState,
	}
}

type NotifierOutput struct{ *pulumi.OutputState }

func (NotifierOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Notifier)(nil)).Elem()
}

func (o NotifierOutput) ToNotifierOutput() NotifierOutput {
	return o
}

func (o NotifierOutput) ToNotifierOutputWithContext(ctx context.Context) NotifierOutput {
	return o
}

func (o NotifierOutput) ToOutput(ctx context.Context) pulumix.Output[*Notifier] {
	return pulumix.Output[*Notifier]{
		OutputState: o.OutputState,
	}
}

// Annotations for notifier object (map)
func (o NotifierOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *Notifier) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The cluster id where create notifier (string)
func (o NotifierOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Notifier) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The notifier description (string)
func (o NotifierOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Notifier) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Dingtalk config for notifier (list maxitems:1)
func (o NotifierOutput) DingtalkConfig() NotifierDingtalkConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierDingtalkConfigPtrOutput { return v.DingtalkConfig }).(NotifierDingtalkConfigPtrOutput)
}

// Labels for notifier object (map)
func (o NotifierOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Notifier) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// MSTeams config for notifier (list maxitems:1)
func (o NotifierOutput) MsteamsConfig() NotifierMsteamsConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierMsteamsConfigPtrOutput { return v.MsteamsConfig }).(NotifierMsteamsConfigPtrOutput)
}

// The name of the notifier (string)
func (o NotifierOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Notifier) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Pagerduty config for notifier (list maxitems:1)
func (o NotifierOutput) PagerdutyConfig() NotifierPagerdutyConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierPagerdutyConfigPtrOutput { return v.PagerdutyConfig }).(NotifierPagerdutyConfigPtrOutput)
}

// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
func (o NotifierOutput) SendResolved() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Notifier) pulumi.BoolPtrOutput { return v.SendResolved }).(pulumi.BoolPtrOutput)
}

// Slack config for notifier (list maxitems:1)
func (o NotifierOutput) SlackConfig() NotifierSlackConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierSlackConfigPtrOutput { return v.SlackConfig }).(NotifierSlackConfigPtrOutput)
}

// SMTP config for notifier (list maxitems:1)
func (o NotifierOutput) SmtpConfig() NotifierSmtpConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierSmtpConfigPtrOutput { return v.SmtpConfig }).(NotifierSmtpConfigPtrOutput)
}

// Webhook config for notifier (list maxitems:1)
func (o NotifierOutput) WebhookConfig() NotifierWebhookConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierWebhookConfigPtrOutput { return v.WebhookConfig }).(NotifierWebhookConfigPtrOutput)
}

// Wechat config for notifier (list maxitems:1)
func (o NotifierOutput) WechatConfig() NotifierWechatConfigPtrOutput {
	return o.ApplyT(func(v *Notifier) NotifierWechatConfigPtrOutput { return v.WechatConfig }).(NotifierWechatConfigPtrOutput)
}

type NotifierArrayOutput struct{ *pulumi.OutputState }

func (NotifierArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Notifier)(nil)).Elem()
}

func (o NotifierArrayOutput) ToNotifierArrayOutput() NotifierArrayOutput {
	return o
}

func (o NotifierArrayOutput) ToNotifierArrayOutputWithContext(ctx context.Context) NotifierArrayOutput {
	return o
}

func (o NotifierArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Notifier] {
	return pulumix.Output[[]*Notifier]{
		OutputState: o.OutputState,
	}
}

func (o NotifierArrayOutput) Index(i pulumi.IntInput) NotifierOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Notifier {
		return vs[0].([]*Notifier)[vs[1].(int)]
	}).(NotifierOutput)
}

type NotifierMapOutput struct{ *pulumi.OutputState }

func (NotifierMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Notifier)(nil)).Elem()
}

func (o NotifierMapOutput) ToNotifierMapOutput() NotifierMapOutput {
	return o
}

func (o NotifierMapOutput) ToNotifierMapOutputWithContext(ctx context.Context) NotifierMapOutput {
	return o
}

func (o NotifierMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Notifier] {
	return pulumix.Output[map[string]*Notifier]{
		OutputState: o.OutputState,
	}
}

func (o NotifierMapOutput) MapIndex(k pulumi.StringInput) NotifierOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Notifier {
		return vs[0].(map[string]*Notifier)[vs[1].(string)]
	}).(NotifierOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotifierInput)(nil)).Elem(), &Notifier{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotifierArrayInput)(nil)).Elem(), NotifierArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotifierMapInput)(nil)).Elem(), NotifierMap{})
	pulumi.RegisterOutputType(NotifierOutput{})
	pulumi.RegisterOutputType(NotifierArrayOutput{})
	pulumi.RegisterOutputType(NotifierMapOutput{})
}
