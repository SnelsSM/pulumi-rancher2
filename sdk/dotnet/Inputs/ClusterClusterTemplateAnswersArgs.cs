// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterTemplateAnswersArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster ID (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Project ID to apply answer (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("values")]
        private InputMap<object>? _values;

        /// <summary>
        /// Key/values for answer (map)
        /// </summary>
        public InputMap<object> Values
        {
            get => _values ?? (_values = new InputMap<object>());
            set => _values = value;
        }

        public ClusterClusterTemplateAnswersArgs()
        {
        }
    }
}
