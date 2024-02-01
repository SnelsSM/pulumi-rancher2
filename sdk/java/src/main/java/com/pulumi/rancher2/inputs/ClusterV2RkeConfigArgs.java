// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigEtcdArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigEtcdSnapshotCreateArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigEtcdSnapshotRestoreArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigLocalAuthEndpointArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachinePoolArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachinePoolDefaultArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachineSelectorConfigArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigRegistriesArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigRotateCertificatesArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigUpgradeStrategyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigArgs Empty = new ClusterV2RkeConfigArgs();

    /**
     * Cluster V2 additional manifest (string)
     * 
     */
    @Import(name="additionalManifest")
    private @Nullable Output<String> additionalManifest;

    /**
     * @return Cluster V2 additional manifest (string)
     * 
     */
    public Optional<Output<String>> additionalManifest() {
        return Optional.ofNullable(this.additionalManifest);
    }

    /**
     * Cluster V2 chart values. Must be in YAML format (string)
     * 
     */
    @Import(name="chartValues")
    private @Nullable Output<String> chartValues;

    /**
     * @return Cluster V2 chart values. Must be in YAML format (string)
     * 
     */
    public Optional<Output<String>> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }

    /**
     * Cluster V2 etcd (list maxitems:1)
     * 
     */
    @Import(name="etcd")
    private @Nullable Output<ClusterV2RkeConfigEtcdArgs> etcd;

    /**
     * @return Cluster V2 etcd (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigEtcdArgs>> etcd() {
        return Optional.ofNullable(this.etcd);
    }

    /**
     * Cluster V2 etcd snapshot create (list maxitems:1)
     * 
     */
    @Import(name="etcdSnapshotCreate")
    private @Nullable Output<ClusterV2RkeConfigEtcdSnapshotCreateArgs> etcdSnapshotCreate;

    /**
     * @return Cluster V2 etcd snapshot create (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigEtcdSnapshotCreateArgs>> etcdSnapshotCreate() {
        return Optional.ofNullable(this.etcdSnapshotCreate);
    }

    /**
     * Cluster V2 etcd snapshot restore (list maxitems:1)
     * 
     */
    @Import(name="etcdSnapshotRestore")
    private @Nullable Output<ClusterV2RkeConfigEtcdSnapshotRestoreArgs> etcdSnapshotRestore;

    /**
     * @return Cluster V2 etcd snapshot restore (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigEtcdSnapshotRestoreArgs>> etcdSnapshotRestore() {
        return Optional.ofNullable(this.etcdSnapshotRestore);
    }

    /**
     * Cluster V2 local auth endpoint (list maxitems:1)
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    @Import(name="localAuthEndpoint")
    private @Nullable Output<ClusterV2RkeConfigLocalAuthEndpointArgs> localAuthEndpoint;

    /**
     * @return Cluster V2 local auth endpoint (list maxitems:1)
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    public Optional<Output<ClusterV2RkeConfigLocalAuthEndpointArgs>> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }

    /**
     * Cluster V2 machine global config. Must be in YAML format (string)
     * 
     */
    @Import(name="machineGlobalConfig")
    private @Nullable Output<String> machineGlobalConfig;

    /**
     * @return Cluster V2 machine global config. Must be in YAML format (string)
     * 
     */
    public Optional<Output<String>> machineGlobalConfig() {
        return Optional.ofNullable(this.machineGlobalConfig);
    }

    /**
     * Default values for machine pool configurations if unset
     * 
     */
    @Import(name="machinePoolDefaults")
    private @Nullable Output<List<ClusterV2RkeConfigMachinePoolDefaultArgs>> machinePoolDefaults;

    /**
     * @return Default values for machine pool configurations if unset
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachinePoolDefaultArgs>>> machinePoolDefaults() {
        return Optional.ofNullable(this.machinePoolDefaults);
    }

    /**
     * Cluster V2 machine pools (list)
     * 
     */
    @Import(name="machinePools")
    private @Nullable Output<List<ClusterV2RkeConfigMachinePoolArgs>> machinePools;

    /**
     * @return Cluster V2 machine pools (list)
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachinePoolArgs>>> machinePools() {
        return Optional.ofNullable(this.machinePools);
    }

    /**
     * Cluster V2 machine selector config (list)
     * 
     */
    @Import(name="machineSelectorConfigs")
    private @Nullable Output<List<ClusterV2RkeConfigMachineSelectorConfigArgs>> machineSelectorConfigs;

    /**
     * @return Cluster V2 machine selector config (list)
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachineSelectorConfigArgs>>> machineSelectorConfigs() {
        return Optional.ofNullable(this.machineSelectorConfigs);
    }

    /**
     * Cluster V2 docker registries (list maxitems:1)
     * 
     */
    @Import(name="registries")
    private @Nullable Output<ClusterV2RkeConfigRegistriesArgs> registries;

    /**
     * @return Cluster V2 docker registries (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigRegistriesArgs>> registries() {
        return Optional.ofNullable(this.registries);
    }

    /**
     * Cluster V2 certificate rotation (list maxitems:1)
     * 
     */
    @Import(name="rotateCertificates")
    private @Nullable Output<ClusterV2RkeConfigRotateCertificatesArgs> rotateCertificates;

    /**
     * @return Cluster V2 certificate rotation (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigRotateCertificatesArgs>> rotateCertificates() {
        return Optional.ofNullable(this.rotateCertificates);
    }

    /**
     * Cluster V2 upgrade strategy (list maxitems:1)
     * 
     */
    @Import(name="upgradeStrategy")
    private @Nullable Output<ClusterV2RkeConfigUpgradeStrategyArgs> upgradeStrategy;

    /**
     * @return Cluster V2 upgrade strategy (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigUpgradeStrategyArgs>> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    private ClusterV2RkeConfigArgs() {}

    private ClusterV2RkeConfigArgs(ClusterV2RkeConfigArgs $) {
        this.additionalManifest = $.additionalManifest;
        this.chartValues = $.chartValues;
        this.etcd = $.etcd;
        this.etcdSnapshotCreate = $.etcdSnapshotCreate;
        this.etcdSnapshotRestore = $.etcdSnapshotRestore;
        this.localAuthEndpoint = $.localAuthEndpoint;
        this.machineGlobalConfig = $.machineGlobalConfig;
        this.machinePoolDefaults = $.machinePoolDefaults;
        this.machinePools = $.machinePools;
        this.machineSelectorConfigs = $.machineSelectorConfigs;
        this.registries = $.registries;
        this.rotateCertificates = $.rotateCertificates;
        this.upgradeStrategy = $.upgradeStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigArgs();
        }

        public Builder(ClusterV2RkeConfigArgs defaults) {
            $ = new ClusterV2RkeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalManifest Cluster V2 additional manifest (string)
         * 
         * @return builder
         * 
         */
        public Builder additionalManifest(@Nullable Output<String> additionalManifest) {
            $.additionalManifest = additionalManifest;
            return this;
        }

        /**
         * @param additionalManifest Cluster V2 additional manifest (string)
         * 
         * @return builder
         * 
         */
        public Builder additionalManifest(String additionalManifest) {
            return additionalManifest(Output.of(additionalManifest));
        }

        /**
         * @param chartValues Cluster V2 chart values. Must be in YAML format (string)
         * 
         * @return builder
         * 
         */
        public Builder chartValues(@Nullable Output<String> chartValues) {
            $.chartValues = chartValues;
            return this;
        }

        /**
         * @param chartValues Cluster V2 chart values. Must be in YAML format (string)
         * 
         * @return builder
         * 
         */
        public Builder chartValues(String chartValues) {
            return chartValues(Output.of(chartValues));
        }

        /**
         * @param etcd Cluster V2 etcd (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcd(@Nullable Output<ClusterV2RkeConfigEtcdArgs> etcd) {
            $.etcd = etcd;
            return this;
        }

        /**
         * @param etcd Cluster V2 etcd (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcd(ClusterV2RkeConfigEtcdArgs etcd) {
            return etcd(Output.of(etcd));
        }

        /**
         * @param etcdSnapshotCreate Cluster V2 etcd snapshot create (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotCreate(@Nullable Output<ClusterV2RkeConfigEtcdSnapshotCreateArgs> etcdSnapshotCreate) {
            $.etcdSnapshotCreate = etcdSnapshotCreate;
            return this;
        }

        /**
         * @param etcdSnapshotCreate Cluster V2 etcd snapshot create (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotCreate(ClusterV2RkeConfigEtcdSnapshotCreateArgs etcdSnapshotCreate) {
            return etcdSnapshotCreate(Output.of(etcdSnapshotCreate));
        }

        /**
         * @param etcdSnapshotRestore Cluster V2 etcd snapshot restore (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotRestore(@Nullable Output<ClusterV2RkeConfigEtcdSnapshotRestoreArgs> etcdSnapshotRestore) {
            $.etcdSnapshotRestore = etcdSnapshotRestore;
            return this;
        }

        /**
         * @param etcdSnapshotRestore Cluster V2 etcd snapshot restore (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotRestore(ClusterV2RkeConfigEtcdSnapshotRestoreArgs etcdSnapshotRestore) {
            return etcdSnapshotRestore(Output.of(etcdSnapshotRestore));
        }

        /**
         * @param localAuthEndpoint Cluster V2 local auth endpoint (list maxitems:1)
         * 
         * @return builder
         * 
         * @deprecated
         * Use rancher2_cluster_v2.local_auth_endpoint instead
         * 
         */
        @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
        public Builder localAuthEndpoint(@Nullable Output<ClusterV2RkeConfigLocalAuthEndpointArgs> localAuthEndpoint) {
            $.localAuthEndpoint = localAuthEndpoint;
            return this;
        }

        /**
         * @param localAuthEndpoint Cluster V2 local auth endpoint (list maxitems:1)
         * 
         * @return builder
         * 
         * @deprecated
         * Use rancher2_cluster_v2.local_auth_endpoint instead
         * 
         */
        @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
        public Builder localAuthEndpoint(ClusterV2RkeConfigLocalAuthEndpointArgs localAuthEndpoint) {
            return localAuthEndpoint(Output.of(localAuthEndpoint));
        }

        /**
         * @param machineGlobalConfig Cluster V2 machine global config. Must be in YAML format (string)
         * 
         * @return builder
         * 
         */
        public Builder machineGlobalConfig(@Nullable Output<String> machineGlobalConfig) {
            $.machineGlobalConfig = machineGlobalConfig;
            return this;
        }

        /**
         * @param machineGlobalConfig Cluster V2 machine global config. Must be in YAML format (string)
         * 
         * @return builder
         * 
         */
        public Builder machineGlobalConfig(String machineGlobalConfig) {
            return machineGlobalConfig(Output.of(machineGlobalConfig));
        }

        /**
         * @param machinePoolDefaults Default values for machine pool configurations if unset
         * 
         * @return builder
         * 
         */
        public Builder machinePoolDefaults(@Nullable Output<List<ClusterV2RkeConfigMachinePoolDefaultArgs>> machinePoolDefaults) {
            $.machinePoolDefaults = machinePoolDefaults;
            return this;
        }

        /**
         * @param machinePoolDefaults Default values for machine pool configurations if unset
         * 
         * @return builder
         * 
         */
        public Builder machinePoolDefaults(List<ClusterV2RkeConfigMachinePoolDefaultArgs> machinePoolDefaults) {
            return machinePoolDefaults(Output.of(machinePoolDefaults));
        }

        /**
         * @param machinePoolDefaults Default values for machine pool configurations if unset
         * 
         * @return builder
         * 
         */
        public Builder machinePoolDefaults(ClusterV2RkeConfigMachinePoolDefaultArgs... machinePoolDefaults) {
            return machinePoolDefaults(List.of(machinePoolDefaults));
        }

        /**
         * @param machinePools Cluster V2 machine pools (list)
         * 
         * @return builder
         * 
         */
        public Builder machinePools(@Nullable Output<List<ClusterV2RkeConfigMachinePoolArgs>> machinePools) {
            $.machinePools = machinePools;
            return this;
        }

        /**
         * @param machinePools Cluster V2 machine pools (list)
         * 
         * @return builder
         * 
         */
        public Builder machinePools(List<ClusterV2RkeConfigMachinePoolArgs> machinePools) {
            return machinePools(Output.of(machinePools));
        }

        /**
         * @param machinePools Cluster V2 machine pools (list)
         * 
         * @return builder
         * 
         */
        public Builder machinePools(ClusterV2RkeConfigMachinePoolArgs... machinePools) {
            return machinePools(List.of(machinePools));
        }

        /**
         * @param machineSelectorConfigs Cluster V2 machine selector config (list)
         * 
         * @return builder
         * 
         */
        public Builder machineSelectorConfigs(@Nullable Output<List<ClusterV2RkeConfigMachineSelectorConfigArgs>> machineSelectorConfigs) {
            $.machineSelectorConfigs = machineSelectorConfigs;
            return this;
        }

        /**
         * @param machineSelectorConfigs Cluster V2 machine selector config (list)
         * 
         * @return builder
         * 
         */
        public Builder machineSelectorConfigs(List<ClusterV2RkeConfigMachineSelectorConfigArgs> machineSelectorConfigs) {
            return machineSelectorConfigs(Output.of(machineSelectorConfigs));
        }

        /**
         * @param machineSelectorConfigs Cluster V2 machine selector config (list)
         * 
         * @return builder
         * 
         */
        public Builder machineSelectorConfigs(ClusterV2RkeConfigMachineSelectorConfigArgs... machineSelectorConfigs) {
            return machineSelectorConfigs(List.of(machineSelectorConfigs));
        }

        /**
         * @param registries Cluster V2 docker registries (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder registries(@Nullable Output<ClusterV2RkeConfigRegistriesArgs> registries) {
            $.registries = registries;
            return this;
        }

        /**
         * @param registries Cluster V2 docker registries (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder registries(ClusterV2RkeConfigRegistriesArgs registries) {
            return registries(Output.of(registries));
        }

        /**
         * @param rotateCertificates Cluster V2 certificate rotation (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rotateCertificates(@Nullable Output<ClusterV2RkeConfigRotateCertificatesArgs> rotateCertificates) {
            $.rotateCertificates = rotateCertificates;
            return this;
        }

        /**
         * @param rotateCertificates Cluster V2 certificate rotation (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rotateCertificates(ClusterV2RkeConfigRotateCertificatesArgs rotateCertificates) {
            return rotateCertificates(Output.of(rotateCertificates));
        }

        /**
         * @param upgradeStrategy Cluster V2 upgrade strategy (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(@Nullable Output<ClusterV2RkeConfigUpgradeStrategyArgs> upgradeStrategy) {
            $.upgradeStrategy = upgradeStrategy;
            return this;
        }

        /**
         * @param upgradeStrategy Cluster V2 upgrade strategy (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder upgradeStrategy(ClusterV2RkeConfigUpgradeStrategyArgs upgradeStrategy) {
            return upgradeStrategy(Output.of(upgradeStrategy));
        }

        public ClusterV2RkeConfigArgs build() {
            return $;
        }
    }

}
