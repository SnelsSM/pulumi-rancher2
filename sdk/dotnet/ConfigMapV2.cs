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
    /// Provides a Rancher ConfigMap v2 resource. This can be used to create k8s configMaps for Rancher v2 environments and retrieve their information. ConfigMap v2 resource is available at Rancher v2.5.x and above.
    /// 
    /// ## Import
    /// 
    /// V2 configMaps can be imported using the Rancher cluster ID, ConfigMap V2 namespace and name.
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/configMapV2:ConfigMapV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;SECRET_V2_NAMESPACE&amp;gt;/&amp;lt;SECRET_V2_NAME&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/configMapV2:ConfigMapV2")]
    public partial class ConfigMapV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for the configMap v2 (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id of the configMap V2 (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The data of the configMap v2 (map)
        /// </summary>
        [Output("data")]
        public Output<ImmutableDictionary<string, string>> Data { get; private set; } = null!;

        /// <summary>
        /// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Output("immutable")]
        public Output<bool?> Immutable { get; private set; } = null!;

        /// <summary>
        /// Labels for the configMap v2 (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the configMap v2 (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespaces of the configMap v2. Default: `default` (string)
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigMapV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigMapV2(string name, ConfigMapV2Args args, CustomResourceOptions? options = null)
            : base("rancher2:index/configMapV2:ConfigMapV2", name, args ?? new ConfigMapV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigMapV2(string name, Input<string> id, ConfigMapV2State? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/configMapV2:ConfigMapV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigMapV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigMapV2 Get(string name, Input<string> id, ConfigMapV2State? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigMapV2(name, id, state, options);
        }
    }

    public sealed class ConfigMapV2Args : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for the configMap v2 (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id of the configMap V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("data", required: true)]
        private InputMap<string>? _data;

        /// <summary>
        /// The data of the configMap v2 (map)
        /// </summary>
        public InputMap<string> Data
        {
            get => _data ?? (_data = new InputMap<string>());
            set => _data = value;
        }

        /// <summary>
        /// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Input("immutable")]
        public Input<bool>? Immutable { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for the configMap v2 (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the configMap v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespaces of the configMap v2. Default: `default` (string)
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public ConfigMapV2Args()
        {
        }
        public static new ConfigMapV2Args Empty => new ConfigMapV2Args();
    }

    public sealed class ConfigMapV2State : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for the configMap v2 (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id of the configMap V2 (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("data")]
        private InputMap<string>? _data;

        /// <summary>
        /// The data of the configMap v2 (map)
        /// </summary>
        public InputMap<string> Data
        {
            get => _data ?? (_data = new InputMap<string>());
            set => _data = value;
        }

        /// <summary>
        /// If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
        /// </summary>
        [Input("immutable")]
        public Input<bool>? Immutable { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for the configMap v2 (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the configMap v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespaces of the configMap v2. Default: `default` (string)
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        public ConfigMapV2State()
        {
        }
        public static new ConfigMapV2State Empty => new ConfigMapV2State();
    }
}
