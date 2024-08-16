// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretV2State extends com.pulumi.resources.ResourceArgs {

    public static final SecretV2State Empty = new SecretV2State();

    /**
     * Annotations for the secret v2 (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the secret v2 (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The cluster id of the secret V2 (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The cluster id of the secret V2 (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The data of the secret v2 (map)
     * 
     */
    @Import(name="data")
    private @Nullable Output<Map<String,String>> data;

    /**
     * @return The data of the secret v2 (map)
     * 
     */
    public Optional<Output<Map<String,String>>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     * 
     */
    @Import(name="immutable")
    private @Nullable Output<Boolean> immutable;

    /**
     * @return If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> immutable() {
        return Optional.ofNullable(this.immutable);
    }

    /**
     * Labels for the secret v2 (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for the secret v2 (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the secret v2 (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the secret v2 (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespaces of the secret v2. Default: `default` (string)
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespaces of the secret v2. Default: `default` (string)
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * (Computed) The k8s resource version (string)
     * 
     */
    @Import(name="resourceVersion")
    private @Nullable Output<String> resourceVersion;

    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    public Optional<Output<String>> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }

    /**
     * The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SecretV2State() {}

    private SecretV2State(SecretV2State $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.data = $.data;
        this.immutable = $.immutable;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.resourceVersion = $.resourceVersion;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretV2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretV2State $;

        public Builder() {
            $ = new SecretV2State();
        }

        public Builder(SecretV2State defaults) {
            $ = new SecretV2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId The cluster id of the secret V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id of the secret V2 (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param data The data of the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<Map<String,String>> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The data of the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder data(Map<String,String> data) {
            return data(Output.of(data));
        }

        /**
         * @param immutable If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder immutable(@Nullable Output<Boolean> immutable) {
            $.immutable = immutable;
            return this;
        }

        /**
         * @param immutable If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder immutable(Boolean immutable) {
            return immutable(Output.of(immutable));
        }

        /**
         * @param labels Labels for the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the secret v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the secret v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the secret v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespaces of the secret v2. Default: `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespaces of the secret v2. Default: `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param resourceVersion (Computed) The k8s resource version (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * @param resourceVersion (Computed) The k8s resource version (string)
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(String resourceVersion) {
            return resourceVersion(Output.of(resourceVersion));
        }

        /**
         * @param type The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SecretV2State build() {
            return $;
        }
    }

}
