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
    public sealed class NodeTemplateOpenstackConfig
    {
        /// <summary>
        /// OpenStack active timeout Default `200` (string)
        /// </summary>
        public readonly string? ActiveTimeout;
        /// <summary>
        /// OpenStack authentication URL (string)
        /// </summary>
        public readonly string AuthUrl;
        /// <summary>
        /// OpenStack availability zone (string)
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// CA certificate bundle to verify against (string)
        /// </summary>
        public readonly string? Cacert;
        /// <summary>
        /// Enables the OpenStack config drive for the instance. Default `false` (bool)
        /// </summary>
        public readonly bool? ConfigDrive;
        /// <summary>
        /// OpenStack domain ID. Identity v3 only. Conflicts with `domain_name` (string)
        /// </summary>
        public readonly string? DomainId;
        /// <summary>
        /// OpenStack domain name. Identity v3 only. Conflicts with `domain_id` (string)
        /// </summary>
        public readonly string? DomainName;
        /// <summary>
        /// OpenStack endpoint type. adminURL, internalURL or publicURL (string)
        /// </summary>
        public readonly string? EndpointType;
        /// <summary>
        /// OpenStack flavor id to use for the instance. Conflicts with `flavor_name` (string)
        /// </summary>
        public readonly string? FlavorId;
        /// <summary>
        /// OpenStack flavor name to use for the instance. Conflicts with `flavor_id` (string)
        /// </summary>
        public readonly string? FlavorName;
        /// <summary>
        /// OpenStack floating IP pool to get an IP from to assign to the instance (string)
        /// </summary>
        public readonly string? FloatingIpPool;
        /// <summary>
        /// OpenStack image id to use for the instance. Conflicts with `image_name` (string)
        /// </summary>
        public readonly string? ImageId;
        /// <summary>
        /// OpenStack image name to use for the instance. Conflicts with `image_id` (string)
        /// </summary>
        public readonly string? ImageName;
        /// <summary>
        /// Disable TLS credential checking. Default `false` (bool)
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// OpenStack version of IP address assigned for the machine Default `4` (string)
        /// </summary>
        public readonly string? IpVersion;
        /// <summary>
        /// OpenStack keypair to use to SSH to the instance (string)
        /// </summary>
        public readonly string? KeypairName;
        /// <summary>
        /// OpenStack network id the machine will be connected on. Conflicts with `net_name` (string)
        /// </summary>
        public readonly string? NetId;
        /// <summary>
        /// OpenStack network name the machine will be connected on. Conflicts with `net_id` (string)
        /// </summary>
        public readonly string? NetName;
        /// <summary>
        /// Use the nova networking services instead of neutron (string)
        /// </summary>
        public readonly bool? NovaNetwork;
        /// <summary>
        /// vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Private key content to use for SSH (string)
        /// </summary>
        public readonly string? PrivateKeyFile;
        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// OpenStack comma separated security groups for the machine (string)
        /// </summary>
        public readonly string? SecGroups;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshPort;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// OpenStack tenant id. Conflicts with `tenant_name` (string)
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// OpenStack tenant name. Conflicts with `tenant_id` (string)
        /// </summary>
        public readonly string? TenantName;
        /// <summary>
        /// File containing an openstack userdata script (string)
        /// </summary>
        public readonly string? UserDataFile;
        /// <summary>
        /// vSphere username. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private NodeTemplateOpenstackConfig(
            string? activeTimeout,

            string authUrl,

            string availabilityZone,

            string? cacert,

            bool? configDrive,

            string? domainId,

            string? domainName,

            string? endpointType,

            string? flavorId,

            string? flavorName,

            string? floatingIpPool,

            string? imageId,

            string? imageName,

            bool? insecure,

            string? ipVersion,

            string? keypairName,

            string? netId,

            string? netName,

            bool? novaNetwork,

            string? password,

            string? privateKeyFile,

            string region,

            string? secGroups,

            string? sshPort,

            string? sshUser,

            string? tenantId,

            string? tenantName,

            string? userDataFile,

            string username)
        {
            ActiveTimeout = activeTimeout;
            AuthUrl = authUrl;
            AvailabilityZone = availabilityZone;
            Cacert = cacert;
            ConfigDrive = configDrive;
            DomainId = domainId;
            DomainName = domainName;
            EndpointType = endpointType;
            FlavorId = flavorId;
            FlavorName = flavorName;
            FloatingIpPool = floatingIpPool;
            ImageId = imageId;
            ImageName = imageName;
            Insecure = insecure;
            IpVersion = ipVersion;
            KeypairName = keypairName;
            NetId = netId;
            NetName = netName;
            NovaNetwork = novaNetwork;
            Password = password;
            PrivateKeyFile = privateKeyFile;
            Region = region;
            SecGroups = secGroups;
            SshPort = sshPort;
            SshUser = sshUser;
            TenantId = tenantId;
            TenantName = tenantName;
            UserDataFile = userDataFile;
            Username = username;
        }
    }
}
