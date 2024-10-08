// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterAksConfigV2NodePool {
    /**
     * @return The AKS node pool availability zones
     * 
     */
    private @Nullable List<String> availabilityZones;
    /**
     * @return The AKS node pool count
     * 
     */
    private @Nullable Integer count;
    /**
     * @return Is AKS node pool auto scaling enabled?
     * 
     */
    private @Nullable Boolean enableAutoScaling;
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The AKS node pool max count
     * 
     */
    private @Nullable Integer maxCount;
    /**
     * @return The AKS node pool max pods
     * 
     */
    private @Nullable Integer maxPods;
    /**
     * @return The AKS node pool max surge
     * 
     */
    private @Nullable String maxSurge;
    /**
     * @return The AKS node pool min count
     * 
     */
    private @Nullable Integer minCount;
    /**
     * @return The AKS node pool mode
     * 
     */
    private @Nullable String mode;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private String name;
    /**
     * @return The AKS node pool orchestrator version
     * 
     */
    private @Nullable String orchestratorVersion;
    /**
     * @return The AKS node pool os disk size gb
     * 
     */
    private @Nullable Integer osDiskSizeGb;
    /**
     * @return The AKS node pool os disk type
     * 
     */
    private @Nullable String osDiskType;
    /**
     * @return Enable AKS node pool os type
     * 
     */
    private @Nullable String osType;
    /**
     * @return The AKS node pool taints
     * 
     */
    private List<String> taints;
    /**
     * @return The AKS node pool vm size
     * 
     */
    private String vmSize;

    private GetClusterAksConfigV2NodePool() {}
    /**
     * @return The AKS node pool availability zones
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * @return The AKS node pool count
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Is AKS node pool auto scaling enabled?
     * 
     */
    public Optional<Boolean> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The AKS node pool max count
     * 
     */
    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * @return The AKS node pool max pods
     * 
     */
    public Optional<Integer> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * @return The AKS node pool max surge
     * 
     */
    public Optional<String> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return The AKS node pool min count
     * 
     */
    public Optional<Integer> minCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * @return The AKS node pool mode
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The AKS node pool orchestrator version
     * 
     */
    public Optional<String> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * @return The AKS node pool os disk size gb
     * 
     */
    public Optional<Integer> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }
    /**
     * @return The AKS node pool os disk type
     * 
     */
    public Optional<String> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * @return Enable AKS node pool os type
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return The AKS node pool taints
     * 
     */
    public List<String> taints() {
        return this.taints;
    }
    /**
     * @return The AKS node pool vm size
     * 
     */
    public String vmSize() {
        return this.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAksConfigV2NodePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private Map<String,String> labels;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable String maxSurge;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGb;
        private @Nullable String osDiskType;
        private @Nullable String osType;
        private List<String> taints;
        private String vmSize;
        public Builder() {}
        public Builder(GetClusterAksConfigV2NodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.labels = defaults.labels;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.maxSurge = defaults.maxSurge;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGb = defaults.osDiskSizeGb;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osType = defaults.osType;
    	      this.taints = defaults.taints;
    	      this.vmSize = defaults.vmSize;
        }

        @CustomType.Setter
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {

            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {

            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2NodePool", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxCount(@Nullable Integer maxCount) {

            this.maxCount = maxCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxPods(@Nullable Integer maxPods) {

            this.maxPods = maxPods;
            return this;
        }
        @CustomType.Setter
        public Builder maxSurge(@Nullable String maxSurge) {

            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder minCount(@Nullable Integer minCount) {

            this.minCount = minCount;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2NodePool", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {

            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder osDiskSizeGb(@Nullable Integer osDiskSizeGb) {

            this.osDiskSizeGb = osDiskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder osDiskType(@Nullable String osDiskType) {

            this.osDiskType = osDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder osType(@Nullable String osType) {

            this.osType = osType;
            return this;
        }
        @CustomType.Setter
        public Builder taints(List<String> taints) {
            if (taints == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2NodePool", "taints");
            }
            this.taints = taints;
            return this;
        }
        public Builder taints(String... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder vmSize(String vmSize) {
            if (vmSize == null) {
              throw new MissingRequiredPropertyException("GetClusterAksConfigV2NodePool", "vmSize");
            }
            this.vmSize = vmSize;
            return this;
        }
        public GetClusterAksConfigV2NodePool build() {
            final var _resultValue = new GetClusterAksConfigV2NodePool();
            _resultValue.availabilityZones = availabilityZones;
            _resultValue.count = count;
            _resultValue.enableAutoScaling = enableAutoScaling;
            _resultValue.labels = labels;
            _resultValue.maxCount = maxCount;
            _resultValue.maxPods = maxPods;
            _resultValue.maxSurge = maxSurge;
            _resultValue.minCount = minCount;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.orchestratorVersion = orchestratorVersion;
            _resultValue.osDiskSizeGb = osDiskSizeGb;
            _resultValue.osDiskType = osDiskType;
            _resultValue.osType = osType;
            _resultValue.taints = taints;
            _resultValue.vmSize = vmSize;
            return _resultValue;
        }
    }
}
