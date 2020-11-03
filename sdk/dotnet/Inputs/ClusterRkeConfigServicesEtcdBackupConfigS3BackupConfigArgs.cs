// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Client ID to use (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
        /// </summary>
        [Input("customCa")]
        public Input<string>? CustomCa { get; set; }

        /// <summary>
        /// Endpoint for S3 service (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The AWS Client Secret associated with the Client ID (string)
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs()
        {
        }
    }
}
