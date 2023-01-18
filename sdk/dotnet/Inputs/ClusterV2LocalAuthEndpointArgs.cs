// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2LocalAuthEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CA certs for the authorized cluster endpoint (string)
        /// </summary>
        [Input("caCerts")]
        public Input<string>? CaCerts { get; set; }

        /// <summary>
        /// Enable the authorized cluster endpoint. Default `false` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// FQDN for the authorized cluster endpoint (string)
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        public ClusterV2LocalAuthEndpointArgs()
        {
        }
        public static new ClusterV2LocalAuthEndpointArgs Empty => new ClusterV2LocalAuthEndpointArgs();
    }
}
