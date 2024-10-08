// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock {
    /**
     * @return The GKE master authorized network config cidr block
     * 
     */
    private String cidrBlock;
    /**
     * @return The GKE master authorized network config cidr block dispaly name
     * 
     */
    private @Nullable String displayName;

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock() {}
    /**
     * @return The GKE master authorized network config cidr block
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return The GKE master authorized network config cidr block dispaly name
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrBlock;
        private @Nullable String displayName;
        public Builder() {}
        public Builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            if (cidrBlock == null) {
              throw new MissingRequiredPropertyException("ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock", "cidrBlock");
            }
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        public ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock build() {
            final var _resultValue = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock();
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.displayName = displayName;
            return _resultValue;
        }
    }
}
