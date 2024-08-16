// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
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
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupCluster(ctx, &rancher2.LookupClusterArgs{
//				Name: "foo-custom",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCluster(ctx *pulumi.Context, args *LookupClusterArgs, opts ...pulumi.InvokeOption) (*LookupClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterResult
	err := ctx.Invoke("rancher2:index/getCluster:getCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCluster.
type LookupClusterArgs struct {
	DefaultPodSecurityAdmissionConfigurationTemplateName *string `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// The name of the Cluster (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getCluster.
type LookupClusterResult struct {
	// (Computed) Optional Agent Env Vars for Rancher agent. For Rancher v2.5.6 and above (list)
	AgentEnvVars []string `pulumi:"agentEnvVars"`
	// (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
	AksConfig GetClusterAksConfig `pulumi:"aksConfig"`
	// (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aksConfig`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` `k3sConfig` and `rkeConfig` (list maxitems:1)
	AksConfigV2 GetClusterAksConfigV2 `pulumi:"aksConfigV2"`
	// (Computed) Annotations for Node Pool object (map)
	Annotations map[string]string `pulumi:"annotations"`
	// (Computed) K8s cluster ca cert (string)
	CaCert string `pulumi:"caCert"`
	// (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
	ClusterAuthEndpoint GetClusterClusterAuthEndpoint `pulumi:"clusterAuthEndpoint"`
	// (Computed) Cluster monitoring config (list maxitems:1)
	ClusterMonitoringInput GetClusterClusterMonitoringInput `pulumi:"clusterMonitoringInput"`
	// (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
	ClusterRegistrationToken GetClusterClusterRegistrationToken `pulumi:"clusterRegistrationToken"`
	// (Computed) Cluster template answers (list maxitems:1)
	ClusterTemplateAnswers GetClusterClusterTemplateAnswers `pulumi:"clusterTemplateAnswers"`
	// (Computed) Cluster template ID (string)
	ClusterTemplateId string `pulumi:"clusterTemplateId"`
	// (Computed) Cluster template questions (list)
	ClusterTemplateQuestions []GetClusterClusterTemplateQuestion `pulumi:"clusterTemplateQuestions"`
	// (Computed) Cluster template revision ID (string)
	ClusterTemplateRevisionId                            string `pulumi:"clusterTemplateRevisionId"`
	DefaultPodSecurityAdmissionConfigurationTemplateName string `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
	DefaultPodSecurityPolicyTemplateId string `pulumi:"defaultPodSecurityPolicyTemplateId"`
	// (Computed) Default project ID for the cluster (string)
	DefaultProjectId string `pulumi:"defaultProjectId"`
	// (Computed) The description for Cluster (string)
	Description string `pulumi:"description"`
	// (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
	Driver string `pulumi:"driver"`
	// (Computed) The Amazon eks configuration for `eks` Conflicts with `aksConfig`, `aksConfigV2`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
	EksConfig GetClusterEksConfig `pulumi:"eksConfig"`
	// (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.x and above (list maxitems:1)
	EksConfigV2           GetClusterEksConfigV2 `pulumi:"eksConfigV2"`
	EnableClusterAlerting bool                  `pulumi:"enableClusterAlerting"`
	// (Computed) Enable built-in cluster monitoring. Default `false` (bool)
	EnableClusterMonitoring bool `pulumi:"enableClusterMonitoring"`
	// (Computed) Enable project network isolation. Default `false` (bool)
	EnableNetworkPolicy bool `pulumi:"enableNetworkPolicy"`
	// (Computed) Fleet workspace name (string)
	FleetWorkspaceName string `pulumi:"fleetWorkspaceName"`
	// (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1) (list maxitems:1)
	GkeConfig GetClusterGkeConfig `pulumi:"gkeConfig"`
	// (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.8 and above (list maxitems:1)
	GkeConfigV2 GetClusterGkeConfigV2 `pulumi:"gkeConfigV2"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `rkeConfig` (list maxitems:1)
	K3sConfig GetClusterK3sConfig `pulumi:"k3sConfig"`
	// (Computed) Kube Config generated for the cluster (string)
	KubeConfig string `pulumi:"kubeConfig"`
	// (Computed) Labels for Node Pool object (map)
	Labels map[string]string `pulumi:"labels"`
	Name   string            `pulumi:"name"`
	// (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `k3sConfig` and `rkeConfig` (list maxitems:1)
	OkeConfig GetClusterOkeConfig `pulumi:"okeConfig"`
	// (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
	Rke2Config GetClusterRke2Config `pulumi:"rke2Config"`
	// (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `k3sConfig` (list maxitems:1)
	RkeConfig GetClusterRkeConfig `pulumi:"rkeConfig"`
	// (Computed) System project ID for the cluster (string)
	SystemProjectId string `pulumi:"systemProjectId"`
}

func LookupClusterOutput(ctx *pulumi.Context, args LookupClusterOutputArgs, opts ...pulumi.InvokeOption) LookupClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterResult, error) {
			args := v.(LookupClusterArgs)
			r, err := LookupCluster(ctx, &args, opts...)
			var s LookupClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterResultOutput)
}

// A collection of arguments for invoking getCluster.
type LookupClusterOutputArgs struct {
	DefaultPodSecurityAdmissionConfigurationTemplateName pulumi.StringPtrInput `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// The name of the Cluster (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterArgs)(nil)).Elem()
}

// A collection of values returned by getCluster.
type LookupClusterResultOutput struct{ *pulumi.OutputState }

func (LookupClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterResult)(nil)).Elem()
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutput() LookupClusterResultOutput {
	return o
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutputWithContext(ctx context.Context) LookupClusterResultOutput {
	return o
}

// (Computed) Optional Agent Env Vars for Rancher agent. For Rancher v2.5.6 and above (list)
func (o LookupClusterResultOutput) AgentEnvVars() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []string { return v.AgentEnvVars }).(pulumi.StringArrayOutput)
}

// (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) AksConfig() GetClusterAksConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterAksConfig { return v.AksConfig }).(GetClusterAksConfigOutput)
}

