// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterAksConfigV2NodePool;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterAksConfigV2 {
    /**
     * @return The AKS auth base url
     * 
     */
    private @Nullable String authBaseUrl;
    /**
     * @return The AKS authorized ip ranges
     * 
     */
    private @Nullable List<String> authorizedIpRanges;
    /**
     * @return The AKS base url
     * 
     */
    private @Nullable String baseUrl;
    /**
     * @return The AKS Cloud Credential ID to use
     * 
     */
    private String cloudCredentialId;
    /**
     * @return The AKS dns prefix. Required if `import=false`
     * 
     */
    private @Nullable String dnsPrefix;
    /**
     * @return Enable AKS http application routing?
     * 
     */
    private Boolean httpApplicationRouting;
    /**
     * @return Is AKS cluster imported?
     * 
     */
    private @Nullable Boolean imported;
    /**
     * @return The kubernetes master version. Required if `import=false`
     * 
     */
    private @Nullable String kubernetesVersion;
    /**
     * @return The AKS linux admin username
     * 
     */
    private String linuxAdminUsername;
    /**
     * @return The AKS linux ssh public key
     * 
     */
    private String linuxSshPublicKey;
    /**
     * @return The AKS load balancer sku
     * 
     */
    private String loadBalancerSku;
    /**
     * @return The AKS log analytics workspace group
     * 
     */
    private String logAnalyticsWorkspaceGroup;
    /**
     * @return The AKS log analytics workspace name
     * 
     */
    private String logAnalyticsWorkspaceName;
    /**
     * @return Is AKS cluster monitoring enabled?
     * 
     */
    private Boolean monitoring;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private String name;
    /**
     * @return The AKS network dns service ip
     * 
     */
    private String networkDnsServiceIp;
    /**
     * @return The AKS network docker bridge cidr
     * 
     */
    private String networkDockerBridgeCidr;
    /**
     * @return The AKS network plugin. Required if `import=false`
     * 
     */
    private @Nullable String networkPlugin;
    /**
     * @return The AKS network pod cidr
     * 
     */
    private String networkPodCidr;
    /**
     * @return The AKS network policy
     * 
     */
    private String networkPolicy;
    /**
     * @return The AKS network service cidr
     * 
     */
    private String networkServiceCidr;
    /**
     * @return The AKS node pools to use. Required if `import=false`
     * 
     */
    private @Nullable List<GetClusterAksConfigV2NodePool> nodePools;
    /**
     * @return The AKS node resource group name
     * 
     */
    private String nodeResourceGroup;
    /**
     * @return Is AKS cluster private?
     * 
     */
    private Boolean privateCluster;
    /**
     * @return The AKS resource group
     * 
     */
    private String resourceGroup;
    /**
     * @return The AKS resource location
     * 
     */
    private String resourceLocation;
    /**
     * @return The AKS subnet
     * 
     */
    private String subnet;
    /**
     * @return The AKS cluster tags
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The AKS virtual network
     * 
     */
    private String virtualNetwork;
    /**
     * @return The AKS virtual network resource group
     * 
     */
    private String virtualNetworkResourceGroup;

    private GetClusterAksConfigV2() {}
    /**
     * @return The AKS auth base url
     * 
     */
    public Optional<String> authBaseUrl() {
        return Optional.ofNullable(this.authBaseUrl);
    }
    /**
     * @return The AKS authorized ip ranges
     * 
     */
    public List<String> authorizedIpRanges() {
        return this.authorizedIpRanges == null ? List.of() : this.authorizedIpRanges;
    }
    /**
     * @return The AKS base url
     * 
     */
    public Optional<String> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }
    /**
     * @return The AKS Cloud Credential ID to use
     * 
     */
    public String cloudCredentialId() {
        return this.cloudCredentialId;
    }
    /**
     * @return The AKS dns prefix. Required if `import=false`
     * 
     */
    public Optional<String> dnsPrefix() {
        return Optional.ofNullable(this.dnsPrefix);
    }
    /**
     * @return Enable AKS http application routing?
     * 
     */
    public Boolean httpApplicationRouting() {
        return this.httpApplicationRouting;
    }
    /**
     * @return Is AKS cluster imported?
     * 
     */
    public Optional<Boolean> imported() {
        return Optional.ofNullable(this.imported);
    }
    /**
     * @return The kubernetes master version. Required if `import=false`
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return The AKS linux admin username
     * 
     */
    public String linuxAdminUsername() {
        return this.linuxAdminUsername;
    }
    /**
     * @return The AKS linux ssh public key
     * 
     */
    public String linuxSshPublicKey() {
        return this.linuxSshPublicKey;
    }
    /**
     * @return The AKS load balancer sku
     * 
     */
    public String loadBalancerSku() {
        return this.loadBalancerSku;
    }
    /**
     * @return The AKS log analytics workspace group
     * 
     */
    public String logAnalyticsWorkspaceGroup() {
        return this.logAnalyticsWorkspaceGroup;
    }
    /**
     * @return The AKS log analytics workspace name
     * 
     */
    public String logAnalyticsWorkspaceName() {
        return this.logAnalyticsWorkspaceName;
    }
    /**
     * @return Is AKS cluster monitoring enabled?
     * 
     */
    public Boolean monitoring() {
        return this.monitoring;
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The AKS network dns service ip
     * 
     */
    public String networkDnsServiceIp() {
        return this.networkDnsServiceIp;
    }
    /**
     * @return The AKS network docker bridge cidr
     * 
     */
    public String networkDockerBridgeCidr() {
        return this.networkDockerBridgeCidr;
    }
    /**
     * @return The AKS network plugin. Required if `import=false`
     * 
     */
    public Optional<String> networkPlugin() {
        return Optional.ofNullable(this.networkPlugin);
    }
    /**
     * @return The AKS network pod cidr
     * 
     */
    public String networkPodCidr() {
        return this.networkPodCidr;
    }
    /**
     * @return The AKS network policy
     * 
     */
    public String networkPolicy() {
        return this.networkPolicy;
    }
    /**
     * @return The AKS network service cidr
     * 
     */
    public String networkServiceCidr() {
        return this.networkServiceCidr;
    }
    /**
     * @return The AKS node pools to use. Required if `import=false`
     * 
     */
    public List<GetClusterAksConfigV2NodePool> nodePools() {
        return this.nodePools == null ? List.of() : this.nodePools;
    }
    /**
     * @return The AKS node resource group name
     * 
     */
    public String nodeResourceGroup() {
        return this.nodeResourceGroup;
    }
    /**
     * @return Is AKS cluster private?
     * 
     */
    public Boolean privateCluster() {
        return this.privateCluster;
    }
    /**
     * @return The AKS resource group
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return The AKS resource location
     * 
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }
    /**
     * @return The AKS subnet
     * 
     */
    public String subnet() {
        return this.subnet;
    }
    /**
     * @return The AKS cluster tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The AKS virtual network
     * 
     */
    public String virtualNetwork() {
        return this.virtualNetwork;
    }
    /**
     * @return The AKS virtual network resource group
     * 
     */
    public String virtualNetworkResourceGroup() {
        return this.virtualNetworkResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAksConfigV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authBaseUrl;
        private @Nullable List<String> authorizedIpRanges;
        private @Nullable String baseUrl;
        private String cloudCredentialId;
        private @Nullable String dnsPrefix;
        private Boolean httpApplicationRouting;
        private @Nullable Boolean imported;
        private @Nullable String kubernetesVersion;
        private String linuxAdminUsername;
        private String linuxSshPublicKey;
        private String loadBalancerSku;
        private String logAnalyticsWorkspaceGroup;
        private String logAnalyticsWorkspaceName;
        private Boolean monitoring;
        private String name;
        private String networkDnsServiceIp;
        private String networkDockerBridgeCidr;
        private @Nullable String networkPlugin;
        private String networkPodCidr;
        private String networkPolicy;
        private String networkServiceCidr;
        private @Nullable List<GetClusterAksConfigV2NodePool> nodePools;
        private String nodeResourceGroup;
        private Boolean privateCluster;
        private String resourceGroup;
        private String resourceLocation;
        private String subnet;
        private Map<String,String> tags;
        private String virtualNetwork;
        private String virtualNetworkResourceGroup;
        public Builder() {}
        public Builder(GetClusterAksConfigV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authBaseUrl = defaults.authBaseUrl;
    	      this.authorizedIpRanges = defaults.authorizedIpRanges;
    	      this.baseUrl = defaults.baseUrl;
    	      this.cloudCredentialId = defaults.cloudCredentialId;
    	      this.dnsPrefix = defaults.dnsPrefix;
    	      this.httpApplicationRouting = defaults.httpApplicationRouting;
    	      this.imported = defaults.imported;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.linuxAdminUsername = defaults.linuxAdminUsername;
    	      this.linuxSshPublicKey = defaults.linuxSshPublicKey;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.logAnalyticsWorkspaceGroup = defaults.logAnalyticsWorkspaceGroup;
    	      this.logAnalyticsWorkspaceName = defaults.logAnalyticsWorkspaceName;
    	      this.monitoring = defaults.monitoring;
    	      this.name = defaults.name;
    	      this.networkDnsServiceIp = defaults.networkDnsServiceIp;
    	      this.networkDockerBridgeCidr = defaults.networkDockerBridgeCidr;
    	      this.networkPlugin = defaults.networkPlugin;
    	      this.networkPodCidr = defaults.networkPodCidr;
    	      this.networkPolicy = defaults.networkPolicy;
    	      this.networkServiceCidr = defaults.networkServiceCidr;
    	      this.nodePools = defaults.nodePools;
    	      this.nodeResourceGroup = defaults.nodeResourceGroup;
    	      this.privateCluster = defaults.privateCluster;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.virtualNetwork = defaults.virtualNetwork;
    	      this.virtualNetworkResourceGroup = defaults.virtualNetworkResourceGroup;
        }

        @CustomType.Setter
        public Builder authBaseUrl(@Nullable String authBaseUrl) {

            this.authBaseUrl = authBaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedIpRanges(@Nullable List<String> authorizedIpRanges) {

            this.authorizedIpRanges = authorizedIpRanges;
            return this;
        }
        public Builder authorizedIpRanges(String... authorizedIpRanges) {
            return authorizedIpRanges(List.of(authorizedIpRanges));
        }
        @CustomType.Setter
        public Builder baseUrl(@Nullable String baseUrl) {

            this.baseUrl = baseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCredentialId(String cloudCredentialId) {
            if (cloudCredentialId == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "cloudCredentialId");
            }
            this.cloudCredentialId = cloudCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder dnsPrefix(@Nullable String dnsPrefix) {

            this.dnsPrefix = dnsPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder httpApplicationRouting(Boolean httpApplicationRouting) {
            if (httpApplicationRouting == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "httpApplicationRouting");
            }
            this.httpApplicationRouting = httpApplicationRouting;
            return this;
        }
        @CustomType.Setter
        public Builder imported(@Nullable Boolean imported) {

            this.imported = imported;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {

            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder linuxAdminUsername(String linuxAdminUsername) {
            if (linuxAdminUsername == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "linuxAdminUsername");
            }
            this.linuxAdminUsername = linuxAdminUsername;
            return this;
        }
        @CustomType.Setter
        public Builder linuxSshPublicKey(String linuxSshPublicKey) {
            if (linuxSshPublicKey == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "linuxSshPublicKey");
            }
            this.linuxSshPublicKey = linuxSshPublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSku(String loadBalancerSku) {
            if (loadBalancerSku == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "loadBalancerSku");
            }
            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalyticsWorkspaceGroup(String logAnalyticsWorkspaceGroup) {
            if (logAnalyticsWorkspaceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "logAnalyticsWorkspaceGroup");
            }
            this.logAnalyticsWorkspaceGroup = logAnalyticsWorkspaceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalyticsWorkspaceName(String logAnalyticsWorkspaceName) {
            if (logAnalyticsWorkspaceName == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "logAnalyticsWorkspaceName");
            }
            this.logAnalyticsWorkspaceName = logAnalyticsWorkspaceName;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(Boolean monitoring) {
            if (monitoring == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "monitoring");
            }
            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkDnsServiceIp(String networkDnsServiceIp) {
            if (networkDnsServiceIp == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "networkDnsServiceIp");
            }
            this.networkDnsServiceIp = networkDnsServiceIp;
            return this;
        }
        @CustomType.Setter
        public Builder networkDockerBridgeCidr(String networkDockerBridgeCidr) {
            if (networkDockerBridgeCidr == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "networkDockerBridgeCidr");
            }
            this.networkDockerBridgeCidr = networkDockerBridgeCidr;
            return this;
        }
        @CustomType.Setter
        public Builder networkPlugin(@Nullable String networkPlugin) {

            this.networkPlugin = networkPlugin;
            return this;
        }
        @CustomType.Setter
        public Builder networkPodCidr(String networkPodCidr) {
            if (networkPodCidr == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "networkPodCidr");
            }
            this.networkPodCidr = networkPodCidr;
            return this;
        }
        @CustomType.Setter
        public Builder networkPolicy(String networkPolicy) {
            if (networkPolicy == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "networkPolicy");
            }
            this.networkPolicy = networkPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder networkServiceCidr(String networkServiceCidr) {
            if (networkServiceCidr == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "networkServiceCidr");
            }
            this.networkServiceCidr = networkServiceCidr;
            return this;
        }
        @CustomType.Setter
        public Builder nodePools(@Nullable List<GetClusterAksConfigV2NodePool> nodePools) {

            this.nodePools = nodePools;
            return this;
        }
        public Builder nodePools(GetClusterAksConfigV2NodePool... nodePools) {
            return nodePools(List.of(nodePools));
        }
        @CustomType.Setter
        public Builder nodeResourceGroup(String nodeResourceGroup) {
            if (nodeResourceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "nodeResourceGroup");
            }
            this.nodeResourceGroup = nodeResourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder privateCluster(Boolean privateCluster) {
            if (privateCluster == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "privateCluster");
            }
            this.privateCluster = privateCluster;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            if (resourceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "resourceGroup");
            }
            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder resourceLocation(String resourceLocation) {
            if (resourceLocation == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "resourceLocation");
            }
            this.resourceLocation = resourceLocation;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetwork(String virtualNetwork) {
            if (virtualNetwork == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "virtualNetwork");
            }
            this.virtualNetwork = virtualNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkResourceGroup(String virtualNetworkResourceGroup) {
            if (virtualNetworkResourceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2", "virtualNetworkResourceGroup");
            }
            this.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
            return this;
        }
        public GetClusterAksConfigV2 build() {
            final var _resultValue = new GetClusterAksConfigV2();
            _resultValue.authBaseUrl = authBaseUrl;
            _resultValue.authorizedIpRanges = authorizedIpRanges;
            _resultValue.baseUrl = baseUrl;
            _resultValue.cloudCredentialId = cloudCredentialId;
            _resultValue.dnsPrefix = dnsPrefix;
            _resultValue.httpApplicationRouting = httpApplicationRouting;
            _resultValue.imported = imported;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.linuxAdminUsername = linuxAdminUsername;
            _resultValue.linuxSshPublicKey = linuxSshPublicKey;
            _resultValue.loadBalancerSku = loadBalancerSku;
            _resultValue.logAnalyticsWorkspaceGroup = logAnalyticsWorkspaceGroup;
            _resultValue.logAnalyticsWorkspaceName = logAnalyticsWorkspaceName;
            _resultValue.monitoring = monitoring;
            _resultValue.name = name;
            _resultValue.networkDnsServiceIp = networkDnsServiceIp;
            _resultValue.networkDockerBridgeCidr = networkDockerBridgeCidr;
            _resultValue.networkPlugin = networkPlugin;
            _resultValue.networkPodCidr = networkPodCidr;
            _resultValue.networkPolicy = networkPolicy;
            _resultValue.networkServiceCidr = networkServiceCidr;
            _resultValue.nodePools = nodePools;
            _resultValue.nodeResourceGroup = nodeResourceGroup;
            _resultValue.privateCluster = privateCluster;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.resourceLocation = resourceLocation;
            _resultValue.subnet = subnet;
            _resultValue.tags = tags;
            _resultValue.virtualNetwork = virtualNetwork;
            _resultValue.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
            return _resultValue;
        }
    }
}
