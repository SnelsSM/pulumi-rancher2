// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetStorageClassV2Result {
    /**
     * @return (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
     * 
     */
    private Boolean allowVolumeExpansion;
    /**
     * @return (Computed) Annotations for the storageClass v2 (map)
     * 
     */
    private Map<String,String> annotations;
    private String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) The provisioner of the storageClass v2 (string)
     * 
     */
    private String k8sProvisioner;
    /**
     * @return (Computed) Labels for the storageClass v2 (map)
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (Computed) The mount options for storageClass v2 (list)
     * 
     */
    private List<String> mountOptions;
    private String name;
    /**
     * @return (Computed) The parameters for storageClass v2 (string)
     * 
     */
    private Map<String,String> parameters;
    /**
     * @return (Computed) The reclaim policy for storageClass v2 (string)
     * 
     */
    private String reclaimPolicy;
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    private String resourceVersion;
    /**
     * @return (Computed) The volume binding mode for storageClass v2 (string)
     * 
     */
    private String volumeBindingMode;

    private GetStorageClassV2Result() {}
    /**
     * @return (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
     * 
     */
    public Boolean allowVolumeExpansion() {
        return this.allowVolumeExpansion;
    }
    /**
     * @return (Computed) Annotations for the storageClass v2 (map)
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) The provisioner of the storageClass v2 (string)
     * 
     */
    public String k8sProvisioner() {
        return this.k8sProvisioner;
    }
    /**
     * @return (Computed) Labels for the storageClass v2 (map)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) The mount options for storageClass v2 (list)
     * 
     */
    public List<String> mountOptions() {
        return this.mountOptions;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The parameters for storageClass v2 (string)
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters;
    }
    /**
     * @return (Computed) The reclaim policy for storageClass v2 (string)
     * 
     */
    public String reclaimPolicy() {
        return this.reclaimPolicy;
    }
    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    public String resourceVersion() {
        return this.resourceVersion;
    }
    /**
     * @return (Computed) The volume binding mode for storageClass v2 (string)
     * 
     */
    public String volumeBindingMode() {
        return this.volumeBindingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageClassV2Result defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowVolumeExpansion;
        private Map<String,String> annotations;
        private String clusterId;
        private String id;
        private String k8sProvisioner;
        private Map<String,String> labels;
        private List<String> mountOptions;
        private String name;
        private Map<String,String> parameters;
        private String reclaimPolicy;
        private String resourceVersion;
        private String volumeBindingMode;
        public Builder() {}
        public Builder(GetStorageClassV2Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVolumeExpansion = defaults.allowVolumeExpansion;
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.k8sProvisioner = defaults.k8sProvisioner;
    	      this.labels = defaults.labels;
    	      this.mountOptions = defaults.mountOptions;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.volumeBindingMode = defaults.volumeBindingMode;
        }

        @CustomType.Setter
        public Builder allowVolumeExpansion(Boolean allowVolumeExpansion) {
            if (allowVolumeExpansion == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "allowVolumeExpansion");
            }
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }
        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder k8sProvisioner(String k8sProvisioner) {
            if (k8sProvisioner == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "k8sProvisioner");
            }
            this.k8sProvisioner = k8sProvisioner;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder mountOptions(List<String> mountOptions) {
            if (mountOptions == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "mountOptions");
            }
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(Map<String,String> parameters) {
            if (parameters == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "parameters");
            }
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder reclaimPolicy(String reclaimPolicy) {
            if (reclaimPolicy == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "reclaimPolicy");
            }
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(String resourceVersion) {
            if (resourceVersion == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "resourceVersion");
            }
            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder volumeBindingMode(String volumeBindingMode) {
            if (volumeBindingMode == null) {
              throw new MissingRequiredPropertyException("GetStorageClassV2Result", "volumeBindingMode");
            }
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }
        public GetStorageClassV2Result build() {
            final var _resultValue = new GetStorageClassV2Result();
            _resultValue.allowVolumeExpansion = allowVolumeExpansion;
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.id = id;
            _resultValue.k8sProvisioner = k8sProvisioner;
            _resultValue.labels = labels;
            _resultValue.mountOptions = mountOptions;
            _resultValue.name = name;
            _resultValue.parameters = parameters;
            _resultValue.reclaimPolicy = reclaimPolicy;
            _resultValue.resourceVersion = resourceVersion;
            _resultValue.volumeBindingMode = volumeBindingMode;
            return _resultValue;
        }
    }
}
