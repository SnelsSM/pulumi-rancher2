// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    [Obsolete(@"rancher2.RoleTempalte has been deprecated in favor of rancher2.RoleTemplate")]
    [Rancher2ResourceType("rancher2:index/roleTempalte:RoleTempalte")]
    public partial class RoleTempalte : Pulumi.CustomResource
    {
        /// <summary>
        /// Administrative role template
        /// </summary>
        [Output("administrative")]
        public Output<bool?> Administrative { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Builtin role template
        /// </summary>
        [Output("builtin")]
        public Output<bool> Builtin { get; private set; } = null!;

        /// <summary>
        /// Context role template
        /// </summary>
        [Output("context")]
        public Output<string?> Context { get; private set; } = null!;

        /// <summary>
        /// Default role template for new created cluster or project
        /// </summary>
        [Output("defaultRole")]
        public Output<bool?> DefaultRole { get; private set; } = null!;

        /// <summary>
        /// Role template policy description
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// External role template
        /// </summary>
        [Output("external")]
        public Output<bool?> External { get; private set; } = null!;

        /// <summary>
        /// Hidden role template
        /// </summary>
        [Output("hidden")]
        public Output<bool?> Hidden { get; private set; } = null!;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Locked role template
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// Role template policy name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Inherit role template IDs
        /// </summary>
        [Output("roleTemplateIds")]
        public Output<ImmutableArray<string>> RoleTemplateIds { get; private set; } = null!;

        /// <summary>
        /// Role template policy rules
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.RoleTempalteRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a RoleTempalte resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleTempalte(string name, RoleTempalteArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/roleTempalte:RoleTempalte", name, args ?? new RoleTempalteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleTempalte(string name, Input<string> id, RoleTempalteState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/roleTempalte:RoleTempalte", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleTempalte resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleTempalte Get(string name, Input<string> id, RoleTempalteState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleTempalte(name, id, state, options);
        }
    }

    public sealed class RoleTempalteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrative role template
        /// </summary>
        [Input("administrative")]
        public Input<bool>? Administrative { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Context role template
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// Default role template for new created cluster or project
        /// </summary>
        [Input("defaultRole")]
        public Input<bool>? DefaultRole { get; set; }

        /// <summary>
        /// Role template policy description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External role template
        /// </summary>
        [Input("external")]
        public Input<bool>? External { get; set; }

        /// <summary>
        /// Hidden role template
        /// </summary>
        [Input("hidden")]
        public Input<bool>? Hidden { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Locked role template
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Role template policy name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roleTemplateIds")]
        private InputList<string>? _roleTemplateIds;

        /// <summary>
        /// Inherit role template IDs
        /// </summary>
        public InputList<string> RoleTemplateIds
        {
            get => _roleTemplateIds ?? (_roleTemplateIds = new InputList<string>());
            set => _roleTemplateIds = value;
        }

        [Input("rules")]
        private InputList<Inputs.RoleTempalteRuleArgs>? _rules;

        /// <summary>
        /// Role template policy rules
        /// </summary>
        public InputList<Inputs.RoleTempalteRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RoleTempalteRuleArgs>());
            set => _rules = value;
        }

        public RoleTempalteArgs()
        {
        }
    }

    public sealed class RoleTempalteState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Administrative role template
        /// </summary>
        [Input("administrative")]
        public Input<bool>? Administrative { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Builtin role template
        /// </summary>
        [Input("builtin")]
        public Input<bool>? Builtin { get; set; }

        /// <summary>
        /// Context role template
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// Default role template for new created cluster or project
        /// </summary>
        [Input("defaultRole")]
        public Input<bool>? DefaultRole { get; set; }

        /// <summary>
        /// Role template policy description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External role template
        /// </summary>
        [Input("external")]
        public Input<bool>? External { get; set; }

        /// <summary>
        /// Hidden role template
        /// </summary>
        [Input("hidden")]
        public Input<bool>? Hidden { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Locked role template
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Role template policy name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roleTemplateIds")]
        private InputList<string>? _roleTemplateIds;

        /// <summary>
        /// Inherit role template IDs
        /// </summary>
        public InputList<string> RoleTemplateIds
        {
            get => _roleTemplateIds ?? (_roleTemplateIds = new InputList<string>());
            set => _roleTemplateIds = value;
        }

        [Input("rules")]
        private InputList<Inputs.RoleTempalteRuleGetArgs>? _rules;

        /// <summary>
        /// Role template policy rules
        /// </summary>
        public InputList<Inputs.RoleTempalteRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RoleTempalteRuleGetArgs>());
            set => _rules = value;
        }

        public RoleTempalteState()
        {
        }
    }
}
