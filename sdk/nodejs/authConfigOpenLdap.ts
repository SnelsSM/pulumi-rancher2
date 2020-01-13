// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Auth Config OpenLdap resource. This can be used to configure and enable Auth Config OpenLdap for Rancher v2 RKE clusters and retrieve their information.
 * 
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/auth_config_openldap.html.markdown.
 */
export class AuthConfigOpenLdap extends pulumi.CustomResource {
    /**
     * Get an existing AuthConfigOpenLdap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthConfigOpenLdapState, opts?: pulumi.CustomResourceOptions): AuthConfigOpenLdap {
        return new AuthConfigOpenLdap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/authConfigOpenLdap:AuthConfigOpenLdap';

    /**
     * Returns true if the given object is an instance of AuthConfigOpenLdap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthConfigOpenLdap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthConfigOpenLdap.__pulumiType;
    }

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    public readonly accessMode!: pulumi.Output<string | undefined>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
     */
    public readonly allowedPrincipalIds!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    /**
     * OpenLdap connection timeout. Default `5000` (int)
     */
    public readonly connectionTimeout!: pulumi.Output<number | undefined>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Group DN attribute. Default `entryDN` (string)
     */
    public readonly groupDnAttribute!: pulumi.Output<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    public readonly groupMemberMappingAttribute!: pulumi.Output<string>;
    /**
     * Group member user attribute. Default `entryDN` (string)
     */
    public readonly groupMemberUserAttribute!: pulumi.Output<string>;
    /**
     * Group name attribute. Default `cn` (string)
     */
    public readonly groupNameAttribute!: pulumi.Output<string>;
    /**
     * Group object class. Default `groupOfNames` (string)
     */
    public readonly groupObjectClass!: pulumi.Output<string>;
    /**
     * Group search attribute. Default `cn` (string)
     */
    public readonly groupSearchAttribute!: pulumi.Output<string>;
    /**
     * Group search base (string)
     */
    public readonly groupSearchBase!: pulumi.Output<string>;
    /**
     * Labels of the resource (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    public readonly nestedGroupMembershipEnabled!: pulumi.Output<boolean>;
    /**
     * OpenLdap port. Default `389` (int)
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * OpenLdap servers list (list)
     */
    public readonly servers!: pulumi.Output<string[]>;
    /**
     * Service account DN for access OpenLdap service (string)
     */
    public readonly serviceAccountDistinguishedName!: pulumi.Output<string>;
    /**
     * Service account password for access OpenLdap service (string)
     */
    public readonly serviceAccountPassword!: pulumi.Output<string>;
    /**
     * Enable TLS connection (bool)
     */
    public readonly tls!: pulumi.Output<boolean>;
    /**
     * (Computed) The type of the resource (string)
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * User disabled bit mask (int)
     */
    public readonly userDisabledBitMask!: pulumi.Output<number>;
    /**
     * User enable attribute (string)
     */
    public readonly userEnabledAttribute!: pulumi.Output<string>;
    /**
     * User login attribute. Default `uid` (string)
     */
    public readonly userLoginAttribute!: pulumi.Output<string>;
    /**
     * User member attribute. Default `memberOf` (string)
     */
    public readonly userMemberAttribute!: pulumi.Output<string>;
    /**
     * User name attribute. Default `givenName` (string)
     */
    public readonly userNameAttribute!: pulumi.Output<string>;
    /**
     * User object class. Default `inetorgperson` (string)
     */
    public readonly userObjectClass!: pulumi.Output<string>;
    /**
     * User search attribute. Default `uid|sn|givenName` (string)
     */
    public readonly userSearchAttribute!: pulumi.Output<string>;
    /**
     * User search base DN (string)
     */
    public readonly userSearchBase!: pulumi.Output<string>;

