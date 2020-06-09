// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ClusterAlterGroup extends pulumi.CustomResource {
    /**
     * Get an existing ClusterAlterGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterAlterGroupState, opts?: pulumi.CustomResourceOptions): ClusterAlterGroup {
        return new ClusterAlterGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterAlterGroup:ClusterAlterGroup';

    /**
     * Returns true if the given object is an instance of ClusterAlterGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterAlterGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterAlterGroup.__pulumiType;
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
    public readonly recipients!: pulumi.Output<outputs.ClusterAlterGroupRecipient[] | undefined>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a ClusterAlterGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterAlterGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterAlterGroupArgs | ClusterAlterGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterAlterGroupState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["recipients"] = state ? state.recipients : undefined;
            inputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
        } else {
            const args = argsOrState as ClusterAlterGroupArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["recipients"] = args ? args.recipients : undefined;
            inputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ClusterAlterGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlterGroup resources.
 */
export interface ClusterAlterGroupState {
    /**
     * The cluster alert group annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert group (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The cluster alert group description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert group name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The cluster alert group recipients (list)
     */
    readonly recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlterGroupRecipient>[]>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ClusterAlterGroup resource.
 */
export interface ClusterAlterGroupArgs {
    /**
     * The cluster alert group annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert group (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The cluster alert group description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert group labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert group name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The cluster alert group recipients (list)
     */
    readonly recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlterGroupRecipient>[]>;
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
}
