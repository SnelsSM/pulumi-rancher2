// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateSupplementalGroupRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPodSecurityPolicyTemplateSupplementalGroup {
    /**
     * @return ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    private List<GetPodSecurityPolicyTemplateSupplementalGroupRange> ranges;
    /**
     * @return rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * 
     */
    private @Nullable String rule;

    private GetPodSecurityPolicyTemplateSupplementalGroup() {}
    /**
     * @return ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public List<GetPodSecurityPolicyTemplateSupplementalGroupRange> ranges() {
        return this.ranges;
    }
    /**
     * @return rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * 
     */
    public Optional<String> rule() {
        return Optional.ofNullable(this.rule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateSupplementalGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPodSecurityPolicyTemplateSupplementalGroupRange> ranges;
        private @Nullable String rule;
        public Builder() {}
        public Builder(GetPodSecurityPolicyTemplateSupplementalGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        @CustomType.Setter
        public Builder ranges(List<GetPodSecurityPolicyTemplateSupplementalGroupRange> ranges) {
            if (ranges == null) {
              throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateSupplementalGroup", "ranges");
            }
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(GetPodSecurityPolicyTemplateSupplementalGroupRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder rule(@Nullable String rule) {

            this.rule = rule;
            return this;
        }
        public GetPodSecurityPolicyTemplateSupplementalGroup build() {
            final var _resultValue = new GetPodSecurityPolicyTemplateSupplementalGroup();
            _resultValue.ranges = ranges;
            _resultValue.rule = rule;
            return _resultValue;
        }
    }
}
