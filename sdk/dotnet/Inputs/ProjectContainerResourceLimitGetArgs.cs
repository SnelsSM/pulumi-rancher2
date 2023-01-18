// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectContainerResourceLimitGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CPU limit for containers (string)
        /// </summary>
        [Input("limitsCpu")]
        public Input<string>? LimitsCpu { get; set; }

        /// <summary>
        /// Memory limit for containers (string)
        /// </summary>
        [Input("limitsMemory")]
        public Input<string>? LimitsMemory { get; set; }

        /// <summary>
        /// CPU reservation for containers (string)
        /// </summary>
        [Input("requestsCpu")]
        public Input<string>? RequestsCpu { get; set; }

        /// <summary>
        /// Memory reservation for containers (string)
        /// </summary>
        [Input("requestsMemory")]
        public Input<string>? RequestsMemory { get; set; }

        public ProjectContainerResourceLimitGetArgs()
        {
        }
        public static new ProjectContainerResourceLimitGetArgs Empty => new ProjectContainerResourceLimitGetArgs();
    }
}
