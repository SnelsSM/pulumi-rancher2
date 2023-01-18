// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusterCidr")]
        public Input<string>? ClusterCidr { get; set; }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("serviceClusterIpRange")]
        public Input<string>? ServiceClusterIpRange { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerGetArgs();
    }
}
