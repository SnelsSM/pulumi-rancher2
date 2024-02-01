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
    public sealed class GetClusterRkeConfigServicesKubeApiAdmissionConfigurationResult
    {
        /// <summary>
        /// Admission configuration ApiVersion
        /// </summary>
        public readonly string? ApiVersion;
        /// <summary>
        /// Admission configuration Kind
        /// </summary>
        public readonly string? Kind;
        /// <summary>
        /// Admission configuration plugins
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginResult> Plugins;

        [OutputConstructor]
        private GetClusterRkeConfigServicesKubeApiAdmissionConfigurationResult(
            string? apiVersion,

            string? kind,

            ImmutableArray<Outputs.GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginResult> plugins)
        {
            ApiVersion = apiVersion;
            Kind = kind;
            Plugins = plugins;
        }
    }
}
