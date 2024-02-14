// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcd;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcdSnapshotCreate;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcdSnapshotRestore;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigLocalAuthEndpoint;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePool;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePoolDefault;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachineSelectorConfig;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachineSelectorFile;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistries;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRotateCertificates;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigUpgradeStrategy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfig {
    /**
     * @return Cluster V2 additional manifest
     * 
     */
    private @Nullable String additionalManifest;
    /**
     * @return Cluster V2 chart values. It should be in YAML format
     * 
     */
    private @Nullable String chartValues;
    /**
     * @return Cluster V2 etcd
     * 
     */
    private GetClusterV2RkeConfigEtcd etcd;
    /**
     * @return Cluster V2 etcd snapshot create
     * 
     */
    private @Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
    /**
     * @return Cluster V2 etcd snapshot restore
     * 
     */
    private @Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
    /**
     * @return Cluster V2 local auth endpoint
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    private @Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
    /**
     * @return Cluster V2 machine global config
     * 
     */
    private @Nullable String machineGlobalConfig;
    /**
     * @return Default values for machine pool configurations if unset
     * 
     */
    private List<GetClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults;
    /**
     * @return Cluster V2 machine pools
     * 
     */
    private List<GetClusterV2RkeConfigMachinePool> machinePools;
    /**
     * @return Cluster V2 machine selector config
     * 
     */
    private List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
    /**
     * @return Cluster V2 machine selector files
     * 
     */
    private List<GetClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles;
    /**
     * @return Cluster V2 registries
     * 
     */
    private @Nullable GetClusterV2RkeConfigRegistries registries;
    /**
     * @return Cluster V2 certificate rotation
     * 
     */
    private @Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates;
    /**
     * @return Cluster V2 upgrade strategy
     * 
     */
    private @Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy;

    private GetClusterV2RkeConfig() {}
    /**
     * @return Cluster V2 additional manifest
     * 
     */
    public Optional<String> additionalManifest() {
        return Optional.ofNullable(this.additionalManifest);
    }
    /**
     * @return Cluster V2 chart values. It should be in YAML format
     * 
     */
    public Optional<String> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    /**
     * @return Cluster V2 etcd
     * 
     */
    public GetClusterV2RkeConfigEtcd etcd() {
        return this.etcd;
    }
    /**
     * @return Cluster V2 etcd snapshot create
     * 
     */
    public Optional<GetClusterV2RkeConfigEtcdSnapshotCreate> etcdSnapshotCreate() {
        return Optional.ofNullable(this.etcdSnapshotCreate);
    }
    /**
     * @return Cluster V2 etcd snapshot restore
     * 
     */
    public Optional<GetClusterV2RkeConfigEtcdSnapshotRestore> etcdSnapshotRestore() {
        return Optional.ofNullable(this.etcdSnapshotRestore);
    }
    /**
     * @return Cluster V2 local auth endpoint
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    public Optional<GetClusterV2RkeConfigLocalAuthEndpoint> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }
    /**
     * @return Cluster V2 machine global config
     * 
     */
    public Optional<String> machineGlobalConfig() {
        return Optional.ofNullable(this.machineGlobalConfig);
    }
    /**
     * @return Default values for machine pool configurations if unset
     * 
     */
    public List<GetClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults() {
        return this.machinePoolDefaults;
    }
    /**
     * @return Cluster V2 machine pools
     * 
     */
    public List<GetClusterV2RkeConfigMachinePool> machinePools() {
        return this.machinePools;
    }
    /**
     * @return Cluster V2 machine selector config
     * 
     */
    public List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs() {
        return this.machineSelectorConfigs;
    }
    /**
     * @return Cluster V2 machine selector files
     * 
     */
    public List<GetClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles() {
        return this.machineSelectorFiles;
    }
    /**
     * @return Cluster V2 registries
     * 
     */
    public Optional<GetClusterV2RkeConfigRegistries> registries() {
        return Optional.ofNullable(this.registries);
    }
    /**
     * @return Cluster V2 certificate rotation
     * 
     */
    public Optional<GetClusterV2RkeConfigRotateCertificates> rotateCertificates() {
        return Optional.ofNullable(this.rotateCertificates);
    }
    /**
     * @return Cluster V2 upgrade strategy
     * 
     */
    public Optional<GetClusterV2RkeConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalManifest;
        private @Nullable String chartValues;
        private GetClusterV2RkeConfigEtcd etcd;
        private @Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
        private @Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
        private @Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
        private @Nullable String machineGlobalConfig;
        private List<GetClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults;
        private List<GetClusterV2RkeConfigMachinePool> machinePools;
        private List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
        private List<GetClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles;
        private @Nullable GetClusterV2RkeConfigRegistries registries;
        private @Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates;
        private @Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy;
        public Builder() {}
        public Builder(GetClusterV2RkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalManifest = defaults.additionalManifest;
    	      this.chartValues = defaults.chartValues;
    	      this.etcd = defaults.etcd;
    	      this.etcdSnapshotCreate = defaults.etcdSnapshotCreate;
    	      this.etcdSnapshotRestore = defaults.etcdSnapshotRestore;
    	      this.localAuthEndpoint = defaults.localAuthEndpoint;
    	      this.machineGlobalConfig = defaults.machineGlobalConfig;
    	      this.machinePoolDefaults = defaults.machinePoolDefaults;
    	      this.machinePools = defaults.machinePools;
    	      this.machineSelectorConfigs = defaults.machineSelectorConfigs;
    	      this.machineSelectorFiles = defaults.machineSelectorFiles;
    	      this.registries = defaults.registries;
    	      this.rotateCertificates = defaults.rotateCertificates;
    	      this.upgradeStrategy = defaults.upgradeStrategy;
        }

        @CustomType.Setter
        public Builder additionalManifest(@Nullable String additionalManifest) {

            this.additionalManifest = additionalManifest;
            return this;
        }
        @CustomType.Setter
        public Builder chartValues(@Nullable String chartValues) {

            this.chartValues = chartValues;
            return this;
        }
        @CustomType.Setter
        public Builder etcd(GetClusterV2RkeConfigEtcd etcd) {
            if (etcd == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfig", "etcd");
            }
            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotCreate(@Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate) {

            this.etcdSnapshotCreate = etcdSnapshotCreate;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotRestore(@Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore) {

            this.etcdSnapshotRestore = etcdSnapshotRestore;
            return this;
        }
        @CustomType.Setter
        public Builder localAuthEndpoint(@Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint) {

            this.localAuthEndpoint = localAuthEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder machineGlobalConfig(@Nullable String machineGlobalConfig) {

            this.machineGlobalConfig = machineGlobalConfig;
            return this;
        }
        @CustomType.Setter
        public Builder machinePoolDefaults(List<GetClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults) {
            if (machinePoolDefaults == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfig", "machinePoolDefaults");
            }
            this.machinePoolDefaults = machinePoolDefaults;
            return this;
        }
        public Builder machinePoolDefaults(GetClusterV2RkeConfigMachinePoolDefault... machinePoolDefaults) {
            return machinePoolDefaults(List.of(machinePoolDefaults));
        }
        @CustomType.Setter
        public Builder machinePools(List<GetClusterV2RkeConfigMachinePool> machinePools) {
            if (machinePools == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfig", "machinePools");
            }
            this.machinePools = machinePools;
            return this;
        }
        public Builder machinePools(GetClusterV2RkeConfigMachinePool... machinePools) {
            return machinePools(List.of(machinePools));
        }
        @CustomType.Setter
        public Builder machineSelectorConfigs(List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs) {
            if (machineSelectorConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfig", "machineSelectorConfigs");
            }
            this.machineSelectorConfigs = machineSelectorConfigs;
            return this;
        }
        public Builder machineSelectorConfigs(GetClusterV2RkeConfigMachineSelectorConfig... machineSelectorConfigs) {
            return machineSelectorConfigs(List.of(machineSelectorConfigs));
        }
        @CustomType.Setter
        public Builder machineSelectorFiles(List<GetClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles) {
            if (machineSelectorFiles == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfig", "machineSelectorFiles");
            }
            this.machineSelectorFiles = machineSelectorFiles;
            return this;
        }
        public Builder machineSelectorFiles(GetClusterV2RkeConfigMachineSelectorFile... machineSelectorFiles) {
            return machineSelectorFiles(List.of(machineSelectorFiles));
        }
        @CustomType.Setter
        public Builder registries(@Nullable GetClusterV2RkeConfigRegistries registries) {

            this.registries = registries;
            return this;
        }
        @CustomType.Setter
        public Builder rotateCertificates(@Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates) {

            this.rotateCertificates = rotateCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy) {

            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        public GetClusterV2RkeConfig build() {
            final var _resultValue = new GetClusterV2RkeConfig();
            _resultValue.additionalManifest = additionalManifest;
            _resultValue.chartValues = chartValues;
            _resultValue.etcd = etcd;
            _resultValue.etcdSnapshotCreate = etcdSnapshotCreate;
            _resultValue.etcdSnapshotRestore = etcdSnapshotRestore;
            _resultValue.localAuthEndpoint = localAuthEndpoint;
            _resultValue.machineGlobalConfig = machineGlobalConfig;
            _resultValue.machinePoolDefaults = machinePoolDefaults;
            _resultValue.machinePools = machinePools;
            _resultValue.machineSelectorConfigs = machineSelectorConfigs;
            _resultValue.machineSelectorFiles = machineSelectorFiles;
            _resultValue.registries = registries;
            _resultValue.rotateCertificates = rotateCertificates;
            _resultValue.upgradeStrategy = upgradeStrategy;
            return _resultValue;
        }
    }
}
