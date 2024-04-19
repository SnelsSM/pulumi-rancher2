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
    /// Provides a Rancher v2 Etcd Backup resource. This can be used to create an Etcd Backup for Rancher v2.2.x and above, and to retrieve their information.
    /// 
    /// The `rancher2.EtcdBackup` resource is used to define extra etcd backups for a `rancher2.Cluster`, which will be created as a local or S3 backup in accordance with the etcd backup config for the cluster. The main etcd backup config for the cluster should be set on the cluster config
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
    ///     // Create a new rancher2 Etcd Backup
    ///     var foo = new Rancher2.EtcdBackup("foo", new()
    ///     {
    ///         BackupConfig = new Rancher2.Inputs.EtcdBackupBackupConfigArgs
    ///         {
    ///             Enabled = true,
    ///             IntervalHours = 20,
    ///             Retention = 10,
    ///             S3BackupConfig = new Rancher2.Inputs.EtcdBackupBackupConfigS3BackupConfigArgs
    ///             {
    ///                 AccessKey = "access_key",
    ///                 BucketName = "bucket_name",
    ///                 Endpoint = "endpoint",
    ///                 Folder = "/folder",
    ///                 Region = "region",
    ///                 SecretKey = "secret_key",
    ///             },
    ///         },
    ///         ClusterId = "&lt;CLUSTER_ID&gt;",
    ///         Name = "foo",
    ///         Filename = "&lt;FILENAME&gt;",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Etcd Backup can be imported using the Rancher etcd backup ID
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &amp;lt;ETCD_BACKUP_ID&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/etcdBackup:EtcdBackup")]
    public partial class EtcdBackup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Output("backupConfig")]
        public Output<Outputs.EtcdBackupBackupConfig> BackupConfig { get; private set; } = null!;

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Output("filename")]
        public Output<string> Filename { get; private set; } = null!;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Output("manual")]
        public Output<bool?> Manual { get; private set; } = null!;

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Output("namespaceId")]
        public Output<string> NamespaceId { get; private set; } = null!;


        /// <summary>
        /// Create a EtcdBackup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EtcdBackup(string name, EtcdBackupArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/etcdBackup:EtcdBackup", name, args ?? new EtcdBackupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EtcdBackup(string name, Input<string> id, EtcdBackupState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/etcdBackup:EtcdBackup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EtcdBackup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EtcdBackup Get(string name, Input<string> id, EtcdBackupState? state = null, CustomResourceOptions? options = null)
        {
            return new EtcdBackup(name, id, state, options);
        }
    }

    public sealed class EtcdBackupArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Input("backupConfig")]
        public Input<Inputs.EtcdBackupBackupConfigArgs>? BackupConfig { get; set; }

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Input("manual")]
        public Input<bool>? Manual { get; set; }

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        public EtcdBackupArgs()
        {
        }
        public static new EtcdBackupArgs Empty => new EtcdBackupArgs();
    }

    public sealed class EtcdBackupState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Input("backupConfig")]
        public Input<Inputs.EtcdBackupBackupConfigGetArgs>? BackupConfig { get; set; }

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Input("manual")]
        public Input<bool>? Manual { get; set; }

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        public EtcdBackupState()
        {
        }
        public static new EtcdBackupState Empty => new EtcdBackupState();
    }
}
