// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectLoggingKafkaConfig {
    /**
     * @return Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
     * 
     */
    private @Nullable List<String> brokerEndpoints;
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
     * @return Topic to publish on the kafka service (string)
     * 
     */
    private String topic;
    /**
     * @return Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
     * 
     */
    private @Nullable String zookeeperEndpoint;

    private ProjectLoggingKafkaConfig() {}
    /**
     * @return Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
     * 
     */
    public List<String> brokerEndpoints() {
        return this.brokerEndpoints == null ? List.of() : this.brokerEndpoints;
    }
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
     * @return Topic to publish on the kafka service (string)
     * 
     */
    public String topic() {
        return this.topic;
    }
    /**
     * @return Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
     * 
     */
    public Optional<String> zookeeperEndpoint() {
        return Optional.ofNullable(this.zookeeperEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLoggingKafkaConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> brokerEndpoints;
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private String topic;
        private @Nullable String zookeeperEndpoint;
        public Builder() {}
        public Builder(ProjectLoggingKafkaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerEndpoints = defaults.brokerEndpoints;
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.topic = defaults.topic;
    	      this.zookeeperEndpoint = defaults.zookeeperEndpoint;
        }

        @CustomType.Setter
        public Builder brokerEndpoints(@Nullable List<String> brokerEndpoints) {
            this.brokerEndpoints = brokerEndpoints;
            return this;
        }
        public Builder brokerEndpoints(String... brokerEndpoints) {
            return brokerEndpoints(List.of(brokerEndpoints));
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
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        @CustomType.Setter
        public Builder zookeeperEndpoint(@Nullable String zookeeperEndpoint) {
            this.zookeeperEndpoint = zookeeperEndpoint;
            return this;
        }
        public ProjectLoggingKafkaConfig build() {
            final var o = new ProjectLoggingKafkaConfig();
            o.brokerEndpoints = brokerEndpoints;
            o.certificate = certificate;
            o.clientCert = clientCert;
            o.clientKey = clientKey;
            o.topic = topic;
            o.zookeeperEndpoint = zookeeperEndpoint;
            return o;
        }
    }
}
