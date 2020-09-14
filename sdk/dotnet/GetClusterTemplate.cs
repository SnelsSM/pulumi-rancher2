// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetClusterTemplate
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster template.
        /// 
        /// Cluster Templates are available from Rancher v2.3.x and above.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetClusterTemplate.InvokeAsync(new Rancher2.GetClusterTemplateArgs
        ///         {
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClusterTemplateResult> InvokeAsync(GetClusterTemplateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClusterTemplateResult>("rancher2:index/getClusterTemplate:getClusterTemplate", args ?? new GetClusterTemplateArgs(), options.WithVersion());
    }


    public sealed class GetClusterTemplateArgs : Pulumi.InvokeArgs
    {
        [Input("annotations")]
        private Dictionary<string, object>? _annotations;

        /// <summary>
        /// (Computed) Annotations for the cluster template (map)
        /// </summary>
        public Dictionary<string, object> Annotations
        {
            get => _annotations ?? (_annotations = new Dictionary<string, object>());
            set => _annotations = value;
        }

        [Input("description")]
        public string? Description { get; set; }

        [Input("labels")]
        private Dictionary<string, object>? _labels;

        /// <summary>
        /// (Computed) Labels for the cluster template (map)
        /// </summary>
        public Dictionary<string, object> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterTemplateArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClusterTemplateResult
    {
        /// <summary>
        /// (Computed) Annotations for the cluster template (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Default cluster template revision ID (string)
        /// </summary>
        public readonly string DefaultRevisionId;
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for the cluster template (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) Cluster template members (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterTemplateMemberResult> Members;
        public readonly string Name;
        /// <summary>
        /// (Computed) Cluster template revisions (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionResult> TemplateRevisions;

        [OutputConstructor]
        private GetClusterTemplateResult(
            ImmutableDictionary<string, object> annotations,

            string defaultRevisionId,

            string description,

            string id,

            ImmutableDictionary<string, object> labels,

            ImmutableArray<Outputs.GetClusterTemplateMemberResult> members,

            string name,

            ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionResult> templateRevisions)
        {
            Annotations = annotations;
            DefaultRevisionId = defaultRevisionId;
            Description = description;
            Id = id;
            Labels = labels;
            Members = members;
            Name = name;
            TemplateRevisions = templateRevisions;
        }
    }
}
