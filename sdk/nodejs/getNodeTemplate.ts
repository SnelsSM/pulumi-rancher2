// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Node Template resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getNodeTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getNodeTemplate(args: GetNodeTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeTemplateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getNodeTemplate:getNodeTemplate", {
        "name": args.name,
        "useInternalIpAddress": args.useInternalIpAddress,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeTemplate.
 */
export interface GetNodeTemplateArgs {
    /**
     * The name of the Node Template (string)
     */
    name: string;
    /**
     * (Computed) Engine storage driver for the node template (bool)
     */
    useInternalIpAddress?: boolean;
}

/**
 * A collection of values returned by getNodeTemplate.
 */
export interface GetNodeTemplateResult {
    /**
     * (Computed) Annotations for Node Template object (map)
     */
    readonly annotations: {[key: string]: string};
    /**
     * (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    readonly cloudCredentialId: string;
    /**
     * (Computed) Description for the Node Template (string)
     */
    readonly description: string;
    /**
     * (Computed) The driver of the node template (string)
     */
    readonly driver: string;
    /**
     * (Computed) Engine environment for the node template (string)
     */
    readonly engineEnv: {[key: string]: string};
    /**
     * (Computed) Insecure registry for the node template (list)
     */
    readonly engineInsecureRegistries: string[];
    /**
     * (Computed) Docker engine install URL for the node template (string)
     */
    readonly engineInstallUrl: string;
    /**
     * (Computed) Engine label for the node template (string)
     */
    readonly engineLabel: {[key: string]: string};
    /**
     * (Computed) Engine options for the node template (map)
     */
    readonly engineOpt: {[key: string]: string};
    /**
     * (Computed) Engine registry mirror for the node template (list)
     */
    readonly engineRegistryMirrors: string[];
    /**
     * (Computed) Engine storage driver for the node template (string)
     */
    readonly engineStorageDriver: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for Node Template object (map)
     */
    readonly labels: {[key: string]: string};
    readonly name: string;
    /**
     * (Computed) Node taints (List)
     */
    readonly nodeTaints: outputs.GetNodeTemplateNodeTaint[];
    /**
     * (Computed) Engine storage driver for the node template (bool)
     */
    readonly useInternalIpAddress?: boolean;
}
/**
 * Use this data source to retrieve information about a Rancher v2 Node Template resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getNodeTemplate({
 *     name: "foo",
 * });
 * ```
 */
export function getNodeTemplateOutput(args: GetNodeTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNodeTemplateResult> {
    return pulumi.output(args).apply((a: any) => getNodeTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getNodeTemplate.
 */
export interface GetNodeTemplateOutputArgs {
    /**
     * The name of the Node Template (string)
     */
    name: pulumi.Input<string>;
    /**
     * (Computed) Engine storage driver for the node template (bool)
     */
    useInternalIpAddress?: pulumi.Input<boolean>;
}
