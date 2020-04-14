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
    public sealed class NotifierPagerdutyConfig
    {
        /// <summary>
        /// Wechat proxy url (string)
        /// </summary>
        public readonly string? ProxyUrl;
        /// <summary>
        /// Pagerduty service key (string)
        /// </summary>
        public readonly string ServiceKey;

        [OutputConstructor]
        private NotifierPagerdutyConfig(
            string? proxyUrl,

            string serviceKey)
        {
            ProxyUrl = proxyUrl;
            ServiceKey = serviceKey;
        }
    }
}
