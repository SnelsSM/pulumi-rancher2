// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2IpAllocationPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GKE cluster ip v4 allocation cidr block (string)
        /// </summary>
        [Input("clusterIpv4CidrBlock")]
        public Input<string>? ClusterIpv4CidrBlock { get; set; }

        /// <summary>
        /// The GKE cluster ip v4 allocation secondary range name(string)
        /// </summary>
        [Input("clusterSecondaryRangeName")]
        public Input<string>? ClusterSecondaryRangeName { get; set; }

        /// <summary>
        /// Create GKE subnetwork? Default: `false` (bool)
        /// </summary>
        [Input("createSubnetwork")]
        public Input<bool>? CreateSubnetwork { get; set; }

        /// <summary>
        /// The GKE node ip v4 allocation cidr block (string)
        /// </summary>
        [Input("nodeIpv4CidrBlock")]
        public Input<string>? NodeIpv4CidrBlock { get; set; }

        /// <summary>
        /// The GKE services ip v4 allocation cidr block (string)
        /// </summary>
        [Input("servicesIpv4CidrBlock")]
        public Input<string>? ServicesIpv4CidrBlock { get; set; }

        /// <summary>
        /// The GKE services ip v4 allocation secondary range name (string)
        /// </summary>
        [Input("servicesSecondaryRangeName")]
        public Input<string>? ServicesSecondaryRangeName { get; set; }

        /// <summary>
        /// The GKE cluster subnetwork name (string)
        /// </summary>
        [Input("subnetworkName")]
        public Input<string>? SubnetworkName { get; set; }

        /// <summary>
        /// Use GKE ip aliases? Default: `true` (bool)
        /// </summary>
        [Input("useIpAliases")]
        public Input<bool>? UseIpAliases { get; set; }

        public ClusterGkeConfigV2IpAllocationPolicyArgs()
        {
        }
    }
}
