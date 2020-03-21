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
    /// Provides a Rancher v2 User resource. This can be used to create Users for Rancher v2 environments and retrieve their information.
    /// 
    /// When a Rancher User is created, it doesn't have a global role binding. At least, `user-base` global role binding in needed in order to enable user login.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/user.html.markdown.
    /// </summary>
    public partial class User : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for global role binding (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Labels for global role binding (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The user full name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The user password (string)
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// (Computed) The user principal IDs (list)
        /// </summary>
        [Output("principalIds")]
        public Output<ImmutableArray<string>> PrincipalIds { get; private set; } = null!;

        /// <summary>
        /// The user username (string)
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/user:User", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for global role binding (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for global role binding (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The user full name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user password (string)
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// The user username (string)
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public UserArgs()
        {
        }
    }

    public sealed class UserState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for global role binding (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for global role binding (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The user full name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user password (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("principalIds")]
        private InputList<string>? _principalIds;

        /// <summary>
        /// (Computed) The user principal IDs (list)
        /// </summary>
        public InputList<string> PrincipalIds
        {
            get => _principalIds ?? (_principalIds = new InputList<string>());
            set => _principalIds = value;
        }

        /// <summary>
        /// The user username (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public UserState()
        {
        }
    }
}
