// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetClusterLogging
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Cluster Logging.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetClusterLogging.InvokeAsync(new Rancher2.GetClusterLoggingArgs
        ///         {
        ///             ClusterId = "&lt;cluster_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClusterLoggingResult> InvokeAsync(GetClusterLoggingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClusterLoggingResult>("rancher2:index/getClusterLogging:getClusterLogging", args ?? new GetClusterLoggingArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Cluster Logging.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetClusterLogging.InvokeAsync(new Rancher2.GetClusterLoggingArgs
        ///         {
        ///             ClusterId = "&lt;cluster_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetClusterLoggingResult> Invoke(GetClusterLoggingInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetClusterLoggingResult>("rancher2:index/getClusterLogging:getClusterLogging", args ?? new GetClusterLoggingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterLoggingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id to configure logging (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        public GetClusterLoggingArgs()
        {
        }
    }

    public sealed class GetClusterLoggingInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id to configure logging (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        public GetClusterLoggingInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClusterLoggingResult
    {
        /// <summary>
        /// (Computed) Annotations for Cluster Logging object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        public readonly Outputs.GetClusterLoggingCustomTargetConfigResult CustomTargetConfig;
        /// <summary>
        /// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterLoggingElasticsearchConfigResult ElasticsearchConfig;
        public readonly bool EnableJsonParsing;
        /// <summary>
        /// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterLoggingFluentdConfigResult FluentdConfig;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterLoggingKafkaConfigResult KafkaConfig;
        /// <summary>
        /// (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Computed) Labels for Cluster Logging object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) The name of the cluster logging config (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Computed) The namespace id from cluster logging (string)
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
        /// </summary>
        public readonly int OutputFlushInterval;
        /// <summary>
        /// (computed) The output tags for Cluster Logging (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> OutputTags;
        /// <summary>
        /// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterLoggingSplunkConfigResult SplunkConfig;
        /// <summary>
        /// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterLoggingSyslogConfigResult SyslogConfig;

        [OutputConstructor]
        private GetClusterLoggingResult(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            Outputs.GetClusterLoggingCustomTargetConfigResult customTargetConfig,

            Outputs.GetClusterLoggingElasticsearchConfigResult elasticsearchConfig,

            bool enableJsonParsing,

            Outputs.GetClusterLoggingFluentdConfigResult fluentdConfig,

            string id,

            Outputs.GetClusterLoggingKafkaConfigResult kafkaConfig,

            string kind,

            ImmutableDictionary<string, object> labels,

            string name,

            string namespaceId,

            int outputFlushInterval,

            ImmutableDictionary<string, object> outputTags,

            Outputs.GetClusterLoggingSplunkConfigResult splunkConfig,

            Outputs.GetClusterLoggingSyslogConfigResult syslogConfig)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            CustomTargetConfig = customTargetConfig;
            ElasticsearchConfig = elasticsearchConfig;
            EnableJsonParsing = enableJsonParsing;
            FluentdConfig = fluentdConfig;
            Id = id;
            KafkaConfig = kafkaConfig;
            Kind = kind;
            Labels = labels;
            Name = name;
            NamespaceId = namespaceId;
            OutputFlushInterval = outputFlushInterval;
            OutputTags = outputTags;
            SplunkConfig = splunkConfig;
            SyslogConfig = syslogConfig;
        }
    }
}
