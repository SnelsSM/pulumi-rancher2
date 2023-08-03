// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesEtcdBackupConfigArgs : global::Pulumi.ResourceArgs
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
        /// Retention option for etcd service (string)
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// S3 config options for etcd backup (list maxitems:1)
        /// </summary>
        [Input("s3BackupConfig")]
        public Input<Inputs.ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs>? S3BackupConfig { get; set; }

        /// <summary>
        /// Safe timestamp for etcd backup. Default: `false` (bool)
        /// </summary>
        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        /// <summary>
        /// Timeout in seconds for etcd backup. Default: `300`. For Rancher v2.5.6 and above (int)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ClusterRkeConfigServicesEtcdBackupConfigArgs()
        {
        }
        public static new ClusterRkeConfigServicesEtcdBackupConfigArgs Empty => new ClusterRkeConfigServicesEtcdBackupConfigArgs();
    }
}
