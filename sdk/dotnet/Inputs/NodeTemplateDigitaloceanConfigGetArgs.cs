// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateDigitaloceanConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken")]
        private Input<string>? _accessToken;

        /// <summary>
        /// Digital Ocean access token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public Input<string>? AccessToken
        {
            get => _accessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable backups for droplet. Default `false` (bool)
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// Azure virtual machine OS image. Default `canonical:UbuntuServer:18.04-LTS:latest` (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Enable ipv6 for droplet. Default `false` (bool)
        /// </summary>
        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        /// <summary>
        /// Set this flag to enable CloudWatch monitoring. Deafult `false` (bool)
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// Enable private networking for droplet. Default `false` (bool)
        /// </summary>
        [Input("privateNetworking")]
        public Input<bool>? PrivateNetworking { get; set; }

        /// <summary>
        /// AWS region. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Size for Azure Virtual Machine. Default `Standard_A2` (string)
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("sshKeyFingerprint")]
        private Input<string>? _sshKeyFingerprint;

        /// <summary>
        /// SSH key fingerprint (string)
        /// </summary>
        public Input<string>? SshKeyFingerprint
        {
            get => _sshKeyFingerprint;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKeyFingerprint = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH private key path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// SSH port. Default `22` (string)
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// Set the name of the ssh user (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// AWS Tags (e.g. key1,value1,key2,value2) (string)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Path to file with cloud-init user data (string)
        /// 
        /// &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
        /// </summary>
        [Input("userdata")]
        public Input<string>? Userdata { get; set; }

        public NodeTemplateDigitaloceanConfigGetArgs()
        {
        }
        public static new NodeTemplateDigitaloceanConfigGetArgs Empty => new NodeTemplateDigitaloceanConfigGetArgs();
    }
}
