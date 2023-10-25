// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Auth Config OKTA resource. This can be used to configure and enable Auth Config OKTA for Rancher v2 RKE clusters and retrieve their information.
 *
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 */
export class AuthConfigOkta extends pulumi.CustomResource {
    /**
     * Get an existing AuthConfigOkta resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthConfigOktaState, opts?: pulumi.CustomResourceOptions): AuthConfigOkta {
        return new AuthConfigOkta(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/authConfigOkta:AuthConfigOkta';

    /**
     * Returns true if the given object is an instance of AuthConfigOkta.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthConfigOkta {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthConfigOkta.__pulumiType;
    }

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    public readonly accessMode!: pulumi.Output<string | undefined>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
     */
    public readonly allowedPrincipalIds!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * OKTA display name field (string)
     */
    public readonly displayNameField!: pulumi.Output<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * OKTA group field (string)
     */
    public readonly groupsField!: pulumi.Output<string>;
    /**
     * OKTA IDP metadata content (string)
     */
    public readonly idpMetadataContent!: pulumi.Output<string>;
    /**
     * Labels of the resource (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    public readonly rancherApiHost!: pulumi.Output<string>;
    /**
     * OKTA SP cert (string)
     */
    public readonly spCert!: pulumi.Output<string>;
    /**
     * OKTA SP key (string)
     */
    public readonly spKey!: pulumi.Output<string>;
    /**
     * (Computed) The type of the resource (string)
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * OKTA UID field (string)
     */
    public readonly uidField!: pulumi.Output<string>;
    /**
     * OKTA user name field (string)
     */
    public readonly userNameField!: pulumi.Output<string>;

    /**
     * Create a AuthConfigOkta resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthConfigOktaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthConfigOktaArgs | AuthConfigOktaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthConfigOktaState | undefined;
            resourceInputs["accessMode"] = state ? state.accessMode : undefined;
            resourceInputs["allowedPrincipalIds"] = state ? state.allowedPrincipalIds : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["displayNameField"] = state ? state.displayNameField : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["groupsField"] = state ? state.groupsField : undefined;
            resourceInputs["idpMetadataContent"] = state ? state.idpMetadataContent : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rancherApiHost"] = state ? state.rancherApiHost : undefined;
            resourceInputs["spCert"] = state ? state.spCert : undefined;
            resourceInputs["spKey"] = state ? state.spKey : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uidField"] = state ? state.uidField : undefined;
            resourceInputs["userNameField"] = state ? state.userNameField : undefined;
        } else {
            const args = argsOrState as AuthConfigOktaArgs | undefined;
            if ((!args || args.displayNameField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayNameField'");
            }
            if ((!args || args.groupsField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupsField'");
            }
            if ((!args || args.idpMetadataContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'idpMetadataContent'");
            }
            if ((!args || args.rancherApiHost === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rancherApiHost'");
            }
            if ((!args || args.spCert === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spCert'");
            }
            if ((!args || args.spKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spKey'");
            }
            if ((!args || args.uidField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'uidField'");
            }
            if ((!args || args.userNameField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userNameField'");
            }
            resourceInputs["accessMode"] = args ? args.accessMode : undefined;
            resourceInputs["allowedPrincipalIds"] = args ? args.allowedPrincipalIds : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["displayNameField"] = args ? args.displayNameField : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["groupsField"] = args ? args.groupsField : undefined;
            resourceInputs["idpMetadataContent"] = args?.idpMetadataContent ? pulumi.secret(args.idpMetadataContent) : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["rancherApiHost"] = args ? args.rancherApiHost : undefined;
            resourceInputs["spCert"] = args?.spCert ? pulumi.secret(args.spCert) : undefined;
            resourceInputs["spKey"] = args?.spKey ? pulumi.secret(args.spKey) : undefined;
            resourceInputs["uidField"] = args ? args.uidField : undefined;
            resourceInputs["userNameField"] = args ? args.userNameField : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["idpMetadataContent", "spCert", "spKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AuthConfigOkta.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthConfigOkta resources.
 */
export interface AuthConfigOktaState {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
     */
    allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * OKTA display name field (string)
     */
    displayNameField?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * OKTA group field (string)
     */
    groupsField?: pulumi.Input<string>;
    /**
     * OKTA IDP metadata content (string)
     */
    idpMetadataContent?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    rancherApiHost?: pulumi.Input<string>;
    /**
     * OKTA SP cert (string)
     */
    spCert?: pulumi.Input<string>;
    /**
     * OKTA SP key (string)
     */
    spKey?: pulumi.Input<string>;
    /**
     * (Computed) The type of the resource (string)
     */
    type?: pulumi.Input<string>;
    /**
     * OKTA UID field (string)
     */
    uidField?: pulumi.Input<string>;
    /**
     * OKTA user name field (string)
     */
    userNameField?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthConfigOkta resource.
 */
export interface AuthConfigOktaArgs {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
     */
    allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * OKTA display name field (string)
     */
    displayNameField: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * OKTA group field (string)
     */
    groupsField: pulumi.Input<string>;
    /**
     * OKTA IDP metadata content (string)
     */
    idpMetadataContent: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    rancherApiHost: pulumi.Input<string>;
    /**
     * OKTA SP cert (string)
     */
    spCert: pulumi.Input<string>;
    /**
     * OKTA SP key (string)
     */
    spKey: pulumi.Input<string>;
    /**
     * OKTA UID field (string)
     */
    uidField: pulumi.Input<string>;
    /**
     * OKTA user name field (string)
     */
    userNameField: pulumi.Input<string>;
}
