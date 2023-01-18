// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectLoggingKafkaConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLoggingKafkaConfigArgs Empty = new ProjectLoggingKafkaConfigArgs();

    /**
     * Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
     * 
     */
    @Import(name="brokerEndpoints")
    private @Nullable Output<List<String>> brokerEndpoints;

    /**
     * @return Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
     * 
     */
    public Optional<Output<List<String>>> brokerEndpoints() {
        return Optional.ofNullable(this.brokerEndpoints);
    }

    /**
     * SSL CA certificate for the custom target service (string)
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return SSL CA certificate for the custom target service (string)
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * SSL client certificate for the custom target service (string)
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return SSL client certificate for the custom target service (string)
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * SSL client key for the custom target service (string)
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return SSL client key for the custom target service (string)
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * Topic to publish on the kafka service (string)
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return Topic to publish on the kafka service (string)
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     * Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
     * 
     */
    @Import(name="zookeeperEndpoint")
    private @Nullable Output<String> zookeeperEndpoint;

    /**
     * @return Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
     * 
     */
    public Optional<Output<String>> zookeeperEndpoint() {
        return Optional.ofNullable(this.zookeeperEndpoint);
    }

    private ProjectLoggingKafkaConfigArgs() {}

    private ProjectLoggingKafkaConfigArgs(ProjectLoggingKafkaConfigArgs $) {
        this.brokerEndpoints = $.brokerEndpoints;
        this.certificate = $.certificate;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.topic = $.topic;
        this.zookeeperEndpoint = $.zookeeperEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectLoggingKafkaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectLoggingKafkaConfigArgs $;

        public Builder() {
            $ = new ProjectLoggingKafkaConfigArgs();
        }

        public Builder(ProjectLoggingKafkaConfigArgs defaults) {
            $ = new ProjectLoggingKafkaConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brokerEndpoints Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
         * 
         * @return builder
         * 
         */
        public Builder brokerEndpoints(@Nullable Output<List<String>> brokerEndpoints) {
            $.brokerEndpoints = brokerEndpoints;
            return this;
        }

        /**
         * @param brokerEndpoints Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
         * 
         * @return builder
         * 
         */
        public Builder brokerEndpoints(List<String> brokerEndpoints) {
            return brokerEndpoints(Output.of(brokerEndpoints));
        }

        /**
         * @param brokerEndpoints Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
         * 
         * @return builder
         * 
         */
        public Builder brokerEndpoints(String... brokerEndpoints) {
            return brokerEndpoints(List.of(brokerEndpoints));
        }

        /**
         * @param certificate SSL CA certificate for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate SSL CA certificate for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param clientCert SSL client certificate for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert SSL client certificate for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey SSL client key for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey SSL client key for the custom target service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param topic Topic to publish on the kafka service (string)
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic Topic to publish on the kafka service (string)
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        /**
         * @param zookeeperEndpoint Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
         * 
         * @return builder
         * 
         */
        public Builder zookeeperEndpoint(@Nullable Output<String> zookeeperEndpoint) {
            $.zookeeperEndpoint = zookeeperEndpoint;
            return this;
        }

        /**
         * @param zookeeperEndpoint Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
         * 
         * @return builder
         * 
         */
        public Builder zookeeperEndpoint(String zookeeperEndpoint) {
            return zookeeperEndpoint(Output.of(zookeeperEndpoint));
        }

        public ProjectLoggingKafkaConfigArgs build() {
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
