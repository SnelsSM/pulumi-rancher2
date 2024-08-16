// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetClusterAlertGroup
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster alert group.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetClusterAlertGroup.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "&lt;cluster_alert_group_name&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetClusterAlertGroupResult> InvokeAsync(GetClusterAlertGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterAlertGroupResult>("rancher2:index/getClusterAlertGroup:getClusterAlertGroup", args ?? new GetClusterAlertGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster alert group.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetClusterAlertGroup.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "&lt;cluster_alert_group_name&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetClusterAlertGroupResult> Invoke(GetClusterAlertGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterAlertGroupResult>("rancher2:index/getClusterAlertGroup:getClusterAlertGroup", args ?? new GetClusterAlertGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterAlertGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create cluster alert group (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The cluster alert group name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAlertGroupArgs()
        {
        }
        public static new GetClusterAlertGroupArgs Empty => new GetClusterAlertGroupArgs();
    }

    public sealed class GetClusterAlertGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create cluster alert group (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The cluster alert group name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterAlertGroupInvokeArgs()
        {
        }
        public static new GetClusterAlertGroupInvokeArgs Empty => new GetClusterAlertGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterAlertGroupResult
    {
        /// <summary>
        /// (Computed) The cluster alert group annotations (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) The cluster alert group description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) The cluster alert group interval seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupIntervalSeconds;
        /// <summary>
        /// (Computed) The cluster alert group wait seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupWaitSeconds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The cluster alert group labels (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) The cluster alert group recipients (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterAlertGroupRecipientResult> Recipients;
        /// <summary>
        /// (Computed) The cluster alert group wait seconds. Default: `3600` (int)
        /// </summary>
        public readonly int RepeatIntervalSeconds;

        [OutputConstructor]
        private GetClusterAlertGroupResult(
            ImmutableDictionary<string, string> annotations,

            string clusterId,

            string description,

            int groupIntervalSeconds,

            int groupWaitSeconds,

            string id,

            ImmutableDictionary<string, string> labels,

            string name,

            ImmutableArray<Outputs.GetClusterAlertGroupRecipientResult> recipients,

            int repeatIntervalSeconds)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            Description = description;
            GroupIntervalSeconds = groupIntervalSeconds;
            GroupWaitSeconds = groupWaitSeconds;
            Id = id;
            Labels = labels;
            Name = name;
            Recipients = recipients;
            RepeatIntervalSeconds = repeatIntervalSeconds;
        }
    }
}
