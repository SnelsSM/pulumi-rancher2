// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigUpgradeStrategyDrainInput {
    /**
     * @return Delete RKE node local data. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean deleteLocalData;
    /**
     * @return Force RKE node drain. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean force;
    /**
     * @return RKE node drain grace period. Default: `-1` (int)
     * 
     */
    private @Nullable Integer gracePeriod;
    /**
     * @return Ignore RKE daemon sets. Default: `true` (bool)
     * 
     */
    private @Nullable Boolean ignoreDaemonSets;
    /**
     * @return RKE node drain timeout. Default: `60` (int)
     * 
     */
    private @Nullable Integer timeout;

    private ClusterRkeConfigUpgradeStrategyDrainInput() {}
    /**
     * @return Delete RKE node local data. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> deleteLocalData() {
        return Optional.ofNullable(this.deleteLocalData);
    }
    /**
     * @return Force RKE node drain. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> force() {
        return Optional.ofNullable(this.force);
    }
    /**
     * @return RKE node drain grace period. Default: `-1` (int)
     * 
     */
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * @return Ignore RKE daemon sets. Default: `true` (bool)
     * 
     */
    public Optional<Boolean> ignoreDaemonSets() {
        return Optional.ofNullable(this.ignoreDaemonSets);
    }
    /**
     * @return RKE node drain timeout. Default: `60` (int)
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigUpgradeStrategyDrainInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteLocalData;
        private @Nullable Boolean force;
        private @Nullable Integer gracePeriod;
        private @Nullable Boolean ignoreDaemonSets;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(ClusterRkeConfigUpgradeStrategyDrainInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteLocalData = defaults.deleteLocalData;
    	      this.force = defaults.force;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.ignoreDaemonSets = defaults.ignoreDaemonSets;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder deleteLocalData(@Nullable Boolean deleteLocalData) {

            this.deleteLocalData = deleteLocalData;
            return this;
        }
        @CustomType.Setter
        public Builder force(@Nullable Boolean force) {

            this.force = force;
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {

            this.gracePeriod = gracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDaemonSets(@Nullable Boolean ignoreDaemonSets) {

            this.ignoreDaemonSets = ignoreDaemonSets;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public ClusterRkeConfigUpgradeStrategyDrainInput build() {
            final var _resultValue = new ClusterRkeConfigUpgradeStrategyDrainInput();
            _resultValue.deleteLocalData = deleteLocalData;
            _resultValue.force = force;
            _resultValue.gracePeriod = gracePeriod;
            _resultValue.ignoreDaemonSets = ignoreDaemonSets;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
