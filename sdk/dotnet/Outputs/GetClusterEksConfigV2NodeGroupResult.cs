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
    public sealed class GetClusterEksConfigV2NodeGroupResult
    {
        public readonly int? DesiredSize;
        public readonly int? DiskSize;
        public readonly string? Ec2SshKey;
        public readonly bool? Gpu;
        public readonly string? InstanceType;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        public readonly int? MaxSize;
        public readonly int? MinSize;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetClusterEksConfigV2NodeGroupResult(
            int? desiredSize,

            int? diskSize,

            string? ec2SshKey,

            bool? gpu,

            string? instanceType,

            ImmutableDictionary<string, object>? labels,

            int? maxSize,

            int? minSize,

            string name,

            ImmutableDictionary<string, object>? tags)
        {
            DesiredSize = desiredSize;
            DiskSize = diskSize;
            Ec2SshKey = ec2SshKey;
            Gpu = gpu;
            InstanceType = instanceType;
            Labels = labels;
            MaxSize = maxSize;
            MinSize = minSize;
            Name = name;
            Tags = tags;
        }
    }
}
