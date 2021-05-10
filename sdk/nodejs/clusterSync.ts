// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export class ClusterSync extends pulumi.CustomResource {
    /**
     * Get an existing ClusterSync resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterSyncState, opts?: pulumi.CustomResourceOptions): ClusterSync {
        return new ClusterSync(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterSync:ClusterSync';

    /**
     * Returns true if the given object is an instance of ClusterSync.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterSync {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterSync.__pulumiType;
    }

    /**
     * The Cluster ID of the node (string).
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * (Computed) Default project ID for the cluster sync (string)
     */
    public /*out*/ readonly defaultProjectId!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) Kube Config generated for the cluster sync (string)
     */
    public /*out*/ readonly kubeConfig!: pulumi.Output<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    public readonly nodePoolIds!: pulumi.Output<string[] | undefined>;
    /**
     * (Computed) The cluster nodes (list).
     */
    public /*out*/ readonly nodes!: pulumi.Output<outputs.ClusterSyncNode[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     */
    public readonly stateConfirm!: pulumi.Output<number | undefined>;
    public readonly synced!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) System project ID for the cluster sync (string)
     */
    public /*out*/ readonly systemProjectId!: pulumi.Output<string>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    public readonly waitAlerting!: pulumi.Output<boolean | undefined>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    public readonly waitCatalogs!: pulumi.Output<boolean | undefined>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    public readonly waitMonitoring!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ClusterSync resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterSyncArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterSyncArgs | ClusterSyncState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterSyncState | undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["defaultProjectId"] = state ? state.defaultProjectId : undefined;
            inputs["kubeConfig"] = state ? state.kubeConfig : undefined;
            inputs["nodePoolIds"] = state ? state.nodePoolIds : undefined;
            inputs["nodes"] = state ? state.nodes : undefined;
            inputs["stateConfirm"] = state ? state.stateConfirm : undefined;
            inputs["synced"] = state ? state.synced : undefined;
            inputs["systemProjectId"] = state ? state.systemProjectId : undefined;
            inputs["waitAlerting"] = state ? state.waitAlerting : undefined;
            inputs["waitCatalogs"] = state ? state.waitCatalogs : undefined;
            inputs["waitMonitoring"] = state ? state.waitMonitoring : undefined;
        } else {
            const args = argsOrState as ClusterSyncArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["nodePoolIds"] = args ? args.nodePoolIds : undefined;
            inputs["stateConfirm"] = args ? args.stateConfirm : undefined;
            inputs["synced"] = args ? args.synced : undefined;
            inputs["waitAlerting"] = args ? args.waitAlerting : undefined;
            inputs["waitCatalogs"] = args ? args.waitCatalogs : undefined;
            inputs["waitMonitoring"] = args ? args.waitMonitoring : undefined;
            inputs["defaultProjectId"] = undefined /*out*/;
            inputs["kubeConfig"] = undefined /*out*/;
            inputs["nodes"] = undefined /*out*/;
            inputs["systemProjectId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ClusterSync.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterSync resources.
 */
export interface ClusterSyncState {
    /**
     * The Cluster ID of the node (string).
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * (Computed) Default project ID for the cluster sync (string)
     */
    readonly defaultProjectId?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) Kube Config generated for the cluster sync (string)
     */
    readonly kubeConfig?: pulumi.Input<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    readonly nodePoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Computed) The cluster nodes (list).
     */
    readonly nodes?: pulumi.Input<pulumi.Input<inputs.ClusterSyncNode>[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     */
    readonly stateConfirm?: pulumi.Input<number>;
    readonly synced?: pulumi.Input<boolean>;
    /**
     * (Computed) System project ID for the cluster sync (string)
     */
    readonly systemProjectId?: pulumi.Input<string>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    readonly waitAlerting?: pulumi.Input<boolean>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    readonly waitCatalogs?: pulumi.Input<boolean>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    readonly waitMonitoring?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ClusterSync resource.
 */
export interface ClusterSyncArgs {
    /**
     * The Cluster ID of the node (string).
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    readonly nodePoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     */
    readonly stateConfirm?: pulumi.Input<number>;
    readonly synced?: pulumi.Input<boolean>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    readonly waitAlerting?: pulumi.Input<boolean>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    readonly waitCatalogs?: pulumi.Input<boolean>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    readonly waitMonitoring?: pulumi.Input<boolean>;
}
