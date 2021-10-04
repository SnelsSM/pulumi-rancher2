// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeApiAuditLogGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration"` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.ClusterRkeConfigServicesKubeApiAuditLogConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterRkeConfigServicesKubeApiAuditLogGetArgs()
        {
        }
    }
}
