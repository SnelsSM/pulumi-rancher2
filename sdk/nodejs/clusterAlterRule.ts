// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule
 */
export class ClusterAlterRule extends pulumi.CustomResource {
    /**
     * Get an existing ClusterAlterRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterAlterRuleState, opts?: pulumi.CustomResourceOptions): ClusterAlterRule {
        pulumi.log.warn("ClusterAlterRule is deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")
        return new ClusterAlterRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterAlterRule:ClusterAlterRule';

    /**
     * Returns true if the given object is an instance of ClusterAlterRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterAlterRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterAlterRule.__pulumiType;
    }

    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert rule cluster ID
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Alert event rule
     */
    public readonly eventRule!: pulumi.Output<outputs.ClusterAlterRuleEventRule | undefined>;
    /**
     * Alert rule group ID
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Alert rule interval seconds
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * Alert rule wait seconds
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * Alert rule inherited
     */
    public readonly inherited!: pulumi.Output<boolean | undefined>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert metric rule
     */
    public readonly metricRule!: pulumi.Output<outputs.ClusterAlterRuleMetricRule | undefined>;
    /**
     * Alert rule name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Alert node rule
     */
    public readonly nodeRule!: pulumi.Output<outputs.ClusterAlterRuleNodeRule | undefined>;
    /**
     * Alert rule repeat interval seconds
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * Alert rule severity
     */
    public readonly severity!: pulumi.Output<string | undefined>;
    /**
     * Alert system service rule
     */
    public readonly systemServiceRule!: pulumi.Output<outputs.ClusterAlterRuleSystemServiceRule | undefined>;

    /**
     * Create a ClusterAlterRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule */
    constructor(name: string, args: ClusterAlterRuleArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule */
    constructor(name: string, argsOrState?: ClusterAlterRuleArgs | ClusterAlterRuleState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("ClusterAlterRule is deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterAlterRuleState | undefined;
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
            const args = argsOrState as ClusterAlterRuleArgs | undefined;
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
        super(ClusterAlterRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlterRule resources.
 */
export interface ClusterAlterRuleState {
    /**
     * Annotations of the resource
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert rule cluster ID
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Alert event rule
     */
    eventRule?: pulumi.Input<inputs.ClusterAlterRuleEventRule>;
    /**
     * Alert rule group ID
     */
    groupId?: pulumi.Input<string>;
    /**
     * Alert rule interval seconds
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert rule wait seconds
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Alert rule inherited
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * Labels of the resource
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert metric rule
     */
    metricRule?: pulumi.Input<inputs.ClusterAlterRuleMetricRule>;
    /**
     * Alert rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Alert node rule
     */
    nodeRule?: pulumi.Input<inputs.ClusterAlterRuleNodeRule>;
    /**
     * Alert rule repeat interval seconds
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert rule severity
     */
    severity?: pulumi.Input<string>;
    /**
     * Alert system service rule
     */
    systemServiceRule?: pulumi.Input<inputs.ClusterAlterRuleSystemServiceRule>;
}

/**
 * The set of arguments for constructing a ClusterAlterRule resource.
 */
export interface ClusterAlterRuleArgs {
    /**
     * Annotations of the resource
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert rule cluster ID
     */
    clusterId: pulumi.Input<string>;
    /**
     * Alert event rule
     */
    eventRule?: pulumi.Input<inputs.ClusterAlterRuleEventRule>;
    /**
     * Alert rule group ID
     */
    groupId: pulumi.Input<string>;
    /**
     * Alert rule interval seconds
     */
    groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert rule wait seconds
     */
    groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Alert rule inherited
     */
    inherited?: pulumi.Input<boolean>;
    /**
     * Labels of the resource
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert metric rule
     */
    metricRule?: pulumi.Input<inputs.ClusterAlterRuleMetricRule>;
    /**
     * Alert rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Alert node rule
     */
    nodeRule?: pulumi.Input<inputs.ClusterAlterRuleNodeRule>;
    /**
     * Alert rule repeat interval seconds
     */
    repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert rule severity
     */
    severity?: pulumi.Input<string>;
    /**
     * Alert system service rule
     */
    systemServiceRule?: pulumi.Input<inputs.ClusterAlterRuleSystemServiceRule>;
}
