// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAksConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The secret of an Azure Active Directory server application (string)
        /// </summary>
        [Input("aadServerAppSecret")]
        public Input<string>? AadServerAppSecret { get; set; }

        /// <summary>
        /// The ID of an Azure Active Directory tenant (string)
        /// </summary>
        [Input("aadTenantId")]
        public Input<string>? AadTenantId { get; set; }

        /// <summary>
        /// The ID of an Azure Active Directory client application of type \"Native\". This application is for user login via kubectl (string)
        /// </summary>
        [Input("addClientAppId")]
        public Input<string>? AddClientAppId { get; set; }

        /// <summary>
        /// The ID of an Azure Active Directory server application of type \"Web app/API\". This application represents the managed cluster's apiserver (Server application) (string)
        /// </summary>
        [Input("addServerAppId")]
        public Input<string>? AddServerAppId { get; set; }

        /// <summary>
        /// The administrator username to use for Linux hosts. Default `azureuser` (string)
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// DNS prefix to be used to create the FQDN for the agent pool (string)
        /// </summary>
        [Input("agentDnsPrefix", required: true)]
        public Input<string> AgentDnsPrefix { get; set; } = null!;

        /// <summary>
        /// GB size to be used to specify the disk for every machine in the agent pool. If you specify 0, it will apply the default according to the \"agent vm size\" specified. Default `0` (int)
        /// </summary>
        [Input("agentOsDiskSize")]
        public Input<int>? AgentOsDiskSize { get; set; }

        /// <summary>
        /// Name for the agent pool, upto 12 alphanumeric characters. Default `agentpool0` (string)
        /// </summary>
        [Input("agentPoolName")]
        public Input<string>? AgentPoolName { get; set; }

        /// <summary>
        /// Storage profile specifies what kind of storage used on machine in the agent pool. Chooses from [ManagedDisks StorageAccount]. Default `ManagedDisks` (string)
        /// </summary>
        [Input("agentStorageProfile")]
        public Input<string>? AgentStorageProfile { get; set; }

        /// <summary>
        /// Size of machine in the agent pool. Default `Standard_D1_v2` (string)
        /// </summary>
        [Input("agentVmSize")]
        public Input<string>? AgentVmSize { get; set; }

        /// <summary>
        /// Different authentication API url to use. Default `https://login.microsoftonline.com/` (string)
        /// </summary>
        [Input("authBaseUrl")]
        public Input<string>? AuthBaseUrl { get; set; }

        /// <summary>
        /// Different resource management API url to use. Default `https://management.azure.com/` (string)
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// Azure client ID to use (string)
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// Azure client secret associated with the \"client id\" (string)
        /// </summary>
        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// Number of machines (VMs) in the agent pool. Allowed values must be in the range of 1 to 100 (inclusive). Default `1` (int)
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes Service address range specified in \"service cidr\". Default `10.0.0.10` (string)
        /// </summary>
        [Input("dnsServiceIp")]
        public Input<string>? DnsServiceIp { get; set; }

        /// <summary>
        /// A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes Service address range specified in \"service cidr\". Default `172.17.0.1/16` (string)
        /// </summary>
        [Input("dockerBridgeCidr")]
        public Input<string>? DockerBridgeCidr { get; set; }

        /// <summary>
        /// Enable the Kubernetes ingress with automatic public DNS name creation. Default `false` (bool)
        /// </summary>
        [Input("enableHttpApplicationRouting")]
        public Input<bool>? EnableHttpApplicationRouting { get; set; }

        /// <summary>
        /// Turn on Azure Log Analytics monitoring. Uses the Log Analytics \"Default\" workspace if it exists, else creates one. if using an existing workspace, specifies \"log analytics workspace resource id\". Default `true` (bool)
        /// </summary>
        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        /// <summary>
        /// The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
        /// </summary>
        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        /// <summary>
        /// Load balancer type (basic | standard). Must be standard for auto-scaling
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        /// <summary>
        /// Azure Kubernetes cluster location. Default `eastus` (string)
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses '{resource group}-{subscription id}-{location code}' (string)
        /// </summary>
        [Input("logAnalyticsWorkspace")]
        public Input<string>? LogAnalyticsWorkspace { get; set; }

        /// <summary>
        /// The resource group of an existing Azure Log Analytics Workspace to use for storing monitoring data. If not specified, uses the 'Cluster' resource group (string)
        /// </summary>
        [Input("logAnalyticsWorkspaceResourceGroup")]
        public Input<string>? LogAnalyticsWorkspaceResourceGroup { get; set; }

        /// <summary>
        /// DNS prefix to use the Kubernetes cluster control pane (string)
        /// </summary>
        [Input("masterDnsPrefix", required: true)]
        public Input<string> MasterDnsPrefix { get; set; } = null!;

        /// <summary>
        /// Maximum number of pods that can run on a node. Default `110` (int)
        /// </summary>
        [Input("maxPods")]
        public Input<int>? MaxPods { get; set; }

        /// <summary>
        /// Network plugin used for building Kubernetes network. Chooses from `azure` or `kubenet`. Default `azure` (string)
        /// </summary>
        [Input("networkPlugin")]
        public Input<string>? NetworkPlugin { get; set; }

        /// <summary>
        /// Network policy used for building Kubernetes network. Chooses from `calico` (string)
        /// </summary>
        [Input("networkPolicy")]
        public Input<string>? NetworkPolicy { get; set; }

        /// <summary>
        /// A CIDR IP range from which to assign Kubernetes Pod IPs (string)
        /// </summary>
        [Input("podCidr")]
        public Input<string>? PodCidr { get; set; }

        /// <summary>
        /// The name of the Cluster resource group (string)
        /// </summary>
        [Input("resourceGroup", required: true)]
        public Input<string> ResourceGroup { get; set; } = null!;

        /// <summary>
        /// A CIDR IP range from which to assign Kubernetes Service IPs (string)
        /// </summary>
        [Input("serviceCidr")]
        public Input<string>? ServiceCidr { get; set; }

        /// <summary>
        /// Contents of the SSH public key used to authenticate with Linux hosts (string)
        /// </summary>
        [Input("sshPublicKeyContents", required: true)]
        public Input<string> SshPublicKeyContents { get; set; } = null!;

        /// <summary>
        /// The name of an existing Azure Virtual Subnet. Composite of agent virtual network subnet ID (string)
        /// </summary>
        [Input("subnet", required: true)]
        public Input<string> Subnet { get; set; } = null!;

        /// <summary>
        /// Subscription credentials which uniquely identify Microsoft Azure subscription (string)
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        [Input("tag")]
        private InputMap<object>? _tag;

        /// <summary>
        /// Use `tags` argument instead as []string
        /// </summary>
        [Obsolete(@"Use tags argument instead as []string")]
        public InputMap<object> Tag
        {
            get => _tag ?? (_tag = new InputMap<object>());
            set => _tag = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The EKS cluster tags (map)
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Azure tenant ID to use (string)
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        /// <summary>
        /// The name of the virtual network to use. If it's not specified Rancher will create a new VPC (string)
        /// </summary>
        [Input("virtualNetwork", required: true)]
        public Input<string> VirtualNetwork { get; set; } = null!;

        /// <summary>
        /// The resource group of an existing Azure Virtual Network. Composite of agent virtual network subnet ID (string)
        /// </summary>
        [Input("virtualNetworkResourceGroup", required: true)]
        public Input<string> VirtualNetworkResourceGroup { get; set; } = null!;

        public ClusterAksConfigArgs()
        {
        }
    }
}
