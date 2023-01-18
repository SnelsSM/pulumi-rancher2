// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ACI provider config for RKE network (list maxitems:63)
        /// </summary>
        [Input("aciNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkAciNetworkProviderGetArgs>? AciNetworkProvider { get; set; }

        /// <summary>
        /// Calico provider config for RKE network (list maxitems:1)
        /// </summary>
        [Input("calicoNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkCalicoNetworkProviderGetArgs>? CalicoNetworkProvider { get; set; }

        /// <summary>
        /// Canal provider config for RKE network (list maxitems:1)
        /// </summary>
        [Input("canalNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkCanalNetworkProviderGetArgs>? CanalNetworkProvider { get; set; }

        /// <summary>
        /// Flannel provider config for RKE network (list maxitems:1)
        /// </summary>
        [Input("flannelNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkFlannelNetworkProviderGetArgs>? FlannelNetworkProvider { get; set; }

        /// <summary>
        /// Network provider MTU. Default `0` (int)
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// RKE options for authorization (map)
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        /// <summary>
        /// Plugin for RKE network. `canal` (default), `flannel`, `calico`, `none` and `weave` are supported. (string)
        /// </summary>
        [Input("plugin")]
        public Input<string>? Plugin { get; set; }

        [Input("tolerations")]
        private InputList<Inputs.ClusterRkeConfigNetworkTolerationGetArgs>? _tolerations;

        /// <summary>
        /// DNS add-on tolerations (list)
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigNetworkTolerationGetArgs> Tolerations
        {
            get => _tolerations ?? (_tolerations = new InputList<Inputs.ClusterRkeConfigNetworkTolerationGetArgs>());
            set => _tolerations = value;
        }

        /// <summary>
        /// Weave provider config for RKE network (list maxitems:1)
        /// </summary>
        [Input("weaveNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkWeaveNetworkProviderGetArgs>? WeaveNetworkProvider { get; set; }

        public ClusterRkeConfigNetworkGetArgs()
        {
        }
        public static new ClusterRkeConfigNetworkGetArgs Empty => new ClusterRkeConfigNetworkGetArgs();
    }
}
