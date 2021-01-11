// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsGetArgs : Pulumi.ResourceArgs
    {
        [Input("linearAutoscalerParams")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsGetArgs>? LinearAutoscalerParams { get; set; }

        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        [Input("nodelocal")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsNodelocalGetArgs>? Nodelocal { get; set; }

        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("reverseCidrs")]
        private InputList<string>? _reverseCidrs;
        public InputList<string> ReverseCidrs
        {
            get => _reverseCidrs ?? (_reverseCidrs = new InputList<string>());
            set => _reverseCidrs = value;
        }

        [Input("updateStrategy")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsUpdateStrategyGetArgs>? UpdateStrategy { get; set; }

        [Input("upstreamNameservers")]
        private InputList<string>? _upstreamNameservers;
        public InputList<string> UpstreamNameservers
        {
            get => _upstreamNameservers ?? (_upstreamNameservers = new InputList<string>());
            set => _upstreamNameservers = value;
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsGetArgs()
        {
        }
    }
}
