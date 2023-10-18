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
    public sealed class MachineConfigV2Amazonec2Config
    {
        public readonly string? AccessKey;
        /// <summary>
        /// AWS machine image (string)
        /// </summary>
        public readonly string Ami;
        /// <summary>
        /// AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
        /// </summary>
        public readonly string? BlockDurationMinutes;
        /// <summary>
        /// AWS root device name. Default `/dev/sda1` (string)
        /// </summary>
        public readonly string? DeviceName;
        /// <summary>
        /// Encrypt EBS volume. Default `false` (bool)
        /// </summary>
        public readonly bool? EncryptEbsVolume;
        /// <summary>
        /// Optional endpoint URL (hostname only or fully qualified URI) (string)
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// Enables or disables the HTTP metadata endpoint on your instances (string)
        /// </summary>
        public readonly string? HttpEndpoint;
        /// <summary>
        /// The state of token usage for your instance metadata requests (string)
        /// </summary>
        public readonly string? HttpTokens;
        /// <summary>
        /// AWS IAM Instance Profile (string)
        /// </summary>
        public readonly string? IamInstanceProfile;
        /// <summary>
        /// Disable SSL when sending requests (bool)
        /// </summary>
        public readonly bool? InsecureTransport;
        /// <summary>
        /// Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// Custom KMS key ID using the AWS Managed CMK (string)
        /// </summary>
        public readonly string? KmsKey;
        /// <summary>
        /// Enable monitoring for droplet. Default `false` (bool)
        /// </summary>
        public readonly bool? Monitoring;
        /// <summary>
        /// Make the specified port number accessible from the Internet. (list)
        /// </summary>
        public readonly ImmutableArray<string> OpenPorts;
        /// <summary>
        /// Only use a private IP address. Default `false` (bool)
        /// </summary>
        public readonly bool? PrivateAddressOnly;
        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Set this flag to request spot instance. Default `false` (bool)
        /// </summary>
        public readonly bool? RequestSpotInstance;
        /// <summary>
        /// Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
        /// </summary>
        public readonly string? Retries;
        /// <summary>
        /// AWS root disk size (in GB). Default `16` (string)
        /// </summary>
        public readonly string? RootSize;
        public readonly string? SecretKey;
        /// <summary>
        /// Skip adding default rules to security groups (bool)
        /// </summary>
        public readonly bool? SecurityGroupReadonly;
        /// <summary>
        /// AWS VPC security group. (list)
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// AWS Session Token (string)
        /// </summary>
        public readonly string? SessionToken;
        /// <summary>
        /// AWS spot instance bid price (in dollar). Default `0.50` (string)
        /// </summary>
        public readonly string? SpotPrice;
        /// <summary>
        /// SSH private key contents (string)
        /// </summary>
        public readonly string? SshKeyContents;
        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
        /// </summary>
        public readonly string? SshUser;
        /// <summary>
        /// AWS VPC subnet id (string)
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// vSphere tags id e.g. `urn:xxx` (list)
        /// </summary>
        public readonly string? Tags;
        /// <summary>
        /// Create an EBS optimized instance. Default `false` (bool)
        /// </summary>
        public readonly bool? UseEbsOptimizedInstance;
        /// <summary>
        /// Force the usage of private IP address. Default `false` (bool)
        /// </summary>
        public readonly bool? UsePrivateAddress;
        /// <summary>
        /// Path to file with cloud-init user-data (string)
        /// </summary>
        public readonly string? Userdata;
        /// <summary>
        /// OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
        /// </summary>
        public readonly string? VolumeType;
        /// <summary>
        /// AWS VPC id. (string)
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// AWS zone for instance (i.e. a,b,c,d,e) (string)
        /// </summary>
        public readonly string Zone;

        [OutputConstructor]
        private MachineConfigV2Amazonec2Config(
            string? accessKey,

            string ami,

            string? blockDurationMinutes,

            string? deviceName,

            bool? encryptEbsVolume,

            string? endpoint,

            string? httpEndpoint,

            string? httpTokens,

            string? iamInstanceProfile,

            bool? insecureTransport,

            string? instanceType,

            string? kmsKey,

            bool? monitoring,

            ImmutableArray<string> openPorts,

            bool? privateAddressOnly,

            string region,

            bool? requestSpotInstance,

            string? retries,

            string? rootSize,

            string? secretKey,

            bool? securityGroupReadonly,

            ImmutableArray<string> securityGroups,

            string? sessionToken,

            string? spotPrice,

            string? sshKeyContents,

            string? sshUser,

            string subnetId,

            string? tags,

            bool? useEbsOptimizedInstance,

            bool? usePrivateAddress,

            string? userdata,

            string? volumeType,

            string vpcId,

            string zone)
        {
            AccessKey = accessKey;
            Ami = ami;
            BlockDurationMinutes = blockDurationMinutes;
            DeviceName = deviceName;
            EncryptEbsVolume = encryptEbsVolume;
            Endpoint = endpoint;
            HttpEndpoint = httpEndpoint;
            HttpTokens = httpTokens;
            IamInstanceProfile = iamInstanceProfile;
            InsecureTransport = insecureTransport;
            InstanceType = instanceType;
            KmsKey = kmsKey;
            Monitoring = monitoring;
            OpenPorts = openPorts;
            PrivateAddressOnly = privateAddressOnly;
            Region = region;
            RequestSpotInstance = requestSpotInstance;
            Retries = retries;
            RootSize = rootSize;
            SecretKey = secretKey;
            SecurityGroupReadonly = securityGroupReadonly;
            SecurityGroups = securityGroups;
            SessionToken = sessionToken;
            SpotPrice = spotPrice;
            SshKeyContents = sshKeyContents;
            SshUser = sshUser;
            SubnetId = subnetId;
            Tags = tags;
            UseEbsOptimizedInstance = useEbsOptimizedInstance;
            UsePrivateAddress = usePrivateAddress;
            Userdata = userdata;
            VolumeType = volumeType;
            VpcId = vpcId;
            Zone = zone;
        }
    }
}
