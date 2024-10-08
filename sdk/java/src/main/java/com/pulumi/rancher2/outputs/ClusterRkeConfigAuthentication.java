// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigAuthentication {
    /**
     * @return RKE sans for authentication ([]string)
     * 
     */
    private @Nullable List<String> sans;
    /**
     * @return Monitoring deployment update strategy (string)
     * 
     */
    private @Nullable String strategy;

    private ClusterRkeConfigAuthentication() {}
    /**
     * @return RKE sans for authentication ([]string)
     * 
     */
    public List<String> sans() {
        return this.sans == null ? List.of() : this.sans;
    }
    /**
     * @return Monitoring deployment update strategy (string)
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> sans;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(ClusterRkeConfigAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sans = defaults.sans;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder sans(@Nullable List<String> sans) {

            this.sans = sans;
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public ClusterRkeConfigAuthentication build() {
            final var _resultValue = new ClusterRkeConfigAuthentication();
            _resultValue.sans = sans;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
