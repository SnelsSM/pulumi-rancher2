// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher V2 Global DNS Provider data source. Use this data source to retrieve information about a Rancher v2 global DNS provider
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getGlobalDnsProvider({
 *     name: "foo",
 * });
 * ```
 */
export function getGlobalDnsProvider(args: GetGlobalDnsProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalDnsProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getGlobalDnsProvider:getGlobalDnsProvider", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalDnsProvider.
 */
export interface GetGlobalDnsProviderArgs {
    /**
     * The name of the global DNS provider (string)
     */
    name: string;
}

/**
 * A collection of values returned by getGlobalDnsProvider.
 */
export interface GetGlobalDnsProviderResult {
    readonly alidnsConfig: outputs.GetGlobalDnsProviderAlidnsConfig;
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: string};
    readonly cloudflareConfig: outputs.GetGlobalDnsProviderCloudflareConfig;
    readonly dnsProvider: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: string};
    /**
     * (Computed) The name of the global DNS provider (string)
     */
    readonly name: string;
    readonly rootDomain: string;
    readonly route53Config: outputs.GetGlobalDnsProviderRoute53Config;
}
/**
 * Provides a Rancher V2 Global DNS Provider data source. Use this data source to retrieve information about a Rancher v2 global DNS provider
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getGlobalDnsProvider({
 *     name: "foo",
 * });
 * ```
 */
export function getGlobalDnsProviderOutput(args: GetGlobalDnsProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGlobalDnsProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("rancher2:index/getGlobalDnsProvider:getGlobalDnsProvider", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalDnsProvider.
 */
export interface GetGlobalDnsProviderOutputArgs {
    /**
     * The name of the global DNS provider (string)
     */
    name: pulumi.Input<string>;
}
