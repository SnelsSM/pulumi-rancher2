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

type PodSecurityAdmissionConfigurationTemplate struct {
	pulumi.CustomResourceState

	// Annotations of the resource
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// defaults allows the user to define admission control mode for Pod Security
	Defaults PodSecurityAdmissionConfigurationTemplateDefaultsOutput `pulumi:"defaults"`
	// Pod Security Admission Configuration template description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
	// prohibited
	Exemptions PodSecurityAdmissionConfigurationTemplateExemptionsPtrOutput `pulumi:"exemptions"`
	// Labels of the resource
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Pod Security Admission Configuration template name
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewPodSecurityAdmissionConfigurationTemplate registers a new resource with the given unique name, arguments, and options.
func NewPodSecurityAdmissionConfigurationTemplate(ctx *pulumi.Context,
	name string, args *PodSecurityAdmissionConfigurationTemplateArgs, opts ...pulumi.ResourceOption) (*PodSecurityAdmissionConfigurationTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Defaults == nil {
		return nil, errors.New("invalid value for required argument 'Defaults'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PodSecurityAdmissionConfigurationTemplate
	err := ctx.RegisterResource("rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPodSecurityAdmissionConfigurationTemplate gets an existing PodSecurityAdmissionConfigurationTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPodSecurityAdmissionConfigurationTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PodSecurityAdmissionConfigurationTemplateState, opts ...pulumi.ResourceOption) (*PodSecurityAdmissionConfigurationTemplate, error) {
	var resource PodSecurityAdmissionConfigurationTemplate
	err := ctx.ReadResource("rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PodSecurityAdmissionConfigurationTemplate resources.
type podSecurityAdmissionConfigurationTemplateState struct {
	// Annotations of the resource
	Annotations map[string]string `pulumi:"annotations"`
	// defaults allows the user to define admission control mode for Pod Security
	Defaults *PodSecurityAdmissionConfigurationTemplateDefaults `pulumi:"defaults"`
	// Pod Security Admission Configuration template description
	Description *string `pulumi:"description"`
	// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
	// prohibited
	Exemptions *PodSecurityAdmissionConfigurationTemplateExemptions `pulumi:"exemptions"`
	// Labels of the resource
	Labels map[string]string `pulumi:"labels"`
	// Pod Security Admission Configuration template name
	Name *string `pulumi:"name"`
}

type PodSecurityAdmissionConfigurationTemplateState struct {
	// Annotations of the resource
	Annotations pulumi.StringMapInput
	// defaults allows the user to define admission control mode for Pod Security
	Defaults PodSecurityAdmissionConfigurationTemplateDefaultsPtrInput
	// Pod Security Admission Configuration template description
	Description pulumi.StringPtrInput
	// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
	// prohibited
	Exemptions PodSecurityAdmissionConfigurationTemplateExemptionsPtrInput
	// Labels of the resource
	Labels pulumi.StringMapInput
	// Pod Security Admission Configuration template name
	Name pulumi.StringPtrInput
}

func (PodSecurityAdmissionConfigurationTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*podSecurityAdmissionConfigurationTemplateState)(nil)).Elem()
}

type podSecurityAdmissionConfigurationTemplateArgs struct {
	// Annotations of the resource
	Annotations map[string]string `pulumi:"annotations"`
	// defaults allows the user to define admission control mode for Pod Security
	Defaults PodSecurityAdmissionConfigurationTemplateDefaults `pulumi:"defaults"`
	// Pod Security Admission Configuration template description
	Description *string `pulumi:"description"`
	// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
	// prohibited
	Exemptions *PodSecurityAdmissionConfigurationTemplateExemptions `pulumi:"exemptions"`
	// Labels of the resource
	Labels map[string]string `pulumi:"labels"`
	// Pod Security Admission Configuration template name
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a PodSecurityAdmissionConfigurationTemplate resource.
type PodSecurityAdmissionConfigurationTemplateArgs struct {
	// Annotations of the resource
	Annotations pulumi.StringMapInput
	// defaults allows the user to define admission control mode for Pod Security
	Defaults PodSecurityAdmissionConfigurationTemplateDefaultsInput
	// Pod Security Admission Configuration template description
	Description pulumi.StringPtrInput
	// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
	// prohibited
	Exemptions PodSecurityAdmissionConfigurationTemplateExemptionsPtrInput
	// Labels of the resource
	Labels pulumi.StringMapInput
	// Pod Security Admission Configuration template name
	Name pulumi.StringPtrInput
}

func (PodSecurityAdmissionConfigurationTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*podSecurityAdmissionConfigurationTemplateArgs)(nil)).Elem()
}

type PodSecurityAdmissionConfigurationTemplateInput interface {
	pulumi.Input

	ToPodSecurityAdmissionConfigurationTemplateOutput() PodSecurityAdmissionConfigurationTemplateOutput
	ToPodSecurityAdmissionConfigurationTemplateOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateOutput
}

func (*PodSecurityAdmissionConfigurationTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (i *PodSecurityAdmissionConfigurationTemplate) ToPodSecurityAdmissionConfigurationTemplateOutput() PodSecurityAdmissionConfigurationTemplateOutput {
	return i.ToPodSecurityAdmissionConfigurationTemplateOutputWithContext(context.Background())
}

func (i *PodSecurityAdmissionConfigurationTemplate) ToPodSecurityAdmissionConfigurationTemplateOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityAdmissionConfigurationTemplateOutput)
}

// PodSecurityAdmissionConfigurationTemplateArrayInput is an input type that accepts PodSecurityAdmissionConfigurationTemplateArray and PodSecurityAdmissionConfigurationTemplateArrayOutput values.
// You can construct a concrete instance of `PodSecurityAdmissionConfigurationTemplateArrayInput` via:
//
//	PodSecurityAdmissionConfigurationTemplateArray{ PodSecurityAdmissionConfigurationTemplateArgs{...} }
type PodSecurityAdmissionConfigurationTemplateArrayInput interface {
	pulumi.Input

	ToPodSecurityAdmissionConfigurationTemplateArrayOutput() PodSecurityAdmissionConfigurationTemplateArrayOutput
	ToPodSecurityAdmissionConfigurationTemplateArrayOutputWithContext(context.Context) PodSecurityAdmissionConfigurationTemplateArrayOutput
}

type PodSecurityAdmissionConfigurationTemplateArray []PodSecurityAdmissionConfigurationTemplateInput

func (PodSecurityAdmissionConfigurationTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (i PodSecurityAdmissionConfigurationTemplateArray) ToPodSecurityAdmissionConfigurationTemplateArrayOutput() PodSecurityAdmissionConfigurationTemplateArrayOutput {
	return i.ToPodSecurityAdmissionConfigurationTemplateArrayOutputWithContext(context.Background())
}

func (i PodSecurityAdmissionConfigurationTemplateArray) ToPodSecurityAdmissionConfigurationTemplateArrayOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityAdmissionConfigurationTemplateArrayOutput)
}

// PodSecurityAdmissionConfigurationTemplateMapInput is an input type that accepts PodSecurityAdmissionConfigurationTemplateMap and PodSecurityAdmissionConfigurationTemplateMapOutput values.
// You can construct a concrete instance of `PodSecurityAdmissionConfigurationTemplateMapInput` via:
//
//	PodSecurityAdmissionConfigurationTemplateMap{ "key": PodSecurityAdmissionConfigurationTemplateArgs{...} }
type PodSecurityAdmissionConfigurationTemplateMapInput interface {
	pulumi.Input

	ToPodSecurityAdmissionConfigurationTemplateMapOutput() PodSecurityAdmissionConfigurationTemplateMapOutput
	ToPodSecurityAdmissionConfigurationTemplateMapOutputWithContext(context.Context) PodSecurityAdmissionConfigurationTemplateMapOutput
}

type PodSecurityAdmissionConfigurationTemplateMap map[string]PodSecurityAdmissionConfigurationTemplateInput

func (PodSecurityAdmissionConfigurationTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (i PodSecurityAdmissionConfigurationTemplateMap) ToPodSecurityAdmissionConfigurationTemplateMapOutput() PodSecurityAdmissionConfigurationTemplateMapOutput {
	return i.ToPodSecurityAdmissionConfigurationTemplateMapOutputWithContext(context.Background())
}

func (i PodSecurityAdmissionConfigurationTemplateMap) ToPodSecurityAdmissionConfigurationTemplateMapOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodSecurityAdmissionConfigurationTemplateMapOutput)
}

