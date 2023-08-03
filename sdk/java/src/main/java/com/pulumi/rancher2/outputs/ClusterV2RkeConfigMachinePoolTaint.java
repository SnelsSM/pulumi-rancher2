// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigMachinePoolTaint {
    /**
     * @return The toleration effect. Default: `\&#34;NoSchedule\&#34;` (string)
     * 
     */
    private @Nullable String effect;
    /**
     * @return The toleration key (string)
     * 
     */
    private String key;
    /**
     * @return Rancher agent env var value (string)
     * 
     */
    private String value;

    private ClusterV2RkeConfigMachinePoolTaint() {}
    /**
     * @return The toleration effect. Default: `\&#34;NoSchedule\&#34;` (string)
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return The toleration key (string)
     * 
     */
    public String key() {
        return this.key;
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

    public static Builder builder(ClusterV2RkeConfigMachinePoolTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachinePoolTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterV2RkeConfigMachinePoolTaint build() {
            final var o = new ClusterV2RkeConfigMachinePoolTaint();
            o.effect = effect;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
