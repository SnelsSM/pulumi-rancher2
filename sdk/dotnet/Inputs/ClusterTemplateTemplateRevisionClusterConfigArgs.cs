// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Local cluster auth endpoint
        /// </summary>
        [Input("clusterAuthEndpoint")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigClusterAuthEndpointArgs>? ClusterAuthEndpoint { get; set; }

        /// <summary>
        /// Default cluster role for project members
        /// </summary>
        [Input("defaultClusterRoleForProjectMembers")]
        public Input<string>? DefaultClusterRoleForProjectMembers { get; set; }

        /// <summary>
        /// Default pod security admission configuration template name
        /// </summary>
        [Input("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public Input<string>? DefaultPodSecurityAdmissionConfigurationTemplateName { get; set; }

        /// <summary>
        /// Desired agent image
        /// </summary>
        [Input("desiredAgentImage")]
        public Input<string>? DesiredAgentImage { get; set; }

        /// <summary>
        /// Desired auth image
        /// </summary>
        [Input("desiredAuthImage")]
        public Input<string>? DesiredAuthImage { get; set; }

        /// <summary>
        /// Docker Root Dir
        /// </summary>
        [Input("dockerRootDir")]
        public Input<string>? DockerRootDir { get; set; }

        /// <summary>
        /// Enable project network isolation
        /// </summary>
        [Input("enableNetworkPolicy")]
        public Input<bool>? EnableNetworkPolicy { get; set; }

        /// <summary>
        /// Rancher Kubernetes Engine Config
        /// </summary>
        [Input("rkeConfig", required: true)]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs> RkeConfig { get; set; } = null!;

        /// <summary>
        /// Windows prefered cluster
        /// </summary>
        [Input("windowsPreferedCluster")]
        public Input<bool>? WindowsPreferedCluster { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigArgs();
    }
}
