// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static partial class Invokes
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 secret.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 secrets:
        /// - Project secret: Available to all namespaces in the `project_id`
        /// - Namespaced secret: Available to just `namespace_id` in the `project_id`
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/secret.html.markdown.
        /// </summary>
        [Obsolete("Use GetSecret.InvokeAsync() instead")]
        public static Task<GetSecretResult> GetSecret(GetSecretArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSecretResult>("rancher2:index/getSecret:getSecret", args ?? InvokeArgs.Empty, options.WithVersion());
    }
    public static class GetSecret
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 secret.
        /// 
        /// Depending of the availability, there are 2 types of Rancher v2 secrets:
        /// - Project secret: Available to all namespaces in the `project_id`
        /// - Namespaced secret: Available to just `namespace_id` in the `project_id`
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/secret.html.markdown.
        /// </summary>
        public static Task<GetSecretResult> InvokeAsync(GetSecretArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSecretResult>("rancher2:index/getSecret:getSecret", args ?? InvokeArgs.Empty, options.WithVersion());
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
        /// (Computed) Labels for secret object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string? NamespaceId;
        public readonly string ProjectId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSecretResult(
            ImmutableDictionary<string, object> annotations,
            ImmutableDictionary<string, object> data,
            string description,
            ImmutableDictionary<string, object> labels,
            string name,
            string? namespaceId,
            string projectId,
            string id)
        {
            Annotations = annotations;
            Data = data;
            Description = description;
            Labels = labels;
            Name = name;
            NamespaceId = namespaceId;
            ProjectId = projectId;
            Id = id;
        }
    }
}
