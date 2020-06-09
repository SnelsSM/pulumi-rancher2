// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getClusterScan(args: GetClusterScanArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterScanResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterScan:getClusterScan", {
        "clusterId": args.clusterId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterScan.
 */
export interface GetClusterScanArgs {
    readonly clusterId: string;
    readonly name?: string;
}

/**
 * A collection of values returned by getClusterScan.
 */
export interface GetClusterScanResult {
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly runType: string;
    readonly scanConfig: outputs.GetClusterScanScanConfig;
    readonly scanType: string;
    readonly status: string;
}
