// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectAlertRuleWorkloadRule {
    /**
     * @return Workload rule available percentage
     * 
     */
    private @Nullable Integer availablePercentage;
    /**
     * @return Workload rule selector
     * 
     */
    private @Nullable Map<String,Object> selector;
    /**
     * @return Workload ID
     * 
     */
    private @Nullable String workloadId;

    private GetProjectAlertRuleWorkloadRule() {}
    /**
     * @return Workload rule available percentage
     * 
     */
    public Optional<Integer> availablePercentage() {
        return Optional.ofNullable(this.availablePercentage);
    }
    /**
     * @return Workload rule selector
     * 
     */
    public Map<String,Object> selector() {
        return this.selector == null ? Map.of() : this.selector;
    }
    /**
     * @return Workload ID
     * 
     */
    public Optional<String> workloadId() {
        return Optional.ofNullable(this.workloadId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectAlertRuleWorkloadRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer availablePercentage;
        private @Nullable Map<String,Object> selector;
        private @Nullable String workloadId;
        public Builder() {}
        public Builder(GetProjectAlertRuleWorkloadRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availablePercentage = defaults.availablePercentage;
    	      this.selector = defaults.selector;
    	      this.workloadId = defaults.workloadId;
        }

        @CustomType.Setter
        public Builder availablePercentage(@Nullable Integer availablePercentage) {

            this.availablePercentage = availablePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable Map<String,Object> selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder workloadId(@Nullable String workloadId) {

            this.workloadId = workloadId;
            return this;
        }
        public GetProjectAlertRuleWorkloadRule build() {
            final var _resultValue = new GetProjectAlertRuleWorkloadRule();
            _resultValue.availablePercentage = availablePercentage;
            _resultValue.selector = selector;
            _resultValue.workloadId = workloadId;
            return _resultValue;
        }
    }
}
