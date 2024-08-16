// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Secret resource. This can be used to create secrets for Rancher v2 environments and retrieve their information.
 *
 * Depending of the availability, there are 2 types of Rancher v2 secrets:
 * - Project secret: Available to all namespaces in the `projectId`
 * - Namespaced secret: Available to just `namespaceId` in the `projectId`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * import * as std from "@pulumi/std";
 *
 * // Create a new rancher2 Project Secret
 * const foo = new rancher2.Secret("foo", {
 *     name: "foo",
 *     description: "Terraform secret foo",
 *     projectId: "<project_id>",
 *     data: {
 *         address: std.base64encode({
 *             input: "test.io",
 *         }).then(invoke => invoke.result),
 *         username: std.base64encode({
 *             input: "user2",
 *         }).then(invoke => invoke.result),
 *         password: std.base64encode({
 *             input: "pass",
 *         }).then(invoke => invoke.result),
 *     },
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * import * as std from "@pulumi/std";
 *
 * // Create a new rancher2 Namespaced Secret
 * const foo = new rancher2.Secret("foo", {
 *     name: "foo",
 *     description: "Terraform secret foo",
 *     projectId: "<project_id>",
 *     namespaceId: "<namespace_id>",
 *     data: {
 *         address: std.base64encode({
 *             input: "test.io",
 *         }).then(invoke => invoke.result),
 *         username: std.base64encode({
 *             input: "user2",
 *         }).then(invoke => invoke.result),
 *         password: std.base64encode({
 *             input: "pass",
 *         }).then(invoke => invoke.result),
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Secrets can be imported using the secret ID in the format `<namespace_id>.<project_id>.<secret_id>`
 *
 * ```sh
 * $ pulumi import rancher2:index/secret:Secret foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;secret_id&gt;
 * ```
 * `<namespace_id>` is optional, just needed for namespaced secret.
 */
export class Secret extends pulumi.CustomResource {
    /**
     * Get an existing Secret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretState, opts?: pulumi.CustomResourceOptions): Secret {
        return new Secret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/secret:Secret';

    /**
     * Returns true if the given object is an instance of Secret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Secret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Secret.__pulumiType;
    }

    /**
     * Annotations for secret object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Secret key/value data. Base64 encoding required for values (map)
     */
    public readonly data!: pulumi.Output<{[key: string]: string}>;
    /**
     * A secret description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels for secret object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the secret (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * The project id where to assign the secret (string)
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a Secret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretArgs | SecretState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["data"] = state ? state.data : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as SecretArgs | undefined;
            if ((!args || args.data === undefined) && !opts.urn) {
                throw new Error("Missing required property 'data'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["data"] = args?.data ? pulumi.secret(args.data) : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["data"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Secret.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Secret resources.
 */
export interface SecretState {
    /**
     * Annotations for secret object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Secret key/value data. Base64 encoding required for values (map)
     */
    data?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A secret description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for secret object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the secret (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the secret (string)
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Secret resource.
 */
export interface SecretArgs {
    /**
     * Annotations for secret object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Secret key/value data. Base64 encoding required for values (map)
     */
    data: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A secret description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for secret object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the secret (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The project id where to assign the secret (string)
     */
    projectId: pulumi.Input<string>;
}
