// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 multi cluster app.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2.getMultiClusterApp({
 *     name: "foo",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/multiClusterApp.html.markdown.
 */
export function getMultiClusterApp(args: GetMultiClusterAppArgs, opts?: pulumi.InvokeOptions): Promise<GetMultiClusterAppResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getMultiClusterApp:getMultiClusterApp", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getMultiClusterApp.
 */
export interface GetMultiClusterAppArgs {
    /**
     * The multi cluster app name (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getMultiClusterApp.
 */
export interface GetMultiClusterAppResult {
    /**
     * (Computed) Annotations for multi cluster app object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) The multi cluster app answers (list)
     */
    readonly answers: outputs.GetMultiClusterAppAnswer[];
    /**
     * (Computed) The multi cluster app catalog name (string)
     */
    readonly catalogName: string;
    /**
     * (Computed) Labels for multi cluster app object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) The multi cluster app members (list)
     */
    readonly members: outputs.GetMultiClusterAppMember[];
    readonly name: string;
    /**
     * (Computed) The multi cluster app revision history limit (int)
     */
    readonly revisionHistoryLimit: number;
    /**
     * (Computed) Current revision id for the multi cluster app (string)
     */
    readonly revisionId: string;
    /**
     * (Computed) The multi cluster app roles (list)
     */
    readonly roles: string[];
    /**
     * (Computed) The multi cluster app target projects (list)
     */
    readonly targets: outputs.GetMultiClusterAppTarget[];
    /**
     * (Computed) The multi cluster app template name (string)
     */
    readonly templateName: string;
    /**
     * (Computed) The multi cluster app template version (string)
     */
    readonly templateVersion: string;
    /**
     * (Computed) The multi cluster app template version ID (string)
     */
    readonly templateVersionId: string;
    /**
     * (Computed) The multi cluster app upgrade strategy (list)
     */
    readonly upgradeStrategies: outputs.GetMultiClusterAppUpgradeStrategy[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
