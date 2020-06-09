// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 cluster alert rule.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getClusterAlterRule({
 *     clusterId: "<cluster_id>",
 *     name: "<cluster_alert_rule_name>",
 * }, { async: true }));
 * ```
 */
export function getClusterAlterRule(args: GetClusterAlterRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterAlterRuleResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterAlterRule:getClusterAlterRule", {
        "clusterId": args.clusterId,
        "labels": args.labels,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterAlterRule.
 */
export interface GetClusterAlterRuleArgs {
    /**
     * The cluster id where create cluster alert rule (string)
     */
    readonly clusterId: string;
    /**
     * (Computed) The cluster alert rule labels (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * The cluster alert rule name (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getClusterAlterRule.
 */
export interface GetClusterAlterRuleResult {
    /**
     * (Computed) The cluster alert rule annotations (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly eventRule: outputs.GetClusterAlterRuleEventRule;
    /**
     * (Computed) The cluster alert rule alert group ID (string)
     */
    readonly groupId: string;
    /**
     * (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds: number;
    /**
     * (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) The cluster alert rule inherited. Default: `true` (bool)
     */
    readonly inherited: boolean;
    /**
     * (Computed) The cluster alert rule labels (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * (Computed) The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly metricRule: outputs.GetClusterAlterRuleMetricRule;
    readonly name: string;
    /**
     * (Computed) The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly nodeRule: outputs.GetClusterAlterRuleNodeRule;
    /**
     * (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds: number;
    /**
     * (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity: string;
    /**
     * (Computed) The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
     */
    readonly systemServiceRule: outputs.GetClusterAlterRuleSystemServiceRule;
}
