// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher V2 Global DNS resource. This can be used to create Global DNS records for Rancher V2.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global DNS Provider
 * const fooGlobalDnsProvider = new rancher2.GlobalDnsProvider("fooGlobalDnsProvider", {
 *     rootDomain: "example.com",
 *     route53Config: {
 *         accessKey: "YYYYYYYYYYYYYYYYYYYY",
 *         secretKey: "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
 *         zoneType: "private",
 *         region: "us-east-1",
 *     },
 * });
 * // Create a new rancher2 Global DNS using project IDs
 * const fooGlobalDns = new rancher2.GlobalDns("fooGlobalDns", {
 *     fqdn: "foo.example.com",
 *     providerId: fooGlobalDnsProvider.id,
 *     projectIds: [
 *         "project1",
 *         "project2",
 *     ],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global DNS Provider
 * const fooGlobalDnsProvider = new rancher2.GlobalDnsProvider("fooGlobalDnsProvider", {
 *     rootDomain: "example.com",
 *     route53Config: {
 *         accessKey: "YYYYYYYYYYYYYYYYYYYY",
 *         secretKey: "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
 *         zoneType: "private",
 *         region: "us-east-1",
 *     },
 * });
 * // Create a new rancher2 Global DNS using MultiClusterApp ID
 * const fooGlobalDns = new rancher2.GlobalDns("fooGlobalDns", {
 *     fqdn: "foo.example.com",
 *     providerId: fooGlobalDnsProvider.id,
 *     multiClusterAppId: "<MCA_ID>",
 * });
 * ```
 *
 * ## Import
 *
 * Global DNS Entry can be imported using the Rancher Global DNS ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/globalDns:GlobalDns foo <global_dns_id>
 * ```
 */
export class GlobalDns extends pulumi.CustomResource {
    /**
     * Get an existing GlobalDns resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalDnsState, opts?: pulumi.CustomResourceOptions): GlobalDns {
        return new GlobalDns(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/globalDns:GlobalDns';

    /**
     * Returns true if the given object is an instance of GlobalDns.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalDns {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalDns.__pulumiType;
    }

    /**
     * Annotations for Global DNS (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The Global DNS record (string)
     */
    public readonly fqdn!: pulumi.Output<string>;
    /**
     * Labels for Global DNS (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
     */
    public readonly multiClusterAppId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Global DNS (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
     */
    public readonly projectIds!: pulumi.Output<string[] | undefined>;
    /**
     * The Global DNS provider ID to use (string)
     */
    public readonly providerId!: pulumi.Output<string>;
    /**
     * TTL in seconds for DNS record. Default: `300` (int)
     */
    public readonly ttl!: pulumi.Output<number | undefined>;

    /**
     * Create a GlobalDns resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalDnsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalDnsArgs | GlobalDnsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalDnsState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["fqdn"] = state ? state.fqdn : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["multiClusterAppId"] = state ? state.multiClusterAppId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectIds"] = state ? state.projectIds : undefined;
            resourceInputs["providerId"] = state ? state.providerId : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as GlobalDnsArgs | undefined;
            if ((!args || args.fqdn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fqdn'");
            }
            if ((!args || args.providerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["fqdn"] = args ? args.fqdn : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["multiClusterAppId"] = args ? args.multiClusterAppId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectIds"] = args ? args.projectIds : undefined;
            resourceInputs["providerId"] = args ? args.providerId : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalDns.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalDns resources.
 */
export interface GlobalDnsState {
    /**
     * Annotations for Global DNS (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The Global DNS record (string)
     */
    fqdn?: pulumi.Input<string>;
    /**
     * Labels for Global DNS (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
     */
    multiClusterAppId?: pulumi.Input<string>;
    /**
     * The name of the Global DNS (string)
     */
    name?: pulumi.Input<string>;
    /**
     * A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
     */
    projectIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Global DNS provider ID to use (string)
     */
    providerId?: pulumi.Input<string>;
    /**
     * TTL in seconds for DNS record. Default: `300` (int)
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a GlobalDns resource.
 */
export interface GlobalDnsArgs {
    /**
     * Annotations for Global DNS (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The Global DNS record (string)
     */
    fqdn: pulumi.Input<string>;
    /**
     * Labels for Global DNS (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
     */
    multiClusterAppId?: pulumi.Input<string>;
    /**
     * The name of the Global DNS (string)
     */
    name?: pulumi.Input<string>;
    /**
     * A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
     */
    projectIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Global DNS provider ID to use (string)
     */
    providerId: pulumi.Input<string>;
    /**
     * TTL in seconds for DNS record. Default: `300` (int)
     */
    ttl?: pulumi.Input<number>;
}
