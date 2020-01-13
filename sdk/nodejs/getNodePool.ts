// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Node Pool resource.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2_cluster_foo_custom.id.apply(id => rancher2.getNodePool({
 *     clusterId: id,
 *     name: "foo",
 * }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/node_pool.html.markdown.
 */
export function getNodePool(args: GetNodePoolArgs, opts?: pulumi.InvokeOptions): Promise<GetNodePoolResult> & GetNodePoolResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetNodePoolResult> = pulumi.runtime.invoke("rancher2:index/getNodePool:getNodePool", {
        "clusterId": args.clusterId,
        "name": args.name,
        "nodeTemplateId": args.nodeTemplateId,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getNodePool.
 */
export interface GetNodePoolArgs {
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    readonly clusterId: string;
    /**
     * The name of the Node Pool (string)
     */
    readonly name: string;
    /**
     * The Node Template ID to use for node creation (string)
     */
    readonly nodeTemplateId?: string;
}

/**
 * A collection of values returned by getNodePool.
 */
export interface GetNodePoolResult {
    /**
     * (Computed) Annotations for Node Pool object (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) RKE control plane role for created nodes (bool)
     */
    readonly controlPlane: boolean;
    /**
     * (Computed) RKE etcd role for created nodes (bool)
     */
    readonly etcd: boolean;
    /**
     * (Computed) The prefix for created nodes of the Node Pool (string)
     */
    readonly hostnamePrefix: string;
    /**
     * (Computed) Labels for Node Pool object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly nodeTemplateId: string;
    /**
     * (Computed) The number of nodes to create on Node Pool (int)
     */
    readonly quantity: number;
    /**
     * (Computed) RKE role role for created nodes (bool)
     */
    readonly worker: boolean;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
