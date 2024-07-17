// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.EtcdBackupBackupConfigS3BackupConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EtcdBackupBackupConfig {
    /**
     * @return Enable etcd backup (bool)
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Interval hours for etcd backup. Default `12` (int)
     * 
     */
    private @Nullable Integer intervalHours;
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    private @Nullable Integer retention;
    /**
     * @return S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
     * 
     */
    private @Nullable EtcdBackupBackupConfigS3BackupConfig s3BackupConfig;
    private @Nullable Boolean safeTimestamp;
    private @Nullable Integer timeout;

    private EtcdBackupBackupConfig() {}
    /**
     * @return Enable etcd backup (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Interval hours for etcd backup. Default `12` (int)
     * 
     */
    public Optional<Integer> intervalHours() {
        return Optional.ofNullable(this.intervalHours);
    }
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    public Optional<Integer> retention() {
        return Optional.ofNullable(this.retention);
    }
    /**
     * @return S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
     * 
     */
    public Optional<EtcdBackupBackupConfigS3BackupConfig> s3BackupConfig() {
        return Optional.ofNullable(this.s3BackupConfig);
    }
    public Optional<Boolean> safeTimestamp() {
        return Optional.ofNullable(this.safeTimestamp);
    }
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtcdBackupBackupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer intervalHours;
        private @Nullable Integer retention;
        private @Nullable EtcdBackupBackupConfigS3BackupConfig s3BackupConfig;
        private @Nullable Boolean safeTimestamp;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(EtcdBackupBackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.intervalHours = defaults.intervalHours;
    	      this.retention = defaults.retention;
    	      this.s3BackupConfig = defaults.s3BackupConfig;
    	      this.safeTimestamp = defaults.safeTimestamp;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder intervalHours(@Nullable Integer intervalHours) {

            this.intervalHours = intervalHours;
            return this;
        }
        @CustomType.Setter
        public Builder retention(@Nullable Integer retention) {

            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder s3BackupConfig(@Nullable EtcdBackupBackupConfigS3BackupConfig s3BackupConfig) {

            this.s3BackupConfig = s3BackupConfig;
            return this;
        }
        @CustomType.Setter
        public Builder safeTimestamp(@Nullable Boolean safeTimestamp) {

            this.safeTimestamp = safeTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public EtcdBackupBackupConfig build() {
            final var _resultValue = new EtcdBackupBackupConfig();
            _resultValue.enabled = enabled;
            _resultValue.intervalHours = intervalHours;
            _resultValue.retention = retention;
            _resultValue.s3BackupConfig = s3BackupConfig;
            _resultValue.safeTimestamp = safeTimestamp;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
