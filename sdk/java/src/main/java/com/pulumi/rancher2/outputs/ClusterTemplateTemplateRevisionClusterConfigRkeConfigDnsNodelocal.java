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
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal {
    private @Nullable String ipAddress;
    /**
     * @return Node selector key pair
     * 
     */
    private @Nullable Map<String,Object> nodeSelector;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal() {}
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return Node selector key pair
     * 
     */
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable Map<String,Object> nodeSelector;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.nodeSelector = defaults.nodeSelector;
        }

        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocal();
            _resultValue.ipAddress = ipAddress;
            _resultValue.nodeSelector = nodeSelector;
            return _resultValue;
        }
    }
}
