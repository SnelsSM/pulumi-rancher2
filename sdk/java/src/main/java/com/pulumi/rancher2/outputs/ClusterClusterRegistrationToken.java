// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterRegistrationToken {
    /**
     * @return Annotations for the Cluster (map)
     * 
     */
    private @Nullable Map<String,Object> annotations;
    private @Nullable String clusterId;
    /**
     * @return Command to execute in a imported k8s cluster (string)
     * 
     */
    private @Nullable String command;
    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    private @Nullable String id;
    /**
     * @return Insecure command to execute in a imported k8s cluster (string)
     * 
     */
    private @Nullable String insecureCommand;
    /**
     * @return Insecure node command to execute in a imported k8s cluster (string)
     * 
     */
    private @Nullable String insecureNodeCommand;
    /**
     * @return Insecure windows command to execute in a imported k8s cluster (string)
     * 
     */
    private @Nullable String insecureWindowsNodeCommand;
    /**
     * @return Labels for the Cluster (map)
     * 
     */
    private @Nullable Map<String,Object> labels;
    /**
     * @return K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
     * 
     */
    private @Nullable String manifestUrl;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private @Nullable String name;
    /**
     * @return Node command to execute in linux nodes for custom k8s cluster (string)
     * 
     */
    private @Nullable String nodeCommand;
    private @Nullable String token;
    /**
     * @return Node command to execute in windows nodes for custom k8s cluster (string)
     * 
     */
    private @Nullable String windowsNodeCommand;

    private ClusterClusterRegistrationToken() {}
    /**
     * @return Annotations for the Cluster (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return Command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<String> command() {
        return Optional.ofNullable(this.command);
    }
    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Insecure command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<String> insecureCommand() {
        return Optional.ofNullable(this.insecureCommand);
    }
    /**
     * @return Insecure node command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<String> insecureNodeCommand() {
        return Optional.ofNullable(this.insecureNodeCommand);
    }
    /**
     * @return Insecure windows command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<String> insecureWindowsNodeCommand() {
        return Optional.ofNullable(this.insecureWindowsNodeCommand);
    }
    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
     * 
     */
    public Optional<String> manifestUrl() {
        return Optional.ofNullable(this.manifestUrl);
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Node command to execute in linux nodes for custom k8s cluster (string)
     * 
     */
    public Optional<String> nodeCommand() {
        return Optional.ofNullable(this.nodeCommand);
    }
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return Node command to execute in windows nodes for custom k8s cluster (string)
     * 
     */
    public Optional<String> windowsNodeCommand() {
        return Optional.ofNullable(this.windowsNodeCommand);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterRegistrationToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> annotations;
        private @Nullable String clusterId;
        private @Nullable String command;
        private @Nullable String id;
        private @Nullable String insecureCommand;
        private @Nullable String insecureNodeCommand;
        private @Nullable String insecureWindowsNodeCommand;
        private @Nullable Map<String,Object> labels;
        private @Nullable String manifestUrl;
        private @Nullable String name;
        private @Nullable String nodeCommand;
        private @Nullable String token;
        private @Nullable String windowsNodeCommand;
        public Builder() {}
        public Builder(ClusterClusterRegistrationToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.command = defaults.command;
    	      this.id = defaults.id;
    	      this.insecureCommand = defaults.insecureCommand;
    	      this.insecureNodeCommand = defaults.insecureNodeCommand;
    	      this.insecureWindowsNodeCommand = defaults.insecureWindowsNodeCommand;
    	      this.labels = defaults.labels;
    	      this.manifestUrl = defaults.manifestUrl;
    	      this.name = defaults.name;
    	      this.nodeCommand = defaults.nodeCommand;
    	      this.token = defaults.token;
    	      this.windowsNodeCommand = defaults.windowsNodeCommand;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,Object> annotations) {

            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder command(@Nullable String command) {

            this.command = command;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder insecureCommand(@Nullable String insecureCommand) {

            this.insecureCommand = insecureCommand;
            return this;
        }
        @CustomType.Setter
        public Builder insecureNodeCommand(@Nullable String insecureNodeCommand) {

            this.insecureNodeCommand = insecureNodeCommand;
            return this;
        }
        @CustomType.Setter
        public Builder insecureWindowsNodeCommand(@Nullable String insecureWindowsNodeCommand) {

            this.insecureWindowsNodeCommand = insecureWindowsNodeCommand;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder manifestUrl(@Nullable String manifestUrl) {

            this.manifestUrl = manifestUrl;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCommand(@Nullable String nodeCommand) {

            this.nodeCommand = nodeCommand;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {

            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder windowsNodeCommand(@Nullable String windowsNodeCommand) {

            this.windowsNodeCommand = windowsNodeCommand;
            return this;
        }
        public ClusterClusterRegistrationToken build() {
            final var _resultValue = new ClusterClusterRegistrationToken();
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.command = command;
            _resultValue.id = id;
            _resultValue.insecureCommand = insecureCommand;
            _resultValue.insecureNodeCommand = insecureNodeCommand;
            _resultValue.insecureWindowsNodeCommand = insecureWindowsNodeCommand;
            _resultValue.labels = labels;
            _resultValue.manifestUrl = manifestUrl;
            _resultValue.name = name;
            _resultValue.nodeCommand = nodeCommand;
            _resultValue.token = token;
            _resultValue.windowsNodeCommand = windowsNodeCommand;
            return _resultValue;
        }
    }
}
