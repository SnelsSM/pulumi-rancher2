// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs Empty = new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs();

    /**
     * (string)
     * 
     */
    @Import(name="authUrl", required=true)
    private Output<String> authUrl;

    /**
     * @return (string)
     * 
     */
    public Output<String> authUrl() {
        return this.authUrl;
    }

    /**
     * (string)
     * 
     */
    @Import(name="caFile")
    private @Nullable Output<String> caFile;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> caFile() {
        return Optional.ofNullable(this.caFile);
    }

    /**
     * Required if `domain_name` not provided. (string)
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    /**
     * @return Required if `domain_name` not provided. (string)
     * 
     */
    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * Required if `domain_id` not provided. (string)
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Required if `domain_id` not provided. (string)
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Registry password (string)
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Registry password (string)
     * 
     */
    public Output<String> password() {
        return this.password;
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
     * Azure tenant ID to use (string)
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Azure tenant ID to use (string)
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Required if `tenant_id` not provided. (string)
     * 
     */
    @Import(name="tenantName")
    private @Nullable Output<String> tenantName;

    /**
     * @return Required if `tenant_id` not provided. (string)
     * 
     */
    public Optional<Output<String>> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }

    /**
     * (string)
     * 
     */
    @Import(name="trustId")
    private @Nullable Output<String> trustId;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> trustId() {
        return Optional.ofNullable(this.trustId);
    }

    /**
     * (string)
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return (string)
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs() {}

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs $) {
        this.authUrl = $.authUrl;
        this.caFile = $.caFile;
        this.domainId = $.domainId;
        this.domainName = $.domainName;
        this.password = $.password;
        this.region = $.region;
        this.tenantId = $.tenantId;
        this.tenantName = $.tenantName;
        this.trustId = $.trustId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authUrl (string)
         * 
         * @return builder
         * 
         */
        public Builder authUrl(Output<String> authUrl) {
            $.authUrl = authUrl;
            return this;
        }

        /**
         * @param authUrl (string)
         * 
         * @return builder
         * 
         */
        public Builder authUrl(String authUrl) {
            return authUrl(Output.of(authUrl));
        }

        /**
         * @param caFile (string)
         * 
         * @return builder
         * 
         */
        public Builder caFile(@Nullable Output<String> caFile) {
            $.caFile = caFile;
            return this;
        }

        /**
         * @param caFile (string)
         * 
         * @return builder
         * 
         */
        public Builder caFile(String caFile) {
            return caFile(Output.of(caFile));
        }

        /**
         * @param domainId Required if `domain_name` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId Required if `domain_name` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param domainName Required if `domain_id` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Required if `domain_id` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param password Registry password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Registry password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
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
         * @param tenantId Azure tenant ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
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
         * @param tenantName Required if `tenant_id` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantName(@Nullable Output<String> tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        /**
         * @param tenantName Required if `tenant_id` not provided. (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantName(String tenantName) {
            return tenantName(Output.of(tenantName));
        }

        /**
         * @param trustId (string)
         * 
         * @return builder
         * 
         */
        public Builder trustId(@Nullable Output<String> trustId) {
            $.trustId = trustId;
            return this;
        }

        /**
         * @param trustId (string)
         * 
         * @return builder
         * 
         */
        public Builder trustId(String trustId) {
            return trustId(Output.of(trustId));
        }

        /**
         * @param username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs build() {
            if ($.authUrl == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs", "authUrl");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs", "username");
            }
            return $;
        }
    }

}
