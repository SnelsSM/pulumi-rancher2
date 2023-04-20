// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster.
//
// ## Example Usage
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
//			_, err := rancher2.LookupClusterV2(ctx, &rancher2.LookupClusterV2Args{
//				FleetNamespace: pulumi.StringRef("fleet-ns"),
//				Name:           "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupClusterV2(ctx *pulumi.Context, args *LookupClusterV2Args, opts ...pulumi.InvokeOption) (*LookupClusterV2Result, error) {
	var rv LookupClusterV2Result
	err := ctx.Invoke("rancher2:index/getClusterV2:getClusterV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterV2.
type LookupClusterV2Args struct {
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// The name of the Cluster v2 (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterV2.
type LookupClusterV2Result struct {
	// (Computed) Optional Agent Env Vars for Rancher agent (list)
	AgentEnvVars []GetClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	Annotations  map[string]interface{}    `pulumi:"annotations"`
	// (Computed) Cluster V2 cloud credential secret name (string)
	CloudCredentialSecretName string `pulumi:"cloudCredentialSecretName"`
	// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
	ClusterRegistrationToken GetClusterV2ClusterRegistrationToken `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster v1 id for cluster v2 (string)
	ClusterV1Id string `pulumi:"clusterV1Id"`
	// (Computed) Cluster V2 default cluster role for project members (string)
	DefaultClusterRoleForProjectMembers string `pulumi:"defaultClusterRoleForProjectMembers"`
	// (Computed) Cluster V2 default pod security policy template name (string)
	DefaultPodSecurityPolicyTemplateName string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// (Computed) Enable k8s network policy at Cluster V2 (bool)
	EnableNetworkPolicy bool    `pulumi:"enableNetworkPolicy"`
	FleetNamespace      *string `pulumi:"fleetNamespace"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
	KubeConfig string `pulumi:"kubeConfig"`
	// (Computed) The kubernetes version of the Cluster v2 (list maxitems:1)
	KubernetesVersion string                 `pulumi:"kubernetesVersion"`
	Labels            map[string]interface{} `pulumi:"labels"`
	Name              string                 `pulumi:"name"`
	// (Computed) Cluster v2 k8s resource version (string)
	ResourceVersion string `pulumi:"resourceVersion"`
	// (Computed) The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
	RkeConfig GetClusterV2RkeConfig `pulumi:"rkeConfig"`
}

func LookupClusterV2Output(ctx *pulumi.Context, args LookupClusterV2OutputArgs, opts ...pulumi.InvokeOption) LookupClusterV2ResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterV2Result, error) {
			args := v.(LookupClusterV2Args)
			r, err := LookupClusterV2(ctx, &args, opts...)
			var s LookupClusterV2Result
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterV2ResultOutput)
}

// A collection of arguments for invoking getClusterV2.
type LookupClusterV2OutputArgs struct {
	// The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
	FleetNamespace pulumi.StringPtrInput `pulumi:"fleetNamespace"`
	// The name of the Cluster v2 (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupClusterV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterV2Args)(nil)).Elem()
}

// A collection of values returned by getClusterV2.
type LookupClusterV2ResultOutput struct{ *pulumi.OutputState }

func (LookupClusterV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterV2Result)(nil)).Elem()
}

func (o LookupClusterV2ResultOutput) ToLookupClusterV2ResultOutput() LookupClusterV2ResultOutput {
	return o
}

func (o LookupClusterV2ResultOutput) ToLookupClusterV2ResultOutputWithContext(ctx context.Context) LookupClusterV2ResultOutput {
	return o
}

// (Computed) Optional Agent Env Vars for Rancher agent (list)
func (o LookupClusterV2ResultOutput) AgentEnvVars() GetClusterV2AgentEnvVarArrayOutput {
	return o.ApplyT(func(v LookupClusterV2Result) []GetClusterV2AgentEnvVar { return v.AgentEnvVars }).(GetClusterV2AgentEnvVarArrayOutput)
}

func (o LookupClusterV2ResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterV2Result) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Cluster V2 cloud credential secret name (string)
func (o LookupClusterV2ResultOutput) CloudCredentialSecretName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.CloudCredentialSecretName }).(pulumi.StringOutput)
}

// (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
func (o LookupClusterV2ResultOutput) ClusterRegistrationToken() GetClusterV2ClusterRegistrationTokenOutput {
	return o.ApplyT(func(v LookupClusterV2Result) GetClusterV2ClusterRegistrationToken { return v.ClusterRegistrationToken }).(GetClusterV2ClusterRegistrationTokenOutput)
}

// (Computed) Cluster v1 id for cluster v2 (string)
func (o LookupClusterV2ResultOutput) ClusterV1Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.ClusterV1Id }).(pulumi.StringOutput)
}

// (Computed) Cluster V2 default cluster role for project members (string)
func (o LookupClusterV2ResultOutput) DefaultClusterRoleForProjectMembers() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.DefaultClusterRoleForProjectMembers }).(pulumi.StringOutput)
}

// (Computed) Cluster V2 default pod security policy template name (string)
func (o LookupClusterV2ResultOutput) DefaultPodSecurityPolicyTemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.DefaultPodSecurityPolicyTemplateName }).(pulumi.StringOutput)
}

// (Computed) Enable k8s network policy at Cluster V2 (bool)
func (o LookupClusterV2ResultOutput) EnableNetworkPolicy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterV2Result) bool { return v.EnableNetworkPolicy }).(pulumi.BoolOutput)
}

func (o LookupClusterV2ResultOutput) FleetNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupClusterV2Result) *string { return v.FleetNamespace }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
func (o LookupClusterV2ResultOutput) KubeConfig() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.KubeConfig }).(pulumi.StringOutput)
}

// (Computed) The kubernetes version of the Cluster v2 (list maxitems:1)
func (o LookupClusterV2ResultOutput) KubernetesVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.KubernetesVersion }).(pulumi.StringOutput)
}

func (o LookupClusterV2ResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterV2Result) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupClusterV2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Cluster v2 k8s resource version (string)
func (o LookupClusterV2ResultOutput) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterV2Result) string { return v.ResourceVersion }).(pulumi.StringOutput)
}

// (Computed) The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
func (o LookupClusterV2ResultOutput) RkeConfig() GetClusterV2RkeConfigOutput {
	return o.ApplyT(func(v LookupClusterV2Result) GetClusterV2RkeConfig { return v.RkeConfig }).(GetClusterV2RkeConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterV2ResultOutput{})
}
