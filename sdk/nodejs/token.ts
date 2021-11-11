// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Token resource. This can be used to create Tokens for Rancher v2 provider user and retrieve their information.
 *
 * There are 2 kind of tokens:
 * - no scoped: valid for global system.
 * - scoped: valid for just a specific cluster (`clusterId` should be provided).
 *
 * Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Token scoped
 * const foo = new rancher2.Token("foo", {
 *     clusterId: "<cluster-id>",
 *     description: "foo token",
 *     ttl: 1200,
 * });
 * ```
 */
export class Token extends pulumi.CustomResource {
    /**
     * Get an existing Token resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenState, opts?: pulumi.CustomResourceOptions): Token {
        return new Token(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/token:Token';

    /**
     * Returns true if the given object is an instance of Token.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Token {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Token.__pulumiType;
    }

    /**
     * (Computed) Token access key part (string)
     */
    public /*out*/ readonly accessKey!: pulumi.Output<string>;
    /**
     * (Computed) Annotations of the token (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Cluster ID for scoped token (string)
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * Token description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * (Computed) Token is enabled (bool)
     */
    public /*out*/ readonly enabled!: pulumi.Output<boolean>;
    /**
     * (Computed) Token is expired (bool)
     */
    public /*out*/ readonly expired!: pulumi.Output<boolean>;
    /**
     * (Computed) Labels of the token (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) Token name (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Renew expired or disabled token
     */
    public readonly renew!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    public /*out*/ readonly secretKey!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * Token time to live in seconds. Default `0` (int)
     */
    public readonly ttl!: pulumi.Output<number | undefined>;
    /**
     * (Computed) Token user ID (string)
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;

    /**
     * Create a Token resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenArgs | TokenState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TokenState | undefined;
            inputs["accessKey"] = state ? state.accessKey : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["expired"] = state ? state.expired : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["renew"] = state ? state.renew : undefined;
            inputs["secretKey"] = state ? state.secretKey : undefined;
            inputs["token"] = state ? state.token : undefined;
            inputs["ttl"] = state ? state.ttl : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as TokenArgs | undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["renew"] = args ? args.renew : undefined;
            inputs["ttl"] = args ? args.ttl : undefined;
            inputs["accessKey"] = undefined /*out*/;
            inputs["enabled"] = undefined /*out*/;
            inputs["expired"] = undefined /*out*/;
            inputs["name"] = undefined /*out*/;
            inputs["secretKey"] = undefined /*out*/;
            inputs["token"] = undefined /*out*/;
            inputs["userId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Token.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Token resources.
 */
export interface TokenState {
    /**
     * (Computed) Token access key part (string)
     */
    accessKey?: pulumi.Input<string>;
    /**
     * (Computed) Annotations of the token (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster ID for scoped token (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Token description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (Computed) Token is enabled (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * (Computed) Token is expired (bool)
     */
    expired?: pulumi.Input<boolean>;
    /**
     * (Computed) Labels of the token (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) Token name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * (Computed/Sensitive) Token secret key part (string)
     */
    secretKey?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) Token value (string)
     */
    token?: pulumi.Input<string>;
    /**
     * Token time to live in seconds. Default `0` (int)
     */
    ttl?: pulumi.Input<number>;
    /**
     * (Computed) Token user ID (string)
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Token resource.
 */
export interface TokenArgs {
    /**
     * (Computed) Annotations of the token (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster ID for scoped token (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Token description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (Computed) Labels of the token (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Renew expired or disabled token
     */
    renew?: pulumi.Input<boolean>;
    /**
     * Token time to live in seconds. Default `0` (int)
     */
    ttl?: pulumi.Input<number>;
}
