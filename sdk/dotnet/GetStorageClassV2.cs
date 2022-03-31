// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetStorageClassV2
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher2 Storage Class v2. Storage Class v2 resource is available at Rancher v2.5.x and above.
        /// </summary>
        public static Task<GetStorageClassV2Result> InvokeAsync(GetStorageClassV2Args args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetStorageClassV2Result>("rancher2:index/getStorageClassV2:getStorageClassV2", args ?? new GetStorageClassV2Args(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher2 Storage Class v2. Storage Class v2 resource is available at Rancher v2.5.x and above.
        /// </summary>
        public static Output<GetStorageClassV2Result> Invoke(GetStorageClassV2InvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetStorageClassV2Result>("rancher2:index/getStorageClassV2:getStorageClassV2", args ?? new GetStorageClassV2InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStorageClassV2Args : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id of the storageClass V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the storageClass v2 (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetStorageClassV2Args()
        {
        }
    }

    public sealed class GetStorageClassV2InvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id of the storageClass V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the storageClass v2 (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetStorageClassV2InvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetStorageClassV2Result
    {
        /// <summary>
        /// (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        /// </summary>
        public readonly bool AllowVolumeExpansion;
        /// <summary>
        /// (Computed) Annotations for the storageClass v2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The provisioner of the storageClass v2 (string)
        /// </summary>
        public readonly string K8sProvisioner;
        /// <summary>
        /// (Computed) Labels for the storageClass v2 (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) The mount options for storageClass v2 (list)
        /// </summary>
        public readonly ImmutableArray<string> MountOptions;
        public readonly string Name;
        /// <summary>
        /// (Computed) The parameters for storageClass v2 (string)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Parameters;
        /// <summary>
        /// (Computed) The reclaim policy for storageClass v2 (string)
        /// </summary>
        public readonly string ReclaimPolicy;
        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        public readonly string ResourceVersion;
        /// <summary>
        /// (Computed) The volume binding mode for storageClass v2 (string)
        /// </summary>
        public readonly string VolumeBindingMode;

        [OutputConstructor]
        private GetStorageClassV2Result(
            bool allowVolumeExpansion,

            ImmutableDictionary<string, object> annotations,

            string clusterId,

            string id,

            string k8sProvisioner,

            ImmutableDictionary<string, object> labels,

            ImmutableArray<string> mountOptions,

            string name,

            ImmutableDictionary<string, object> parameters,

            string reclaimPolicy,

            string resourceVersion,

            string volumeBindingMode)
        {
            AllowVolumeExpansion = allowVolumeExpansion;
            Annotations = annotations;
            ClusterId = clusterId;
            Id = id;
            K8sProvisioner = k8sProvisioner;
            Labels = labels;
            MountOptions = mountOptions;
            Name = name;
            Parameters = parameters;
            ReclaimPolicy = reclaimPolicy;
            ResourceVersion = resourceVersion;
            VolumeBindingMode = volumeBindingMode;
        }
    }
}
