// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new Rancher2 Cluster Alert Group
 * const foo = new rancher2.ClusterAlertGroup("foo", {
 *     clusterId: "<cluster_id>",
 *     description: "Terraform cluster alert group",
 *     groupIntervalSeconds: 300,
 *     repeatIntervalSeconds: 3600,
 * });
 * ```
 *
 * ## Import
 *
 * Cluster Alert Group can be imported using the Rancher cluster alert group ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/clusterAlertGroup:ClusterAlertGroup foo &lt;CLUSTER_ALERT_GROUP_ID&gt;
 * ```
 */
export class ClusterAlertGroup extends pulumi.CustomResource {
    /**
     * Get an existing ClusterAlertGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterAlertGroupState, opts?: pulumi.CustomResourceOptions): ClusterAlertGroup {
        return new ClusterAlertGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterAlertGroup:ClusterAlertGroup';

    /**
     * Returns true if the given object is an instance of ClusterAlertGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterAlertGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterAlertGroup.__pulumiType;
    }

    /**
     * The cluster alert group annotations (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert group (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The cluster alert group description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert group labels (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster alert group name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The cluster alert group recipients (list)
     */
    public readonly recipients!: pulumi.Output<outputs.ClusterAlertGroupRecipient[] | undefined>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a ClusterAlertGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterAlertGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterAlertGroupArgs | ClusterAlertGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterAlertGroupState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["recipients"] = state ? state.recipients : undefined;
            resourceInputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
        } else {
            const args = argsOrState as ClusterAlertGroupArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["recipients"] = args ? args.recipients : undefined;
            resourceInputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterAlertGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlertGroup resources.
 */
export interface ClusterAlertGroupState {
    /**
     * The cluster alert group annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert group (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cluster alert group description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert group name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The cluster alert group recipients (list)
     */
    recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlertGroupRecipient>[]>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ClusterAlertGroup resource.
 */
export interface ClusterAlertGroupArgs {
    /**
     * The cluster alert group annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert group (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The cluster alert group description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert group name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The cluster alert group recipients (list)
     */
    recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlertGroupRecipient>[]>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
}
