// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterMonitoringInput {
    /**
     * @return Key/value answers for monitor input (map)
     * 
     */
    private @Nullable Map<String,Object> answers;
    /**
     * @return RKE2 kubernetes version (string)
     * 
     */
    private @Nullable String version;

    private ClusterClusterMonitoringInput() {}
    /**
     * @return Key/value answers for monitor input (map)
     * 
     */
    public Map<String,Object> answers() {
        return this.answers == null ? Map.of() : this.answers;
    }
    /**
     * @return RKE2 kubernetes version (string)
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterMonitoringInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> answers;
        private @Nullable String version;
        public Builder() {}
        public Builder(ClusterClusterMonitoringInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answers = defaults.answers;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder answers(@Nullable Map<String,Object> answers) {
            this.answers = answers;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ClusterClusterMonitoringInput build() {
            final var o = new ClusterClusterMonitoringInput();
            o.answers = answers;
            o.version = version;
            return o;
        }
    }
}
