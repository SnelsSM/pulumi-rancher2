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
    /// Provides a Rancher v2 Project Alert Group resource. This can be used to create Project Alert Group for Rancher v2 environments and retrieve their information.
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
    ///     // Create a new Rancher2 Project Alert Group
    ///     var foo = new Rancher2.ProjectAlertGroup("foo", new()
    ///     {
    ///         Description = "Terraform project alert group",
    ///         GroupIntervalSeconds = 300,
    ///         ProjectId = "&lt;project_id&gt;",
    ///         RepeatIntervalSeconds = 3600,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Project Alert Group can be imported using the Rancher project alert group ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/projectAlertGroup:ProjectAlertGroup foo &amp;lt;project_alert_group_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/projectAlertGroup:ProjectAlertGroup")]
    public partial class ProjectAlertGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The project alert group annotations (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The project alert group description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The project alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Output("groupIntervalSeconds")]
        public Output<int?> GroupIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The project alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Output("groupWaitSeconds")]
        public Output<int?> GroupWaitSeconds { get; private set; } = null!;

        /// <summary>
        /// The project alert group labels (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The project alert group name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project id where create project alert group (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The project alert group recipients (list)
        /// </summary>
        [Output("recipients")]
        public Output<ImmutableArray<Outputs.ProjectAlertGroupRecipient>> Recipients { get; private set; } = null!;

        /// <summary>
        /// The project alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Output("repeatIntervalSeconds")]
        public Output<int?> RepeatIntervalSeconds { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectAlertGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectAlertGroup(string name, ProjectAlertGroupArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, args ?? new ProjectAlertGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectAlertGroup(string name, Input<string> id, ProjectAlertGroupState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectAlertGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectAlertGroup Get(string name, Input<string> id, ProjectAlertGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectAlertGroup(name, id, state, options);
        }
    }

    public sealed class ProjectAlertGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The project alert group annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The project alert group description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The project alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The project alert group labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert group name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where create project alert group (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("recipients")]
        private InputList<Inputs.ProjectAlertGroupRecipientArgs>? _recipients;

        /// <summary>
        /// The project alert group recipients (list)
        /// </summary>
        public InputList<Inputs.ProjectAlertGroupRecipientArgs> Recipients
        {
            get => _recipients ?? (_recipients = new InputList<Inputs.ProjectAlertGroupRecipientArgs>());
            set => _recipients = value;
        }

        /// <summary>
        /// The project alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        public ProjectAlertGroupArgs()
        {
        }
        public static new ProjectAlertGroupArgs Empty => new ProjectAlertGroupArgs();
    }

    public sealed class ProjectAlertGroupState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The project alert group annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The project alert group description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The project alert group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The project alert group labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert group name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where create project alert group (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("recipients")]
        private InputList<Inputs.ProjectAlertGroupRecipientGetArgs>? _recipients;

        /// <summary>
        /// The project alert group recipients (list)
        /// </summary>
        public InputList<Inputs.ProjectAlertGroupRecipientGetArgs> Recipients
        {
            get => _recipients ?? (_recipients = new InputList<Inputs.ProjectAlertGroupRecipientGetArgs>());
            set => _recipients = value;
        }

        /// <summary>
        /// The project alert group wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        public ProjectAlertGroupState()
        {
        }
        public static new ProjectAlertGroupState Empty => new ProjectAlertGroupState();
    }
}
