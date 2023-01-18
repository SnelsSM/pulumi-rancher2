// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlertGroupRecipientGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
        /// </summary>
        [Input("defaultRecipient")]
        public Input<bool>? DefaultRecipient { get; set; }

        /// <summary>
        /// Recipient notifier ID (string)
        /// </summary>
        [Input("notifierId", required: true)]
        public Input<string> NotifierId { get; set; } = null!;

        /// <summary>
        /// Recipient notifier ID. Supported values : `"dingtalk" | "msteams" | "pagerduty" | "slack" | "email" | "webhook" | "wechat"` (string)
        /// </summary>
        [Input("notifierType")]
        public Input<string>? NotifierType { get; set; }

        /// <summary>
        /// Recipient (string)
        /// </summary>
        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        public ClusterAlertGroupRecipientGetArgs()
        {
        }
        public static new ClusterAlertGroupRecipientGetArgs Empty => new ClusterAlertGroupRecipientGetArgs();
    }
}
