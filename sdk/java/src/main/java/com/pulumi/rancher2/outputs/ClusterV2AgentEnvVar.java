// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterV2AgentEnvVar {
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;
    /**
     * @return Rancher agent env var value (string)
     * 
     */
    private String value;

    private ClusterV2AgentEnvVar() {}
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Rancher agent env var value (string)
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2AgentEnvVar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(ClusterV2AgentEnvVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterV2AgentEnvVar build() {
            final var o = new ClusterV2AgentEnvVar();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
