// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingElasticsearchConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// User password for the elascticsearch service (string)
        /// </summary>
        [Input("authPassword")]
        public Input<string>? AuthPassword { get; set; }

        /// <summary>
        /// Username for the elascticsearch service (string)
        /// </summary>
        [Input("authUsername")]
        public Input<string>? AuthUsername { get; set; }

        /// <summary>
        /// SSL certificate for the syslog service (string)
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// SSL client certificate for the syslog service (string)
        /// </summary>
        [Input("clientCert")]
        public Input<string>? ClientCert { get; set; }

        /// <summary>
        /// SSL client key for the syslog service (string)
        /// </summary>
        [Input("clientKey")]
        public Input<string>? ClientKey { get; set; }

        /// <summary>
        /// SSL client key password for the splunk service (string)
        /// </summary>
        [Input("clientKeyPass")]
        public Input<string>? ClientKeyPass { get; set; }

        /// <summary>
        /// Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
        /// </summary>
        [Input("dateFormat")]
        public Input<string>? DateFormat { get; set; }

        /// <summary>
        /// Endpoint of the syslog service (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// Index prefix for the elascticsearch logs. Default: `local` (string)
        /// </summary>
        [Input("indexPrefix")]
        public Input<string>? IndexPrefix { get; set; }

        /// <summary>
        /// SSL verify for the syslog service (bool)
        /// </summary>
        [Input("sslVerify")]
        public Input<bool>? SslVerify { get; set; }

        /// <summary>
        /// SSL version for the elascticsearch service (string)
        /// </summary>
        [Input("sslVersion")]
        public Input<string>? SslVersion { get; set; }

        public ClusterLoggingElasticsearchConfigArgs()
        {
        }
    }
}
