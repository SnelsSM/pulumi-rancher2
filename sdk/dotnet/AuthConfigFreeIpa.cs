// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Auth Config FreeIpa resource. This can be used to configure and enable Auth Config FreeIpa for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/authConfigFreeIpa.html.markdown.
    /// </summary>
    public partial class AuthConfigFreeIpa : Pulumi.CustomResource
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Output("accessMode")]
        public Output<string?> AccessMode { get; private set; } = null!;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
        /// </summary>
        [Output("allowedPrincipalIds")]
        public Output<ImmutableArray<string>> AllowedPrincipalIds { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
        /// </summary>
        [Output("certificate")]
        public Output<string?> Certificate { get; private set; } = null!;

        /// <summary>
        /// FreeIpa connection timeout. Default `5000` (int)
        /// </summary>
        [Output("connectionTimeout")]
        public Output<int?> ConnectionTimeout { get; private set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Group DN attribute. Default `entryDN` (string)
        /// </summary>
        [Output("groupDnAttribute")]
        public Output<string> GroupDnAttribute { get; private set; } = null!;

        /// <summary>
        /// Group member mapping attribute. Default `member` (string)
        /// </summary>
        [Output("groupMemberMappingAttribute")]
        public Output<string> GroupMemberMappingAttribute { get; private set; } = null!;

        /// <summary>
        /// Group member user attribute. Default `entryDN` (string)
        /// </summary>
        [Output("groupMemberUserAttribute")]
        public Output<string> GroupMemberUserAttribute { get; private set; } = null!;

        /// <summary>
        /// Group name attribute. Default `cn` (string)
        /// </summary>
        [Output("groupNameAttribute")]
        public Output<string> GroupNameAttribute { get; private set; } = null!;

        /// <summary>
        /// Group object class. Default `groupOfNames` (string)
        /// </summary>
        [Output("groupObjectClass")]
        public Output<string> GroupObjectClass { get; private set; } = null!;

        /// <summary>
        /// Group search attribute. Default `cn` (string)
        /// </summary>
        [Output("groupSearchAttribute")]
        public Output<string> GroupSearchAttribute { get; private set; } = null!;

        /// <summary>
        /// Group search base (string)
        /// </summary>
        [Output("groupSearchBase")]
        public Output<string> GroupSearchBase { get; private set; } = null!;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// (Computed) The name of the resource (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Nested group membership enable. Default `false` (bool)
        /// </summary>
        [Output("nestedGroupMembershipEnabled")]
        public Output<bool> NestedGroupMembershipEnabled { get; private set; } = null!;

        /// <summary>
        /// FreeIpa port. Default `389` (int)
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// FreeIpa servers list (list)
        /// </summary>
        [Output("servers")]
        public Output<ImmutableArray<string>> Servers { get; private set; } = null!;

        /// <summary>
        /// Service account DN for access FreeIpa service (string)
        /// </summary>
        [Output("serviceAccountDistinguishedName")]
        public Output<string> ServiceAccountDistinguishedName { get; private set; } = null!;

        /// <summary>
        /// Service account password for access FreeIpa service (string)
        /// </summary>
        [Output("serviceAccountPassword")]
        public Output<string> ServiceAccountPassword { get; private set; } = null!;

        /// <summary>
        /// Enable TLS connection (bool)
        /// </summary>
        [Output("tls")]
        public Output<bool> Tls { get; private set; } = null!;

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// User disabled bit mask (int)
        /// </summary>
        [Output("userDisabledBitMask")]
        public Output<int> UserDisabledBitMask { get; private set; } = null!;

        /// <summary>
        /// User enable attribute (string)
        /// </summary>
        [Output("userEnabledAttribute")]
        public Output<string> UserEnabledAttribute { get; private set; } = null!;

        /// <summary>
        /// User login attribute. Default `uid` (string)
        /// </summary>
        [Output("userLoginAttribute")]
        public Output<string> UserLoginAttribute { get; private set; } = null!;

        /// <summary>
        /// User member attribute. Default `memberOf` (string)
        /// </summary>
        [Output("userMemberAttribute")]
        public Output<string> UserMemberAttribute { get; private set; } = null!;

        /// <summary>
        /// User name attribute. Default `givenName` (string)
        /// </summary>
        [Output("userNameAttribute")]
        public Output<string> UserNameAttribute { get; private set; } = null!;

        /// <summary>
        /// User object class. Default `inetorgperson` (string)
        /// </summary>
        [Output("userObjectClass")]
        public Output<string> UserObjectClass { get; private set; } = null!;

        /// <summary>
        /// User search attribute. Default `uid|sn|givenName` (string)
        /// </summary>
        [Output("userSearchAttribute")]
        public Output<string> UserSearchAttribute { get; private set; } = null!;

        /// <summary>
        /// User search base DN (string)
        /// </summary>
        [Output("userSearchBase")]
        public Output<string> UserSearchBase { get; private set; } = null!;


        /// <summary>
        /// Create a AuthConfigFreeIpa resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthConfigFreeIpa(string name, AuthConfigFreeIpaArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private AuthConfigFreeIpa(string name, Input<string> id, AuthConfigFreeIpaState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AuthConfigFreeIpa resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthConfigFreeIpa Get(string name, Input<string> id, AuthConfigFreeIpaState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthConfigFreeIpa(name, id, state, options);
        }
    }

    public sealed class AuthConfigFreeIpaArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
        /// </summary>
        public InputList<string> AllowedPrincipalIds
        {
            get => _allowedPrincipalIds ?? (_allowedPrincipalIds = new InputList<string>());
            set => _allowedPrincipalIds = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// FreeIpa connection timeout. Default `5000` (int)
        /// </summary>
        [Input("connectionTimeout")]
        public Input<int>? ConnectionTimeout { get; set; }

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Group DN attribute. Default `entryDN` (string)
        /// </summary>
        [Input("groupDnAttribute")]
        public Input<string>? GroupDnAttribute { get; set; }

        /// <summary>
        /// Group member mapping attribute. Default `member` (string)
        /// </summary>
        [Input("groupMemberMappingAttribute")]
        public Input<string>? GroupMemberMappingAttribute { get; set; }

        /// <summary>
        /// Group member user attribute. Default `entryDN` (string)
        /// </summary>
        [Input("groupMemberUserAttribute")]
        public Input<string>? GroupMemberUserAttribute { get; set; }

        /// <summary>
        /// Group name attribute. Default `cn` (string)
        /// </summary>
        [Input("groupNameAttribute")]
        public Input<string>? GroupNameAttribute { get; set; }

        /// <summary>
        /// Group object class. Default `groupOfNames` (string)
        /// </summary>
        [Input("groupObjectClass")]
        public Input<string>? GroupObjectClass { get; set; }

        /// <summary>
        /// Group search attribute. Default `cn` (string)
        /// </summary>
        [Input("groupSearchAttribute")]
        public Input<string>? GroupSearchAttribute { get; set; }

        /// <summary>
        /// Group search base (string)
        /// </summary>
        [Input("groupSearchBase")]
        public Input<string>? GroupSearchBase { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Nested group membership enable. Default `false` (bool)
        /// </summary>
        [Input("nestedGroupMembershipEnabled")]
        public Input<bool>? NestedGroupMembershipEnabled { get; set; }

        /// <summary>
        /// FreeIpa port. Default `389` (int)
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("servers", required: true)]
        private InputList<string>? _servers;

        /// <summary>
        /// FreeIpa servers list (list)
        /// </summary>
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        /// <summary>
        /// Service account DN for access FreeIpa service (string)
        /// </summary>
        [Input("serviceAccountDistinguishedName", required: true)]
        public Input<string> ServiceAccountDistinguishedName { get; set; } = null!;

        /// <summary>
        /// Service account password for access FreeIpa service (string)
        /// </summary>
        [Input("serviceAccountPassword", required: true)]
        public Input<string> ServiceAccountPassword { get; set; } = null!;

        /// <summary>
        /// Enable TLS connection (bool)
        /// </summary>
        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        /// <summary>
        /// User disabled bit mask (int)
        /// </summary>
        [Input("userDisabledBitMask")]
        public Input<int>? UserDisabledBitMask { get; set; }

        /// <summary>
        /// User enable attribute (string)
        /// </summary>
        [Input("userEnabledAttribute")]
        public Input<string>? UserEnabledAttribute { get; set; }

        /// <summary>
        /// User login attribute. Default `uid` (string)
        /// </summary>
        [Input("userLoginAttribute")]
        public Input<string>? UserLoginAttribute { get; set; }

        /// <summary>
        /// User member attribute. Default `memberOf` (string)
        /// </summary>
        [Input("userMemberAttribute")]
        public Input<string>? UserMemberAttribute { get; set; }

        /// <summary>
        /// User name attribute. Default `givenName` (string)
        /// </summary>
        [Input("userNameAttribute")]
        public Input<string>? UserNameAttribute { get; set; }

        /// <summary>
        /// User object class. Default `inetorgperson` (string)
        /// </summary>
        [Input("userObjectClass")]
        public Input<string>? UserObjectClass { get; set; }

        /// <summary>
        /// User search attribute. Default `uid|sn|givenName` (string)
        /// </summary>
        [Input("userSearchAttribute")]
        public Input<string>? UserSearchAttribute { get; set; }

        /// <summary>
        /// User search base DN (string)
        /// </summary>
        [Input("userSearchBase", required: true)]
        public Input<string> UserSearchBase { get; set; } = null!;

        public AuthConfigFreeIpaArgs()
        {
        }
    }

    public sealed class AuthConfigFreeIpaState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
        /// </summary>
        public InputList<string> AllowedPrincipalIds
        {
            get => _allowedPrincipalIds ?? (_allowedPrincipalIds = new InputList<string>());
            set => _allowedPrincipalIds = value;
        }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// FreeIpa connection timeout. Default `5000` (int)
        /// </summary>
        [Input("connectionTimeout")]
        public Input<int>? ConnectionTimeout { get; set; }

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Group DN attribute. Default `entryDN` (string)
        /// </summary>
        [Input("groupDnAttribute")]
        public Input<string>? GroupDnAttribute { get; set; }

        /// <summary>
        /// Group member mapping attribute. Default `member` (string)
        /// </summary>
        [Input("groupMemberMappingAttribute")]
        public Input<string>? GroupMemberMappingAttribute { get; set; }

        /// <summary>
        /// Group member user attribute. Default `entryDN` (string)
        /// </summary>
        [Input("groupMemberUserAttribute")]
        public Input<string>? GroupMemberUserAttribute { get; set; }

        /// <summary>
        /// Group name attribute. Default `cn` (string)
        /// </summary>
        [Input("groupNameAttribute")]
        public Input<string>? GroupNameAttribute { get; set; }

        /// <summary>
        /// Group object class. Default `groupOfNames` (string)
        /// </summary>
        [Input("groupObjectClass")]
        public Input<string>? GroupObjectClass { get; set; }

        /// <summary>
        /// Group search attribute. Default `cn` (string)
        /// </summary>
        [Input("groupSearchAttribute")]
        public Input<string>? GroupSearchAttribute { get; set; }

        /// <summary>
        /// Group search base (string)
        /// </summary>
        [Input("groupSearchBase")]
        public Input<string>? GroupSearchBase { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// (Computed) The name of the resource (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Nested group membership enable. Default `false` (bool)
        /// </summary>
        [Input("nestedGroupMembershipEnabled")]
        public Input<bool>? NestedGroupMembershipEnabled { get; set; }

        /// <summary>
        /// FreeIpa port. Default `389` (int)
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("servers")]
        private InputList<string>? _servers;

        /// <summary>
        /// FreeIpa servers list (list)
        /// </summary>
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        /// <summary>
        /// Service account DN for access FreeIpa service (string)
        /// </summary>
        [Input("serviceAccountDistinguishedName")]
        public Input<string>? ServiceAccountDistinguishedName { get; set; }

        /// <summary>
        /// Service account password for access FreeIpa service (string)
        /// </summary>
        [Input("serviceAccountPassword")]
        public Input<string>? ServiceAccountPassword { get; set; }

        /// <summary>
        /// Enable TLS connection (bool)
        /// </summary>
        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// User disabled bit mask (int)
        /// </summary>
        [Input("userDisabledBitMask")]
        public Input<int>? UserDisabledBitMask { get; set; }

        /// <summary>
        /// User enable attribute (string)
        /// </summary>
        [Input("userEnabledAttribute")]
        public Input<string>? UserEnabledAttribute { get; set; }

        /// <summary>
        /// User login attribute. Default `uid` (string)
        /// </summary>
        [Input("userLoginAttribute")]
        public Input<string>? UserLoginAttribute { get; set; }

        /// <summary>
        /// User member attribute. Default `memberOf` (string)
        /// </summary>
        [Input("userMemberAttribute")]
        public Input<string>? UserMemberAttribute { get; set; }

        /// <summary>
        /// User name attribute. Default `givenName` (string)
        /// </summary>
        [Input("userNameAttribute")]
        public Input<string>? UserNameAttribute { get; set; }

        /// <summary>
        /// User object class. Default `inetorgperson` (string)
        /// </summary>
        [Input("userObjectClass")]
        public Input<string>? UserObjectClass { get; set; }

        /// <summary>
        /// User search attribute. Default `uid|sn|givenName` (string)
        /// </summary>
        [Input("userSearchAttribute")]
        public Input<string>? UserSearchAttribute { get; set; }

        /// <summary>
        /// User search base DN (string)
        /// </summary>
        [Input("userSearchBase")]
        public Input<string>? UserSearchBase { get; set; }

        public AuthConfigFreeIpaState()
        {
        }
    }
}
