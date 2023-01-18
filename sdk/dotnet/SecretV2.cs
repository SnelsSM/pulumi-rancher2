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
    /// Provides a Rancher Secret v2 resource. This can be used to create k8s secrets for Rancher v2 environments and retrieve their information. Secret v2 resource is available at Rancher v2.5.x and above.
    /// 
    /// ## Import
    /// 
    /// V2 secrets can be imported using the Rancher cluster ID, Secret V2 namespace and name.
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/secretV2:SecretV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;SECRET_V2_NAMESPACE&amp;gt;/&amp;lt;SECRET_V2_NAME&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/secretV2:SecretV2")]
    public partial class SecretV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for the secret v2 (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id of the secret V2 (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The data of the secret v2 (map)
        /// </summary>
        [Output("data")]
        public Output<ImmutableDictionary<string, object>> Data { get; private set; } = null!;

        /// <summary>
        /// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Output("immutable")]
        public Output<bool?> Immutable { get; private set; } = null!;

        /// <summary>
        /// Labels for the secret v2 (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the secret v2 (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespaces of the secret v2. Default: `default` (string)
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;

        /// <summary>
        /// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a SecretV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretV2(string name, SecretV2Args args, CustomResourceOptions? options = null)
            : base("rancher2:index/secretV2:SecretV2", name, args ?? new SecretV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private SecretV2(string name, Input<string> id, SecretV2State? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/secretV2:SecretV2", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "data",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretV2 Get(string name, Input<string> id, SecretV2State? state = null, CustomResourceOptions? options = null)
        {
            return new SecretV2(name, id, state, options);
        }
    }

    public sealed class SecretV2Args : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the secret v2 (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id of the secret V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("data", required: true)]
        private InputMap<object>? _data;

        /// <summary>
        /// The data of the secret v2 (map)
        /// </summary>
        public InputMap<object> Data
        {
            get => _data ?? (_data = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _data = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Input("immutable")]
        public Input<bool>? Immutable { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the secret v2 (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the secret v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespaces of the secret v2. Default: `default` (string)
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public SecretV2Args()
        {
        }
        public static new SecretV2Args Empty => new SecretV2Args();
    }

    public sealed class SecretV2State : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the secret v2 (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id of the secret V2 (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("data")]
        private InputMap<object>? _data;

        /// <summary>
        /// The data of the secret v2 (map)
        /// </summary>
        public InputMap<object> Data
        {
            get => _data ?? (_data = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _data = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Input("immutable")]
        public Input<bool>? Immutable { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the secret v2 (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the secret v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespaces of the secret v2. Default: `default` (string)
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        /// <summary>
        /// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public SecretV2State()
        {
        }
        public static new SecretV2State Empty => new SecretV2State();
    }
}
