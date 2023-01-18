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
    public sealed class ProjectLoggingElasticsearchConfig
    {
        /// <summary>
        /// User password for the elascticsearch service (string)
        /// </summary>
        public readonly string? AuthPassword;
        /// <summary>
        /// Username for the elascticsearch service (string)
        /// </summary>
        public readonly string? AuthUsername;
        /// <summary>
        /// SSL CA certificate for the custom target service (string)
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// SSL client certificate for the custom target service (string)
        /// </summary>
        public readonly string? ClientCert;
        /// <summary>
        /// SSL client key for the custom target service (string)
        /// </summary>
        public readonly string? ClientKey;
        /// <summary>
        /// SSL client key password for the elascticsearch service (string)
        /// </summary>
        public readonly string? ClientKeyPass;
        /// <summary>
        /// Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
        /// </summary>
        public readonly string? DateFormat;
        /// <summary>
        /// Endpoint of the elascticsearch service. Must include protocol, `http://` or `https://` (string)
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// Index prefix for the elascticsearch logs. Default: `local` (string)
        /// </summary>
        public readonly string? IndexPrefix;
        /// <summary>
        /// SSL verify for the elascticsearch service (bool)
        /// </summary>
        public readonly bool? SslVerify;
        /// <summary>
        /// SSL version for the elascticsearch service (string)
        /// </summary>
        public readonly string? SslVersion;

        [OutputConstructor]
        private ProjectLoggingElasticsearchConfig(
            string? authPassword,

            string? authUsername,

            string? certificate,

            string? clientCert,

            string? clientKey,

            string? clientKeyPass,

            string? dateFormat,

            string endpoint,

            string? indexPrefix,

            bool? sslVerify,

            string? sslVersion)
        {
            AuthPassword = authPassword;
            AuthUsername = authUsername;
            Certificate = certificate;
            ClientCert = clientCert;
            ClientKey = clientKey;
            ClientKeyPass = clientKeyPass;
            DateFormat = dateFormat;
            Endpoint = endpoint;
            IndexPrefix = indexPrefix;
            SslVerify = sslVerify;
            SslVersion = sslVersion;
        }
    }
}
