// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher Storage Class v2 resource. This can be used to manage k8s storage classes for Rancher v2 clusters and retrieve their information. Storage Class v2 resource is available at Rancher v2.5.x and above.
 *
 * ## Import
 *
 * V2 storage classs can be imported using the Rancher cluster ID and StorageClass V2 name.
 *
 * ```sh
 *  $ pulumi import rancher2:index/storageClassV2:StorageClassV2 foo &lt;CLUSTER_ID&gt;.&lt;STORAGE_CLASS_V2_NAME&gt;
 * ```
 */
export class StorageClassV2 extends pulumi.CustomResource {
    /**
     * Get an existing StorageClassV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageClassV2State, opts?: pulumi.CustomResourceOptions): StorageClassV2 {
        return new StorageClassV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/storageClassV2:StorageClassV2';

    /**
     * Returns true if the given object is an instance of StorageClassV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageClassV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageClassV2.__pulumiType;
    }

    /**
     * Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
     */
    public readonly allowVolumeExpansion!: pulumi.Output<boolean>;
    /**
     * Annotations for the storageClass v2 (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id of the storageClass V2 (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The provisioner of the storageClass v2 (string)
     */
    public readonly k8sProvisioner!: pulumi.Output<string>;
    /**
     * Labels for the storageClass v2 (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The mount options for storageClass v2 (list)
     */
    public readonly mountOptions!: pulumi.Output<string[]>;
    /**
     * The name of the storageClass v2 (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The parameters for storageClass v2 (string)
     */
    public readonly parameters!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
     */
    public readonly reclaimPolicy!: pulumi.Output<string | undefined>;
    /**
     * (Computed) The k8s resource version (string)
     */
    public /*out*/ readonly resourceVersion!: pulumi.Output<string>;
    /**
     * The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
     */
    public readonly volumeBindingMode!: pulumi.Output<string | undefined>;

    /**
     * Create a StorageClassV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StorageClassV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageClassV2Args | StorageClassV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageClassV2State | undefined;
            resourceInputs["allowVolumeExpansion"] = state ? state.allowVolumeExpansion : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["k8sProvisioner"] = state ? state.k8sProvisioner : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["mountOptions"] = state ? state.mountOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["reclaimPolicy"] = state ? state.reclaimPolicy : undefined;
            resourceInputs["resourceVersion"] = state ? state.resourceVersion : undefined;
            resourceInputs["volumeBindingMode"] = state ? state.volumeBindingMode : undefined;
        } else {
            const args = argsOrState as StorageClassV2Args | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.k8sProvisioner === undefined) && !opts.urn) {
                throw new Error("Missing required property 'k8sProvisioner'");
            }
            resourceInputs["allowVolumeExpansion"] = args ? args.allowVolumeExpansion : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["k8sProvisioner"] = args ? args.k8sProvisioner : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["mountOptions"] = args ? args.mountOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["reclaimPolicy"] = args ? args.reclaimPolicy : undefined;
            resourceInputs["volumeBindingMode"] = args ? args.volumeBindingMode : undefined;
            resourceInputs["resourceVersion"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageClassV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageClassV2 resources.
 */
export interface StorageClassV2State {
    /**
     * Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
     */
    allowVolumeExpansion?: pulumi.Input<boolean>;
    /**
     * Annotations for the storageClass v2 (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id of the storageClass V2 (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The provisioner of the storageClass v2 (string)
     */
    k8sProvisioner?: pulumi.Input<string>;
    /**
     * Labels for the storageClass v2 (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The mount options for storageClass v2 (list)
     */
    mountOptions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the storageClass v2 (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters for storageClass v2 (string)
     */
    parameters?: pulumi.Input<{[key: string]: any}>;
    /**
     * The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
     */
    reclaimPolicy?: pulumi.Input<string>;
    /**
     * (Computed) The k8s resource version (string)
     */
    resourceVersion?: pulumi.Input<string>;
    /**
     * The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
     */
    volumeBindingMode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageClassV2 resource.
 */
export interface StorageClassV2Args {
    /**
     * Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
     */
    allowVolumeExpansion?: pulumi.Input<boolean>;
    /**
     * Annotations for the storageClass v2 (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id of the storageClass V2 (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The provisioner of the storageClass v2 (string)
     */
    k8sProvisioner: pulumi.Input<string>;
    /**
     * Labels for the storageClass v2 (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The mount options for storageClass v2 (list)
     */
    mountOptions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the storageClass v2 (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters for storageClass v2 (string)
     */
    parameters?: pulumi.Input<{[key: string]: any}>;
    /**
     * The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
     */
    reclaimPolicy?: pulumi.Input<string>;
    /**
     * The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
     */
    volumeBindingMode?: pulumi.Input<string>;
}
