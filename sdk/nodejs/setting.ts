// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Setting resource. This can be used to create settings for Rancher v2 environments and retrieve their information.
 *
 * On create, if setting already exists, provider will import it and update its value.
 *
 * On destroy, if setting is a system setting like `server-url`, provider'll not delete it from Rancher, it'll just update setting value to default and remove it from tfstate.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Setting
 * const foo = new rancher2.Setting("foo", {
 *     value: "<VALUE>",
 * });
 * ```
 *
 * ## Import
 *
 * Setting can be imported using the Rancher setting ID.
 *
 * ```sh
 *  $ pulumi import rancher2:index/setting:Setting foo &lt;setting_id&gt;
 * ```
 */
export class Setting extends pulumi.CustomResource {
    /**
     * Get an existing Setting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SettingState, opts?: pulumi.CustomResourceOptions): Setting {
        return new Setting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/setting:Setting';

    /**
     * Returns true if the given object is an instance of Setting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Setting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Setting.__pulumiType;
    }

    /**
     * Annotations for setting object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Labels for setting object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the setting (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The value of the setting (string)
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a Setting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SettingArgs | SettingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SettingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as SettingArgs | undefined;
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["value"] = args ? args.value : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Setting.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Setting resources.
 */
export interface SettingState {
    /**
     * Annotations for setting object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Labels for setting object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the setting (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The value of the setting (string)
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Setting resource.
 */
export interface SettingArgs {
    /**
     * Annotations for setting object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Labels for setting object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the setting (string)
     */
    name?: pulumi.Input<string>;
    /**
     * The value of the setting (string)
     */
    value: pulumi.Input<string>;
}
