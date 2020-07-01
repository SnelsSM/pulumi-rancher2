// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetApp
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 app.
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
        ///         var rancher2 = Output.Create(Rancher2.GetApp.InvokeAsync(new Rancher2.GetAppArgs
        ///         {
        ///             Name = "foo",
        ///             ProjectId = "&lt;project_id&gt;",
        ///             TargetNamespace = "&lt;namespace_name&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAppResult> InvokeAsync(GetAppArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppResult>("rancher2:index/getApp:getApp", args ?? new GetAppArgs(), options.WithVersion());
    }


    public sealed class GetAppArgs : Pulumi.InvokeArgs
    {
        [Input("annotations")]
        private Dictionary<string, object>? _annotations;

        /// <summary>
        /// (Computed) Annotations for the catalog (map)
        /// </summary>
        public Dictionary<string, object> Annotations
        {
            get => _annotations ?? (_annotations = new Dictionary<string, object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The app name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The id of the project where the app is deployed (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// The namespace name where the app is deployed (string)
        /// </summary>
        [Input("targetNamespace")]
        public string? TargetNamespace { get; set; }

        public GetAppArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppResult
    {
        /// <summary>
        /// (Computed) Annotations for the catalog (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Answers for the app (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Answers;
        /// <summary>
        /// (Computed) Catalog name of the app (string)
        /// </summary>
        public readonly string CatalogName;
        /// <summary>
        /// (Computed) Description for the app (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) The URL of the helm catalog app (string)
        /// </summary>
        public readonly string ExternalId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for the catalog (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string ProjectId;
        /// <summary>
        /// (Computed) Current revision id for the app (string)
        /// </summary>
        public readonly string RevisionId;
        public readonly string TargetNamespace;
        /// <summary>
        /// (Computed) Template name of the app (string)
        /// </summary>
        public readonly string TemplateName;
        /// <summary>
        /// (Computed) Template version of the app (string)
        /// </summary>
        public readonly string TemplateVersion;
        /// <summary>
        /// (Computed) values.yaml base64 encoded file content for the app (string)
        /// </summary>
        public readonly string ValuesYaml;

        [OutputConstructor]
        private GetAppResult(
            ImmutableDictionary<string, object> annotations,

            ImmutableDictionary<string, object> answers,

            string catalogName,

            string description,

            string externalId,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            string projectId,

            string revisionId,

            string targetNamespace,

            string templateName,

            string templateVersion,

            string valuesYaml)
        {
            Annotations = annotations;
            Answers = answers;
            CatalogName = catalogName;
            Description = description;
            ExternalId = externalId;
            Id = id;
            Labels = labels;
            Name = name;
            ProjectId = projectId;
            RevisionId = revisionId;
            TargetNamespace = targetNamespace;
            TemplateName = templateName;
            TemplateVersion = templateVersion;
            ValuesYaml = valuesYaml;
        }
    }
}
