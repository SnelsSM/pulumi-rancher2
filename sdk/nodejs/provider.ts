// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the rancher2 package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'rancher2';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * API Key used to authenticate with the rancher server
     */
    public readonly accessKey!: pulumi.Output<string | undefined>;
    /**
     * The URL to the rancher API
     */
    public readonly apiUrl!: pulumi.Output<string>;
    /**
     * CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
     */
    public readonly caCerts!: pulumi.Output<string | undefined>;
    /**
     * API secret used to authenticate with the rancher server
     */
    public readonly secretKey!: pulumi.Output<string | undefined>;
    /**
     * Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
     */
    public readonly timeout!: pulumi.Output<string | undefined>;
    /**
     * API token used to authenticate with the rancher server
     */
    public readonly tokenKey!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            if ((!args || args.apiUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiUrl'");
            }
            resourceInputs["accessKey"] = args?.accessKey ? pulumi.secret(args.accessKey) : undefined;
            resourceInputs["apiUrl"] = args ? args.apiUrl : undefined;
            resourceInputs["bootstrap"] = pulumi.output((args ? args.bootstrap : undefined) ?? (utilities.getEnvBoolean("RANCHER_BOOTSTRAP") || false)).apply(JSON.stringify);
            resourceInputs["caCerts"] = args ? args.caCerts : undefined;
            resourceInputs["insecure"] = pulumi.output((args ? args.insecure : undefined) ?? (utilities.getEnvBoolean("RANCHER_INSECURE") || false)).apply(JSON.stringify);
            resourceInputs["retries"] = pulumi.output(args ? args.retries : undefined).apply(JSON.stringify);
            resourceInputs["secretKey"] = args?.secretKey ? pulumi.secret(args.secretKey) : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["tokenKey"] = args?.tokenKey ? pulumi.secret(args.tokenKey) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accessKey", "secretKey", "tokenKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * API Key used to authenticate with the rancher server
     */
    accessKey?: pulumi.Input<string>;
    /**
     * The URL to the rancher API
     */
    apiUrl: pulumi.Input<string>;
    /**
     * Bootstrap rancher server
     */
    bootstrap?: pulumi.Input<boolean>;
    /**
     * CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
     */
    caCerts?: pulumi.Input<string>;
    /**
     * Allow insecure connections to Rancher. Mandatory if self signed tls and not caCerts provided
     */
    insecure?: pulumi.Input<boolean>;
    /**
     * Rancher connection retries
     *
     * @deprecated Use timeout instead
     */
    retries?: pulumi.Input<number>;
    /**
     * API secret used to authenticate with the rancher server
     */
    secretKey?: pulumi.Input<string>;
    /**
     * Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
     */
    timeout?: pulumi.Input<string>;
    /**
     * API token used to authenticate with the rancher server
     */
    tokenKey?: pulumi.Input<string>;
}
