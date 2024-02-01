// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateMember {
    /**
     * @return Member access type: member, owner, read-only
     * 
     */
    private @Nullable String accessType;
    /**
     * @return Member group principal id
     * 
     */
    private @Nullable String groupPrincipalId;
    /**
     * @return Member user principal id
     * 
     */
    private @Nullable String userPrincipalId;

    private GetClusterTemplateMember() {}
    /**
     * @return Member access type: member, owner, read-only
     * 
     */
    public Optional<String> accessType() {
        return Optional.ofNullable(this.accessType);
    }
    /**
     * @return Member group principal id
     * 
     */
    public Optional<String> groupPrincipalId() {
        return Optional.ofNullable(this.groupPrincipalId);
    }
    /**
     * @return Member user principal id
     * 
     */
    public Optional<String> userPrincipalId() {
        return Optional.ofNullable(this.userPrincipalId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessType;
        private @Nullable String groupPrincipalId;
        private @Nullable String userPrincipalId;
        public Builder() {}
        public Builder(GetClusterTemplateMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.groupPrincipalId = defaults.groupPrincipalId;
    	      this.userPrincipalId = defaults.userPrincipalId;
        }

        @CustomType.Setter
        public Builder accessType(@Nullable String accessType) {

            this.accessType = accessType;
            return this;
        }
        @CustomType.Setter
        public Builder groupPrincipalId(@Nullable String groupPrincipalId) {

            this.groupPrincipalId = groupPrincipalId;
            return this;
        }
        @CustomType.Setter
        public Builder userPrincipalId(@Nullable String userPrincipalId) {

            this.userPrincipalId = userPrincipalId;
            return this;
        }
        public GetClusterTemplateMember build() {
            final var _resultValue = new GetClusterTemplateMember();
            _resultValue.accessType = accessType;
            _resultValue.groupPrincipalId = groupPrincipalId;
            _resultValue.userPrincipalId = userPrincipalId;
            return _resultValue;
        }
    }
}
