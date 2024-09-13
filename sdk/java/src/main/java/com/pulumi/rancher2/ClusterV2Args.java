// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ClusterV2AgentEnvVarArgs;
import com.pulumi.rancher2.inputs.ClusterV2ClusterAgentDeploymentCustomizationArgs;
import com.pulumi.rancher2.inputs.ClusterV2FleetAgentDeploymentCustomizationArgs;
import com.pulumi.rancher2.inputs.ClusterV2LocalAuthEndpointArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2Args Empty = new ClusterV2Args();

    /**
     * Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
     * 
     */
    @Import(name="agentEnvVars")
    private @Nullable Output<List<ClusterV2AgentEnvVarArgs>> agentEnvVars;

    /**
     * @return Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
     * 
     */
    public Optional<Output<List<ClusterV2AgentEnvVarArgs>>> agentEnvVars() {
        return Optional.ofNullable(this.agentEnvVars);
    }

    /**
     * Annotations for the Cluster.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
     * 
     */
    @Import(name="cloudCredentialSecretName")
    private @Nullable Output<String> cloudCredentialSecretName;

    /**
     * @return Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
     * 
     */
    public Optional<Output<String>> cloudCredentialSecretName() {
        return Optional.ofNullable(this.cloudCredentialSecretName);
    }

    /**
     * Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
     * 
     */
    @Import(name="clusterAgentDeploymentCustomizations")
    private @Nullable Output<List<ClusterV2ClusterAgentDeploymentCustomizationArgs>> clusterAgentDeploymentCustomizations;

    /**
     * @return Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
     * 
     */
    public Optional<Output<List<ClusterV2ClusterAgentDeploymentCustomizationArgs>>> clusterAgentDeploymentCustomizations() {
        return Optional.ofNullable(this.clusterAgentDeploymentCustomizations);
    }

    /**
     * Default cluster role for project members.
     * 
     */
    @Import(name="defaultClusterRoleForProjectMembers")
    private @Nullable Output<String> defaultClusterRoleForProjectMembers;

    /**
     * @return Default cluster role for project members.
     * 
     */
    public Optional<Output<String>> defaultClusterRoleForProjectMembers() {
        return Optional.ofNullable(this.defaultClusterRoleForProjectMembers);
    }

    /**
     * The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
     * 
     */
    @Import(name="defaultPodSecurityAdmissionConfigurationTemplateName")
    private @Nullable Output<String> defaultPodSecurityAdmissionConfigurationTemplateName;

    /**
     * @return The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
     * 
     */
    public Optional<Output<String>> defaultPodSecurityAdmissionConfigurationTemplateName() {
        return Optional.ofNullable(this.defaultPodSecurityAdmissionConfigurationTemplateName);
    }

    /**
     * Enable k8s network policy on the cluster.
     * 
     */
    @Import(name="enableNetworkPolicy")
    private @Nullable Output<Boolean> enableNetworkPolicy;

    /**
     * @return Enable k8s network policy on the cluster.
     * 
     */
    public Optional<Output<Boolean>> enableNetworkPolicy() {
        return Optional.ofNullable(this.enableNetworkPolicy);
    }

    /**
     * Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
     * 
     */
    @Import(name="fleetAgentDeploymentCustomizations")
    private @Nullable Output<List<ClusterV2FleetAgentDeploymentCustomizationArgs>> fleetAgentDeploymentCustomizations;

    /**
     * @return Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
     * 
     */
    public Optional<Output<List<ClusterV2FleetAgentDeploymentCustomizationArgs>>> fleetAgentDeploymentCustomizations() {
        return Optional.ofNullable(this.fleetAgentDeploymentCustomizations);
    }

    /**
     * Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
     * 
     */
    @Import(name="fleetNamespace")
    private @Nullable Output<String> fleetNamespace;

    /**
     * @return Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
     * 
     */
    public Optional<Output<String>> fleetNamespace() {
        return Optional.ofNullable(this.fleetNamespace);
    }

    /**
     * The RKE2 or K3s version for the cluster.
     * 
     */
    @Import(name="kubernetesVersion", required=true)
    private Output<String> kubernetesVersion;

    /**
     * @return The RKE2 or K3s version for the cluster.
     * 
     */
    public Output<String> kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Labels for the Cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for the Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
     * 
     */
    @Import(name="localAuthEndpoint")
    private @Nullable Output<ClusterV2LocalAuthEndpointArgs> localAuthEndpoint;

    /**
     * @return Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
     * 
     */
    public Optional<Output<ClusterV2LocalAuthEndpointArgs>> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The RKE configuration for the cluster.
     * 
     */
    @Import(name="rkeConfig")
    private @Nullable Output<ClusterV2RkeConfigArgs> rkeConfig;

    /**
     * @return The RKE configuration for the cluster.
     * 
     */
    public Optional<Output<ClusterV2RkeConfigArgs>> rkeConfig() {
        return Optional.ofNullable(this.rkeConfig);
    }

    private ClusterV2Args() {}

    private ClusterV2Args(ClusterV2Args $) {
        this.agentEnvVars = $.agentEnvVars;
        this.annotations = $.annotations;
        this.cloudCredentialSecretName = $.cloudCredentialSecretName;
        this.clusterAgentDeploymentCustomizations = $.clusterAgentDeploymentCustomizations;
        this.defaultClusterRoleForProjectMembers = $.defaultClusterRoleForProjectMembers;
        this.defaultPodSecurityAdmissionConfigurationTemplateName = $.defaultPodSecurityAdmissionConfigurationTemplateName;
        this.enableNetworkPolicy = $.enableNetworkPolicy;
        this.fleetAgentDeploymentCustomizations = $.fleetAgentDeploymentCustomizations;
        this.fleetNamespace = $.fleetNamespace;
        this.kubernetesVersion = $.kubernetesVersion;
        this.labels = $.labels;
        this.localAuthEndpoint = $.localAuthEndpoint;
        this.name = $.name;
        this.rkeConfig = $.rkeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2Args $;

        public Builder() {
            $ = new ClusterV2Args();
        }

        public Builder(ClusterV2Args defaults) {
            $ = new ClusterV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentEnvVars Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(@Nullable Output<List<ClusterV2AgentEnvVarArgs>> agentEnvVars) {
            $.agentEnvVars = agentEnvVars;
            return this;
        }

        /**
         * @param agentEnvVars Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(List<ClusterV2AgentEnvVarArgs> agentEnvVars) {
            return agentEnvVars(Output.of(agentEnvVars));
        }

        /**
         * @param agentEnvVars Agent env vars is a list of additional environment variables to be appended to the `cattle-cluster-agent` and `fleet-agent` deployment, and the plan for the [system upgrade controller](https://github.com/rancher/system-upgrade-controller) to upgrade nodes.
         * 
         * @return builder
         * 
         */
        public Builder agentEnvVars(ClusterV2AgentEnvVarArgs... agentEnvVars) {
            return agentEnvVars(List.of(agentEnvVars));
        }

        /**
         * @param annotations Annotations for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param cloudCredentialSecretName Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(@Nullable Output<String> cloudCredentialSecretName) {
            $.cloudCredentialSecretName = cloudCredentialSecretName;
            return this;
        }

        /**
         * @param cloudCredentialSecretName Cloud credential secret name is the secret to be used when a cloud credential secret name is not specified at the machine pool level.
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(String cloudCredentialSecretName) {
            return cloudCredentialSecretName(Output.of(cloudCredentialSecretName));
        }

        /**
         * @param clusterAgentDeploymentCustomizations Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder clusterAgentDeploymentCustomizations(@Nullable Output<List<ClusterV2ClusterAgentDeploymentCustomizationArgs>> clusterAgentDeploymentCustomizations) {
            $.clusterAgentDeploymentCustomizations = clusterAgentDeploymentCustomizations;
            return this;
        }

        /**
         * @param clusterAgentDeploymentCustomizations Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder clusterAgentDeploymentCustomizations(List<ClusterV2ClusterAgentDeploymentCustomizationArgs> clusterAgentDeploymentCustomizations) {
            return clusterAgentDeploymentCustomizations(Output.of(clusterAgentDeploymentCustomizations));
        }

        /**
         * @param clusterAgentDeploymentCustomizations Cluster agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `cattle-cluster-agent` deployment. This argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder clusterAgentDeploymentCustomizations(ClusterV2ClusterAgentDeploymentCustomizationArgs... clusterAgentDeploymentCustomizations) {
            return clusterAgentDeploymentCustomizations(List.of(clusterAgentDeploymentCustomizations));
        }

        /**
         * @param defaultClusterRoleForProjectMembers Default cluster role for project members.
         * 
         * @return builder
         * 
         */
        public Builder defaultClusterRoleForProjectMembers(@Nullable Output<String> defaultClusterRoleForProjectMembers) {
            $.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
            return this;
        }

        /**
         * @param defaultClusterRoleForProjectMembers Default cluster role for project members.
         * 
         * @return builder
         * 
         */
        public Builder defaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
            return defaultClusterRoleForProjectMembers(Output.of(defaultClusterRoleForProjectMembers));
        }

        /**
         * @param defaultPodSecurityAdmissionConfigurationTemplateName The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
         * 
         * @return builder
         * 
         */
        public Builder defaultPodSecurityAdmissionConfigurationTemplateName(@Nullable Output<String> defaultPodSecurityAdmissionConfigurationTemplateName) {
            $.defaultPodSecurityAdmissionConfigurationTemplateName = defaultPodSecurityAdmissionConfigurationTemplateName;
            return this;
        }

        /**
         * @param defaultPodSecurityAdmissionConfigurationTemplateName The name of the pre-defined pod security admission configuration template to be applied to the cluster. Rancher admins (or those with the right permissions) can create, manage, and edit those templates. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/authentication-permissions-and-global-configuration/psa-config-templates). The argument is available in Rancher v2.7.2 and above.
         * 
         * @return builder
         * 
         */
        public Builder defaultPodSecurityAdmissionConfigurationTemplateName(String defaultPodSecurityAdmissionConfigurationTemplateName) {
            return defaultPodSecurityAdmissionConfigurationTemplateName(Output.of(defaultPodSecurityAdmissionConfigurationTemplateName));
        }

        /**
         * @param enableNetworkPolicy Enable k8s network policy on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkPolicy(@Nullable Output<Boolean> enableNetworkPolicy) {
            $.enableNetworkPolicy = enableNetworkPolicy;
            return this;
        }

        /**
         * @param enableNetworkPolicy Enable k8s network policy on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkPolicy(Boolean enableNetworkPolicy) {
            return enableNetworkPolicy(Output.of(enableNetworkPolicy));
        }

        /**
         * @param fleetAgentDeploymentCustomizations Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder fleetAgentDeploymentCustomizations(@Nullable Output<List<ClusterV2FleetAgentDeploymentCustomizationArgs>> fleetAgentDeploymentCustomizations) {
            $.fleetAgentDeploymentCustomizations = fleetAgentDeploymentCustomizations;
            return this;
        }

        /**
         * @param fleetAgentDeploymentCustomizations Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder fleetAgentDeploymentCustomizations(List<ClusterV2FleetAgentDeploymentCustomizationArgs> fleetAgentDeploymentCustomizations) {
            return fleetAgentDeploymentCustomizations(Output.of(fleetAgentDeploymentCustomizations));
        }

        /**
         * @param fleetAgentDeploymentCustomizations Fleet agent deployment customization specifies the additional tolerations, new affinity rules, and new resource requirements on the `fleet-agent` deployment. The argument is available in Rancher v2.7.5 and above.
         * 
         * @return builder
         * 
         */
        public Builder fleetAgentDeploymentCustomizations(ClusterV2FleetAgentDeploymentCustomizationArgs... fleetAgentDeploymentCustomizations) {
            return fleetAgentDeploymentCustomizations(List.of(fleetAgentDeploymentCustomizations));
        }

        /**
         * @param fleetNamespace Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
         * 
         * @return builder
         * 
         */
        public Builder fleetNamespace(@Nullable Output<String> fleetNamespace) {
            $.fleetNamespace = fleetNamespace;
            return this;
        }

        /**
         * @param fleetNamespace Fleet namespace is the namespace where the cluster is to create in the local cluster. It is recommended to leave it as the default value.
         * 
         * @return builder
         * 
         */
        public Builder fleetNamespace(String fleetNamespace) {
            return fleetNamespace(Output.of(fleetNamespace));
        }

        /**
         * @param kubernetesVersion The RKE2 or K3s version for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The RKE2 or K3s version for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param labels Labels for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param localAuthEndpoint Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
         * 
         * @return builder
         * 
         */
        public Builder localAuthEndpoint(@Nullable Output<ClusterV2LocalAuthEndpointArgs> localAuthEndpoint) {
            $.localAuthEndpoint = localAuthEndpoint;
            return this;
        }

        /**
         * @param localAuthEndpoint Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
         * 
         * @return builder
         * 
         */
        public Builder localAuthEndpoint(ClusterV2LocalAuthEndpointArgs localAuthEndpoint) {
            return localAuthEndpoint(Output.of(localAuthEndpoint));
        }

        /**
         * @param name The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rkeConfig The RKE configuration for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder rkeConfig(@Nullable Output<ClusterV2RkeConfigArgs> rkeConfig) {
            $.rkeConfig = rkeConfig;
            return this;
        }

        /**
         * @param rkeConfig The RKE configuration for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder rkeConfig(ClusterV2RkeConfigArgs rkeConfig) {
            return rkeConfig(Output.of(rkeConfig));
        }

        public ClusterV2Args build() {
            if ($.kubernetesVersion == null) {
                throw new MissingRequiredPropertyException("ClusterV2Args", "kubernetesVersion");
            }
            return $;
        }
    }

}
