// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Cloud Credential.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const test = rancher2.getCloudCredential({
 *     name: "test",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/cloudCredential.html.markdown.
 */
export function getCloudCredential(args: GetCloudCredentialArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudCredentialResult> & GetCloudCredentialResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetCloudCredentialResult> = pulumi.runtime.invoke("rancher2:index/getCloudCredential:getCloudCredential", {
        "name": args.name,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getCloudCredential.
 */
export interface GetCloudCredentialArgs {
    /**
     * The Cloud Credential name.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getCloudCredential.
 */
export interface GetCloudCredentialResult {
    /**
     * (Computed) Annotations for the Cloud Credential (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Labels for the Cloud Credential (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
