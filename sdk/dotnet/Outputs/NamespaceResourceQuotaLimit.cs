// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class NamespaceResourceQuotaLimit
    {
        /// <summary>
        /// Limit for config maps in namespace (string)
        /// </summary>
        public readonly string? ConfigMaps;
        /// <summary>
        /// Limit for limits cpu in namespace (string)
        /// </summary>
        public readonly string? LimitsCpu;
        /// <summary>
        /// Limit for limits memory in namespace (string)
        /// </summary>
        public readonly string? LimitsMemory;
        /// <summary>
        /// Limit for persistent volume claims in namespace (string)
        /// </summary>
        public readonly string? PersistentVolumeClaims;
        /// <summary>
        /// Limit for pods in namespace (string)
        /// </summary>
        public readonly string? Pods;
        /// <summary>
        /// Limit for replication controllers in namespace (string)
        /// </summary>
        public readonly string? ReplicationControllers;
        /// <summary>
        /// Limit for requests cpu in namespace (string)
        /// </summary>
        public readonly string? RequestsCpu;
        /// <summary>
        /// Limit for requests memory in namespace (string)
        /// </summary>
        public readonly string? RequestsMemory;
        /// <summary>
        /// Limit for requests storage in namespace (string)
        /// </summary>
        public readonly string? RequestsStorage;
        /// <summary>
        /// Limit for secrets in namespace (string)
        /// </summary>
        public readonly string? Secrets;
        public readonly string? Services;
        /// <summary>
        /// Limit for services load balancers in namespace (string)
        /// </summary>
        public readonly string? ServicesLoadBalancers;
        /// <summary>
        /// Limit for services node ports in namespace (string)
        /// </summary>
        public readonly string? ServicesNodePorts;

        [OutputConstructor]
        private NamespaceResourceQuotaLimit(
            string? configMaps,

            string? limitsCpu,

            string? limitsMemory,

            string? persistentVolumeClaims,

            string? pods,

            string? replicationControllers,

            string? requestsCpu,

            string? requestsMemory,

            string? requestsStorage,

            string? secrets,

            string? services,

            string? servicesLoadBalancers,

            string? servicesNodePorts)
        {
            ConfigMaps = configMaps;
            LimitsCpu = limitsCpu;
            LimitsMemory = limitsMemory;
            PersistentVolumeClaims = persistentVolumeClaims;
            Pods = pods;
            ReplicationControllers = replicationControllers;
            RequestsCpu = requestsCpu;
            RequestsMemory = requestsMemory;
            RequestsStorage = requestsStorage;
            Secrets = secrets;
            Services = services;
            ServicesLoadBalancers = servicesLoadBalancers;
            ServicesNodePorts = servicesNodePorts;
        }
    }
}
