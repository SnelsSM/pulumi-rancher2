// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster v2 resource. This can be used to create RKE2 and K3S Clusters for Rancher v2 environments and retrieve their information. This resource is available from Rancher v2.6.0 and above.
//
// ## Example Usage
// ### Creating Rancher v2 custom cluster v2
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v4/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewClusterV2(ctx, "foo", &rancher2.ClusterV2Args{
//				DefaultClusterRoleForProjectMembers: pulumi.String("user"),
//				EnableNetworkPolicy:                 pulumi.Bool(false),
//				FleetNamespace:                      pulumi.String("fleet-ns"),
//				KubernetesVersion:                   pulumi.String("v1.21.4+k3s1"),
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
// **Note** Once created, get the node command from `rancher2_cluster_v2.foo.cluster_registration_token`
//
// ## Import
//
// Clusters v2 can be imported using the Rancher Cluster v2 ID, that is in the form &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
//
// ```sh
//
//	$ pulumi import rancher2:index/clusterV2:ClusterV2 foo &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
//
// ```
type ClusterV2 struct {
	pulumi.CustomResourceState

	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayOutput `pulumi:"agentEnvVars"`
	// Annotations for the Cluster V2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrOutput `pulumi:"cloudCredentialSecretName"`
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenOutput `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id pulumi.StringOutput `pulumi:"clusterV1Id"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrOutput `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrOutput `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolOutput `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrOutput `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig pulumi.StringOutput `pulumi:"kubeConfig"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringOutput `pulumi:"kubernetesVersion"`
	// Labels for the Cluster V2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Cluster V2 local auth endpoint (list maxitems:1)
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrOutput `pulumi:"localAuthEndpoint"`
	// The name of the Cluster v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigOutput `pulumi:"rkeConfig"`
}

// NewClusterV2 registers a new resource with the given unique name, arguments, and options.
func NewClusterV2(ctx *pulumi.Context,
	name string, args *ClusterV2Args, opts ...pulumi.ResourceOption) (*ClusterV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KubernetesVersion == nil {
		return nil, errors.New("invalid value for required argument 'KubernetesVersion'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clusterRegistrationToken",
		"kubeConfig",
	})
	opts = append(opts, secrets)
	var resource ClusterV2
	err := ctx.RegisterResource("rancher2:index/clusterV2:ClusterV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterV2 gets an existing ClusterV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterV2State, opts ...pulumi.ResourceOption) (*ClusterV2, error) {
	var resource ClusterV2
	err := ctx.ReadResource("rancher2:index/clusterV2:ClusterV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterV2 resources.
type clusterV2State struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for the Cluster V2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken *ClusterV2ClusterRegistrationToken `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id *string `pulumi:"clusterV1Id"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig *string `pulumi:"kubeConfig"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// Labels for the Cluster V2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Cluster V2 local auth endpoint (list maxitems:1)
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// The name of the Cluster v2 (string)
	Name *string `pulumi:"name"`
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

type ClusterV2State struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for the Cluster V2 (map)
	Annotations pulumi.MapInput
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrInput
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenPtrInput
	// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
	ClusterV1Id pulumi.StringPtrInput
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolPtrInput
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrInput
	// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
	KubeConfig pulumi.StringPtrInput
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringPtrInput
	// Labels for the Cluster V2 (map)
	Labels pulumi.MapInput
	// Cluster V2 local auth endpoint (list maxitems:1)
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// The name of the Cluster v2 (string)
	Name pulumi.StringPtrInput
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigPtrInput
}

func (ClusterV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterV2State)(nil)).Elem()
}

type clusterV2Args struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for the Cluster V2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion string `pulumi:"kubernetesVersion"`
	// Labels for the Cluster V2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Cluster V2 local auth endpoint (list maxitems:1)
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// The name of the Cluster v2 (string)
	Name *string `pulumi:"name"`
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

