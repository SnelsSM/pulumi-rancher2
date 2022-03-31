// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cloud Credential resource. This can be used to create Cloud Credential for Rancher v2.2.x and retrieve their information.
 *
 * amazonec2, azure, digitalocean, linode, openstack and vsphere credentials config are supported for Cloud Credential.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cloud Credential
 * const foo = new rancher2.CloudCredential("foo", {
 *     amazonec2CredentialConfig: {
 *         accessKey: "<AWS_ACCESS_KEY>",
 *         secretKey: "<AWS_SECRET_KEY>",
 *     },
 *     description: "foo test",
 * });
 * ```
 */
export class CloudCredential extends pulumi.CustomResource {
    /**
     * Get an existing CloudCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudCredentialState, opts?: pulumi.CustomResourceOptions): CloudCredential {
        return new CloudCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/cloudCredential:CloudCredential';

    /**
     * Returns true if the given object is an instance of CloudCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudCredential.__pulumiType;
    }

    /**
     * AWS config for the Cloud Credential (list maxitems:1)
     */
    public readonly amazonec2CredentialConfig!: pulumi.Output<outputs.CloudCredentialAmazonec2CredentialConfig | undefined>;
    /**
     * Annotations for Cloud Credential object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Azure config for the Cloud Credential (list maxitems:1)
     */
    public readonly azureCredentialConfig!: pulumi.Output<outputs.CloudCredentialAzureCredentialConfig | undefined>;
    /**
     * Description for the Cloud Credential (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * DigitalOcean config for the Cloud Credential (list maxitems:1)
     */
    public readonly digitaloceanCredentialConfig!: pulumi.Output<outputs.CloudCredentialDigitaloceanCredentialConfig | undefined>;
    /**
     * (Computed) The driver of the Cloud Credential (string)
     */
    public /*out*/ readonly driver!: pulumi.Output<string>;
    /**
     * Google config for the Cloud Credential (list maxitems:1)
     */
    public readonly googleCredentialConfig!: pulumi.Output<outputs.CloudCredentialGoogleCredentialConfig | undefined>;
    /**
     * Labels for Cloud Credential object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Linode config for the Cloud Credential (list maxitems:1)
     */
    public readonly linodeCredentialConfig!: pulumi.Output<outputs.CloudCredentialLinodeCredentialConfig | undefined>;
    /**
     * The name of the Cloud Credential (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * OpenStack config for the Cloud Credential (list maxitems:1)
     */
    public readonly openstackCredentialConfig!: pulumi.Output<outputs.CloudCredentialOpenstackCredentialConfig | undefined>;
    /**
     * S3 config for the Cloud Credential. Just for Rancher 2.6.0 and above (list maxitems:1)
     */
    public readonly s3CredentialConfig!: pulumi.Output<outputs.CloudCredentialS3CredentialConfig | undefined>;
    /**
     * vSphere config for the Cloud Credential (list maxitems:1)
     */
    public readonly vsphereCredentialConfig!: pulumi.Output<outputs.CloudCredentialVsphereCredentialConfig | undefined>;

    /**
     * Create a CloudCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CloudCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudCredentialArgs | CloudCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudCredentialState | undefined;
            resourceInputs["amazonec2CredentialConfig"] = state ? state.amazonec2CredentialConfig : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["azureCredentialConfig"] = state ? state.azureCredentialConfig : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["digitaloceanCredentialConfig"] = state ? state.digitaloceanCredentialConfig : undefined;
            resourceInputs["driver"] = state ? state.driver : undefined;
            resourceInputs["googleCredentialConfig"] = state ? state.googleCredentialConfig : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["linodeCredentialConfig"] = state ? state.linodeCredentialConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["openstackCredentialConfig"] = state ? state.openstackCredentialConfig : undefined;
            resourceInputs["s3CredentialConfig"] = state ? state.s3CredentialConfig : undefined;
            resourceInputs["vsphereCredentialConfig"] = state ? state.vsphereCredentialConfig : undefined;
        } else {
            const args = argsOrState as CloudCredentialArgs | undefined;
            resourceInputs["amazonec2CredentialConfig"] = args ? args.amazonec2CredentialConfig : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["azureCredentialConfig"] = args ? args.azureCredentialConfig : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["digitaloceanCredentialConfig"] = args ? args.digitaloceanCredentialConfig : undefined;
            resourceInputs["googleCredentialConfig"] = args ? args.googleCredentialConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["linodeCredentialConfig"] = args ? args.linodeCredentialConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["openstackCredentialConfig"] = args ? args.openstackCredentialConfig : undefined;
            resourceInputs["s3CredentialConfig"] = args ? args.s3CredentialConfig : undefined;
            resourceInputs["vsphereCredentialConfig"] = args ? args.vsphereCredentialConfig : undefined;
            resourceInputs["driver"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudCredential resources.
 */
export interface CloudCredentialState {
    /**
     * AWS config for the Cloud Credential (list maxitems:1)
     */
    amazonec2CredentialConfig?: pulumi.Input<inputs.CloudCredentialAmazonec2CredentialConfig>;
    /**
     * Annotations for Cloud Credential object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Azure config for the Cloud Credential (list maxitems:1)
     */
    azureCredentialConfig?: pulumi.Input<inputs.CloudCredentialAzureCredentialConfig>;
    /**
     * Description for the Cloud Credential (string)
     */
    description?: pulumi.Input<string>;
    /**
     * DigitalOcean config for the Cloud Credential (list maxitems:1)
     */
    digitaloceanCredentialConfig?: pulumi.Input<inputs.CloudCredentialDigitaloceanCredentialConfig>;
    /**
     * (Computed) The driver of the Cloud Credential (string)
     */
    driver?: pulumi.Input<string>;
    /**
     * Google config for the Cloud Credential (list maxitems:1)
     */
    googleCredentialConfig?: pulumi.Input<inputs.CloudCredentialGoogleCredentialConfig>;
    /**
     * Labels for Cloud Credential object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Linode config for the Cloud Credential (list maxitems:1)
     */
    linodeCredentialConfig?: pulumi.Input<inputs.CloudCredentialLinodeCredentialConfig>;
    /**
     * The name of the Cloud Credential (string)
     */
    name?: pulumi.Input<string>;
    /**
     * OpenStack config for the Cloud Credential (list maxitems:1)
     */
    openstackCredentialConfig?: pulumi.Input<inputs.CloudCredentialOpenstackCredentialConfig>;
    /**
     * S3 config for the Cloud Credential. Just for Rancher 2.6.0 and above (list maxitems:1)
     */
    s3CredentialConfig?: pulumi.Input<inputs.CloudCredentialS3CredentialConfig>;
    /**
     * vSphere config for the Cloud Credential (list maxitems:1)
     */
    vsphereCredentialConfig?: pulumi.Input<inputs.CloudCredentialVsphereCredentialConfig>;
}

/**
 * The set of arguments for constructing a CloudCredential resource.
 */
export interface CloudCredentialArgs {
    /**
     * AWS config for the Cloud Credential (list maxitems:1)
     */
    amazonec2CredentialConfig?: pulumi.Input<inputs.CloudCredentialAmazonec2CredentialConfig>;
    /**
     * Annotations for Cloud Credential object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Azure config for the Cloud Credential (list maxitems:1)
     */
    azureCredentialConfig?: pulumi.Input<inputs.CloudCredentialAzureCredentialConfig>;
    /**
     * Description for the Cloud Credential (string)
     */
    description?: pulumi.Input<string>;
    /**
     * DigitalOcean config for the Cloud Credential (list maxitems:1)
     */
    digitaloceanCredentialConfig?: pulumi.Input<inputs.CloudCredentialDigitaloceanCredentialConfig>;
    /**
     * Google config for the Cloud Credential (list maxitems:1)
     */
    googleCredentialConfig?: pulumi.Input<inputs.CloudCredentialGoogleCredentialConfig>;
    /**
     * Labels for Cloud Credential object (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Linode config for the Cloud Credential (list maxitems:1)
     */
    linodeCredentialConfig?: pulumi.Input<inputs.CloudCredentialLinodeCredentialConfig>;
    /**
     * The name of the Cloud Credential (string)
     */
    name?: pulumi.Input<string>;
    /**
     * OpenStack config for the Cloud Credential (list maxitems:1)
     */
    openstackCredentialConfig?: pulumi.Input<inputs.CloudCredentialOpenstackCredentialConfig>;
    /**
     * S3 config for the Cloud Credential. Just for Rancher 2.6.0 and above (list maxitems:1)
     */
    s3CredentialConfig?: pulumi.Input<inputs.CloudCredentialS3CredentialConfig>;
    /**
     * vSphere config for the Cloud Credential (list maxitems:1)
     */
    vsphereCredentialConfig?: pulumi.Input<inputs.CloudCredentialVsphereCredentialConfig>;
}
