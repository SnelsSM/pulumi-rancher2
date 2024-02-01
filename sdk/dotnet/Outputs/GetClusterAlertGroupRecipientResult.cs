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
    public sealed class GetClusterAlertGroupRecipientResult
    {
        /// <summary>
        /// Use notifier default recipient
        /// </summary>
        public readonly bool? DefaultRecipient;
        /// <summary>
        /// Recipient notifier ID
        /// </summary>
        public readonly string NotifierId;
        /// <summary>
        /// Recipient notifier type
        /// </summary>
        public readonly string NotifierType;
        /// <summary>
        /// Recipient
        /// </summary>
        public readonly string Recipient;

        [OutputConstructor]
        private GetClusterAlertGroupRecipientResult(
            bool? defaultRecipient,

            string notifierId,

            string notifierType,

            string recipient)
        {
            DefaultRecipient = defaultRecipient;
            NotifierId = notifierId;
            NotifierType = notifierType;
            Recipient = recipient;
        }
    }
}
