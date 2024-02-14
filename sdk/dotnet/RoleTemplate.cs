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
    /// Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.
    /// 
    /// `cluster` and `project` scopes are supported for role templates.
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
    ///     // Create a new rancher2 cluster Role Template
    ///     var foo = new Rancher2.RoleTemplate("foo", new()
    ///     {
    ///         Context = "cluster",
    ///         DefaultRole = true,
    ///         Description = "Terraform role template acceptance test",
    ///         Rules = new[]
    ///         {
    ///             new Rancher2.Inputs.RoleTemplateRuleArgs
    ///             {
    ///                 ApiGroups = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "secrets",
    ///                 },
    ///                 Verbs = new[]
    ///                 {
    ///                     "create",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 project Role Template
    ///     var foo = new Rancher2.RoleTemplate("foo", new()
    ///     {
    ///         Context = "project",
    ///         DefaultRole = true,
    ///         Description = "Terraform role template acceptance test",
    ///         Rules = new[]
    ///         {
    ///             new Rancher2.Inputs.RoleTemplateRuleArgs
    ///             {
    ///                 ApiGroups = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "secrets",
    ///                 },
    ///                 Verbs = new[]
    ///                 {
    ///                     "create",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Role Template can be imported using the Rancher Role Template ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/roleTemplate:RoleTemplate foo &amp;lt;role_template_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/roleTemplate:RoleTemplate")]
    public partial class RoleTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Administrative role template. Default `false` (bool)
        /// </summary>
        [Output("administrative")]
        public Output<bool?> Administrative { get; private set; } = null!;

        /// <summary>
        /// Annotations for role template object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// (Computed) Builtin role template (string)
        /// </summary>
        [Output("builtin")]
        public Output<bool> Builtin { get; private set; } = null!;

        /// <summary>
        /// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        /// </summary>
        [Output("context")]
        public Output<string?> Context { get; private set; } = null!;

        /// <summary>
        /// Default role template for new created cluster or project. Default `false` (bool)
        /// </summary>
        [Output("defaultRole")]
        public Output<bool?> DefaultRole { get; private set; } = null!;

        /// <summary>
        /// Role template description (string)
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// External role template. Default `false` (bool)
        /// </summary>
        [Output("external")]
        public Output<bool?> External { get; private set; } = null!;

        /// <summary>
        /// Hidden role template. Default `false` (bool)
        /// </summary>
        [Output("hidden")]
        public Output<bool?> Hidden { get; private set; } = null!;

        /// <summary>
        /// Labels for role template object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Locked role template. Default `false` (bool)
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// Role template name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Inherit role template IDs (list)
        /// </summary>
        [Output("roleTemplateIds")]
        public Output<ImmutableArray<string>> RoleTemplateIds { get; private set; } = null!;

        /// <summary>
        /// Role template policy rules (list)
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.RoleTemplateRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a RoleTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleTemplate(string name, RoleTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/roleTemplate:RoleTemplate", name, args ?? new RoleTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleTemplate(string name, Input<string> id, RoleTemplateState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/roleTemplate:RoleTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleTemplate Get(string name, Input<string> id, RoleTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleTemplate(name, id, state, options);
        }
    }

    public sealed class RoleTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrative role template. Default `false` (bool)
        /// </summary>
        [Input("administrative")]
        public Input<bool>? Administrative { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for role template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// Default role template for new created cluster or project. Default `false` (bool)
        /// </summary>
        [Input("defaultRole")]
        public Input<bool>? DefaultRole { get; set; }

        /// <summary>
        /// Role template description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External role template. Default `false` (bool)
        /// </summary>
        [Input("external")]
        public Input<bool>? External { get; set; }

        /// <summary>
        /// Hidden role template. Default `false` (bool)
        /// </summary>
        [Input("hidden")]
        public Input<bool>? Hidden { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for role template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Locked role template. Default `false` (bool)
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Role template name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roleTemplateIds")]
        private InputList<string>? _roleTemplateIds;

        /// <summary>
        /// Inherit role template IDs (list)
        /// </summary>
        public InputList<string> RoleTemplateIds
        {
            get => _roleTemplateIds ?? (_roleTemplateIds = new InputList<string>());
            set => _roleTemplateIds = value;
        }

        [Input("rules")]
        private InputList<Inputs.RoleTemplateRuleArgs>? _rules;

        /// <summary>
        /// Role template policy rules (list)
        /// </summary>
        public InputList<Inputs.RoleTemplateRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RoleTemplateRuleArgs>());
            set => _rules = value;
        }

        public RoleTemplateArgs()
        {
        }
        public static new RoleTemplateArgs Empty => new RoleTemplateArgs();
    }

    public sealed class RoleTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrative role template. Default `false` (bool)
        /// </summary>
        [Input("administrative")]
        public Input<bool>? Administrative { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for role template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// (Computed) Builtin role template (string)
        /// </summary>
        [Input("builtin")]
        public Input<bool>? Builtin { get; set; }

        /// <summary>
        /// Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// Default role template for new created cluster or project. Default `false` (bool)
        /// </summary>
        [Input("defaultRole")]
        public Input<bool>? DefaultRole { get; set; }

        /// <summary>
        /// Role template description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External role template. Default `false` (bool)
        /// </summary>
        [Input("external")]
        public Input<bool>? External { get; set; }

        /// <summary>
        /// Hidden role template. Default `false` (bool)
        /// </summary>
        [Input("hidden")]
        public Input<bool>? Hidden { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for role template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Locked role template. Default `false` (bool)
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Role template name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roleTemplateIds")]
        private InputList<string>? _roleTemplateIds;

        /// <summary>
        /// Inherit role template IDs (list)
        /// </summary>
        public InputList<string> RoleTemplateIds
        {
            get => _roleTemplateIds ?? (_roleTemplateIds = new InputList<string>());
            set => _roleTemplateIds = value;
        }

        [Input("rules")]
        private InputList<Inputs.RoleTemplateRuleGetArgs>? _rules;

        /// <summary>
        /// Role template policy rules (list)
        /// </summary>
        public InputList<Inputs.RoleTemplateRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RoleTemplateRuleGetArgs>());
            set => _rules = value;
        }

        public RoleTemplateState()
        {
        }
        public static new RoleTemplateState Empty => new RoleTemplateState();
    }
}
