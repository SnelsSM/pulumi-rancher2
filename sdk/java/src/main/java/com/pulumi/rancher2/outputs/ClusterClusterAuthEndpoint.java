// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterAuthEndpoint {
    /**
     * @return CA certs for the authorized cluster endpoint (string)
     * 
     */
    private @Nullable String caCerts;
    /**
     * @return Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return FQDN for the authorized cluster endpoint (string)
     * 
     */
    private @Nullable String fqdn;

    private ClusterClusterAuthEndpoint() {}
    /**
     * @return CA certs for the authorized cluster endpoint (string)
     * 
     */
    public Optional<String> caCerts() {
        return Optional.ofNullable(this.caCerts);
    }
    /**
     * @return Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return FQDN for the authorized cluster endpoint (string)
     * 
     */
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAuthEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caCerts;
        private @Nullable Boolean enabled;
        private @Nullable String fqdn;
        public Builder() {}
        public Builder(ClusterClusterAuthEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCerts = defaults.caCerts;
    	      this.enabled = defaults.enabled;
    	      this.fqdn = defaults.fqdn;
        }

        @CustomType.Setter
        public Builder caCerts(@Nullable String caCerts) {
            this.caCerts = caCerts;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public ClusterClusterAuthEndpoint build() {
            final var o = new ClusterClusterAuthEndpoint();
            o.caCerts = caCerts;
            o.enabled = enabled;
            o.fqdn = fqdn;
            return o;
        }
    }
}
