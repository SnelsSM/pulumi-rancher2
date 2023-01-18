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
    public sealed class NotifierMsteamsConfig
    {
        /// <summary>
        /// Dingtalk proxy url (string)
        /// </summary>
        public readonly string? ProxyUrl;
        /// <summary>
        /// Dingtalk url (string)
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private NotifierMsteamsConfig(
            string? proxyUrl,

            string url)
        {
            ProxyUrl = proxyUrl;
            Url = url;
        }
    }
}
