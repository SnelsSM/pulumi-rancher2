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
    /// Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// Cluster Templates are available from Rancher v2.3.x and above.
    /// 
    /// ## Import
    /// 
    /// Cluster Template can be imported using the rancher Cluster Template ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &amp;lt;CLUSTER_TEMPLATE_ID&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/clusterTemplate:ClusterTemplate")]
    public partial class ClusterTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for the cluster template (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// (Computed) Default cluster template revision ID (string)
        /// </summary>
        [Output("defaultRevisionId")]
        public Output<string> DefaultRevisionId { get; private set; } = null!;

        /// <summary>
        /// Cluster template description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Cluster template members (list)
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<Outputs.ClusterTemplateMember>> Members { get; private set; } = null!;

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Cluster template revisions (list)
        /// </summary>
        [Output("templateRevisions")]
        public Output<ImmutableArray<Outputs.ClusterTemplateTemplateRevision>> TemplateRevisions { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterTemplate(string name, ClusterTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterTemplate:ClusterTemplate", name, args ?? new ClusterTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterTemplate(string name, Input<string> id, ClusterTemplateState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterTemplate:ClusterTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClusterTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterTemplate Get(string name, Input<string> id, ClusterTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterTemplate(name, id, state, options);
        }
    }

    public sealed class ClusterTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the cluster template (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster template description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("members")]
        private InputList<Inputs.ClusterTemplateMemberArgs>? _members;

        /// <summary>
        /// Cluster template members (list)
        /// </summary>
        public InputList<Inputs.ClusterTemplateMemberArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.ClusterTemplateMemberArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("templateRevisions")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionArgs>? _templateRevisions;

        /// <summary>
        /// Cluster template revisions (list)
        /// </summary>
        public InputList<Inputs.ClusterTemplateTemplateRevisionArgs> TemplateRevisions
        {
            get => _templateRevisions ?? (_templateRevisions = new InputList<Inputs.ClusterTemplateTemplateRevisionArgs>());
            set => _templateRevisions = value;
        }

        public ClusterTemplateArgs()
        {
        }
        public static new ClusterTemplateArgs Empty => new ClusterTemplateArgs();
    }

    public sealed class ClusterTemplateState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the cluster template (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// (Computed) Default cluster template revision ID (string)
        /// </summary>
        [Input("defaultRevisionId")]
        public Input<string>? DefaultRevisionId { get; set; }

        /// <summary>
        /// Cluster template description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("members")]
        private InputList<Inputs.ClusterTemplateMemberGetArgs>? _members;

        /// <summary>
        /// Cluster template members (list)
        /// </summary>
        public InputList<Inputs.ClusterTemplateMemberGetArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.ClusterTemplateMemberGetArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("templateRevisions")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionGetArgs>? _templateRevisions;

        /// <summary>
        /// Cluster template revisions (list)
        /// </summary>
        public InputList<Inputs.ClusterTemplateTemplateRevisionGetArgs> TemplateRevisions
        {
            get => _templateRevisions ?? (_templateRevisions = new InputList<Inputs.ClusterTemplateTemplateRevisionGetArgs>());
            set => _templateRevisions = value;
        }

        public ClusterTemplateState()
        {
        }
        public static new ClusterTemplateState Empty => new ClusterTemplateState();
    }
}
