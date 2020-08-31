# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['PodSecurityPolicyTemplate']


class PodSecurityPolicyTemplate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_privilege_escalation: Optional[pulumi.Input[bool]] = None,
                 allowed_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 allowed_csi_drivers: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedCsiDriverArgs']]]]] = None,
                 allowed_flex_volumes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedFlexVolumeArgs']]]]] = None,
                 allowed_host_paths: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedHostPathArgs']]]]] = None,
                 allowed_proc_mount_types: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 allowed_unsafe_sysctls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 default_add_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 default_allow_privilege_escalation: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 forbidden_sysctls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 fs_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateFsGroupArgs']]] = None,
                 host_ipc: Optional[pulumi.Input[bool]] = None,
                 host_network: Optional[pulumi.Input[bool]] = None,
                 host_pid: Optional[pulumi.Input[bool]] = None,
                 host_ports: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateHostPortArgs']]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 privileged: Optional[pulumi.Input[bool]] = None,
                 read_only_root_filesystem: Optional[pulumi.Input[bool]] = None,
                 required_drop_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 run_as_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsGroupArgs']]] = None,
                 run_as_user: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsUserArgs']]] = None,
                 runtime_class: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRuntimeClassArgs']]] = None,
                 se_linux: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSeLinuxArgs']]] = None,
                 supplemental_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSupplementalGroupArgs']]] = None,
                 volumes: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 PodSecurityPolicyTemplate resource. This can be used to create PodSecurityPolicyTemplates for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 PodSecurityPolicyTemplate
        foo = rancher2.PodSecurityPolicyTemplate("foo",
            allow_privilege_escalation=False,
            allowed_csi_drivers=[
                rancher2.PodSecurityPolicyTemplateAllowedCsiDriverArgs(
                    name="something",
                ),
                rancher2.PodSecurityPolicyTemplateAllowedCsiDriverArgs(
                    name="something-else",
                ),
            ],
            allowed_flex_volumes=[
                rancher2.PodSecurityPolicyTemplateAllowedFlexVolumeArgs(
                    driver="something",
                ),
                rancher2.PodSecurityPolicyTemplateAllowedFlexVolumeArgs(
                    driver="something-else",
                ),
            ],
            allowed_host_paths=[
                rancher2.PodSecurityPolicyTemplateAllowedHostPathArgs(
                    path_prefix="/",
                    read_only=True,
                ),
                rancher2.PodSecurityPolicyTemplateAllowedHostPathArgs(
                    path_prefix="//",
                    read_only=False,
                ),
            ],
            allowed_proc_mount_types=["Default"],
            default_allow_privilege_escalation=False,
            description="Terraform PodSecurityPolicyTemplate acceptance test - update",
            fs_group=rancher2.PodSecurityPolicyTemplateFsGroupArgs(
                ranges=[
                    rancher2.PodSecurityPolicyTemplateFsGroupRangeArgs(
                        max=100,
                        min=0,
                    ),
                    rancher2.PodSecurityPolicyTemplateFsGroupRangeArgs(
                        max=100,
                        min=0,
                    ),
                ],
                rule="MustRunAs",
            ),
            host_ipc=False,
            host_network=False,
            host_pid=False,
            host_ports=[
                rancher2.PodSecurityPolicyTemplateHostPortArgs(
                    max=65535,
                    min=0,
                ),
                rancher2.PodSecurityPolicyTemplateHostPortArgs(
                    max=8080,
                    min=1024,
                ),
            ],
            privileged=False,
            read_only_root_filesystem=False,
            required_drop_capabilities=["something"],
            run_as_group=rancher2.PodSecurityPolicyTemplateRunAsGroupArgs(
                ranges=[
                    rancher2.PodSecurityPolicyTemplateRunAsGroupRangeArgs(
                        max=100,
                        min=1,
                    ),
                    rancher2.PodSecurityPolicyTemplateRunAsGroupRangeArgs(
                        max=1024,
                        min=2,
                    ),
                ],
                rule="MustRunAs",
            ),
            run_as_user=rancher2.PodSecurityPolicyTemplateRunAsUserArgs(
                ranges=[
                    rancher2.PodSecurityPolicyTemplateRunAsUserRangeArgs(
                        max=100,
                        min=1,
                    ),
                    rancher2.PodSecurityPolicyTemplateRunAsUserRangeArgs(
                        max=1024,
                        min=2,
                    ),
                ],
                rule="MustRunAs",
            ),
            runtime_class=rancher2.PodSecurityPolicyTemplateRuntimeClassArgs(
                allowed_runtime_class_names=["something"],
                default_runtime_class_name="something",
            ),
            se_linux=rancher2.PodSecurityPolicyTemplateSeLinuxArgs(
                rule="RunAsAny",
            ),
            supplemental_group=rancher2.PodSecurityPolicyTemplateSupplementalGroupArgs(
                rule="RunAsAny",
            ),
            volumes=["azureFile"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_privilege_escalation: = (Optional)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_capabilities: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedCsiDriverArgs']]]] allowed_csi_drivers: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedFlexVolumeArgs']]]] allowed_flex_volumes: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedHostPathArgs']]]] allowed_host_paths: (list)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_proc_mount_types: (list)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_unsafe_sysctls: (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[List[pulumi.Input[str]]] default_add_capabilities: (list)
        :param pulumi.Input[bool] default_allow_privilege_escalation: (list)
        :param pulumi.Input[str] description: The PodSecurityPolicyTemplate description (string)
        :param pulumi.Input[List[pulumi.Input[str]]] forbidden_sysctls: (list)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateFsGroupArgs']] fs_group: (list maxitems:1)
        :param pulumi.Input[bool] host_ipc: (bool)
        :param pulumi.Input[bool] host_network: hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        :param pulumi.Input[bool] host_pid: (bool)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateHostPortArgs']]]] host_ports: (list)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[str] name: The name of the PodSecurityPolicyTemplate (string)
        :param pulumi.Input[bool] privileged: (bool)
        :param pulumi.Input[bool] read_only_root_filesystem: (bool)
        :param pulumi.Input[List[pulumi.Input[str]]] required_drop_capabilities: (list)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsGroupArgs']] run_as_group: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsUserArgs']] run_as_user: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRuntimeClassArgs']] runtime_class: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSeLinuxArgs']] se_linux: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSupplementalGroupArgs']] supplemental_group: (list maxitems:1)
        :param pulumi.Input[List[pulumi.Input[str]]] volumes: (list)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['allow_privilege_escalation'] = allow_privilege_escalation
            __props__['allowed_capabilities'] = allowed_capabilities
            __props__['allowed_csi_drivers'] = allowed_csi_drivers
            __props__['allowed_flex_volumes'] = allowed_flex_volumes
            __props__['allowed_host_paths'] = allowed_host_paths
            __props__['allowed_proc_mount_types'] = allowed_proc_mount_types
            __props__['allowed_unsafe_sysctls'] = allowed_unsafe_sysctls
            __props__['annotations'] = annotations
            __props__['default_add_capabilities'] = default_add_capabilities
            __props__['default_allow_privilege_escalation'] = default_allow_privilege_escalation
            __props__['description'] = description
            __props__['forbidden_sysctls'] = forbidden_sysctls
            __props__['fs_group'] = fs_group
            __props__['host_ipc'] = host_ipc
            __props__['host_network'] = host_network
            __props__['host_pid'] = host_pid
            __props__['host_ports'] = host_ports
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['privileged'] = privileged
            __props__['read_only_root_filesystem'] = read_only_root_filesystem
            __props__['required_drop_capabilities'] = required_drop_capabilities
            __props__['run_as_group'] = run_as_group
            __props__['run_as_user'] = run_as_user
            __props__['runtime_class'] = runtime_class
            __props__['se_linux'] = se_linux
            __props__['supplemental_group'] = supplemental_group
            __props__['volumes'] = volumes
        super(PodSecurityPolicyTemplate, __self__).__init__(
            'rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_privilege_escalation: Optional[pulumi.Input[bool]] = None,
            allowed_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            allowed_csi_drivers: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedCsiDriverArgs']]]]] = None,
            allowed_flex_volumes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedFlexVolumeArgs']]]]] = None,
            allowed_host_paths: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedHostPathArgs']]]]] = None,
            allowed_proc_mount_types: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            allowed_unsafe_sysctls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            default_add_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            default_allow_privilege_escalation: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            forbidden_sysctls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            fs_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateFsGroupArgs']]] = None,
            host_ipc: Optional[pulumi.Input[bool]] = None,
            host_network: Optional[pulumi.Input[bool]] = None,
            host_pid: Optional[pulumi.Input[bool]] = None,
            host_ports: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateHostPortArgs']]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            privileged: Optional[pulumi.Input[bool]] = None,
            read_only_root_filesystem: Optional[pulumi.Input[bool]] = None,
            required_drop_capabilities: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            run_as_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsGroupArgs']]] = None,
            run_as_user: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsUserArgs']]] = None,
            runtime_class: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRuntimeClassArgs']]] = None,
            se_linux: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSeLinuxArgs']]] = None,
            supplemental_group: Optional[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSupplementalGroupArgs']]] = None,
            volumes: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'PodSecurityPolicyTemplate':
        """
        Get an existing PodSecurityPolicyTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_privilege_escalation: = (Optional)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_capabilities: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedCsiDriverArgs']]]] allowed_csi_drivers: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedFlexVolumeArgs']]]] allowed_flex_volumes: (list)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateAllowedHostPathArgs']]]] allowed_host_paths: (list)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_proc_mount_types: (list)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_unsafe_sysctls: (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[List[pulumi.Input[str]]] default_add_capabilities: (list)
        :param pulumi.Input[bool] default_allow_privilege_escalation: (list)
        :param pulumi.Input[str] description: The PodSecurityPolicyTemplate description (string)
        :param pulumi.Input[List[pulumi.Input[str]]] forbidden_sysctls: (list)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateFsGroupArgs']] fs_group: (list maxitems:1)
        :param pulumi.Input[bool] host_ipc: (bool)
        :param pulumi.Input[bool] host_network: hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        :param pulumi.Input[bool] host_pid: (bool)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateHostPortArgs']]]] host_ports: (list)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[str] name: The name of the PodSecurityPolicyTemplate (string)
        :param pulumi.Input[bool] privileged: (bool)
        :param pulumi.Input[bool] read_only_root_filesystem: (bool)
        :param pulumi.Input[List[pulumi.Input[str]]] required_drop_capabilities: (list)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsGroupArgs']] run_as_group: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRunAsUserArgs']] run_as_user: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateRuntimeClassArgs']] runtime_class: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSeLinuxArgs']] se_linux: (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['PodSecurityPolicyTemplateSupplementalGroupArgs']] supplemental_group: (list maxitems:1)
        :param pulumi.Input[List[pulumi.Input[str]]] volumes: (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allow_privilege_escalation"] = allow_privilege_escalation
        __props__["allowed_capabilities"] = allowed_capabilities
        __props__["allowed_csi_drivers"] = allowed_csi_drivers
        __props__["allowed_flex_volumes"] = allowed_flex_volumes
        __props__["allowed_host_paths"] = allowed_host_paths
        __props__["allowed_proc_mount_types"] = allowed_proc_mount_types
        __props__["allowed_unsafe_sysctls"] = allowed_unsafe_sysctls
        __props__["annotations"] = annotations
        __props__["default_add_capabilities"] = default_add_capabilities
        __props__["default_allow_privilege_escalation"] = default_allow_privilege_escalation
        __props__["description"] = description
        __props__["forbidden_sysctls"] = forbidden_sysctls
        __props__["fs_group"] = fs_group
        __props__["host_ipc"] = host_ipc
        __props__["host_network"] = host_network
        __props__["host_pid"] = host_pid
        __props__["host_ports"] = host_ports
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["privileged"] = privileged
        __props__["read_only_root_filesystem"] = read_only_root_filesystem
        __props__["required_drop_capabilities"] = required_drop_capabilities
        __props__["run_as_group"] = run_as_group
        __props__["run_as_user"] = run_as_user
        __props__["runtime_class"] = runtime_class
        __props__["se_linux"] = se_linux
        __props__["supplemental_group"] = supplemental_group
        __props__["volumes"] = volumes
        return PodSecurityPolicyTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowPrivilegeEscalation")
    def allow_privilege_escalation(self) -> pulumi.Output[bool]:
        """
        = (Optional)
        """
        return pulumi.get(self, "allow_privilege_escalation")

    @property
    @pulumi.getter(name="allowedCapabilities")
    def allowed_capabilities(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_capabilities")

    @property
    @pulumi.getter(name="allowedCsiDrivers")
    def allowed_csi_drivers(self) -> pulumi.Output[Optional[List['outputs.PodSecurityPolicyTemplateAllowedCsiDriver']]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_csi_drivers")

    @property
    @pulumi.getter(name="allowedFlexVolumes")
    def allowed_flex_volumes(self) -> pulumi.Output[Optional[List['outputs.PodSecurityPolicyTemplateAllowedFlexVolume']]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_flex_volumes")

    @property
    @pulumi.getter(name="allowedHostPaths")
    def allowed_host_paths(self) -> pulumi.Output[Optional[List['outputs.PodSecurityPolicyTemplateAllowedHostPath']]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_host_paths")

    @property
    @pulumi.getter(name="allowedProcMountTypes")
    def allowed_proc_mount_types(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_proc_mount_types")

    @property
    @pulumi.getter(name="allowedUnsafeSysctls")
    def allowed_unsafe_sysctls(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "allowed_unsafe_sysctls")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for PodSecurityPolicyTemplate object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="defaultAddCapabilities")
    def default_add_capabilities(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "default_add_capabilities")

    @property
    @pulumi.getter(name="defaultAllowPrivilegeEscalation")
    def default_allow_privilege_escalation(self) -> pulumi.Output[Optional[bool]]:
        """
        (list)
        """
        return pulumi.get(self, "default_allow_privilege_escalation")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The PodSecurityPolicyTemplate description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="forbiddenSysctls")
    def forbidden_sysctls(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "forbidden_sysctls")

    @property
    @pulumi.getter(name="fsGroup")
    def fs_group(self) -> pulumi.Output['outputs.PodSecurityPolicyTemplateFsGroup']:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "fs_group")

    @property
    @pulumi.getter(name="hostIpc")
    def host_ipc(self) -> pulumi.Output[bool]:
        """
        (bool)
        """
        return pulumi.get(self, "host_ipc")

    @property
    @pulumi.getter(name="hostNetwork")
    def host_network(self) -> pulumi.Output[bool]:
        """
        hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        """
        return pulumi.get(self, "host_network")

    @property
    @pulumi.getter(name="hostPid")
    def host_pid(self) -> pulumi.Output[bool]:
        """
        (bool)
        """
        return pulumi.get(self, "host_pid")

    @property
    @pulumi.getter(name="hostPorts")
    def host_ports(self) -> pulumi.Output[List['outputs.PodSecurityPolicyTemplateHostPort']]:
        """
        (list)
        """
        return pulumi.get(self, "host_ports")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for PodSecurityPolicyTemplate object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the PodSecurityPolicyTemplate (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def privileged(self) -> pulumi.Output[bool]:
        """
        (bool)
        """
        return pulumi.get(self, "privileged")

    @property
    @pulumi.getter(name="readOnlyRootFilesystem")
    def read_only_root_filesystem(self) -> pulumi.Output[bool]:
        """
        (bool)
        """
        return pulumi.get(self, "read_only_root_filesystem")

    @property
    @pulumi.getter(name="requiredDropCapabilities")
    def required_drop_capabilities(self) -> pulumi.Output[Optional[List[str]]]:
        """
        (list)
        """
        return pulumi.get(self, "required_drop_capabilities")

    @property
    @pulumi.getter(name="runAsGroup")
    def run_as_group(self) -> pulumi.Output[Optional['outputs.PodSecurityPolicyTemplateRunAsGroup']]:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "run_as_group")

    @property
    @pulumi.getter(name="runAsUser")
    def run_as_user(self) -> pulumi.Output['outputs.PodSecurityPolicyTemplateRunAsUser']:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "run_as_user")

    @property
    @pulumi.getter(name="runtimeClass")
    def runtime_class(self) -> pulumi.Output[Optional['outputs.PodSecurityPolicyTemplateRuntimeClass']]:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "runtime_class")

    @property
    @pulumi.getter(name="seLinux")
    def se_linux(self) -> pulumi.Output['outputs.PodSecurityPolicyTemplateSeLinux']:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "se_linux")

    @property
    @pulumi.getter(name="supplementalGroup")
    def supplemental_group(self) -> pulumi.Output['outputs.PodSecurityPolicyTemplateSupplementalGroup']:
        """
        (list maxitems:1)
        """
        return pulumi.get(self, "supplemental_group")

    @property
    @pulumi.getter
    def volumes(self) -> pulumi.Output[List[str]]:
        """
        (list)
        """
        return pulumi.get(self, "volumes")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

