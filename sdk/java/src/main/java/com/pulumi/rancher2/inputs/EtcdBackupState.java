// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.EtcdBackupBackupConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EtcdBackupState extends com.pulumi.resources.ResourceArgs {

    public static final EtcdBackupState Empty = new EtcdBackupState();

    /**
     * Annotations for Etcd Backup object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for Etcd Backup object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Backup config for etcd backup (list maxitems:1)
     * 
     */
    @Import(name="backupConfig")
    private @Nullable Output<EtcdBackupBackupConfigArgs> backupConfig;

    /**
     * @return Backup config for etcd backup (list maxitems:1)
     * 
     */
    public Optional<Output<EtcdBackupBackupConfigArgs>> backupConfig() {
        return Optional.ofNullable(this.backupConfig);
    }

    /**
     * Cluster ID to config Etcd Backup (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Cluster ID to config Etcd Backup (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Filename of the Etcd Backup (string)
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return Filename of the Etcd Backup (string)
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * Labels for Etcd Backup object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for Etcd Backup object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     * 
     */
    @Import(name="manual")
    private @Nullable Output<Boolean> manual;

    /**
     * @return Manual execution of the Etcd Backup. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> manual() {
        return Optional.ofNullable(this.manual);
    }

    /**
     * The name of the Etcd Backup (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Etcd Backup (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Description for the Etcd Backup (string)
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return Description for the Etcd Backup (string)
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    private EtcdBackupState() {}

    private EtcdBackupState(EtcdBackupState $) {
        this.annotations = $.annotations;
        this.backupConfig = $.backupConfig;
        this.clusterId = $.clusterId;
        this.filename = $.filename;
        this.labels = $.labels;
        this.manual = $.manual;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EtcdBackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EtcdBackupState $;

        public Builder() {
            $ = new EtcdBackupState();
        }

        public Builder(EtcdBackupState defaults) {
            $ = new EtcdBackupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for Etcd Backup object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for Etcd Backup object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param backupConfig Backup config for etcd backup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(@Nullable Output<EtcdBackupBackupConfigArgs> backupConfig) {
            $.backupConfig = backupConfig;
            return this;
        }

        /**
         * @param backupConfig Backup config for etcd backup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(EtcdBackupBackupConfigArgs backupConfig) {
            return backupConfig(Output.of(backupConfig));
        }

        /**
         * @param clusterId Cluster ID to config Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID to config Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param filename Filename of the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename Filename of the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param labels Labels for Etcd Backup object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for Etcd Backup object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param manual Manual execution of the Etcd Backup. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder manual(@Nullable Output<Boolean> manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param manual Manual execution of the Etcd Backup. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder manual(Boolean manual) {
            return manual(Output.of(manual));
        }

        /**
         * @param name The name of the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId Description for the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId Description for the Etcd Backup (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public EtcdBackupState build() {
            return $;
        }
    }

}
