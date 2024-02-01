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
public final class GetClusterAlterRuleEventRule {
    /**
     * @return Event type
     * 
     */
    private @Nullable String eventType;
    /**
     * @return Resource kind
     * 
     */
    private String resourceKind;

    private GetClusterAlterRuleEventRule() {}
    /**
     * @return Event type
     * 
     */
    public Optional<String> eventType() {
        return Optional.ofNullable(this.eventType);
    }
    /**
     * @return Resource kind
     * 
     */
    public String resourceKind() {
        return this.resourceKind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAlterRuleEventRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eventType;
        private String resourceKind;
        public Builder() {}
        public Builder(GetClusterAlterRuleEventRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.resourceKind = defaults.resourceKind;
        }

        @CustomType.Setter
        public Builder eventType(@Nullable String eventType) {

            this.eventType = eventType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceKind(String resourceKind) {
            if (resourceKind == null) {
              throw new MissingRequiredPropertyException("GetClusterAlterRuleEventRule", "resourceKind");
            }
            this.resourceKind = resourceKind;
            return this;
        }
        public GetClusterAlterRuleEventRule build() {
            final var _resultValue = new GetClusterAlterRuleEventRule();
            _resultValue.eventType = eventType;
            _resultValue.resourceKind = resourceKind;
            return _resultValue;
        }
    }
}
