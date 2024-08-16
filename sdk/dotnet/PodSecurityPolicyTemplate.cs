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
    /// Provides a Rancher v2 PodSecurityPolicyTemplate resource. This can be used to create PodSecurityPolicyTemplates for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// PodSecurityPolicyTemplate can be imported using the Rancher PodSecurityPolicyTemplate Name
    /// 
    /// ```sh
    /// $ pulumi import rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate foo &amp;lt;pod_security_policy_name&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate")]
    public partial class PodSecurityPolicyTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// = (Optional)
        /// </summary>
        [Output("allowPrivilegeEscalation")]
        public Output<bool> AllowPrivilegeEscalation { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedCapabilities")]
        public Output<ImmutableArray<string>> AllowedCapabilities { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedCsiDrivers")]
        public Output<ImmutableArray<Outputs.PodSecurityPolicyTemplateAllowedCsiDriver>> AllowedCsiDrivers { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedFlexVolumes")]
        public Output<ImmutableArray<Outputs.PodSecurityPolicyTemplateAllowedFlexVolume>> AllowedFlexVolumes { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedHostPaths")]
        public Output<ImmutableArray<Outputs.PodSecurityPolicyTemplateAllowedHostPath>> AllowedHostPaths { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedProcMountTypes")]
        public Output<ImmutableArray<string>> AllowedProcMountTypes { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("allowedUnsafeSysctls")]
        public Output<ImmutableArray<string>> AllowedUnsafeSysctls { get; private set; } = null!;

        /// <summary>
        /// Annotations for PodSecurityPolicyTemplate object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("defaultAddCapabilities")]
        public Output<ImmutableArray<string>> DefaultAddCapabilities { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("defaultAllowPrivilegeEscalation")]
        public Output<bool?> DefaultAllowPrivilegeEscalation { get; private set; } = null!;

        /// <summary>
        /// The PodSecurityPolicyTemplate description (string)
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("forbiddenSysctls")]
        public Output<ImmutableArray<string>> ForbiddenSysctls { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("fsGroup")]
        public Output<Outputs.PodSecurityPolicyTemplateFsGroup> FsGroup { get; private set; } = null!;

        /// <summary>
        /// (bool)
        /// </summary>
        [Output("hostIpc")]
        public Output<bool> HostIpc { get; private set; } = null!;

        /// <summary>
        /// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        /// </summary>
        [Output("hostNetwork")]
        public Output<bool> HostNetwork { get; private set; } = null!;

        /// <summary>
        /// (bool)
        /// </summary>
        [Output("hostPid")]
        public Output<bool> HostPid { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("hostPorts")]
        public Output<ImmutableArray<Outputs.PodSecurityPolicyTemplateHostPort>> HostPorts { get; private set; } = null!;

        /// <summary>
        /// Labels for PodSecurityPolicyTemplate object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the PodSecurityPolicyTemplate (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (bool)
        /// </summary>
        [Output("privileged")]
        public Output<bool> Privileged { get; private set; } = null!;

        /// <summary>
        /// (bool)
        /// </summary>
        [Output("readOnlyRootFilesystem")]
        public Output<bool> ReadOnlyRootFilesystem { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("requiredDropCapabilities")]
        public Output<ImmutableArray<string>> RequiredDropCapabilities { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("runAsGroup")]
        public Output<Outputs.PodSecurityPolicyTemplateRunAsGroup?> RunAsGroup { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("runAsUser")]
        public Output<Outputs.PodSecurityPolicyTemplateRunAsUser> RunAsUser { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("runtimeClass")]
        public Output<Outputs.PodSecurityPolicyTemplateRuntimeClass?> RuntimeClass { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("seLinux")]
        public Output<Outputs.PodSecurityPolicyTemplateSeLinux> SeLinux { get; private set; } = null!;

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Output("supplementalGroup")]
        public Output<Outputs.PodSecurityPolicyTemplateSupplementalGroup> SupplementalGroup { get; private set; } = null!;

        /// <summary>
        /// (list)
        /// </summary>
        [Output("volumes")]
        public Output<ImmutableArray<string>> Volumes { get; private set; } = null!;


        /// <summary>
        /// Create a PodSecurityPolicyTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PodSecurityPolicyTemplate(string name, PodSecurityPolicyTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate", name, args ?? new PodSecurityPolicyTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PodSecurityPolicyTemplate(string name, Input<string> id, PodSecurityPolicyTemplateState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PodSecurityPolicyTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PodSecurityPolicyTemplate Get(string name, Input<string> id, PodSecurityPolicyTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new PodSecurityPolicyTemplate(name, id, state, options);
        }
    }

    public sealed class PodSecurityPolicyTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// = (Optional)
        /// </summary>
        [Input("allowPrivilegeEscalation")]
        public Input<bool>? AllowPrivilegeEscalation { get; set; }

        [Input("allowedCapabilities")]
        private InputList<string>? _allowedCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedCapabilities
        {
            get => _allowedCapabilities ?? (_allowedCapabilities = new InputList<string>());
            set => _allowedCapabilities = value;
        }

        [Input("allowedCsiDrivers")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverArgs>? _allowedCsiDrivers;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverArgs> AllowedCsiDrivers
        {
            get => _allowedCsiDrivers ?? (_allowedCsiDrivers = new InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverArgs>());
            set => _allowedCsiDrivers = value;
        }

        [Input("allowedFlexVolumes")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeArgs>? _allowedFlexVolumes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeArgs> AllowedFlexVolumes
        {
            get => _allowedFlexVolumes ?? (_allowedFlexVolumes = new InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeArgs>());
            set => _allowedFlexVolumes = value;
        }

        [Input("allowedHostPaths")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathArgs>? _allowedHostPaths;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathArgs> AllowedHostPaths
        {
            get => _allowedHostPaths ?? (_allowedHostPaths = new InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathArgs>());
            set => _allowedHostPaths = value;
        }

        [Input("allowedProcMountTypes")]
        private InputList<string>? _allowedProcMountTypes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedProcMountTypes
        {
            get => _allowedProcMountTypes ?? (_allowedProcMountTypes = new InputList<string>());
            set => _allowedProcMountTypes = value;
        }

        [Input("allowedUnsafeSysctls")]
        private InputList<string>? _allowedUnsafeSysctls;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedUnsafeSysctls
        {
            get => _allowedUnsafeSysctls ?? (_allowedUnsafeSysctls = new InputList<string>());
            set => _allowedUnsafeSysctls = value;
        }

        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for PodSecurityPolicyTemplate object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("defaultAddCapabilities")]
        private InputList<string>? _defaultAddCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> DefaultAddCapabilities
        {
            get => _defaultAddCapabilities ?? (_defaultAddCapabilities = new InputList<string>());
            set => _defaultAddCapabilities = value;
        }

        /// <summary>
        /// (list)
        /// </summary>
        [Input("defaultAllowPrivilegeEscalation")]
        public Input<bool>? DefaultAllowPrivilegeEscalation { get; set; }

        /// <summary>
        /// The PodSecurityPolicyTemplate description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("forbiddenSysctls")]
        private InputList<string>? _forbiddenSysctls;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> ForbiddenSysctls
        {
            get => _forbiddenSysctls ?? (_forbiddenSysctls = new InputList<string>());
            set => _forbiddenSysctls = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("fsGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateFsGroupArgs>? FsGroup { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("hostIpc")]
        public Input<bool>? HostIpc { get; set; }

        /// <summary>
        /// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        /// </summary>
        [Input("hostNetwork")]
        public Input<bool>? HostNetwork { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("hostPid")]
        public Input<bool>? HostPid { get; set; }

        [Input("hostPorts")]
        private InputList<Inputs.PodSecurityPolicyTemplateHostPortArgs>? _hostPorts;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateHostPortArgs> HostPorts
        {
            get => _hostPorts ?? (_hostPorts = new InputList<Inputs.PodSecurityPolicyTemplateHostPortArgs>());
            set => _hostPorts = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for PodSecurityPolicyTemplate object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the PodSecurityPolicyTemplate (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("privileged")]
        public Input<bool>? Privileged { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("readOnlyRootFilesystem")]
        public Input<bool>? ReadOnlyRootFilesystem { get; set; }

        [Input("requiredDropCapabilities")]
        private InputList<string>? _requiredDropCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> RequiredDropCapabilities
        {
            get => _requiredDropCapabilities ?? (_requiredDropCapabilities = new InputList<string>());
            set => _requiredDropCapabilities = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runAsGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateRunAsGroupArgs>? RunAsGroup { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runAsUser")]
        public Input<Inputs.PodSecurityPolicyTemplateRunAsUserArgs>? RunAsUser { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runtimeClass")]
        public Input<Inputs.PodSecurityPolicyTemplateRuntimeClassArgs>? RuntimeClass { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("seLinux")]
        public Input<Inputs.PodSecurityPolicyTemplateSeLinuxArgs>? SeLinux { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("supplementalGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateSupplementalGroupArgs>? SupplementalGroup { get; set; }

        [Input("volumes")]
        private InputList<string>? _volumes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<string>());
            set => _volumes = value;
        }

        public PodSecurityPolicyTemplateArgs()
        {
        }
        public static new PodSecurityPolicyTemplateArgs Empty => new PodSecurityPolicyTemplateArgs();
    }

    public sealed class PodSecurityPolicyTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// = (Optional)
        /// </summary>
        [Input("allowPrivilegeEscalation")]
        public Input<bool>? AllowPrivilegeEscalation { get; set; }

        [Input("allowedCapabilities")]
        private InputList<string>? _allowedCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedCapabilities
        {
            get => _allowedCapabilities ?? (_allowedCapabilities = new InputList<string>());
            set => _allowedCapabilities = value;
        }

        [Input("allowedCsiDrivers")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverGetArgs>? _allowedCsiDrivers;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverGetArgs> AllowedCsiDrivers
        {
            get => _allowedCsiDrivers ?? (_allowedCsiDrivers = new InputList<Inputs.PodSecurityPolicyTemplateAllowedCsiDriverGetArgs>());
            set => _allowedCsiDrivers = value;
        }

        [Input("allowedFlexVolumes")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeGetArgs>? _allowedFlexVolumes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeGetArgs> AllowedFlexVolumes
        {
            get => _allowedFlexVolumes ?? (_allowedFlexVolumes = new InputList<Inputs.PodSecurityPolicyTemplateAllowedFlexVolumeGetArgs>());
            set => _allowedFlexVolumes = value;
        }

        [Input("allowedHostPaths")]
        private InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathGetArgs>? _allowedHostPaths;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathGetArgs> AllowedHostPaths
        {
            get => _allowedHostPaths ?? (_allowedHostPaths = new InputList<Inputs.PodSecurityPolicyTemplateAllowedHostPathGetArgs>());
            set => _allowedHostPaths = value;
        }

        [Input("allowedProcMountTypes")]
        private InputList<string>? _allowedProcMountTypes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedProcMountTypes
        {
            get => _allowedProcMountTypes ?? (_allowedProcMountTypes = new InputList<string>());
            set => _allowedProcMountTypes = value;
        }

        [Input("allowedUnsafeSysctls")]
        private InputList<string>? _allowedUnsafeSysctls;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> AllowedUnsafeSysctls
        {
            get => _allowedUnsafeSysctls ?? (_allowedUnsafeSysctls = new InputList<string>());
            set => _allowedUnsafeSysctls = value;
        }

        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations for PodSecurityPolicyTemplate object (map)
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("defaultAddCapabilities")]
        private InputList<string>? _defaultAddCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> DefaultAddCapabilities
        {
            get => _defaultAddCapabilities ?? (_defaultAddCapabilities = new InputList<string>());
            set => _defaultAddCapabilities = value;
        }

        /// <summary>
        /// (list)
        /// </summary>
        [Input("defaultAllowPrivilegeEscalation")]
        public Input<bool>? DefaultAllowPrivilegeEscalation { get; set; }

        /// <summary>
        /// The PodSecurityPolicyTemplate description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("forbiddenSysctls")]
        private InputList<string>? _forbiddenSysctls;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> ForbiddenSysctls
        {
            get => _forbiddenSysctls ?? (_forbiddenSysctls = new InputList<string>());
            set => _forbiddenSysctls = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("fsGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateFsGroupGetArgs>? FsGroup { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("hostIpc")]
        public Input<bool>? HostIpc { get; set; }

        /// <summary>
        /// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        /// </summary>
        [Input("hostNetwork")]
        public Input<bool>? HostNetwork { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("hostPid")]
        public Input<bool>? HostPid { get; set; }

        [Input("hostPorts")]
        private InputList<Inputs.PodSecurityPolicyTemplateHostPortGetArgs>? _hostPorts;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<Inputs.PodSecurityPolicyTemplateHostPortGetArgs> HostPorts
        {
            get => _hostPorts ?? (_hostPorts = new InputList<Inputs.PodSecurityPolicyTemplateHostPortGetArgs>());
            set => _hostPorts = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for PodSecurityPolicyTemplate object (map)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the PodSecurityPolicyTemplate (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("privileged")]
        public Input<bool>? Privileged { get; set; }

        /// <summary>
        /// (bool)
        /// </summary>
        [Input("readOnlyRootFilesystem")]
        public Input<bool>? ReadOnlyRootFilesystem { get; set; }

        [Input("requiredDropCapabilities")]
        private InputList<string>? _requiredDropCapabilities;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> RequiredDropCapabilities
        {
            get => _requiredDropCapabilities ?? (_requiredDropCapabilities = new InputList<string>());
            set => _requiredDropCapabilities = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runAsGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateRunAsGroupGetArgs>? RunAsGroup { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runAsUser")]
        public Input<Inputs.PodSecurityPolicyTemplateRunAsUserGetArgs>? RunAsUser { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("runtimeClass")]
        public Input<Inputs.PodSecurityPolicyTemplateRuntimeClassGetArgs>? RuntimeClass { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("seLinux")]
        public Input<Inputs.PodSecurityPolicyTemplateSeLinuxGetArgs>? SeLinux { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("supplementalGroup")]
        public Input<Inputs.PodSecurityPolicyTemplateSupplementalGroupGetArgs>? SupplementalGroup { get; set; }

        [Input("volumes")]
        private InputList<string>? _volumes;

        /// <summary>
        /// (list)
        /// </summary>
        public InputList<string> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<string>());
            set => _volumes = value;
        }

        public PodSecurityPolicyTemplateState()
        {
        }
        public static new PodSecurityPolicyTemplateState Empty => new PodSecurityPolicyTemplateState();
    }
}