type PodSecurityAdmissionConfigurationTemplateOutput struct{ *pulumi.OutputState }

func (PodSecurityAdmissionConfigurationTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (o PodSecurityAdmissionConfigurationTemplateOutput) ToPodSecurityAdmissionConfigurationTemplateOutput() PodSecurityAdmissionConfigurationTemplateOutput {
	return o
}

func (o PodSecurityAdmissionConfigurationTemplateOutput) ToPodSecurityAdmissionConfigurationTemplateOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateOutput {
	return o
}

// Annotations of the resource
func (o PodSecurityAdmissionConfigurationTemplateOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// defaults allows the user to define admission control mode for Pod Security
func (o PodSecurityAdmissionConfigurationTemplateOutput) Defaults() PodSecurityAdmissionConfigurationTemplateDefaultsOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) PodSecurityAdmissionConfigurationTemplateDefaultsOutput {
		return v.Defaults
	}).(PodSecurityAdmissionConfigurationTemplateDefaultsOutput)
}

// Pod Security Admission Configuration template description
func (o PodSecurityAdmissionConfigurationTemplateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
// prohibited
func (o PodSecurityAdmissionConfigurationTemplateOutput) Exemptions() PodSecurityAdmissionConfigurationTemplateExemptionsPtrOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) PodSecurityAdmissionConfigurationTemplateExemptionsPtrOutput {
		return v.Exemptions
	}).(PodSecurityAdmissionConfigurationTemplateExemptionsPtrOutput)
}

