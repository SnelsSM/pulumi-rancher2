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
    /// Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Project
    ///     var foo = new Rancher2.Project("foo", new()
    ///     {
    ///         Name = "foo",
    ///         ClusterId = "&lt;CLUSTER_ID&gt;",
    ///         ResourceQuota = new Rancher2.Inputs.ProjectResourceQuotaArgs
    ///         {
    ///             ProjectLimit = new Rancher2.Inputs.ProjectResourceQuotaProjectLimitArgs
    ///             {
    ///                 LimitsCpu = "2000m",
    ///                 LimitsMemory = "2000Mi",
    ///                 RequestsStorage = "2Gi",
    ///             },
    ///             NamespaceDefaultLimit = new Rancher2.Inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs
    ///             {
    ///                 LimitsCpu = "2000m",
    ///                 LimitsMemory = "500Mi",
    ///                 RequestsStorage = "1Gi",
    ///             },
    ///         },
    ///         ContainerResourceLimit = new Rancher2.Inputs.ProjectContainerResourceLimitArgs
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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Project
    ///     var foo = new Rancher2.Project("foo", new()
    ///     {
    ///         Name = "foo",
    ///         ClusterId = "&lt;CLUSTER_ID&gt;",
    ///         ResourceQuota = new Rancher2.Inputs.ProjectResourceQuotaArgs
    ///         {
    ///             ProjectLimit = new Rancher2.Inputs.ProjectResourceQuotaProjectLimitArgs
    ///             {
    ///                 LimitsCpu = "2000m",
    ///                 LimitsMemory = "2000Mi",
    ///                 RequestsStorage = "2Gi",
    ///             },
    ///             NamespaceDefaultLimit = new Rancher2.Inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs
    ///             {
    ///                 LimitsCpu = "2000m",
    ///                 LimitsMemory = "500Mi",
    ///                 RequestsStorage = "1Gi",
    ///             },
    ///         },
    ///         ContainerResourceLimit = new Rancher2.Inputs.ProjectContainerResourceLimitArgs
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
    /// Projects can be imported using the Rancher Project ID
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/project:Project foo &amp;lt;project_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id where create project (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Default containers resource limits on project (List maxitem:1)
        /// </summary>
        [Output("containerResourceLimit")]
        public Output<Outputs.ProjectContainerResourceLimit?> ContainerResourceLimit { get; private set; } = null!;

        /// <summary>
        /// A project description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the project (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Output("resourceQuota")]
        public Output<Outputs.ProjectResourceQuota?> ResourceQuota { get; private set; } = null!;

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Output("waitForCluster")]
        public Output<bool?> WaitForCluster { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/project:Project", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create project (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Default containers resource limits on project (List maxitem:1)
        /// </summary>
        [Input("containerResourceLimit")]
        public Input<Inputs.ProjectContainerResourceLimitArgs>? ContainerResourceLimit { get; set; }

        /// <summary>
        /// A project description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the project (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Input("resourceQuota")]
        public Input<Inputs.ProjectResourceQuotaArgs>? ResourceQuota { get; set; }

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Input("waitForCluster")]
        public Input<bool>? WaitForCluster { get; set; }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create project (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Default containers resource limits on project (List maxitem:1)
        /// </summary>
        [Input("containerResourceLimit")]
        public Input<Inputs.ProjectContainerResourceLimitGetArgs>? ContainerResourceLimit { get; set; }

        /// <summary>
        /// A project description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the project (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        [Input("resourceQuota")]
        public Input<Inputs.ProjectResourceQuotaGetArgs>? ResourceQuota { get; set; }

        /// <summary>
        /// Wait for cluster becomes active. Default `false` (bool)
        /// </summary>
        [Input("waitForCluster")]
        public Input<bool>? WaitForCluster { get; set; }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}
