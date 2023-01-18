// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Etcd Backup
 * const foo = new rancher2.EtcdBackup("foo", {
 *     backupConfig: {
 *         enabled: true,
 *         intervalHours: 20,
 *         retention: 10,
 *         s3BackupConfig: {
 *             accessKey: "access_key",
 *             bucketName: "bucket_name",
 *             endpoint: "endpoint",
 *             folder: "/folder",
 *             region: "region",
 *             secretKey: "secret_key",
 *         },
 *     },
 *     clusterId: "<CLUSTER_ID>",
 *     filename: "<FILENAME>",
 * });
 * ```
 *
 * ## Import
 *
 * Etcd Backup can be imported using the Rancher etcd backup ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
 * ```
 */
export class EtcdBackup extends pulumi.CustomResource {
    /**
     * Get an existing EtcdBackup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EtcdBackupState, opts?: pulumi.CustomResourceOptions): EtcdBackup {
        return new EtcdBackup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/etcdBackup:EtcdBackup';

    /**
     * Returns true if the given object is an instance of EtcdBackup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EtcdBackup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EtcdBackup.__pulumiType;
    }

    /**
     * Annotations for Etcd Backup object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    public readonly backupConfig!: pulumi.Output<outputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    public readonly filename!: pulumi.Output<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    public readonly manual!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Etcd Backup (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    public readonly namespaceId!: pulumi.Output<string>;

    /**
     * Create a EtcdBackup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EtcdBackupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EtcdBackupArgs | EtcdBackupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EtcdBackupState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["backupConfig"] = state ? state.backupConfig : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["filename"] = state ? state.filename : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["manual"] = state ? state.manual : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
        } else {
            const args = argsOrState as EtcdBackupArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["backupConfig"] = args ? args.backupConfig : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["filename"] = args ? args.filename : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["manual"] = args ? args.manual : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EtcdBackup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EtcdBackup resources.
 */
export interface EtcdBackupState {
    /**
     * Annotations for Etcd Backup object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    backupConfig?: pulumi.Input<inputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    filename?: pulumi.Input<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    manual?: pulumi.Input<boolean>;
    /**
     * The name of the Etcd Backup (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    namespaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EtcdBackup resource.
 */
export interface EtcdBackupArgs {
    /**
     * Annotations for Etcd Backup object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    backupConfig?: pulumi.Input<inputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    filename?: pulumi.Input<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    manual?: pulumi.Input<boolean>;
    /**
     * The name of the Etcd Backup (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    namespaceId?: pulumi.Input<string>;
}
