// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSyncNode {
    /**
     * @return Annotations of the resource
     * 
     */
    private @Nullable Map<String,Object> annotations;
    /**
     * @return The total resources of a node (map).
     * 
     */
    private @Nullable Map<String,Object> capacity;
    /**
     * @return The cluster ID that is syncing (string)
     * 
     */
    private @Nullable String clusterId;
    /**
     * @return The external IP address of the node (string).
     * 
     */
    private @Nullable String externalIpAddress;
    /**
     * @return The hostname of the node (string).
     * 
     */
    private @Nullable String hostname;
    /**
     * @return (Computed) The ID of the resource. Same as `cluster_id` (string)
     * 
     */
    private @Nullable String id;
    /**
     * @return The private IP address of the node (string).
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return Labels of the resource
     * 
     */
    private @Nullable Map<String,Object> labels;
    /**
     * @return The name of the node (string).
     * 
     */
    private @Nullable String name;
    /**
     * @return The Node Pool ID of the node (string).
     * 
     */
    private @Nullable String nodePoolId;
    /**
     * @return The Node Template ID of the node (string).
     * 
     */
    private @Nullable String nodeTemplateId;
    /**
     * @return The Provider ID of the node (string).
     * 
     */
    private @Nullable String providerId;
    /**
     * @return The requested hostname (string).
     * 
     */
    private @Nullable String requestedHostname;
    /**
     * @return Roles of the node. `controlplane`, `etcd` and `worker`. (list)
     * 
     */
    private @Nullable List<String> roles;
    /**
     * @return The user to connect to the node (string).
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
     * 
     */
    private @Nullable Map<String,Object> systemInfo;

    private ClusterSyncNode() {}
    /**
     * @return Annotations of the resource
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return The total resources of a node (map).
     * 
     */
    public Map<String,Object> capacity() {
        return this.capacity == null ? Map.of() : this.capacity;
    }
    /**
     * @return The cluster ID that is syncing (string)
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return The external IP address of the node (string).
     * 
     */
    public Optional<String> externalIpAddress() {
        return Optional.ofNullable(this.externalIpAddress);
    }
    /**
     * @return The hostname of the node (string).
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return (Computed) The ID of the resource. Same as `cluster_id` (string)
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The private IP address of the node (string).
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return Labels of the resource
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The name of the node (string).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Node Pool ID of the node (string).
     * 
     */
    public Optional<String> nodePoolId() {
        return Optional.ofNullable(this.nodePoolId);
    }
    /**
     * @return The Node Template ID of the node (string).
     * 
     */
    public Optional<String> nodeTemplateId() {
        return Optional.ofNullable(this.nodeTemplateId);
    }
    /**
     * @return The Provider ID of the node (string).
     * 
     */
    public Optional<String> providerId() {
        return Optional.ofNullable(this.providerId);
    }
    /**
     * @return The requested hostname (string).
     * 
     */
    public Optional<String> requestedHostname() {
        return Optional.ofNullable(this.requestedHostname);
    }
    /**
     * @return Roles of the node. `controlplane`, `etcd` and `worker`. (list)
     * 
     */
    public List<String> roles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * @return The user to connect to the node (string).
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
     * 
     */
    public Map<String,Object> systemInfo() {
        return this.systemInfo == null ? Map.of() : this.systemInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSyncNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> annotations;
        private @Nullable Map<String,Object> capacity;
        private @Nullable String clusterId;
        private @Nullable String externalIpAddress;
        private @Nullable String hostname;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable Map<String,Object> labels;
        private @Nullable String name;
        private @Nullable String nodePoolId;
        private @Nullable String nodeTemplateId;
        private @Nullable String providerId;
        private @Nullable String requestedHostname;
        private @Nullable List<String> roles;
        private @Nullable String sshUser;
        private @Nullable Map<String,Object> systemInfo;
        public Builder() {}
        public Builder(ClusterSyncNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.capacity = defaults.capacity;
    	      this.clusterId = defaults.clusterId;
    	      this.externalIpAddress = defaults.externalIpAddress;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nodePoolId = defaults.nodePoolId;
    	      this.nodeTemplateId = defaults.nodeTemplateId;
    	      this.providerId = defaults.providerId;
    	      this.requestedHostname = defaults.requestedHostname;
    	      this.roles = defaults.roles;
    	      this.sshUser = defaults.sshUser;
    	      this.systemInfo = defaults.systemInfo;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,Object> annotations) {

            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder capacity(@Nullable Map<String,Object> capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder externalIpAddress(@Nullable String externalIpAddress) {

            this.externalIpAddress = externalIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodePoolId(@Nullable String nodePoolId) {

            this.nodePoolId = nodePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTemplateId(@Nullable String nodeTemplateId) {

            this.nodeTemplateId = nodeTemplateId;
            return this;
        }
        @CustomType.Setter
        public Builder providerId(@Nullable String providerId) {

            this.providerId = providerId;
            return this;
        }
        @CustomType.Setter
        public Builder requestedHostname(@Nullable String requestedHostname) {

            this.requestedHostname = requestedHostname;
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<String> roles) {

            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {

            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder systemInfo(@Nullable Map<String,Object> systemInfo) {

            this.systemInfo = systemInfo;
            return this;
        }
        public ClusterSyncNode build() {
            final var _resultValue = new ClusterSyncNode();
            _resultValue.annotations = annotations;
            _resultValue.capacity = capacity;
            _resultValue.clusterId = clusterId;
            _resultValue.externalIpAddress = externalIpAddress;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.ipAddress = ipAddress;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.nodePoolId = nodePoolId;
            _resultValue.nodeTemplateId = nodeTemplateId;
            _resultValue.providerId = providerId;
            _resultValue.requestedHostname = requestedHostname;
            _resultValue.roles = roles;
            _resultValue.sshUser = sshUser;
            _resultValue.systemInfo = systemInfo;
            return _resultValue;
        }
    }
}