// The set of arguments for constructing a ClusterV2 resource.
type ClusterV2Args struct {
	// Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for the Cluster V2 (map)
	Annotations pulumi.MapInput
	// Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName pulumi.StringPtrInput
	// Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy pulumi.BoolPtrInput
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrInput
	// The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion pulumi.StringInput
	// Labels for the Cluster V2 (map)
	Labels pulumi.MapInput
	// Cluster V2 local auth endpoint (list maxitems:1)
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// The name of the Cluster v2 (string)
	Name pulumi.StringPtrInput
	// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig ClusterV2RkeConfigPtrInput
}

func (ClusterV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterV2Args)(nil)).Elem()
}

type ClusterV2Input interface {
	pulumi.Input

	ToClusterV2Output() ClusterV2Output
	ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output
}

func (*ClusterV2) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterV2)(nil)).Elem()
}

func (i *ClusterV2) ToClusterV2Output() ClusterV2Output {
	return i.ToClusterV2OutputWithContext(context.Background())
}

func (i *ClusterV2) ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2Output)
}

// ClusterV2ArrayInput is an input type that accepts ClusterV2Array and ClusterV2ArrayOutput values.
// You can construct a concrete instance of `ClusterV2ArrayInput` via:
//
//	ClusterV2Array{ ClusterV2Args{...} }
type ClusterV2ArrayInput interface {
	pulumi.Input

	ToClusterV2ArrayOutput() ClusterV2ArrayOutput
	ToClusterV2ArrayOutputWithContext(context.Context) ClusterV2ArrayOutput
}

type ClusterV2Array []ClusterV2Input

func (ClusterV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterV2)(nil)).Elem()
}

func (i ClusterV2Array) ToClusterV2ArrayOutput() ClusterV2ArrayOutput {
	return i.ToClusterV2ArrayOutputWithContext(context.Background())
}

func (i ClusterV2Array) ToClusterV2ArrayOutputWithContext(ctx context.Context) ClusterV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2ArrayOutput)
}

// ClusterV2MapInput is an input type that accepts ClusterV2Map and ClusterV2MapOutput values.
// You can construct a concrete instance of `ClusterV2MapInput` via:
//
//	ClusterV2Map{ "key": ClusterV2Args{...} }
type ClusterV2MapInput interface {
	pulumi.Input

	ToClusterV2MapOutput() ClusterV2MapOutput
	ToClusterV2MapOutputWithContext(context.Context) ClusterV2MapOutput
}

type ClusterV2Map map[string]ClusterV2Input

func (ClusterV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterV2)(nil)).Elem()
}

func (i ClusterV2Map) ToClusterV2MapOutput() ClusterV2MapOutput {
	return i.ToClusterV2MapOutputWithContext(context.Background())
}

func (i ClusterV2Map) ToClusterV2MapOutputWithContext(ctx context.Context) ClusterV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterV2MapOutput)
}

type ClusterV2Output struct{ *pulumi.OutputState }

func (ClusterV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterV2)(nil)).Elem()
}

func (o ClusterV2Output) ToClusterV2Output() ClusterV2Output {
	return o
}

func (o ClusterV2Output) ToClusterV2OutputWithContext(ctx context.Context) ClusterV2Output {
	return o
}

// Optional Agent Env Vars for Rancher agent (list)
func (o ClusterV2Output) AgentEnvVars() ClusterV2AgentEnvVarArrayOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2AgentEnvVarArrayOutput { return v.AgentEnvVars }).(ClusterV2AgentEnvVarArrayOutput)
}

// Annotations for the Cluster V2 (map)
func (o ClusterV2Output) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Cluster V2 cloud credential secret name (string)
func (o ClusterV2Output) CloudCredentialSecretName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.CloudCredentialSecretName }).(pulumi.StringPtrOutput)
}

// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
func (o ClusterV2Output) ClusterRegistrationToken() ClusterV2ClusterRegistrationTokenOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2ClusterRegistrationTokenOutput { return v.ClusterRegistrationToken }).(ClusterV2ClusterRegistrationTokenOutput)
}

