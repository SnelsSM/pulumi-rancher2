// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigUpgradeStrategyDrainInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigUpgradeStrategyDrainInputArgs Empty = new ClusterRkeConfigUpgradeStrategyDrainInputArgs();

    /**
     * Delete RKE node local data. Default: `false` (bool)
     * 
     */
    @Import(name="deleteLocalData")
    private @Nullable Output<Boolean> deleteLocalData;

    /**
     * @return Delete RKE node local data. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> deleteLocalData() {
        return Optional.ofNullable(this.deleteLocalData);
    }

    /**
     * Force RKE node drain. Default: `false` (bool)
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Force RKE node drain. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * RKE node drain grace period. Default: `-1` (int)
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    /**
     * @return RKE node drain grace period. Default: `-1` (int)
     * 
     */
    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * Ignore RKE daemon sets. Default: `true` (bool)
     * 
     */
    @Import(name="ignoreDaemonSets")
    private @Nullable Output<Boolean> ignoreDaemonSets;

    /**
     * @return Ignore RKE daemon sets. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> ignoreDaemonSets() {
        return Optional.ofNullable(this.ignoreDaemonSets);
    }

    /**
     * RKE node drain timeout. Default: `60` (int)
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return RKE node drain timeout. Default: `60` (int)
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ClusterRkeConfigUpgradeStrategyDrainInputArgs() {}

    private ClusterRkeConfigUpgradeStrategyDrainInputArgs(ClusterRkeConfigUpgradeStrategyDrainInputArgs $) {
        this.deleteLocalData = $.deleteLocalData;
        this.force = $.force;
        this.gracePeriod = $.gracePeriod;
        this.ignoreDaemonSets = $.ignoreDaemonSets;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigUpgradeStrategyDrainInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigUpgradeStrategyDrainInputArgs $;

        public Builder() {
            $ = new ClusterRkeConfigUpgradeStrategyDrainInputArgs();
        }

        public Builder(ClusterRkeConfigUpgradeStrategyDrainInputArgs defaults) {
            $ = new ClusterRkeConfigUpgradeStrategyDrainInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteLocalData Delete RKE node local data. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder deleteLocalData(@Nullable Output<Boolean> deleteLocalData) {
            $.deleteLocalData = deleteLocalData;
            return this;
        }

        /**
         * @param deleteLocalData Delete RKE node local data. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder deleteLocalData(Boolean deleteLocalData) {
            return deleteLocalData(Output.of(deleteLocalData));
        }

        /**
         * @param force Force RKE node drain. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Force RKE node drain. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param gracePeriod RKE node drain grace period. Default: `-1` (int)
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param gracePeriod RKE node drain grace period. Default: `-1` (int)
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param ignoreDaemonSets Ignore RKE daemon sets. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder ignoreDaemonSets(@Nullable Output<Boolean> ignoreDaemonSets) {
            $.ignoreDaemonSets = ignoreDaemonSets;
            return this;
        }

        /**
         * @param ignoreDaemonSets Ignore RKE daemon sets. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder ignoreDaemonSets(Boolean ignoreDaemonSets) {
            return ignoreDaemonSets(Output.of(ignoreDaemonSets));
        }

        /**
         * @param timeout RKE node drain timeout. Default: `60` (int)
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout RKE node drain timeout. Default: `60` (int)
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public ClusterRkeConfigUpgradeStrategyDrainInputArgs build() {
            return $;
        }
    }

}
