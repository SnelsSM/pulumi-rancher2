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
    public sealed class GetClusterV2RkeConfigMachinePoolMachineConfigResult
    {
        /// <summary>
        /// Machine config API version
        /// </summary>
        public readonly string? ApiVersion;
        /// <summary>
        /// Machine config kind
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetClusterV2RkeConfigMachinePoolMachineConfigResult(
            string? apiVersion,

            string kind,

            string name)
        {
            ApiVersion = apiVersion;
            Kind = kind;
            Name = name;
        }
    }
}
