// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Notifier
    ///         var foo = new Rancher2.Notifier("foo", new Rancher2.NotifierArgs
    ///         {
    ///             ClusterId = "&lt;cluster_id&gt;",
    ///             Description = "Terraform notifier acceptance test",
    ///             PagerdutyConfig = new Rancher2.Inputs.NotifierPagerdutyConfigArgs
    ///             {
    ///                 ProxyUrl = "http://proxy.test.io",
    ///                 ServiceKey = "XXXXXXXX",
    ///             },
    ///             SendResolved = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Notifiers can be imported using the Rancher nNtifier ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/notifier:Notifier foo &amp;lt;notifier_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/notifier:Notifier")]
    public partial class Notifier : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for notifier object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id where create notifier (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The notifier description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        [Output("dingtalkConfig")]
        public Output<Outputs.NotifierDingtalkConfig?> DingtalkConfig { get; private set; } = null!;

        /// <summary>
        /// Labels for notifier object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// MSTeams config for notifier (list maxitems:1)
        /// </summary>
        [Output("msteamsConfig")]
        public Output<Outputs.NotifierMsteamsConfig?> MsteamsConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the notifier (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Pagerduty config for notifier (list maxitems:1)
        /// </summary>
        [Output("pagerdutyConfig")]
        public Output<Outputs.NotifierPagerdutyConfig?> PagerdutyConfig { get; private set; } = null!;

        /// <summary>
        /// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        /// </summary>
        [Output("sendResolved")]
        public Output<bool?> SendResolved { get; private set; } = null!;

        /// <summary>
        /// Slack config for notifier (list maxitems:1)
        /// </summary>
        [Output("slackConfig")]
        public Output<Outputs.NotifierSlackConfig?> SlackConfig { get; private set; } = null!;

        /// <summary>
        /// SMTP config for notifier (list maxitems:1)
        /// </summary>
        [Output("smtpConfig")]
        public Output<Outputs.NotifierSmtpConfig?> SmtpConfig { get; private set; } = null!;

        /// <summary>
        /// Webhook config for notifier (list maxitems:1)
        /// </summary>
        [Output("webhookConfig")]
        public Output<Outputs.NotifierWebhookConfig?> WebhookConfig { get; private set; } = null!;

        /// <summary>
        /// Wechat config for notifier (list maxitems:1)
        /// </summary>
        [Output("wechatConfig")]
        public Output<Outputs.NotifierWechatConfig?> WechatConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Notifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Notifier(string name, NotifierArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/notifier:Notifier", name, args ?? new NotifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Notifier(string name, Input<string> id, NotifierState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/notifier:Notifier", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Notifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Notifier Get(string name, Input<string> id, NotifierState? state = null, CustomResourceOptions? options = null)
        {
            return new Notifier(name, id, state, options);
        }
    }

    public sealed class NotifierArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for notifier object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create notifier (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The notifier description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        [Input("dingtalkConfig")]
        public Input<Inputs.NotifierDingtalkConfigArgs>? DingtalkConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for notifier object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// MSTeams config for notifier (list maxitems:1)
        /// </summary>
        [Input("msteamsConfig")]
        public Input<Inputs.NotifierMsteamsConfigArgs>? MsteamsConfig { get; set; }

        /// <summary>
        /// The name of the notifier (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Pagerduty config for notifier (list maxitems:1)
        /// </summary>
        [Input("pagerdutyConfig")]
        public Input<Inputs.NotifierPagerdutyConfigArgs>? PagerdutyConfig { get; set; }

        /// <summary>
        /// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        /// </summary>
        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        /// <summary>
        /// Slack config for notifier (list maxitems:1)
        /// </summary>
        [Input("slackConfig")]
        public Input<Inputs.NotifierSlackConfigArgs>? SlackConfig { get; set; }

        /// <summary>
        /// SMTP config for notifier (list maxitems:1)
        /// </summary>
        [Input("smtpConfig")]
        public Input<Inputs.NotifierSmtpConfigArgs>? SmtpConfig { get; set; }

        /// <summary>
        /// Webhook config for notifier (list maxitems:1)
        /// </summary>
        [Input("webhookConfig")]
        public Input<Inputs.NotifierWebhookConfigArgs>? WebhookConfig { get; set; }

        /// <summary>
        /// Wechat config for notifier (list maxitems:1)
        /// </summary>
        [Input("wechatConfig")]
        public Input<Inputs.NotifierWechatConfigArgs>? WechatConfig { get; set; }

        public NotifierArgs()
        {
        }
    }

    public sealed class NotifierState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for notifier object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create notifier (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The notifier description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Dingtalk config for notifier (list maxitems:1)
        /// </summary>
        [Input("dingtalkConfig")]
        public Input<Inputs.NotifierDingtalkConfigGetArgs>? DingtalkConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for notifier object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// MSTeams config for notifier (list maxitems:1)
        /// </summary>
        [Input("msteamsConfig")]
        public Input<Inputs.NotifierMsteamsConfigGetArgs>? MsteamsConfig { get; set; }

        /// <summary>
        /// The name of the notifier (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Pagerduty config for notifier (list maxitems:1)
        /// </summary>
        [Input("pagerdutyConfig")]
        public Input<Inputs.NotifierPagerdutyConfigGetArgs>? PagerdutyConfig { get; set; }

        /// <summary>
        /// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        /// </summary>
        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        /// <summary>
        /// Slack config for notifier (list maxitems:1)
        /// </summary>
        [Input("slackConfig")]
        public Input<Inputs.NotifierSlackConfigGetArgs>? SlackConfig { get; set; }

        /// <summary>
        /// SMTP config for notifier (list maxitems:1)
        /// </summary>
        [Input("smtpConfig")]
        public Input<Inputs.NotifierSmtpConfigGetArgs>? SmtpConfig { get; set; }

        /// <summary>
        /// Webhook config for notifier (list maxitems:1)
        /// </summary>
        [Input("webhookConfig")]
        public Input<Inputs.NotifierWebhookConfigGetArgs>? WebhookConfig { get; set; }

        /// <summary>
        /// Wechat config for notifier (list maxitems:1)
        /// </summary>
        [Input("wechatConfig")]
        public Input<Inputs.NotifierWechatConfigGetArgs>? WechatConfig { get; set; }

        public NotifierState()
        {
        }
    }
}
