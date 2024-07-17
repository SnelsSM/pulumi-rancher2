// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectResourceQuotaNamespaceDefaultLimitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Limit for config maps in project (string)
        /// </summary>
        [Input("configMaps")]
        public Input<string>? ConfigMaps { get; set; }

        /// <summary>
        /// Limit for limits cpu in project (string)
        /// </summary>
        [Input("limitsCpu")]
        public Input<string>? LimitsCpu { get; set; }

        /// <summary>
        /// Limit for limits memory in project (string)
        /// </summary>
        [Input("limitsMemory")]
        public Input<string>? LimitsMemory { get; set; }

        /// <summary>
        /// Limit for persistent volume claims in project (string)
        /// </summary>
        [Input("persistentVolumeClaims")]
        public Input<string>? PersistentVolumeClaims { get; set; }

        /// <summary>
        /// Limit for pods in project (string)
        /// </summary>
        [Input("pods")]
        public Input<string>? Pods { get; set; }

        /// <summary>
        /// Limit for replication controllers in project (string)
        /// </summary>
        [Input("replicationControllers")]
        public Input<string>? ReplicationControllers { get; set; }

        /// <summary>
        /// Limit for requests cpu in project (string)
        /// </summary>
        [Input("requestsCpu")]
        public Input<string>? RequestsCpu { get; set; }

        /// <summary>
        /// Limit for requests memory in project (string)
        /// </summary>
        [Input("requestsMemory")]
        public Input<string>? RequestsMemory { get; set; }

        /// <summary>
        /// Limit for requests storage in project (string)
        /// </summary>
        [Input("requestsStorage")]
        public Input<string>? RequestsStorage { get; set; }

        /// <summary>
        /// Limit for secrets in project (string)
        /// </summary>
        [Input("secrets")]
        public Input<string>? Secrets { get; set; }

        [Input("services")]
        public Input<string>? Services { get; set; }

        /// <summary>
        /// Limit for services load balancers in project (string)
        /// </summary>
        [Input("servicesLoadBalancers")]
        public Input<string>? ServicesLoadBalancers { get; set; }

        /// <summary>
        /// Limit for services node ports in project (string)
        /// 
        /// More info at [resource-quotas](https://rancher.com/docs/rancher/v2.x/en/k8s-in-rancher/projects-and-namespaces/resource-quotas/)
        /// </summary>
        [Input("servicesNodePorts")]
        public Input<string>? ServicesNodePorts { get; set; }

        public ProjectResourceQuotaNamespaceDefaultLimitArgs()
        {
        }
        public static new ProjectResourceQuotaNamespaceDefaultLimitArgs Empty => new ProjectResourceQuotaNamespaceDefaultLimitArgs();
    }
}
