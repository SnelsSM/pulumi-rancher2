// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class MachineConfigV2OpenstackConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OpenStack active timeout Default `200` (string)
        /// </summary>
        [Input("activeTimeout")]
        public Input<string>? ActiveTimeout { get; set; }

        /// <summary>
        /// OpenStack application credential id. Conflicts with `application_credential_name` (string)
        /// </summary>
        [Input("applicationCredentialId")]
        public Input<string>? ApplicationCredentialId { get; set; }

        /// <summary>
        /// OpenStack application credential name. Conflicts with `application_credential_id` (string)
        /// </summary>
        [Input("applicationCredentialName")]
        public Input<string>? ApplicationCredentialName { get; set; }

        [Input("applicationCredentialSecret")]
        private Input<string>? _applicationCredentialSecret;

        /// <summary>
        /// OpenStack application credential secret (string)
        /// </summary>
        public Input<string>? ApplicationCredentialSecret
        {
            get => _applicationCredentialSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _applicationCredentialSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// OpenStack authentication URL (string)
        /// </summary>
        [Input("authUrl", required: true)]
        public Input<string> AuthUrl { get; set; } = null!;

        /// <summary>
        /// OpenStack availability zone (string)
        /// </summary>
        [Input("availabilityZone", required: true)]
        public Input<string> AvailabilityZone { get; set; } = null!;

        /// <summary>
        /// Enable booting from volume. Default is `false` (bool)
        /// </summary>
        [Input("bootFromVolume")]
        public Input<bool>? BootFromVolume { get; set; }

        /// <summary>
        /// CA certificate bundle to verify against (string)
        /// </summary>
        [Input("cacert")]
        public Input<string>? Cacert { get; set; }

        /// <summary>
        /// Enables the OpenStack config drive for the instance. Default `false` (bool)
        /// </summary>
        [Input("configDrive")]
        public Input<bool>? ConfigDrive { get; set; }

        /// <summary>
        /// OpenStack domain ID. Identity v3 only. Conflicts with `domain_name` (string)
        /// </summary>
        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        /// <summary>
        /// OpenStack domain name. Identity v3 only. Conflicts with `domain_id` (string)
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// OpenStack endpoint type. adminURL, internalURL or publicURL (string)
        /// </summary>
        [Input("endpointType")]
        public Input<string>? EndpointType { get; set; }

        /// <summary>
        /// OpenStack flavor id to use for the instance. Conflicts with `flavor_name` (string)
        /// </summary>
        [Input("flavorId")]
        public Input<string>? FlavorId { get; set; }

        /// <summary>
        /// OpenStack flavor name to use for the instance. Conflicts with `flavor_id` (string)
        /// </summary>
        [Input("flavorName")]
        public Input<string>? FlavorName { get; set; }

        /// <summary>
        /// OpenStack floating IP pool to get an IP from to assign to the instance (string)
        /// </summary>
        [Input("floatingIpPool")]
        public Input<string>? FloatingIpPool { get; set; }

        /// <summary>
        /// OpenStack image id to use for the instance. Conflicts with `image_name` (string)
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// OpenStack image name to use for the instance. Conflicts with `image_id` (string)
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// Disable TLS credential checking. Default `false` (bool)
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// OpenStack version of IP address assigned for the machine Default `4` (string)
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// OpenStack keypair to use to SSH to the instance (string)
        /// </summary>
        [Input("keypairName")]
        public Input<string>? KeypairName { get; set; }

        /// <summary>
        /// OpenStack network id the machine will be connected on. Conflicts with `net_name` (string)
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// OpenStack network name the machine will be connected on. Conflicts with `net_id` (string)
        /// </summary>
        [Input("netName")]
        public Input<string>? NetName { get; set; }

        /// <summary>
        /// Use the nova networking services instead of neutron (string)
        /// </summary>
        [Input("novaNetwork")]
        public Input<bool>? NovaNetwork { get; set; }

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

        [Input("privateKeyFile")]
        private Input<string>? _privateKeyFile;

        /// <summary>
        /// Private key content to use for SSH (string)
        /// </summary>
        public Input<string>? PrivateKeyFile
        {
            get => _privateKeyFile;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyFile = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// OpenStack comma separated security groups for the machine (string)
        /// </summary>
        [Input("secGroups")]
        public Input<string>? SecGroups { get; set; }

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
        /// OpenStack tenant domain id. Conflicts with `tenant_domain_name` (string)
        /// </summary>
        [Input("tenantDomainId")]
        public Input<string>? TenantDomainId { get; set; }

        /// <summary>
        /// OpenStack tenant domain name. Conflicts with `tenant_domain_id` (string)
        /// </summary>
        [Input("tenantDomainName")]
        public Input<string>? TenantDomainName { get; set; }

        /// <summary>
        /// OpenStack tenant id. Conflicts with `tenant_name` (string)
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// OpenStack tenant name. Conflicts with `tenant_id` (string)
        /// </summary>
        [Input("tenantName")]
        public Input<string>? TenantName { get; set; }

        /// <summary>
        /// File containing an openstack userdata script (string)
        /// </summary>
        [Input("userDataFile")]
        public Input<string>? UserDataFile { get; set; }

        /// <summary>
        /// OpenStack user domain id. Conflicts with `user_domain_name` (string)
        /// </summary>
        [Input("userDomainId")]
        public Input<string>? UserDomainId { get; set; }

        /// <summary>
        /// OpenStack user domain name. Conflicts with `user_domain_id` (string)
        /// </summary>
        [Input("userDomainName")]
        public Input<string>? UserDomainName { get; set; }

        /// <summary>
        /// OpenStack username (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// OpenStack volume device path (attaching). Applicable only when `boot_from_volume` is `true`. Omit for auto `/dev/vdb`. (string)
        /// &gt; **Note:**: `Required+` denotes that either the _name or _id is required but you cannot use both.
        /// &gt; **Note:**: `Required++` denotes that either the _name or _id is required unless `application_credential_id` is defined.
        /// </summary>
        [Input("volumeDevicePath")]
        public Input<string>? VolumeDevicePath { get; set; }

        /// <summary>
        /// OpenStack volume id of existing volume. Applicable only when `boot_from_volume` is `true` (string)
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// OpenStack volume name of existing volume. Applicable only when `boot_from_volume` is `true` (string)
        /// </summary>
        [Input("volumeName")]
        public Input<string>? VolumeName { get; set; }

        /// <summary>
        /// OpenStack volume size (GiB). Required when `boot_from_volume` is `true` (string)
        /// </summary>
        [Input("volumeSize")]
        public Input<string>? VolumeSize { get; set; }

        /// <summary>
        /// OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public MachineConfigV2OpenstackConfigArgs()
        {
        }
        public static new MachineConfigV2OpenstackConfigArgs Empty => new MachineConfigV2OpenstackConfigArgs();
    }
}
