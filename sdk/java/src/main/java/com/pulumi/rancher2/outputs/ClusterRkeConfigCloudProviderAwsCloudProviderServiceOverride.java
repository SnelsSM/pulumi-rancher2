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
public final class ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride {
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return (string)
     * 
     */
    private String service;
    /**
     * @return (string)
     * 
     */
    private @Nullable String signingMethod;
    /**
     * @return (string)
     * 
     */
    private @Nullable String signingName;
    /**
     * @return (string)
     * 
     */
    private @Nullable String signingRegion;
    /**
     * @return Registry URL (string)
     * 
     */
    private @Nullable String url;

    private ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride() {}
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return (string)
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingMethod() {
        return Optional.ofNullable(this.signingMethod);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingName() {
        return Optional.ofNullable(this.signingName);
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> signingRegion() {
        return Optional.ofNullable(this.signingRegion);
    }
    /**
     * @return Registry URL (string)
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String region;
        private String service;
        private @Nullable String signingMethod;
        private @Nullable String signingName;
        private @Nullable String signingRegion;
        private @Nullable String url;
        public Builder() {}
        public Builder(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.service = defaults.service;
    	      this.signingMethod = defaults.signingMethod;
    	      this.signingName = defaults.signingName;
    	      this.signingRegion = defaults.signingRegion;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder signingMethod(@Nullable String signingMethod) {

            this.signingMethod = signingMethod;
            return this;
        }
        @CustomType.Setter
        public Builder signingName(@Nullable String signingName) {

            this.signingName = signingName;
            return this;
        }
        @CustomType.Setter
        public Builder signingRegion(@Nullable String signingRegion) {

            this.signingRegion = signingRegion;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride build() {
            final var _resultValue = new ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride();
            _resultValue.region = region;
            _resultValue.service = service;
            _resultValue.signingMethod = signingMethod;
            _resultValue.signingName = signingName;
            _resultValue.signingRegion = signingRegion;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
