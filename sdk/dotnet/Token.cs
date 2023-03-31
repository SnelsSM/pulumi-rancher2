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
    /// Provides a Rancher v2 Token resource. This can be used to create Tokens for Rancher v2 provider user and retrieve their information.
    /// 
    /// There are 2 kind of tokens:
    /// - no scoped: valid for global system.
    /// - scoped: valid for just a specific cluster (`cluster_id` should be provided).
    /// 
    /// Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Token scoped
    ///     var foo = new Rancher2.Token("foo", new()
    ///     {
    ///         ClusterId = "&lt;cluster-id&gt;",
    ///         Description = "foo token",
    ///         Ttl = 1200,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/token:Token")]
    public partial class Token : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Computed) Token access key part (string)
        /// </summary>
        [Output("accessKey")]
        public Output<string> AccessKey { get; private set; } = null!;

        /// <summary>
        /// (Computed) Annotations of the token (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Cluster ID for scoped token (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string?> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Token description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// (Computed) Token is enabled (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// (Computed) Token is expired (bool)
        /// </summary>
        [Output("expired")]
        public Output<bool> Expired { get; private set; } = null!;

        /// <summary>
        /// (Computed) Labels of the token (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// (Computed) Token name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Renew expired or disabled token
        /// </summary>
        [Output("renew")]
        public Output<bool?> Renew { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Token secret key part (string)
        /// </summary>
        [Output("secretKey")]
        public Output<string> SecretKey { get; private set; } = null!;

        /// <summary>
        /// (Computed/Sensitive) Token value (string)
        /// </summary>
        [Output("token")]
        public Output<string> TokenName { get; private set; } = null!;

        /// <summary>
        /// Token time to live in seconds. Default `0` (int)
        /// </summary>
        [Output("ttl")]
        public Output<int?> Ttl { get; private set; } = null!;

        /// <summary>
        /// (Computed) Token user ID (string)
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a Token resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Token(string name, TokenArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/token:Token", name, args ?? new TokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Token(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/token:Token", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretKey",
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Token resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Token Get(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
        {
            return new Token(name, id, state, options);
        }
    }

    public sealed class TokenArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// (Computed) Annotations of the token (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster ID for scoped token (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Token description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (Computed) Labels of the token (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Renew expired or disabled token
        /// </summary>
        [Input("renew")]
        public Input<bool>? Renew { get; set; }

        /// <summary>
        /// Token time to live in seconds. Default `0` (int)
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public TokenArgs()
        {
        }
        public static new TokenArgs Empty => new TokenArgs();
    }

    public sealed class TokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) Token access key part (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// (Computed) Annotations of the token (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster ID for scoped token (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Token description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (Computed) Token is enabled (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// (Computed) Token is expired (bool)
        /// </summary>
        [Input("expired")]
        public Input<bool>? Expired { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (Computed) Labels of the token (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// (Computed) Token name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Renew expired or disabled token
        /// </summary>
        [Input("renew")]
        public Input<bool>? Renew { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// (Computed/Sensitive) Token secret key part (string)
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// (Computed/Sensitive) Token value (string)
        /// </summary>
        public Input<string>? TokenName
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Token time to live in seconds. Default `0` (int)
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// (Computed) Token user ID (string)
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public TokenState()
        {
        }
        public static new TokenState Empty => new TokenState();
    }
}
