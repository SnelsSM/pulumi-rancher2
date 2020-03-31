// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new rancher2 Global Role Binding using userId
 * const foo = new rancher2.GlobalRoleBinding("foo", {
 *     globalRoleId: "admin",
 *     userId: "user-XXXXX",
 * });
 * // Create a new rancher2 Global Role Binding using groupPrincipalId
 * const foo2 = new rancher2.GlobalRoleBinding("foo2", {
 *     globalRoleId: "admin",
 *     groupPrincipalId: "local://g-XXXXX",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/globalRole.html.markdown.
 */
export class GlobalRoleBinding extends pulumi.CustomResource {
    /**
     * Get an existing GlobalRoleBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GlobalRoleBindingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["globalRoleId"] = state ? state.globalRoleId : undefined;
            inputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as GlobalRoleBindingArgs | undefined;
            if (!args || args.globalRoleId === undefined) {
                throw new Error("Missing required property 'globalRoleId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["globalRoleId"] = args ? args.globalRoleId : undefined;
            inputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["userId"] = args ? args.userId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(GlobalRoleBinding.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalRoleBinding resources.
 */
export interface GlobalRoleBindingState {
    /**
     * Annotations for global role binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The role id from create global role binding (string)
     */
    readonly globalRoleId?: pulumi.Input<string>;
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for global role binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the global role binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user ID to assign global role binding (string)
     */
    readonly userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlobalRoleBinding resource.
 */
export interface GlobalRoleBindingArgs {
    /**
     * Annotations for global role binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The role id from create global role binding (string)
     */
    readonly globalRoleId: pulumi.Input<string>;
    /**
     * The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for global role binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the global role binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user ID to assign global role binding (string)
     */
    readonly userId?: pulumi.Input<string>;
}
