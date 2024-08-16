// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new Rancher2 Cluster Role Template Binding
 * const foo = new rancher2.ClusterRoleTemplateBinding("foo", {
 *     name: "foo",
 *     clusterId: "<cluster_id>",
 *     roleTemplateId: "<role_template_id>",
 *     userId: "<user_id>",
 * });
 * ```
 *
 * ## Import
 *
 * Cluster Role Template Bindings can be imported using the Rancher cluster Role Template Binding ID
 *
 * ```sh
 * $ pulumi import rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding foo &lt;CLUSTER_ROLE_TEMPLATE_BINDING_ID&gt;
 * ```
 */
export class ClusterRoleTemplateBinding extends pulumi.CustomResource {
    /**
     * Get an existing ClusterRoleTemplateBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    public readonly groupPrincipalId!: pulumi.Output<string>;
    /**
     * Labels for cluster role template binding (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
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
    public readonly userId!: pulumi.Output<string>;
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterRoleTemplateBindingState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleTemplateId"] = state ? state.roleTemplateId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["userPrincipalId"] = state ? state.userPrincipalId : undefined;
        } else {
            const args = argsOrState as ClusterRoleTemplateBindingArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.roleTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleTemplateId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleTemplateId"] = args ? args.roleTemplateId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["userPrincipalId"] = args ? args.userPrincipalId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterRoleTemplateBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterRoleTemplateBinding resources.
 */
export interface ClusterRoleTemplateBindingState {
    /**
     * Annotations for cluster role template binding (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for cluster role template binding (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the cluster role template binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    roleTemplateId?: pulumi.Input<string>;
    /**
     * The user ID to assign cluster role template binding (string)
     */
    userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign cluster role template binding (string)
     */
    userPrincipalId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterRoleTemplateBinding resource.
 */
export interface ClusterRoleTemplateBindingArgs {
    /**
     * Annotations for cluster role template binding (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The cluster id where bind cluster role template binding (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The group ID to assign cluster role template binding (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign cluster role template binding (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels for cluster role template binding (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the cluster role template binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The role template id from create cluster role template binding (string)
     */
    roleTemplateId: pulumi.Input<string>;
    /**
     * The user ID to assign cluster role template binding (string)
     */
    userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign cluster role template binding (string)
     */
    userPrincipalId?: pulumi.Input<string>;
}
