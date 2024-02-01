// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigIngressUpdateStrategyRollingUpdate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigIngressUpdateStrategy {
    /**
     * @return Rolling update for update strategy
     * 
     */
    private @Nullable GetClusterRkeConfigIngressUpdateStrategyRollingUpdate rollingUpdate;
    /**
     * @return Strategy
     * 
     */
    private @Nullable String strategy;

    private GetClusterRkeConfigIngressUpdateStrategy() {}
    /**
     * @return Rolling update for update strategy
     * 
     */
    public Optional<GetClusterRkeConfigIngressUpdateStrategyRollingUpdate> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * @return Strategy
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigIngressUpdateStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetClusterRkeConfigIngressUpdateStrategyRollingUpdate rollingUpdate;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(GetClusterRkeConfigIngressUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder rollingUpdate(@Nullable GetClusterRkeConfigIngressUpdateStrategyRollingUpdate rollingUpdate) {

            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public GetClusterRkeConfigIngressUpdateStrategy build() {
            final var _resultValue = new GetClusterRkeConfigIngressUpdateStrategy();
            _resultValue.rollingUpdate = rollingUpdate;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
