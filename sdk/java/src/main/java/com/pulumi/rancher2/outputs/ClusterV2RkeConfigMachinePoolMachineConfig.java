// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterV2RkeConfigMachinePoolMachineConfig {
    /**
     * @return Machine config kind (string)
     * 
     */
    private String kind;
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;

    private ClusterV2RkeConfigMachinePoolMachineConfig() {}
    /**
     * @return Machine config kind (string)
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachinePoolMachineConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private String name;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachinePoolMachineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ClusterV2RkeConfigMachinePoolMachineConfig build() {
            final var o = new ClusterV2RkeConfigMachinePoolMachineConfig();
            o.kind = kind;
            o.name = name;
            return o;
        }
    }
}
