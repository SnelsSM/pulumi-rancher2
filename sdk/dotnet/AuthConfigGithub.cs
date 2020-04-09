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
    /// Provides a Rancher v2 Auth Config Github resource. This can be used to configure and enable Auth Config Github for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// In addition to the built-in local auth, only one external auth config provider can be enabled at a time. 
    /// 
    /// 
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/authConfigGithub.html.markdown.
    /// </summary>
    public partial class AuthConfigGithub : Pulumi.CustomResource
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Output("accessMode")]
        public Output<string?> AccessMode { get; private set; } = null!;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `github_user://&lt;USER_ID&gt;`  `github_team://&lt;GROUP_ID&gt;` `github_org://&lt;ORG_ID&gt;` (list)
        /// </summary>
        [Output("allowedPrincipalIds")]
        public Output<ImmutableArray<string>> AllowedPrincipalIds { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Github auth Client ID (string)
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// Github auth Client secret (string)
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Github hostname to connect. Default `github.com` (string)
        /// </summary>
        [Output("hostname")]
        public Output<string?> Hostname { get; private set; } = null!;

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
        /// Enable TLS connection. Default `true` (bool)
        /// </summary>
        [Output("tls")]
        public Output<bool?> Tls { get; private set; } = null!;

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AuthConfigGithub resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthConfigGithub(string name, AuthConfigGithubArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigGithub:AuthConfigGithub", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private AuthConfigGithub(string name, Input<string> id, AuthConfigGithubState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/authConfigGithub:AuthConfigGithub", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthConfigGithub resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthConfigGithub Get(string name, Input<string> id, AuthConfigGithubState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthConfigGithub(name, id, state, options);
        }
    }

    public sealed class AuthConfigGithubArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `github_user://&lt;USER_ID&gt;`  `github_team://&lt;GROUP_ID&gt;` `github_org://&lt;ORG_ID&gt;` (list)
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
        /// Github auth Client ID (string)
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// Github auth Client secret (string)
        /// </summary>
        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Github hostname to connect. Default `github.com` (string)
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

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
        /// Enable TLS connection. Default `true` (bool)
        /// </summary>
        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        public AuthConfigGithubArgs()
        {
        }
    }

    public sealed class AuthConfigGithubState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        [Input("allowedPrincipalIds")]
        private InputList<string>? _allowedPrincipalIds;

        /// <summary>
        /// Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `github_user://&lt;USER_ID&gt;`  `github_team://&lt;GROUP_ID&gt;` `github_org://&lt;ORG_ID&gt;` (list)
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
        /// Github auth Client ID (string)
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// Github auth Client secret (string)
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// Enable auth config provider. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Github hostname to connect. Default `github.com` (string)
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

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
        /// Enable TLS connection. Default `true` (bool)
        /// </summary>
        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        /// <summary>
        /// (Computed) The type of the resource (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AuthConfigGithubState()
        {
        }
    }
}
