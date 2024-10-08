// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderAzureCloudProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderAzureCloudProviderArgs Empty = new ClusterRkeConfigCloudProviderAzureCloudProviderArgs();

    /**
     * (string)
     * 
     */
    @Import(name="aadClientCertPassword")
    private @Nullable Output<String> aadClientCertPassword;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> aadClientCertPassword() {
        return Optional.ofNullable(this.aadClientCertPassword);
    }

    /**
     * (string)
     * 
     */
    @Import(name="aadClientCertPath")
    private @Nullable Output<String> aadClientCertPath;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> aadClientCertPath() {
        return Optional.ofNullable(this.aadClientCertPath);
    }

    /**
     * (string)
     * 
     */
    @Import(name="aadClientId", required=true)
    private Output<String> aadClientId;

    /**
     * @return (string)
     * 
     */
    public Output<String> aadClientId() {
        return this.aadClientId;
    }

    /**
     * (string)
     * 
     */
    @Import(name="aadClientSecret", required=true)
    private Output<String> aadClientSecret;

    /**
     * @return (string)
     * 
     */
    public Output<String> aadClientSecret() {
        return this.aadClientSecret;
    }

    /**
     * (string)
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="cloudProviderBackoff")
    private @Nullable Output<Boolean> cloudProviderBackoff;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> cloudProviderBackoff() {
        return Optional.ofNullable(this.cloudProviderBackoff);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderBackoffDuration")
    private @Nullable Output<Integer> cloudProviderBackoffDuration;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderBackoffDuration() {
        return Optional.ofNullable(this.cloudProviderBackoffDuration);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderBackoffExponent")
    private @Nullable Output<Integer> cloudProviderBackoffExponent;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderBackoffExponent() {
        return Optional.ofNullable(this.cloudProviderBackoffExponent);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderBackoffJitter")
    private @Nullable Output<Integer> cloudProviderBackoffJitter;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderBackoffJitter() {
        return Optional.ofNullable(this.cloudProviderBackoffJitter);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderBackoffRetries")
    private @Nullable Output<Integer> cloudProviderBackoffRetries;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderBackoffRetries() {
        return Optional.ofNullable(this.cloudProviderBackoffRetries);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="cloudProviderRateLimit")
    private @Nullable Output<Boolean> cloudProviderRateLimit;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> cloudProviderRateLimit() {
        return Optional.ofNullable(this.cloudProviderRateLimit);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderRateLimitBucket")
    private @Nullable Output<Integer> cloudProviderRateLimitBucket;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderRateLimitBucket() {
        return Optional.ofNullable(this.cloudProviderRateLimitBucket);
    }

    /**
     * (int)
     * 
     */
    @Import(name="cloudProviderRateLimitQps")
    private @Nullable Output<Integer> cloudProviderRateLimitQps;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> cloudProviderRateLimitQps() {
        return Optional.ofNullable(this.cloudProviderRateLimitQps);
    }

    /**
     * Load balancer type (basic | standard). Must be standard for auto-scaling
     * 
     */
    @Import(name="loadBalancerSku")
    private @Nullable Output<String> loadBalancerSku;

    /**
     * @return Load balancer type (basic | standard). Must be standard for auto-scaling
     * 
     */
    public Optional<Output<String>> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }

    /**
     * Azure Kubernetes cluster location. Default `eastus` (string)
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Azure Kubernetes cluster location. Default `eastus` (string)
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * (int)
     * 
     */
    @Import(name="maximumLoadBalancerRuleCount")
    private @Nullable Output<Integer> maximumLoadBalancerRuleCount;

    /**
     * @return (int)
     * 
     */
    public Optional<Output<Integer>> maximumLoadBalancerRuleCount() {
        return Optional.ofNullable(this.maximumLoadBalancerRuleCount);
    }

    /**
     * (string)
     * 
     */
    @Import(name="primaryAvailabilitySetName")
    private @Nullable Output<String> primaryAvailabilitySetName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> primaryAvailabilitySetName() {
        return Optional.ofNullable(this.primaryAvailabilitySetName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="primaryScaleSetName")
    private @Nullable Output<String> primaryScaleSetName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> primaryScaleSetName() {
        return Optional.ofNullable(this.primaryScaleSetName);
    }

    /**
     * The AKS resource group (string)
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return The AKS resource group (string)
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * (string)
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="securityGroupName")
    private @Nullable Output<String> securityGroupName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="subnetName")
    private @Nullable Output<String> subnetName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }

    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription (string)
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subscription credentials which uniquely identify Microsoft Azure subscription (string)
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Azure tenant ID to use (string)
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return Azure tenant ID to use (string)
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * (bool)
     * 
     */
    @Import(name="useInstanceMetadata")
    private @Nullable Output<Boolean> useInstanceMetadata;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> useInstanceMetadata() {
        return Optional.ofNullable(this.useInstanceMetadata);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="useManagedIdentityExtension")
    private @Nullable Output<Boolean> useManagedIdentityExtension;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> useManagedIdentityExtension() {
        return Optional.ofNullable(this.useManagedIdentityExtension);
    }

    /**
     * (string)
     * 
     */
    @Import(name="vmType")
    private @Nullable Output<String> vmType;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> vmType() {
        return Optional.ofNullable(this.vmType);
    }

    /**
     * (string)
     * 
     */
    @Import(name="vnetName")
    private @Nullable Output<String> vnetName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="vnetResourceGroup")
    private @Nullable Output<String> vnetResourceGroup;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> vnetResourceGroup() {
        return Optional.ofNullable(this.vnetResourceGroup);
    }

    private ClusterRkeConfigCloudProviderAzureCloudProviderArgs() {}

    private ClusterRkeConfigCloudProviderAzureCloudProviderArgs(ClusterRkeConfigCloudProviderAzureCloudProviderArgs $) {
        this.aadClientCertPassword = $.aadClientCertPassword;
        this.aadClientCertPath = $.aadClientCertPath;
        this.aadClientId = $.aadClientId;
        this.aadClientSecret = $.aadClientSecret;
        this.cloud = $.cloud;
        this.cloudProviderBackoff = $.cloudProviderBackoff;
        this.cloudProviderBackoffDuration = $.cloudProviderBackoffDuration;
        this.cloudProviderBackoffExponent = $.cloudProviderBackoffExponent;
        this.cloudProviderBackoffJitter = $.cloudProviderBackoffJitter;
        this.cloudProviderBackoffRetries = $.cloudProviderBackoffRetries;
        this.cloudProviderRateLimit = $.cloudProviderRateLimit;
        this.cloudProviderRateLimitBucket = $.cloudProviderRateLimitBucket;
        this.cloudProviderRateLimitQps = $.cloudProviderRateLimitQps;
        this.loadBalancerSku = $.loadBalancerSku;
        this.location = $.location;
        this.maximumLoadBalancerRuleCount = $.maximumLoadBalancerRuleCount;
        this.primaryAvailabilitySetName = $.primaryAvailabilitySetName;
        this.primaryScaleSetName = $.primaryScaleSetName;
        this.resourceGroup = $.resourceGroup;
        this.routeTableName = $.routeTableName;
        this.securityGroupName = $.securityGroupName;
        this.subnetName = $.subnetName;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
        this.useInstanceMetadata = $.useInstanceMetadata;
        this.useManagedIdentityExtension = $.useManagedIdentityExtension;
        this.vmType = $.vmType;
        this.vnetName = $.vnetName;
        this.vnetResourceGroup = $.vnetResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderAzureCloudProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderAzureCloudProviderArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderAzureCloudProviderArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderAzureCloudProviderArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderAzureCloudProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadClientCertPassword (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientCertPassword(@Nullable Output<String> aadClientCertPassword) {
            $.aadClientCertPassword = aadClientCertPassword;
            return this;
        }

        /**
         * @param aadClientCertPassword (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientCertPassword(String aadClientCertPassword) {
            return aadClientCertPassword(Output.of(aadClientCertPassword));
        }

        /**
         * @param aadClientCertPath (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientCertPath(@Nullable Output<String> aadClientCertPath) {
            $.aadClientCertPath = aadClientCertPath;
            return this;
        }

        /**
         * @param aadClientCertPath (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientCertPath(String aadClientCertPath) {
            return aadClientCertPath(Output.of(aadClientCertPath));
        }

        /**
         * @param aadClientId (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientId(Output<String> aadClientId) {
            $.aadClientId = aadClientId;
            return this;
        }

        /**
         * @param aadClientId (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientId(String aadClientId) {
            return aadClientId(Output.of(aadClientId));
        }

        /**
         * @param aadClientSecret (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientSecret(Output<String> aadClientSecret) {
            $.aadClientSecret = aadClientSecret;
            return this;
        }

        /**
         * @param aadClientSecret (string)
         * 
         * @return builder
         * 
         */
        public Builder aadClientSecret(String aadClientSecret) {
            return aadClientSecret(Output.of(aadClientSecret));
        }

        /**
         * @param cloud (string)
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud (string)
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param cloudProviderBackoff (bool)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoff(@Nullable Output<Boolean> cloudProviderBackoff) {
            $.cloudProviderBackoff = cloudProviderBackoff;
            return this;
        }

        /**
         * @param cloudProviderBackoff (bool)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoff(Boolean cloudProviderBackoff) {
            return cloudProviderBackoff(Output.of(cloudProviderBackoff));
        }

        /**
         * @param cloudProviderBackoffDuration (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffDuration(@Nullable Output<Integer> cloudProviderBackoffDuration) {
            $.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            return this;
        }

        /**
         * @param cloudProviderBackoffDuration (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffDuration(Integer cloudProviderBackoffDuration) {
            return cloudProviderBackoffDuration(Output.of(cloudProviderBackoffDuration));
        }

        /**
         * @param cloudProviderBackoffExponent (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffExponent(@Nullable Output<Integer> cloudProviderBackoffExponent) {
            $.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            return this;
        }

        /**
         * @param cloudProviderBackoffExponent (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffExponent(Integer cloudProviderBackoffExponent) {
            return cloudProviderBackoffExponent(Output.of(cloudProviderBackoffExponent));
        }

        /**
         * @param cloudProviderBackoffJitter (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffJitter(@Nullable Output<Integer> cloudProviderBackoffJitter) {
            $.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            return this;
        }

        /**
         * @param cloudProviderBackoffJitter (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffJitter(Integer cloudProviderBackoffJitter) {
            return cloudProviderBackoffJitter(Output.of(cloudProviderBackoffJitter));
        }

        /**
         * @param cloudProviderBackoffRetries (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffRetries(@Nullable Output<Integer> cloudProviderBackoffRetries) {
            $.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            return this;
        }

        /**
         * @param cloudProviderBackoffRetries (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderBackoffRetries(Integer cloudProviderBackoffRetries) {
            return cloudProviderBackoffRetries(Output.of(cloudProviderBackoffRetries));
        }

        /**
         * @param cloudProviderRateLimit (bool)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimit(@Nullable Output<Boolean> cloudProviderRateLimit) {
            $.cloudProviderRateLimit = cloudProviderRateLimit;
            return this;
        }

        /**
         * @param cloudProviderRateLimit (bool)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimit(Boolean cloudProviderRateLimit) {
            return cloudProviderRateLimit(Output.of(cloudProviderRateLimit));
        }

        /**
         * @param cloudProviderRateLimitBucket (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimitBucket(@Nullable Output<Integer> cloudProviderRateLimitBucket) {
            $.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            return this;
        }

        /**
         * @param cloudProviderRateLimitBucket (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimitBucket(Integer cloudProviderRateLimitBucket) {
            return cloudProviderRateLimitBucket(Output.of(cloudProviderRateLimitBucket));
        }

        /**
         * @param cloudProviderRateLimitQps (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimitQps(@Nullable Output<Integer> cloudProviderRateLimitQps) {
            $.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            return this;
        }

        /**
         * @param cloudProviderRateLimitQps (int)
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderRateLimitQps(Integer cloudProviderRateLimitQps) {
            return cloudProviderRateLimitQps(Output.of(cloudProviderRateLimitQps));
        }

        /**
         * @param loadBalancerSku Load balancer type (basic | standard). Must be standard for auto-scaling
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSku(@Nullable Output<String> loadBalancerSku) {
            $.loadBalancerSku = loadBalancerSku;
            return this;
        }

        /**
         * @param loadBalancerSku Load balancer type (basic | standard). Must be standard for auto-scaling
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSku(String loadBalancerSku) {
            return loadBalancerSku(Output.of(loadBalancerSku));
        }

        /**
         * @param location Azure Kubernetes cluster location. Default `eastus` (string)
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Azure Kubernetes cluster location. Default `eastus` (string)
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maximumLoadBalancerRuleCount (int)
         * 
         * @return builder
         * 
         */
        public Builder maximumLoadBalancerRuleCount(@Nullable Output<Integer> maximumLoadBalancerRuleCount) {
            $.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            return this;
        }

        /**
         * @param maximumLoadBalancerRuleCount (int)
         * 
         * @return builder
         * 
         */
        public Builder maximumLoadBalancerRuleCount(Integer maximumLoadBalancerRuleCount) {
            return maximumLoadBalancerRuleCount(Output.of(maximumLoadBalancerRuleCount));
        }

        /**
         * @param primaryAvailabilitySetName (string)
         * 
         * @return builder
         * 
         */
        public Builder primaryAvailabilitySetName(@Nullable Output<String> primaryAvailabilitySetName) {
            $.primaryAvailabilitySetName = primaryAvailabilitySetName;
            return this;
        }

        /**
         * @param primaryAvailabilitySetName (string)
         * 
         * @return builder
         * 
         */
        public Builder primaryAvailabilitySetName(String primaryAvailabilitySetName) {
            return primaryAvailabilitySetName(Output.of(primaryAvailabilitySetName));
        }

        /**
         * @param primaryScaleSetName (string)
         * 
         * @return builder
         * 
         */
        public Builder primaryScaleSetName(@Nullable Output<String> primaryScaleSetName) {
            $.primaryScaleSetName = primaryScaleSetName;
            return this;
        }

        /**
         * @param primaryScaleSetName (string)
         * 
         * @return builder
         * 
         */
        public Builder primaryScaleSetName(String primaryScaleSetName) {
            return primaryScaleSetName(Output.of(primaryScaleSetName));
        }

        /**
         * @param resourceGroup The AKS resource group (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The AKS resource group (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param routeTableName (string)
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        /**
         * @param routeTableName (string)
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(String routeTableName) {
            return routeTableName(Output.of(routeTableName));
        }

        /**
         * @param securityGroupName (string)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(@Nullable Output<String> securityGroupName) {
            $.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * @param securityGroupName (string)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(String securityGroupName) {
            return securityGroupName(Output.of(securityGroupName));
        }

        /**
         * @param subnetName (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetName(@Nullable Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        /**
         * @param subnetName (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        /**
         * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription (string)
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription (string)
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenantId Azure tenant ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Azure tenant ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param useInstanceMetadata (bool)
         * 
         * @return builder
         * 
         */
        public Builder useInstanceMetadata(@Nullable Output<Boolean> useInstanceMetadata) {
            $.useInstanceMetadata = useInstanceMetadata;
            return this;
        }

        /**
         * @param useInstanceMetadata (bool)
         * 
         * @return builder
         * 
         */
        public Builder useInstanceMetadata(Boolean useInstanceMetadata) {
            return useInstanceMetadata(Output.of(useInstanceMetadata));
        }

        /**
         * @param useManagedIdentityExtension (bool)
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentityExtension(@Nullable Output<Boolean> useManagedIdentityExtension) {
            $.useManagedIdentityExtension = useManagedIdentityExtension;
            return this;
        }

        /**
         * @param useManagedIdentityExtension (bool)
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentityExtension(Boolean useManagedIdentityExtension) {
            return useManagedIdentityExtension(Output.of(useManagedIdentityExtension));
        }

        /**
         * @param vmType (string)
         * 
         * @return builder
         * 
         */
        public Builder vmType(@Nullable Output<String> vmType) {
            $.vmType = vmType;
            return this;
        }

        /**
         * @param vmType (string)
         * 
         * @return builder
         * 
         */
        public Builder vmType(String vmType) {
            return vmType(Output.of(vmType));
        }

        /**
         * @param vnetName (string)
         * 
         * @return builder
         * 
         */
        public Builder vnetName(@Nullable Output<String> vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        /**
         * @param vnetName (string)
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            return vnetName(Output.of(vnetName));
        }

        /**
         * @param vnetResourceGroup (string)
         * 
         * @return builder
         * 
         */
        public Builder vnetResourceGroup(@Nullable Output<String> vnetResourceGroup) {
            $.vnetResourceGroup = vnetResourceGroup;
            return this;
        }

        /**
         * @param vnetResourceGroup (string)
         * 
         * @return builder
         * 
         */
        public Builder vnetResourceGroup(String vnetResourceGroup) {
            return vnetResourceGroup(Output.of(vnetResourceGroup));
        }

        public ClusterRkeConfigCloudProviderAzureCloudProviderArgs build() {
            if ($.aadClientId == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderAzureCloudProviderArgs", "aadClientId");
            }
            if ($.aadClientSecret == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderAzureCloudProviderArgs", "aadClientSecret");
            }
            if ($.subscriptionId == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderAzureCloudProviderArgs", "subscriptionId");
            }
            if ($.tenantId == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderAzureCloudProviderArgs", "tenantId");
            }
            return $;
        }
    }

}
