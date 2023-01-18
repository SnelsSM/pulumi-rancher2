// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeletGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster DNS Server option for kubelet service (string)
        /// </summary>
        [Input("clusterDnsServer")]
        public Input<string>? ClusterDnsServer { get; set; }

        /// <summary>
        /// Cluster Domain option for kubelet service (string)
        /// </summary>
        [Input("clusterDomain")]
        public Input<string>? ClusterDomain { get; set; }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;

        /// <summary>
        /// Extra arguments for RKE Ingress (map)
        /// </summary>
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;

        /// <summary>
        /// Extra binds for etcd service (list)
        /// </summary>
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;

        /// <summary>
        /// Extra environment for etcd service (list)
        /// </summary>
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        /// <summary>
        /// Enable or disable failing when swap on is not supported (bool)
        /// </summary>
        [Input("failSwapOn")]
        public Input<bool>? FailSwapOn { get; set; }

        /// <summary>
        /// [Generate a certificate signed by the kube-ca](https://rancher.com/docs/rke/latest/en/config-options/services/#kubelet-serving-certificate-requirements). Default `false` (bool)
        /// </summary>
        [Input("generateServingCertificate")]
        public Input<bool>? GenerateServingCertificate { get; set; }

        /// <summary>
        /// Docker image for etcd service (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Infra container image for kubelet service (string)
        /// </summary>
        [Input("infraContainerImage")]
        public Input<string>? InfraContainerImage { get; set; }

        public ClusterRkeConfigServicesKubeletGetArgs()
        {
        }
        public static new ClusterRkeConfigServicesKubeletGetArgs Empty => new ClusterRkeConfigServicesKubeletGetArgs();
    }
}
