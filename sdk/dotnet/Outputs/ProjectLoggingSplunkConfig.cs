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
    public sealed class ProjectLoggingSplunkConfig
    {
        /// <summary>
        /// SSL certificate for the syslog service (string)
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// SSL client certificate for the syslog service (string)
        /// </summary>
        public readonly string? ClientCert;
        /// <summary>
        /// SSL client key for the syslog service (string)
        /// </summary>
        public readonly string? ClientKey;
        /// <summary>
        /// SSL client key password for the splunk service (string)
        /// </summary>
        public readonly string? ClientKeyPass;
        /// <summary>
        /// Endpoint of the syslog service (string)
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// Index prefix for the splunk logs (string)
        /// </summary>
        public readonly string? Index;
        /// <summary>
        /// Date format for the splunk logs (string)
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// SSL verify for the syslog service (bool)
        /// </summary>
        public readonly bool? SslVerify;
        /// <summary>
        /// Token for the syslog service (string)
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private ProjectLoggingSplunkConfig(
            string? certificate,

            string? clientCert,

            string? clientKey,

            string? clientKeyPass,

            string endpoint,

            string? index,

            string? source,

            bool? sslVerify,

            string token)
        {
            Certificate = certificate;
            ClientCert = clientCert;
            ClientKey = clientKey;
            ClientKeyPass = clientKeyPass;
            Endpoint = endpoint;
            Index = index;
            Source = source;
            SslVerify = sslVerify;
            Token = token;
        }
    }
}
