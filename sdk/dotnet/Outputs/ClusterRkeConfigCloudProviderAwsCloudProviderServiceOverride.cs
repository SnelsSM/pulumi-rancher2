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
    public sealed class ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride
    {
        /// <summary>
        /// The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string Service;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningMethod;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningName;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? SigningRegion;
        /// <summary>
        /// Registry URL (string)
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride(
            string? region,

            string service,

            string? signingMethod,

            string? signingName,

            string? signingRegion,

            string? url)
        {
            Region = region;
            Service = service;
            SigningMethod = signingMethod;
            SigningName = signingName;
            SigningRegion = signingRegion;
            Url = url;
        }
    }
}
