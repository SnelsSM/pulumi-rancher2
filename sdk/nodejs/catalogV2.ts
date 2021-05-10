// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher Catalog v2 resource. This can be used to create cluster helm catalogs for Rancher v2 environments and retrieve their information. Catalog v2 resource is available at Rancher v2.5.x and above.
 *
 * ## Import
 *
 * V2 catalogs can be imported using the Rancher cluster ID and Catalog V2 name.
 *
 * ```sh
 *  $ pulumi import rancher2:index/catalogV2:CatalogV2 foo &lt;CLUSTER_ID&gt;.&lt;CATALOG_V2_NAME&gt;
 * ```
 */
export class CatalogV2 extends pulumi.CustomResource {
    /**
     * Get an existing CatalogV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CatalogV2State, opts?: pulumi.CustomResourceOptions): CatalogV2 {
        return new CatalogV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/catalogV2:CatalogV2';

    /**
     * Returns true if the given object is an instance of CatalogV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CatalogV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CatalogV2.__pulumiType;
    }

    /**
     * Annotations for the catalog v2 (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * PEM encoded CA bundle which will be used to validate the repo's certificate (string)
     */
    public readonly caBundle!: pulumi.Output<string | undefined>;
    /**
     * The cluster id of the catalog V2 (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Git Repository branch containing Helm chart definitions. Default `master` (string)
     */
    public readonly gitBranch!: pulumi.Output<string>;
    /**
     * The url of the catalog v2 repo. Conflicts with `url` (string)
     */
    public readonly gitRepo!: pulumi.Output<string | undefined>;
    /**
     * Use insecure HTTPS to download the repo's index. Default: `false` (bool)
     */
    public readonly insecure!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for the catalog v2 (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the catalog v2 (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (Computed) The k8s resource version (string)
     */
    public /*out*/ readonly resourceVersion!: pulumi.Output<string>;
    /**
     * K8s secret name to be used to connect to the repo (string)
     */
    public readonly secretName!: pulumi.Output<string | undefined>;
    /**
     * K8s secret namespace (string)
     */
    public readonly secretNamespace!: pulumi.Output<string | undefined>;
    /**
     * K8s service account used to deploy charts instead of the end users credentials (string)
     */
    public readonly serviceAccount!: pulumi.Output<string | undefined>;
    /**
     * The username to access the catalog if needed (string)
     */
    public readonly serviceAccountNamespace!: pulumi.Output<string | undefined>;
    /**
     * URL to an index generated by Helm. Conflicts with `gitRepo` (string)
     */
    public readonly url!: pulumi.Output<string | undefined>;

    /**
     * Create a CatalogV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CatalogV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CatalogV2Args | CatalogV2State, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CatalogV2State | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["caBundle"] = state ? state.caBundle : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["gitBranch"] = state ? state.gitBranch : undefined;
            inputs["gitRepo"] = state ? state.gitRepo : undefined;
            inputs["insecure"] = state ? state.insecure : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceVersion"] = state ? state.resourceVersion : undefined;
            inputs["secretName"] = state ? state.secretName : undefined;
            inputs["secretNamespace"] = state ? state.secretNamespace : undefined;
            inputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            inputs["serviceAccountNamespace"] = state ? state.serviceAccountNamespace : undefined;
            inputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as CatalogV2Args | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["caBundle"] = args ? args.caBundle : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["gitBranch"] = args ? args.gitBranch : undefined;
            inputs["gitRepo"] = args ? args.gitRepo : undefined;
            inputs["insecure"] = args ? args.insecure : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["secretName"] = args ? args.secretName : undefined;
            inputs["secretNamespace"] = args ? args.secretNamespace : undefined;
            inputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            inputs["serviceAccountNamespace"] = args ? args.serviceAccountNamespace : undefined;
            inputs["url"] = args ? args.url : undefined;
            inputs["resourceVersion"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CatalogV2.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CatalogV2 resources.
 */
export interface CatalogV2State {
    /**
     * Annotations for the catalog v2 (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * PEM encoded CA bundle which will be used to validate the repo's certificate (string)
     */
    readonly caBundle?: pulumi.Input<string>;
    /**
     * The cluster id of the catalog V2 (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Git Repository branch containing Helm chart definitions. Default `master` (string)
     */
    readonly gitBranch?: pulumi.Input<string>;
    /**
     * The url of the catalog v2 repo. Conflicts with `url` (string)
     */
    readonly gitRepo?: pulumi.Input<string>;
    /**
     * Use insecure HTTPS to download the repo's index. Default: `false` (bool)
     */
    readonly insecure?: pulumi.Input<boolean>;
    /**
     * Labels for the catalog v2 (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the catalog v2 (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * (Computed) The k8s resource version (string)
     */
    readonly resourceVersion?: pulumi.Input<string>;
    /**
     * K8s secret name to be used to connect to the repo (string)
     */
    readonly secretName?: pulumi.Input<string>;
    /**
     * K8s secret namespace (string)
     */
    readonly secretNamespace?: pulumi.Input<string>;
    /**
     * K8s service account used to deploy charts instead of the end users credentials (string)
     */
    readonly serviceAccount?: pulumi.Input<string>;
    /**
     * The username to access the catalog if needed (string)
     */
    readonly serviceAccountNamespace?: pulumi.Input<string>;
    /**
     * URL to an index generated by Helm. Conflicts with `gitRepo` (string)
     */
    readonly url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CatalogV2 resource.
 */
export interface CatalogV2Args {
    /**
     * Annotations for the catalog v2 (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * PEM encoded CA bundle which will be used to validate the repo's certificate (string)
     */
    readonly caBundle?: pulumi.Input<string>;
    /**
     * The cluster id of the catalog V2 (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Git Repository branch containing Helm chart definitions. Default `master` (string)
     */
    readonly gitBranch?: pulumi.Input<string>;
    /**
     * The url of the catalog v2 repo. Conflicts with `url` (string)
     */
    readonly gitRepo?: pulumi.Input<string>;
    /**
     * Use insecure HTTPS to download the repo's index. Default: `false` (bool)
     */
    readonly insecure?: pulumi.Input<boolean>;
    /**
     * Labels for the catalog v2 (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the catalog v2 (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * K8s secret name to be used to connect to the repo (string)
     */
    readonly secretName?: pulumi.Input<string>;
    /**
     * K8s secret namespace (string)
     */
    readonly secretNamespace?: pulumi.Input<string>;
    /**
     * K8s service account used to deploy charts instead of the end users credentials (string)
     */
    readonly serviceAccount?: pulumi.Input<string>;
    /**
     * The username to access the catalog if needed (string)
     */
    readonly serviceAccountNamespace?: pulumi.Input<string>;
    /**
     * URL to an index generated by Helm. Conflicts with `gitRepo` (string)
     */
    readonly url?: pulumi.Input<string>;
}
