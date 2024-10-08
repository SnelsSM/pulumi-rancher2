// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigDnsUpdateStrategyRollingUpdate {
    /**
     * @return Rolling update max surge
     * 
     */
    private @Nullable Integer maxSurge;
    /**
     * @return Rolling update max unavailable
     * 
     */
    private @Nullable Integer maxUnavailable;

    private ClusterRkeConfigDnsUpdateStrategyRollingUpdate() {}
    /**
     * @return Rolling update max surge
     * 
     */
    public Optional<Integer> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return Rolling update max unavailable
     * 
     */
    public Optional<Integer> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigDnsUpdateStrategyRollingUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxSurge;
        private @Nullable Integer maxUnavailable;
        public Builder() {}
        public Builder(ClusterRkeConfigDnsUpdateStrategyRollingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        @CustomType.Setter
        public Builder maxSurge(@Nullable Integer maxSurge) {

            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {

            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public ClusterRkeConfigDnsUpdateStrategyRollingUpdate build() {
            final var _resultValue = new ClusterRkeConfigDnsUpdateStrategyRollingUpdate();
            _resultValue.maxSurge = maxSurge;
            _resultValue.maxUnavailable = maxUnavailable;
            return _resultValue;
        }
    }
}
