// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * @deprecated rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup
 */
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
        pulumi.log.warn("ClusterAlterGroup is deprecated: rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup")
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
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert group Cluster ID
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Alert group description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Alert group interval seconds
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * Alert group wait seconds
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert group name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Alert group recipients
     */
    public readonly recipients!: pulumi.Output<outputs.ClusterAlterGroupRecipient[] | undefined>;
    /**
     * Alert group repeat interval seconds
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a ClusterAlterGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup */
    constructor(name: string, args: ClusterAlterGroupArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup */
    constructor(name: string, argsOrState?: ClusterAlterGroupArgs | ClusterAlterGroupState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("ClusterAlterGroup is deprecated: rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup")
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
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
            if ((!args || args.clusterId === undefined) && !opts.urn) {
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
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ClusterAlterGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlterGroup resources.
 */
export interface ClusterAlterGroupState {
    /**
     * Annotations of the resource
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group Cluster ID
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Alert group description
     */
    description?: pulumi.Input<string>;
    /**
     * Alert group interval seconds
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert group wait seconds
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Labels of the resource
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group name
     */
    name?: pulumi.Input<string>;
    /**
     * Alert group recipients
     */
    recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlterGroupRecipient>[]>;
    /**
     * Alert group repeat interval seconds
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ClusterAlterGroup resource.
 */
export interface ClusterAlterGroupArgs {
    /**
     * Annotations of the resource
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group Cluster ID
     */
    clusterId: pulumi.Input<string>;
    /**
     * Alert group description
     */
    description?: pulumi.Input<string>;
    /**
     * Alert group interval seconds
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert group wait seconds
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Labels of the resource
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group name
     */
    name?: pulumi.Input<string>;
    /**
     * Alert group recipients
     */
    recipients?: pulumi.Input<pulumi.Input<inputs.ClusterAlterGroupRecipient>[]>;
    /**
     * Alert group repeat interval seconds
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
}
