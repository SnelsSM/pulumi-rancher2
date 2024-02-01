// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfig {
    /**
     * @return Optional duration in seconds of addon job.
     * 
     */
    private Integer addonJobTimeout;
    /**
     * @return Optional addons descripton to deploy on rke cluster.
     * 
     */
    private @Nullable String addons;
    /**
     * @return Optional addons yaml manisfest to deploy on rke cluster.
     * 
     */
    private @Nullable List<String> addonsIncludes;
    /**
     * @return Kubernetes cluster authentication
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication;
    /**
     * @return Kubernetes cluster authorization
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization;
    /**
     * @return RKE bastion host
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider;
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns;
    /**
     * @return Enable/disable using cri-dockerd
     * 
     */
    private @Nullable Boolean enableCriDockerd;
    /**
     * @return Optional ignore docker version on nodes
     * 
     */
    private @Nullable Boolean ignoreDockerVersion;
    /**
     * @return Kubernetes ingress configuration
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress;
    /**
     * @return Optional kubernetes version to deploy
     * 
     */
    private String kubernetesVersion;
    /**
     * @return Kubernetes cluster monitoring
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring;
    /**
     * @return Kubernetes cluster networking
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network;
    /**
     * @return Optional RKE cluster nodes
     * 
     */
    private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes;
    /**
     * @return Optional prefix to customize kubernetes path
     * 
     */
    private String prefixPath;
    /**
     * @return Optional private registries for docker images
     * 
     */
    private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries;
    /**
     * @return Kubernetes cluster services
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services;
    /**
     * @return Optional use ssh agent auth
     * 
     */
    private @Nullable Boolean sshAgentAuth;
    /**
     * @return Optional cluster level SSH certificate path
     * 
     */
    private String sshCertPath;
    /**
     * @return Optional cluster level SSH private key path
     * 
     */
    private String sshKeyPath;
    /**
     * @return RKE upgrade strategy
     * 
     */
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy;
    /**
     * @return Optional prefix to customize kubernetes path for windows nodes
     * 
     */
    private String winPrefixPath;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfig() {}
    /**
     * @return Optional duration in seconds of addon job.
     * 
     */
    public Integer addonJobTimeout() {
        return this.addonJobTimeout;
    }
    /**
     * @return Optional addons descripton to deploy on rke cluster.
     * 
     */
    public Optional<String> addons() {
        return Optional.ofNullable(this.addons);
    }
    /**
     * @return Optional addons yaml manisfest to deploy on rke cluster.
     * 
     */
    public List<String> addonsIncludes() {
        return this.addonsIncludes == null ? List.of() : this.addonsIncludes;
    }
    /**
     * @return Kubernetes cluster authentication
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication() {
        return this.authentication;
    }
    /**
     * @return Kubernetes cluster authorization
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization() {
        return this.authorization;
    }
    /**
     * @return RKE bastion host
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost() {
        return this.bastionHost;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider() {
        return this.cloudProvider;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns() {
        return this.dns;
    }
    /**
     * @return Enable/disable using cri-dockerd
     * 
     */
    public Optional<Boolean> enableCriDockerd() {
        return Optional.ofNullable(this.enableCriDockerd);
    }
    /**
     * @return Optional ignore docker version on nodes
     * 
     */
    public Optional<Boolean> ignoreDockerVersion() {
        return Optional.ofNullable(this.ignoreDockerVersion);
    }
    /**
     * @return Kubernetes ingress configuration
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress() {
        return this.ingress;
    }
    /**
     * @return Optional kubernetes version to deploy
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * @return Kubernetes cluster monitoring
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring() {
        return this.monitoring;
    }
    /**
     * @return Kubernetes cluster networking
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network() {
        return this.network;
    }
    /**
     * @return Optional RKE cluster nodes
     * 
     */
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return Optional prefix to customize kubernetes path
     * 
     */
    public String prefixPath() {
        return this.prefixPath;
    }
    /**
     * @return Optional private registries for docker images
     * 
     */
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries() {
        return this.privateRegistries == null ? List.of() : this.privateRegistries;
    }
    /**
     * @return Kubernetes cluster services
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services() {
        return this.services;
    }
    /**
     * @return Optional use ssh agent auth
     * 
     */
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    /**
     * @return Optional cluster level SSH certificate path
     * 
     */
    public String sshCertPath() {
        return this.sshCertPath;
    }
    /**
     * @return Optional cluster level SSH private key path
     * 
     */
    public String sshKeyPath() {
        return this.sshKeyPath;
    }
    /**
     * @return RKE upgrade strategy
     * 
     */
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy() {
        return this.upgradeStrategy;
    }
    /**
     * @return Optional prefix to customize kubernetes path for windows nodes
     * 
     */
    public String winPrefixPath() {
        return this.winPrefixPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer addonJobTimeout;
        private @Nullable String addons;
        private @Nullable List<String> addonsIncludes;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns;
        private @Nullable Boolean enableCriDockerd;
        private @Nullable Boolean ignoreDockerVersion;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress;
        private String kubernetesVersion;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes;
        private String prefixPath;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services;
        private @Nullable Boolean sshAgentAuth;
        private String sshCertPath;
        private String sshKeyPath;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy;
        private String winPrefixPath;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonJobTimeout = defaults.addonJobTimeout;
    	      this.addons = defaults.addons;
    	      this.addonsIncludes = defaults.addonsIncludes;
    	      this.authentication = defaults.authentication;
    	      this.authorization = defaults.authorization;
    	      this.bastionHost = defaults.bastionHost;
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.dns = defaults.dns;
    	      this.enableCriDockerd = defaults.enableCriDockerd;
    	      this.ignoreDockerVersion = defaults.ignoreDockerVersion;
    	      this.ingress = defaults.ingress;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.monitoring = defaults.monitoring;
    	      this.network = defaults.network;
    	      this.nodes = defaults.nodes;
    	      this.prefixPath = defaults.prefixPath;
    	      this.privateRegistries = defaults.privateRegistries;
    	      this.services = defaults.services;
    	      this.sshAgentAuth = defaults.sshAgentAuth;
    	      this.sshCertPath = defaults.sshCertPath;
    	      this.sshKeyPath = defaults.sshKeyPath;
    	      this.upgradeStrategy = defaults.upgradeStrategy;
    	      this.winPrefixPath = defaults.winPrefixPath;
        }

        @CustomType.Setter
        public Builder addonJobTimeout(Integer addonJobTimeout) {
            if (addonJobTimeout == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "addonJobTimeout");
            }
            this.addonJobTimeout = addonJobTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder addons(@Nullable String addons) {

            this.addons = addons;
            return this;
        }
        @CustomType.Setter
        public Builder addonsIncludes(@Nullable List<String> addonsIncludes) {

            this.addonsIncludes = addonsIncludes;
            return this;
        }
        public Builder addonsIncludes(String... addonsIncludes) {
            return addonsIncludes(List.of(addonsIncludes));
        }
        @CustomType.Setter
        public Builder authentication(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication) {
            if (authentication == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "authentication");
            }
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder authorization(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization) {
            if (authorization == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "authorization");
            }
            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder bastionHost(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost) {
            if (bastionHost == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "bastionHost");
            }
            this.bastionHost = bastionHost;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProvider(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder dns(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "dns");
            }
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder enableCriDockerd(@Nullable Boolean enableCriDockerd) {

            this.enableCriDockerd = enableCriDockerd;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDockerVersion(@Nullable Boolean ignoreDockerVersion) {

            this.ignoreDockerVersion = ignoreDockerVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ingress(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress) {
            if (ingress == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "ingress");
            }
            this.ingress = ingress;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(String kubernetesVersion) {
            if (kubernetesVersion == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "kubernetesVersion");
            }
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring) {
            if (monitoring == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "monitoring");
            }
            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes) {

            this.nodes = nodes;
            return this;
        }
        public Builder nodes(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder prefixPath(String prefixPath) {
            if (prefixPath == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "prefixPath");
            }
            this.prefixPath = prefixPath;
            return this;
        }
        @CustomType.Setter
        public Builder privateRegistries(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries) {

            this.privateRegistries = privateRegistries;
            return this;
        }
        public Builder privateRegistries(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry... privateRegistries) {
            return privateRegistries(List.of(privateRegistries));
        }
        @CustomType.Setter
        public Builder services(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "services");
            }
            this.services = services;
            return this;
        }
        @CustomType.Setter
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {

            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        @CustomType.Setter
        public Builder sshCertPath(String sshCertPath) {
            if (sshCertPath == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "sshCertPath");
            }
            this.sshCertPath = sshCertPath;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(String sshKeyPath) {
            if (sshKeyPath == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "sshKeyPath");
            }
            this.sshKeyPath = sshKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStrategy(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy) {
            if (upgradeStrategy == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "upgradeStrategy");
            }
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder winPrefixPath(String winPrefixPath) {
            if (winPrefixPath == null) {
              throw new MissingRequiredPropertyException("GetClusterTemplateTemplateRevisionClusterConfigRkeConfig", "winPrefixPath");
            }
            this.winPrefixPath = winPrefixPath;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfig build() {
            final var _resultValue = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfig();
            _resultValue.addonJobTimeout = addonJobTimeout;
            _resultValue.addons = addons;
            _resultValue.addonsIncludes = addonsIncludes;
            _resultValue.authentication = authentication;
            _resultValue.authorization = authorization;
            _resultValue.bastionHost = bastionHost;
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.dns = dns;
            _resultValue.enableCriDockerd = enableCriDockerd;
            _resultValue.ignoreDockerVersion = ignoreDockerVersion;
            _resultValue.ingress = ingress;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.monitoring = monitoring;
            _resultValue.network = network;
            _resultValue.nodes = nodes;
            _resultValue.prefixPath = prefixPath;
            _resultValue.privateRegistries = privateRegistries;
            _resultValue.services = services;
            _resultValue.sshAgentAuth = sshAgentAuth;
            _resultValue.sshCertPath = sshCertPath;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.upgradeStrategy = upgradeStrategy;
            _resultValue.winPrefixPath = winPrefixPath;
            return _resultValue;
        }
    }
}
