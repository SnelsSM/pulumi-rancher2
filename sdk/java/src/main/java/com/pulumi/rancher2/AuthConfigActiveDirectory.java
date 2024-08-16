// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigActiveDirectoryArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigActiveDirectoryState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Auth Config ActiveDirectory resource. This can be used to configure and enable Auth Config ActiveDirectory for Rancher v2 RKE clusters and retrieve their information.
 * 
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 * 
 */
@ResourceType(type="rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory")
public class AuthConfigActiveDirectory extends com.pulumi.resources.CustomResource {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Export(name="accessMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Output<Optional<String>> accessMode() {
        return Codegen.optional(this.accessMode);
    }
    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
     * 
     */
    @Export(name="allowedPrincipalIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
     * 
     */
    public Output<Optional<List<String>>> allowedPrincipalIds() {
        return Codegen.optional(this.allowedPrincipalIds);
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * CA certificate for TLS if selfsigned (string)
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificate;

    /**
     * @return CA certificate for TLS if selfsigned (string)
     * 
     */
    public Output<Optional<String>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     * 
     */
    @Export(name="connectionTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> connectionTimeout;

    /**
     * @return ActiveDirectory connection timeout. Default `5000` (int)
     * 
     */
    public Output<Optional<Integer>> connectionTimeout() {
        return Codegen.optional(this.connectionTimeout);
    }
    /**
     * ActiveDirectory defult login domain (string)
     * 
     */
    @Export(name="defaultLoginDomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultLoginDomain;

    /**
     * @return ActiveDirectory defult login domain (string)
     * 
     */
    public Output<Optional<String>> defaultLoginDomain() {
        return Codegen.optional(this.defaultLoginDomain);
    }
    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Group DN attribute. Default `distinguishedName` (string)
     * 
     */
    @Export(name="groupDnAttribute", refs={String.class}, tree="[0]")
    private Output<String> groupDnAttribute;

    /**
     * @return Group DN attribute. Default `distinguishedName` (string)
     * 
     */
    public Output<String> groupDnAttribute() {
        return this.groupDnAttribute;
    }
    /**
     * Group member mapping attribute. Default `member` (string)
     * 
     */
    @Export(name="groupMemberMappingAttribute", refs={String.class}, tree="[0]")
    private Output<String> groupMemberMappingAttribute;

    /**
     * @return Group member mapping attribute. Default `member` (string)
     * 
     */
    public Output<String> groupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }
    /**
     * Group member user attribute. Default `distinguishedName` (string)
     * 
     */
    @Export(name="groupMemberUserAttribute", refs={String.class}, tree="[0]")
    private Output<String> groupMemberUserAttribute;

    /**
     * @return Group member user attribute. Default `distinguishedName` (string)
     * 
     */
    public Output<String> groupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }
    /**
     * Group name attribute. Default `name` (string)
     * 
     */
    @Export(name="groupNameAttribute", refs={String.class}, tree="[0]")
    private Output<String> groupNameAttribute;

    /**
     * @return Group name attribute. Default `name` (string)
     * 
     */
    public Output<String> groupNameAttribute() {
        return this.groupNameAttribute;
    }
    /**
     * Group object class. Default `group` (string)
     * 
     */
    @Export(name="groupObjectClass", refs={String.class}, tree="[0]")
    private Output<String> groupObjectClass;

    /**
     * @return Group object class. Default `group` (string)
     * 
     */
    public Output<String> groupObjectClass() {
        return this.groupObjectClass;
    }
    /**
     * Group search attribute. Default `sAMAccountName` (string)
     * 
     */
    @Export(name="groupSearchAttribute", refs={String.class}, tree="[0]")
    private Output<String> groupSearchAttribute;

    /**
     * @return Group search attribute. Default `sAMAccountName` (string)
     * 
     */
    public Output<String> groupSearchAttribute() {
        return this.groupSearchAttribute;
    }
    /**
     * Group search base (string)
     * 
     */
    @Export(name="groupSearchBase", refs={String.class}, tree="[0]")
    private Output<String> groupSearchBase;

    /**
     * @return Group search base (string)
     * 
     */
    public Output<String> groupSearchBase() {
        return this.groupSearchBase;
    }
    /**
     * Group search filter (string)
     * 
     */
    @Export(name="groupSearchFilter", refs={String.class}, tree="[0]")
    private Output<String> groupSearchFilter;

    /**
     * @return Group search filter (string)
     * 
     */
    public Output<String> groupSearchFilter() {
        return this.groupSearchFilter;
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * (Computed) The name of the resource (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Nested group membership enable. Default `false` (bool)
     * 
     */
    @Export(name="nestedGroupMembershipEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> nestedGroupMembershipEnabled;

    /**
     * @return Nested group membership enable. Default `false` (bool)
     * 
     */
    public Output<Boolean> nestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }
    /**
     * ActiveDirectory port. Default `389` (int)
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return ActiveDirectory port. Default `389` (int)
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * ActiveDirectory servers list (list)
     * 
     */
    @Export(name="servers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> servers;

    /**
     * @return ActiveDirectory servers list (list)
     * 
     */
    public Output<List<String>> servers() {
        return this.servers;
    }
    /**
     * Service account password for access ActiveDirectory service (string)
     * 
     */
    @Export(name="serviceAccountPassword", refs={String.class}, tree="[0]")
    private Output<String> serviceAccountPassword;

    /**
     * @return Service account password for access ActiveDirectory service (string)
     * 
     */
    public Output<String> serviceAccountPassword() {
        return this.serviceAccountPassword;
    }
    /**
     * Service account DN for access ActiveDirectory service (string)
     * 
     */
    @Export(name="serviceAccountUsername", refs={String.class}, tree="[0]")
    private Output<String> serviceAccountUsername;

    /**
     * @return Service account DN for access ActiveDirectory service (string)
     * 
     */
    public Output<String> serviceAccountUsername() {
        return this.serviceAccountUsername;
    }
    /**
     * Enable start TLS connection (bool)
     * 
     */
    @Export(name="startTls", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> startTls;

    /**
     * @return Enable start TLS connection (bool)
     * 
     */
    public Output<Boolean> startTls() {
        return this.startTls;
    }
    /**
     * Password for test access to ActiveDirectory service (string)
     * 
     */
    @Export(name="testPassword", refs={String.class}, tree="[0]")
    private Output<String> testPassword;

    /**
     * @return Password for test access to ActiveDirectory service (string)
     * 
     */
    public Output<String> testPassword() {
        return this.testPassword;
    }
    /**
     * Username for test access to ActiveDirectory service (string)
     * 
     */
    @Export(name="testUsername", refs={String.class}, tree="[0]")
    private Output<String> testUsername;

    /**
     * @return Username for test access to ActiveDirectory service (string)
     * 
     */
    public Output<String> testUsername() {
        return this.testUsername;
    }
    /**
     * Enable TLS connection (bool)
     * 
     */
    @Export(name="tls", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> tls;

    /**
     * @return Enable TLS connection (bool)
     * 
     */
    public Output<Boolean> tls() {
        return this.tls;
    }
    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * User disabled bit mask. Default `2` (int)
     * 
     */
    @Export(name="userDisabledBitMask", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> userDisabledBitMask;

    /**
     * @return User disabled bit mask. Default `2` (int)
     * 
     */
    public Output<Optional<Integer>> userDisabledBitMask() {
        return Codegen.optional(this.userDisabledBitMask);
    }
    /**
     * User enable attribute (string)
     * 
     */
    @Export(name="userEnabledAttribute", refs={String.class}, tree="[0]")
    private Output<String> userEnabledAttribute;

    /**
     * @return User enable attribute (string)
     * 
     */
    public Output<String> userEnabledAttribute() {
        return this.userEnabledAttribute;
    }
    /**
     * User login attribute. Default `sAMAccountName` (string)
     * 
     */
    @Export(name="userLoginAttribute", refs={String.class}, tree="[0]")
    private Output<String> userLoginAttribute;

    /**
     * @return User login attribute. Default `sAMAccountName` (string)
     * 
     */
    public Output<String> userLoginAttribute() {
        return this.userLoginAttribute;
    }
    /**
     * User name attribute. Default `name` (string)
     * 
     */
    @Export(name="userNameAttribute", refs={String.class}, tree="[0]")
    private Output<String> userNameAttribute;

    /**
     * @return User name attribute. Default `name` (string)
     * 
     */
    public Output<String> userNameAttribute() {
        return this.userNameAttribute;
    }
    /**
     * User object class. Default `person` (string)
     * 
     */
    @Export(name="userObjectClass", refs={String.class}, tree="[0]")
    private Output<String> userObjectClass;

    /**
     * @return User object class. Default `person` (string)
     * 
     */
    public Output<String> userObjectClass() {
        return this.userObjectClass;
    }
    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     * 
     */
    @Export(name="userSearchAttribute", refs={String.class}, tree="[0]")
    private Output<String> userSearchAttribute;

    /**
     * @return User search attribute. Default `sAMAccountName|sn|givenName` (string)
     * 
     */
    public Output<String> userSearchAttribute() {
        return this.userSearchAttribute;
    }
    /**
     * User search base DN (string)
     * 
     */
    @Export(name="userSearchBase", refs={String.class}, tree="[0]")
    private Output<String> userSearchBase;

    /**
     * @return User search base DN (string)
     * 
     */
    public Output<String> userSearchBase() {
        return this.userSearchBase;
    }
    /**
     * User search filter (string)
     * 
     */
    @Export(name="userSearchFilter", refs={String.class}, tree="[0]")
    private Output<String> userSearchFilter;

    /**
     * @return User search filter (string)
     * 
     */
    public Output<String> userSearchFilter() {
        return this.userSearchFilter;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigActiveDirectory(java.lang.String name) {
        this(name, AuthConfigActiveDirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigActiveDirectory(java.lang.String name, AuthConfigActiveDirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigActiveDirectory(java.lang.String name, AuthConfigActiveDirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AuthConfigActiveDirectory(java.lang.String name, Output<java.lang.String> id, @Nullable AuthConfigActiveDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory", name, state, makeResourceOptions(options, id), false);
    }

    private static AuthConfigActiveDirectoryArgs makeArgs(AuthConfigActiveDirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AuthConfigActiveDirectoryArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "certificate",
                "serviceAccountPassword",
                "serviceAccountUsername",
                "testPassword"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AuthConfigActiveDirectory get(java.lang.String name, Output<java.lang.String> id, @Nullable AuthConfigActiveDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigActiveDirectory(name, id, state, options);
    }
}