// Labels of the resource
func (o PodSecurityAdmissionConfigurationTemplateOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Pod Security Admission Configuration template name
func (o PodSecurityAdmissionConfigurationTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PodSecurityAdmissionConfigurationTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type PodSecurityAdmissionConfigurationTemplateArrayOutput struct{ *pulumi.OutputState }

func (PodSecurityAdmissionConfigurationTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (o PodSecurityAdmissionConfigurationTemplateArrayOutput) ToPodSecurityAdmissionConfigurationTemplateArrayOutput() PodSecurityAdmissionConfigurationTemplateArrayOutput {
	return o
}

func (o PodSecurityAdmissionConfigurationTemplateArrayOutput) ToPodSecurityAdmissionConfigurationTemplateArrayOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateArrayOutput {
	return o
}

func (o PodSecurityAdmissionConfigurationTemplateArrayOutput) Index(i pulumi.IntInput) PodSecurityAdmissionConfigurationTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PodSecurityAdmissionConfigurationTemplate {
		return vs[0].([]*PodSecurityAdmissionConfigurationTemplate)[vs[1].(int)]
	}).(PodSecurityAdmissionConfigurationTemplateOutput)
}

type PodSecurityAdmissionConfigurationTemplateMapOutput struct{ *pulumi.OutputState }

func (PodSecurityAdmissionConfigurationTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PodSecurityAdmissionConfigurationTemplate)(nil)).Elem()
}

func (o PodSecurityAdmissionConfigurationTemplateMapOutput) ToPodSecurityAdmissionConfigurationTemplateMapOutput() PodSecurityAdmissionConfigurationTemplateMapOutput {
	return o
}

func (o PodSecurityAdmissionConfigurationTemplateMapOutput) ToPodSecurityAdmissionConfigurationTemplateMapOutputWithContext(ctx context.Context) PodSecurityAdmissionConfigurationTemplateMapOutput {
	return o
}

func (o PodSecurityAdmissionConfigurationTemplateMapOutput) MapIndex(k pulumi.StringInput) PodSecurityAdmissionConfigurationTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PodSecurityAdmissionConfigurationTemplate {
		return vs[0].(map[string]*PodSecurityAdmissionConfigurationTemplate)[vs[1].(string)]
	}).(PodSecurityAdmissionConfigurationTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityAdmissionConfigurationTemplateInput)(nil)).Elem(), &PodSecurityAdmissionConfigurationTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityAdmissionConfigurationTemplateArrayInput)(nil)).Elem(), PodSecurityAdmissionConfigurationTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodSecurityAdmissionConfigurationTemplateMapInput)(nil)).Elem(), PodSecurityAdmissionConfigurationTemplateMap{})
	pulumi.RegisterOutputType(PodSecurityAdmissionConfigurationTemplateOutput{})
	pulumi.RegisterOutputType(PodSecurityAdmissionConfigurationTemplateArrayOutput{})
	pulumi.RegisterOutputType(PodSecurityAdmissionConfigurationTemplateMapOutput{})
}
