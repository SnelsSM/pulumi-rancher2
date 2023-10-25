// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 setting.
 */
export function getSetting(args: GetSettingArgs, opts?: pulumi.InvokeOptions): Promise<GetSettingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    name: string;
}

/**
 * A collection of values returned by getSetting.
 */
export interface GetSettingResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * the settting's value.
     */
    readonly value: string;
}
/**
 * Use this data source to retrieve information about a Rancher v2 setting.
 */
export function getSettingOutput(args: GetSettingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSettingResult> {
    return pulumi.output(args).apply((a: any) => getSetting(a, opts))
}

/**
 * A collection of arguments for invoking getSetting.
 */
export interface GetSettingOutputArgs {
    /**
     * The setting name.
     */
    name: pulumi.Input<string>;
}
