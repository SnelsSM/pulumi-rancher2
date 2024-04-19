// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Global Role Binding using user_id
 * const foo = new rancher2.GlobalRoleBinding("foo", {
 *     name: "foo",
 *     globalRoleId: "admin",
 *     userId: "user-XXXXX",
 * });
 * // Create a new rancher2 Global Role Binding using group_principal_id
 * const foo2 = new rancher2.GlobalRoleBinding("foo2", {
 *     name: "foo2",
 *     globalRoleId: "admin",
 *     groupPrincipalId: "local://g-XXXXX",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Global Role Bindings can be imported using the Rancher Global Role Binding ID
 *
 * ```sh
 * $ pulumi import rancher2:index/globalRoleBinding:GlobalRoleBinding foo &lt;GLOBAL_ROLE_BINDING_ID&gt;
 * ```
 */
export class GlobalRoleBinding extends pulumi.CustomResource {
    /**
     * Get an existing GlobalRoleBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalRoleBindingState, opts?: pulumi.CustomResourceOptions): GlobalRoleBinding {
        return new GlobalRoleBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/globalRoleBinding:GlobalRoleBinding';

    /**
     * Returns true if the given object is an instance of GlobalRoleBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalRoleBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalRoleBinding.__pulumiType;
    }

    /**
     * Annotations for global role binding (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The role id from create global role binding (string)
     */
    public readonly globalRoleId!: pulumi.Output<string>;
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     */
    public readonly groupPrincipalId!: pulumi.Output<string>;
    /**
     * Labels for global role binding (map)
     *
     * **Note:** user `userId` OR group `groupPrincipalId` must be defined
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the global role binding (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The user ID to assign global role binding (string)
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a GlobalRoleBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalRoleBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalRoleBindingArgs | GlobalRoleBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalRoleBindingState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["globalRoleId"] = state ? state.globalRoleId : undefined;
            resourceInputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as GlobalRoleBindingArgs | undefined;
            if ((!args || args.globalRoleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'globalRoleId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["globalRoleId"] = args ? args.globalRoleId : undefined;
            resourceInputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalRoleBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalRoleBinding resources.
 */
export interface GlobalRoleBindingState {
    /**
     * Annotations for global role binding (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The role id from create global role binding (string)
     */
    globalRoleId?: pulumi.Input<string>;
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for global role binding (map)
     *
     * **Note:** user `userId` OR group `groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the global role binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The user ID to assign global role binding (string)
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlobalRoleBinding resource.
 */
export interface GlobalRoleBindingArgs {
    /**
     * Annotations for global role binding (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The role id from create global role binding (string)
     */
    globalRoleId: pulumi.Input<string>;
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for global role binding (map)
     *
     * **Note:** user `userId` OR group `groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the global role binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The user ID to assign global role binding (string)
     */
    userId?: pulumi.Input<string>;
}
