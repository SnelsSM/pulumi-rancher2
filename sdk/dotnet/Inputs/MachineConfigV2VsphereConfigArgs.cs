// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class MachineConfigV2VsphereConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
        /// </summary>
        [Input("boot2dockerUrl")]
        public Input<string>? Boot2dockerUrl { get; set; }

        [Input("cfgparams")]
        private InputList<string>? _cfgparams;

        /// <summary>
        /// vSphere vm configuration parameters (used for guestinfo) (list)
        /// </summary>
        public InputList<string> Cfgparams
        {
            get => _cfgparams ?? (_cfgparams = new InputList<string>());
            set => _cfgparams = value;
        }

        /// <summary>
        /// If you choose creation type vm (clone vm) a name of what vm you want to clone is required (string)
        /// </summary>
        [Input("cloneFrom")]
        public Input<string>? CloneFrom { get; set; }

        /// <summary>
        /// Filepath to a cloud-config yaml file to put into the ISO user-data (string)
        /// </summary>
        [Input("cloudConfig")]
        public Input<string>? CloudConfig { get; set; }

        /// <summary>
        /// vSphere cloud-init file or url to set in the guestinfo (string)
        /// </summary>
        [Input("cloudinit")]
        public Input<string>? Cloudinit { get; set; }

        /// <summary>
        /// If you choose to clone from a content library template specify the name of the library (string)
        /// </summary>
        [Input("contentLibrary")]
        public Input<string>? ContentLibrary { get; set; }

        /// <summary>
        /// vSphere CPU number for docker VM. Default `2` (string)
        /// </summary>
        [Input("cpuCount")]
        public Input<string>? CpuCount { get; set; }

        /// <summary>
        /// Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy` (string)
        /// </summary>
        [Input("creationType")]
        public Input<string>? CreationType { get; set; }

        [Input("customAttributes")]
        private InputList<string>? _customAttributes;

        /// <summary>
        /// vSphere custom attributes, format key/value e.g. `200=my custom value` (List)
        /// </summary>
        public InputList<string> CustomAttributes
        {
            get => _customAttributes ?? (_customAttributes = new InputList<string>());
            set => _customAttributes = value;
        }

        /// <summary>
        /// vSphere datacenter for docker VM (string)
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// vSphere datastore for docker VM (string)
        /// </summary>
        [Input("datastore")]
        public Input<string>? Datastore { get; set; }

        /// <summary>
        /// vSphere datastore cluster for virtual machine (string)
        /// </summary>
        [Input("datastoreCluster")]
        public Input<string>? DatastoreCluster { get; set; }

        /// <summary>
        /// vSphere size of disk for docker VM (in MB). Default `20480` (string)
        /// </summary>
        [Input("diskSize")]
        public Input<string>? DiskSize { get; set; }

        /// <summary>
        /// vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
        /// </summary>
        [Input("hostsystem")]
        public Input<string>? Hostsystem { get; set; }

        /// <summary>
        /// vSphere size of memory for docker VM (in MB). Default `2048` (string)
        /// </summary>
        [Input("memorySize")]
        public Input<string>? MemorySize { get; set; }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// vSphere network where the docker VM will be attached (list)
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// OpenStack password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// vSphere resource pool for docker VM (string)
        /// </summary>
        [Input("pool")]
        public Input<string>? Pool { get; set; }

        [Input("sshPassword")]
        private Input<string>? _sshPassword;

        /// <summary>
        /// If using a non-B2D image you can specify the ssh password. Default `tcuser` (string)
        /// </summary>
        public Input<string>? SshPassword
        {
            get => _sshPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22` (string)
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// If using a non-B2D image the uploaded keys will need chown'ed. Default `staff` (string)
        /// </summary>
        [Input("sshUserGroup")]
        public Input<string>? SshUserGroup { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// vSphere tags id e.g. `urn:xxx` (list)
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// OpenStack username (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
        /// </summary>
        [Input("vappIpAllocationPolicy")]
        public Input<string>? VappIpAllocationPolicy { get; set; }

        /// <summary>
        /// vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
        /// </summary>
        [Input("vappIpProtocol")]
        public Input<string>? VappIpProtocol { get; set; }

        [Input("vappProperties")]
        private InputList<string>? _vappProperties;

        /// <summary>
        /// vSphere vApp properties (list)
        /// </summary>
        public InputList<string> VappProperties
        {
            get => _vappProperties ?? (_vappProperties = new InputList<string>());
            set => _vappProperties = value;
        }

        /// <summary>
        /// vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
        /// </summary>
        [Input("vappTransport")]
        public Input<string>? VappTransport { get; set; }

        /// <summary>
        /// vSphere IP/hostname for vCenter (string)
        /// </summary>
        [Input("vcenter")]
        public Input<string>? Vcenter { get; set; }

        /// <summary>
        /// vSphere Port for vCenter Default `443` (string)
        /// </summary>
        [Input("vcenterPort")]
        public Input<string>? VcenterPort { get; set; }

        public MachineConfigV2VsphereConfigArgs()
        {
        }
        public static new MachineConfigV2VsphereConfigArgs Empty => new MachineConfigV2VsphereConfigArgs();
    }
}
