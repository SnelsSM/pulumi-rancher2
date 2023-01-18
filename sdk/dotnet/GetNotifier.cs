// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetNotifier
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 notifier.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetNotifier.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNotifierResult> InvokeAsync(GetNotifierArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNotifierResult>("rancher2:index/getNotifier:getNotifier", args ?? new GetNotifierArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 notifier.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetNotifier.Invoke(new()
        ///     {
        ///         ClusterId = "&lt;cluster_id&gt;",
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNotifierResult> Invoke(GetNotifierInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNotifierResult>("rancher2:index/getNotifier:getNotifier", args ?? new GetNotifierInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNotifierArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create notifier (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// (Computed) Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        [Input("dingtalkConfig")]
        public Inputs.GetNotifierDingtalkConfigArgs? DingtalkConfig { get; set; }

        /// <summary>
        /// (Computed) MSTeams config for notifier (list maxitems:1)
        /// </summary>
        [Input("msteamsConfig")]
        public Inputs.GetNotifierMsteamsConfigArgs? MsteamsConfig { get; set; }

        /// <summary>
        /// The name of the notifier (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetNotifierArgs()
        {
        }
        public static new GetNotifierArgs Empty => new GetNotifierArgs();
    }

    public sealed class GetNotifierInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create notifier (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// (Computed) Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        [Input("dingtalkConfig")]
        public Input<Inputs.GetNotifierDingtalkConfigInputArgs>? DingtalkConfig { get; set; }

        /// <summary>
        /// (Computed) MSTeams config for notifier (list maxitems:1)
        /// </summary>
        [Input("msteamsConfig")]
        public Input<Inputs.GetNotifierMsteamsConfigInputArgs>? MsteamsConfig { get; set; }

        /// <summary>
        /// The name of the notifier (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetNotifierInvokeArgs()
        {
        }
        public static new GetNotifierInvokeArgs Empty => new GetNotifierInvokeArgs();
    }


    [OutputType]
    public sealed class GetNotifierResult
    {
        /// <summary>
        /// (Computed) Annotations for notifier object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) The notifier description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierDingtalkConfigResult? DingtalkConfig;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for notifier object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) MSTeams config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierMsteamsConfigResult? MsteamsConfig;
        public readonly string Name;
        /// <summary>
        /// (Computed) Pagerduty config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierPagerdutyConfigResult PagerdutyConfig;
        /// <summary>
        /// (Computed) Slack config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierSlackConfigResult SlackConfig;
        /// <summary>
        /// (Computed) SMTP config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierSmtpConfigResult SmtpConfig;
        /// <summary>
        /// (Computed) Webhook config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierWebhookConfigResult WebhookConfig;
        /// <summary>
        /// (Computed) Wechat config for notifier (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetNotifierWechatConfigResult WechatConfig;

        [OutputConstructor]
        private GetNotifierResult(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            string description,

            Outputs.GetNotifierDingtalkConfigResult? dingtalkConfig,

            string id,

            ImmutableDictionary<string, object> labels,

            Outputs.GetNotifierMsteamsConfigResult? msteamsConfig,

            string name,

            Outputs.GetNotifierPagerdutyConfigResult pagerdutyConfig,

            Outputs.GetNotifierSlackConfigResult slackConfig,

            Outputs.GetNotifierSmtpConfigResult smtpConfig,

            Outputs.GetNotifierWebhookConfigResult webhookConfig,

            Outputs.GetNotifierWechatConfigResult wechatConfig)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            Description = description;
            DingtalkConfig = dingtalkConfig;
            Id = id;
            Labels = labels;
            MsteamsConfig = msteamsConfig;
            Name = name;
            PagerdutyConfig = pagerdutyConfig;
            SlackConfig = slackConfig;
            SmtpConfig = smtpConfig;
            WebhookConfig = webhookConfig;
            WechatConfig = wechatConfig;
        }
    }
}
