// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.EtcdBackupArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.EtcdBackupState;
import com.pulumi.rancher2.outputs.EtcdBackupBackupConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Etcd Backup resource. This can be used to create an Etcd Backup for Rancher v2.2.x and above, and to retrieve their information.
 * 
 * The `rancher2.EtcdBackup` resource is used to define extra etcd backups for a `rancher2.Cluster`, which will be created as a local or S3 backup in accordance with the etcd backup config for the cluster. The main etcd backup config for the cluster should be set on the cluster config
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.EtcdBackup;
 * import com.pulumi.rancher2.EtcdBackupArgs;
 * import com.pulumi.rancher2.inputs.EtcdBackupBackupConfigArgs;
 * import com.pulumi.rancher2.inputs.EtcdBackupBackupConfigS3BackupConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 Etcd Backup
 *         var foo = new EtcdBackup("foo", EtcdBackupArgs.builder()
 *             .backupConfig(EtcdBackupBackupConfigArgs.builder()
 *                 .enabled(true)
 *                 .intervalHours(20)
 *                 .retention(10)
 *                 .s3BackupConfig(EtcdBackupBackupConfigS3BackupConfigArgs.builder()
 *                     .accessKey("access_key")
 *                     .bucketName("bucket_name")
 *                     .endpoint("endpoint")
 *                     .folder("/folder")
 *                     .region("region")
 *                     .secretKey("secret_key")
 *                     .build())
 *                 .build())
 *             .clusterId("<CLUSTER_ID>")
 *             .name("foo")
 *             .filename("<FILENAME>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Etcd Backup can be imported using the Rancher etcd backup ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &amp;lt;ETCD_BACKUP_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/etcdBackup:EtcdBackup")
public class EtcdBackup extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Etcd Backup object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for Etcd Backup object (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Backup config for etcd backup (list maxitems:1)
     * 
     */
    @Export(name="backupConfig", refs={EtcdBackupBackupConfig.class}, tree="[0]")
    private Output<EtcdBackupBackupConfig> backupConfig;

    /**
     * @return Backup config for etcd backup (list maxitems:1)
     * 
     */
    public Output<EtcdBackupBackupConfig> backupConfig() {
        return this.backupConfig;
    }
    /**
     * Cluster ID to config Etcd Backup (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return Cluster ID to config Etcd Backup (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Filename of the Etcd Backup (string)
     * 
     */
    @Export(name="filename", refs={String.class}, tree="[0]")
    private Output<String> filename;

    /**
     * @return Filename of the Etcd Backup (string)
     * 
     */
    public Output<String> filename() {
        return this.filename;
    }
    /**
     * Labels for Etcd Backup object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for Etcd Backup object (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     * 
     */
    @Export(name="manual", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> manual;

    /**
     * @return Manual execution of the Etcd Backup. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> manual() {
        return Codegen.optional(this.manual);
    }
    /**
     * The name of the Etcd Backup (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Etcd Backup (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Description for the Etcd Backup (string)
     * 
     */
    @Export(name="namespaceId", refs={String.class}, tree="[0]")
    private Output<String> namespaceId;

    /**
     * @return Description for the Etcd Backup (string)
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EtcdBackup(java.lang.String name) {
        this(name, EtcdBackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EtcdBackup(java.lang.String name, EtcdBackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EtcdBackup(java.lang.String name, EtcdBackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/etcdBackup:EtcdBackup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EtcdBackup(java.lang.String name, Output<java.lang.String> id, @Nullable EtcdBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/etcdBackup:EtcdBackup", name, state, makeResourceOptions(options, id), false);
    }

    private static EtcdBackupArgs makeArgs(EtcdBackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EtcdBackupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EtcdBackup get(java.lang.String name, Output<java.lang.String> id, @Nullable EtcdBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EtcdBackup(name, id, state, options);
    }
}
