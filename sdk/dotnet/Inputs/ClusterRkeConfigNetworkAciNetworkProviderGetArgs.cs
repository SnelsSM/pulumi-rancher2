// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkAciNetworkProviderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Attachable entity profile (string)
        /// </summary>
        [Input("aep", required: true)]
        public Input<string> Aep { get; set; } = null!;

        [Input("apicHosts", required: true)]
        private InputList<string>? _apicHosts;

        /// <summary>
        /// List of APIC hosts to connect for APIC API (list)
        /// </summary>
        public InputList<string> ApicHosts
        {
            get => _apicHosts ?? (_apicHosts = new InputList<string>());
            set => _apicHosts = value;
        }

        /// <summary>
        /// APIC refresh ticker adjust amount (string)
        /// </summary>
        [Input("apicRefreshTickerAdjust")]
        public Input<string>? ApicRefreshTickerAdjust { get; set; }

        /// <summary>
        /// APIC refresh time in seconds (string)
        /// </summary>
        [Input("apicRefreshTime")]
        public Input<string>? ApicRefreshTime { get; set; }

        /// <summary>
        /// APIC subscription delay amount (string)
        /// </summary>
        [Input("apicSubscriptionDelay")]
        public Input<string>? ApicSubscriptionDelay { get; set; }

        [Input("apicUserCrt", required: true)]
        private Input<string>? _apicUserCrt;

        /// <summary>
        /// APIC user certificate (string)
        /// </summary>
        public Input<string>? ApicUserCrt
        {
            get => _apicUserCrt;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apicUserCrt = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apicUserKey", required: true)]
        private Input<string>? _apicUserKey;

        /// <summary>
        /// APIC user key (string)
        /// </summary>
        public Input<string>? ApicUserKey
        {
            get => _apicUserKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apicUserKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// APIC user name (string)
        /// </summary>
        [Input("apicUserName", required: true)]
        public Input<string> ApicUserName { get; set; } = null!;

        /// <summary>
        /// cAPIC cloud (string)
        /// </summary>
        [Input("capic")]
        public Input<string>? Capic { get; set; }

        /// <summary>
        /// Log level for ACI controller (string)
        /// </summary>
        [Input("controllerLogLevel")]
        public Input<string>? ControllerLogLevel { get; set; }

        /// <summary>
        /// Whether to disable periodic SNAT global info sync (string)
        /// </summary>
        [Input("disablePeriodicSnatGlobalInfoSync")]
        public Input<string>? DisablePeriodicSnatGlobalInfoSync { get; set; }

        /// <summary>
        /// Whether to disable waiting for network (string)
        /// </summary>
        [Input("disableWaitForNetwork")]
        public Input<string>? DisableWaitForNetwork { get; set; }

        /// <summary>
        /// Whether to enable drop log (string)
        /// </summary>
        [Input("dropLogEnable")]
        public Input<string>? DropLogEnable { get; set; }

        /// <summary>
        /// The duration to wait for network (string)
        /// </summary>
        [Input("durationWaitForNetwork")]
        public Input<string>? DurationWaitForNetwork { get; set; }

        /// <summary>
        /// Whether to enable endpoint slices (string)
        /// </summary>
        [Input("enableEndpointSlice")]
        public Input<string>? EnableEndpointSlice { get; set; }

        /// <summary>
        /// Encap type: vxlan or vlan (string)
        /// </summary>
        [Input("encapType", required: true)]
        public Input<string> EncapType { get; set; } = null!;

        /// <summary>
        /// EP registry (string)
        /// </summary>
        [Input("epRegistry")]
        public Input<string>? EpRegistry { get; set; }

        /// <summary>
        /// Subnet to use for dynamic external IPs (string)
        /// </summary>
        [Input("externDynamic", required: true)]
        public Input<string> ExternDynamic { get; set; } = null!;

        /// <summary>
        /// Subnet to use for static external IPs (string)
        /// </summary>
        [Input("externStatic", required: true)]
        public Input<string> ExternStatic { get; set; } = null!;

        /// <summary>
        /// GBH pod subnet (string)
        /// </summary>
        [Input("gbpPodSubnet")]
        public Input<string>? GbpPodSubnet { get; set; }

        /// <summary>
        /// Log level for ACI host agent (string)
        /// </summary>
        [Input("hostAgentLogLevel")]
        public Input<string>? HostAgentLogLevel { get; set; }

        /// <summary>
        /// Image pull policy (string)
        /// </summary>
        [Input("imagePullPolicy")]
        public Input<string>? ImagePullPolicy { get; set; }

        /// <summary>
        /// Image pull policy (string)
        /// </summary>
        [Input("imagePullSecret")]
        public Input<string>? ImagePullSecret { get; set; }

        /// <summary>
        /// The VLAN used by ACI infra (string)
        /// </summary>
        [Input("infraVlan")]
        public Input<string>? InfraVlan { get; set; }

        /// <summary>
        /// Whether to install Istio (string)
        /// </summary>
        [Input("installIstio")]
        public Input<string>? InstallIstio { get; set; }

        /// <summary>
        /// Istio profile name (string)
        /// </summary>
        [Input("istioProfile")]
        public Input<string>? IstioProfile { get; set; }

        [Input("kafkaBrokers")]
        private InputList<string>? _kafkaBrokers;

        /// <summary>
        /// List of Kafka broker hosts (list)
        /// </summary>
        public InputList<string> KafkaBrokers
        {
            get => _kafkaBrokers ?? (_kafkaBrokers = new InputList<string>());
            set => _kafkaBrokers = value;
        }

        /// <summary>
        /// Kafka client certificate (string)
        /// </summary>
        [Input("kafkaClientCrt")]
        public Input<string>? KafkaClientCrt { get; set; }

        /// <summary>
        /// Kafka client key (string)
        /// </summary>
        [Input("kafkaClientKey")]
        public Input<string>? KafkaClientKey { get; set; }

        /// <summary>
        /// The VLAN used by the physdom for nodes (string)
        /// </summary>
        [Input("kubeApiVlan", required: true)]
        public Input<string> KubeApiVlan { get; set; } = null!;

        /// <summary>
        /// L3out (string)
        /// </summary>
        [Input("l3out", required: true)]
        public Input<string> L3out { get; set; } = null!;

        [Input("l3outExternalNetworks", required: true)]
        private InputList<string>? _l3outExternalNetworks;

        /// <summary>
        /// L3out external networks (list)
        /// </summary>
        public InputList<string> L3outExternalNetworks
        {
            get => _l3outExternalNetworks ?? (_l3outExternalNetworks = new InputList<string>());
            set => _l3outExternalNetworks = value;
        }

        /// <summary>
        /// Max nodes in service graph (string)
        /// </summary>
        [Input("maxNodesSvcGraph")]
        public Input<string>? MaxNodesSvcGraph { get; set; }

        /// <summary>
        /// End of mcast range (string)
        /// </summary>
        [Input("mcastRangeEnd", required: true)]
        public Input<string> McastRangeEnd { get; set; } = null!;

        /// <summary>
        /// Start of mcast range (string)
        /// </summary>
        [Input("mcastRangeStart", required: true)]
        public Input<string> McastRangeStart { get; set; } = null!;

        /// <summary>
        /// MTU head room amount (string)
        /// </summary>
        [Input("mtuHeadRoom")]
        public Input<string>? MtuHeadRoom { get; set; }

        /// <summary>
        /// Whether to disable Multus (string)
        /// </summary>
        [Input("multusDisable")]
        public Input<string>? MultusDisable { get; set; }

        /// <summary>
        /// Whether to use priority class (string)
        /// </summary>
        [Input("noPriorityClass")]
        public Input<string>? NoPriorityClass { get; set; }

        /// <summary>
        /// Whether to enable node pod interface (string)
        /// </summary>
        [Input("nodePodIfEnable")]
        public Input<string>? NodePodIfEnable { get; set; }

        /// <summary>
        /// Subnet to use for nodes (string)
        /// </summary>
        [Input("nodeSubnet", required: true)]
        public Input<string> NodeSubnet { get; set; } = null!;

        /// <summary>
        /// Subnet to use for service graph (string)
        /// </summary>
        [Input("nodeSvcSubnet", required: true)]
        public Input<string> NodeSvcSubnet { get; set; } = null!;

        /// <summary>
        /// Whether to use client SSL for Opflex (string)
        /// </summary>
        [Input("opflexClientSsl")]
        public Input<string>? OpflexClientSsl { get; set; }

        /// <summary>
        /// Opflex device delete timeout (string)
        /// </summary>
        [Input("opflexDeviceDeleteTimeout")]
        public Input<string>? OpflexDeviceDeleteTimeout { get; set; }

        /// <summary>
        /// Log level for ACI opflex (string)
        /// </summary>
        [Input("opflexLogLevel")]
        public Input<string>? OpflexLogLevel { get; set; }

        /// <summary>
        /// Opflex mode (string)
        /// </summary>
        [Input("opflexMode")]
        public Input<string>? OpflexMode { get; set; }

        /// <summary>
        /// Opflex server port (string)
        /// </summary>
        [Input("opflexServerPort")]
        public Input<string>? OpflexServerPort { get; set; }

        /// <summary>
        /// Overlay VRF name (string)
        /// </summary>
        [Input("overlayVrfName")]
        public Input<string>? OverlayVrfName { get; set; }

        /// <summary>
        /// OVS memory limit (string)
        /// </summary>
        [Input("ovsMemoryLimit")]
        public Input<string>? OvsMemoryLimit { get; set; }

        /// <summary>
        /// Policy-based routing tracking non snat (string)
        /// </summary>
        [Input("pbrTrackingNonSnat")]
        public Input<string>? PbrTrackingNonSnat { get; set; }

        /// <summary>
        /// Pod subnet chunk size (string)
        /// </summary>
        [Input("podSubnetChunkSize")]
        public Input<string>? PodSubnetChunkSize { get; set; }

        /// <summary>
        /// Whether to run GBP container (string)
        /// </summary>
        [Input("runGbpContainer")]
        public Input<string>? RunGbpContainer { get; set; }

        /// <summary>
        /// Whether to run Opflex server container (string)
        /// </summary>
        [Input("runOpflexServerContainer")]
        public Input<string>? RunOpflexServerContainer { get; set; }

        /// <summary>
        /// Service monitor interval (string)
        /// </summary>
        [Input("serviceMonitorInterval")]
        public Input<string>? ServiceMonitorInterval { get; set; }

        /// <summary>
        /// The VLAN used by LoadBalancer services (string)
        /// </summary>
        [Input("serviceVlan", required: true)]
        public Input<string> ServiceVlan { get; set; } = null!;

        /// <summary>
        /// Snat contract scope (string)
        /// </summary>
        [Input("snatContractScope")]
        public Input<string>? SnatContractScope { get; set; }

        /// <summary>
        /// Snat namespace (string)
        /// </summary>
        [Input("snatNamespace")]
        public Input<string>? SnatNamespace { get; set; }

        /// <summary>
        /// End of snat port range (string)
        /// </summary>
        [Input("snatPortRangeEnd")]
        public Input<string>? SnatPortRangeEnd { get; set; }

        /// <summary>
        /// End of snat port range (string)
        /// </summary>
        [Input("snatPortRangeStart")]
        public Input<string>? SnatPortRangeStart { get; set; }

        /// <summary>
        /// Snat ports per node (string)
        /// </summary>
        [Input("snatPortsPerNode")]
        public Input<string>? SnatPortsPerNode { get; set; }

        /// <summary>
        /// Whether to enable SR-IOV (string)
        /// </summary>
        [Input("sriovEnable")]
        public Input<string>? SriovEnable { get; set; }

        /// <summary>
        /// Subnet domain name (string)
        /// </summary>
        [Input("subnetDomainName")]
        public Input<string>? SubnetDomainName { get; set; }

        /// <summary>
        /// ACI system ID (string)
        /// </summary>
        [Input("systemId", required: true)]
        public Input<string> SystemId { get; set; } = null!;

        /// <summary>
        /// ACI tenant (string)
        /// </summary>
        [Input("tenant")]
        public Input<string>? Tenant { get; set; }

        [Input("token", required: true)]
        private Input<string>? _token;
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to use ACI anywhere CRD (string)
        /// </summary>
        [Input("useAciAnywhereCrd")]
        public Input<string>? UseAciAnywhereCrd { get; set; }

        /// <summary>
        /// Whether to use ACI CNI priority class (string)
        /// </summary>
        [Input("useAciCniPriorityClass")]
        public Input<string>? UseAciCniPriorityClass { get; set; }

        /// <summary>
        /// Whether to use cluster role (string)
        /// </summary>
        [Input("useClusterRole")]
        public Input<string>? UseClusterRole { get; set; }

        /// <summary>
        /// Whether to use host netns volume (string)
        /// </summary>
        [Input("useHostNetnsVolume")]
        public Input<string>? UseHostNetnsVolume { get; set; }

        /// <summary>
        /// Whether use Opflex server volume (string)
        /// </summary>
        [Input("useOpflexServerVolume")]
        public Input<string>? UseOpflexServerVolume { get; set; }

        /// <summary>
        /// Whether ACI containers should run as privileged (string)
        /// </summary>
        [Input("usePrivilegedContainer")]
        public Input<string>? UsePrivilegedContainer { get; set; }

        /// <summary>
        /// VMM controller configuration (string)
        /// </summary>
        [Input("vmmController")]
        public Input<string>? VmmController { get; set; }

        /// <summary>
        /// VMM domain configuration (string)
        /// </summary>
        [Input("vmmDomain")]
        public Input<string>? VmmDomain { get; set; }

        /// <summary>
        /// VRF name (string)
        /// </summary>
        [Input("vrfName", required: true)]
        public Input<string> VrfName { get; set; } = null!;

        /// <summary>
        /// VRF tenant (string)
        /// </summary>
        [Input("vrfTenant", required: true)]
        public Input<string> VrfTenant { get; set; } = null!;

        public ClusterRkeConfigNetworkAciNetworkProviderGetArgs()
        {
        }
        public static new ClusterRkeConfigNetworkAciNetworkProviderGetArgs Empty => new ClusterRkeConfigNetworkAciNetworkProviderGetArgs();
    }
}
