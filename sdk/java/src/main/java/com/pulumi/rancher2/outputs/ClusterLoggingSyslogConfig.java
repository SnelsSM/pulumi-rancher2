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
public final class ClusterLoggingSyslogConfig {
    /**
     * @return SSL CA certificate for the custom target service (string)
     * 
     */
    private @Nullable String certificate;
    /**
     * @return SSL client certificate for the custom target service (string)
     * 
     */
    private @Nullable String clientCert;
    /**
     * @return SSL client key for the custom target service (string)
     * 
     */
    private @Nullable String clientKey;
    /**
     * @return Enable TLS for the fluentd service (bool)
     * 
     */
    private @Nullable Boolean enableTls;
    /**
     * @return Endpoint of the elascticsearch service. Must include protocol, `http://` or `https://` (string)
     * 
     */
    private String endpoint;
    /**
     * @return Program for the syslog service (string)
     * 
     */
    private @Nullable String program;
    /**
     * @return Protocol for the syslog service. `tcp` and `udp` are supported. Default: `udp` (string)
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Date format for the syslog logs. `emergency`, `alert`, `critical`, `error`, `warning`, `notice`, `info` and `debug` are supported. Default: `notice` (string)
     * 
     */
    private @Nullable String severity;
    /**
     * @return SSL verify for the elascticsearch service (bool)
     * 
     */
    private @Nullable Boolean sslVerify;
    /**
     * @return Token for the splunk service (string)
     * 
     */
    private @Nullable String token;

    private ClusterLoggingSyslogConfig() {}
    /**
     * @return SSL CA certificate for the custom target service (string)
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return SSL client certificate for the custom target service (string)
     * 
     */
    public Optional<String> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }
    /**
     * @return SSL client key for the custom target service (string)
     * 
     */
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * @return Enable TLS for the fluentd service (bool)
     * 
     */
    public Optional<Boolean> enableTls() {
        return Optional.ofNullable(this.enableTls);
    }
    /**
     * @return Endpoint of the elascticsearch service. Must include protocol, `http://` or `https://` (string)
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Program for the syslog service (string)
     * 
     */
    public Optional<String> program() {
        return Optional.ofNullable(this.program);
    }
    /**
     * @return Protocol for the syslog service. `tcp` and `udp` are supported. Default: `udp` (string)
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Date format for the syslog logs. `emergency`, `alert`, `critical`, `error`, `warning`, `notice`, `info` and `debug` are supported. Default: `notice` (string)
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return SSL verify for the elascticsearch service (bool)
     * 
     */
    public Optional<Boolean> sslVerify() {
        return Optional.ofNullable(this.sslVerify);
    }
    /**
     * @return Token for the splunk service (string)
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingSyslogConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private @Nullable Boolean enableTls;
        private String endpoint;
        private @Nullable String program;
        private @Nullable String protocol;
        private @Nullable String severity;
        private @Nullable Boolean sslVerify;
        private @Nullable String token;
        public Builder() {}
        public Builder(ClusterLoggingSyslogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.enableTls = defaults.enableTls;
    	      this.endpoint = defaults.endpoint;
    	      this.program = defaults.program;
    	      this.protocol = defaults.protocol;
    	      this.severity = defaults.severity;
    	      this.sslVerify = defaults.sslVerify;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientCert(@Nullable String clientCert) {
            this.clientCert = clientCert;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder enableTls(@Nullable Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder program(@Nullable String program) {
            this.program = program;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder severity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }
        @CustomType.Setter
        public Builder sslVerify(@Nullable Boolean sslVerify) {
            this.sslVerify = sslVerify;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        public ClusterLoggingSyslogConfig build() {
            final var o = new ClusterLoggingSyslogConfig();
            o.certificate = certificate;
            o.clientCert = clientCert;
            o.clientKey = clientKey;
            o.enableTls = enableTls;
            o.endpoint = endpoint;
            o.program = program;
            o.protocol = protocol;
            o.severity = severity;
            o.sslVerify = sslVerify;
            o.token = token;
            return o;
        }
    }
}
