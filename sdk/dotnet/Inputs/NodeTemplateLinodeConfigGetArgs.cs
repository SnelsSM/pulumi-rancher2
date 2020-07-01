// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateLinodeConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node. (string)
        /// </summary>
        [Input("authorizedUsers")]
        public Input<string>? AuthorizedUsers { get; set; }

        /// <summary>
        /// Create private IP for the instance. Default `false` (bool)
        /// </summary>
        [Input("createPrivateIp")]
        public Input<bool>? CreatePrivateIp { get; set; }

        /// <summary>
        /// Docker Port. Default `2376` (string)
        /// </summary>
        [Input("dockerPort")]
        public Input<string>? DockerPort { get; set; }

        /// <summary>
        /// Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Linode Instance Label. (string)
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Root Password (string)
        /// </summary>
        [Input("rootPass")]
        public Input<string>? RootPass { get; set; }

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
        /// Specifies the Linode StackScript to use to create the instance. (string)
        /// </summary>
        [Input("stackscript")]
        public Input<string>? Stackscript { get; set; }

        /// <summary>
        /// A JSON string specifying data for the selected StackScript. (string)
        /// </summary>
        [Input("stackscriptData")]
        public Input<string>? StackscriptData { get; set; }

        /// <summary>
        /// Linode Instance Swap Size (MB). Default `512` (string)
        /// </summary>
        [Input("swapSize")]
        public Input<string>? SwapSize { get; set; }

        /// <summary>
        /// vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Linode API token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        /// <summary>
        /// Prefix the User-Agent in Linode API calls with some 'product/version' (string)
        /// </summary>
        [Input("uaPrefix")]
        public Input<string>? UaPrefix { get; set; }

        public NodeTemplateLinodeConfigGetArgs()
        {
        }
    }
}
