// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ClusterEksConfigV2NodeGroupArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEksConfigV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEksConfigV2Args Empty = new ClusterEksConfigV2Args();

    /**
     * The EKS cloud_credential id (string)
     * 
     */
    @Import(name="cloudCredentialId", required=true)
    private Output<String> cloudCredentialId;

    /**
     * @return The EKS cloud_credential id (string)
     * 
     */
    public Output<String> cloudCredentialId() {
        return this.cloudCredentialId;
    }

    /**
     * Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    @Import(name="imported")
    private @Nullable Output<Boolean> imported;

    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> imported() {
        return Optional.ofNullable(this.imported);
    }

    /**
     * The AWS kms label ARN to use (string, e.g. arn:aws:kms:&lt;ZONE&gt;:&lt;123456789100&gt;:alias/&lt;NAME&gt;)
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The AWS kms label ARN to use (string, e.g. arn:aws:kms:&lt;ZONE&gt;:&lt;123456789100&gt;:alias/&lt;NAME&gt;)
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
     * 
     */
    @Import(name="loggingTypes")
    private @Nullable Output<List<String>> loggingTypes;

    /**
     * @return The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
     * 
     */
    public Optional<Output<List<String>>> loggingTypes() {
        return Optional.ofNullable(this.loggingTypes);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The EKS cluster name to import. Required to create a new cluster (list)
     * 
     */
    @Import(name="nodeGroups")
    private @Nullable Output<List<ClusterEksConfigV2NodeGroupArgs>> nodeGroups;

    /**
     * @return The EKS cluster name to import. Required to create a new cluster (list)
     * 
     */
    public Optional<Output<List<ClusterEksConfigV2NodeGroupArgs>>> nodeGroups() {
        return Optional.ofNullable(this.nodeGroups);
    }

    /**
     * The EKS cluster has private access (bool)
     * 
     */
    @Import(name="privateAccess")
    private @Nullable Output<Boolean> privateAccess;

    /**
     * @return The EKS cluster has private access (bool)
     * 
     */
    public Optional<Output<Boolean>> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }

    /**
     * The EKS cluster has public access (bool)
     * 
     */
    @Import(name="publicAccess")
    private @Nullable Output<Boolean> publicAccess;

    /**
     * @return The EKS cluster has public access (bool)
     * 
     */
    public Optional<Output<Boolean>> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }

    /**
     * The EKS cluster public access sources (map)
     * 
     */
    @Import(name="publicAccessSources")
    private @Nullable Output<List<String>> publicAccessSources;

    /**
     * @return The EKS cluster public access sources (map)
     * 
     */
    public Optional<Output<List<String>>> publicAccessSources() {
        return Optional.ofNullable(this.publicAccessSources);
    }

    /**
     * The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Enable EKS cluster secret encryption (bool)
     * 
     */
    @Import(name="secretsEncryption")
    private @Nullable Output<Boolean> secretsEncryption;

    /**
     * @return Enable EKS cluster secret encryption (bool)
     * 
     */
    public Optional<Output<Boolean>> secretsEncryption() {
        return Optional.ofNullable(this.secretsEncryption);
    }

    /**
     * List of security groups to use for the cluster (list)
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The AWS service role to use (string)
     * 
     */
    @Import(name="serviceRole")
    private @Nullable Output<String> serviceRole;

    /**
     * @return The AWS service role to use (string)
     * 
     */
    public Optional<Output<String>> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }

    /**
     * The EKS node group subnets (list string)
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The GKE node config tags (List)
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The GKE node config tags (List)
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterEksConfigV2Args() {}

    private ClusterEksConfigV2Args(ClusterEksConfigV2Args $) {
        this.cloudCredentialId = $.cloudCredentialId;
        this.imported = $.imported;
        this.kmsKey = $.kmsKey;
        this.kubernetesVersion = $.kubernetesVersion;
        this.loggingTypes = $.loggingTypes;
        this.name = $.name;
        this.nodeGroups = $.nodeGroups;
        this.privateAccess = $.privateAccess;
        this.publicAccess = $.publicAccess;
        this.publicAccessSources = $.publicAccessSources;
        this.region = $.region;
        this.secretsEncryption = $.secretsEncryption;
        this.securityGroups = $.securityGroups;
        this.serviceRole = $.serviceRole;
        this.subnets = $.subnets;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEksConfigV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEksConfigV2Args $;

        public Builder() {
            $ = new ClusterEksConfigV2Args();
        }

        public Builder(ClusterEksConfigV2Args defaults) {
            $ = new ClusterEksConfigV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudCredentialId The EKS cloud_credential id (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialId(Output<String> cloudCredentialId) {
            $.cloudCredentialId = cloudCredentialId;
            return this;
        }

        /**
         * @param cloudCredentialId The EKS cloud_credential id (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialId(String cloudCredentialId) {
            return cloudCredentialId(Output.of(cloudCredentialId));
        }

        /**
         * @param imported Is GKE cluster imported? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder imported(@Nullable Output<Boolean> imported) {
            $.imported = imported;
            return this;
        }

        /**
         * @param imported Is GKE cluster imported? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder imported(Boolean imported) {
            return imported(Output.of(imported));
        }

        /**
         * @param kmsKey The AWS kms label ARN to use (string, e.g. arn:aws:kms:&lt;ZONE&gt;:&lt;123456789100&gt;:alias/&lt;NAME&gt;)
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The AWS kms label ARN to use (string, e.g. arn:aws:kms:&lt;ZONE&gt;:&lt;123456789100&gt;:alias/&lt;NAME&gt;)
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param loggingTypes The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
         * 
         * @return builder
         * 
         */
        public Builder loggingTypes(@Nullable Output<List<String>> loggingTypes) {
            $.loggingTypes = loggingTypes;
            return this;
        }

        /**
         * @param loggingTypes The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
         * 
         * @return builder
         * 
         */
        public Builder loggingTypes(List<String> loggingTypes) {
            return loggingTypes(Output.of(loggingTypes));
        }

        /**
         * @param loggingTypes The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
         * 
         * @return builder
         * 
         */
        public Builder loggingTypes(String... loggingTypes) {
            return loggingTypes(List.of(loggingTypes));
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeGroups The EKS cluster name to import. Required to create a new cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(@Nullable Output<List<ClusterEksConfigV2NodeGroupArgs>> nodeGroups) {
            $.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * @param nodeGroups The EKS cluster name to import. Required to create a new cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(List<ClusterEksConfigV2NodeGroupArgs> nodeGroups) {
            return nodeGroups(Output.of(nodeGroups));
        }

        /**
         * @param nodeGroups The EKS cluster name to import. Required to create a new cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(ClusterEksConfigV2NodeGroupArgs... nodeGroups) {
            return nodeGroups(List.of(nodeGroups));
        }

        /**
         * @param privateAccess The EKS cluster has private access (bool)
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(@Nullable Output<Boolean> privateAccess) {
            $.privateAccess = privateAccess;
            return this;
        }

        /**
         * @param privateAccess The EKS cluster has private access (bool)
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(Boolean privateAccess) {
            return privateAccess(Output.of(privateAccess));
        }

        /**
         * @param publicAccess The EKS cluster has public access (bool)
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(@Nullable Output<Boolean> publicAccess) {
            $.publicAccess = publicAccess;
            return this;
        }

        /**
         * @param publicAccess The EKS cluster has public access (bool)
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(Boolean publicAccess) {
            return publicAccess(Output.of(publicAccess));
        }

        /**
         * @param publicAccessSources The EKS cluster public access sources (map)
         * 
         * @return builder
         * 
         */
        public Builder publicAccessSources(@Nullable Output<List<String>> publicAccessSources) {
            $.publicAccessSources = publicAccessSources;
            return this;
        }

        /**
         * @param publicAccessSources The EKS cluster public access sources (map)
         * 
         * @return builder
         * 
         */
        public Builder publicAccessSources(List<String> publicAccessSources) {
            return publicAccessSources(Output.of(publicAccessSources));
        }

        /**
         * @param publicAccessSources The EKS cluster public access sources (map)
         * 
         * @return builder
         * 
         */
        public Builder publicAccessSources(String... publicAccessSources) {
            return publicAccessSources(List.of(publicAccessSources));
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretsEncryption Enable EKS cluster secret encryption (bool)
         * 
         * @return builder
         * 
         */
        public Builder secretsEncryption(@Nullable Output<Boolean> secretsEncryption) {
            $.secretsEncryption = secretsEncryption;
            return this;
        }

        /**
         * @param secretsEncryption Enable EKS cluster secret encryption (bool)
         * 
         * @return builder
         * 
         */
        public Builder secretsEncryption(Boolean secretsEncryption) {
            return secretsEncryption(Output.of(secretsEncryption));
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param serviceRole The AWS service role to use (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            $.serviceRole = serviceRole;
            return this;
        }

        /**
         * @param serviceRole The AWS service role to use (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceRole(String serviceRole) {
            return serviceRole(Output.of(serviceRole));
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param tags The GKE node config tags (List)
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The GKE node config tags (List)
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public ClusterEksConfigV2Args build() {
            if ($.cloudCredentialId == null) {
                throw new MissingRequiredPropertyException("ClusterEksConfigV2Args", "cloudCredentialId");
            }
            return $;
        }
    }

}
