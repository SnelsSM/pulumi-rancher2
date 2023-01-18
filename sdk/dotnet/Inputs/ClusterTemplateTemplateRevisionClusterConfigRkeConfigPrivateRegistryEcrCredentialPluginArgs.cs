// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPluginArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsAccessKeyId")]
        public Input<string>? AwsAccessKeyId { get; set; }

        [Input("awsSecretAccessKey")]
        private Input<string>? _awsSecretAccessKey;
        public Input<string>? AwsSecretAccessKey
        {
            get => _awsSecretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _awsSecretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("awsSessionToken")]
        private Input<string>? _awsSessionToken;
        public Input<string>? AwsSessionToken
        {
            get => _awsSessionToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _awsSessionToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPluginArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPluginArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPluginArgs();
    }
}
