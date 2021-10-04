// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Project Role Template Binding resource. This can be used to create Project Role Template Bindings for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Project Role Template Binding
 * const foo = new rancher2.ProjectRoleTemplateBinding("foo", {
 *     projectId: "<project_id>",
 *     roleTemplateId: "<role_template_id>",
 *     userId: "<user_id>",
 * });
 * ```
 *
 * ## Import
 *
 * Project Role Template Bindings can be imported using the Rancher Project Role Template Binding ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding foo &lt;project_role_template_binding_id&gt;
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
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project id where bind project role template (string)
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectRoleTemplateBindingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["groupPrincipalId"] = state ? state.groupPrincipalId : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["roleTemplateId"] = state ? state.roleTemplateId : undefined;
            inputs["userId"] = state ? state.userId : undefined;
            inputs["userPrincipalId"] = state ? state.userPrincipalId : undefined;
        } else {
            const args = argsOrState as ProjectRoleTemplateBindingArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.roleTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleTemplateId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["groupPrincipalId"] = args ? args.groupPrincipalId : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["roleTemplateId"] = args ? args.roleTemplateId : undefined;
            inputs["userId"] = args ? args.userId : undefined;
            inputs["userPrincipalId"] = args ? args.userPrincipalId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ProjectRoleTemplateBinding.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectRoleTemplateBinding resources.
 */
export interface ProjectRoleTemplateBindingState {
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The group ID to assign project role template binding (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign project role template binding (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project id where bind project role template (string)
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * The role template id from create project role template binding (string)
     */
    readonly roleTemplateId?: pulumi.Input<string>;
    /**
     * The user ID to assign project role template binding (string)
     */
    readonly userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign project role template binding (string)
     */
    readonly userPrincipalId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectRoleTemplateBinding resource.
 */
export interface ProjectRoleTemplateBindingArgs {
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The group ID to assign project role template binding (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The groupPrincipal ID to assign project role template binding (string)
     */
    readonly groupPrincipalId?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project role template binding (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project id where bind project role template (string)
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * The role template id from create project role template binding (string)
     */
    readonly roleTemplateId: pulumi.Input<string>;
    /**
     * The user ID to assign project role template binding (string)
     */
    readonly userId?: pulumi.Input<string>;
    /**
     * The userPrincipal ID to assign project role template binding (string)
     */
    readonly userPrincipalId?: pulumi.Input<string>;
}
