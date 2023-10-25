// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 namespace.
 */
export function getNamespace(args: GetNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetNamespaceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getNamespace:getNamespace", {
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceArgs {
    /**
     * The name of the namespace (string)
     */
    name: string;
    /**
     * The project id where namespace is assigned (string)
     */
    projectId: string;
}

/**
 * A collection of values returned by getNamespace.
 */
export interface GetNamespaceResult {
    /**
     * (Computed) Annotations for Node Pool object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Default containers resource limits on namespace (List maxitem:1)
     */
    readonly containerResourceLimit: outputs.GetNamespaceContainerResourceLimit;
    /**
     * (Computed) A namespace description (string)
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for Node Pool object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly projectId: string;
    /**
     * (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     */
    readonly resourceQuota: outputs.GetNamespaceResourceQuota;
}
/**
 * Use this data source to retrieve information about a Rancher v2 namespace.
 */
export function getNamespaceOutput(args: GetNamespaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNamespaceResult> {
    return pulumi.output(args).apply((a: any) => getNamespace(a, opts))
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceOutputArgs {
    /**
     * The name of the namespace (string)
     */
    name: pulumi.Input<string>;
    /**
     * The project id where namespace is assigned (string)
     */
    projectId: pulumi.Input<string>;
}
