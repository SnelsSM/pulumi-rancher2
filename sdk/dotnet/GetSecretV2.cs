// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetSecretV2
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher2 secret v2. Secret v2 resource is available at Rancher v2.5.x and above.
        /// </summary>
        public static Task<GetSecretV2Result> InvokeAsync(GetSecretV2Args args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSecretV2Result>("rancher2:index/getSecretV2:getSecretV2", args ?? new GetSecretV2Args(), options.WithVersion());
    }


    public sealed class GetSecretV2Args : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id of the secret V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the secret v2 (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The namespaces of the secret v2. Default: `default` (string)
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        public GetSecretV2Args()
        {
        }
    }


    [OutputType]
    public sealed class GetSecretV2Result
    {
        /// <summary>
        /// (Computed) Annotations for the secret v2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed/Sensitive) The data of the secret v2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Data;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
        /// </summary>
        public readonly bool Immutable;
        /// <summary>
        /// (Computed) Labels for the secret v2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly string? Namespace;
        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        public readonly string ResourceVersion;
        /// <summary>
        /// (Computed) The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format (string)
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetSecretV2Result(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            ImmutableDictionary<string, object> data,

            string id,

            bool immutable,

            ImmutableDictionary<string, object> labels,

            string name,

            string? @namespace,

            string resourceVersion,

            string type)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            Data = data;
            Id = id;
            Immutable = immutable;
            Labels = labels;
            Name = name;
            Namespace = @namespace;
            ResourceVersion = resourceVersion;
            Type = type;
        }
    }
}
