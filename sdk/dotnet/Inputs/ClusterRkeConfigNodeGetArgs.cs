// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNodeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address ip for node (string)
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Docker socket for node (string)
        /// </summary>
        [Input("dockerSocket")]
        public Input<string>? DockerSocket { get; set; }

        /// <summary>
        /// Hostname override for node (string)
        /// </summary>
        [Input("hostnameOverride")]
        public Input<string>? HostnameOverride { get; set; }

        /// <summary>
        /// Internal ip for node (string)
        /// </summary>
        [Input("internalAddress")]
        public Input<string>? InternalAddress { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the Cluster (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Id for the node (string)
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// Port for node. Default `22` (string)
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// Use ssh agent auth. Default `false` (bool)
        /// </summary>
        [Input("sshAgentAuth")]
        public Input<bool>? SshAgentAuth { get; set; }

        [Input("sshKey")]
        private Input<string>? _sshKey;

        /// <summary>
        /// Node SSH private key (string)
        /// </summary>
        public Input<string>? SshKey
        {
            get => _sshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Node SSH private key path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        [Input("user", required: true)]
        private Input<string>? _user;

        /// <summary>
        /// Registry user (string)
        /// </summary>
        public Input<string>? User
        {
            get => _user;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _user = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterRkeConfigNodeGetArgs()
        {
        }
        public static new ClusterRkeConfigNodeGetArgs Empty => new ClusterRkeConfigNodeGetArgs();
    }
}
