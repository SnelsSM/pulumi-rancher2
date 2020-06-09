// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Project
 * const foo = new rancher2.Project("foo", {
 *     clusterId: "<CLUSTER_ID>",
 *     containerResourceLimit: {
 *         limitsCpu: "20m",
 *         limitsMemory: "20Mi",
 *         requestsCpu: "1m",
 *         requestsMemory: "1Mi",
 *     },
 *     resourceQuota: {
 *         namespaceDefaultLimit: {
 *             limitsCpu: "2000m",
 *             limitsMemory: "500Mi",
 *             requestsStorage: "1Gi",
 *         },
 *         projectLimit: {
 *             limitsCpu: "2000m",
 *             limitsMemory: "2000Mi",
 *             requestsStorage: "2Gi",
 *         },
 *     },
 * });
 * ```
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * Annotations for Node Pool object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id where create project (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Default containers resource limits on project (List maxitem:1)
     */
    public readonly containerResourceLimit!: pulumi.Output<outputs.ProjectContainerResourceLimit | undefined>;
    /**
     * A project description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable built-in project monitoring. Default `false` (bool)
     */
    public readonly enableProjectMonitoring!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for Node Pool object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the project (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Default Pod Security Policy ID for the project (string)
     */
    public readonly podSecurityPolicyTemplateId!: pulumi.Output<string | undefined>;
    /**
     * Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
     */
    public readonly projectMonitoringInput!: pulumi.Output<outputs.ProjectProjectMonitoringInput>;
    /**
     * Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     */
    public readonly resourceQuota!: pulumi.Output<outputs.ProjectResourceQuota | undefined>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    public readonly waitForCluster!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["containerResourceLimit"] = state ? state.containerResourceLimit : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enableProjectMonitoring"] = state ? state.enableProjectMonitoring : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["podSecurityPolicyTemplateId"] = state ? state.podSecurityPolicyTemplateId : undefined;
            inputs["projectMonitoringInput"] = state ? state.projectMonitoringInput : undefined;
            inputs["resourceQuota"] = state ? state.resourceQuota : undefined;
            inputs["waitForCluster"] = state ? state.waitForCluster : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["containerResourceLimit"] = args ? args.containerResourceLimit : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enableProjectMonitoring"] = args ? args.enableProjectMonitoring : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["podSecurityPolicyTemplateId"] = args ? args.podSecurityPolicyTemplateId : undefined;
            inputs["projectMonitoringInput"] = args ? args.projectMonitoringInput : undefined;
            inputs["resourceQuota"] = args ? args.resourceQuota : undefined;
            inputs["waitForCluster"] = args ? args.waitForCluster : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Project.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Annotations for Node Pool object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create project (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * Default containers resource limits on project (List maxitem:1)
     */
    readonly containerResourceLimit?: pulumi.Input<inputs.ProjectContainerResourceLimit>;
    /**
     * A project description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable built-in project monitoring. Default `false` (bool)
     */
    readonly enableProjectMonitoring?: pulumi.Input<boolean>;
    /**
     * Labels for Node Pool object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Default Pod Security Policy ID for the project (string)
     */
    readonly podSecurityPolicyTemplateId?: pulumi.Input<string>;
    /**
     * Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
     */
    readonly projectMonitoringInput?: pulumi.Input<inputs.ProjectProjectMonitoringInput>;
    /**
     * Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     */
    readonly resourceQuota?: pulumi.Input<inputs.ProjectResourceQuota>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    readonly waitForCluster?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Annotations for Node Pool object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create project (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * Default containers resource limits on project (List maxitem:1)
     */
    readonly containerResourceLimit?: pulumi.Input<inputs.ProjectContainerResourceLimit>;
    /**
     * A project description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable built-in project monitoring. Default `false` (bool)
     */
    readonly enableProjectMonitoring?: pulumi.Input<boolean>;
    /**
     * Labels for Node Pool object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the project (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Default Pod Security Policy ID for the project (string)
     */
    readonly podSecurityPolicyTemplateId?: pulumi.Input<string>;
    /**
     * Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
     */
    readonly projectMonitoringInput?: pulumi.Input<inputs.ProjectProjectMonitoringInput>;
    /**
     * Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     */
    readonly resourceQuota?: pulumi.Input<inputs.ProjectResourceQuota>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    readonly waitForCluster?: pulumi.Input<boolean>;
}
