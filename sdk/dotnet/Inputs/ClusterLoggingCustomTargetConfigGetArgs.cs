// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingCustomTargetConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificate")]
        private Input<string>? _certificate;

        /// <summary>
        /// SSL CA certificate for the custom target service (string)
        /// </summary>
        public Input<string>? Certificate
        {
            get => _certificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientCert")]
        private Input<string>? _clientCert;

        /// <summary>
        /// SSL client certificate for the custom target service (string)
        /// </summary>
        public Input<string>? ClientCert
        {
            get => _clientCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientKey")]
        private Input<string>? _clientKey;

        /// <summary>
        /// SSL client key for the custom target service (string)
        /// </summary>
        public Input<string>? ClientKey
        {
            get => _clientKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Custom target config content (string)
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        public ClusterLoggingCustomTargetConfigGetArgs()
        {
        }
        public static new ClusterLoggingCustomTargetConfigGetArgs Empty => new ClusterLoggingCustomTargetConfigGetArgs();
    }
}
