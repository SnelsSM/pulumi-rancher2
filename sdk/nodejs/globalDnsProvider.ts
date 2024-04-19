// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global DNS Provider - alidns
 * const foo = new rancher2.GlobalDnsProvider("foo", {
 *     name: "foo",
 *     rootDomain: "example.com",
 *     alidnsConfig: {
 *         accessKey: "YYYYYYYYYYYYYYYYYYYY",
 *         secretKey: "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global DNS Provider - cloudflare
 * const foo = new rancher2.GlobalDnsProvider("foo", {
 *     name: "foo",
 *     rootDomain: "example.com",
 *     cloudflareConfig: {
 *         apiEmail: "test@test.local",
 *         apiKey: "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
 *         proxySetting: true,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global DNS Provider - route53
 * const foo = new rancher2.GlobalDnsProvider("foo", {
 *     name: "foo",
 *     rootDomain: "example.com",
 *     route53Config: {
 *         accessKey: "YYYYYYYYYYYYYYYYYYYY",
 *         secretKey: "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
 *         zoneType: "private",
 *         region: "us-east-1",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Global DNS Providers can be imported using the Rancher Global DNS Provider ID
 *
 * ```sh
 * $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo <global_dns_provider_id>
 * ```
 */
export class GlobalDnsProvider extends pulumi.CustomResource {
    /**
     * Get an existing GlobalDnsProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalDnsProviderState, opts?: pulumi.CustomResourceOptions): GlobalDnsProvider {
        return new GlobalDnsProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/globalDnsProvider:GlobalDnsProvider';

    /**
     * Returns true if the given object is an instance of GlobalDnsProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalDnsProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalDnsProvider.__pulumiType;
    }

    public readonly alidnsConfig!: pulumi.Output<outputs.GlobalDnsProviderAlidnsConfig | undefined>;
    /**
     * Annotations for Global DNS Provider (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    public readonly cloudflareConfig!: pulumi.Output<outputs.GlobalDnsProviderCloudflareConfig | undefined>;
    /**
     * (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
     */
    public /*out*/ readonly dnsProvider!: pulumi.Output<string>;
    /**
     * Labels for Global DNS Provider (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the Global DNS Provider (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The user ID to assign Global DNS Provider (string)
     */
    public readonly rootDomain!: pulumi.Output<string>;
    public readonly route53Config!: pulumi.Output<outputs.GlobalDnsProviderRoute53Config | undefined>;

    /**
     * Create a GlobalDnsProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalDnsProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalDnsProviderArgs | GlobalDnsProviderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalDnsProviderState | undefined;
            resourceInputs["alidnsConfig"] = state ? state.alidnsConfig : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["cloudflareConfig"] = state ? state.cloudflareConfig : undefined;
            resourceInputs["dnsProvider"] = state ? state.dnsProvider : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rootDomain"] = state ? state.rootDomain : undefined;
            resourceInputs["route53Config"] = state ? state.route53Config : undefined;
        } else {
            const args = argsOrState as GlobalDnsProviderArgs | undefined;
            if ((!args || args.rootDomain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rootDomain'");
            }
            resourceInputs["alidnsConfig"] = args ? args.alidnsConfig : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["cloudflareConfig"] = args ? args.cloudflareConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rootDomain"] = args ? args.rootDomain : undefined;
            resourceInputs["route53Config"] = args ? args.route53Config : undefined;
            resourceInputs["dnsProvider"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalDnsProvider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalDnsProvider resources.
 */
export interface GlobalDnsProviderState {
    alidnsConfig?: pulumi.Input<inputs.GlobalDnsProviderAlidnsConfig>;
    /**
     * Annotations for Global DNS Provider (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    cloudflareConfig?: pulumi.Input<inputs.GlobalDnsProviderCloudflareConfig>;
    /**
     * (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
     */
    dnsProvider?: pulumi.Input<string>;
    /**
     * Labels for Global DNS Provider (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Global DNS Provider (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The user ID to assign Global DNS Provider (string)
     */
    rootDomain?: pulumi.Input<string>;
    route53Config?: pulumi.Input<inputs.GlobalDnsProviderRoute53Config>;
}

/**
 * The set of arguments for constructing a GlobalDnsProvider resource.
 */
export interface GlobalDnsProviderArgs {
    alidnsConfig?: pulumi.Input<inputs.GlobalDnsProviderAlidnsConfig>;
    /**
     * Annotations for Global DNS Provider (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    cloudflareConfig?: pulumi.Input<inputs.GlobalDnsProviderCloudflareConfig>;
    /**
     * Labels for Global DNS Provider (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Global DNS Provider (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The user ID to assign Global DNS Provider (string)
     */
    rootDomain: pulumi.Input<string>;
    route53Config?: pulumi.Input<inputs.GlobalDnsProviderRoute53Config>;
}
