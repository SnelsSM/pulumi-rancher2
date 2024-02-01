// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterGkeConfigV2NodePoolManagement {
    /**
     * @return Enable GKE node pool config management auto repair
     * 
     */
    private Boolean autoRepair;
    /**
     * @return Enable GKE node pool config management auto upgrade
     * 
     */
    private Boolean autoUpgrade;

    private GetClusterGkeConfigV2NodePoolManagement() {}
    /**
     * @return Enable GKE node pool config management auto repair
     * 
     */
    public Boolean autoRepair() {
        return this.autoRepair;
    }
    /**
     * @return Enable GKE node pool config management auto upgrade
     * 
     */
    public Boolean autoUpgrade() {
        return this.autoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterGkeConfigV2NodePoolManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoRepair;
        private Boolean autoUpgrade;
        public Builder() {}
        public Builder(GetClusterGkeConfigV2NodePoolManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
        }

        @CustomType.Setter
        public Builder autoRepair(Boolean autoRepair) {
            if (autoRepair == null) {
              throw new MissingRequiredPropertyException("GetClusterGkeConfigV2NodePoolManagement", "autoRepair");
            }
            this.autoRepair = autoRepair;
            return this;
        }
        @CustomType.Setter
        public Builder autoUpgrade(Boolean autoUpgrade) {
            if (autoUpgrade == null) {
              throw new MissingRequiredPropertyException("GetClusterGkeConfigV2NodePoolManagement", "autoUpgrade");
            }
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public GetClusterGkeConfigV2NodePoolManagement build() {
            final var _resultValue = new GetClusterGkeConfigV2NodePoolManagement();
            _resultValue.autoRepair = autoRepair;
            _resultValue.autoUpgrade = autoUpgrade;
            return _resultValue;
        }
    }
}
