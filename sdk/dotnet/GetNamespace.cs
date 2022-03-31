// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetNamespace
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 namespace.
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
        ///         var foo = Output.Create(Rancher2.GetNamespace.InvokeAsync(new Rancher2.GetNamespaceArgs
        ///         {
        ///             Name = "foo",
        ///             ProjectId = rancher2_cluster.Foo_custom.Default_project_id,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNamespaceResult> InvokeAsync(GetNamespaceArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNamespaceResult>("rancher2:index/getNamespace:getNamespace", args ?? new GetNamespaceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 namespace.
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
        ///         var foo = Output.Create(Rancher2.GetNamespace.InvokeAsync(new Rancher2.GetNamespaceArgs
        ///         {
        ///             Name = "foo",
        ///             ProjectId = rancher2_cluster.Foo_custom.Default_project_id,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNamespaceResult> Invoke(GetNamespaceInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetNamespaceResult>("rancher2:index/getNamespace:getNamespace", args ?? new GetNamespaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNamespaceArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the namespace (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project id where namespace is assigned (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetNamespaceArgs()
        {
        }
    }

    public sealed class GetNamespaceInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the namespace (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project id where namespace is assigned (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetNamespaceInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNamespaceResult
    {
        /// <summary>
        /// (Computed) Annotations for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Default containers resource limits on namespace (List maxitem:1)
        /// </summary>
        public readonly Outputs.GetNamespaceContainerResourceLimitResult ContainerResourceLimit;
        /// <summary>
        /// (Computed) A namespace description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string ProjectId;
        /// <summary>
        /// (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNamespaceResourceQuotaResult ResourceQuota;

        [OutputConstructor]
        private GetNamespaceResult(
            ImmutableDictionary<string, object> annotations,

            Outputs.GetNamespaceContainerResourceLimitResult containerResourceLimit,

            string description,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            string projectId,

            Outputs.GetNamespaceResourceQuotaResult resourceQuota)
        {
            Annotations = annotations;
            ContainerResourceLimit = containerResourceLimit;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            ProjectId = projectId;
            ResourceQuota = resourceQuota;
        }
    }
}
