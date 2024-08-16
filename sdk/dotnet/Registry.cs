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
    /// Provides a Rancher v2 Registry resource. This resource creates Kubernetes secrets with the type `kubernetes.io/dockerconfigjson` for authenticating against Docker registries for Rancher v2 environments and retrieving their information.
    /// 
    /// Depending on the availability, there are 2 types of Rancher v2 Docker registry resources:
    /// - Project registry resource: Available to all namespaces in the `project_id`.
    /// - Namespaced registry resource: Available to `namespace_id` in the `project_id`.
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
    ///     // Create a new rancher2 Project Registry
    ///     var foo = new Rancher2.Registry("foo", new()
    ///     {
    ///         Name = "foo",
    ///         Description = "Terraform registry foo",
    ///         ProjectId = "&lt;project_id&gt;",
    ///         Registries = new[]
    ///         {
    ///             new Rancher2.Inputs.RegistryRegistryArgs
    ///             {
    ///                 Address = "test.io",
    ///                 Username = "user",
    ///                 Password = "pass",
    ///             },
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
    ///     // Create a new rancher2 Namespaced Registry
    ///     var foo = new Rancher2.Registry("foo", new()
    ///     {
    ///         Name = "foo",
    ///         Description = "Terraform registry foo",
    ///         ProjectId = "&lt;project_id&gt;",
    ///         NamespaceId = "&lt;namespace_id&gt;",
    ///         Registries = new[]
    ///         {
    ///             new Rancher2.Inputs.RegistryRegistryArgs
    ///             {
    ///                 Address = "test.io",
    ///                 Username = "user2",
    ///                 Password = "pass",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Registries can be imported using the registry ID in the format `&lt;namespace_id&gt;.&lt;project_id&gt;.&lt;registry_id&gt;`
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/registry:Registry foo &amp;lt;namespace_id&amp;gt;.&amp;lt;project_id&amp;gt;.&amp;lt;registry_id&amp;gt;
    /// ```
    /// `&lt;namespace_id&gt;` is optional, just needed for namespaced registry.
    /// </summary>
    [Rancher2ResourceType("rancher2:index/registry:Registry")]
    public partial class Registry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Registry object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// A registry description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Labels for Registry object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the registry (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace id where to assign the namespaced registry (string)
        /// </summary>
        [Output("namespaceId")]
        public Output<string?> NamespaceId { get; private set; } = null!;

        /// <summary>
        /// The project id where to assign the registry (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Registries data for registry (list)
        /// </summary>
        [Output("registries")]
        public Output<ImmutableArray<Outputs.RegistryRegistry>> Registries { get; private set; } = null!;


        /// <summary>
        /// Create a Registry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Registry(string name, RegistryArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/registry:Registry", name, args ?? new RegistryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Registry(string name, Input<string> id, RegistryState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/registry:Registry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Registry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Registry Get(string name, Input<string> id, RegistryState? state = null, CustomResourceOptions? options = null)
        {
            return new Registry(name, id, state, options);
        }
    }

    public sealed class RegistryArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for Registry object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// A registry description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for Registry object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the registry (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        [Input("registries", required: true)]
        private InputList<Inputs.RegistryRegistryArgs>? _registries;

        /// <summary>
        /// Registries data for registry (list)
        /// </summary>
        public InputList<Inputs.RegistryRegistryArgs> Registries
        {
            get => _registries ?? (_registries = new InputList<Inputs.RegistryRegistryArgs>());
            set => _registries = value;
        }

        public RegistryArgs()
        {
        }
        public static new RegistryArgs Empty => new RegistryArgs();
    }

    public sealed class RegistryState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for Registry object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// A registry description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for Registry object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the registry (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace id where to assign the namespaced registry (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// The project id where to assign the registry (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("registries")]
        private InputList<Inputs.RegistryRegistryGetArgs>? _registries;

        /// <summary>
        /// Registries data for registry (list)
        /// </summary>
        public InputList<Inputs.RegistryRegistryGetArgs> Registries
        {
            get => _registries ?? (_registries = new InputList<Inputs.RegistryRegistryGetArgs>());
            set => _registries = value;
        }

        public RegistryState()
        {
        }
        public static new RegistryState Empty => new RegistryState();
    }
}
