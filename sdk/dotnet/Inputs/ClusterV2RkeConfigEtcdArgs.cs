// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigEtcdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable ETCD snapshots. Default: `false` (bool)
        /// </summary>
        [Input("disableSnapshots")]
        public Input<bool>? DisableSnapshots { get; set; }

        /// <summary>
        /// Creation option for etcd service (list maxitems:1)
        /// </summary>
        [Input("s3Config")]
        public Input<Inputs.ClusterV2RkeConfigEtcdS3ConfigArgs>? S3Config { get; set; }

        /// <summary>
        /// ETCD snapshot retention (int)
        /// </summary>
        [Input("snapshotRetention")]
        public Input<int>? SnapshotRetention { get; set; }

        /// <summary>
        /// ETCD snapshot schedule cron (e.g `\"0 */5 * * *\"`) (string)
        /// </summary>
        [Input("snapshotScheduleCron")]
        public Input<string>? SnapshotScheduleCron { get; set; }

        public ClusterV2RkeConfigEtcdArgs()
        {
        }
        public static new ClusterV2RkeConfigEtcdArgs Empty => new ClusterV2RkeConfigEtcdArgs();
    }
}
