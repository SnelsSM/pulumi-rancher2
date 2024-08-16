// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 PodSecurityPolicyTemplate resource. This can be used to create PodSecurityPolicyTemplates for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * PodSecurityPolicyTemplate can be imported using the Rancher PodSecurityPolicyTemplate Name
 *
 * ```sh
 * $ pulumi import rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate foo &lt;pod_security_policy_name&gt;
 * ```
 */
export class PodSecurityPolicyTemplate extends pulumi.CustomResource {
    /**
     * Get an existing PodSecurityPolicyTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PodSecurityPolicyTemplateState, opts?: pulumi.CustomResourceOptions): PodSecurityPolicyTemplate {
        return new PodSecurityPolicyTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate';

    /**
     * Returns true if the given object is an instance of PodSecurityPolicyTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PodSecurityPolicyTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PodSecurityPolicyTemplate.__pulumiType;
    }

    /**
     * = (Optional)
     */
    public readonly allowPrivilegeEscalation!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly allowedCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedCsiDrivers!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedCsiDriver[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedFlexVolumes!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedFlexVolume[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedHostPaths!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedHostPath[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedProcMountTypes!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedUnsafeSysctls!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * (list)
     */
    public readonly defaultAddCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly defaultAllowPrivilegeEscalation!: pulumi.Output<boolean | undefined>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * (list)
     */
    public readonly forbiddenSysctls!: pulumi.Output<string[] | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly fsGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    public readonly hostIpc!: pulumi.Output<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    public readonly hostNetwork!: pulumi.Output<boolean>;
    /**
     * (bool)
     */
    public readonly hostPid!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly hostPorts!: pulumi.Output<outputs.PodSecurityPolicyTemplateHostPort[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (bool)
     */
    public readonly privileged!: pulumi.Output<boolean>;
    /**
     * (bool)
     */
    public readonly readOnlyRootFilesystem!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly requiredDropCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly runAsGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateRunAsGroup | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly runAsUser!: pulumi.Output<outputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    public readonly runtimeClass!: pulumi.Output<outputs.PodSecurityPolicyTemplateRuntimeClass | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly seLinux!: pulumi.Output<outputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    public readonly supplementalGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    public readonly volumes!: pulumi.Output<string[]>;

    /**
     * Create a PodSecurityPolicyTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PodSecurityPolicyTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PodSecurityPolicyTemplateArgs | PodSecurityPolicyTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PodSecurityPolicyTemplateState | undefined;
            resourceInputs["allowPrivilegeEscalation"] = state ? state.allowPrivilegeEscalation : undefined;
            resourceInputs["allowedCapabilities"] = state ? state.allowedCapabilities : undefined;
            resourceInputs["allowedCsiDrivers"] = state ? state.allowedCsiDrivers : undefined;
            resourceInputs["allowedFlexVolumes"] = state ? state.allowedFlexVolumes : undefined;
            resourceInputs["allowedHostPaths"] = state ? state.allowedHostPaths : undefined;
            resourceInputs["allowedProcMountTypes"] = state ? state.allowedProcMountTypes : undefined;
            resourceInputs["allowedUnsafeSysctls"] = state ? state.allowedUnsafeSysctls : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["defaultAddCapabilities"] = state ? state.defaultAddCapabilities : undefined;
            resourceInputs["defaultAllowPrivilegeEscalation"] = state ? state.defaultAllowPrivilegeEscalation : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["forbiddenSysctls"] = state ? state.forbiddenSysctls : undefined;
            resourceInputs["fsGroup"] = state ? state.fsGroup : undefined;
            resourceInputs["hostIpc"] = state ? state.hostIpc : undefined;
            resourceInputs["hostNetwork"] = state ? state.hostNetwork : undefined;
            resourceInputs["hostPid"] = state ? state.hostPid : undefined;
            resourceInputs["hostPorts"] = state ? state.hostPorts : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["privileged"] = state ? state.privileged : undefined;
            resourceInputs["readOnlyRootFilesystem"] = state ? state.readOnlyRootFilesystem : undefined;
            resourceInputs["requiredDropCapabilities"] = state ? state.requiredDropCapabilities : undefined;
            resourceInputs["runAsGroup"] = state ? state.runAsGroup : undefined;
            resourceInputs["runAsUser"] = state ? state.runAsUser : undefined;
            resourceInputs["runtimeClass"] = state ? state.runtimeClass : undefined;
            resourceInputs["seLinux"] = state ? state.seLinux : undefined;
            resourceInputs["supplementalGroup"] = state ? state.supplementalGroup : undefined;
            resourceInputs["volumes"] = state ? state.volumes : undefined;
        } else {
            const args = argsOrState as PodSecurityPolicyTemplateArgs | undefined;
            resourceInputs["allowPrivilegeEscalation"] = args ? args.allowPrivilegeEscalation : undefined;
            resourceInputs["allowedCapabilities"] = args ? args.allowedCapabilities : undefined;
            resourceInputs["allowedCsiDrivers"] = args ? args.allowedCsiDrivers : undefined;
            resourceInputs["allowedFlexVolumes"] = args ? args.allowedFlexVolumes : undefined;
            resourceInputs["allowedHostPaths"] = args ? args.allowedHostPaths : undefined;
            resourceInputs["allowedProcMountTypes"] = args ? args.allowedProcMountTypes : undefined;
            resourceInputs["allowedUnsafeSysctls"] = args ? args.allowedUnsafeSysctls : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["defaultAddCapabilities"] = args ? args.defaultAddCapabilities : undefined;
            resourceInputs["defaultAllowPrivilegeEscalation"] = args ? args.defaultAllowPrivilegeEscalation : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forbiddenSysctls"] = args ? args.forbiddenSysctls : undefined;
            resourceInputs["fsGroup"] = args ? args.fsGroup : undefined;
            resourceInputs["hostIpc"] = args ? args.hostIpc : undefined;
            resourceInputs["hostNetwork"] = args ? args.hostNetwork : undefined;
            resourceInputs["hostPid"] = args ? args.hostPid : undefined;
            resourceInputs["hostPorts"] = args ? args.hostPorts : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["privileged"] = args ? args.privileged : undefined;
            resourceInputs["readOnlyRootFilesystem"] = args ? args.readOnlyRootFilesystem : undefined;
            resourceInputs["requiredDropCapabilities"] = args ? args.requiredDropCapabilities : undefined;
            resourceInputs["runAsGroup"] = args ? args.runAsGroup : undefined;
            resourceInputs["runAsUser"] = args ? args.runAsUser : undefined;
            resourceInputs["runtimeClass"] = args ? args.runtimeClass : undefined;
            resourceInputs["seLinux"] = args ? args.seLinux : undefined;
            resourceInputs["supplementalGroup"] = args ? args.supplementalGroup : undefined;
            resourceInputs["volumes"] = args ? args.volumes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PodSecurityPolicyTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PodSecurityPolicyTemplate resources.
 */
export interface PodSecurityPolicyTemplateState {
    /**
     * = (Optional)
     */
    allowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    allowedCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    allowedCsiDrivers?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedCsiDriver>[]>;
    /**
     * (list)
     */
    allowedFlexVolumes?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedFlexVolume>[]>;
    /**
     * (list)
     */
    allowedHostPaths?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedHostPath>[]>;
    /**
     * (list)
     */
    allowedProcMountTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    allowedUnsafeSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (list)
     */
    defaultAddCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    defaultAllowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (list)
     */
    forbiddenSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    fsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    hostIpc?: pulumi.Input<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    hostNetwork?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    hostPid?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    hostPorts?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateHostPort>[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    name?: pulumi.Input<string>;
    /**
     * (bool)
     */
    privileged?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readOnlyRootFilesystem?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    requiredDropCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    runAsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsGroup>;
    /**
     * (list maxitems:1)
     */
    runAsUser?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    runtimeClass?: pulumi.Input<inputs.PodSecurityPolicyTemplateRuntimeClass>;
    /**
     * (list maxitems:1)
     */
    seLinux?: pulumi.Input<inputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    supplementalGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    volumes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a PodSecurityPolicyTemplate resource.
 */
export interface PodSecurityPolicyTemplateArgs {
    /**
     * = (Optional)
     */
    allowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    allowedCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    allowedCsiDrivers?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedCsiDriver>[]>;
    /**
     * (list)
     */
    allowedFlexVolumes?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedFlexVolume>[]>;
    /**
     * (list)
     */
    allowedHostPaths?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedHostPath>[]>;
    /**
     * (list)
     */
    allowedProcMountTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    allowedUnsafeSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (list)
     */
    defaultAddCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    defaultAllowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    description?: pulumi.Input<string>;
    /**
     * (list)
     */
    forbiddenSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    fsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    hostIpc?: pulumi.Input<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    hostNetwork?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    hostPid?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    hostPorts?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateHostPort>[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    name?: pulumi.Input<string>;
    /**
     * (bool)
     */
    privileged?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readOnlyRootFilesystem?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    requiredDropCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    runAsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsGroup>;
    /**
     * (list maxitems:1)
     */
    runAsUser?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    runtimeClass?: pulumi.Input<inputs.PodSecurityPolicyTemplateRuntimeClass>;
    /**
     * (list maxitems:1)
     */
    seLinux?: pulumi.Input<inputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    supplementalGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    volumes?: pulumi.Input<pulumi.Input<string>[]>;
}
