// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher ConfigMap v2 resource. This can be used to create k8s configMaps for Rancher v2 environments and retrieve their information. ConfigMap v2 resource is available at Rancher v2.5.x and above.
 *
 * ## Import
 *
 * V2 configMaps can be imported using the Rancher cluster ID, ConfigMap V2 namespace and name.
 *
 * ```sh
 *  $ pulumi import rancher2:index/configMapV2:ConfigMapV2 foo &lt;CLUSTER_ID&gt;.&lt;SECRET_V2_NAMESPACE&gt;/&lt;SECRET_V2_NAME&gt;
 * ```
 */
export class ConfigMapV2 extends pulumi.CustomResource {
    /**
     * Get an existing ConfigMapV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigMapV2State, opts?: pulumi.CustomResourceOptions): ConfigMapV2 {
        return new ConfigMapV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/configMapV2:ConfigMapV2';

    /**
     * Returns true if the given object is an instance of ConfigMapV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigMapV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigMapV2.__pulumiType;
    }

    /**
     * Annotations for the configMap v2 (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id of the configMap V2 (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The data of the configMap v2 (map)
     */
    public readonly data!: pulumi.Output<{[key: string]: any}>;
    /**
     * If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     */
    public readonly immutable!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for the configMap v2 (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the configMap v2 (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * (Computed) The k8s resource version (string)
     */
    public /*out*/ readonly resourceVersion!: pulumi.Output<string>;

    /**
     * Create a ConfigMapV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConfigMapV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigMapV2Args | ConfigMapV2State, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigMapV2State | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["data"] = state ? state.data : undefined;
            inputs["immutable"] = state ? state.immutable : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespace"] = state ? state.namespace : undefined;
            inputs["resourceVersion"] = state ? state.resourceVersion : undefined;
        } else {
            const args = argsOrState as ConfigMapV2Args | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.data === undefined) && !opts.urn) {
                throw new Error("Missing required property 'data'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["data"] = args ? args.data : undefined;
            inputs["immutable"] = args ? args.immutable : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespace"] = args ? args.namespace : undefined;
            inputs["resourceVersion"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ConfigMapV2.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigMapV2 resources.
 */
export interface ConfigMapV2State {
    /**
     * Annotations for the configMap v2 (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id of the configMap V2 (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The data of the configMap v2 (map)
     */
    data?: pulumi.Input<{[key: string]: any}>;
    /**
     * If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     */
    immutable?: pulumi.Input<boolean>;
    /**
     * Labels for the configMap v2 (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the configMap v2 (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     */
    namespace?: pulumi.Input<string>;
    /**
     * (Computed) The k8s resource version (string)
     */
    resourceVersion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConfigMapV2 resource.
 */
export interface ConfigMapV2Args {
    /**
     * Annotations for the configMap v2 (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id of the configMap V2 (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The data of the configMap v2 (map)
     */
    data: pulumi.Input<{[key: string]: any}>;
    /**
     * If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     */
    immutable?: pulumi.Input<boolean>;
    /**
     * Labels for the configMap v2 (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the configMap v2 (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     */
    namespace?: pulumi.Input<string>;
}
