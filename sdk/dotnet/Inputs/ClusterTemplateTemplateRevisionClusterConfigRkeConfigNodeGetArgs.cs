// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("dockerSocket")]
        public Input<string>? DockerSocket { get; set; }

        [Input("hostnameOverride")]
        public Input<string>? HostnameOverride { get; set; }

        [Input("internalAddress")]
        public Input<string>? InternalAddress { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshKey")]
        private Input<string>? _sshKey;
        public Input<string>? SshKey
        {
            get => _sshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        [Input("user", required: true)]
        private Input<string>? _user;
        public Input<string>? User
        {
            get => _user;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _user = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNodeGetArgs();
    }
}
