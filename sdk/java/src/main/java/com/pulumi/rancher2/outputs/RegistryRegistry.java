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
public final class RegistryRegistry {
    /**
     * @return Address for registry.
     * 
     */
    private String address;
    /**
     * @return Password for the registry (string)
     * 
     */
    private @Nullable String password;
    /**
     * @return Username for the registry (string)
     * 
     */
    private @Nullable String username;

    private RegistryRegistry() {}
    /**
     * @return Address for registry.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Password for the registry (string)
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Username for the registry (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryRegistry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String password;
        private @Nullable String username;
        public Builder() {}
        public Builder(RegistryRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("RegistryRegistry", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public RegistryRegistry build() {
            final var _resultValue = new RegistryRegistry();
            _resultValue.address = address;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
