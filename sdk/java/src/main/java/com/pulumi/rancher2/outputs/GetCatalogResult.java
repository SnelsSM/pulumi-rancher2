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
public final class GetCatalogResult {
    /**
     * @return (Computed) Annotations for the catalog (map)
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return (Computed) The branch of the catalog repo to use (string)
     * 
     */
    private String branch;
    /**
     * @return (Computed) The cluster id of the catalog (string)
     * 
     */
    private String clusterId;
    /**
     * @return (Computed) A catalog description (string)
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) The kind of the catalog. Just helm by the moment (string)
     * 
     */
    private String kind;
    /**
     * @return (Computed) Labels for the catalog (map)
     * 
     */
    private Map<String,String> labels;
    private String name;
    /**
     * @return (Computed/Sensitive) The password to access the catalog if needed (string)
     * 
     */
    private String password;
    /**
     * @return (Computed) The project id of the catalog (string)
     * 
     */
    private String projectId;
    private @Nullable String scope;
    /**
     * @return (Computed) The url of the catalog repo (string)
     * 
     */
    private String url;
    /**
     * @return (Computed/Sensitive) The username to access the catalog if needed (string)
     * 
     */
    private String username;
    /**
     * @return (Computed) Helm version for the catalog (string)
     * 
     */
    private String version;

    private GetCatalogResult() {}
    /**
     * @return (Computed) Annotations for the catalog (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) The branch of the catalog repo to use (string)
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return (Computed) The cluster id of the catalog (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed) A catalog description (string)
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
     * @return (Computed) The kind of the catalog. Just helm by the moment (string)
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Computed) Labels for the catalog (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed/Sensitive) The password to access the catalog if needed (string)
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return (Computed) The project id of the catalog (string)
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return (Computed) The url of the catalog repo (string)
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return (Computed/Sensitive) The username to access the catalog if needed (string)
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return (Computed) Helm version for the catalog (string)
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private String branch;
        private String clusterId;
        private String description;
        private String id;
        private String kind;
        private Map<String,String> labels;
        private String name;
        private String password;
        private String projectId;
        private @Nullable String scope;
        private String url;
        private String username;
        private String version;
        public Builder() {}
        public Builder(GetCatalogResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.branch = defaults.branch;
    	      this.clusterId = defaults.clusterId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.projectId = defaults.projectId;
    	      this.scope = defaults.scope;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "username");
            }
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetCatalogResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetCatalogResult build() {
            final var _resultValue = new GetCatalogResult();
            _resultValue.annotations = annotations;
            _resultValue.branch = branch;
            _resultValue.clusterId = clusterId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.password = password;
            _resultValue.projectId = projectId;
            _resultValue.scope = scope;
            _resultValue.url = url;
            _resultValue.username = username;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
