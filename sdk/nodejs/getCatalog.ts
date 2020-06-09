// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 catalog.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const library = pulumi.output(rancher2.getCatalog({
 *     name: "catalog",
 * }, { async: true }));
 * ```
 */
export function getCatalog(args: GetCatalogArgs, opts?: pulumi.InvokeOptions): Promise<GetCatalogResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getCatalog:getCatalog", {
        "name": args.name,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalog.
 */
export interface GetCatalogArgs {
    /**
     * The catalog name.
     */
    readonly name: string;
    /**
     * The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
     */
    readonly scope?: string;
}

/**
 * A collection of values returned by getCatalog.
 */
export interface GetCatalogResult {
    /**
     * (Computed) Annotations for the catalog (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) The branch of the catalog repo to use (string)
     */
    readonly branch: string;
    /**
     * (Computed) The cluster id of the catalog (string)
     */
    readonly clusterId: string;
    /**
     * (Computed) A catalog description (string)
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) The kind of the catalog. Just helm by the moment (string)
     */
    readonly kind: string;
    /**
     * (Computed) Labels for the catalog (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed/Sensitive) The password to access the catalog if needed (string)
     */
    readonly password: string;
    /**
     * (Computed) The project id of the catalog (string)
     */
    readonly projectId: string;
    readonly scope?: string;
    /**
     * (Computed) The url of the catalog repo (string)
     */
    readonly url: string;
    /**
     * (Computed/Sensitive) The username to access the catalog if needed (string)
     */
    readonly username: string;
    /**
     * (Computed) Helm version for the catalog (string)
     */
    readonly version: string;
}
