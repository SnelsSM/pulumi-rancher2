// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorFileFileSource;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigMachineSelectorFile {
    /**
     * @return File sources represents the source of the files. Multiple files can be delivered to nodes that match the provided label selector.
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachineSelectorFileFileSource> fileSources;
    /**
     * @return Machine selector label is a label query over a set of resources. The result of match_labels and match_expressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    private @Nullable ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector machineLabelSelector;

    private ClusterV2RkeConfigMachineSelectorFile() {}
    /**
     * @return File sources represents the source of the files. Multiple files can be delivered to nodes that match the provided label selector.
     * 
     */
    public List<ClusterV2RkeConfigMachineSelectorFileFileSource> fileSources() {
        return this.fileSources == null ? List.of() : this.fileSources;
    }
    /**
     * @return Machine selector label is a label query over a set of resources. The result of match_labels and match_expressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public Optional<ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector> machineLabelSelector() {
        return Optional.ofNullable(this.machineLabelSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachineSelectorFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClusterV2RkeConfigMachineSelectorFileFileSource> fileSources;
        private @Nullable ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector machineLabelSelector;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachineSelectorFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSources = defaults.fileSources;
    	      this.machineLabelSelector = defaults.machineLabelSelector;
        }

        @CustomType.Setter
        public Builder fileSources(@Nullable List<ClusterV2RkeConfigMachineSelectorFileFileSource> fileSources) {

            this.fileSources = fileSources;
            return this;
        }
        public Builder fileSources(ClusterV2RkeConfigMachineSelectorFileFileSource... fileSources) {
            return fileSources(List.of(fileSources));
        }
        @CustomType.Setter
        public Builder machineLabelSelector(@Nullable ClusterV2RkeConfigMachineSelectorFileMachineLabelSelector machineLabelSelector) {

            this.machineLabelSelector = machineLabelSelector;
            return this;
        }
        public ClusterV2RkeConfigMachineSelectorFile build() {
            final var _resultValue = new ClusterV2RkeConfigMachineSelectorFile();
            _resultValue.fileSources = fileSources;
            _resultValue.machineLabelSelector = machineLabelSelector;
            return _resultValue;
        }
    }
}
