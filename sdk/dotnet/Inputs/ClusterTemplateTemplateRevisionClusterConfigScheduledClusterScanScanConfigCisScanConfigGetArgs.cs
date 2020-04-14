// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("debugMaster")]
        public Input<bool>? DebugMaster { get; set; }

        [Input("debugWorker")]
        public Input<bool>? DebugWorker { get; set; }

        [Input("overrideBenchmarkVersion")]
        public Input<string>? OverrideBenchmarkVersion { get; set; }

        [Input("overrideSkips")]
        private InputList<string>? _overrideSkips;
        public InputList<string> OverrideSkips
        {
            get => _overrideSkips ?? (_overrideSkips = new InputList<string>());
            set => _overrideSkips = value;
        }

        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigGetArgs()
        {
        }
    }
}
