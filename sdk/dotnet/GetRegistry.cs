// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetRegistry
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 docker registry.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 docker registries:
        /// - Project registry: Available to all namespaces in the `project_id`
        /// - Namespaced registry: Available to just `namespace_id` in the `project_id`
        /// </summary>
        public static Task<GetRegistryResult> InvokeAsync(GetRegistryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegistryResult>("rancher2:index/getRegistry:getRegistry", args ?? new GetRegistryArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 docker registry.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 docker registries:
        /// - Project registry: Available to all namespaces in the `project_id`
        /// - Namespaced registry: Available to just `namespace_id` in the `project_id`
        /// </summary>
        public static Output<GetRegistryResult> Invoke(GetRegistryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegistryResult>("rancher2:index/getRegistry:getRegistry", args ?? new GetRegistryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegistryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the registry (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The namespace id where to assign the namespaced registry (string)
        /// </summary>
        [Input("namespaceId")]
        public string? NamespaceId { get; set; }

        /// <summary>
        /// The project id where to assign the registry (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetRegistryArgs()
        {
        }
        public static new GetRegistryArgs Empty => new GetRegistryArgs();
    }

    public sealed class GetRegistryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the registry (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The namespace id where to assign the namespaced registry (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// The project id where to assign the registry (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetRegistryInvokeArgs()
        {
        }
        public static new GetRegistryInvokeArgs Empty => new GetRegistryInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegistryResult
    {
        /// <summary>
        /// (Computed) Annotations for Registry object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) A registry description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for Registry object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string? NamespaceId;
        public readonly string ProjectId;
        /// <summary>
        /// (Computed) Registries data for registry (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegistryRegistryResult> Registries;

        [OutputConstructor]
        private GetRegistryResult(
            ImmutableDictionary<string, object> annotations,

            string description,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            string? namespaceId,

            string projectId,

            ImmutableArray<Outputs.GetRegistryRegistryResult> registries)
        {
            Annotations = annotations;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            NamespaceId = namespaceId;
            ProjectId = projectId;
            Registries = registries;
        }
    }
}
