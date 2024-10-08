// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal {
    /**
     * @return (string)
     * 
     */
    private String authUrl;
    /**
     * @return (string)
     * 
     */
    private @Nullable String caFile;
    /**
     * @return Required if `domain_name` not provided. (string)
     * 
     */
    private @Nullable String domainId;
    /**
     * @return Required if `domain_id` not provided. (string)
     * 
     */
    private @Nullable String domainName;
    /**
     * @return Registry password (string)
     * 
     */
    private String password;
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return Azure tenant ID to use (string)
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return Required if `tenant_id` not provided. (string)
     * 
     */
    private @Nullable String tenantName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String trustId;
    /**
     * @return (string)
     * 
     */
    private String username;

    private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal() {}
    /**
     * @return (string)
     * 
     */
    public String authUrl() {
        return this.authUrl;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> caFile() {
        return Optional.ofNullable(this.caFile);
    }
    /**
     * @return Required if `domain_name` not provided. (string)
     * 
     */
    public Optional<String> domainId() {
        return Optional.ofNullable(this.domainId);
    }
    /**
     * @return Required if `domain_id` not provided. (string)
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return Registry password (string)
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Azure tenant ID to use (string)
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Required if `tenant_id` not provided. (string)
     * 
     */
    public Optional<String> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> trustId() {
        return Optional.ofNullable(this.trustId);
    }
    /**
     * @return (string)
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authUrl;
        private @Nullable String caFile;
        private @Nullable String domainId;
        private @Nullable String domainName;
        private String password;
        private @Nullable String region;
        private @Nullable String tenantId;
        private @Nullable String tenantName;
        private @Nullable String trustId;
        private String username;
        public Builder() {}
        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authUrl = defaults.authUrl;
    	      this.caFile = defaults.caFile;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.password = defaults.password;
    	      this.region = defaults.region;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.trustId = defaults.trustId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder authUrl(String authUrl) {
            if (authUrl == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal", "authUrl");
            }
            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder caFile(@Nullable String caFile) {

            this.caFile = caFile;
            return this;
        }
        @CustomType.Setter
        public Builder domainId(@Nullable String domainId) {

            this.domainId = domainId;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {

            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantName(@Nullable String tenantName) {

            this.tenantName = tenantName;
            return this;
        }
        @CustomType.Setter
        public Builder trustId(@Nullable String trustId) {

            this.trustId = trustId;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal", "username");
            }
            this.username = username;
            return this;
        }
        public ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal build() {
            final var _resultValue = new ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal();
            _resultValue.authUrl = authUrl;
            _resultValue.caFile = caFile;
            _resultValue.domainId = domainId;
            _resultValue.domainName = domainName;
            _resultValue.password = password;
            _resultValue.region = region;
            _resultValue.tenantId = tenantId;
            _resultValue.tenantName = tenantName;
            _resultValue.trustId = trustId;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
