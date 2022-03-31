// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 App
 * const foo = new rancher2.App("foo", {
 *     answers: {
 *         foo: "bar",
 *         "ingress.annotations.nginx.ingress.kubernetes.io/force-ssl-redirect": true,
 *         ingress_host: "test.xip.io",
 *     },
 *     catalogName: "<catalog_name>",
 *     description: "Foo app",
 *     projectId: "<project_id>",
 *     targetNamespace: "<namespace_name>",
 *     templateName: "<template_name>",
 *     templateVersion: "<template_version>",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 App in a new namespace
 * const fooNamespace = new rancher2.Namespace("fooNamespace", {
 *     description: "Foo namespace",
 *     projectId: "<project_id>",
 *     resourceQuota: {
 *         limit: {
 *             limitsCpu: "100m",
 *             limitsMemory: "100Mi",
 *             requestsStorage: "1Gi",
 *         },
 *     },
 * });
 * const fooApp = new rancher2.App("fooApp", {
 *     catalogName: "<catalog_name>",
 *     description: "Foo app",
 *     projectId: "<project_id>",
 *     templateName: "<template_name>",
 *     templateVersion: "<template_version>",
 *     targetNamespace: fooNamespace.id,
 *     answers: {
 *         ingress_host: "test.xip.io",
 *         foo: "bar",
 *         "ingress.annotations.nginx.ingress.kubernetes.io/force-ssl-redirect": true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Apps can be imported using the app ID in the format `<project_id>:<app_name>`
 *
 * ```sh
 *  $ pulumi import rancher2:index/app:App foo &lt;PROJECT_ID_ID&gt;:&lt;APP_NAME&gt;
 * ```
 */
export class App extends pulumi.CustomResource {
    /**
     * Get an existing App resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppState, opts?: pulumi.CustomResourceOptions): App {
        return new App(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/app:App';

    /**
     * Returns true if the given object is an instance of App.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is App {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === App.__pulumiType;
    }

    /**
     * Annotations for App object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Answers for the app template. If modified, app will be upgraded (map)
     */
    public readonly answers!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
     * * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
     * * add project ID before name, `p-XXXXX:<name>`
     */
    public readonly catalogName!: pulumi.Output<string>;
    /**
     * Description for the app (string)
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * (Computed) The url of the app template on a catalog (string)
     */
    public /*out*/ readonly externalId!: pulumi.Output<string>;
    /**
     * Force app upgrade (string)
     */
    public readonly forceUpgrade!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for App object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the app (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project id where the app will be installed (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
     */
    public readonly revisionId!: pulumi.Output<string>;
    /**
     * The namespace id where the app will be installed (string)
     */
    public readonly targetNamespace!: pulumi.Output<string>;
    /**
     * Template name of the app. If modified, app will be upgraded (string)
     */
    public readonly templateName!: pulumi.Output<string>;
    /**
     * Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
     */
    public readonly templateVersion!: pulumi.Output<string>;
    /**
     * values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
     */
    public readonly valuesYaml!: pulumi.Output<string | undefined>;
    /**
     * Wait until app is deployed and active. Default: `true` (bool)
     */
    public readonly wait!: pulumi.Output<boolean | undefined>;

    /**
     * Create a App resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppArgs | AppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["answers"] = state ? state.answers : undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
            resourceInputs["forceUpgrade"] = state ? state.forceUpgrade : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["revisionId"] = state ? state.revisionId : undefined;
            resourceInputs["targetNamespace"] = state ? state.targetNamespace : undefined;
            resourceInputs["templateName"] = state ? state.templateName : undefined;
            resourceInputs["templateVersion"] = state ? state.templateVersion : undefined;
            resourceInputs["valuesYaml"] = state ? state.valuesYaml : undefined;
            resourceInputs["wait"] = state ? state.wait : undefined;
        } else {
            const args = argsOrState as AppArgs | undefined;
            if ((!args || args.catalogName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catalogName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.targetNamespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetNamespace'");
            }
            if ((!args || args.templateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateName'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["answers"] = args ? args.answers : undefined;
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forceUpgrade"] = args ? args.forceUpgrade : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["revisionId"] = args ? args.revisionId : undefined;
            resourceInputs["targetNamespace"] = args ? args.targetNamespace : undefined;
            resourceInputs["templateName"] = args ? args.templateName : undefined;
            resourceInputs["templateVersion"] = args ? args.templateVersion : undefined;
            resourceInputs["valuesYaml"] = args ? args.valuesYaml : undefined;
            resourceInputs["wait"] = args ? args.wait : undefined;
            resourceInputs["externalId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(App.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering App resources.
 */
export interface AppState {
    /**
     * Annotations for App object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Answers for the app template. If modified, app will be upgraded (map)
     */
    answers?: pulumi.Input<{[key: string]: any}>;
    /**
     * Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
     * * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
     * * add project ID before name, `p-XXXXX:<name>`
     */
    catalogName?: pulumi.Input<string>;
    /**
     * Description for the app (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (Computed) The url of the app template on a catalog (string)
     */
    externalId?: pulumi.Input<string>;
    /**
     * Force app upgrade (string)
     */
    forceUpgrade?: pulumi.Input<boolean>;
    /**
     * Labels for App object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the app (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project id where the app will be installed (string)
     */
    projectId?: pulumi.Input<string>;
    /**
     * Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
     */
    revisionId?: pulumi.Input<string>;
    /**
     * The namespace id where the app will be installed (string)
     */
    targetNamespace?: pulumi.Input<string>;
    /**
     * Template name of the app. If modified, app will be upgraded (string)
     */
    templateName?: pulumi.Input<string>;
    /**
     * Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
     */
    templateVersion?: pulumi.Input<string>;
    /**
     * values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
     */
    valuesYaml?: pulumi.Input<string>;
    /**
     * Wait until app is deployed and active. Default: `true` (bool)
     */
    wait?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a App resource.
 */
export interface AppArgs {
    /**
     * Annotations for App object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Answers for the app template. If modified, app will be upgraded (map)
     */
    answers?: pulumi.Input<{[key: string]: any}>;
    /**
     * Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
     * * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
     * * add project ID before name, `p-XXXXX:<name>`
     */
    catalogName: pulumi.Input<string>;
    /**
     * Description for the app (string)
     */
    description?: pulumi.Input<string>;
    /**
     * Force app upgrade (string)
     */
    forceUpgrade?: pulumi.Input<boolean>;
    /**
     * Labels for App object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the app (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The project id where the app will be installed (string)
     */
    projectId: pulumi.Input<string>;
    /**
     * Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
     */
    revisionId?: pulumi.Input<string>;
    /**
     * The namespace id where the app will be installed (string)
     */
    targetNamespace: pulumi.Input<string>;
    /**
     * Template name of the app. If modified, app will be upgraded (string)
     */
    templateName: pulumi.Input<string>;
    /**
     * Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
     */
    templateVersion?: pulumi.Input<string>;
    /**
     * values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
     */
    valuesYaml?: pulumi.Input<string>;
    /**
     * Wait until app is deployed and active. Default: `true` (bool)
     */
    wait?: pulumi.Input<boolean>;
}
