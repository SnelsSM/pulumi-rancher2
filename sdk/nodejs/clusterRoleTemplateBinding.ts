// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new Rancher2 Cluster Role Template Binding
 * const foo = new rancher2.ClusterRoleTemplateBinding("foo", {
 *     clusterId: "<cluster_id>",
 *     roleTemplateId: "<role_template_id>",
 *     userId: "<user_id>",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterRole.html.markdown.
 */
export class ClusterRoleTemplateBinding extends pulumi.CustomResource {
    /**
     * Get an existing ClusterRoleTemplateBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterRoleTemplateBindingState, opts?: pulumi.CustomResourceOptions): ClusterRoleTemplateBinding {
        return new ClusterRoleTemplateBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding';

    /**
     * Returns true if the given object is an instance of ClusterRoleTemplateBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterRoleTemplateBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterRoleTemplateBinding.__pulumiType;
    }

    /**
     * Annotations for cluster role template binding (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    public readonly groupId!: pulumi.Output<string | undefined>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    public readonly groupPrincipalId!: pulumi.Output<string>;
    /**
     * Labels for cluster role template binding (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the cluster role template binding (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    public readonly roleTemplateId!: pulumi.Output<string>;
    /**
     * The user ID to assign cluster role template binding (string)
     */
    public readonly userId!: pulumi.Output<string | undefined>;
    /**
     * The userPrincipal ID to assign cluster role template binding (string)
     */
    public readonly userPrincipalId!: pulumi.Output<string>;

    /**
     * Create a ClusterRoleTemplateBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterRoleTemplateBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterRoleTemplateBindingArgs | ClusterRoleTemplateBindingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterRoleTemplateBindingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["roleTemplateId"] = state ? state.roleTemplateId : undefined;
            inputs["userId"] = state ? state.userId : undefined;
            inputs["userPrincipalId"] = state ? state.userPrincipalId : undefined;
        } else {
            const args = argsOrState as ClusterRoleTemplateBindingArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            if (!args || args.roleTemplateId === undefined) {
                throw new Error("Missing required property 'roleTemplateId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["roleTemplateId"] = args ? args.roleTemplateId : undefined;
            inputs["userId"] = args ? args.userId : undefined;
            inputs["userPrincipalId"] = args ? args.userPrincipalId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ClusterRoleTemplateBinding.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterRoleTemplateBinding resources.
 */
export interface ClusterRoleTemplateBindingState {
    /**
     * Annotations for cluster role template binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for cluster role template binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the cluster role template binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    readonly roleTemplateId?: pulumi.Input<string>;
    /**
     * The user ID to assign cluster role template binding (string)
     */
    readonly userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign cluster role template binding (string)
     */
    readonly userPrincipalId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterRoleTemplateBinding resource.
 */
export interface ClusterRoleTemplateBindingArgs {
    /**
     * Annotations for cluster role template binding (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for cluster role template binding (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the cluster role template binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    readonly roleTemplateId: pulumi.Input<string>;
    /**
     * The user ID to assign cluster role template binding (string)
     */
    readonly userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign cluster role template binding (string)
     */
    readonly userPrincipalId?: pulumi.Input<string>;
}
