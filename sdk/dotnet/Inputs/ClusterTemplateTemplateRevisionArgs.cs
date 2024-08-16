// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for the cluster template (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Cluster configuration
        /// </summary>
        [Input("clusterConfig", required: true)]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigArgs> ClusterConfig { get; set; } = null!;

        /// <summary>
        /// Cluster template ID
        /// </summary>
        [Input("clusterTemplateId")]
        public Input<string>? ClusterTemplateId { get; set; }

        /// <summary>
        /// Default cluster template revision
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// Enable cluster template revision
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// (Computed) The ID of the resource (string)
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("questions")]
        private InputList<Inputs.ClusterTemplateTemplateRevisionQuestionArgs>? _questions;

        /// <summary>
        /// Cluster template questions
        /// </summary>
        public InputList<Inputs.ClusterTemplateTemplateRevisionQuestionArgs> Questions
        {
            get => _questions ?? (_questions = new InputList<Inputs.ClusterTemplateTemplateRevisionQuestionArgs>());
            set => _questions = value;
        }

        public ClusterTemplateTemplateRevisionArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionArgs Empty => new ClusterTemplateTemplateRevisionArgs();
    }
}
