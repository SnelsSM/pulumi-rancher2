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

// ## Import
//
// Clusters v2 can be imported using the Rancher Cluster v2 ID, that is in the form &lt;FLEET_NAMESPACE&gt;/&lt;CLUSTER_NAME&gt;
//
// ```sh
//
//	$ pulumi import rancher2:index/clusterV2:ClusterV2 foo <FLEET_NAMESPACE>/<CLUSTER_NAME>
//
// ```
type ClusterV2 struct {
	pulumi.CustomResourceState

	// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
	AgentEnvVars ClusterV2AgentEnvVarArrayOutput `pulumi:"agentEnvVars"`
	// Annotations for the Cluster.
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
	CloudCredentialSecretName pulumi.StringPtrOutput `pulumi:"cloudCredentialSecretName"`
	// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
	ClusterAgentDeploymentCustomizations ClusterV2ClusterAgentDeploymentCustomizationArrayOutput `pulumi:"clusterAgentDeploymentCustomizations"`
	// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenOutput `pulumi:"clusterRegistrationToken"`
	// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2Sync`).
	ClusterV1Id pulumi.StringOutput `pulumi:"clusterV1Id"`
	// Default cluster role for project members.
	DefaultClusterRoleForProjectMembers pulumi.StringPtrOutput `pulumi:"defaultClusterRoleForProjectMembers"`
	// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
	DefaultPodSecurityAdmissionConfigurationTemplateName pulumi.StringPtrOutput `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrOutput `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy on the cluster.
	EnableNetworkPolicy pulumi.BoolOutput `pulumi:"enableNetworkPolicy"`
	// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
	FleetAgentDeploymentCustomizations ClusterV2FleetAgentDeploymentCustomizationArrayOutput `pulumi:"fleetAgentDeploymentCustomizations"`
	// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
	FleetNamespace pulumi.StringPtrOutput `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected`.
	KubeConfig pulumi.StringOutput `pulumi:"kubeConfig"`
	// The RKE2 or K3s version for the cluster.
	KubernetesVersion pulumi.StringOutput `pulumi:"kubernetesVersion"`
	// Labels for the Cluster.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrOutput `pulumi:"localAuthEndpoint"`
	// The name of the cluster.
	Name pulumi.StringOutput `pulumi:"name"`
	// (Computed, string) Cluster's k8s resource version.
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// The RKE configuration for the cluster.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for the Cluster.
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
	ClusterAgentDeploymentCustomizations []ClusterV2ClusterAgentDeploymentCustomization `pulumi:"clusterAgentDeploymentCustomizations"`
	// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
	ClusterRegistrationToken *ClusterV2ClusterRegistrationToken `pulumi:"clusterRegistrationToken"`
	// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2Sync`).
	ClusterV1Id *string `pulumi:"clusterV1Id"`
	// Default cluster role for project members.
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
	DefaultPodSecurityAdmissionConfigurationTemplateName *string `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy on the cluster.
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
	FleetAgentDeploymentCustomizations []ClusterV2FleetAgentDeploymentCustomization `pulumi:"fleetAgentDeploymentCustomizations"`
	// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected`.
	KubeConfig *string `pulumi:"kubeConfig"`
	// The RKE2 or K3s version for the cluster.
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// Labels for the Cluster.
	Labels map[string]interface{} `pulumi:"labels"`
	// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// The name of the cluster.
	Name *string `pulumi:"name"`
	// (Computed, string) Cluster's k8s resource version.
	ResourceVersion *string `pulumi:"resourceVersion"`
	// The RKE configuration for the cluster.
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

type ClusterV2State struct {
	// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for the Cluster.
	Annotations pulumi.MapInput
	// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
	CloudCredentialSecretName pulumi.StringPtrInput
	// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
	ClusterAgentDeploymentCustomizations ClusterV2ClusterAgentDeploymentCustomizationArrayInput
	// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
	ClusterRegistrationToken ClusterV2ClusterRegistrationTokenPtrInput
	// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2Sync`).
	ClusterV1Id pulumi.StringPtrInput
	// Default cluster role for project members.
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
	DefaultPodSecurityAdmissionConfigurationTemplateName pulumi.StringPtrInput
	// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy on the cluster.
	EnableNetworkPolicy pulumi.BoolPtrInput
	// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
	FleetAgentDeploymentCustomizations ClusterV2FleetAgentDeploymentCustomizationArrayInput
	// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
	FleetNamespace pulumi.StringPtrInput
	// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected`.
	KubeConfig pulumi.StringPtrInput
	// The RKE2 or K3s version for the cluster.
	KubernetesVersion pulumi.StringPtrInput
	// Labels for the Cluster.
	Labels pulumi.MapInput
	// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// The name of the cluster.
	Name pulumi.StringPtrInput
	// (Computed, string) Cluster's k8s resource version.
	ResourceVersion pulumi.StringPtrInput
	// The RKE configuration for the cluster.
	RkeConfig ClusterV2RkeConfigPtrInput
}

func (ClusterV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterV2State)(nil)).Elem()
}

