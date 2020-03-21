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
    /// Provides a Rancher v2 Auth Config KeyCloak resource. This can be used to configure and enable Auth Config KeyCloak for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/authConfigKeyCloak.html.markdown.
    /// </summary>
    public partial class AuthConfigKeycloak : Pulumi.CustomResource
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Output("accessMode")]
        public Output<string?> AccessMode { get; private set; } = null!;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `keycloak_user://&lt;USER_ID&gt;`  `keycloak_group://&lt;GROUP_ID&gt;` (list)
        /// </summary>
        [Output("allowedPrincipalIds")]
        public Output<ImmutableArray<string>> AllowedPrincipalIds { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// KeyCloak display name field (string)
        /// </summary>
        [Output("displayNameField")]
        public Output<string> DisplayNameField { get; private set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// KeyCloak group field (string)
        /// </summary>
        [Output("groupsField")]
        public Output<string> GroupsField { get; private set; } = null!;

        /// <summary>
        /// KeyCloak IDP metadata content (string)
        /// </summary>
        [Output("idpMetadataContent")]
        public Output<string> IdpMetadataContent { get; private set; } = null!;

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
        /// Rancher url. Schema needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Output("rancherApiHost")]
        public Output<string> RancherApiHost { get; private set; } = null!;

        /// <summary>
        /// KeyCloak SP cert (string)
        /// </summary>
        [Output("spCert")]
        public Output<string> SpCert { get; private set; } = null!;

        /// <summary>
        /// KeyCloak SP key (string)
        /// </summary>
        [Output("spKey")]
        public Output<string> SpKey { get; private set; } = null!;

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// KeyCloak UID field (string)
        /// </summary>
        [Output("uidField")]
        public Output<string> UidField { get; private set; } = null!;

        /// <summary>
        /// KeyCloak user name field (string)
        /// </summary>
        [Output("userNameField")]
        public Output<string> UserNameField { get; private set; } = null!;


        /// <summary>
        /// Create a AuthConfigKeycloak resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthConfigKeycloak(string name, AuthConfigKeycloakArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private AuthConfigKeycloak(string name, Input<string> id, AuthConfigKeycloakState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthConfigKeycloak resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthConfigKeycloak Get(string name, Input<string> id, AuthConfigKeycloakState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthConfigKeycloak(name, id, state, options);
        }
    }

    public sealed class AuthConfigKeycloakArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `keycloak_user://&lt;USER_ID&gt;`  `keycloak_group://&lt;GROUP_ID&gt;` (list)
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
        /// KeyCloak display name field (string)
        /// </summary>
        [Input("displayNameField", required: true)]
        public Input<string> DisplayNameField { get; set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// KeyCloak group field (string)
        /// </summary>
        [Input("groupsField", required: true)]
        public Input<string> GroupsField { get; set; } = null!;

        /// <summary>
        /// KeyCloak IDP metadata content (string)
        /// </summary>
        [Input("idpMetadataContent", required: true)]
        public Input<string> IdpMetadataContent { get; set; } = null!;

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
        /// Rancher url. Schema needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Input("rancherApiHost", required: true)]
        public Input<string> RancherApiHost { get; set; } = null!;

        /// <summary>
        /// KeyCloak SP cert (string)
        /// </summary>
        [Input("spCert", required: true)]
        public Input<string> SpCert { get; set; } = null!;

        /// <summary>
        /// KeyCloak SP key (string)
        /// </summary>
        [Input("spKey", required: true)]
        public Input<string> SpKey { get; set; } = null!;

        /// <summary>
        /// KeyCloak UID field (string)
        /// </summary>
        [Input("uidField", required: true)]
        public Input<string> UidField { get; set; } = null!;

        /// <summary>
        /// KeyCloak user name field (string)
        /// </summary>
        [Input("userNameField", required: true)]
        public Input<string> UserNameField { get; set; } = null!;

        public AuthConfigKeycloakArgs()
        {
        }
    }

    public sealed class AuthConfigKeycloakState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `keycloak_user://&lt;USER_ID&gt;`  `keycloak_group://&lt;GROUP_ID&gt;` (list)
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
        /// KeyCloak display name field (string)
        /// </summary>
        [Input("displayNameField")]
        public Input<string>? DisplayNameField { get; set; }

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// KeyCloak group field (string)
        /// </summary>
        [Input("groupsField")]
        public Input<string>? GroupsField { get; set; }

        /// <summary>
        /// KeyCloak IDP metadata content (string)
        /// </summary>
        [Input("idpMetadataContent")]
        public Input<string>? IdpMetadataContent { get; set; }

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
        /// Rancher url. Schema needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
        /// </summary>
        [Input("rancherApiHost")]
        public Input<string>? RancherApiHost { get; set; }

        /// <summary>
        /// KeyCloak SP cert (string)
        /// </summary>
        [Input("spCert")]
        public Input<string>? SpCert { get; set; }

        /// <summary>
        /// KeyCloak SP key (string)
        /// </summary>
        [Input("spKey")]
        public Input<string>? SpKey { get; set; }

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// KeyCloak UID field (string)
        /// </summary>
        [Input("uidField")]
        public Input<string>? UidField { get; set; }

        /// <summary>
        /// KeyCloak user name field (string)
        /// </summary>
        [Input("userNameField")]
        public Input<string>? UserNameField { get; set; }

        public AuthConfigKeycloakState()
        {
        }
    }
}
