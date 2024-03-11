// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 secret.
 *
 * Depending of the availability, there are 2 types of Rancher v2 secrets:
 * - Project secret: Available to all namespaces in the `projectId`
 * - Namespaced secret: Available to just `namespaceId` in the `projectId`
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getSecret({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getSecret({
 *     name: "<name>",
 *     namespaceId: "<namespace_id>",
 *     projectId: "<project_id>",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSecret(args: GetSecretArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getSecret:getSecret", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecret.
 */
export interface GetSecretArgs {
    /**
     * The name of the secret (string)
     */
    name: string;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    namespaceId?: string;
    /**
     * The project id where to assign the secret (string)
     */
    projectId: string;
}

/**
 * A collection of values returned by getSecret.
 */
export interface GetSecretResult {
    /**
     * (Computed) Annotations for secret object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Secret key/value data. Base64 encoding required for values (map)
     */
    readonly data: {[key: string]: any};
    /**
     * (Computed) A secret description (string)
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for secret object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly namespaceId?: string;
    readonly projectId: string;
}
/**
 * Use this data source to retrieve information about a Rancher v2 secret.
 *
 * Depending of the availability, there are 2 types of Rancher v2 secrets:
 * - Project secret: Available to all namespaces in the `projectId`
 * - Namespaced secret: Available to just `namespaceId` in the `projectId`
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getSecret({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getSecret({
 *     name: "<name>",
 *     namespaceId: "<namespace_id>",
 *     projectId: "<project_id>",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSecretOutput(args: GetSecretOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecretResult> {
    return pulumi.output(args).apply((a: any) => getSecret(a, opts))
}

/**
 * A collection of arguments for invoking getSecret.
 */
export interface GetSecretOutputArgs {
    /**
     * The name of the secret (string)
     */
    name: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the secret (string)
     */
    projectId: pulumi.Input<string>;
}