type clusterV2Args struct {
	// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
	AgentEnvVars []ClusterV2AgentEnvVar `pulumi:"agentEnvVars"`
	// Annotations for the Cluster.
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
	CloudCredentialSecretName *string `pulumi:"cloudCredentialSecretName"`
	// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
	ClusterAgentDeploymentCustomizations []ClusterV2ClusterAgentDeploymentCustomization `pulumi:"clusterAgentDeploymentCustomizations"`
	// Default cluster role for project members.
	DefaultClusterRoleForProjectMembers *string `pulumi:"defaultClusterRoleForProjectMembers"`
	// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
	DefaultPodSecurityAdmissionConfigurationTemplateName *string `pulumi:"defaultPodSecurityAdmissionConfigurationTemplateName"`
	// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
	DefaultPodSecurityPolicyTemplateName *string `pulumi:"defaultPodSecurityPolicyTemplateName"`
	// Enable k8s network policy on the cluster.
	EnableNetworkPolicy *bool `pulumi:"enableNetworkPolicy"`
	// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
	FleetAgentDeploymentCustomizations []ClusterV2FleetAgentDeploymentCustomization `pulumi:"fleetAgentDeploymentCustomizations"`
	// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// The RKE2 or K3s version for the cluster.
	KubernetesVersion string `pulumi:"kubernetesVersion"`
	// Labels for the Cluster.
	Labels map[string]interface{} `pulumi:"labels"`
	// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
	LocalAuthEndpoint *ClusterV2LocalAuthEndpoint `pulumi:"localAuthEndpoint"`
	// The name of the cluster.
	Name *string `pulumi:"name"`
	// The RKE configuration for the cluster.
	RkeConfig *ClusterV2RkeConfig `pulumi:"rkeConfig"`
}

// The set of arguments for constructing a ClusterV2 resource.
type ClusterV2Args struct {
	// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
	AgentEnvVars ClusterV2AgentEnvVarArrayInput
	// Annotations for the Cluster.
	Annotations pulumi.MapInput
	// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
	CloudCredentialSecretName pulumi.StringPtrInput
	// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
	ClusterAgentDeploymentCustomizations ClusterV2ClusterAgentDeploymentCustomizationArrayInput
	// Default cluster role for project members.
	DefaultClusterRoleForProjectMembers pulumi.StringPtrInput
	// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
	DefaultPodSecurityAdmissionConfigurationTemplateName pulumi.StringPtrInput
	// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
	DefaultPodSecurityPolicyTemplateName pulumi.StringPtrInput
	// Enable k8s network policy on the cluster.
	EnableNetworkPolicy pulumi.BoolPtrInput
	// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
	FleetAgentDeploymentCustomizations ClusterV2FleetAgentDeploymentCustomizationArrayInput
	// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
	FleetNamespace pulumi.StringPtrInput
	// The RKE2 or K3s version for the cluster.
	KubernetesVersion pulumi.StringInput
	// Labels for the Cluster.
	Labels pulumi.MapInput
	// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
	LocalAuthEndpoint ClusterV2LocalAuthEndpointPtrInput
	// The name of the cluster.
	Name pulumi.StringPtrInput
	// The RKE configuration for the cluster.
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

// Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
func (o ClusterV2Output) AgentEnvVars() ClusterV2AgentEnvVarArrayOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2AgentEnvVarArrayOutput { return v.AgentEnvVars }).(ClusterV2AgentEnvVarArrayOutput)
}

