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
    public sealed class ClusterGkeConfig
    {
        /// <summary>
        /// The IP address range of the container pods (string)
        /// </summary>
        public readonly string ClusterIpv4Cidr;
        /// <summary>
        /// The contents of the GC credential file (string)
        /// </summary>
        public readonly string Credential;
        /// <summary>
        /// An optional description of this cluster (string)
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Size of the disk attached to each node. Default `100` (int)
        /// </summary>
        public readonly int? DiskSizeGb;
        /// <summary>
        /// Type of the disk attached to each node (string)
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// To enable Kubernetes alpha feature. Default `true` (bool)
        /// </summary>
        public readonly bool? EnableAlphaFeature;
        /// <summary>
        /// Specifies whether the node auto-repair is enabled for the node pool. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableAutoRepair;
        /// <summary>
        /// Specifies whether node auto-upgrade is enabled for the node pool. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableAutoUpgrade;
        /// <summary>
        /// Enable horizontal pod autoscaling for the cluster. Default `true` (bool)
        /// </summary>
        public readonly bool? EnableHorizontalPodAutoscaling;
        /// <summary>
        /// Enable HTTP load balancing on GKE cluster. Default `true` (bool)
        /// </summary>
        public readonly bool? EnableHttpLoadBalancing;
        /// <summary>
        /// Whether to enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableKubernetesDashboard;
        /// <summary>
        /// Whether to enable legacy abac on the cluster. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableLegacyAbac;
        public readonly bool? EnableMasterAuthorizedNetwork;
        /// <summary>
        /// Enable stackdriver logging. Default `true` (bool)
        /// </summary>
        public readonly bool? EnableNetworkPolicyConfig;
        /// <summary>
        /// Enable nodepool autoscaling. Default `false` (bool)
        /// </summary>
        public readonly bool? EnableNodepoolAutoscaling;
        /// <summary>
        /// Whether the master's internal IP address is used as the cluster endpoint. Default `false` (bool)
        /// </summary>
        public readonly bool? EnablePrivateEndpoint;
        /// <summary>
        /// Whether nodes have internal IP address only. Default `false` (bool)
        /// </summary>
        public readonly bool? EnablePrivateNodes;
        /// <summary>
        /// Enable stackdriver monitoring. Default `true` (bool)
        /// </summary>
        public readonly bool? EnableStackdriverLogging;
        /// <summary>
        /// Enable stackdriver monitoring on GKE cluster (bool)
        /// </summary>
        public readonly bool? EnableStackdriverMonitoring;
        /// <summary>
        /// The image to use for the worker nodes (string)
        /// </summary>
        public readonly string ImageType;
        /// <summary>
        /// The IP address range for the cluster pod IPs (string)
        /// </summary>
        public readonly string IpPolicyClusterIpv4CidrBlock;
        /// <summary>
        /// The name of the secondary range to be used for the cluster CIDR block (string)
        /// </summary>
        public readonly string IpPolicyClusterSecondaryRangeName;
        /// <summary>
        /// Whether a new subnetwork will be created automatically for the cluster. Default `false` (bool)
        /// </summary>
        public readonly bool? IpPolicyCreateSubnetwork;
        /// <summary>
        /// The IP address range of the instance IPs in this cluster (string)
        /// </summary>
        public readonly string IpPolicyNodeIpv4CidrBlock;
        /// <summary>
        /// The IP address range of the services IPs in this cluster (string)
        /// </summary>
        public readonly string IpPolicyServicesIpv4CidrBlock;
        /// <summary>
        /// The name of the secondary range to be used for the services CIDR block (string)
        /// </summary>
        public readonly string IpPolicyServicesSecondaryRangeName;
        /// <summary>
        /// A custom subnetwork name to be used if createSubnetwork is true (string)
        /// </summary>
        public readonly string IpPolicySubnetworkName;
        /// <summary>
        /// Issue a client certificate. Default `false` (bool)
        /// </summary>
        public readonly bool? IssueClientCertificate;
        /// <summary>
        /// Enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        public readonly bool? KubernetesDashboard;
        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// The number of local SSD disks to be attached to the node. Default `0` (int)
        /// </summary>
        public readonly int? LocalSsdCount;
        /// <summary>
        /// Locations for GKE cluster (list)
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        /// <summary>
        /// Machine type for GKE cluster (string)
        /// </summary>
        public readonly string MachineType;
        /// <summary>
        /// Maintenance window for GKE cluster (string)
        /// </summary>
        public readonly string MaintenanceWindow;
        /// <summary>
        /// Define up to 10 external networks that could access Kubernetes master through HTTPS (list)
        /// </summary>
        public readonly ImmutableArray<string> MasterAuthorizedNetworkCidrBlocks;
        /// <summary>
        /// The IP range in CIDR notation to use for the hosted master network (string)
        /// </summary>
        public readonly string MasterIpv4CidrBlock;
        /// <summary>
        /// Master version for GKE cluster (string)
        /// </summary>
        public readonly string MasterVersion;
        /// <summary>
        /// Maximum number of nodes in the NodePool. Must be &gt;= minNodeCount. There has to enough quota to scale up the cluster. Default `0` (int)
        /// </summary>
        public readonly int? MaxNodeCount;
        /// <summary>
        /// Minimmum number of nodes in the NodePool. Must be &gt;= 1 and &lt;= maxNodeCount. Default `0` (int)
        /// </summary>
        public readonly int? MinNodeCount;
        /// <summary>
        /// Network for GKE cluster (string)
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// Node count for GKE cluster. Default `3` (int)
        /// </summary>
        public readonly int? NodeCount;
        /// <summary>
        /// The ID of the cluster node pool (string)
        /// </summary>
        public readonly string NodePool;
        /// <summary>
        /// Node version for GKE cluster (string)
        /// </summary>
        public readonly string NodeVersion;
        /// <summary>
        /// The set of Google API scopes to be made available on all of the node VMs under the default service account (list)
        /// </summary>
        public readonly ImmutableArray<string> OauthScopes;
        /// <summary>
        /// Whether the nodes are created as preemptible VM instances. Default `false` (bool)
        /// </summary>
        public readonly bool? Preemptible;
        /// <summary>
        /// Project ID to apply answer (string)
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// The map of Kubernetes labels to be applied to each cluster (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? ResourceLabels;
        /// <summary>
        /// The Google Cloud Platform Service Account to be used by the node VMs (string)
        /// </summary>
        public readonly string ServiceAccount;
        /// <summary>
        /// Subnetwork for GKE cluster (string)
        /// </summary>
        public readonly string SubNetwork;
        /// <summary>
        /// List of Kubernetes taints to be applied to each node (list)
        /// </summary>
        public readonly ImmutableArray<string> Taints;
        /// <summary>
        /// Whether alias IPs will be used for pod IPs in the cluster. Default `false` (bool)
        /// </summary>
        public readonly bool? UseIpAliases;
        /// <summary>
        /// Zone GKE cluster (string)
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private ClusterGkeConfig(
            string clusterIpv4Cidr,

            string credential,

            string? description,

            int? diskSizeGb,

            string diskType,

            bool? enableAlphaFeature,

            bool? enableAutoRepair,

            bool? enableAutoUpgrade,

            bool? enableHorizontalPodAutoscaling,

            bool? enableHttpLoadBalancing,

            bool? enableKubernetesDashboard,

            bool? enableLegacyAbac,

            bool? enableMasterAuthorizedNetwork,

            bool? enableNetworkPolicyConfig,

            bool? enableNodepoolAutoscaling,

            bool? enablePrivateEndpoint,

            bool? enablePrivateNodes,

            bool? enableStackdriverLogging,

            bool? enableStackdriverMonitoring,

            string imageType,

            string ipPolicyClusterIpv4CidrBlock,

            string ipPolicyClusterSecondaryRangeName,

            bool? ipPolicyCreateSubnetwork,

            string ipPolicyNodeIpv4CidrBlock,

            string ipPolicyServicesIpv4CidrBlock,

            string ipPolicyServicesSecondaryRangeName,

            string ipPolicySubnetworkName,

            bool? issueClientCertificate,

            bool? kubernetesDashboard,

            ImmutableDictionary<string, object>? labels,

            int? localSsdCount,

            ImmutableArray<string> locations,

            string machineType,

            string maintenanceWindow,

            ImmutableArray<string> masterAuthorizedNetworkCidrBlocks,

            string masterIpv4CidrBlock,

            string masterVersion,

            int? maxNodeCount,

            int? minNodeCount,

            string network,

            int? nodeCount,

            string nodePool,

            string nodeVersion,

            ImmutableArray<string> oauthScopes,

            bool? preemptible,

            string projectId,

            ImmutableDictionary<string, object>? resourceLabels,

            string serviceAccount,

            string subNetwork,

            ImmutableArray<string> taints,

            bool? useIpAliases,

            string? zone)
        {
            ClusterIpv4Cidr = clusterIpv4Cidr;
            Credential = credential;
            Description = description;
            DiskSizeGb = diskSizeGb;
            DiskType = diskType;
            EnableAlphaFeature = enableAlphaFeature;
            EnableAutoRepair = enableAutoRepair;
            EnableAutoUpgrade = enableAutoUpgrade;
            EnableHorizontalPodAutoscaling = enableHorizontalPodAutoscaling;
            EnableHttpLoadBalancing = enableHttpLoadBalancing;
            EnableKubernetesDashboard = enableKubernetesDashboard;
            EnableLegacyAbac = enableLegacyAbac;
            EnableMasterAuthorizedNetwork = enableMasterAuthorizedNetwork;
            EnableNetworkPolicyConfig = enableNetworkPolicyConfig;
            EnableNodepoolAutoscaling = enableNodepoolAutoscaling;
            EnablePrivateEndpoint = enablePrivateEndpoint;
            EnablePrivateNodes = enablePrivateNodes;
            EnableStackdriverLogging = enableStackdriverLogging;
            EnableStackdriverMonitoring = enableStackdriverMonitoring;
            ImageType = imageType;
            IpPolicyClusterIpv4CidrBlock = ipPolicyClusterIpv4CidrBlock;
            IpPolicyClusterSecondaryRangeName = ipPolicyClusterSecondaryRangeName;
            IpPolicyCreateSubnetwork = ipPolicyCreateSubnetwork;
            IpPolicyNodeIpv4CidrBlock = ipPolicyNodeIpv4CidrBlock;
            IpPolicyServicesIpv4CidrBlock = ipPolicyServicesIpv4CidrBlock;
            IpPolicyServicesSecondaryRangeName = ipPolicyServicesSecondaryRangeName;
            IpPolicySubnetworkName = ipPolicySubnetworkName;
            IssueClientCertificate = issueClientCertificate;
            KubernetesDashboard = kubernetesDashboard;
            Labels = labels;
            LocalSsdCount = localSsdCount;
            Locations = locations;
            MachineType = machineType;
            MaintenanceWindow = maintenanceWindow;
            MasterAuthorizedNetworkCidrBlocks = masterAuthorizedNetworkCidrBlocks;
            MasterIpv4CidrBlock = masterIpv4CidrBlock;
            MasterVersion = masterVersion;
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
            Network = network;
            NodeCount = nodeCount;
            NodePool = nodePool;
            NodeVersion = nodeVersion;
            OauthScopes = oauthScopes;
            Preemptible = preemptible;
            ProjectId = projectId;
            ResourceLabels = resourceLabels;
            ServiceAccount = serviceAccount;
            SubNetwork = subNetwork;
            Taints = taints;
            UseIpAliases = useIpAliases;
            Zone = zone;
        }
    }
}
