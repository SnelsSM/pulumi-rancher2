// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateHetznerConfig {
    /**
     * @return Hetzner Cloud project API token
     * 
     */
    private String apiToken;
    /**
     * @return Hetzner Cloud server image
     * 
     */
    private @Nullable String image;
    /**
     * @return Comma-separated list of network IDs or names which should be attached to the server private network interface
     * 
     */
    private @Nullable String networks;
    /**
     * @return Map of the labels which will be assigned to the server
     * 
     */
    private @Nullable Map<String,String> serverLabels;
    /**
     * @return Hetzner Cloud datacenter
     * 
     */
    private @Nullable String serverLocation;
    /**
     * @return Hetzner Cloud server type
     * 
     */
    private @Nullable String serverType;
    /**
     * @return Use private network
     * 
     */
    private @Nullable Boolean usePrivateNetwork;
    /**
     * @return Path to file with cloud-init user-data
     * 
     */
    private @Nullable String userdata;
    /**
     * @return Comma-separated list of volume IDs or names which should be attached to the server
     * 
     */
    private @Nullable String volumes;

    private NodeTemplateHetznerConfig() {}
    /**
     * @return Hetzner Cloud project API token
     * 
     */
    public String apiToken() {
        return this.apiToken;
    }
    /**
     * @return Hetzner Cloud server image
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Comma-separated list of network IDs or names which should be attached to the server private network interface
     * 
     */
    public Optional<String> networks() {
        return Optional.ofNullable(this.networks);
    }
    /**
     * @return Map of the labels which will be assigned to the server
     * 
     */
    public Map<String,String> serverLabels() {
        return this.serverLabels == null ? Map.of() : this.serverLabels;
    }
    /**
     * @return Hetzner Cloud datacenter
     * 
     */
    public Optional<String> serverLocation() {
        return Optional.ofNullable(this.serverLocation);
    }
    /**
     * @return Hetzner Cloud server type
     * 
     */
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    /**
     * @return Use private network
     * 
     */
    public Optional<Boolean> usePrivateNetwork() {
        return Optional.ofNullable(this.usePrivateNetwork);
    }
    /**
     * @return Path to file with cloud-init user-data
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }
    /**
     * @return Comma-separated list of volume IDs or names which should be attached to the server
     * 
     */
    public Optional<String> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateHetznerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiToken;
        private @Nullable String image;
        private @Nullable String networks;
        private @Nullable Map<String,String> serverLabels;
        private @Nullable String serverLocation;
        private @Nullable String serverType;
        private @Nullable Boolean usePrivateNetwork;
        private @Nullable String userdata;
        private @Nullable String volumes;
        public Builder() {}
        public Builder(NodeTemplateHetznerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiToken = defaults.apiToken;
    	      this.image = defaults.image;
    	      this.networks = defaults.networks;
    	      this.serverLabels = defaults.serverLabels;
    	      this.serverLocation = defaults.serverLocation;
    	      this.serverType = defaults.serverType;
    	      this.usePrivateNetwork = defaults.usePrivateNetwork;
    	      this.userdata = defaults.userdata;
    	      this.volumes = defaults.volumes;
        }

        @CustomType.Setter
        public Builder apiToken(String apiToken) {
            if (apiToken == null) {
              throw new MissingRequiredPropertyException("NodeTemplateHetznerConfig", "apiToken");
            }
            this.apiToken = apiToken;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable String networks) {

            this.networks = networks;
            return this;
        }
        @CustomType.Setter
        public Builder serverLabels(@Nullable Map<String,String> serverLabels) {

            this.serverLabels = serverLabels;
            return this;
        }
        @CustomType.Setter
        public Builder serverLocation(@Nullable String serverLocation) {

            this.serverLocation = serverLocation;
            return this;
        }
        @CustomType.Setter
        public Builder serverType(@Nullable String serverType) {

            this.serverType = serverType;
            return this;
        }
        @CustomType.Setter
        public Builder usePrivateNetwork(@Nullable Boolean usePrivateNetwork) {

            this.usePrivateNetwork = usePrivateNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder userdata(@Nullable String userdata) {

            this.userdata = userdata;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable String volumes) {

            this.volumes = volumes;
            return this;
        }
        public NodeTemplateHetznerConfig build() {
            final var _resultValue = new NodeTemplateHetznerConfig();
            _resultValue.apiToken = apiToken;
            _resultValue.image = image;
            _resultValue.networks = networks;
            _resultValue.serverLabels = serverLabels;
            _resultValue.serverLocation = serverLocation;
            _resultValue.serverType = serverType;
            _resultValue.usePrivateNetwork = usePrivateNetwork;
            _resultValue.userdata = userdata;
            _resultValue.volumes = volumes;
            return _resultValue;
        }
    }
}
