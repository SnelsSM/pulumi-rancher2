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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterResult
    {
        public readonly string Datacenters;
        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        public readonly string Name;
        public readonly string Password;
        public readonly string Port;
        public readonly int SoapRoundtripCount;
        public readonly string User;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenterResult(
            string datacenters,

            string name,

            string password,

            string port,

            int soapRoundtripCount,

            string user)
        {
            Datacenters = datacenters;
            Name = name;
            Password = password;
            Port = port;
            SoapRoundtripCount = soapRoundtripCount;
            User = user;
        }
    }
}
