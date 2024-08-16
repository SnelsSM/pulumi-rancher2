// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetProject
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetProjectResult> InvokeAsync(GetProjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectResult>("rancher2:index/getProject:getProject", args ?? new GetProjectArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetProjectResult> Invoke(GetProjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectResult>("rancher2:index/getProject:getProject", args ?? new GetProjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Rancher 2 cluster (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The project name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetProjectArgs()
        {
        }
        public static new GetProjectArgs Empty => new GetProjectArgs();
    }

    public sealed class GetProjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Rancher 2 cluster (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The project name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetProjectInvokeArgs()
        {
        }
        public static new GetProjectInvokeArgs Empty => new GetProjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectResult
    {
        /// <summary>
        /// (Computed) Annotations of the rancher2 project (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) Default containers resource limits on project (List maxitem:1)
        /// </summary>
        public readonly Outputs.GetProjectContainerResourceLimitResult ContainerResourceLimit;
        /// <summary>
        /// (Computed) The project's description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) Enable built-in project monitoring. Default `false` (bool)
        /// </summary>
        public readonly bool EnableProjectMonitoring;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels of the rancher2 project (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) Default Pod Security Policy ID for the project (string)
        /// </summary>
        public readonly string PodSecurityPolicyTemplateId;
        /// <summary>
        /// (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectResourceQuotaResult ResourceQuota;
        /// <summary>
        /// (Computed) UUID of the project as stored by Rancher 2 (string)
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetProjectResult(
            ImmutableDictionary<string, string> annotations,

            string clusterId,

            Outputs.GetProjectContainerResourceLimitResult containerResourceLimit,

            string description,

            bool enableProjectMonitoring,

            string id,

            ImmutableDictionary<string, string> labels,

            string name,

            string podSecurityPolicyTemplateId,

            Outputs.GetProjectResourceQuotaResult resourceQuota,

            string uuid)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            ContainerResourceLimit = containerResourceLimit;
            Description = description;
            EnableProjectMonitoring = enableProjectMonitoring;
            Id = id;
            Labels = labels;
            Name = name;
            PodSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
            ResourceQuota = resourceQuota;
            Uuid = uuid;
        }
    }
}
