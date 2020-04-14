// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs : Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshKey")]
        public Input<string>? SshKey { get; set; }

        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHostArgs()
        {
        }
    }
}
