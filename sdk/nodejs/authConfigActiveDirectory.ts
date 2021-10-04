// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Auth Config ActiveDirectory resource. This can be used to configure and enable Auth Config ActiveDirectory for Rancher v2 RKE clusters and retrieve their information.
 *
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 */
export class AuthConfigActiveDirectory extends pulumi.CustomResource {
    /**
     * Get an existing AuthConfigActiveDirectory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthConfigActiveDirectoryState, opts?: pulumi.CustomResourceOptions): AuthConfigActiveDirectory {
        return new AuthConfigActiveDirectory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory';

    /**
     * Returns true if the given object is an instance of AuthConfigActiveDirectory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthConfigActiveDirectory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthConfigActiveDirectory.__pulumiType;
    }

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    public readonly accessMode!: pulumi.Output<string | undefined>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
     */
    public readonly allowedPrincipalIds!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * CA certificate for TLS if selfsigned (string)
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     */
    public readonly connectionTimeout!: pulumi.Output<number | undefined>;
    /**
     * ActiveDirectory defult login domain (string)
     */
    public readonly defaultLoginDomain!: pulumi.Output<string | undefined>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     */
    public readonly groupDnAttribute!: pulumi.Output<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    public readonly groupMemberMappingAttribute!: pulumi.Output<string>;
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     */
    public readonly groupMemberUserAttribute!: pulumi.Output<string>;
    /**
     * Group name attribute. Default `name` (string)
     */
    public readonly groupNameAttribute!: pulumi.Output<string>;
    /**
     * Group object class. Default `group` (string)
     */
    public readonly groupObjectClass!: pulumi.Output<string>;
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     */
    public readonly groupSearchAttribute!: pulumi.Output<string>;
    /**
     * Group search base (string)
     */
    public readonly groupSearchBase!: pulumi.Output<string>;
    /**
     * Group search filter (string)
     */
    public readonly groupSearchFilter!: pulumi.Output<string>;
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
     * ActiveDirectory port. Default `389` (int)
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * ActiveDirectory servers list (list)
     */
    public readonly servers!: pulumi.Output<string[]>;
    /**
     * Service account password for access ActiveDirectory service (string)
     */
    public readonly serviceAccountPassword!: pulumi.Output<string>;
    /**
     * Service account DN for access ActiveDirectory service (string)
     */
    public readonly serviceAccountUsername!: pulumi.Output<string>;
    /**
     * Enable start TLS connection (bool)
     */
    public readonly startTls!: pulumi.Output<boolean>;
    /**
     * Password for test access to ActiveDirectory service (string)
     */
    public readonly testPassword!: pulumi.Output<string>;
    /**
     * Username for test access to ActiveDirectory service (string)
     */
    public readonly testUsername!: pulumi.Output<string>;
    /**
     * Enable TLS connection (bool)
     */
    public readonly tls!: pulumi.Output<boolean>;
    /**
     * (Computed) The type of the resource (string)
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * User disabled bit mask. Default `2` (int)
     */
    public readonly userDisabledBitMask!: pulumi.Output<number | undefined>;
    /**
     * User enable attribute (string)
     */
    public readonly userEnabledAttribute!: pulumi.Output<string>;
    /**
     * User login attribute. Default `sAMAccountName` (string)
     */
    public readonly userLoginAttribute!: pulumi.Output<string>;
    /**
     * User name attribute. Default `name` (string)
     */
    public readonly userNameAttribute!: pulumi.Output<string>;
    /**
     * User object class. Default `person` (string)
     */
    public readonly userObjectClass!: pulumi.Output<string>;
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     */
    public readonly userSearchAttribute!: pulumi.Output<string>;
    /**
     * User search base DN (string)
     */
    public readonly userSearchBase!: pulumi.Output<string>;
    /**
     * User search filter (string)
     */
    public readonly userSearchFilter!: pulumi.Output<string>;

