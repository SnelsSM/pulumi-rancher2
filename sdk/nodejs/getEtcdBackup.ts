// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 etcd backup.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getEtcdBackup({
 *     clusterId: "<CLUSTER_ID>",
 *     name: "foo",
 * }));
 * ```
 */
export function getEtcdBackup(args: GetEtcdBackupArgs, opts?: pulumi.InvokeOptions): Promise<GetEtcdBackupResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getEtcdBackup:getEtcdBackup", {
        "clusterId": args.clusterId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getEtcdBackup.
 */
export interface GetEtcdBackupArgs {
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    clusterId: string;
    /**
     * The name of the Etcd Backup (string)
     */
    name: string;
}

/**
 * A collection of values returned by getEtcdBackup.
 */
export interface GetEtcdBackupResult {
    /**
     * (Computed) Annotations for Etcd Backup object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Backup config for etcd backup (list maxitems:1)
     */
    readonly backupConfig: outputs.GetEtcdBackupBackupConfig;
    readonly clusterId: string;
    /**
     * (Computed) Filename of the Etcd Backup (string)
     */
    readonly filename: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for Etcd Backup object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) Manual execution of the Etcd Backup. Default `false` (bool)
     */
    readonly manual: boolean;
    readonly name: string;
    /**
     * (Computed) Description for the Etcd Backup (string)
     */
    readonly namespaceId: string;
}

export function getEtcdBackupOutput(args: GetEtcdBackupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEtcdBackupResult> {
    return pulumi.output(args).apply(a => getEtcdBackup(a, opts))
}

/**
 * A collection of arguments for invoking getEtcdBackup.
 */
export interface GetEtcdBackupOutputArgs {
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the Etcd Backup (string)
     */
    name: pulumi.Input<string>;
}
