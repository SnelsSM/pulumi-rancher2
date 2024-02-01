// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachinePoolMachineConfigArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachinePoolRollingUpdateArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigMachinePoolTaintArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigMachinePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachinePoolArgs Empty = new ClusterV2RkeConfigMachinePoolArgs();

    /**
     * Annotations for the Cluster V2 (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for the Cluster V2 (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster V2 cloud credential secret name (string)
     * 
     */
    @Import(name="cloudCredentialSecretName")
    private @Nullable Output<String> cloudCredentialSecretName;

    /**
     * @return Cluster V2 cloud credential secret name (string)
     * 
     */
    public Optional<Output<String>> cloudCredentialSecretName() {
        return Optional.ofNullable(this.cloudCredentialSecretName);
    }

    /**
     * Machine pool control plane role? (bool)
     * 
     */
    @Import(name="controlPlaneRole")
    private @Nullable Output<Boolean> controlPlaneRole;

    /**
     * @return Machine pool control plane role? (bool)
     * 
     */
    public Optional<Output<Boolean>> controlPlaneRole() {
        return Optional.ofNullable(this.controlPlaneRole);
    }

    /**
     * Machine Pool Drain Before Delete? (bool)
     * 
     */
    @Import(name="drainBeforeDelete")
    private @Nullable Output<Boolean> drainBeforeDelete;

    /**
     * @return Machine Pool Drain Before Delete? (bool)
     * 
     */
    public Optional<Output<Boolean>> drainBeforeDelete() {
        return Optional.ofNullable(this.drainBeforeDelete);
    }

    /**
     * Machine pool etcd role? (bool)
     * 
     */
    @Import(name="etcdRole")
    private @Nullable Output<Boolean> etcdRole;

    /**
     * @return Machine pool etcd role? (bool)
     * 
     */
    public Optional<Output<Boolean>> etcdRole() {
        return Optional.ofNullable(this.etcdRole);
    }

    /**
     * maximum length for autogenerated hostname
     * 
     */
    @Import(name="hostnameLengthLimit")
    private @Nullable Output<Integer> hostnameLengthLimit;

    /**
     * @return maximum length for autogenerated hostname
     * 
     */
    public Optional<Output<Integer>> hostnameLengthLimit() {
        return Optional.ofNullable(this.hostnameLengthLimit);
    }

    /**
     * Labels for the Cluster V2 (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the Cluster V2 (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Machine pool node config (list)
     * 
     */
    @Import(name="machineConfig", required=true)
    private Output<ClusterV2RkeConfigMachinePoolMachineConfigArgs> machineConfig;

    /**
     * @return Machine pool node config (list)
     * 
     */
    public Output<ClusterV2RkeConfigMachinePoolMachineConfigArgs> machineConfig() {
        return this.machineConfig;
    }

    /**
     * Labels for Machine pool nodes (map)
     * 
     */
    @Import(name="machineLabels")
    private @Nullable Output<Map<String,Object>> machineLabels;

    /**
     * @return Labels for Machine pool nodes (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> machineLabels() {
        return Optional.ofNullable(this.machineLabels);
    }

    /**
     * Max unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    @Import(name="maxUnhealthy")
    private @Nullable Output<String> maxUnhealthy;

    /**
     * @return Max unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    public Optional<Output<String>> maxUnhealthy() {
        return Optional.ofNullable(this.maxUnhealthy);
    }

    /**
     * The name of the Cluster v2 (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Seconds a machine has to drain before deletion (int)
     * 
     */
    @Import(name="nodeDrainTimeout")
    private @Nullable Output<Integer> nodeDrainTimeout;

    /**
     * @return Seconds a machine has to drain before deletion (int)
     * 
     */
    public Optional<Output<Integer>> nodeDrainTimeout() {
        return Optional.ofNullable(this.nodeDrainTimeout);
    }

    /**
     * Seconds a new node has to become active before it is replaced (int)
     * 
     */
    @Import(name="nodeStartupTimeoutSeconds")
    private @Nullable Output<Integer> nodeStartupTimeoutSeconds;

    /**
     * @return Seconds a new node has to become active before it is replaced (int)
     * 
     */
    public Optional<Output<Integer>> nodeStartupTimeoutSeconds() {
        return Optional.ofNullable(this.nodeStartupTimeoutSeconds);
    }

    /**
     * Machine pool paused? (bool)
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Machine pool paused? (bool)
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Machine pool quantity (int)
     * 
     */
    @Import(name="quantity")
    private @Nullable Output<Integer> quantity;

    /**
     * @return Machine pool quantity (int)
     * 
     */
    public Optional<Output<Integer>> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    /**
     * Machine pool rolling update (List maxitems:1)
     * 
     */
    @Import(name="rollingUpdate")
    private @Nullable Output<ClusterV2RkeConfigMachinePoolRollingUpdateArgs> rollingUpdate;

    /**
     * @return Machine pool rolling update (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterV2RkeConfigMachinePoolRollingUpdateArgs>> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }

    /**
     * Machine pool taints (list)
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<ClusterV2RkeConfigMachinePoolTaintArgs>> taints;

    /**
     * @return Machine pool taints (list)
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigMachinePoolTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    /**
     * Seconds an unhealthy node has to become active before it is replaced (int)
     * 
     */
    @Import(name="unhealthyNodeTimeoutSeconds")
    private @Nullable Output<Integer> unhealthyNodeTimeoutSeconds;

    /**
     * @return Seconds an unhealthy node has to become active before it is replaced (int)
     * 
     */
    public Optional<Output<Integer>> unhealthyNodeTimeoutSeconds() {
        return Optional.ofNullable(this.unhealthyNodeTimeoutSeconds);
    }

    /**
     * Range of unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    @Import(name="unhealthyRange")
    private @Nullable Output<String> unhealthyRange;

    /**
     * @return Range of unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    public Optional<Output<String>> unhealthyRange() {
        return Optional.ofNullable(this.unhealthyRange);
    }

    /**
     * Machine pool worker role? (bool)
     * 
     */
    @Import(name="workerRole")
    private @Nullable Output<Boolean> workerRole;

    /**
     * @return Machine pool worker role? (bool)
     * 
     */
    public Optional<Output<Boolean>> workerRole() {
        return Optional.ofNullable(this.workerRole);
    }

    private ClusterV2RkeConfigMachinePoolArgs() {}

    private ClusterV2RkeConfigMachinePoolArgs(ClusterV2RkeConfigMachinePoolArgs $) {
        this.annotations = $.annotations;
        this.cloudCredentialSecretName = $.cloudCredentialSecretName;
        this.controlPlaneRole = $.controlPlaneRole;
        this.drainBeforeDelete = $.drainBeforeDelete;
        this.etcdRole = $.etcdRole;
        this.hostnameLengthLimit = $.hostnameLengthLimit;
        this.labels = $.labels;
        this.machineConfig = $.machineConfig;
        this.machineLabels = $.machineLabels;
        this.maxUnhealthy = $.maxUnhealthy;
        this.name = $.name;
        this.nodeDrainTimeout = $.nodeDrainTimeout;
        this.nodeStartupTimeoutSeconds = $.nodeStartupTimeoutSeconds;
        this.paused = $.paused;
        this.quantity = $.quantity;
        this.rollingUpdate = $.rollingUpdate;
        this.taints = $.taints;
        this.unhealthyNodeTimeoutSeconds = $.unhealthyNodeTimeoutSeconds;
        this.unhealthyRange = $.unhealthyRange;
        this.workerRole = $.workerRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachinePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachinePoolArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachinePoolArgs();
        }

        public Builder(ClusterV2RkeConfigMachinePoolArgs defaults) {
            $ = new ClusterV2RkeConfigMachinePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for the Cluster V2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the Cluster V2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param cloudCredentialSecretName Cluster V2 cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(@Nullable Output<String> cloudCredentialSecretName) {
            $.cloudCredentialSecretName = cloudCredentialSecretName;
            return this;
        }

        /**
         * @param cloudCredentialSecretName Cluster V2 cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialSecretName(String cloudCredentialSecretName) {
            return cloudCredentialSecretName(Output.of(cloudCredentialSecretName));
        }

        /**
         * @param controlPlaneRole Machine pool control plane role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneRole(@Nullable Output<Boolean> controlPlaneRole) {
            $.controlPlaneRole = controlPlaneRole;
            return this;
        }

        /**
         * @param controlPlaneRole Machine pool control plane role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneRole(Boolean controlPlaneRole) {
            return controlPlaneRole(Output.of(controlPlaneRole));
        }

        /**
         * @param drainBeforeDelete Machine Pool Drain Before Delete? (bool)
         * 
         * @return builder
         * 
         */
        public Builder drainBeforeDelete(@Nullable Output<Boolean> drainBeforeDelete) {
            $.drainBeforeDelete = drainBeforeDelete;
            return this;
        }

        /**
         * @param drainBeforeDelete Machine Pool Drain Before Delete? (bool)
         * 
         * @return builder
         * 
         */
        public Builder drainBeforeDelete(Boolean drainBeforeDelete) {
            return drainBeforeDelete(Output.of(drainBeforeDelete));
        }

        /**
         * @param etcdRole Machine pool etcd role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder etcdRole(@Nullable Output<Boolean> etcdRole) {
            $.etcdRole = etcdRole;
            return this;
        }

        /**
         * @param etcdRole Machine pool etcd role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder etcdRole(Boolean etcdRole) {
            return etcdRole(Output.of(etcdRole));
        }

        /**
         * @param hostnameLengthLimit maximum length for autogenerated hostname
         * 
         * @return builder
         * 
         */
        public Builder hostnameLengthLimit(@Nullable Output<Integer> hostnameLengthLimit) {
            $.hostnameLengthLimit = hostnameLengthLimit;
            return this;
        }

        /**
         * @param hostnameLengthLimit maximum length for autogenerated hostname
         * 
         * @return builder
         * 
         */
        public Builder hostnameLengthLimit(Integer hostnameLengthLimit) {
            return hostnameLengthLimit(Output.of(hostnameLengthLimit));
        }

        /**
         * @param labels Labels for the Cluster V2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster V2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param machineConfig Machine pool node config (list)
         * 
         * @return builder
         * 
         */
        public Builder machineConfig(Output<ClusterV2RkeConfigMachinePoolMachineConfigArgs> machineConfig) {
            $.machineConfig = machineConfig;
            return this;
        }

        /**
         * @param machineConfig Machine pool node config (list)
         * 
         * @return builder
         * 
         */
        public Builder machineConfig(ClusterV2RkeConfigMachinePoolMachineConfigArgs machineConfig) {
            return machineConfig(Output.of(machineConfig));
        }

        /**
         * @param machineLabels Labels for Machine pool nodes (map)
         * 
         * @return builder
         * 
         */
        public Builder machineLabels(@Nullable Output<Map<String,Object>> machineLabels) {
            $.machineLabels = machineLabels;
            return this;
        }

        /**
         * @param machineLabels Labels for Machine pool nodes (map)
         * 
         * @return builder
         * 
         */
        public Builder machineLabels(Map<String,Object> machineLabels) {
            return machineLabels(Output.of(machineLabels));
        }

        /**
         * @param maxUnhealthy Max unhealthy nodes for automated replacement to be allowed (string)
         * 
         * @return builder
         * 
         */
        public Builder maxUnhealthy(@Nullable Output<String> maxUnhealthy) {
            $.maxUnhealthy = maxUnhealthy;
            return this;
        }

        /**
         * @param maxUnhealthy Max unhealthy nodes for automated replacement to be allowed (string)
         * 
         * @return builder
         * 
         */
        public Builder maxUnhealthy(String maxUnhealthy) {
            return maxUnhealthy(Output.of(maxUnhealthy));
        }

        /**
         * @param name The name of the Cluster v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeDrainTimeout Seconds a machine has to drain before deletion (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeDrainTimeout(@Nullable Output<Integer> nodeDrainTimeout) {
            $.nodeDrainTimeout = nodeDrainTimeout;
            return this;
        }

        /**
         * @param nodeDrainTimeout Seconds a machine has to drain before deletion (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeDrainTimeout(Integer nodeDrainTimeout) {
            return nodeDrainTimeout(Output.of(nodeDrainTimeout));
        }

        /**
         * @param nodeStartupTimeoutSeconds Seconds a new node has to become active before it is replaced (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeStartupTimeoutSeconds(@Nullable Output<Integer> nodeStartupTimeoutSeconds) {
            $.nodeStartupTimeoutSeconds = nodeStartupTimeoutSeconds;
            return this;
        }

        /**
         * @param nodeStartupTimeoutSeconds Seconds a new node has to become active before it is replaced (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeStartupTimeoutSeconds(Integer nodeStartupTimeoutSeconds) {
            return nodeStartupTimeoutSeconds(Output.of(nodeStartupTimeoutSeconds));
        }

        /**
         * @param paused Machine pool paused? (bool)
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Machine pool paused? (bool)
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param quantity Machine pool quantity (int)
         * 
         * @return builder
         * 
         */
        public Builder quantity(@Nullable Output<Integer> quantity) {
            $.quantity = quantity;
            return this;
        }

        /**
         * @param quantity Machine pool quantity (int)
         * 
         * @return builder
         * 
         */
        public Builder quantity(Integer quantity) {
            return quantity(Output.of(quantity));
        }

        /**
         * @param rollingUpdate Machine pool rolling update (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(@Nullable Output<ClusterV2RkeConfigMachinePoolRollingUpdateArgs> rollingUpdate) {
            $.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * @param rollingUpdate Machine pool rolling update (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(ClusterV2RkeConfigMachinePoolRollingUpdateArgs rollingUpdate) {
            return rollingUpdate(Output.of(rollingUpdate));
        }

        /**
         * @param taints Machine pool taints (list)
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<ClusterV2RkeConfigMachinePoolTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints Machine pool taints (list)
         * 
         * @return builder
         * 
         */
        public Builder taints(List<ClusterV2RkeConfigMachinePoolTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints Machine pool taints (list)
         * 
         * @return builder
         * 
         */
        public Builder taints(ClusterV2RkeConfigMachinePoolTaintArgs... taints) {
            return taints(List.of(taints));
        }

        /**
         * @param unhealthyNodeTimeoutSeconds Seconds an unhealthy node has to become active before it is replaced (int)
         * 
         * @return builder
         * 
         */
        public Builder unhealthyNodeTimeoutSeconds(@Nullable Output<Integer> unhealthyNodeTimeoutSeconds) {
            $.unhealthyNodeTimeoutSeconds = unhealthyNodeTimeoutSeconds;
            return this;
        }

        /**
         * @param unhealthyNodeTimeoutSeconds Seconds an unhealthy node has to become active before it is replaced (int)
         * 
         * @return builder
         * 
         */
        public Builder unhealthyNodeTimeoutSeconds(Integer unhealthyNodeTimeoutSeconds) {
            return unhealthyNodeTimeoutSeconds(Output.of(unhealthyNodeTimeoutSeconds));
        }

        /**
         * @param unhealthyRange Range of unhealthy nodes for automated replacement to be allowed (string)
         * 
         * @return builder
         * 
         */
        public Builder unhealthyRange(@Nullable Output<String> unhealthyRange) {
            $.unhealthyRange = unhealthyRange;
            return this;
        }

        /**
         * @param unhealthyRange Range of unhealthy nodes for automated replacement to be allowed (string)
         * 
         * @return builder
         * 
         */
        public Builder unhealthyRange(String unhealthyRange) {
            return unhealthyRange(Output.of(unhealthyRange));
        }

        /**
         * @param workerRole Machine pool worker role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder workerRole(@Nullable Output<Boolean> workerRole) {
            $.workerRole = workerRole;
            return this;
        }

        /**
         * @param workerRole Machine pool worker role? (bool)
         * 
         * @return builder
         * 
         */
        public Builder workerRole(Boolean workerRole) {
            return workerRole(Output.of(workerRole));
        }

        public ClusterV2RkeConfigMachinePoolArgs build() {
            if ($.machineConfig == null) {
                throw new MissingRequiredPropertyException("ClusterV2RkeConfigMachinePoolArgs", "machineConfig");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterV2RkeConfigMachinePoolArgs", "name");
            }
            return $;
        }
    }

}
