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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostResult
    {
        public readonly string Address;
        public readonly string? Port;
        public readonly bool? SshAgentAuth;
        public readonly string SshKey;
        public readonly string SshKeyPath;
        public readonly string User;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostResult(
            string address,

            string? port,

            bool? sshAgentAuth,

            string sshKey,

            string sshKeyPath,

            string user)
        {
            Address = address;
            Port = port;
            SshAgentAuth = sshAgentAuth;
            SshKey = sshKey;
            SshKeyPath = sshKeyPath;
            User = user;
        }
    }
}
