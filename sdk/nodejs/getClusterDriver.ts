// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Cluster Driver resource.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2.getClusterDriver({
 *     name: "foo",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterDriver.html.markdown.
 */
export function getClusterDriver(args: GetClusterDriverArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterDriverResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterDriver:getClusterDriver", {
        "name": args.name,
        "url": args.url,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterDriver.
 */
export interface GetClusterDriverArgs {
    /**
     * Name of the cluster driver (string)
     */
    readonly name: string;
    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     */
    readonly url?: string;
}

/**
 * A collection of values returned by getClusterDriver.
 */
export interface GetClusterDriverResult {
    /**
     * (Computed) Specify if the cluster driver state (bool)
     */
    readonly active: boolean;
    /**
     * (Computed) Actual url of the cluster driver (string)
     */
    readonly actualUrl: string;
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Specify whether the cluster driver is an internal cluster driver or not (bool)
     */
    readonly builtin: boolean;
    /**
     * (Computed) Verify that the downloaded driver matches the expected checksum (string)
     */
    readonly checksum: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) The URL to load for customized Add Clusters screen for this driver (string)
     */
    readonly uiUrl: string;
    readonly url: string;
    /**
     * (Computed) Domains to whitelist for the ui (list)
     */
    readonly whitelistDomains: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
