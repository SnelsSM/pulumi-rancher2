// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 notifier.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getNotifier({
 *     clusterId: "<cluster_id>",
 *     name: "foo",
 * }));
 * ```
 */
export function getNotifier(args: GetNotifierArgs, opts?: pulumi.InvokeOptions): Promise<GetNotifierResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("rancher2:index/getNotifier:getNotifier", {
        "clusterId": args.clusterId,
        "dingtalkConfig": args.dingtalkConfig,
        "msteamsConfig": args.msteamsConfig,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotifier.
 */
export interface GetNotifierArgs {
    /**
     * The cluster id where create notifier (string)
     */
    clusterId: string;
    /**
     * (Computed) Dingtalk config for notifier (list maxitems:1)
     */
    dingtalkConfig?: inputs.GetNotifierDingtalkConfig;
    /**
     * (Computed) MSTeams config for notifier (list maxitems:1)
     */
    msteamsConfig?: inputs.GetNotifierMsteamsConfig;
    /**
     * The name of the notifier (string)
     */
    name: string;
}

/**
 * A collection of values returned by getNotifier.
 */
export interface GetNotifierResult {
    /**
     * (Computed) Annotations for notifier object (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) The notifier description (string)
     */
    readonly description: string;
    /**
     * (Computed) Dingtalk config for notifier (list maxitems:1)
     */
    readonly dingtalkConfig?: outputs.GetNotifierDingtalkConfig;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for notifier object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) MSTeams config for notifier (list maxitems:1)
     */
    readonly msteamsConfig?: outputs.GetNotifierMsteamsConfig;
    readonly name: string;
    /**
     * (Computed) Pagerduty config for notifier (list maxitems:1)
     */
    readonly pagerdutyConfig: outputs.GetNotifierPagerdutyConfig;
    /**
     * (Computed) Slack config for notifier (list maxitems:1)
     */
    readonly slackConfig: outputs.GetNotifierSlackConfig;
    /**
     * (Computed) SMTP config for notifier (list maxitems:1)
     */
    readonly smtpConfig: outputs.GetNotifierSmtpConfig;
    /**
     * (Computed) Webhook config for notifier (list maxitems:1)
     */
    readonly webhookConfig: outputs.GetNotifierWebhookConfig;
    /**
     * (Computed) Wechat config for notifier (list maxitems:1)
     */
    readonly wechatConfig: outputs.GetNotifierWechatConfig;
}

export function getNotifierOutput(args: GetNotifierOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNotifierResult> {
    return pulumi.output(args).apply(a => getNotifier(a, opts))
}

/**
 * A collection of arguments for invoking getNotifier.
 */
export interface GetNotifierOutputArgs {
    /**
     * The cluster id where create notifier (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * (Computed) Dingtalk config for notifier (list maxitems:1)
     */
    dingtalkConfig?: pulumi.Input<inputs.GetNotifierDingtalkConfigArgs>;
    /**
     * (Computed) MSTeams config for notifier (list maxitems:1)
     */
    msteamsConfig?: pulumi.Input<inputs.GetNotifierMsteamsConfigArgs>;
    /**
     * The name of the notifier (string)
     */
    name: pulumi.Input<string>;
}
