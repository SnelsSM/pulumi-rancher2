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
    /// Provides a Rancher v2 app resource. This can be used to deploy apps within Rancher v2 projects.
    /// 
    /// This resource can also modify Rancher v2 apps in 3 ways:
    /// - `Update`: If `description`, `annotations` or `labels` arguments are modified the app will be updated. No new `revision_id` will be generated in Rancher.
    /// - `Upgrade`: If `answers`, `catalog_name`, `template_name`, `template_version` or `values_yaml` arguments are modified, the app will be upgraded. A new `revision_id` will be generated in Rancher.
    /// - `Rollback`: If `revision_id` argument is provided or modified the app will be rolled back accordingly. A new `revision_id` will be generated in Rancher. It will also generate a non-empty pulumi preview that will require manual .tf file intervention. Use carefully.
    /// 
    /// Note: In case of multiple resource modifications in a row, `rollback` has preference over `upgrade`.
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
    ///     // Create a new rancher2 App
    ///     var foo = new Rancher2.App("foo", new()
    ///     {
    ///         CatalogName = "&lt;catalog_name&gt;",
    ///         Name = "foo",
    ///         Description = "Foo app",
    ///         ProjectId = "&lt;project_id&gt;",
    ///         TemplateName = "&lt;template_name&gt;",
    ///         TemplateVersion = "&lt;template_version&gt;",
    ///         TargetNamespace = "&lt;namespace_name&gt;",
    ///         Answers = 
    ///         {
    ///             { "ingress_host", "test.xip.io" },
    ///             { "foo", "bar" },
    ///             { "ingress.annotations.nginx.ingress.kubernetes.io/force-ssl-redirect", "true" },
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
    ///     // Create a new rancher2 App in a new namespace
    ///     var foo = new Rancher2.Namespace("foo", new()
    ///     {
    ///         Name = "foo",
    ///         Description = "Foo namespace",
    ///         ProjectId = "&lt;project_id&gt;",
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
    ///     var fooApp = new Rancher2.App("foo", new()
    ///     {
    ///         CatalogName = "&lt;catalog_name&gt;",
    ///         Name = "foo",
    ///         Description = "Foo app",
    ///         ProjectId = "&lt;project_id&gt;",
    ///         TemplateName = "&lt;template_name&gt;",
    ///         TemplateVersion = "&lt;template_version&gt;",
    ///         TargetNamespace = foo.Id,
    ///         Answers = 
    ///         {
    ///             { "ingress_host", "test.xip.io" },
    ///             { "foo", "bar" },
    ///             { "ingress.annotations.nginx.ingress.kubernetes.io/force-ssl-redirect", "true" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Apps can be imported using the app ID in the format `&lt;project_id&gt;:&lt;app_name&gt;`
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/app:App foo &amp;lt;PROJECT_ID_ID&amp;gt;:&amp;lt;APP_NAME&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/app:App")]
    public partial class App : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for App object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Answers for the app template. If modified, app will be upgraded (map)
        /// </summary>
        [Output("answers")]
        public Output<ImmutableDictionary<string, string>?> Answers { get; private set; } = null!;

        /// <summary>
        /// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
        /// * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
        /// * add project ID before name, `p-XXXXX:&lt;name&gt;`
        /// </summary>
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        /// <summary>
        /// Description for the app (string)
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// (Computed) The url of the app template on a catalog (string)
        /// </summary>
        [Output("externalId")]
        public Output<string> ExternalId { get; private set; } = null!;

        /// <summary>
        /// Force app upgrade (string)
        /// </summary>
        [Output("forceUpgrade")]
        public Output<bool?> ForceUpgrade { get; private set; } = null!;

        /// <summary>
        /// Labels for App object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the app (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project id where the app will be installed (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        /// </summary>
        [Output("revisionId")]
        public Output<string> RevisionId { get; private set; } = null!;

        /// <summary>
        /// The namespace id where the app will be installed (string)
        /// </summary>
        [Output("targetNamespace")]
        public Output<string> TargetNamespace { get; private set; } = null!;

        /// <summary>
        /// Template name of the app. If modified, app will be upgraded (string)
        /// </summary>
        [Output("templateName")]
        public Output<string> TemplateName { get; private set; } = null!;

        /// <summary>
        /// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        /// </summary>
        [Output("templateVersion")]
        public Output<string> TemplateVersion { get; private set; } = null!;

        /// <summary>
        /// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
        /// </summary>
        [Output("valuesYaml")]
        public Output<string?> ValuesYaml { get; private set; } = null!;

        /// <summary>
        /// Wait until app is deployed and active. Default: `true` (bool)
        /// </summary>
        [Output("wait")]
        public Output<bool?> Wait { get; private set; } = null!;


        /// <summary>
        /// Create a App resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public App(string name, AppArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/app:App", name, args ?? new AppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private App(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/app:App", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing App resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static App Get(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
        {
            return new App(name, id, state, options);
        }
    }

    public sealed class AppArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for App object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("answers")]
        private InputMap<string>? _answers;

        /// <summary>
        /// Answers for the app template. If modified, app will be upgraded (map)
        /// </summary>
        public InputMap<string> Answers
        {
            get => _answers ?? (_answers = new InputMap<string>());
            set => _answers = value;
        }

        /// <summary>
        /// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
        /// * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
        /// * add project ID before name, `p-XXXXX:&lt;name&gt;`
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        /// <summary>
        /// Description for the app (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Force app upgrade (string)
        /// </summary>
        [Input("forceUpgrade")]
        public Input<bool>? ForceUpgrade { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for App object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the app (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where the app will be installed (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        /// </summary>
        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// The namespace id where the app will be installed (string)
        /// </summary>
        [Input("targetNamespace", required: true)]
        public Input<string> TargetNamespace { get; set; } = null!;

        /// <summary>
        /// Template name of the app. If modified, app will be upgraded (string)
        /// </summary>
        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        /// <summary>
        /// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        /// <summary>
        /// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
        /// </summary>
        [Input("valuesYaml")]
        public Input<string>? ValuesYaml { get; set; }

        /// <summary>
        /// Wait until app is deployed and active. Default: `true` (bool)
        /// </summary>
        [Input("wait")]
        public Input<bool>? Wait { get; set; }

        public AppArgs()
        {
        }
        public static new AppArgs Empty => new AppArgs();
    }

    public sealed class AppState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for App object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("answers")]
        private InputMap<string>? _answers;

        /// <summary>
        /// Answers for the app template. If modified, app will be upgraded (map)
        /// </summary>
        public InputMap<string> Answers
        {
            get => _answers ?? (_answers = new InputMap<string>());
            set => _answers = value;
        }

        /// <summary>
        /// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
        /// * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
        /// * add project ID before name, `p-XXXXX:&lt;name&gt;`
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// Description for the app (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (Computed) The url of the app template on a catalog (string)
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Force app upgrade (string)
        /// </summary>
        [Input("forceUpgrade")]
        public Input<bool>? ForceUpgrade { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for App object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the app (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project id where the app will be installed (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        /// </summary>
        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// The namespace id where the app will be installed (string)
        /// </summary>
        [Input("targetNamespace")]
        public Input<string>? TargetNamespace { get; set; }

        /// <summary>
        /// Template name of the app. If modified, app will be upgraded (string)
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        /// <summary>
        /// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        /// <summary>
        /// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
        /// </summary>
        [Input("valuesYaml")]
        public Input<string>? ValuesYaml { get; set; }

        /// <summary>
        /// Wait until app is deployed and active. Default: `true` (bool)
        /// </summary>
        [Input("wait")]
        public Input<bool>? Wait { get; set; }

        public AppState()
        {
        }
        public static new AppState Empty => new AppState();
    }
}
