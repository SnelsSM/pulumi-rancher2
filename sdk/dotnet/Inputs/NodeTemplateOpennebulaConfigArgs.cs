// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateOpennebulaConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Size of the Volatile disk in MB - only for b2d (string)
        /// </summary>
        [Input("b2dSize")]
        public Input<string>? B2dSize { get; set; }

        /// <summary>
        /// CPU value for the VM (string)
        /// </summary>
        [Input("cpu")]
        public Input<string>? Cpu { get; set; }

        /// <summary>
        /// Dev prefix to use for the images. E.g.: 'vd', 'sd', 'hd' (string)
        /// </summary>
        [Input("devPrefix")]
        public Input<string>? DevPrefix { get; set; }

        /// <summary>
        /// VNC is enabled by default. Disable it with this flag (bool)
        /// </summary>
        [Input("disableVnc")]
        public Input<bool>? DisableVnc { get; set; }

        /// <summary>
        /// Size of the disk for the VM in MB (string)
        /// </summary>
        [Input("diskResize")]
        public Input<string>? DiskResize { get; set; }

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
        /// Owner of the image to use as the VM OS (string)
        /// </summary>
        [Input("imageOwner")]
        public Input<string>? ImageOwner { get; set; }

        /// <summary>
        /// Size of the memory for the VM in MB (string)
        /// </summary>
        [Input("memory")]
        public Input<string>? Memory { get; set; }

        /// <summary>
        /// Opennebula network ID to connect the machine to. Conflicts with `network_name` (string)
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Opennebula network to connect the machine to. Conflicts with `network_id` (string)
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        /// <summary>
        /// Opennebula user ID of the Network to connect the machine to (string)
        /// </summary>
        [Input("networkOwner")]
        public Input<string>? NetworkOwner { get; set; }

        /// <summary>
        /// vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// Opennebula template ID to use. Conflicts with `template_name` (string)
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        /// <summary>
        /// Name of the Opennbula template to use. Conflicts with `template_id` (string)
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        /// <summary>
        /// Set the user for the XML-RPC API authentication (string)
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        /// <summary>
        /// VCPUs for the VM (string)
        /// </summary>
        [Input("vcpu")]
        public Input<string>? Vcpu { get; set; }

        /// <summary>
        /// Set the url for the Opennebula XML-RPC API (string)
        /// </summary>
        [Input("xmlRpcUrl", required: true)]
        public Input<string> XmlRpcUrl { get; set; } = null!;

        public NodeTemplateOpennebulaConfigArgs()
        {
        }
    }
}
