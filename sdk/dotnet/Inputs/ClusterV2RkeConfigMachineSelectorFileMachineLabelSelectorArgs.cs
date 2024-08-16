// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchExpressions")]
        private InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs>? _matchExpressions;

        /// <summary>
        /// Label selector match expressions
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs> MatchExpressions
        {
            get => _matchExpressions ?? (_matchExpressions = new InputList<Inputs.ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorMatchExpressionArgs>());
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

        public ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs()
        {
        }
        public static new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs Empty => new ClusterV2RkeConfigMachineSelectorFileMachineLabelSelectorArgs();
    }
}
