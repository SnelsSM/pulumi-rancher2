// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretV2Result {
    /**
     * @return (Computed) Annotations for the secret v2 (map)
     * 
     */
    private Map<String,String> annotations;
    private String clusterId;
    /**
     * @return (Computed/Sensitive) The data of the secret v2 (map)
     * 
     */
    private Map<String,String> data;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     * 
     */
    private Boolean immutable;
    /**
     * @return (Computed) Labels for the secret v2 (map)
     * 
     */
    private Map<String,String> labels;
    private String name;
    private @Nullable String namespace;
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    private String resourceVersion;
    /**
     * @return (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
     * 
     */
    private String type;

    private GetSecretV2Result() {}
    /**
     * @return (Computed) Annotations for the secret v2 (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed/Sensitive) The data of the secret v2 (map)
     * 
     */
    public Map<String,String> data() {
        return this.data;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
     * 
     */
    public Boolean immutable() {
        return this.immutable;
    }
    /**
     * @return (Computed) Labels for the secret v2 (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    public String resourceVersion() {
        return this.resourceVersion;
    }
    /**
     * @return (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretV2Result defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private String clusterId;
        private Map<String,String> data;
        private String id;
        private Boolean immutable;
        private Map<String,String> labels;
        private String name;
        private @Nullable String namespace;
        private String resourceVersion;
        private String type;
        public Builder() {}
        public Builder(GetSecretV2Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.immutable = defaults.immutable;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder data(Map<String,String> data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder immutable(Boolean immutable) {
            if (immutable == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "immutable");
            }
            this.immutable = immutable;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(String resourceVersion) {
            if (resourceVersion == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "resourceVersion");
            }
            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSecretV2Result", "type");
            }
            this.type = type;
            return this;
        }
        public GetSecretV2Result build() {
            final var _resultValue = new GetSecretV2Result();
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.data = data;
            _resultValue.id = id;
            _resultValue.immutable = immutable;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.resourceVersion = resourceVersion;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
