// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetEtcdBackup
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 etcd backup.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetEtcdBackup.InvokeAsync(new Rancher2.GetEtcdBackupArgs
        ///         {
        ///             ClusterId = "&lt;CLUSTER_ID&gt;",
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEtcdBackupResult> InvokeAsync(GetEtcdBackupArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEtcdBackupResult>("rancher2:index/getEtcdBackup:getEtcdBackup", args ?? new GetEtcdBackupArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 etcd backup.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetEtcdBackup.InvokeAsync(new Rancher2.GetEtcdBackupArgs
        ///         {
        ///             ClusterId = "&lt;CLUSTER_ID&gt;",
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEtcdBackupResult> Invoke(GetEtcdBackupInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetEtcdBackupResult>("rancher2:index/getEtcdBackup:getEtcdBackup", args ?? new GetEtcdBackupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEtcdBackupArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetEtcdBackupArgs()
        {
        }
    }

    public sealed class GetEtcdBackupInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetEtcdBackupInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEtcdBackupResult
    {
        /// <summary>
        /// (Computed) Annotations for Etcd Backup object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Backup config for etcd backup (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetEtcdBackupBackupConfigResult BackupConfig;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) Filename of the Etcd Backup (string)
        /// </summary>
        public readonly string Filename;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for Etcd Backup object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        public readonly bool Manual;
        public readonly string Name;
        /// <summary>
        /// (Computed) Description for the Etcd Backup (string)
        /// </summary>
        public readonly string NamespaceId;

        [OutputConstructor]
        private GetEtcdBackupResult(
            ImmutableDictionary<string, object> annotations,

            Outputs.GetEtcdBackupBackupConfigResult backupConfig,

            string clusterId,

            string filename,

            string id,

            ImmutableDictionary<string, object> labels,

            bool manual,

            string name,

            string namespaceId)
        {
            Annotations = annotations;
            BackupConfig = backupConfig;
            ClusterId = clusterId;
            Filename = filename;
            Id = id;
            Labels = labels;
            Manual = manual;
            Name = name;
            NamespaceId = namespaceId;
        }
    }
}
