// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Plugin configuration. (string) Ex:
        /// </summary>
        [Input("configuration")]
        public Input<string>? Configuration { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Path for etcd service (string)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs()
        {
        }
        public static new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs Empty => new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs();
    }
}
