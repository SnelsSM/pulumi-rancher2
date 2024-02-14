// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcdS3Config;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigEtcd {
    /**
     * @return Disable ETCD snapshots.
     * 
     */
    private @Nullable Boolean disableSnapshots;
    /**
     * @return Creation option for etcd service.
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcdS3Config s3Config;
    /**
     * @return ETCD snapshot retention.
     * 
     */
    private @Nullable Integer snapshotRetention;
    /**
     * @return ETCD snapshot schedule cron (e.g `\&#34;0 *{@literal /}5 * * *\&#34;`).
     * 
     */
    private @Nullable String snapshotScheduleCron;

    private ClusterV2RkeConfigEtcd() {}
    /**
     * @return Disable ETCD snapshots.
     * 
     */
    public Optional<Boolean> disableSnapshots() {
        return Optional.ofNullable(this.disableSnapshots);
    }
    /**
     * @return Creation option for etcd service.
     * 
     */
    public Optional<ClusterV2RkeConfigEtcdS3Config> s3Config() {
        return Optional.ofNullable(this.s3Config);
    }
    /**
     * @return ETCD snapshot retention.
     * 
     */
    public Optional<Integer> snapshotRetention() {
        return Optional.ofNullable(this.snapshotRetention);
    }
    /**
     * @return ETCD snapshot schedule cron (e.g `\&#34;0 *{@literal /}5 * * *\&#34;`).
     * 
     */
    public Optional<String> snapshotScheduleCron() {
        return Optional.ofNullable(this.snapshotScheduleCron);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigEtcd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableSnapshots;
        private @Nullable ClusterV2RkeConfigEtcdS3Config s3Config;
        private @Nullable Integer snapshotRetention;
        private @Nullable String snapshotScheduleCron;
        public Builder() {}
        public Builder(ClusterV2RkeConfigEtcd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSnapshots = defaults.disableSnapshots;
    	      this.s3Config = defaults.s3Config;
    	      this.snapshotRetention = defaults.snapshotRetention;
    	      this.snapshotScheduleCron = defaults.snapshotScheduleCron;
        }

        @CustomType.Setter
        public Builder disableSnapshots(@Nullable Boolean disableSnapshots) {

            this.disableSnapshots = disableSnapshots;
            return this;
        }
        @CustomType.Setter
        public Builder s3Config(@Nullable ClusterV2RkeConfigEtcdS3Config s3Config) {

            this.s3Config = s3Config;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotRetention(@Nullable Integer snapshotRetention) {

            this.snapshotRetention = snapshotRetention;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotScheduleCron(@Nullable String snapshotScheduleCron) {

            this.snapshotScheduleCron = snapshotScheduleCron;
            return this;
        }
        public ClusterV2RkeConfigEtcd build() {
            final var _resultValue = new ClusterV2RkeConfigEtcd();
            _resultValue.disableSnapshots = disableSnapshots;
            _resultValue.s3Config = s3Config;
            _resultValue.snapshotRetention = snapshotRetention;
            _resultValue.snapshotScheduleCron = snapshotScheduleCron;
            return _resultValue;
        }
    }
}
