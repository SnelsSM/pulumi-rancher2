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
    public sealed class NodeTemplateVsphereConfig
    {
        /// <summary>
        /// vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
        /// </summary>
        public readonly string? Boot2dockerUrl;
        /// <summary>
        /// vSphere vm configuration parameters (used for guestinfo) (list)
        /// </summary>
        public readonly ImmutableArray<string> Cfgparams;
        /// <summary>
        /// If you choose creation type clone a name of what you want to clone is required. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? CloneFrom;
        /// <summary>
        /// Filepath to a cloud-config yaml file to put into the ISO user-data. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? CloudConfig;
        /// <summary>
        /// vSphere cloud-init file or url to set in the guestinfo (string)
        /// </summary>
        public readonly string? Cloudinit;
        /// <summary>
        /// If you choose to clone from a content library template specify the name of the library. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? ContentLibrary;
        /// <summary>
        /// vSphere CPU number for docker VM. Default `2` (string)
        /// </summary>
        public readonly string? CpuCount;
        /// <summary>
        /// Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? CreationType;
        /// <summary>
        /// vSphere custom attributes, format key/value e.g. `200=my custom value`. From Rancher v2.3.3 (List)
        /// </summary>
        public readonly ImmutableArray<string> CustomAttributes;
        /// <summary>
        /// vSphere datacenter for docker VM (string)
        /// </summary>
        public readonly string? Datacenter;
        /// <summary>
        /// vSphere datastore for docker VM (string)
        /// </summary>
        public readonly string? Datastore;
        /// <summary>
        /// vSphere datastore cluster for virtual machine. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? DatastoreCluster;
        /// <summary>
        /// vSphere size of disk for docker VM (in MB). Default `20480` (string)
        /// </summary>
        public readonly string? DiskSize;
        /// <summary>
        /// vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
        /// </summary>
        public readonly string? Hostsystem;
        /// <summary>
        /// vSphere size of memory for docker VM (in MB). Default `2048` (string)
        /// </summary>
        public readonly string? MemorySize;
        /// <summary>
        /// vSphere network where the docker VM will be attached (list)
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// vSphere resource pool for docker VM (string)
        /// </summary>
        public readonly string? Pool;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshPassword;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshPort;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// If using a non-B2D image the uploaded keys will need chown'ed. Default `staff`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshUserGroup;
        /// <summary>
        /// vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// vSphere username. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
        /// </summary>
        public readonly string? VappIpAllocationPolicy;
        /// <summary>
        /// vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
        /// </summary>
        public readonly string? VappIpProtocol;
        /// <summary>
        /// vSphere vApp properties (list)
        /// </summary>
        public readonly ImmutableArray<string> VappProperties;
        /// <summary>
        /// vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
        /// </summary>
        public readonly string? VappTransport;
        /// <summary>
        /// vSphere IP/hostname for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? Vcenter;
        /// <summary>
        /// vSphere Port for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x. Default `443` (string)
        /// </summary>
        public readonly string? VcenterPort;

        [OutputConstructor]
        private NodeTemplateVsphereConfig(
            string? boot2dockerUrl,

            ImmutableArray<string> cfgparams,

            string? cloneFrom,

            string? cloudConfig,

            string? cloudinit,

            string? contentLibrary,

            string? cpuCount,

            string? creationType,

            ImmutableArray<string> customAttributes,

            string? datacenter,

            string? datastore,

            string? datastoreCluster,

            string? diskSize,

            string? folder,

            string? hostsystem,

            string? memorySize,

            ImmutableArray<string> networks,

            string? password,

            string? pool,

            string? sshPassword,

            string? sshPort,

            string? sshUser,

            string? sshUserGroup,

            ImmutableArray<string> tags,

            string? username,

            string? vappIpAllocationPolicy,

            string? vappIpProtocol,

            ImmutableArray<string> vappProperties,

            string? vappTransport,

            string? vcenter,

            string? vcenterPort)
        {
            Boot2dockerUrl = boot2dockerUrl;
            Cfgparams = cfgparams;
            CloneFrom = cloneFrom;
            CloudConfig = cloudConfig;
            Cloudinit = cloudinit;
            ContentLibrary = contentLibrary;
            CpuCount = cpuCount;
            CreationType = creationType;
            CustomAttributes = customAttributes;
            Datacenter = datacenter;
            Datastore = datastore;
            DatastoreCluster = datastoreCluster;
            DiskSize = diskSize;
            Folder = folder;
            Hostsystem = hostsystem;
            MemorySize = memorySize;
            Networks = networks;
            Password = password;
            Pool = pool;
            SshPassword = sshPassword;
            SshPort = sshPort;
            SshUser = sshUser;
            SshUserGroup = sshUserGroup;
            Tags = tags;
            Username = username;
            VappIpAllocationPolicy = vappIpAllocationPolicy;
            VappIpProtocol = vappIpProtocol;
            VappProperties = vappProperties;
            VappTransport = vappTransport;
            Vcenter = vcenter;
            VcenterPort = vcenterPort;
        }
    }
}
