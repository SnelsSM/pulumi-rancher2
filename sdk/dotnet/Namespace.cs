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
    /// Provides a Rancher v2 Namespace resource. This can be used to create namespaces for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Namespace
    ///     var foo = new Rancher2.Namespace("foo", new()
    ///     {
    ///         ContainerResourceLimit = new Rancher2.Inputs.NamespaceContainerResourceLimitArgs
    ///         {
    ///             LimitsCpu = "20m",
    ///             LimitsMemory = "20Mi",
    ///             RequestsCpu = "1m",
    ///             RequestsMemory = "1Mi",
    ///         },
    ///         Description = "foo namespace",
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         ResourceQuota = new Rancher2.Inputs.NamespaceResourceQuotaArgs
    ///         {
    ///             Limit = new Rancher2.Inputs.NamespaceResourceQuotaLimitArgs
    ///             {
    ///                 LimitsCpu = "100m",
    ///                 LimitsMemory = "100Mi",
    ///                 RequestsStorage = "1Gi",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Cluster 
    ///     var foo_custom = new Rancher2.Cluster("foo-custom", new()
    ///     {
    ///         Description = "Foo rancher2 custom cluster",
    ///         RkeConfig = new Rancher2.Inputs.ClusterRkeConfigArgs
    ///         {
    ///             Network = new Rancher2.Inputs.ClusterRkeConfigNetworkArgs
    ///             {
    ///                 Plugin = "canal",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create a new rancher2 Namespace assigned to default cluster project
    ///     var foo = new Rancher2.Namespace("foo", new()
    ///     {
    ///         ProjectId = foo_custom.DefaultProjectId,
    ///         Description = "foo namespace",
    ///         ResourceQuota = new Rancher2.Inputs.NamespaceResourceQuotaArgs
    ///         {
    ///             Limit = new Rancher2.Inputs.NamespaceResourceQuotaLimitArgs
    ///             {
    ///                 LimitsCpu = "100m",
    ///                 LimitsMemory = "100Mi",
    ///                 RequestsStorage = "1Gi",
    ///             },
    ///         },
    ///         ContainerResourceLimit = new Rancher2.Inputs.NamespaceContainerResourceLimitArgs
    ///         {
    ///             LimitsCpu = "20m",
    ///             LimitsMemory = "20Mi",
    ///             RequestsCpu = "1m",
    ///             RequestsMemory = "1Mi",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Namespaces can be imported using the namespace ID in the format `&lt;project_id&gt;.&lt;namespace_id&gt;`
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/namespace:Namespace foo &amp;lt;project_id&amp;gt;.&amp;lt;namespaces_id&amp;gt;
    /// ```
    /// 
    ///  `&lt;project_id&gt;` is in the format `&lt;cluster_id&gt;:&lt;id&gt;`, but &lt;id&gt; part is optional:
    /// 
    /// - If full project_id is provided, `&lt;project_id&gt;=&lt;cluster_id&gt;:&lt;id&gt;`, the namespace'll be assigned to corresponding cluster project once it's imported.
    /// 
    /// - If `&lt;id&gt;` part is omitted `&lt;project_id&gt;=&lt;cluster_id&gt;`, the namespace'll not be assigned to any project. To move it into a project, `&lt;project_id&gt;=&lt;cluster_id&gt;:&lt;id&gt;` needs to be updated in tf file. Namespace movement is only supported inside same `cluster_id`.
    /// </summary>
    [Rancher2ResourceType("rancher2:index/namespace:Namespace")]
    public partial class Namespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Default containers resource limits on namespace (List maxitem:1)
        /// </summary>
        [Output("containerResourceLimit")]
        public Output<Outputs.NamespaceContainerResourceLimit?> ContainerResourceLimit { get; private set; } = null!;

        /// <summary>
        /// A namespace description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the namespace (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project id where assign namespace. It's on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Output("resourceQuota")]
        public Output<Outputs.NamespaceResourceQuota> ResourceQuota { get; private set; } = null!;

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Output("waitForCluster")]
        public Output<bool?> WaitForCluster { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Default containers resource limits on namespace (List maxitem:1)
        /// </summary>
        [Input("containerResourceLimit")]
        public Input<Inputs.NamespaceContainerResourceLimitArgs>? ContainerResourceLimit { get; set; }

        /// <summary>
        /// A namespace description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the namespace (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where assign namespace. It's on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Input("resourceQuota")]
        public Input<Inputs.NamespaceResourceQuotaArgs>? ResourceQuota { get; set; }

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Input("waitForCluster")]
        public Input<bool>? WaitForCluster { get; set; }

        public NamespaceArgs()
        {
        }
        public static new NamespaceArgs Empty => new NamespaceArgs();
    }

    public sealed class NamespaceState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Default containers resource limits on namespace (List maxitem:1)
        /// </summary>
        [Input("containerResourceLimit")]
        public Input<Inputs.NamespaceContainerResourceLimitGetArgs>? ContainerResourceLimit { get; set; }

        /// <summary>
        /// A namespace description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the namespace (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where assign namespace. It's on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Input("resourceQuota")]
        public Input<Inputs.NamespaceResourceQuotaGetArgs>? ResourceQuota { get; set; }

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Input("waitForCluster")]
        public Input<bool>? WaitForCluster { get; set; }

        public NamespaceState()
        {
        }
        public static new NamespaceState Empty => new NamespaceState();
    }
}