// (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aksConfig`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` `k3sConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) AksConfigV2() GetClusterAksConfigV2Output {
	return o.ApplyT(func(v LookupClusterResult) GetClusterAksConfigV2 { return v.AksConfigV2 }).(GetClusterAksConfigV2Output)
}

// (Computed) Annotations for Node Pool object (map)
func (o LookupClusterResultOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterResult) map[string]string { return v.Annotations }).(pulumi.StringMapOutput)
}

// (Computed) K8s cluster ca cert (string)
func (o LookupClusterResultOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.CaCert }).(pulumi.StringOutput)
}

// (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
func (o LookupClusterResultOutput) ClusterAuthEndpoint() GetClusterClusterAuthEndpointOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterClusterAuthEndpoint { return v.ClusterAuthEndpoint }).(GetClusterClusterAuthEndpointOutput)
}

// (Computed) Cluster monitoring config (list maxitems:1)
func (o LookupClusterResultOutput) ClusterMonitoringInput() GetClusterClusterMonitoringInputOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterClusterMonitoringInput { return v.ClusterMonitoringInput }).(GetClusterClusterMonitoringInputOutput)
}

// (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
func (o LookupClusterResultOutput) ClusterRegistrationToken() GetClusterClusterRegistrationTokenOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterClusterRegistrationToken { return v.ClusterRegistrationToken }).(GetClusterClusterRegistrationTokenOutput)
}

// (Computed) Cluster template answers (list maxitems:1)
func (o LookupClusterResultOutput) ClusterTemplateAnswers() GetClusterClusterTemplateAnswersOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterClusterTemplateAnswers { return v.ClusterTemplateAnswers }).(GetClusterClusterTemplateAnswersOutput)
}

// (Computed) Cluster template ID (string)
func (o LookupClusterResultOutput) ClusterTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ClusterTemplateId }).(pulumi.StringOutput)
}

