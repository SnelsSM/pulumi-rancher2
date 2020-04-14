// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingFluentdConfigFluentServerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Endpoint of the syslog service (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// Hostname of the fluentd service (string)
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// User password of the fluentd service (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Shared key of the fluentd service (string)
        /// </summary>
        [Input("sharedKey")]
        public Input<string>? SharedKey { get; set; }

        /// <summary>
        /// Standby server of the fluentd service (bool)
        /// </summary>
        [Input("standby")]
        public Input<bool>? Standby { get; set; }

        /// <summary>
        /// Username of the fluentd service (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Weight of the fluentd server (int)
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public ClusterLoggingFluentdConfigFluentServerGetArgs()
        {
        }
    }
}
