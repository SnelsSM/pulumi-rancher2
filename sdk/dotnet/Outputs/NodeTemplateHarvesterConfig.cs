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
        /// vSphere CPU number for docker VM. Default `2` (string)
        /// </summary>
        public readonly string? CpuCount;
        /// <summary>
        /// Disk bus, Default `virtio` (string)
        /// </summary>
        public readonly string? DiskBus;
        /// <summary>
        /// vSphere size of disk for docker VM (in MB). Default `20480` (string)
        /// </summary>
        public readonly string? DiskSize;
        /// <summary>
        /// OpenStack image name to use for the instance. Conflicts with `image_id` (string)
        /// </summary>
        public readonly string ImageName;
        /// <summary>
        /// vSphere size of memory for docker VM (in MB). Default `2048` (string)
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
        /// Opennebula network to connect the machine to. Conflicts with `network_id` (string)
        /// </summary>
        public readonly string NetworkName;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshPassword;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
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
