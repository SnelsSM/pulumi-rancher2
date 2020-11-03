// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateOpenstackConfigGetArgs : Pulumi.ResourceArgs
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

        /// <summary>
        /// OpenStack application credential secret (string)
        /// </summary>
        [Input("applicationCredentialSecret")]
        public Input<string>? ApplicationCredentialSecret { get; set; }

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

        /// <summary>
        /// vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Private key content to use for SSH (string)
        /// </summary>
        [Input("privateKeyFile")]
        public Input<string>? PrivateKeyFile { get; set; }

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
        /// If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

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
        /// vSphere username. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public NodeTemplateOpenstackConfigGetArgs()
        {
        }
    }
}
