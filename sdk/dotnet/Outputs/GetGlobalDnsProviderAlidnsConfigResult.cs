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
    public sealed class GetGlobalDnsProviderAlidnsConfigResult
    {
        public readonly string AccessKey;
        public readonly string SecretKey;

        [OutputConstructor]
        private GetGlobalDnsProviderAlidnsConfigResult(
            string accessKey,

            string secretKey)
        {
            AccessKey = accessKey;
            SecretKey = secretKey;
        }
    }
}
