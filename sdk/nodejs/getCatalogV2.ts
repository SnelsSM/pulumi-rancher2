// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher2 catalog v2. Catalog v2 resource is available at Rancher v2.5.x and above.
 */
export function getCatalogV2(args: GetCatalogV2Args, opts?: pulumi.InvokeOptions): Promise<GetCatalogV2Result> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getCatalogV2:getCatalogV2", {
        "clusterId": args.clusterId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalogV2.
 */
export interface GetCatalogV2Args {
    /**
     * The cluster id of the catalog V2 (string)
     */
    readonly clusterId: string;
    /**
     * The name of the catalog v2 (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getCatalogV2.
 */
export interface GetCatalogV2Result {
    /**
     * (Computed) Annotations for the catalog v2 (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) PEM encoded CA bundle which will be used to validate the repo's certificate (string)
     */
    readonly caBundle: string;
    readonly clusterId: string;
    /**
     * (Computed) If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     */
    readonly enabled: boolean;
    /**
     * (Computed) Git Repository branch containing Helm chart definitions. Default `master` (string)
     */
    readonly gitBranch: string;
    /**
     * (Computed) The url of the catalog v2 repo (string)
     */
    readonly gitRepo: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Use insecure HTTPS to download the repo's index. Default: `false` (bool)
     */
    readonly insecure: boolean;
    /**
     * (Computed) Labels for the catalog v2 (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) The k8s resource version (string)
     */
    readonly resourceVersion: string;
    /**
     * (Computed) K8s secret name to be used to connect to the repo (string)
     */
    readonly secretName: string;
    /**
     * (Computed) K8s secret namespace (string)
     */
    readonly secretNamespace: string;
    /**
     * (Computed) K8s service account used to deploy charts instead of the end users credentials (string)
     */
    readonly serviceAccount: string;
    /**
     * (Computed) The username to access the catalog if needed (string)
     */
    readonly serviceAccountNamespace: string;
    /**
     * (Computed) URL to an index generated by Helm (string)
     */
    readonly url: string;
}
