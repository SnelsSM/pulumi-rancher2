// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 PodSecurityPolicyTemplate.
 *
 * ## Example Usage
 */
export function getPodSecurityPolicyTemplate(args: GetPodSecurityPolicyTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetPodSecurityPolicyTemplateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getPodSecurityPolicyTemplate:getPodSecurityPolicyTemplate", {
        "allowPrivilegeEscalation": args.allowPrivilegeEscalation,
        "allowedCapabilities": args.allowedCapabilities,
        "allowedCsiDrivers": args.allowedCsiDrivers,
        "allowedFlexVolumes": args.allowedFlexVolumes,
        "allowedHostPaths": args.allowedHostPaths,
        "allowedProcMountTypes": args.allowedProcMountTypes,
        "allowedUnsafeSysctls": args.allowedUnsafeSysctls,
        "annotations": args.annotations,
        "defaultAddCapabilities": args.defaultAddCapabilities,
        "defaultAllowPrivilegeEscalation": args.defaultAllowPrivilegeEscalation,
        "description": args.description,
        "forbiddenSysctls": args.forbiddenSysctls,
        "fsGroup": args.fsGroup,
        "hostIpc": args.hostIpc,
        "hostNetwork": args.hostNetwork,
        "hostPid": args.hostPid,
        "hostPorts": args.hostPorts,
        "labels": args.labels,
        "name": args.name,
        "privileged": args.privileged,
        "readOnlyRootFilesystem": args.readOnlyRootFilesystem,
        "requiredDropCapabilities": args.requiredDropCapabilities,
        "runAsGroup": args.runAsGroup,
        "runAsUser": args.runAsUser,
        "runtimeClass": args.runtimeClass,
        "seLinux": args.seLinux,
        "supplementalGroup": args.supplementalGroup,
        "volumes": args.volumes,
    }, opts);
}

/**
 * A collection of arguments for invoking getPodSecurityPolicyTemplate.
 */
export interface GetPodSecurityPolicyTemplateArgs {
    /**
     * = (Optional)
     */
    allowPrivilegeEscalation?: boolean;
    /**
     * (list)
     */
    allowedCapabilities?: string[];
    /**
     * (list)
     */
    allowedCsiDrivers?: inputs.GetPodSecurityPolicyTemplateAllowedCsiDriver[];
    /**
     * (list)
     */
    allowedFlexVolumes?: inputs.GetPodSecurityPolicyTemplateAllowedFlexVolume[];
    /**
     * (list)
     */
    allowedHostPaths?: inputs.GetPodSecurityPolicyTemplateAllowedHostPath[];
    /**
     * (list)
     */
    allowedProcMountTypes?: string[];
    /**
     * (list)
     */
    allowedUnsafeSysctls?: string[];
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    annotations?: {[key: string]: string};
    /**
     * (list)
     */
    defaultAddCapabilities?: string[];
    /**
     * (list)
     */
    defaultAllowPrivilegeEscalation?: boolean;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    description?: string;
    /**
     * (list)
     */
    forbiddenSysctls?: string[];
    /**
     * (list maxitems:1)
     */
    fsGroup?: inputs.GetPodSecurityPolicyTemplateFsGroup;
    /**
     * (bool)
     */
    hostIpc?: boolean;
    hostNetwork?: boolean;
    /**
     * (bool)
     */
    hostPid?: boolean;
    /**
     * (list)
     */
    hostPorts?: inputs.GetPodSecurityPolicyTemplateHostPort[];
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    labels?: {[key: string]: string};
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    name: string;
    /**
     * (bool)
     */
    privileged?: boolean;
    /**
     * (bool)
     */
    readOnlyRootFilesystem?: boolean;
    /**
     * (list)
     */
    requiredDropCapabilities?: string[];
    /**
     * (list maxitems:1)
     */
    runAsGroup?: inputs.GetPodSecurityPolicyTemplateRunAsGroup;
    /**
     * (list maxitems:1)
     */
    runAsUser?: inputs.GetPodSecurityPolicyTemplateRunAsUser;
    /**
     * (list maxitems:1)
     */
    runtimeClass?: inputs.GetPodSecurityPolicyTemplateRuntimeClass;
    /**
     * (list maxitems:1)
     */
    seLinux?: inputs.GetPodSecurityPolicyTemplateSeLinux;
    /**
     * (list maxitems:1)
     */
    supplementalGroup?: inputs.GetPodSecurityPolicyTemplateSupplementalGroup;
    /**
     * (list)
     */
    volumes?: string[];
}

