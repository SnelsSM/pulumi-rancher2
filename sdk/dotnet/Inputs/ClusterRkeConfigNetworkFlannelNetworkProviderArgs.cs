// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkFlannelNetworkProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Iface config Canal network provider (string)
        /// </summary>
        [Input("iface")]
        public Input<string>? Iface { get; set; }

        public ClusterRkeConfigNetworkFlannelNetworkProviderArgs()
        {
        }
        public static new ClusterRkeConfigNetworkFlannelNetworkProviderArgs Empty => new ClusterRkeConfigNetworkFlannelNetworkProviderArgs();
    }
}
