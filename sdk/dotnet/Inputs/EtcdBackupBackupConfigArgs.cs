// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class EtcdBackupBackupConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable etcd backup (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
        /// </summary>
        [Input("s3BackupConfig")]
        public Input<Inputs.EtcdBackupBackupConfigS3BackupConfigArgs>? S3BackupConfig { get; set; }

        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public EtcdBackupBackupConfigArgs()
        {
        }
        public static new EtcdBackupBackupConfigArgs Empty => new EtcdBackupBackupConfigArgs();
    }
}