/**
 * A collection of values returned by getPodSecurityPolicyTemplate.
 */
export interface GetPodSecurityPolicyTemplateResult {
    readonly allowPrivilegeEscalation: boolean;
    readonly allowedCapabilities?: string[];
    readonly allowedCsiDrivers?: outputs.GetPodSecurityPolicyTemplateAllowedCsiDriver[];
    readonly allowedFlexVolumes?: outputs.GetPodSecurityPolicyTemplateAllowedFlexVolume[];
    readonly allowedHostPaths?: outputs.GetPodSecurityPolicyTemplateAllowedHostPath[];
    readonly allowedProcMountTypes?: string[];
    readonly allowedUnsafeSysctls?: string[];
    readonly annotations: {[key: string]: string};
    readonly defaultAddCapabilities?: string[];
    readonly defaultAllowPrivilegeEscalation?: boolean;
    readonly description: string;
    readonly forbiddenSysctls?: string[];
    readonly fsGroup: outputs.GetPodSecurityPolicyTemplateFsGroup;
    readonly hostIpc: boolean;
    readonly hostNetwork: boolean;
    readonly hostPid: boolean;
    readonly hostPorts: outputs.GetPodSecurityPolicyTemplateHostPort[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: string};
    readonly name: string;
    readonly privileged: boolean;
    readonly readOnlyRootFilesystem: boolean;
    readonly requiredDropCapabilities?: string[];
    readonly runAsGroup?: outputs.GetPodSecurityPolicyTemplateRunAsGroup;
    readonly runAsUser: outputs.GetPodSecurityPolicyTemplateRunAsUser;
    readonly runtimeClass?: outputs.GetPodSecurityPolicyTemplateRuntimeClass;
    readonly seLinux: outputs.GetPodSecurityPolicyTemplateSeLinux;
    readonly supplementalGroup: outputs.GetPodSecurityPolicyTemplateSupplementalGroup;
    readonly volumes: string[];
}
/**
 * Use this data source to retrieve information about a Rancher v2 PodSecurityPolicyTemplate.
 *
 * ## Example Usage
 */
export function getPodSecurityPolicyTemplateOutput(args: GetPodSecurityPolicyTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPodSecurityPolicyTemplateResult> {
    return pulumi.output(args).apply((a: any) => getPodSecurityPolicyTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getPodSecurityPolicyTemplate.
 */
export interface GetPodSecurityPolicyTemplateOutputArgs {
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
    allowedCsiDrivers?: pulumi.Input<pulumi.Input<inputs.GetPodSecurityPolicyTemplateAllowedCsiDriverArgs>[]>;
    /**
     * (list)
     */
    allowedFlexVolumes?: pulumi.Input<pulumi.Input<inputs.GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs>[]>;
    /**
     * (list)
     */
    allowedHostPaths?: pulumi.Input<pulumi.Input<inputs.GetPodSecurityPolicyTemplateAllowedHostPathArgs>[]>;
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
    fsGroup?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateFsGroupArgs>;
    /**
     * (bool)
     */
    hostIpc?: pulumi.Input<boolean>;
    hostNetwork?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    hostPid?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    hostPorts?: pulumi.Input<pulumi.Input<inputs.GetPodSecurityPolicyTemplateHostPortArgs>[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    name: pulumi.Input<string>;
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
    runAsGroup?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateRunAsGroupArgs>;
    /**
     * (list maxitems:1)
     */
    runAsUser?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateRunAsUserArgs>;
    /**
     * (list maxitems:1)
     */
    runtimeClass?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateRuntimeClassArgs>;
    /**
     * (list maxitems:1)
     */
    seLinux?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateSeLinuxArgs>;
    /**
     * (list maxitems:1)
     */
    supplementalGroup?: pulumi.Input<inputs.GetPodSecurityPolicyTemplateSupplementalGroupArgs>;
    /**
     * (list)
     */
    volumes?: pulumi.Input<pulumi.Input<string>[]>;
}
