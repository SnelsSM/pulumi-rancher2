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
    public sealed class GetClusterV2RkeConfigMachineSelectorConfigResult
    {
        public readonly ImmutableDictionary<string, object>? Config;
        public readonly Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult? MachineLabelSelector;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachineSelectorConfigResult(
            ImmutableDictionary<string, object>? config,

            Outputs.GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorResult? machineLabelSelector)
        {
            Config = config;
            MachineLabelSelector = machineLabelSelector;
        }
    }
}
