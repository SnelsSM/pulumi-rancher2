// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretResult {
    /**
     * @return (Computed) Annotations for secret object (map)
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return (Computed) Secret key/value data. Base64 encoding required for values (map)
     * 
     */
    private Map<String,String> data;
    /**
     * @return (Computed) A secret description (string)
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels for secret object (map)
     * 
     */
    private Map<String,String> labels;
    private String name;
    private @Nullable String namespaceId;
    private String projectId;

    private GetSecretResult() {}
    /**
     * @return (Computed) Annotations for secret object (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Secret key/value data. Base64 encoding required for values (map)
     * 
     */
    public Map<String,String> data() {
        return this.data;
    }
    /**
     * @return (Computed) A secret description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for secret object (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private Map<String,String> data;
        private String description;
        private String id;
        private Map<String,String> labels;
        private String name;
        private @Nullable String namespaceId;
        private String projectId;
        public Builder() {}
        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.data = defaults.data;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder data(Map<String,String> data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(@Nullable String namespaceId) {

            this.namespaceId = namespaceId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetSecretResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetSecretResult build() {
            final var _resultValue = new GetSecretResult();
            _resultValue.annotations = annotations;
            _resultValue.data = data;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.namespaceId = namespaceId;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
