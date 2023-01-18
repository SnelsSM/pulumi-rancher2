// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectLoggingFluentdConfigArgs : global::Pulumi.ResourceArgs
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

        /// <summary>
        /// Compress data for the fluentd service (bool)
        /// </summary>
        [Input("compress")]
        public Input<bool>? Compress { get; set; }

        /// <summary>
        /// Enable TLS for the fluentd service (bool)
        /// </summary>
        [Input("enableTls")]
        public Input<bool>? EnableTls { get; set; }

        [Input("fluentServers", required: true)]
        private InputList<Inputs.ProjectLoggingFluentdConfigFluentServerArgs>? _fluentServers;

        /// <summary>
        /// Servers for the fluentd service (list)
        /// </summary>
        public InputList<Inputs.ProjectLoggingFluentdConfigFluentServerArgs> FluentServers
        {
            get => _fluentServers ?? (_fluentServers = new InputList<Inputs.ProjectLoggingFluentdConfigFluentServerArgs>());
            set => _fluentServers = value;
        }

        public ProjectLoggingFluentdConfigArgs()
        {
        }
        public static new ProjectLoggingFluentdConfigArgs Empty => new ProjectLoggingFluentdConfigArgs();
    }
}
