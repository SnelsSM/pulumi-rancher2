// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class MachineConfigV2Amazonec2ConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        private Input<string>? _accessKey;
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// AWS machine image (string)
        /// </summary>
        [Input("ami", required: true)]
        public Input<string> Ami { get; set; } = null!;

        /// <summary>
        /// AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
        /// </summary>
        [Input("blockDurationMinutes")]
        public Input<string>? BlockDurationMinutes { get; set; }

        /// <summary>
        /// AWS root device name. Default `/dev/sda1` (string)
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// Encrypt EBS volume. Default `false` (bool)
        /// </summary>
        [Input("encryptEbsVolume")]
        public Input<bool>? EncryptEbsVolume { get; set; }

        /// <summary>
        /// Optional endpoint URL (hostname only or fully qualified URI) (string)
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Enables or disables the HTTP metadata endpoint on your instances (string)
        /// </summary>
        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        /// <summary>
        /// The state of token usage for your instance metadata requests (string)
        /// </summary>
        [Input("httpTokens")]
        public Input<string>? HttpTokens { get; set; }

        /// <summary>
        /// AWS IAM Instance Profile (string)
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// Disable SSL when sending requests (bool)
        /// </summary>
        [Input("insecureTransport")]
        public Input<bool>? InsecureTransport { get; set; }

        /// <summary>
        /// Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Custom KMS key ID using the AWS Managed CMK (string)
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// Enable monitoring for droplet. Default `false` (bool)
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        [Input("openPorts")]
        private InputList<string>? _openPorts;

        /// <summary>
        /// Make the specified port number accessible from the Internet. (list)
        /// </summary>
        public InputList<string> OpenPorts
        {
            get => _openPorts ?? (_openPorts = new InputList<string>());
            set => _openPorts = value;
        }

        /// <summary>
        /// Only use a private IP address. Default `false` (bool)
        /// </summary>
        [Input("privateAddressOnly")]
        public Input<bool>? PrivateAddressOnly { get; set; }

        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Set this flag to request spot instance. Default `false` (bool)
        /// </summary>
        [Input("requestSpotInstance")]
        public Input<bool>? RequestSpotInstance { get; set; }

        /// <summary>
        /// Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
        /// </summary>
        [Input("retries")]
        public Input<string>? Retries { get; set; }

        /// <summary>
        /// AWS root disk size (in GB). Default `16` (string)
        /// </summary>
        [Input("rootSize")]
        public Input<string>? RootSize { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Skip adding default rules to security groups (bool)
        /// </summary>
        [Input("securityGroupReadonly")]
        public Input<bool>? SecurityGroupReadonly { get; set; }

        [Input("securityGroups", required: true)]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// AWS VPC security group. (list)
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("sessionToken")]
        private Input<string>? _sessionToken;

        /// <summary>
        /// AWS Session Token (string)
        /// </summary>
        public Input<string>? SessionToken
        {
            get => _sessionToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sessionToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// AWS spot instance bid price (in dollar). Default `0.50` (string)
        /// </summary>
        [Input("spotPrice")]
        public Input<string>? SpotPrice { get; set; }

        [Input("sshKeyContents")]
        private Input<string>? _sshKeyContents;

        /// <summary>
        /// SSH private key contents (string)
        /// </summary>
        public Input<string>? SshKeyContents
        {
            get => _sshKeyContents;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKeyContents = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// AWS VPC subnet id (string)
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        /// <summary>
        /// vSphere tags id e.g. `urn:xxx` (list)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Create an EBS optimized instance. Default `false` (bool)
        /// </summary>
        [Input("useEbsOptimizedInstance")]
        public Input<bool>? UseEbsOptimizedInstance { get; set; }

        /// <summary>
        /// Force the usage of private IP address. Default `false` (bool)
        /// </summary>
        [Input("usePrivateAddress")]
        public Input<bool>? UsePrivateAddress { get; set; }

        /// <summary>
        /// Path to file with cloud-init user-data (string)
        /// </summary>
        [Input("userdata")]
        public Input<string>? Userdata { get; set; }

        /// <summary>
        /// OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        /// <summary>
        /// AWS VPC id. (string)
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// AWS zone for instance (i.e. a,b,c,d,e) (string)
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public MachineConfigV2Amazonec2ConfigArgs()
        {
        }
        public static new MachineConfigV2Amazonec2ConfigArgs Empty => new MachineConfigV2Amazonec2ConfigArgs();
    }
}