    /**
     * Create a AuthConfigActiveDirectory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthConfigActiveDirectoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthConfigActiveDirectoryArgs | AuthConfigActiveDirectoryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthConfigActiveDirectoryState | undefined;
            inputs["accessMode"] = state ? state.accessMode : undefined;
            inputs["allowedPrincipalIds"] = state ? state.allowedPrincipalIds : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["connectionTimeout"] = state ? state.connectionTimeout : undefined;
            inputs["defaultLoginDomain"] = state ? state.defaultLoginDomain : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["groupDnAttribute"] = state ? state.groupDnAttribute : undefined;
            inputs["groupMemberMappingAttribute"] = state ? state.groupMemberMappingAttribute : undefined;
            inputs["groupMemberUserAttribute"] = state ? state.groupMemberUserAttribute : undefined;
            inputs["groupNameAttribute"] = state ? state.groupNameAttribute : undefined;
            inputs["groupObjectClass"] = state ? state.groupObjectClass : undefined;
            inputs["groupSearchAttribute"] = state ? state.groupSearchAttribute : undefined;
            inputs["groupSearchBase"] = state ? state.groupSearchBase : undefined;
            inputs["groupSearchFilter"] = state ? state.groupSearchFilter : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nestedGroupMembershipEnabled"] = state ? state.nestedGroupMembershipEnabled : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["servers"] = state ? state.servers : undefined;
            inputs["serviceAccountPassword"] = state ? state.serviceAccountPassword : undefined;
            inputs["serviceAccountUsername"] = state ? state.serviceAccountUsername : undefined;
            inputs["startTls"] = state ? state.startTls : undefined;
            inputs["testPassword"] = state ? state.testPassword : undefined;
            inputs["testUsername"] = state ? state.testUsername : undefined;
            inputs["tls"] = state ? state.tls : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["userDisabledBitMask"] = state ? state.userDisabledBitMask : undefined;
            inputs["userEnabledAttribute"] = state ? state.userEnabledAttribute : undefined;
            inputs["userLoginAttribute"] = state ? state.userLoginAttribute : undefined;
            inputs["userNameAttribute"] = state ? state.userNameAttribute : undefined;
            inputs["userObjectClass"] = state ? state.userObjectClass : undefined;
            inputs["userSearchAttribute"] = state ? state.userSearchAttribute : undefined;
            inputs["userSearchBase"] = state ? state.userSearchBase : undefined;
            inputs["userSearchFilter"] = state ? state.userSearchFilter : undefined;
        } else {
            const args = argsOrState as AuthConfigActiveDirectoryArgs | undefined;
            if ((!args || args.servers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servers'");
            }
            if ((!args || args.serviceAccountPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceAccountPassword'");
            }
            if ((!args || args.serviceAccountUsername === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceAccountUsername'");
            }
            if ((!args || args.testPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'testPassword'");
            }
            if ((!args || args.testUsername === undefined) && !opts.urn) {
                throw new Error("Missing required property 'testUsername'");
            }
            if ((!args || args.userSearchBase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userSearchBase'");
            }
            inputs["accessMode"] = args ? args.accessMode : undefined;
            inputs["allowedPrincipalIds"] = args ? args.allowedPrincipalIds : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["connectionTimeout"] = args ? args.connectionTimeout : undefined;
            inputs["defaultLoginDomain"] = args ? args.defaultLoginDomain : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["groupDnAttribute"] = args ? args.groupDnAttribute : undefined;
            inputs["groupMemberMappingAttribute"] = args ? args.groupMemberMappingAttribute : undefined;
            inputs["groupMemberUserAttribute"] = args ? args.groupMemberUserAttribute : undefined;
            inputs["groupNameAttribute"] = args ? args.groupNameAttribute : undefined;
            inputs["groupObjectClass"] = args ? args.groupObjectClass : undefined;
            inputs["groupSearchAttribute"] = args ? args.groupSearchAttribute : undefined;
            inputs["groupSearchBase"] = args ? args.groupSearchBase : undefined;
            inputs["groupSearchFilter"] = args ? args.groupSearchFilter : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["nestedGroupMembershipEnabled"] = args ? args.nestedGroupMembershipEnabled : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["servers"] = args ? args.servers : undefined;
            inputs["serviceAccountPassword"] = args ? args.serviceAccountPassword : undefined;
            inputs["serviceAccountUsername"] = args ? args.serviceAccountUsername : undefined;
            inputs["startTls"] = args ? args.startTls : undefined;
            inputs["testPassword"] = args ? args.testPassword : undefined;
            inputs["testUsername"] = args ? args.testUsername : undefined;
            inputs["tls"] = args ? args.tls : undefined;
            inputs["userDisabledBitMask"] = args ? args.userDisabledBitMask : undefined;
            inputs["userEnabledAttribute"] = args ? args.userEnabledAttribute : undefined;
            inputs["userLoginAttribute"] = args ? args.userLoginAttribute : undefined;
            inputs["userNameAttribute"] = args ? args.userNameAttribute : undefined;
            inputs["userObjectClass"] = args ? args.userObjectClass : undefined;
            inputs["userSearchAttribute"] = args ? args.userSearchAttribute : undefined;
            inputs["userSearchBase"] = args ? args.userSearchBase : undefined;
            inputs["userSearchFilter"] = args ? args.userSearchFilter : undefined;
            inputs["name"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        const aliasOpts = { aliases: [{ type: "rancher2:index/activeDirectory:ActiveDirectory" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(AuthConfigActiveDirectory.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthConfigActiveDirectory resources.
 */
export interface AuthConfigActiveDirectoryState {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * CA certificate for TLS if selfsigned (string)
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     */
    readonly connectionTimeout?: pulumi.Input<number>;
    /**
     * ActiveDirectory defult login domain (string)
     */
    readonly defaultLoginDomain?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     */
    readonly groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    readonly groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     */
    readonly groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `name` (string)
     */
    readonly groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `group` (string)
     */
    readonly groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     */
    readonly groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    readonly groupSearchBase?: pulumi.Input<string>;
    /**
     * Group search filter (string)
     */
    readonly groupSearchFilter?: pulumi.Input<string>;
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
     * ActiveDirectory port. Default `389` (int)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * ActiveDirectory servers list (list)
     */
    readonly servers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account password for access ActiveDirectory service (string)
     */
    readonly serviceAccountPassword?: pulumi.Input<string>;
    /**
     * Service account DN for access ActiveDirectory service (string)
     */
    readonly serviceAccountUsername?: pulumi.Input<string>;
    /**
     * Enable start TLS connection (bool)
     */
    readonly startTls?: pulumi.Input<boolean>;
    /**
     * Password for test access to ActiveDirectory service (string)
     */
    readonly testPassword?: pulumi.Input<string>;
    /**
     * Username for test access to ActiveDirectory service (string)
     */
    readonly testUsername?: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    readonly tls?: pulumi.Input<boolean>;
    /**
     * (Computed) The type of the resource (string)
     */
    readonly type?: pulumi.Input<string>;
    /**
     * User disabled bit mask. Default `2` (int)
     */
    readonly userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    readonly userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `sAMAccountName` (string)
     */
    readonly userLoginAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `name` (string)
     */
    readonly userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `person` (string)
     */
    readonly userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     */
    readonly userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    readonly userSearchBase?: pulumi.Input<string>;
    /**
     * User search filter (string)
     */
    readonly userSearchFilter?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthConfigActiveDirectory resource.
 */
export interface AuthConfigActiveDirectoryArgs {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * CA certificate for TLS if selfsigned (string)
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     */
    readonly connectionTimeout?: pulumi.Input<number>;
    /**
     * ActiveDirectory defult login domain (string)
     */
    readonly defaultLoginDomain?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     */
    readonly groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    readonly groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     */
    readonly groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `name` (string)
     */
    readonly groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `group` (string)
     */
    readonly groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     */
    readonly groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    readonly groupSearchBase?: pulumi.Input<string>;
    /**
     * Group search filter (string)
     */
    readonly groupSearchFilter?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    readonly nestedGroupMembershipEnabled?: pulumi.Input<boolean>;
    /**
     * ActiveDirectory port. Default `389` (int)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * ActiveDirectory servers list (list)
     */
    readonly servers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account password for access ActiveDirectory service (string)
     */
    readonly serviceAccountPassword: pulumi.Input<string>;
    /**
     * Service account DN for access ActiveDirectory service (string)
     */
    readonly serviceAccountUsername: pulumi.Input<string>;
    /**
     * Enable start TLS connection (bool)
     */
    readonly startTls?: pulumi.Input<boolean>;
    /**
     * Password for test access to ActiveDirectory service (string)
     */
    readonly testPassword: pulumi.Input<string>;
    /**
     * Username for test access to ActiveDirectory service (string)
     */
    readonly testUsername: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    readonly tls?: pulumi.Input<boolean>;
    /**
     * User disabled bit mask. Default `2` (int)
     */
    readonly userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    readonly userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `sAMAccountName` (string)
     */
    readonly userLoginAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `name` (string)
     */
    readonly userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `person` (string)
     */
    readonly userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     */
    readonly userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    readonly userSearchBase: pulumi.Input<string>;
    /**
     * User search filter (string)
     */
    readonly userSearchFilter?: pulumi.Input<string>;
}
