// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Auth Config ActiveDirectory resource. This can be used to configure and enable Auth Config ActiveDirectory for Rancher v2 RKE clusters and retrieve their information.
 *
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 *
 * @deprecated rancher2.ActiveDirectory has been deprecated in favor of rancher2.AuthConfigActiveDirectory
 */
export class ActiveDirectory extends pulumi.CustomResource {
    /**
     * Get an existing ActiveDirectory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ActiveDirectoryState, opts?: pulumi.CustomResourceOptions): ActiveDirectory {
        pulumi.log.warn("ActiveDirectory is deprecated: rancher2.ActiveDirectory has been deprecated in favor of rancher2.AuthConfigActiveDirectory")
        return new ActiveDirectory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/activeDirectory:ActiveDirectory';

    /**
     * Returns true if the given object is an instance of ActiveDirectory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ActiveDirectory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ActiveDirectory.__pulumiType;
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
     * Create a ActiveDirectory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated rancher2.ActiveDirectory has been deprecated in favor of rancher2.AuthConfigActiveDirectory */
    constructor(name: string, args: ActiveDirectoryArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated rancher2.ActiveDirectory has been deprecated in favor of rancher2.AuthConfigActiveDirectory */
    constructor(name: string, argsOrState?: ActiveDirectoryArgs | ActiveDirectoryState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("ActiveDirectory is deprecated: rancher2.ActiveDirectory has been deprecated in favor of rancher2.AuthConfigActiveDirectory")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ActiveDirectoryState | undefined;
            resourceInputs["accessMode"] = state ? state.accessMode : undefined;
            resourceInputs["allowedPrincipalIds"] = state ? state.allowedPrincipalIds : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["connectionTimeout"] = state ? state.connectionTimeout : undefined;
            resourceInputs["defaultLoginDomain"] = state ? state.defaultLoginDomain : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["groupDnAttribute"] = state ? state.groupDnAttribute : undefined;
            resourceInputs["groupMemberMappingAttribute"] = state ? state.groupMemberMappingAttribute : undefined;
            resourceInputs["groupMemberUserAttribute"] = state ? state.groupMemberUserAttribute : undefined;
            resourceInputs["groupNameAttribute"] = state ? state.groupNameAttribute : undefined;
            resourceInputs["groupObjectClass"] = state ? state.groupObjectClass : undefined;
            resourceInputs["groupSearchAttribute"] = state ? state.groupSearchAttribute : undefined;
            resourceInputs["groupSearchBase"] = state ? state.groupSearchBase : undefined;
            resourceInputs["groupSearchFilter"] = state ? state.groupSearchFilter : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nestedGroupMembershipEnabled"] = state ? state.nestedGroupMembershipEnabled : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["servers"] = state ? state.servers : undefined;
            resourceInputs["serviceAccountPassword"] = state ? state.serviceAccountPassword : undefined;
            resourceInputs["serviceAccountUsername"] = state ? state.serviceAccountUsername : undefined;
            resourceInputs["startTls"] = state ? state.startTls : undefined;
            resourceInputs["testPassword"] = state ? state.testPassword : undefined;
            resourceInputs["testUsername"] = state ? state.testUsername : undefined;
            resourceInputs["tls"] = state ? state.tls : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["userDisabledBitMask"] = state ? state.userDisabledBitMask : undefined;
            resourceInputs["userEnabledAttribute"] = state ? state.userEnabledAttribute : undefined;
            resourceInputs["userLoginAttribute"] = state ? state.userLoginAttribute : undefined;
            resourceInputs["userNameAttribute"] = state ? state.userNameAttribute : undefined;
            resourceInputs["userObjectClass"] = state ? state.userObjectClass : undefined;
            resourceInputs["userSearchAttribute"] = state ? state.userSearchAttribute : undefined;
            resourceInputs["userSearchBase"] = state ? state.userSearchBase : undefined;
            resourceInputs["userSearchFilter"] = state ? state.userSearchFilter : undefined;
        } else {
            const args = argsOrState as ActiveDirectoryArgs | undefined;
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
            resourceInputs["accessMode"] = args ? args.accessMode : undefined;
            resourceInputs["allowedPrincipalIds"] = args ? args.allowedPrincipalIds : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["connectionTimeout"] = args ? args.connectionTimeout : undefined;
            resourceInputs["defaultLoginDomain"] = args ? args.defaultLoginDomain : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["groupDnAttribute"] = args ? args.groupDnAttribute : undefined;
            resourceInputs["groupMemberMappingAttribute"] = args ? args.groupMemberMappingAttribute : undefined;
            resourceInputs["groupMemberUserAttribute"] = args ? args.groupMemberUserAttribute : undefined;
            resourceInputs["groupNameAttribute"] = args ? args.groupNameAttribute : undefined;
            resourceInputs["groupObjectClass"] = args ? args.groupObjectClass : undefined;
            resourceInputs["groupSearchAttribute"] = args ? args.groupSearchAttribute : undefined;
            resourceInputs["groupSearchBase"] = args ? args.groupSearchBase : undefined;
            resourceInputs["groupSearchFilter"] = args ? args.groupSearchFilter : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["nestedGroupMembershipEnabled"] = args ? args.nestedGroupMembershipEnabled : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["servers"] = args ? args.servers : undefined;
            resourceInputs["serviceAccountPassword"] = args ? args.serviceAccountPassword : undefined;
            resourceInputs["serviceAccountUsername"] = args ? args.serviceAccountUsername : undefined;
            resourceInputs["startTls"] = args ? args.startTls : undefined;
            resourceInputs["testPassword"] = args ? args.testPassword : undefined;
            resourceInputs["testUsername"] = args ? args.testUsername : undefined;
            resourceInputs["tls"] = args ? args.tls : undefined;
            resourceInputs["userDisabledBitMask"] = args ? args.userDisabledBitMask : undefined;
            resourceInputs["userEnabledAttribute"] = args ? args.userEnabledAttribute : undefined;
            resourceInputs["userLoginAttribute"] = args ? args.userLoginAttribute : undefined;
            resourceInputs["userNameAttribute"] = args ? args.userNameAttribute : undefined;
            resourceInputs["userObjectClass"] = args ? args.userObjectClass : undefined;
            resourceInputs["userSearchAttribute"] = args ? args.userSearchAttribute : undefined;
            resourceInputs["userSearchBase"] = args ? args.userSearchBase : undefined;
            resourceInputs["userSearchFilter"] = args ? args.userSearchFilter : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ActiveDirectory.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ActiveDirectory resources.
 */
export interface ActiveDirectoryState {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
     */
    allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * CA certificate for TLS if selfsigned (string)
     */
    certificate?: pulumi.Input<string>;
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     */
    connectionTimeout?: pulumi.Input<number>;
    /**
     * ActiveDirectory defult login domain (string)
     */
    defaultLoginDomain?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     */
    groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     */
    groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `name` (string)
     */
    groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `group` (string)
     */
    groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     */
    groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    groupSearchBase?: pulumi.Input<string>;
    /**
     * Group search filter (string)
     */
    groupSearchFilter?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    nestedGroupMembershipEnabled?: pulumi.Input<boolean>;
    /**
     * ActiveDirectory port. Default `389` (int)
     */
    port?: pulumi.Input<number>;
    /**
     * ActiveDirectory servers list (list)
     */
    servers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account password for access ActiveDirectory service (string)
     */
    serviceAccountPassword?: pulumi.Input<string>;
    /**
     * Service account DN for access ActiveDirectory service (string)
     */
    serviceAccountUsername?: pulumi.Input<string>;
    /**
     * Enable start TLS connection (bool)
     */
    startTls?: pulumi.Input<boolean>;
    /**
     * Password for test access to ActiveDirectory service (string)
     */
    testPassword?: pulumi.Input<string>;
    /**
     * Username for test access to ActiveDirectory service (string)
     */
    testUsername?: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    tls?: pulumi.Input<boolean>;
    /**
     * (Computed) The type of the resource (string)
     */
    type?: pulumi.Input<string>;
    /**
     * User disabled bit mask. Default `2` (int)
     */
    userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `sAMAccountName` (string)
     */
    userLoginAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `name` (string)
     */
    userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `person` (string)
     */
    userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     */
    userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    userSearchBase?: pulumi.Input<string>;
    /**
     * User search filter (string)
     */
    userSearchFilter?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ActiveDirectory resource.
 */
export interface ActiveDirectoryArgs {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
     */
    allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * CA certificate for TLS if selfsigned (string)
     */
    certificate?: pulumi.Input<string>;
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     */
    connectionTimeout?: pulumi.Input<number>;
    /**
     * ActiveDirectory defult login domain (string)
     */
    defaultLoginDomain?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     */
    groupDnAttribute?: pulumi.Input<string>;
    /**
     * Group member mapping attribute. Default `member` (string)
     */
    groupMemberMappingAttribute?: pulumi.Input<string>;
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     */
    groupMemberUserAttribute?: pulumi.Input<string>;
    /**
     * Group name attribute. Default `name` (string)
     */
    groupNameAttribute?: pulumi.Input<string>;
    /**
     * Group object class. Default `group` (string)
     */
    groupObjectClass?: pulumi.Input<string>;
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     */
    groupSearchAttribute?: pulumi.Input<string>;
    /**
     * Group search base (string)
     */
    groupSearchBase?: pulumi.Input<string>;
    /**
     * Group search filter (string)
     */
    groupSearchFilter?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Nested group membership enable. Default `false` (bool)
     */
    nestedGroupMembershipEnabled?: pulumi.Input<boolean>;
    /**
     * ActiveDirectory port. Default `389` (int)
     */
    port?: pulumi.Input<number>;
    /**
     * ActiveDirectory servers list (list)
     */
    servers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service account password for access ActiveDirectory service (string)
     */
    serviceAccountPassword: pulumi.Input<string>;
    /**
     * Service account DN for access ActiveDirectory service (string)
     */
    serviceAccountUsername: pulumi.Input<string>;
    /**
     * Enable start TLS connection (bool)
     */
    startTls?: pulumi.Input<boolean>;
    /**
     * Password for test access to ActiveDirectory service (string)
     */
    testPassword: pulumi.Input<string>;
    /**
     * Username for test access to ActiveDirectory service (string)
     */
    testUsername: pulumi.Input<string>;
    /**
     * Enable TLS connection (bool)
     */
    tls?: pulumi.Input<boolean>;
    /**
     * User disabled bit mask. Default `2` (int)
     */
    userDisabledBitMask?: pulumi.Input<number>;
    /**
     * User enable attribute (string)
     */
    userEnabledAttribute?: pulumi.Input<string>;
    /**
     * User login attribute. Default `sAMAccountName` (string)
     */
    userLoginAttribute?: pulumi.Input<string>;
    /**
     * User name attribute. Default `name` (string)
     */
    userNameAttribute?: pulumi.Input<string>;
    /**
     * User object class. Default `person` (string)
     */
    userObjectClass?: pulumi.Input<string>;
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     */
    userSearchAttribute?: pulumi.Input<string>;
    /**
     * User search base DN (string)
     */
    userSearchBase: pulumi.Input<string>;
    /**
     * User search filter (string)
     */
    userSearchFilter?: pulumi.Input<string>;
}
