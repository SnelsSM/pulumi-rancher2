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
    public sealed class GetClusterLoggingCustomTargetConfigResult
    {
        public readonly string? Certificate;
        public readonly string? ClientCert;
        public readonly string? ClientKey;
        public readonly string Content;

        [OutputConstructor]
        private GetClusterLoggingCustomTargetConfigResult(
            string? certificate,

            string? clientCert,

            string? clientKey,

            string content)
        {
            Certificate = certificate;
            ClientCert = clientCert;
            ClientKey = clientKey;
            Content = content;
        }
    }
}