    /**
     * Create a AuthConfigOpenLdap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthConfigOpenLdapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthConfigOpenLdapArgs | AuthConfigOpenLdapState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthConfigOpenLdapState | undefined;
            inputs["accessMode"] = state ? state.accessMode : undefined;
            inputs["allowedPrincipalIds"] = state ? state.allowedPrincipalIds : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["connectionTimeout"] = state ? state.connectionTimeout : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["groupDnAttribute"] = state ? state.groupDnAttribute : undefined;
            inputs["groupMemberMappingAttribute"] = state ? state.groupMemberMappingAttribute : undefined;
            inputs["groupMemberUserAttribute"] = state ? state.groupMemberUserAttribute : undefined;
            inputs["groupNameAttribute"] = state ? state.groupNameAttribute : undefined;
            inputs["groupObjectClass"] = state ? state.groupObjectClass : undefined;
            inputs["groupSearchAttribute"] = state ? state.groupSearchAttribute : undefined;
            inputs["groupSearchBase"] = state ? state.groupSearchBase : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nestedGroupMembershipEnabled"] = state ? state.nestedGroupMembershipEnabled : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["servers"] = state ? state.servers : undefined;
            inputs["serviceAccountDistinguishedName"] = state ? state.serviceAccountDistinguishedName : undefined;
            inputs["serviceAccountPassword"] = state ? state.serviceAccountPassword : undefined;
            inputs["tls"] = state ? state.tls : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["userDisabledBitMask"] = state ? state.userDisabledBitMask : undefined;
            inputs["userEnabledAttribute"] = state ? state.userEnabledAttribute : undefined;
            inputs["userLoginAttribute"] = state ? state.userLoginAttribute : undefined;
            inputs["userMemberAttribute"] = state ? state.userMemberAttribute : undefined;
            inputs["userNameAttribute"] = state ? state.userNameAttribute : undefined;
            inputs["userObjectClass"] = state ? state.userObjectClass : undefined;
            inputs["userSearchAttribute"] = state ? state.userSearchAttribute : undefined;
            inputs["userSearchBase"] = state ? state.userSearchBase : undefined;
        } else {
            const args = argsOrState as AuthConfigOpenLdapArgs | undefined;
            if (!args || args.servers === undefined) {
                throw new Error("Missing required property 'servers'");
            }
            if (!args || args.serviceAccountDistinguishedName === undefined) {
                throw new Error("Missing required property 'serviceAccountDistinguishedName'");
            }
            if (!args || args.serviceAccountPassword === undefined) {
                throw new Error("Missing required property 'serviceAccountPassword'");
            }
            if (!args || args.userSearchBase === undefined) {
                throw new Error("Missing required property 'userSearchBase'");
            }
            inputs["accessMode"] = args ? args.accessMode : undefined;
            inputs["allowedPrincipalIds"] = args ? args.allowedPrincipalIds : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["connectionTimeout"] = args ? args.connectionTimeout : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["groupDnAttribute"] = args ? args.groupDnAttribute : undefined;
            inputs["groupMemberMappingAttribute"] = args ? args.groupMemberMappingAttribute : undefined;
            inputs["groupMemberUserAttribute"] = args ? args.groupMemberUserAttribute : undefined;
            inputs["groupNameAttribute"] = args ? args.groupNameAttribute : undefined;
            inputs["groupObjectClass"] = args ? args.groupObjectClass : undefined;
            inputs["groupSearchAttribute"] = args ? args.groupSearchAttribute : undefined;
            inputs["groupSearchBase"] = args ? args.groupSearchBase : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["nestedGroupMembershipEnabled"] = args ? args.nestedGroupMembershipEnabled : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["servers"] = args ? args.servers : undefined;
            inputs["serviceAccountDistinguishedName"] = args ? args.serviceAccountDistinguishedName : undefined;
            inputs["serviceAccountPassword"] = args ? args.serviceAccountPassword : undefined;
            inputs["tls"] = args ? args.tls : undefined;
            inputs["userDisabledBitMask"] = args ? args.userDisabledBitMask : undefined;
            inputs["userEnabledAttribute"] = args ? args.userEnabledAttribute : undefined;
            inputs["userLoginAttribute"] = args ? args.userLoginAttribute : undefined;
            inputs["userMemberAttribute"] = args ? args.userMemberAttribute : undefined;
            inputs["userNameAttribute"] = args ? args.userNameAttribute : undefined;
            inputs["userObjectClass"] = args ? args.userObjectClass : undefined;
            inputs["userSearchAttribute"] = args ? args.userSearchAttribute : undefined;
            inputs["userSearchBase"] = args ? args.userSearchBase : undefined;
            inputs["name"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AuthConfigOpenLdap.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthConfigOpenLdap resources.
 */
export interface AuthConfigOpenLdapState {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * OpenLdap connection timeout. Default `5000` (int)
     */
    readonly connectionTimeout?: pulumi.Input<number>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `entryDN` (string)
     */
    readonly groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    readonly groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `entryDN` (string)
     */
    readonly groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `cn` (string)
     */
    readonly groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `groupOfNames` (string)
     */
    readonly groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `cn` (string)
     */
    readonly groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    readonly groupSearchBase?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    readonly nestedGroupMembershipEnabled?: pulumi.Input<boolean>;
    /**
     * OpenLdap port. Default `389` (int)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * OpenLdap servers list (list)
     */
    readonly servers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account DN for access OpenLdap service (string)
     */
    readonly serviceAccountDistinguishedName?: pulumi.Input<string>;
    /**
     * Service account password for access OpenLdap service (string)
     */
    readonly serviceAccountPassword?: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    readonly tls?: pulumi.Input<boolean>;
    /**
     * (Computed) The type of the resource (string)
     */
    readonly type?: pulumi.Input<string>;
    /**
     * User disabled bit mask (int)
     */
    readonly userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    readonly userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `uid` (string)
     */
    readonly userLoginAttribute?: pulumi.Input<string>;
    /**
     * User member attribute. Default `memberOf` (string)
     */
    readonly userMemberAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `givenName` (string)
     */
    readonly userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `inetorgperson` (string)
     */
    readonly userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `uid|sn|givenName` (string)
     */
    readonly userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    readonly userSearchBase?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthConfigOpenLdap resource.
 */
export interface AuthConfigOpenLdapArgs {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `openldap_user://<DN>`  `openldap_group://<DN>` (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * OpenLdap connection timeout. Default `5000` (int)
     */
    readonly connectionTimeout?: pulumi.Input<number>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `entryDN` (string)
     */
    readonly groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    readonly groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `entryDN` (string)
     */
    readonly groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `cn` (string)
     */
    readonly groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `groupOfNames` (string)
     */
    readonly groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `cn` (string)
     */
    readonly groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    readonly groupSearchBase?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    readonly nestedGroupMembershipEnabled?: pulumi.Input<boolean>;
    /**
     * OpenLdap port. Default `389` (int)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * OpenLdap servers list (list)
     */
    readonly servers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account DN for access OpenLdap service (string)
     */
    readonly serviceAccountDistinguishedName: pulumi.Input<string>;
    /**
     * Service account password for access OpenLdap service (string)
     */
    readonly serviceAccountPassword: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    readonly tls?: pulumi.Input<boolean>;
    /**
     * User disabled bit mask (int)
     */
    readonly userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    readonly userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `uid` (string)
     */
    readonly userLoginAttribute?: pulumi.Input<string>;
    /**
     * User member attribute. Default `memberOf` (string)
     */
    readonly userMemberAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `givenName` (string)
     */
    readonly userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `inetorgperson` (string)
     */
    readonly userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `uid|sn|givenName` (string)
     */
    readonly userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    readonly userSearchBase: pulumi.Input<string>;
}
