// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigRegistriesMirror {
    /**
     * @return Registry mirror endpoints
     * 
     */
    private @Nullable List<String> endpoints;
    /**
     * @return Registry hostname
     * 
     */
    private String hostname;
    /**
     * @return Registry mirror rewrites
     * 
     */
    private @Nullable Map<String,Object> rewrites;

    private GetClusterV2RkeConfigRegistriesMirror() {}
    /**
     * @return Registry mirror endpoints
     * 
     */
    public List<String> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * @return Registry hostname
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Registry mirror rewrites
     * 
     */
    public Map<String,Object> rewrites() {
        return this.rewrites == null ? Map.of() : this.rewrites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigRegistriesMirror defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> endpoints;
        private String hostname;
        private @Nullable Map<String,Object> rewrites;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigRegistriesMirror defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.hostname = defaults.hostname;
    	      this.rewrites = defaults.rewrites;
        }

        @CustomType.Setter
        public Builder endpoints(@Nullable List<String> endpoints) {

            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigRegistriesMirror", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder rewrites(@Nullable Map<String,Object> rewrites) {

            this.rewrites = rewrites;
            return this;
        }
        public GetClusterV2RkeConfigRegistriesMirror build() {
            final var _resultValue = new GetClusterV2RkeConfigRegistriesMirror();
            _resultValue.endpoints = endpoints;
            _resultValue.hostname = hostname;
            _resultValue.rewrites = rewrites;
            return _resultValue;
        }
    }
}
