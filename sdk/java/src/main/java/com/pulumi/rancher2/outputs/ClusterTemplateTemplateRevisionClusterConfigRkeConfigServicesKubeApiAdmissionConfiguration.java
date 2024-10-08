// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration {
    /**
     * @return Admission configuration ApiVersion
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Admission configuration Kind
     * 
     */
    private @Nullable String kind;
    /**
     * @return Admission configuration plugins
     * 
     */
    private @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration() {}
    /**
     * @return Admission configuration ApiVersion
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Admission configuration Kind
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Admission configuration plugins
     * 
     */
    public List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins() {
        return this.plugins == null ? List.of() : this.plugins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.plugins = defaults.plugins;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder plugins(@Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins) {

            this.plugins = plugins;
            return this;
        }
        public Builder plugins(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin... plugins) {
            return plugins(List.of(plugins));
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfiguration();
            _resultValue.apiVersion = apiVersion;
            _resultValue.kind = kind;
            _resultValue.plugins = plugins;
            return _resultValue;
        }
    }
}
