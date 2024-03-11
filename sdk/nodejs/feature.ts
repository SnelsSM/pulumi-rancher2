// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Feature resource. This can be used to enable/disable [experimental features](https://rancher.com/docs/rancher/v2.x/en/installation/resources/feature-flags/) for Rancher v2 environments.
 *
 * Experimental features already exist at Rancher v2.5.x systems, so they can just be updated:
 * * On create, provider will read Feature from Rancher and update its value. It will return an error if feature doesn't exist
 * * On destroy, provider will not delete feature from Rancher, just from tfstate
 *
 * **Note:** Some Rancher features as `fleet`, may force a Rancher reboot once updated. The provider will wait until Rancher is rebooted. If you are modifying more than one feature in a row, and any of them requires a Rancher reboot, `pulumi up` may fail on first run. Run `pulumi up` again should work fine.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Feature
 * const fleet = new rancher2.Feature("fleet", {value: "<VALUE>"});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class Feature extends pulumi.CustomResource {
    /**
     * Get an existing Feature resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FeatureState, opts?: pulumi.CustomResourceOptions): Feature {
        return new Feature(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/feature:Feature';

    /**
     * Returns true if the given object is an instance of Feature.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Feature {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Feature.__pulumiType;
    }

    /**
     * Annotations for feature object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Labels for feature object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the feature (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The value of the feature. Default: `false` (bool)
     */
    public readonly value!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Feature resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FeatureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FeatureArgs | FeatureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FeatureState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as FeatureArgs | undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Feature.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Feature resources.
 */
export interface FeatureState {
    /**
     * Annotations for feature object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Labels for feature object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the feature (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The value of the feature. Default: `false` (bool)
     */
    value?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Feature resource.
 */
export interface FeatureArgs {
    /**
     * Annotations for feature object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Labels for feature object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the feature (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The value of the feature. Default: `false` (bool)
     */
    value?: pulumi.Input<boolean>;
}
