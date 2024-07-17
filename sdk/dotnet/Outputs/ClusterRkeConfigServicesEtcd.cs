// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterRkeConfigServicesEtcd
    {
        /// <summary>
        /// Backup options for etcd service. For Rancher v2.2.x (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesEtcdBackupConfig? BackupConfig;
        /// <summary>
        /// (Computed/Sensitive) K8s cluster ca cert (string)
        /// </summary>
        public readonly string? CaCert;
        /// <summary>
        /// TLS certificate for etcd service (string)
        /// </summary>
        public readonly string? Cert;
        /// <summary>
        /// Creation option for etcd service (string)
        /// </summary>
        public readonly string? Creation;
        /// <summary>
        /// External urls for etcd service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExternalUrls;
        /// <summary>
        /// Extra arguments for scheduler service (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        /// <summary>
        /// Extra binds for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraBinds;
        /// <summary>
        /// Extra environment for scheduler service (list)
        /// </summary>
        public readonly ImmutableArray<string> ExtraEnvs;
        /// <summary>
        /// Etcd service GID. Default: `0`. For Rancher v2.3.x and above (int)
        /// </summary>
        public readonly int? Gid;
        /// <summary>
        /// Docker image for scheduler service (string)
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// The GKE taint key (string)
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        public readonly string? Retention;
        /// <summary>
        /// Snapshot option for etcd service (bool)
        /// </summary>
        public readonly bool? Snapshot;
        /// <summary>
        /// Etcd service UID. Default: `0`. For Rancher v2.3.x and above (int)
        /// </summary>
        public readonly int? Uid;

        [OutputConstructor]
        private ClusterRkeConfigServicesEtcd(
            Outputs.ClusterRkeConfigServicesEtcdBackupConfig? backupConfig,

            string? caCert,

            string? cert,

            string? creation,

            ImmutableArray<string> externalUrls,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            int? gid,

            string? image,

            string? key,

            string? path,

            string? retention,

            bool? snapshot,

            int? uid)
        {
            BackupConfig = backupConfig;
            CaCert = caCert;
            Cert = cert;
            Creation = creation;
            ExternalUrls = externalUrls;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Gid = gid;
            Image = image;
            Key = key;
            Path = path;
            Retention = retention;
            Snapshot = snapshot;
            Uid = uid;
        }
    }
}
