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
    /// Provides a Rancher v2 Node Driver resource. This can be used to create Node Driver for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new rancher2 Node Driver
    ///     var foo = new Rancher2.NodeDriver("foo", new()
    ///     {
    ///         Active = true,
    ///         Builtin = false,
    ///         Checksum = "0x0",
    ///         Description = "Foo description",
    ///         ExternalId = "foo_external",
    ///         Name = "foo",
    ///         UiUrl = "local://ui",
    ///         Url = "local://",
    ///         WhitelistDomains = new[]
    ///         {
    ///             "*.foo.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Node Driver can be imported using the Rancher Node Driver ID
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/nodeDriver:NodeDriver foo &amp;lt;node_driver_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/nodeDriver:NodeDriver")]
    public partial class NodeDriver : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specify if the node driver state (bool)
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Specify wheter the node driver is an internal node driver or not (bool)
        /// </summary>
        [Output("builtin")]
        public Output<bool> Builtin { get; private set; } = null!;

        /// <summary>
        /// Verify that the downloaded driver matches the expected checksum (string)
        /// </summary>
        [Output("checksum")]
        public Output<string?> Checksum { get; private set; } = null!;

        /// <summary>
        /// Description of the node driver (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// External ID (string)
        /// </summary>
        [Output("externalId")]
        public Output<string?> ExternalId { get; private set; } = null!;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the node driver (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The URL to load for customized Add Nodes screen for this driver (string)
        /// </summary>
        [Output("uiUrl")]
        public Output<string?> UiUrl { get; private set; } = null!;

        /// <summary>
        /// The URL to download the machine driver binary for 64-bit Linux (string)
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Domains to whitelist for the ui (list)
        /// </summary>
        [Output("whitelistDomains")]
        public Output<ImmutableArray<string>> WhitelistDomains { get; private set; } = null!;


        /// <summary>
        /// Create a NodeDriver resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodeDriver(string name, NodeDriverArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeDriver:NodeDriver", name, args ?? new NodeDriverArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodeDriver(string name, Input<string> id, NodeDriverState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeDriver:NodeDriver", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NodeDriver resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodeDriver Get(string name, Input<string> id, NodeDriverState? state = null, CustomResourceOptions? options = null)
        {
            return new NodeDriver(name, id, state, options);
        }
    }

    public sealed class NodeDriverArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify if the node driver state (bool)
        /// </summary>
        [Input("active", required: true)]
        public Input<bool> Active { get; set; } = null!;

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Specify wheter the node driver is an internal node driver or not (bool)
        /// </summary>
        [Input("builtin", required: true)]
        public Input<bool> Builtin { get; set; } = null!;

        /// <summary>
        /// Verify that the downloaded driver matches the expected checksum (string)
        /// </summary>
        [Input("checksum")]
        public Input<string>? Checksum { get; set; }

        /// <summary>
        /// Description of the node driver (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External ID (string)
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the node driver (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL to load for customized Add Nodes screen for this driver (string)
        /// </summary>
        [Input("uiUrl")]
        public Input<string>? UiUrl { get; set; }

        /// <summary>
        /// The URL to download the machine driver binary for 64-bit Linux (string)
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("whitelistDomains")]
        private InputList<string>? _whitelistDomains;

        /// <summary>
        /// Domains to whitelist for the ui (list)
        /// </summary>
        public InputList<string> WhitelistDomains
        {
            get => _whitelistDomains ?? (_whitelistDomains = new InputList<string>());
            set => _whitelistDomains = value;
        }

        public NodeDriverArgs()
        {
        }
        public static new NodeDriverArgs Empty => new NodeDriverArgs();
    }

    public sealed class NodeDriverState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify if the node driver state (bool)
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Specify wheter the node driver is an internal node driver or not (bool)
        /// </summary>
        [Input("builtin")]
        public Input<bool>? Builtin { get; set; }

        /// <summary>
        /// Verify that the downloaded driver matches the expected checksum (string)
        /// </summary>
        [Input("checksum")]
        public Input<string>? Checksum { get; set; }

        /// <summary>
        /// Description of the node driver (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External ID (string)
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the node driver (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL to load for customized Add Nodes screen for this driver (string)
        /// </summary>
        [Input("uiUrl")]
        public Input<string>? UiUrl { get; set; }

        /// <summary>
        /// The URL to download the machine driver binary for 64-bit Linux (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("whitelistDomains")]
        private InputList<string>? _whitelistDomains;

        /// <summary>
        /// Domains to whitelist for the ui (list)
        /// </summary>
        public InputList<string> WhitelistDomains
        {
            get => _whitelistDomains ?? (_whitelistDomains = new InputList<string>());
            set => _whitelistDomains = value;
        }

        public NodeDriverState()
        {
        }
        public static new NodeDriverState Empty => new NodeDriverState();
    }
}
