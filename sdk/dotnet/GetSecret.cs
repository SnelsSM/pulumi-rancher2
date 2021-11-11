// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Rancher2
{
    public static class GetSecret
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 secret.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 secrets:
        /// - Project secret: Available to all namespaces in the `project_id`
        /// - Namespaced secret: Available to just `namespace_id` in the `project_id`
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
        ///         var foo = Output.Create(Rancher2.GetSecret.InvokeAsync(new Rancher2.GetSecretArgs
        ///         {
        ///             Name = "&lt;name&gt;",
        ///             ProjectId = "&lt;project_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetSecret.InvokeAsync(new Rancher2.GetSecretArgs
        ///         {
        ///             Name = "&lt;name&gt;",
        ///             NamespaceId = "&lt;namespace_id&gt;",
        ///             ProjectId = "&lt;project_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSecretResult> InvokeAsync(GetSecretArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSecretResult>("rancher2:index/getSecret:getSecret", args ?? new GetSecretArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 secret.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 secrets:
        /// - Project secret: Available to all namespaces in the `project_id`
        /// - Namespaced secret: Available to just `namespace_id` in the `project_id`
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
        ///         var foo = Output.Create(Rancher2.GetSecret.InvokeAsync(new Rancher2.GetSecretArgs
        ///         {
        ///             Name = "&lt;name&gt;",
        ///             ProjectId = "&lt;project_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetSecret.InvokeAsync(new Rancher2.GetSecretArgs
        ///         {
        ///             Name = "&lt;name&gt;",
        ///             NamespaceId = "&lt;namespace_id&gt;",
        ///             ProjectId = "&lt;project_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSecretResult> Invoke(GetSecretInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSecretResult>("rancher2:index/getSecret:getSecret", args ?? new GetSecretInvokeArgs(), options.WithVersion());
    }


    public sealed class GetSecretArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the secret (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The namespace id where to assign the namespaced secret (string)
        /// </summary>
        [Input("namespaceId")]
        public string? NamespaceId { get; set; }

        /// <summary>
        /// The project id where to assign the secret (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetSecretArgs()
        {
        }
    }

    public sealed class GetSecretInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the secret (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The namespace id where to assign the namespaced secret (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// The project id where to assign the secret (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetSecretInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSecretResult
    {
        /// <summary>
        /// (Computed) Annotations for secret object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Secret key/value data. Base64 encoding required for values (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Data;
        /// <summary>
        /// (Computed) A secret description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for secret object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string? NamespaceId;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetSecretResult(
            ImmutableDictionary<string, object> annotations,

            ImmutableDictionary<string, object> data,

            string description,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            string? namespaceId,

            string projectId)
        {
            Annotations = annotations;
            Data = data;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            NamespaceId = namespaceId;
            ProjectId = projectId;
        }
    }
}
