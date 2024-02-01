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
    public sealed class GetNotifierDingtalkConfigResult
    {
        /// <summary>
        /// Dingtalk proxy URL
        /// </summary>
        public readonly string? ProxyUrl;
        /// <summary>
        /// Required for webhook with sign enabled
        /// </summary>
        public readonly string? Secret;
        /// <summary>
        /// Webhook URL
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetNotifierDingtalkConfigResult(
            string? proxyUrl,

            string? secret,

            string url)
        {
            ProxyUrl = proxyUrl;
            Secret = secret;
            Url = url;
        }
    }
}
