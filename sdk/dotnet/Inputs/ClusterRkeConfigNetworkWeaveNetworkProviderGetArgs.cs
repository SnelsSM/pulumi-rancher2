// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkWeaveNetworkProviderGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Registry password (string)
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        public ClusterRkeConfigNetworkWeaveNetworkProviderGetArgs()
        {
        }
    }
}
