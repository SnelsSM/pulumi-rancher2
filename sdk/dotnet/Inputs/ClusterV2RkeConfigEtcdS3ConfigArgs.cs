// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigEtcdS3ConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// ETCD snapshot S3 cloud credential name (string)
        /// </summary>
        [Input("cloudCredentialName")]
        public Input<string>? CloudCredentialName { get; set; }

        /// <summary>
        /// ETCD snapshot S3 endpoint (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// ETCD snapshot S3 endpoint CA (string)
        /// </summary>
        [Input("endpointCa")]
        public Input<string>? EndpointCa { get; set; }

        /// <summary>
        /// ETCD snapshot S3 folder (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// ETCD snapshot S3 region (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Disable ETCD skip ssl verify. Default: `false` (bool)
        /// </summary>
        [Input("skipSslVerify")]
        public Input<bool>? SkipSslVerify { get; set; }

        public ClusterV2RkeConfigEtcdS3ConfigArgs()
        {
        }
    }
}
