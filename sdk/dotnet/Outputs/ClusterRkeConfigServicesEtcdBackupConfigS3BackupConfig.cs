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
    public sealed class ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfig
    {
        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
        /// </summary>
        public readonly string? CustomCa;
        /// <summary>
        /// Endpoint for S3 service (string)
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
        public readonly string? SecretKey;

        [OutputConstructor]
        private ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfig(
            string? accessKey,

            string bucketName,

            string? customCa,

            string endpoint,

            string? folder,

            string? region,

            string? secretKey)
        {
            AccessKey = accessKey;
            BucketName = bucketName;
            CustomCa = customCa;
            Endpoint = endpoint;
            Folder = folder;
            Region = region;
            SecretKey = secretKey;
        }
    }
}
