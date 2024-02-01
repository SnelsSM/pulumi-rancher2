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
    public sealed class GetClusterGkeConfigV2NodePoolResult
    {
        /// <summary>
        /// The GKE node pool config autoscaling
        /// </summary>
        public readonly Outputs.GetClusterGkeConfigV2NodePoolAutoscalingResult Autoscaling;
        /// <summary>
        /// The GKE node pool node config
        /// </summary>
        public readonly Outputs.GetClusterGkeConfigV2NodePoolConfigResult Config;
        /// <summary>
        /// The GKE node pool config initial node count
        /// </summary>
        public readonly int InitialNodeCount;
        /// <summary>
        /// The GKE node pool config management
        /// </summary>
        public readonly Outputs.GetClusterGkeConfigV2NodePoolManagementResult Management;
        /// <summary>
        /// The GKE node pool config max pods constraint
        /// </summary>
        public readonly int MaxPodsConstraint;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The GKE node pool config version
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetClusterGkeConfigV2NodePoolResult(
            Outputs.GetClusterGkeConfigV2NodePoolAutoscalingResult autoscaling,

            Outputs.GetClusterGkeConfigV2NodePoolConfigResult config,

            int initialNodeCount,

            Outputs.GetClusterGkeConfigV2NodePoolManagementResult management,

            int maxPodsConstraint,

            string name,

            string version)
        {
            Autoscaling = autoscaling;
            Config = config;
            InitialNodeCount = initialNodeCount;
            Management = management;
            MaxPodsConstraint = maxPodsConstraint;
            Name = name;
            Version = version;
        }
    }
}
