// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new Rancher2 Cluster Alert Group
 * const fooClusterAlertGroup = new rancher2.ClusterAlertGroup("fooClusterAlertGroup", {
 *     clusterId: "<cluster_id>",
 *     description: "Terraform cluster alert group",
 *     groupIntervalSeconds: 300,
 *     repeatIntervalSeconds: 3600,
 * });
 * // Create a new Rancher2 Cluster Alert Rule
 * const fooClusterAlertRule = new rancher2.ClusterAlertRule("fooClusterAlertRule", {
 *     clusterId: fooClusterAlertGroup.clusterId,
 *     groupId: fooClusterAlertGroup.id,
 *     groupIntervalSeconds: 600,
 *     repeatIntervalSeconds: 6000,
 * });
 * ```
 *
 * ## Import
 *
 * Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/clusterAlertRule:ClusterAlertRule foo &lt;CLUSTER_ALERT_RULE_ID&gt;
 * ```
 */
export class ClusterAlertRule extends pulumi.CustomResource {
    /**
     * Get an existing ClusterAlertRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterAlertRuleState, opts?: pulumi.CustomResourceOptions): ClusterAlertRule {
        return new ClusterAlertRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterAlertRule:ClusterAlertRule';

    /**
     * Returns true if the given object is an instance of ClusterAlertRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterAlertRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterAlertRule.__pulumiType;
    }

    /**
     * The cluster alert rule annotations (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly eventRule!: pulumi.Output<outputs.ClusterAlertRuleEventRule | undefined>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    public readonly inherited!: pulumi.Output<boolean | undefined>;
    /**
     * The cluster alert rule labels (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly metricRule!: pulumi.Output<outputs.ClusterAlertRuleMetricRule | undefined>;
    /**
     * The cluster alert rule name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly nodeRule!: pulumi.Output<outputs.ClusterAlertRuleNodeRule | undefined>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    public readonly severity!: pulumi.Output<string | undefined>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
     */
    public readonly systemServiceRule!: pulumi.Output<outputs.ClusterAlertRuleSystemServiceRule | undefined>;

    /**
     * Create a ClusterAlertRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterAlertRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterAlertRuleArgs | ClusterAlertRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterAlertRuleState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["eventRule"] = state ? state.eventRule : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            resourceInputs["inherited"] = state ? state.inherited : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["metricRule"] = state ? state.metricRule : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeRule"] = state ? state.nodeRule : undefined;
            resourceInputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
            resourceInputs["severity"] = state ? state.severity : undefined;
            resourceInputs["systemServiceRule"] = state ? state.systemServiceRule : undefined;
        } else {
            const args = argsOrState as ClusterAlertRuleArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["eventRule"] = args ? args.eventRule : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            resourceInputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            resourceInputs["inherited"] = args ? args.inherited : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["metricRule"] = args ? args.metricRule : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeRule"] = args ? args.nodeRule : undefined;
            resourceInputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
            resourceInputs["severity"] = args ? args.severity : undefined;
            resourceInputs["systemServiceRule"] = args ? args.systemServiceRule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "rancher2:index/clusterAlterRule:ClusterAlterRule" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(ClusterAlertRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlertRule resources.
 */
export interface ClusterAlertRuleState {
    /**
     * The cluster alert rule annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    eventRule?: pulumi.Input<inputs.ClusterAlertRuleEventRule>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * The cluster alert rule labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    metricRule?: pulumi.Input<inputs.ClusterAlertRuleMetricRule>;
    /**
     * The cluster alert rule name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    nodeRule?: pulumi.Input<inputs.ClusterAlertRuleNodeRule>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    severity?: pulumi.Input<string>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
     */
    systemServiceRule?: pulumi.Input<inputs.ClusterAlertRuleSystemServiceRule>;
}

/**
 * The set of arguments for constructing a ClusterAlertRule resource.
 */
export interface ClusterAlertRuleArgs {
    /**
     * The cluster alert rule annotations (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    eventRule?: pulumi.Input<inputs.ClusterAlertRuleEventRule>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    groupId: pulumi.Input<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * The cluster alert rule labels (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    metricRule?: pulumi.Input<inputs.ClusterAlertRuleMetricRule>;
    /**
     * The cluster alert rule name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    nodeRule?: pulumi.Input<inputs.ClusterAlertRuleNodeRule>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    severity?: pulumi.Input<string>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
     */
    systemServiceRule?: pulumi.Input<inputs.ClusterAlertRuleSystemServiceRule>;
}
