// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 cluster role template binding.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getClusterRoleTemplateBinding({
 *     clusterId: "foo_id",
 *     name: "foo",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getClusterRoleTemplateBinding(args: GetClusterRoleTemplateBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterRoleTemplateBindingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding", {
        "clusterId": args.clusterId,
        "name": args.name,
        "roleTemplateId": args.roleTemplateId,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterRoleTemplateBinding.
 */
export interface GetClusterRoleTemplateBindingArgs {
    /**
     * The cluster id where bind cluster role template (string)
     */
    clusterId: string;
    /**
     * The name of the cluster role template binding (string)
     */
    name: string;
    /**
     * The role template id from create cluster role template binding (string)
     */
    roleTemplateId?: string;
}

/**
 * A collection of values returned by getClusterRoleTemplateBinding.
 */
export interface GetClusterRoleTemplateBindingResult {
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) The group ID to assign cluster role template binding (string)
     */
    readonly groupId: string;
    /**
     * (Computed) The groupPrincipal ID to assign cluster role template binding (string)
     */
    readonly groupPrincipalId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly roleTemplateId: string;
    /**
     * (Computed) The user ID to assign cluster role template binding (string)
     */
    readonly userId: string;
    /**
     * (Computed) The userPrincipal ID to assign cluster role template binding (string)
     */
    readonly userPrincipalId: string;
}
/**
 * Use this data source to retrieve information about a Rancher v2 cluster role template binding.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getClusterRoleTemplateBinding({
 *     clusterId: "foo_id",
 *     name: "foo",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getClusterRoleTemplateBindingOutput(args: GetClusterRoleTemplateBindingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterRoleTemplateBindingResult> {
    return pulumi.output(args).apply((a: any) => getClusterRoleTemplateBinding(a, opts))
}

/**
 * A collection of arguments for invoking getClusterRoleTemplateBinding.
 */
export interface GetClusterRoleTemplateBindingOutputArgs {
    /**
     * The cluster id where bind cluster role template (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the cluster role template binding (string)
     */
    name: pulumi.Input<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    roleTemplateId?: pulumi.Input<string>;
}
