// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Project Role Template Binding resource. This can be used to create Project Role Template Bindings for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Project Role Template Binding
 * const foo = new rancher2.ProjectRoleTemplateBinding("foo", {
 *     name: "foo",
 *     projectId: "<project_id>",
 *     roleTemplateId: "<role_template_id>",
 *     userId: "<user_id>",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Project Role Template Bindings can be imported using the Rancher Project Role Template Binding ID
 *
 * ```sh
 * $ pulumi import rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding foo &lt;project_role_template_binding_id&gt;
 * ```
 */
export class ProjectRoleTemplateBinding extends pulumi.CustomResource {
    /**
     * Get an existing ProjectRoleTemplateBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectRoleTemplateBindingState, opts?: pulumi.CustomResourceOptions): ProjectRoleTemplateBinding {
        return new ProjectRoleTemplateBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding';

    /**
     * Returns true if the given object is an instance of ProjectRoleTemplateBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectRoleTemplateBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectRoleTemplateBinding.__pulumiType;
    }

    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The group ID to assign project role template binding (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The groupPrincipal ID to assign project role template binding (string)
     */
    public readonly groupPrincipalId!: pulumi.Output<string>;
    /**
     * Labels of the resource (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project id where bind project role template, in format `cluster_id:project_id`, e.g. `c-abc12:p-def34` (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The role template id from create project role template binding (string)
     */
    public readonly roleTemplateId!: pulumi.Output<string>;
    /**
     * The user ID to assign project role template binding (string)
     */
    public readonly userId!: pulumi.Output<string>;
    /**
     * The userPrincipal ID to assign project role template binding (string)
     */
    public readonly userPrincipalId!: pulumi.Output<string>;

    /**
     * Create a ProjectRoleTemplateBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectRoleTemplateBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectRoleTemplateBindingArgs | ProjectRoleTemplateBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectRoleTemplateBindingState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["roleTemplateId"] = state ? state.roleTemplateId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["userPrincipalId"] = state ? state.userPrincipalId : undefined;
        } else {
            const args = argsOrState as ProjectRoleTemplateBindingArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.roleTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleTemplateId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["roleTemplateId"] = args ? args.roleTemplateId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["userPrincipalId"] = args ? args.userPrincipalId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectRoleTemplateBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectRoleTemplateBinding resources.
 */
export interface ProjectRoleTemplateBindingState {
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The group ID to assign project role template binding (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign project role template binding (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project id where bind project role template, in format `cluster_id:project_id`, e.g. `c-abc12:p-def34` (string)
     */
    projectId?: pulumi.Input<string>;
    /**
     * The role template id from create project role template binding (string)
     */
    roleTemplateId?: pulumi.Input<string>;
    /**
     * The user ID to assign project role template binding (string)
     */
    userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign project role template binding (string)
     */
    userPrincipalId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectRoleTemplateBinding resource.
 */
export interface ProjectRoleTemplateBindingArgs {
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The group ID to assign project role template binding (string)
     */
    groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign project role template binding (string)
     */
    groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     *
     * **Note:** user `userId | userPrincipalId` OR group `groupId | groupPrincipalId` must be defined
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project id where bind project role template, in format `cluster_id:project_id`, e.g. `c-abc12:p-def34` (string)
     */
    projectId: pulumi.Input<string>;
    /**
     * The role template id from create project role template binding (string)
     */
    roleTemplateId: pulumi.Input<string>;
    /**
     * The user ID to assign project role template binding (string)
     */
    userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign project role template binding (string)
     */
    userPrincipalId?: pulumi.Input<string>;
}
