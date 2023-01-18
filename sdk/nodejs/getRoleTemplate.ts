// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 role template resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getRoleTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getRoleTemplate(args: GetRoleTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleTemplateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getRoleTemplate:getRoleTemplate", {
        "context": args.context,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoleTemplate.
 */
export interface GetRoleTemplateArgs {
    /**
     * Role template context. `cluster` and `project` values are supported (string)
     */
    context?: string;
    /**
     * The name of the Role Template (string)
     */
    name: string;
}

/**
 * A collection of values returned by getRoleTemplate.
 */
export interface GetRoleTemplateResult {
    /**
     * (Computed) Administrative role template (bool)
     */
    readonly administrative: boolean;
    /**
     * (Computed) Annotations for role template object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Builtin role template (string)
     */
    readonly builtin: boolean;
    readonly context: string;
    /**
     * (Computed) Default role template for new created cluster or project (bool)
     */
    readonly defaultRole: boolean;
    /**
     * (Computed) Role template description (string)
     */
    readonly description: string;
    /**
     * (Computed) External role template (bool)
     */
    readonly external: boolean;
    /**
     * (Computed) Hidden role template (bool)
     */
    readonly hidden: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for role template object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) Locked role template (bool)
     */
    readonly locked: boolean;
    readonly name: string;
    /**
     * (Computed) Inherit role template IDs (list)
     */
    readonly roleTemplateIds: string[];
    /**
     * (Computed) Role template policy rules (list)
     */
    readonly rules: outputs.GetRoleTemplateRule[];
}
/**
 * Use this data source to retrieve information about a Rancher v2 role template resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getRoleTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getRoleTemplateOutput(args: GetRoleTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRoleTemplateResult> {
    return pulumi.output(args).apply((a: any) => getRoleTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getRoleTemplate.
 */
export interface GetRoleTemplateOutputArgs {
    /**
     * Role template context. `cluster` and `project` values are supported (string)
     */
    context?: pulumi.Input<string>;
    /**
     * The name of the Role Template (string)
     */
    name: pulumi.Input<string>;
}
