// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadataArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (int)
        /// </summary>
        [Input("requestTimeout")]
        public Input<int>? RequestTimeout { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("searchOrder")]
        public Input<string>? SearchOrder { get; set; }

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadataArgs()
        {
        }
    }
}
