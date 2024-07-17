// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigMonitoringArgs : global::Pulumi.ResourceArgs
    {
        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;

        /// <summary>
        /// RKE monitoring node selector (map)
        /// </summary>
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// RKE options for network (map)
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        /// <summary>
        /// RKE monitoring provider (string)
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        /// <summary>
        /// RKE monitoring replicas (int)
        /// </summary>
        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        [Input("tolerations")]
        private InputList<Inputs.ClusterRkeConfigMonitoringTolerationArgs>? _tolerations;

        /// <summary>
        /// Monitoring add-on tolerations
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigMonitoringTolerationArgs> Tolerations
        {
            get => _tolerations ?? (_tolerations = new InputList<Inputs.ClusterRkeConfigMonitoringTolerationArgs>());
            set => _tolerations = value;
        }

        /// <summary>
        /// Update deployment strategy
        /// </summary>
        [Input("updateStrategy")]
        public Input<Inputs.ClusterRkeConfigMonitoringUpdateStrategyArgs>? UpdateStrategy { get; set; }

        public ClusterRkeConfigMonitoringArgs()
        {
        }
        public static new ClusterRkeConfigMonitoringArgs Empty => new ClusterRkeConfigMonitoringArgs();
    }
}
