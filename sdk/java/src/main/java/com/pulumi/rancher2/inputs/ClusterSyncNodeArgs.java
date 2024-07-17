// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSyncNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSyncNodeArgs Empty = new ClusterSyncNodeArgs();

    /**
     * Annotations of the resource
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The total resources of a node (map).
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Map<String,Object>> capacity;

    /**
     * @return The total resources of a node (map).
     * 
     */
    public Optional<Output<Map<String,Object>>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The cluster ID that is syncing (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The cluster ID that is syncing (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The external IP address of the node (string).
     * 
     */
    @Import(name="externalIpAddress")
    private @Nullable Output<String> externalIpAddress;

    /**
     * @return The external IP address of the node (string).
     * 
     */
    public Optional<Output<String>> externalIpAddress() {
        return Optional.ofNullable(this.externalIpAddress);
    }

    /**
     * The hostname of the node (string).
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname of the node (string).
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * (Computed) The ID of the resource. Same as `cluster_id` (string)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return (Computed) The ID of the resource. Same as `cluster_id` (string)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The private IP address of the node (string).
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The private IP address of the node (string).
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Labels of the resource
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the node (string).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the node (string).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Node Pool ID of the node (string).
     * 
     */
    @Import(name="nodePoolId")
    private @Nullable Output<String> nodePoolId;

    /**
     * @return The Node Pool ID of the node (string).
     * 
     */
    public Optional<Output<String>> nodePoolId() {
        return Optional.ofNullable(this.nodePoolId);
    }

    /**
     * The Node Template ID of the node (string).
     * 
     */
    @Import(name="nodeTemplateId")
    private @Nullable Output<String> nodeTemplateId;

    /**
     * @return The Node Template ID of the node (string).
     * 
     */
    public Optional<Output<String>> nodeTemplateId() {
        return Optional.ofNullable(this.nodeTemplateId);
    }

    /**
     * The Provider ID of the node (string).
     * 
     */
    @Import(name="providerId")
    private @Nullable Output<String> providerId;

    /**
     * @return The Provider ID of the node (string).
     * 
     */
    public Optional<Output<String>> providerId() {
        return Optional.ofNullable(this.providerId);
    }

    /**
     * The requested hostname (string).
     * 
     */
    @Import(name="requestedHostname")
    private @Nullable Output<String> requestedHostname;

    /**
     * @return The requested hostname (string).
     * 
     */
    public Optional<Output<String>> requestedHostname() {
        return Optional.ofNullable(this.requestedHostname);
    }

    /**
     * Roles of the node. `controlplane`, `etcd` and `worker`. (list)
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Roles of the node. `controlplane`, `etcd` and `worker`. (list)
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The user to connect to the node (string).
     * 
     */
    @Import(name="sshUser")
    private @Nullable Output<String> sshUser;

    /**
     * @return The user to connect to the node (string).
     * 
     */
    public Optional<Output<String>> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }

    /**
     * General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
     * 
     */
    @Import(name="systemInfo")
    private @Nullable Output<Map<String,Object>> systemInfo;

    /**
     * @return General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
     * 
     */
    public Optional<Output<Map<String,Object>>> systemInfo() {
        return Optional.ofNullable(this.systemInfo);
    }

    private ClusterSyncNodeArgs() {}

    private ClusterSyncNodeArgs(ClusterSyncNodeArgs $) {
        this.annotations = $.annotations;
        this.capacity = $.capacity;
        this.clusterId = $.clusterId;
        this.externalIpAddress = $.externalIpAddress;
        this.hostname = $.hostname;
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.labels = $.labels;
        this.name = $.name;
        this.nodePoolId = $.nodePoolId;
        this.nodeTemplateId = $.nodeTemplateId;
        this.providerId = $.providerId;
        this.requestedHostname = $.requestedHostname;
        this.roles = $.roles;
        this.sshUser = $.sshUser;
        this.systemInfo = $.systemInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSyncNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSyncNodeArgs $;

        public Builder() {
            $ = new ClusterSyncNodeArgs();
        }

        public Builder(ClusterSyncNodeArgs defaults) {
            $ = new ClusterSyncNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations of the resource
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param capacity The total resources of a node (map).
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Map<String,Object>> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The total resources of a node (map).
         * 
         * @return builder
         * 
         */
        public Builder capacity(Map<String,Object> capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param clusterId The cluster ID that is syncing (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster ID that is syncing (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param externalIpAddress The external IP address of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder externalIpAddress(@Nullable Output<String> externalIpAddress) {
            $.externalIpAddress = externalIpAddress;
            return this;
        }

        /**
         * @param externalIpAddress The external IP address of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder externalIpAddress(String externalIpAddress) {
            return externalIpAddress(Output.of(externalIpAddress));
        }

        /**
         * @param hostname The hostname of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param id (Computed) The ID of the resource. Same as `cluster_id` (string)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Computed) The ID of the resource. Same as `cluster_id` (string)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipAddress The private IP address of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The private IP address of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param labels Labels of the resource
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodePoolId The Node Pool ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder nodePoolId(@Nullable Output<String> nodePoolId) {
            $.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * @param nodePoolId The Node Pool ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder nodePoolId(String nodePoolId) {
            return nodePoolId(Output.of(nodePoolId));
        }

        /**
         * @param nodeTemplateId The Node Template ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder nodeTemplateId(@Nullable Output<String> nodeTemplateId) {
            $.nodeTemplateId = nodeTemplateId;
            return this;
        }

        /**
         * @param nodeTemplateId The Node Template ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder nodeTemplateId(String nodeTemplateId) {
            return nodeTemplateId(Output.of(nodeTemplateId));
        }

        /**
         * @param providerId The Provider ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder providerId(@Nullable Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        /**
         * @param providerId The Provider ID of the node (string).
         * 
         * @return builder
         * 
         */
        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        /**
         * @param requestedHostname The requested hostname (string).
         * 
         * @return builder
         * 
         */
        public Builder requestedHostname(@Nullable Output<String> requestedHostname) {
            $.requestedHostname = requestedHostname;
            return this;
        }

        /**
         * @param requestedHostname The requested hostname (string).
         * 
         * @return builder
         * 
         */
        public Builder requestedHostname(String requestedHostname) {
            return requestedHostname(Output.of(requestedHostname));
        }

        /**
         * @param roles Roles of the node. `controlplane`, `etcd` and `worker`. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Roles of the node. `controlplane`, `etcd` and `worker`. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Roles of the node. `controlplane`, `etcd` and `worker`. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param sshUser The user to connect to the node (string).
         * 
         * @return builder
         * 
         */
        public Builder sshUser(@Nullable Output<String> sshUser) {
            $.sshUser = sshUser;
            return this;
        }

        /**
         * @param sshUser The user to connect to the node (string).
         * 
         * @return builder
         * 
         */
        public Builder sshUser(String sshUser) {
            return sshUser(Output.of(sshUser));
        }

        /**
         * @param systemInfo General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
         * 
         * @return builder
         * 
         */
        public Builder systemInfo(@Nullable Output<Map<String,Object>> systemInfo) {
            $.systemInfo = systemInfo;
            return this;
        }

        /**
         * @param systemInfo General information about the node, such as kernel version, kubelet and kube-proxy version, Docker version (if used), and OS name.
         * 
         * @return builder
         * 
         */
        public Builder systemInfo(Map<String,Object> systemInfo) {
            return systemInfo(Output.of(systemInfo));
        }

        public ClusterSyncNodeArgs build() {
            return $;
        }
    }

}
