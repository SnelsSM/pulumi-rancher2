// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Cloud Credential resource. This can be used to create Cloud Credential for Rancher v2.2.x and retrieve their information.
    /// 
    /// amazonec2, azure, digitalocean, linode, openstack and vsphere credentials config are supported for Cloud Credential.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Cloud Credential
    ///         var foo = new Rancher2.CloudCredential("foo", new Rancher2.CloudCredentialArgs
    ///         {
    ///             Amazonec2CredentialConfig = new Rancher2.Inputs.CloudCredentialAmazonec2CredentialConfigArgs
    ///             {
    ///                 AccessKey = "&lt;AWS_ACCESS_KEY&gt;",
    ///                 SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///             },
    ///             Description = "foo test",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/cloudCredential:CloudCredential")]
    public partial class CloudCredential : Pulumi.CustomResource
    {
        /// <summary>
        /// AWS config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("amazonec2CredentialConfig")]
        public Output<Outputs.CloudCredentialAmazonec2CredentialConfig?> Amazonec2CredentialConfig { get; private set; } = null!;

        /// <summary>
        /// Annotations for Cloud Credential object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Azure config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("azureCredentialConfig")]
        public Output<Outputs.CloudCredentialAzureCredentialConfig?> AzureCredentialConfig { get; private set; } = null!;

        /// <summary>
        /// Description for the Cloud Credential (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// DigitalOcean config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("digitaloceanCredentialConfig")]
        public Output<Outputs.CloudCredentialDigitaloceanCredentialConfig?> DigitaloceanCredentialConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The driver of the Cloud Credential (string)
        /// </summary>
        [Output("driver")]
        public Output<string> Driver { get; private set; } = null!;

        /// <summary>
        /// Google config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("googleCredentialConfig")]
        public Output<Outputs.CloudCredentialGoogleCredentialConfig?> GoogleCredentialConfig { get; private set; } = null!;

        /// <summary>
        /// Labels for Cloud Credential object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Linode config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("linodeCredentialConfig")]
        public Output<Outputs.CloudCredentialLinodeCredentialConfig?> LinodeCredentialConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the Cloud Credential (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// OpenStack config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("openstackCredentialConfig")]
        public Output<Outputs.CloudCredentialOpenstackCredentialConfig?> OpenstackCredentialConfig { get; private set; } = null!;

        /// <summary>
        /// vSphere config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Output("vsphereCredentialConfig")]
        public Output<Outputs.CloudCredentialVsphereCredentialConfig?> VsphereCredentialConfig { get; private set; } = null!;


        /// <summary>
        /// Create a CloudCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudCredential(string name, CloudCredentialArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/cloudCredential:CloudCredential", name, args ?? new CloudCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudCredential(string name, Input<string> id, CloudCredentialState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/cloudCredential:CloudCredential", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CloudCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudCredential Get(string name, Input<string> id, CloudCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudCredential(name, id, state, options);
        }
    }

    public sealed class CloudCredentialArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("amazonec2CredentialConfig")]
        public Input<Inputs.CloudCredentialAmazonec2CredentialConfigArgs>? Amazonec2CredentialConfig { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Cloud Credential object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Azure config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("azureCredentialConfig")]
        public Input<Inputs.CloudCredentialAzureCredentialConfigArgs>? AzureCredentialConfig { get; set; }

        /// <summary>
        /// Description for the Cloud Credential (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// DigitalOcean config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("digitaloceanCredentialConfig")]
        public Input<Inputs.CloudCredentialDigitaloceanCredentialConfigArgs>? DigitaloceanCredentialConfig { get; set; }

        /// <summary>
        /// Google config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("googleCredentialConfig")]
        public Input<Inputs.CloudCredentialGoogleCredentialConfigArgs>? GoogleCredentialConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Cloud Credential object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("linodeCredentialConfig")]
        public Input<Inputs.CloudCredentialLinodeCredentialConfigArgs>? LinodeCredentialConfig { get; set; }

        /// <summary>
        /// The name of the Cloud Credential (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// OpenStack config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("openstackCredentialConfig")]
        public Input<Inputs.CloudCredentialOpenstackCredentialConfigArgs>? OpenstackCredentialConfig { get; set; }

        /// <summary>
        /// vSphere config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("vsphereCredentialConfig")]
        public Input<Inputs.CloudCredentialVsphereCredentialConfigArgs>? VsphereCredentialConfig { get; set; }

        public CloudCredentialArgs()
        {
        }
    }

    public sealed class CloudCredentialState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("amazonec2CredentialConfig")]
        public Input<Inputs.CloudCredentialAmazonec2CredentialConfigGetArgs>? Amazonec2CredentialConfig { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Cloud Credential object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Azure config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("azureCredentialConfig")]
        public Input<Inputs.CloudCredentialAzureCredentialConfigGetArgs>? AzureCredentialConfig { get; set; }

        /// <summary>
        /// Description for the Cloud Credential (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// DigitalOcean config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("digitaloceanCredentialConfig")]
        public Input<Inputs.CloudCredentialDigitaloceanCredentialConfigGetArgs>? DigitaloceanCredentialConfig { get; set; }

        /// <summary>
        /// (Computed) The driver of the Cloud Credential (string)
        /// </summary>
        [Input("driver")]
        public Input<string>? Driver { get; set; }

        /// <summary>
        /// Google config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("googleCredentialConfig")]
        public Input<Inputs.CloudCredentialGoogleCredentialConfigGetArgs>? GoogleCredentialConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Cloud Credential object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("linodeCredentialConfig")]
        public Input<Inputs.CloudCredentialLinodeCredentialConfigGetArgs>? LinodeCredentialConfig { get; set; }

        /// <summary>
        /// The name of the Cloud Credential (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// OpenStack config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("openstackCredentialConfig")]
        public Input<Inputs.CloudCredentialOpenstackCredentialConfigGetArgs>? OpenstackCredentialConfig { get; set; }

        /// <summary>
        /// vSphere config for the Cloud Credential (list maxitems:1)
        /// </summary>
        [Input("vsphereCredentialConfig")]
        public Input<Inputs.CloudCredentialVsphereCredentialConfigGetArgs>? VsphereCredentialConfig { get; set; }

        public CloudCredentialState()
        {
        }
    }
}