// Annotations for the Cluster.
func (o ClusterV2Output) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
func (o ClusterV2Output) CloudCredentialSecretName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.CloudCredentialSecretName }).(pulumi.StringPtrOutput)
}

// Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
func (o ClusterV2Output) ClusterAgentDeploymentCustomizations() ClusterV2ClusterAgentDeploymentCustomizationArrayOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2ClusterAgentDeploymentCustomizationArrayOutput {
		return v.ClusterAgentDeploymentCustomizations
	}).(ClusterV2ClusterAgentDeploymentCustomizationArrayOutput)
}

// (Computed, sensitive, list, max length: 1) Cluster Registration Token generated for the cluster.
func (o ClusterV2Output) ClusterRegistrationToken() ClusterV2ClusterRegistrationTokenOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2ClusterRegistrationTokenOutput { return v.ClusterRegistrationToken }).(ClusterV2ClusterRegistrationTokenOutput)
}

// (Computed, string) Cluster v1 id for cluster v2. (e.g. to be used with `rancher2Sync`).
func (o ClusterV2Output) ClusterV1Id() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.ClusterV1Id }).(pulumi.StringOutput)
}

// Default cluster role for project members.
func (o ClusterV2Output) DefaultClusterRoleForProjectMembers() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.DefaultClusterRoleForProjectMembers }).(pulumi.StringPtrOutput)
}

// The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
func (o ClusterV2Output) DefaultPodSecurityAdmissionConfigurationTemplateName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput {
		return v.DefaultPodSecurityAdmissionConfigurationTemplateName
	}).(pulumi.StringPtrOutput)
}

// Default pod security policy template name specifies the default PSP for the cluster. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/create-pod-security-policies).
func (o ClusterV2Output) DefaultPodSecurityPolicyTemplateName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.DefaultPodSecurityPolicyTemplateName }).(pulumi.StringPtrOutput)
}

// Enable k8s network policy on the cluster.
func (o ClusterV2Output) EnableNetworkPolicy() pulumi.BoolOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.BoolOutput { return v.EnableNetworkPolicy }).(pulumi.BoolOutput)
}

// Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
func (o ClusterV2Output) FleetAgentDeploymentCustomizations() ClusterV2FleetAgentDeploymentCustomizationArrayOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2FleetAgentDeploymentCustomizationArrayOutput {
		return v.FleetAgentDeploymentCustomizations
	}).(ClusterV2FleetAgentDeploymentCustomizationArrayOutput)
}

// Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
func (o ClusterV2Output) FleetNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringPtrOutput { return v.FleetNamespace }).(pulumi.StringPtrOutput)
}

// (Computed/Sensitive) Kube Config generated for the cluster. Note: When the cluster has `localAuthEndpoint` enabled, the kubeConfig will not be available until the cluster is `connected`.
func (o ClusterV2Output) KubeConfig() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.KubeConfig }).(pulumi.StringOutput)
}

// The RKE2 or K3s version for the cluster.
func (o ClusterV2Output) KubernetesVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.KubernetesVersion }).(pulumi.StringOutput)
}

// Labels for the Cluster.
func (o ClusterV2Output) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
func (o ClusterV2Output) LocalAuthEndpoint() ClusterV2LocalAuthEndpointPtrOutput {
	return o.ApplyT(func(v *ClusterV2) ClusterV2LocalAuthEndpointPtrOutput { return v.LocalAuthEndpoint }).(ClusterV2LocalAuthEndpointPtrOutput)
}

// The name of the cluster.
func (o ClusterV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Computed, string) Cluster's k8s resource version.
func (o ClusterV2Output) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterV2) pulumi.StringOutput { return v.ResourceVersion }).(pulumi.StringOutput)
}

// The RKE configuration for the cluster.
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