// (Computed) Cluster template questions (list)
func (o LookupClusterResultOutput) ClusterTemplateQuestions() GetClusterClusterTemplateQuestionArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterClusterTemplateQuestion { return v.ClusterTemplateQuestions }).(GetClusterClusterTemplateQuestionArrayOutput)
}

// (Computed) Cluster template revision ID (string)
func (o LookupClusterResultOutput) ClusterTemplateRevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ClusterTemplateRevisionId }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) DefaultPodSecurityAdmissionConfigurationTemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.DefaultPodSecurityAdmissionConfigurationTemplateName }).(pulumi.StringOutput)
}

// (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
func (o LookupClusterResultOutput) DefaultPodSecurityPolicyTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.DefaultPodSecurityPolicyTemplateId }).(pulumi.StringOutput)
}

// (Computed) Default project ID for the cluster (string)
func (o LookupClusterResultOutput) DefaultProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.DefaultProjectId }).(pulumi.StringOutput)
}

// (Computed) The description for Cluster (string)
func (o LookupClusterResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
func (o LookupClusterResultOutput) Driver() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Driver }).(pulumi.StringOutput)
}

// (Computed) The Amazon eks configuration for `eks` Conflicts with `aksConfig`, `aksConfigV2`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) EksConfig() GetClusterEksConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterEksConfig { return v.EksConfig }).(GetClusterEksConfigOutput)
}

// (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.x and above (list maxitems:1)
func (o LookupClusterResultOutput) EksConfigV2() GetClusterEksConfigV2Output {
	return o.ApplyT(func(v LookupClusterResult) GetClusterEksConfigV2 { return v.EksConfigV2 }).(GetClusterEksConfigV2Output)
}

func (o LookupClusterResultOutput) EnableClusterAlerting() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.EnableClusterAlerting }).(pulumi.BoolOutput)
}

// (Computed) Enable built-in cluster monitoring. Default `false` (bool)
func (o LookupClusterResultOutput) EnableClusterMonitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.EnableClusterMonitoring }).(pulumi.BoolOutput)
}

// (Computed) Enable project network isolation. Default `false` (bool)
func (o LookupClusterResultOutput) EnableNetworkPolicy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.EnableNetworkPolicy }).(pulumi.BoolOutput)
}

// (Computed) Fleet workspace name (string)
func (o LookupClusterResultOutput) FleetWorkspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.FleetWorkspaceName }).(pulumi.StringOutput)
}

// (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1) (list maxitems:1)
func (o LookupClusterResultOutput) GkeConfig() GetClusterGkeConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterGkeConfig { return v.GkeConfig }).(GetClusterGkeConfigOutput)
}

// (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.8 and above (list maxitems:1)
func (o LookupClusterResultOutput) GkeConfigV2() GetClusterGkeConfigV2Output {
	return o.ApplyT(func(v LookupClusterResult) GetClusterGkeConfigV2 { return v.GkeConfigV2 }).(GetClusterGkeConfigV2Output)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) K3sConfig() GetClusterK3sConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterK3sConfig { return v.K3sConfig }).(GetClusterK3sConfigOutput)
}

// (Computed) Kube Config generated for the cluster (string)
func (o LookupClusterResultOutput) KubeConfig() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.KubeConfig }).(pulumi.StringOutput)
}

// (Computed) Labels for Node Pool object (map)
func (o LookupClusterResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `k3sConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) OkeConfig() GetClusterOkeConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterOkeConfig { return v.OkeConfig }).(GetClusterOkeConfigOutput)
}

// (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
func (o LookupClusterResultOutput) Rke2Config() GetClusterRke2ConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterRke2Config { return v.Rke2Config }).(GetClusterRke2ConfigOutput)
}

// (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `k3sConfig` (list maxitems:1)
func (o LookupClusterResultOutput) RkeConfig() GetClusterRkeConfigOutput {
	return o.ApplyT(func(v LookupClusterResult) GetClusterRkeConfig { return v.RkeConfig }).(GetClusterRkeConfigOutput)
}

// (Computed) System project ID for the cluster (string)
func (o LookupClusterResultOutput) SystemProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.SystemProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterResultOutput{})
}
