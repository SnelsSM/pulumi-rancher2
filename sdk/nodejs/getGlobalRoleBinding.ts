// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 global role binding.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2.getGlobalRoleBinding({
 *     globalRoleId: "fooId",
 *     name: "foo",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/globalRole.html.markdown.
 */
export function getGlobalRoleBinding(args: GetGlobalRoleBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalRoleBindingResult> & GetGlobalRoleBindingResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetGlobalRoleBindingResult> = pulumi.runtime.invoke("rancher2:index/getGlobalRoleBinding:getGlobalRoleBinding", {
        "globalRoleId": args.globalRoleId,
        "name": args.name,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getGlobalRoleBinding.
 */
export interface GetGlobalRoleBindingArgs {
    /**
     * The global role id (string)
     */
    readonly globalRoleId?: string;
    /**
     * The name of the global role binding (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getGlobalRoleBinding.
 */
export interface GetGlobalRoleBindingResult {
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: any};
    readonly globalRoleId: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) The user ID to assign global role binding (string)
     */
    readonly userId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
