// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterAksConfig;
import com.pulumi.rancher2.outputs.GetClusterAksConfigV2;
import com.pulumi.rancher2.outputs.GetClusterClusterAuthEndpoint;
import com.pulumi.rancher2.outputs.GetClusterClusterMonitoringInput;
import com.pulumi.rancher2.outputs.GetClusterClusterRegistrationToken;
import com.pulumi.rancher2.outputs.GetClusterClusterTemplateAnswers;
import com.pulumi.rancher2.outputs.GetClusterClusterTemplateQuestion;
import com.pulumi.rancher2.outputs.GetClusterEksConfig;
import com.pulumi.rancher2.outputs.GetClusterEksConfigV2;
import com.pulumi.rancher2.outputs.GetClusterGkeConfig;
import com.pulumi.rancher2.outputs.GetClusterGkeConfigV2;
import com.pulumi.rancher2.outputs.GetClusterK3sConfig;
import com.pulumi.rancher2.outputs.GetClusterOkeConfig;
import com.pulumi.rancher2.outputs.GetClusterRke2Config;
import com.pulumi.rancher2.outputs.GetClusterRkeConfig;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * @return (Computed) Optional Agent Env Vars for Rancher agent. For Rancher v2.5.6 and above (list)
     * 
     */
    private List<String> agentEnvVars;
    /**
     * @return (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterAksConfig aksConfig;
    /**
     * @return (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aks_config`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterAksConfigV2 aksConfigV2;
    /**
     * @return (Computed) Annotations for Node Pool object (map)
     * 
     */
    private Map<String,Object> annotations;
    /**
     * @return (Computed) K8s cluster ca cert (string)
     * 
     */
    private String caCert;
    /**
     * @return (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
     * 
     */
    private GetClusterClusterAuthEndpoint clusterAuthEndpoint;
    /**
     * @return (Computed) Cluster monitoring config (list maxitems:1)
     * 
     */
    private GetClusterClusterMonitoringInput clusterMonitoringInput;
    /**
     * @return (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
     * 
     */
    private GetClusterClusterRegistrationToken clusterRegistrationToken;
    /**
     * @return (Computed) Cluster template answers (list maxitems:1)
     * 
     */
    private GetClusterClusterTemplateAnswers clusterTemplateAnswers;
    /**
     * @return (Computed) Cluster template ID (string)
     * 
     */
    private String clusterTemplateId;
    /**
     * @return (Computed) Cluster template questions (list)
     * 
     */
    private List<GetClusterClusterTemplateQuestion> clusterTemplateQuestions;
    /**
     * @return (Computed) Cluster template revision ID (string)
     * 
     */
    private String clusterTemplateRevisionId;
    private String defaultPodSecurityAdmissionConfigurationTemplateName;
    /**
     * @return (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
     * 
     */
    private String defaultPodSecurityPolicyTemplateId;
    /**
     * @return (Computed) Default project ID for the cluster (string)
     * 
     */
    private String defaultProjectId;
    /**
     * @return (Computed) The description for Cluster (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
     * 
     */
    private String driver;
    /**
     * @return (Computed) The Amazon eks configuration for `eks` Conflicts with `aks_config`, `aks_config_v2`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterEksConfig eksConfig;
    /**
     * @return (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.x and above (list maxitems:1)
     * 
     */
    private GetClusterEksConfigV2 eksConfigV2;
    private Boolean enableClusterAlerting;
    /**
     * @return (Computed) Enable built-in cluster monitoring. Default `false` (bool)
     * 
     */
    private Boolean enableClusterMonitoring;
    /**
     * @return (Computed) Enable project network isolation. Default `false` (bool)
     * 
     */
    private Boolean enableNetworkPolicy;
    /**
     * @return (Computed) Fleet workspace name (string)
     * 
     */
    private String fleetWorkspaceName;
    /**
     * @return (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1) (list maxitems:1)
     * 
     */
    private GetClusterGkeConfig gkeConfig;
    /**
     * @return (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.8 and above (list maxitems:1)
     * 
     */
    private GetClusterGkeConfigV2 gkeConfigV2;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterK3sConfig k3sConfig;
    /**
     * @return (Computed) Kube Config generated for the cluster (string)
     * 
     */
    private String kubeConfig;
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    private Map<String,Object> labels;
    private String name;
    /**
     * @return (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterOkeConfig okeConfig;
    /**
     * @return (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    private GetClusterRke2Config rke2Config;
    /**
     * @return (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `k3s_config` (list maxitems:1)
     * 
     */
    private GetClusterRkeConfig rkeConfig;
    /**
     * @return (Computed) System project ID for the cluster (string)
     * 
     */
    private String systemProjectId;

    private GetClusterResult() {}
    /**
     * @return (Computed) Optional Agent Env Vars for Rancher agent. For Rancher v2.5.6 and above (list)
     * 
     */
    public List<String> agentEnvVars() {
        return this.agentEnvVars;
    }
    /**
     * @return (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterAksConfig aksConfig() {
        return this.aksConfig;
    }
    /**
     * @return (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aks_config`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterAksConfigV2 aksConfigV2() {
        return this.aksConfigV2;
    }
    /**
     * @return (Computed) Annotations for Node Pool object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) K8s cluster ca cert (string)
     * 
     */
    public String caCert() {
        return this.caCert;
    }
    /**
     * @return (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
     * 
     */
    public GetClusterClusterAuthEndpoint clusterAuthEndpoint() {
        return this.clusterAuthEndpoint;
    }
    /**
     * @return (Computed) Cluster monitoring config (list maxitems:1)
     * 
     */
    public GetClusterClusterMonitoringInput clusterMonitoringInput() {
        return this.clusterMonitoringInput;
    }
    /**
     * @return (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
     * 
     */
    public GetClusterClusterRegistrationToken clusterRegistrationToken() {
        return this.clusterRegistrationToken;
    }
    /**
     * @return (Computed) Cluster template answers (list maxitems:1)
     * 
     */
    public GetClusterClusterTemplateAnswers clusterTemplateAnswers() {
        return this.clusterTemplateAnswers;
    }
    /**
     * @return (Computed) Cluster template ID (string)
     * 
     */
    public String clusterTemplateId() {
        return this.clusterTemplateId;
    }
    /**
     * @return (Computed) Cluster template questions (list)
     * 
     */
    public List<GetClusterClusterTemplateQuestion> clusterTemplateQuestions() {
        return this.clusterTemplateQuestions;
    }
    /**
     * @return (Computed) Cluster template revision ID (string)
     * 
     */
    public String clusterTemplateRevisionId() {
        return this.clusterTemplateRevisionId;
    }
    public String defaultPodSecurityAdmissionConfigurationTemplateName() {
        return this.defaultPodSecurityAdmissionConfigurationTemplateName;
    }
    /**
     * @return (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
     * 
     */
    public String defaultPodSecurityPolicyTemplateId() {
        return this.defaultPodSecurityPolicyTemplateId;
    }
    /**
     * @return (Computed) Default project ID for the cluster (string)
     * 
     */
    public String defaultProjectId() {
        return this.defaultProjectId;
    }
    /**
     * @return (Computed) The description for Cluster (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
     * 
     */
    public String driver() {
        return this.driver;
    }
    /**
     * @return (Computed) The Amazon eks configuration for `eks` Conflicts with `aks_config`, `aks_config_v2`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterEksConfig eksConfig() {
        return this.eksConfig;
    }
    /**
     * @return (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.x and above (list maxitems:1)
     * 
     */
    public GetClusterEksConfigV2 eksConfigV2() {
        return this.eksConfigV2;
    }
    public Boolean enableClusterAlerting() {
        return this.enableClusterAlerting;
    }
    /**
     * @return (Computed) Enable built-in cluster monitoring. Default `false` (bool)
     * 
     */
    public Boolean enableClusterMonitoring() {
        return this.enableClusterMonitoring;
    }
    /**
     * @return (Computed) Enable project network isolation. Default `false` (bool)
     * 
     */
    public Boolean enableNetworkPolicy() {
        return this.enableNetworkPolicy;
    }
    /**
     * @return (Computed) Fleet workspace name (string)
     * 
     */
    public String fleetWorkspaceName() {
        return this.fleetWorkspaceName;
    }
    /**
     * @return (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1) (list maxitems:1)
     * 
     */
    public GetClusterGkeConfig gkeConfig() {
        return this.gkeConfig;
    }
    /**
     * @return (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.8 and above (list maxitems:1)
     * 
     */
    public GetClusterGkeConfigV2 gkeConfigV2() {
        return this.gkeConfigV2;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterK3sConfig k3sConfig() {
        return this.k3sConfig;
    }
    /**
     * @return (Computed) Kube Config generated for the cluster (string)
     * 
     */
    public String kubeConfig() {
        return this.kubeConfig;
    }
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterOkeConfig okeConfig() {
        return this.okeConfig;
    }
    /**
     * @return (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
     * 
     */
    public GetClusterRke2Config rke2Config() {
        return this.rke2Config;
    }
    /**
     * @return (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `k3s_config` (list maxitems:1)
     * 
     */
    public GetClusterRkeConfig rkeConfig() {
        return this.rkeConfig;
    }
    /**
     * @return (Computed) System project ID for the cluster (string)
     * 
     */
    public String systemProjectId() {
        return this.systemProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> agentEnvVars;
        private GetClusterAksConfig aksConfig;
        private GetClusterAksConfigV2 aksConfigV2;
        private Map<String,Object> annotations;
        private String caCert;
        private GetClusterClusterAuthEndpoint clusterAuthEndpoint;
        private GetClusterClusterMonitoringInput clusterMonitoringInput;
        private GetClusterClusterRegistrationToken clusterRegistrationToken;
        private GetClusterClusterTemplateAnswers clusterTemplateAnswers;
        private String clusterTemplateId;
        private List<GetClusterClusterTemplateQuestion> clusterTemplateQuestions;
        private String clusterTemplateRevisionId;
        private String defaultPodSecurityAdmissionConfigurationTemplateName;
        private String defaultPodSecurityPolicyTemplateId;
        private String defaultProjectId;
        private String description;
        private String driver;
        private GetClusterEksConfig eksConfig;
        private GetClusterEksConfigV2 eksConfigV2;
        private Boolean enableClusterAlerting;
        private Boolean enableClusterMonitoring;
        private Boolean enableNetworkPolicy;
        private String fleetWorkspaceName;
        private GetClusterGkeConfig gkeConfig;
        private GetClusterGkeConfigV2 gkeConfigV2;
        private String id;
        private GetClusterK3sConfig k3sConfig;
        private String kubeConfig;
        private Map<String,Object> labels;
        private String name;
        private GetClusterOkeConfig okeConfig;
        private GetClusterRke2Config rke2Config;
        private GetClusterRkeConfig rkeConfig;
        private String systemProjectId;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentEnvVars = defaults.agentEnvVars;
    	      this.aksConfig = defaults.aksConfig;
    	      this.aksConfigV2 = defaults.aksConfigV2;
    	      this.annotations = defaults.annotations;
    	      this.caCert = defaults.caCert;
    	      this.clusterAuthEndpoint = defaults.clusterAuthEndpoint;
    	      this.clusterMonitoringInput = defaults.clusterMonitoringInput;
    	      this.clusterRegistrationToken = defaults.clusterRegistrationToken;
    	      this.clusterTemplateAnswers = defaults.clusterTemplateAnswers;
    	      this.clusterTemplateId = defaults.clusterTemplateId;
    	      this.clusterTemplateQuestions = defaults.clusterTemplateQuestions;
    	      this.clusterTemplateRevisionId = defaults.clusterTemplateRevisionId;
    	      this.defaultPodSecurityAdmissionConfigurationTemplateName = defaults.defaultPodSecurityAdmissionConfigurationTemplateName;
    	      this.defaultPodSecurityPolicyTemplateId = defaults.defaultPodSecurityPolicyTemplateId;
    	      this.defaultProjectId = defaults.defaultProjectId;
    	      this.description = defaults.description;
    	      this.driver = defaults.driver;
    	      this.eksConfig = defaults.eksConfig;
    	      this.eksConfigV2 = defaults.eksConfigV2;
    	      this.enableClusterAlerting = defaults.enableClusterAlerting;
    	      this.enableClusterMonitoring = defaults.enableClusterMonitoring;
    	      this.enableNetworkPolicy = defaults.enableNetworkPolicy;
    	      this.fleetWorkspaceName = defaults.fleetWorkspaceName;
    	      this.gkeConfig = defaults.gkeConfig;
    	      this.gkeConfigV2 = defaults.gkeConfigV2;
    	      this.id = defaults.id;
    	      this.k3sConfig = defaults.k3sConfig;
    	      this.kubeConfig = defaults.kubeConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.okeConfig = defaults.okeConfig;
    	      this.rke2Config = defaults.rke2Config;
    	      this.rkeConfig = defaults.rkeConfig;
    	      this.systemProjectId = defaults.systemProjectId;
        }

        @CustomType.Setter
        public Builder agentEnvVars(List<String> agentEnvVars) {
            this.agentEnvVars = Objects.requireNonNull(agentEnvVars);
            return this;
        }
        public Builder agentEnvVars(String... agentEnvVars) {
            return agentEnvVars(List.of(agentEnvVars));
        }
        @CustomType.Setter
        public Builder aksConfig(GetClusterAksConfig aksConfig) {
            this.aksConfig = Objects.requireNonNull(aksConfig);
            return this;
        }
        @CustomType.Setter
        public Builder aksConfigV2(GetClusterAksConfigV2 aksConfigV2) {
            this.aksConfigV2 = Objects.requireNonNull(aksConfigV2);
            return this;
        }
        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder caCert(String caCert) {
            this.caCert = Objects.requireNonNull(caCert);
            return this;
        }
        @CustomType.Setter
        public Builder clusterAuthEndpoint(GetClusterClusterAuthEndpoint clusterAuthEndpoint) {
            this.clusterAuthEndpoint = Objects.requireNonNull(clusterAuthEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder clusterMonitoringInput(GetClusterClusterMonitoringInput clusterMonitoringInput) {
            this.clusterMonitoringInput = Objects.requireNonNull(clusterMonitoringInput);
            return this;
        }
        @CustomType.Setter
        public Builder clusterRegistrationToken(GetClusterClusterRegistrationToken clusterRegistrationToken) {
            this.clusterRegistrationToken = Objects.requireNonNull(clusterRegistrationToken);
            return this;
        }
        @CustomType.Setter
        public Builder clusterTemplateAnswers(GetClusterClusterTemplateAnswers clusterTemplateAnswers) {
            this.clusterTemplateAnswers = Objects.requireNonNull(clusterTemplateAnswers);
            return this;
        }
        @CustomType.Setter
        public Builder clusterTemplateId(String clusterTemplateId) {
            this.clusterTemplateId = Objects.requireNonNull(clusterTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder clusterTemplateQuestions(List<GetClusterClusterTemplateQuestion> clusterTemplateQuestions) {
            this.clusterTemplateQuestions = Objects.requireNonNull(clusterTemplateQuestions);
            return this;
        }
        public Builder clusterTemplateQuestions(GetClusterClusterTemplateQuestion... clusterTemplateQuestions) {
            return clusterTemplateQuestions(List.of(clusterTemplateQuestions));
        }
        @CustomType.Setter
        public Builder clusterTemplateRevisionId(String clusterTemplateRevisionId) {
            this.clusterTemplateRevisionId = Objects.requireNonNull(clusterTemplateRevisionId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultPodSecurityAdmissionConfigurationTemplateName(String defaultPodSecurityAdmissionConfigurationTemplateName) {
            this.defaultPodSecurityAdmissionConfigurationTemplateName = Objects.requireNonNull(defaultPodSecurityAdmissionConfigurationTemplateName);
            return this;
        }
        @CustomType.Setter
        public Builder defaultPodSecurityPolicyTemplateId(String defaultPodSecurityPolicyTemplateId) {
            this.defaultPodSecurityPolicyTemplateId = Objects.requireNonNull(defaultPodSecurityPolicyTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultProjectId(String defaultProjectId) {
            this.defaultProjectId = Objects.requireNonNull(defaultProjectId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder driver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        @CustomType.Setter
        public Builder eksConfig(GetClusterEksConfig eksConfig) {
            this.eksConfig = Objects.requireNonNull(eksConfig);
            return this;
        }
        @CustomType.Setter
        public Builder eksConfigV2(GetClusterEksConfigV2 eksConfigV2) {
            this.eksConfigV2 = Objects.requireNonNull(eksConfigV2);
            return this;
        }
        @CustomType.Setter
        public Builder enableClusterAlerting(Boolean enableClusterAlerting) {
            this.enableClusterAlerting = Objects.requireNonNull(enableClusterAlerting);
            return this;
        }
        @CustomType.Setter
        public Builder enableClusterMonitoring(Boolean enableClusterMonitoring) {
            this.enableClusterMonitoring = Objects.requireNonNull(enableClusterMonitoring);
            return this;
        }
        @CustomType.Setter
        public Builder enableNetworkPolicy(Boolean enableNetworkPolicy) {
            this.enableNetworkPolicy = Objects.requireNonNull(enableNetworkPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder fleetWorkspaceName(String fleetWorkspaceName) {
            this.fleetWorkspaceName = Objects.requireNonNull(fleetWorkspaceName);
            return this;
        }
        @CustomType.Setter
        public Builder gkeConfig(GetClusterGkeConfig gkeConfig) {
            this.gkeConfig = Objects.requireNonNull(gkeConfig);
            return this;
        }
        @CustomType.Setter
        public Builder gkeConfigV2(GetClusterGkeConfigV2 gkeConfigV2) {
            this.gkeConfigV2 = Objects.requireNonNull(gkeConfigV2);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder k3sConfig(GetClusterK3sConfig k3sConfig) {
            this.k3sConfig = Objects.requireNonNull(k3sConfig);
            return this;
        }
        @CustomType.Setter
        public Builder kubeConfig(String kubeConfig) {
            this.kubeConfig = Objects.requireNonNull(kubeConfig);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder okeConfig(GetClusterOkeConfig okeConfig) {
            this.okeConfig = Objects.requireNonNull(okeConfig);
            return this;
        }
        @CustomType.Setter
        public Builder rke2Config(GetClusterRke2Config rke2Config) {
            this.rke2Config = Objects.requireNonNull(rke2Config);
            return this;
        }
        @CustomType.Setter
        public Builder rkeConfig(GetClusterRkeConfig rkeConfig) {
            this.rkeConfig = Objects.requireNonNull(rkeConfig);
            return this;
        }
        @CustomType.Setter
        public Builder systemProjectId(String systemProjectId) {
            this.systemProjectId = Objects.requireNonNull(systemProjectId);
            return this;
        }
        public GetClusterResult build() {
            final var o = new GetClusterResult();
            o.agentEnvVars = agentEnvVars;
            o.aksConfig = aksConfig;
            o.aksConfigV2 = aksConfigV2;
            o.annotations = annotations;
            o.caCert = caCert;
            o.clusterAuthEndpoint = clusterAuthEndpoint;
            o.clusterMonitoringInput = clusterMonitoringInput;
            o.clusterRegistrationToken = clusterRegistrationToken;
            o.clusterTemplateAnswers = clusterTemplateAnswers;
            o.clusterTemplateId = clusterTemplateId;
            o.clusterTemplateQuestions = clusterTemplateQuestions;
            o.clusterTemplateRevisionId = clusterTemplateRevisionId;
            o.defaultPodSecurityAdmissionConfigurationTemplateName = defaultPodSecurityAdmissionConfigurationTemplateName;
            o.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
            o.defaultProjectId = defaultProjectId;
            o.description = description;
            o.driver = driver;
            o.eksConfig = eksConfig;
            o.eksConfigV2 = eksConfigV2;
            o.enableClusterAlerting = enableClusterAlerting;
            o.enableClusterMonitoring = enableClusterMonitoring;
            o.enableNetworkPolicy = enableNetworkPolicy;
            o.fleetWorkspaceName = fleetWorkspaceName;
            o.gkeConfig = gkeConfig;
            o.gkeConfigV2 = gkeConfigV2;
            o.id = id;
            o.k3sConfig = k3sConfig;
            o.kubeConfig = kubeConfig;
            o.labels = labels;
            o.name = name;
            o.okeConfig = okeConfig;
            o.rke2Config = rke2Config;
            o.rkeConfig = rkeConfig;
            o.systemProjectId = systemProjectId;
            return o;
        }
    }
}
