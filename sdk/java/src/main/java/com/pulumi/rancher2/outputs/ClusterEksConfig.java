// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterEksConfig {
    /**
     * @return The AWS Client ID to use (string)
     * 
     */
    private String accessKey;
    /**
     * @return AMI ID to use for the worker nodes instead of the default (string)
     * 
     */
    private @Nullable String ami;
    /**
     * @return Associate public ip EKS worker nodes. Default `true` (bool)
     * 
     */
    private @Nullable Boolean associateWorkerNodePublicIp;
    /**
     * @return The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
     * 
     */
    private @Nullable Integer desiredNodes;
    private @Nullable Boolean ebsEncryption;
    /**
     * @return The EKS node group instance type. Default: `t3.medium` (string)
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
     * 
     */
    private @Nullable String keyPairName;
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    private String kubernetesVersion;
    /**
     * @return The maximum number of worker nodes. Default `3` (int)
     * 
     */
    private @Nullable Integer maximumNodes;
    /**
     * @return The minimum number of worker nodes. Default `1` (int)
     * 
     */
    private @Nullable Integer minimumNodes;
    /**
     * @return The volume size for each node. Default `20` (int)
     * 
     */
    private @Nullable Integer nodeVolumeSize;
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return The AWS Client Secret associated with the Client ID (string)
     * 
     */
    private String secretKey;
    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return The AWS service role to use (string)
     * 
     */
    private @Nullable String serviceRole;
    /**
     * @return A session token to use with the client key and secret if applicable (string)
     * 
     */
    private @Nullable String sessionToken;
    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    private @Nullable List<String> subnets;
    /**
     * @return The EKS node group user data (string)
     * 
     */
    private @Nullable String userData;
    /**
     * @return The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    private @Nullable String virtualNetwork;

    private ClusterEksConfig() {}
    /**
     * @return The AWS Client ID to use (string)
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return AMI ID to use for the worker nodes instead of the default (string)
     * 
     */
    public Optional<String> ami() {
        return Optional.ofNullable(this.ami);
    }
    /**
     * @return Associate public ip EKS worker nodes. Default `true` (bool)
     * 
     */
    public Optional<Boolean> associateWorkerNodePublicIp() {
        return Optional.ofNullable(this.associateWorkerNodePublicIp);
    }
    /**
     * @return The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
     * 
     */
    public Optional<Integer> desiredNodes() {
        return Optional.ofNullable(this.desiredNodes);
    }
    public Optional<Boolean> ebsEncryption() {
        return Optional.ofNullable(this.ebsEncryption);
    }
    /**
     * @return The EKS node group instance type. Default: `t3.medium` (string)
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
     * 
     */
    public Optional<String> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * @return The maximum number of worker nodes. Default `3` (int)
     * 
     */
    public Optional<Integer> maximumNodes() {
        return Optional.ofNullable(this.maximumNodes);
    }
    /**
     * @return The minimum number of worker nodes. Default `1` (int)
     * 
     */
    public Optional<Integer> minimumNodes() {
        return Optional.ofNullable(this.minimumNodes);
    }
    /**
     * @return The volume size for each node. Default `20` (int)
     * 
     */
    public Optional<Integer> nodeVolumeSize() {
        return Optional.ofNullable(this.nodeVolumeSize);
    }
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The AWS Client Secret associated with the Client ID (string)
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }
    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The AWS service role to use (string)
     * 
     */
    public Optional<String> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }
    /**
     * @return A session token to use with the client key and secret if applicable (string)
     * 
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * @return The EKS node group user data (string)
     * 
     */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    /**
     * @return The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    public Optional<String> virtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEksConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private @Nullable String ami;
        private @Nullable Boolean associateWorkerNodePublicIp;
        private @Nullable Integer desiredNodes;
        private @Nullable Boolean ebsEncryption;
        private @Nullable String instanceType;
        private @Nullable String keyPairName;
        private String kubernetesVersion;
        private @Nullable Integer maximumNodes;
        private @Nullable Integer minimumNodes;
        private @Nullable Integer nodeVolumeSize;
        private @Nullable String region;
        private String secretKey;
        private @Nullable List<String> securityGroups;
        private @Nullable String serviceRole;
        private @Nullable String sessionToken;
        private @Nullable List<String> subnets;
        private @Nullable String userData;
        private @Nullable String virtualNetwork;
        public Builder() {}
        public Builder(ClusterEksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.ami = defaults.ami;
    	      this.associateWorkerNodePublicIp = defaults.associateWorkerNodePublicIp;
    	      this.desiredNodes = defaults.desiredNodes;
    	      this.ebsEncryption = defaults.ebsEncryption;
    	      this.instanceType = defaults.instanceType;
    	      this.keyPairName = defaults.keyPairName;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.maximumNodes = defaults.maximumNodes;
    	      this.minimumNodes = defaults.minimumNodes;
    	      this.nodeVolumeSize = defaults.nodeVolumeSize;
    	      this.region = defaults.region;
    	      this.secretKey = defaults.secretKey;
    	      this.securityGroups = defaults.securityGroups;
    	      this.serviceRole = defaults.serviceRole;
    	      this.sessionToken = defaults.sessionToken;
    	      this.subnets = defaults.subnets;
    	      this.userData = defaults.userData;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        @CustomType.Setter
        public Builder ami(@Nullable String ami) {
            this.ami = ami;
            return this;
        }
        @CustomType.Setter
        public Builder associateWorkerNodePublicIp(@Nullable Boolean associateWorkerNodePublicIp) {
            this.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder desiredNodes(@Nullable Integer desiredNodes) {
            this.desiredNodes = desiredNodes;
            return this;
        }
        @CustomType.Setter
        public Builder ebsEncryption(@Nullable Boolean ebsEncryption) {
            this.ebsEncryption = ebsEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder keyPairName(@Nullable String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }
        @CustomType.Setter
        public Builder maximumNodes(@Nullable Integer maximumNodes) {
            this.maximumNodes = maximumNodes;
            return this;
        }
        @CustomType.Setter
        public Builder minimumNodes(@Nullable Integer minimumNodes) {
            this.minimumNodes = minimumNodes;
            return this;
        }
        @CustomType.Setter
        public Builder nodeVolumeSize(@Nullable Integer nodeVolumeSize) {
            this.nodeVolumeSize = nodeVolumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }
        @CustomType.Setter
        public Builder sessionToken(@Nullable String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        @CustomType.Setter
        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        @CustomType.Setter
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetwork(@Nullable String virtualNetwork) {
            this.virtualNetwork = virtualNetwork;
            return this;
        }
        public ClusterEksConfig build() {
            final var o = new ClusterEksConfig();
            o.accessKey = accessKey;
            o.ami = ami;
            o.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
            o.desiredNodes = desiredNodes;
            o.ebsEncryption = ebsEncryption;
            o.instanceType = instanceType;
            o.keyPairName = keyPairName;
            o.kubernetesVersion = kubernetesVersion;
            o.maximumNodes = maximumNodes;
            o.minimumNodes = minimumNodes;
            o.nodeVolumeSize = nodeVolumeSize;
            o.region = region;
            o.secretKey = secretKey;
            o.securityGroups = securityGroups;
            o.serviceRole = serviceRole;
            o.sessionToken = sessionToken;
            o.subnets = subnets;
            o.userData = userData;
            o.virtualNetwork = virtualNetwork;
            return o;
        }
    }
}
