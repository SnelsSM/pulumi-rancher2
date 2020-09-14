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
    /// Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Global Role Binding using user_id
    ///         var foo = new Rancher2.GlobalRoleBinding("foo", new Rancher2.GlobalRoleBindingArgs
    ///         {
    ///             GlobalRoleId = "admin",
    ///             UserId = "user-XXXXX",
    ///         });
    ///         // Create a new rancher2 Global Role Binding using group_principal_id
    ///         var foo2 = new Rancher2.GlobalRoleBinding("foo2", new Rancher2.GlobalRoleBindingArgs
    ///         {
    ///             GlobalRoleId = "admin",
    ///             GroupPrincipalId = "local://g-XXXXX",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class GlobalRoleBinding : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for global role binding (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The role id from create global role binding (string)
        /// </summary>
        [Output("globalRoleId")]
        public Output<string> GlobalRoleId { get; private set; } = null!;

        /// <summary>
        /// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        /// </summary>
        [Output("groupPrincipalId")]
        public Output<string> GroupPrincipalId { get; private set; } = null!;

        /// <summary>
        /// Labels for global role binding (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the global role binding (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The user ID to assign global role binding (string)
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalRoleBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalRoleBinding(string name, GlobalRoleBindingArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, args ?? new GlobalRoleBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalRoleBinding(string name, Input<string> id, GlobalRoleBindingState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GlobalRoleBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalRoleBinding Get(string name, Input<string> id, GlobalRoleBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalRoleBinding(name, id, state, options);
        }
    }

    public sealed class GlobalRoleBindingArgs : Pulumi.ResourceArgs
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

        /// <summary>
        /// The role id from create global role binding (string)
        /// </summary>
        [Input("globalRoleId", required: true)]
        public Input<string> GlobalRoleId { get; set; } = null!;

        /// <summary>
        /// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        /// </summary>
        [Input("groupPrincipalId")]
        public Input<string>? GroupPrincipalId { get; set; }

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
        /// The name of the global role binding (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user ID to assign global role binding (string)
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public GlobalRoleBindingArgs()
        {
        }
    }

    public sealed class GlobalRoleBindingState : Pulumi.ResourceArgs
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

        /// <summary>
        /// The role id from create global role binding (string)
        /// </summary>
        [Input("globalRoleId")]
        public Input<string>? GlobalRoleId { get; set; }

        /// <summary>
        /// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        /// </summary>
        [Input("groupPrincipalId")]
        public Input<string>? GroupPrincipalId { get; set; }

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
        /// The name of the global role binding (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The user ID to assign global role binding (string)
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public GlobalRoleBindingState()
        {
        }
    }
}
