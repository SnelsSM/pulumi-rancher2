// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 User resource. This can be used to create Users for Rancher v2 environments and retrieve their information.
 *
 * When a Rancher User is created, it doesn't have a global role binding. At least, `user-base` global role binding in needed in order to enable user login.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 User
 * const fooUser = new rancher2.User("fooUser", {
 *     username: "foo",
 *     password: "changeme",
 *     enabled: true,
 * });
 * // Create a new rancher2 global_role_binding for User
 * const fooGlobalRoleBinding = new rancher2.GlobalRoleBinding("fooGlobalRoleBinding", {
 *     globalRoleId: "user-base",
 *     userId: fooUser.id,
 * });
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Annotations for global role binding (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for global role binding (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The user full name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The user password (string)
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * (Computed) The user principal IDs (list)
     */
    public /*out*/ readonly principalIds!: pulumi.Output<string[]>;
    /**
     * The user username (string)
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as UserState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["principalIds"] = state ? state.principalIds : undefined;
            inputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if (!args || args.password === undefined) {
                throw new Error("Missing required property 'password'");
            }
            if (!args || args.username === undefined) {
                throw new Error("Missing required property 'username'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["username"] = args ? args.username : undefined;
            inputs["principalIds"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(User.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Annotations for global role binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Labels for global role binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The user full name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user password (string)
     */
    readonly password?: pulumi.Input<string>;
    /**
     * (Computed) The user principal IDs (list)
     */
    readonly principalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The user username (string)
     */
    readonly username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * Annotations for global role binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Labels for global role binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The user full name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user password (string)
     */
    readonly password: pulumi.Input<string>;
    /**
     * The user username (string)
     */
    readonly username: pulumi.Input<string>;
}
