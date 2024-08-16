// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchExpressions")]
        private InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs>? _matchExpressions;

        /// <summary>
        /// Label selector match expressions
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs> MatchExpressions
        {
            get => _matchExpressions ?? (_matchExpressions = new InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpressionArgs>());
            set => _matchExpressions = value;
        }

        [Input("matchLabels")]
        private InputMap<string>? _matchLabels;

        /// <summary>
        /// Label selector match labels
        /// </summary>
        public InputMap<string> MatchLabels
        {
            get => _matchLabels ?? (_matchLabels = new InputMap<string>());
            set => _matchLabels = value;
        }

        public ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorArgs Empty => new ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorArgs();
    }
}
