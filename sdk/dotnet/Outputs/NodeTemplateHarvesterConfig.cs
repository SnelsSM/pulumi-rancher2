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
    public sealed class NodeTemplateHarvesterConfig
    {
        /// <summary>
        /// CPU count, Default `2` (string)
        /// </summary>
        public readonly string? CpuCount;
        /// <summary>
        /// Disk bus, Default `virtio` (string)
        /// </summary>
        public readonly string? DiskBus;
        /// <summary>
        /// Disk size if using managed disk. Just for Rancher v2.3.x and above. Default `30` (string)
        /// </summary>
        public readonly string? DiskSize;
        /// <summary>
        /// Image name e.g. `harvester-public/image-57hzg` (string)
        /// </summary>
        public readonly string ImageName;
        /// <summary>
        /// Memory size (in GiB), Default `4` (string)
        /// </summary>
        public readonly string? MemorySize;
        /// <summary>
        /// NetworkData content of cloud-init, base64 is supported (string)
        /// </summary>
        public readonly string? NetworkData;
        /// <summary>
        /// Network model, Default `virtio` (string)
        /// </summary>
        public readonly string? NetworkModel;
        /// <summary>
        /// Network name e.g. `harvester-public/vlan1` (string)
        /// </summary>
        public readonly string NetworkName;
        /// <summary>
        /// SSH password (string)
        /// </summary>
        public readonly string? SshPassword;
        /// <summary>
        /// Set the name of the ssh user (string)
        /// </summary>
        public readonly string SshUser;
        /// <summary>
        /// UserData content of cloud-init, base64 is supported (string)
        /// </summary>
        public readonly string? UserData;
        /// <summary>
        /// Virtual machine namespace e.g. `default` (string)
        /// </summary>
        public readonly string VmNamespace;

        [OutputConstructor]
        private NodeTemplateHarvesterConfig(
            string? cpuCount,

            string? diskBus,

            string? diskSize,

            string imageName,

            string? memorySize,

            string? networkData,

            string? networkModel,

            string networkName,

            string? sshPassword,

            string sshUser,

            string? userData,

            string vmNamespace)
        {
            CpuCount = cpuCount;
            DiskBus = diskBus;
            DiskSize = diskSize;
            ImageName = imageName;
            MemorySize = memorySize;
            NetworkData = networkData;
            NetworkModel = networkModel;
            NetworkName = networkName;
            SshPassword = sshPassword;
            SshUser = sshUser;
            UserData = userData;
            VmNamespace = vmNamespace;
        }
    }
}
