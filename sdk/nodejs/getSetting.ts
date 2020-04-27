// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 setting.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const serverImage = pulumi.output(rancher2.getSetting({
 *     name: "server-image",
 * }, { async: true }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/setting.html.markdown.
 */
export function getSetting(args: GetSettingArgs, opts?: pulumi.InvokeOptions): Promise<GetSettingResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getSetting:getSetting", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSetting.
 */
export interface GetSettingArgs {
    /**
     * The setting name.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getSetting.
 */
export interface GetSettingResult {
    readonly name: string;
    /**
     * the settting's value.
     */
    readonly value: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