// (Computed) Cluster v1 id for cluster v2. (e.g to be used with `rancher2Sync`) (string)
func (o ClusterV2Output) ClusterV1Id() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.ClusterV1Id }).(pulumi.StringOutput)
}

// Cluster V2 default cluster role for project members (string)
func (o ClusterV2Output) DefaultClusterRoleForProjectMembers() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.DefaultClusterRoleForProjectMembers }).(pulumi.StringPtrOutput)
}

// Cluster V2 default pod security policy template name (string)
func (o ClusterV2Output) DefaultPodSecurityPolicyTemplateName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.DefaultPodSecurityPolicyTemplateName }).(pulumi.StringPtrOutput)
}

// Enable k8s network policy at Cluster V2 (bool)
func (o ClusterV2Output) EnableNetworkPolicy() pulumi.BoolOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.BoolOutput { return v.EnableNetworkPolicy }).(pulumi.BoolOutput)
}

// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
func (o ClusterV2Output) FleetNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.FleetNamespace }).(pulumi.StringPtrOutput)
}

// (Computed/Sensitive) Kube Config generated for the cluster v2. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected` (string)
func (o ClusterV2Output) KubeConfig() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.KubeConfig }).(pulumi.StringOutput)
}

// The kubernetes version of the Cluster v2 (list maxitems:1)
func (o ClusterV2Output) KubernetesVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.KubernetesVersion }).(pulumi.StringOutput)
}

// Labels for the Cluster V2 (map)
func (o ClusterV2Output) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Cluster V2 local auth endpoint (list maxitems:1)
func (o ClusterV2Output) LocalAuthEndpoint() ClusterV2LocalAuthEndpointPtrOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2LocalAuthEndpointPtrOutput { return v.LocalAuthEndpoint }).(ClusterV2LocalAuthEndpointPtrOutput)
}

// The name of the Cluster v2 (string)
func (o ClusterV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Cluster v2 k8s resource version (string)
func (o ClusterV2Output) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.ResourceVersion }).(pulumi.StringOutput)
}

// The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
func (o ClusterV2Output) RkeConfig() ClusterV2RkeConfigOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2RkeConfigOutput { return v.RkeConfig }).(ClusterV2RkeConfigOutput)
}

type ClusterV2ArrayOutput struct{ *pulumi.OutputState }

func (ClusterV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterV2)(nil)).Elem()
}

func (o ClusterV2ArrayOutput) ToClusterV2ArrayOutput() ClusterV2ArrayOutput {
	return o
}

func (o ClusterV2ArrayOutput) ToClusterV2ArrayOutputWithContext(ctx context.Context) ClusterV2ArrayOutput {
	return o
}

func (o ClusterV2ArrayOutput) Index(i pulumi.IntInput) ClusterV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterV2 {
		return vs[0].([]*ClusterV2)[vs[1].(int)]
	}).(ClusterV2Output)
}

type ClusterV2MapOutput struct{ *pulumi.OutputState }

func (ClusterV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterV2)(nil)).Elem()
}

func (o ClusterV2MapOutput) ToClusterV2MapOutput() ClusterV2MapOutput {
	return o
}

func (o ClusterV2MapOutput) ToClusterV2MapOutputWithContext(ctx context.Context) ClusterV2MapOutput {
	return o
}

func (o ClusterV2MapOutput) MapIndex(k pulumi.StringInput) ClusterV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterV2 {
		return vs[0].(map[string]*ClusterV2)[vs[1].(string)]
	}).(ClusterV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2Input)(nil)).Elem(), &ClusterV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2ArrayInput)(nil)).Elem(), ClusterV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterV2MapInput)(nil)).Elem(), ClusterV2Map{})
	pulumi.RegisterOutputType(ClusterV2Output{})
	pulumi.RegisterOutputType(ClusterV2ArrayOutput{})
	pulumi.RegisterOutputType(ClusterV2MapOutput{})
}
