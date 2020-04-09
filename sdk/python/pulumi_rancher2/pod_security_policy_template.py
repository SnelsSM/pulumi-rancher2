# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class PodSecurityPolicyTemplate(pulumi.CustomResource):
    allow_privilege_escalation: pulumi.Output[bool]
    """
    allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to
    true.
    """
    allowed_capabilities: pulumi.Output[list]
    """
    (list)
    """
    allowed_csi_drivers: pulumi.Output[list]
    """
    (list)

      * `name` (`str`) - The name of the PodSecurityPolicyTemplate (string)
    """
    allowed_flex_volumes: pulumi.Output[list]
    """
    (list)

      * `driver` (`str`)
    """
    allowed_host_paths: pulumi.Output[list]
    """
    (list)

      * `pathPrefix` (`str`) - (string)
      * `readOnly` (`bool`) - (string)
    """
    allowed_proc_mount_types: pulumi.Output[list]
    """
    (list)
    """
    allowed_unsafe_sysctls: pulumi.Output[list]
    """
    (list)
    """
    annotations: pulumi.Output[dict]
    """
    Annotations for PodSecurityPolicyTemplate object (map)
    """
    default_add_capabilities: pulumi.Output[list]
    """
    (list)
    """
    default_allow_privilege_escalation: pulumi.Output[bool]
    """
    (list)
    """
    description: pulumi.Output[str]
    """
    The PodSecurityPolicyTemplate description (string)
    """
    forbidden_sysctls: pulumi.Output[list]
    """
    (list)
    """
    fs_group: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `ranges` (`list`) - (list)
        * `max` (`float`) - (int)
        * `min` (`float`) - (int)

      * `rule` (`str`) - (string)
    """
    host_ipc: pulumi.Output[bool]
    """
    (bool)
    """
    host_network: pulumi.Output[bool]
    """
    hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    """
    host_pid: pulumi.Output[bool]
    """
    (bool)
    """
    host_ports: pulumi.Output[list]
    """
    (list)

      * `max` (`float`) - (int)
      * `min` (`float`) - (int)
    """
    labels: pulumi.Output[dict]
    """
    Labels for PodSecurityPolicyTemplate object (map)
    * `allow_privilege_escalation` = (Optional)
    """
    name: pulumi.Output[str]
    """
    The name of the PodSecurityPolicyTemplate (string)
    """
    privileged: pulumi.Output[bool]
    """
    (bool)
    """
    read_only_root_filesystem: pulumi.Output[bool]
    """
    (bool)
    """
    required_drop_capabilities: pulumi.Output[list]
    """
    (list)
    """
    run_as_group: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `ranges` (`list`) - (list)
        * `max` (`float`) - (int)
        * `min` (`float`) - (int)

      * `rule` (`str`) - (string)
    """
    run_as_user: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `ranges` (`list`) - (list)
        * `max` (`float`) - (int)
        * `min` (`float`) - (int)

      * `rule` (`str`) - (string)
    """
    runtime_class: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `allowedRuntimeClassNames` (`list`) - (list)
      * `defaultRuntimeClassName` (`str`) - (string)
    """
    se_linux: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `rule` (`str`) - (string)
      * `seLinuxOption` (`dict`) - (list maxitems:1)
        * `level` (`str`) - (string)
        * `role` (`str`) - (string)
        * `type` (`str`) - (string)
        * `user` (`str`) - (string)
    """
    supplemental_group: pulumi.Output[dict]
    """
    (list maxitems:1)

      * `ranges` (`list`) - (list)
        * `max` (`float`) - (int)
        * `min` (`float`) - (int)

      * `rule` (`str`) - (string)
    """
    volumes: pulumi.Output[list]
    """
    (list)
    """
    def __init__(__self__, resource_name, opts=None, allow_privilege_escalation=None, allowed_capabilities=None, allowed_csi_drivers=None, allowed_flex_volumes=None, allowed_host_paths=None, allowed_proc_mount_types=None, allowed_unsafe_sysctls=None, annotations=None, default_add_capabilities=None, default_allow_privilege_escalation=None, description=None, forbidden_sysctls=None, fs_group=None, host_ipc=None, host_network=None, host_pid=None, host_ports=None, labels=None, name=None, privileged=None, read_only_root_filesystem=None, required_drop_capabilities=None, run_as_group=None, run_as_user=None, runtime_class=None, se_linux=None, supplemental_group=None, volumes=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 PodSecurityPolicyTemplate resource. This can be used to create PodSecurityPolicyTemplates for Rancher v2 environments and retrieve their information.



        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/podSecurityPolicyTemplate.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_privilege_escalation: allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to
               true.
        :param pulumi.Input[list] allowed_capabilities: (list)
        :param pulumi.Input[list] allowed_csi_drivers: (list)
        :param pulumi.Input[list] allowed_flex_volumes: (list)
        :param pulumi.Input[list] allowed_host_paths: (list)
        :param pulumi.Input[list] allowed_proc_mount_types: (list)
        :param pulumi.Input[list] allowed_unsafe_sysctls: (list)
        :param pulumi.Input[dict] annotations: Annotations for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[list] default_add_capabilities: (list)
        :param pulumi.Input[bool] default_allow_privilege_escalation: (list)
        :param pulumi.Input[str] description: The PodSecurityPolicyTemplate description (string)
        :param pulumi.Input[list] forbidden_sysctls: (list)
        :param pulumi.Input[dict] fs_group: (list maxitems:1)
        :param pulumi.Input[bool] host_ipc: (bool)
        :param pulumi.Input[bool] host_network: hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        :param pulumi.Input[bool] host_pid: (bool)
        :param pulumi.Input[list] host_ports: (list)
        :param pulumi.Input[dict] labels: Labels for PodSecurityPolicyTemplate object (map)
               * `allow_privilege_escalation` = (Optional)
        :param pulumi.Input[str] name: The name of the PodSecurityPolicyTemplate (string)
        :param pulumi.Input[bool] privileged: (bool)
        :param pulumi.Input[bool] read_only_root_filesystem: (bool)
        :param pulumi.Input[list] required_drop_capabilities: (list)
        :param pulumi.Input[dict] run_as_group: (list maxitems:1)
        :param pulumi.Input[dict] run_as_user: (list maxitems:1)
        :param pulumi.Input[dict] runtime_class: (list maxitems:1)
        :param pulumi.Input[dict] se_linux: (list maxitems:1)
        :param pulumi.Input[dict] supplemental_group: (list maxitems:1)
        :param pulumi.Input[list] volumes: (list)

        The **allowed_csi_drivers** object supports the following:

          * `name` (`pulumi.Input[str]`) - The name of the PodSecurityPolicyTemplate (string)

        The **allowed_flex_volumes** object supports the following:

          * `driver` (`pulumi.Input[str]`)

        The **allowed_host_paths** object supports the following:

          * `pathPrefix` (`pulumi.Input[str]`) - (string)
          * `readOnly` (`pulumi.Input[bool]`) - (string)

        The **fs_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **host_ports** object supports the following:

          * `max` (`pulumi.Input[float]`) - (int)
          * `min` (`pulumi.Input[float]`) - (int)

        The **run_as_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **run_as_user** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **runtime_class** object supports the following:

          * `allowedRuntimeClassNames` (`pulumi.Input[list]`) - (list)
          * `defaultRuntimeClassName` (`pulumi.Input[str]`) - (string)

        The **se_linux** object supports the following:

          * `rule` (`pulumi.Input[str]`) - (string)
          * `seLinuxOption` (`pulumi.Input[dict]`) - (list maxitems:1)
            * `level` (`pulumi.Input[str]`) - (string)
            * `role` (`pulumi.Input[str]`) - (string)
            * `type` (`pulumi.Input[str]`) - (string)
            * `user` (`pulumi.Input[str]`) - (string)

        The **supplemental_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)
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
            opts.version = utilities.get_version()
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
    def get(resource_name, id, opts=None, allow_privilege_escalation=None, allowed_capabilities=None, allowed_csi_drivers=None, allowed_flex_volumes=None, allowed_host_paths=None, allowed_proc_mount_types=None, allowed_unsafe_sysctls=None, annotations=None, default_add_capabilities=None, default_allow_privilege_escalation=None, description=None, forbidden_sysctls=None, fs_group=None, host_ipc=None, host_network=None, host_pid=None, host_ports=None, labels=None, name=None, privileged=None, read_only_root_filesystem=None, required_drop_capabilities=None, run_as_group=None, run_as_user=None, runtime_class=None, se_linux=None, supplemental_group=None, volumes=None):
        """
        Get an existing PodSecurityPolicyTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_privilege_escalation: allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to
               true.
        :param pulumi.Input[list] allowed_capabilities: (list)
        :param pulumi.Input[list] allowed_csi_drivers: (list)
        :param pulumi.Input[list] allowed_flex_volumes: (list)
        :param pulumi.Input[list] allowed_host_paths: (list)
        :param pulumi.Input[list] allowed_proc_mount_types: (list)
        :param pulumi.Input[list] allowed_unsafe_sysctls: (list)
        :param pulumi.Input[dict] annotations: Annotations for PodSecurityPolicyTemplate object (map)
        :param pulumi.Input[list] default_add_capabilities: (list)
        :param pulumi.Input[bool] default_allow_privilege_escalation: (list)
        :param pulumi.Input[str] description: The PodSecurityPolicyTemplate description (string)
        :param pulumi.Input[list] forbidden_sysctls: (list)
        :param pulumi.Input[dict] fs_group: (list maxitems:1)
        :param pulumi.Input[bool] host_ipc: (bool)
        :param pulumi.Input[bool] host_network: hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        :param pulumi.Input[bool] host_pid: (bool)
        :param pulumi.Input[list] host_ports: (list)
        :param pulumi.Input[dict] labels: Labels for PodSecurityPolicyTemplate object (map)
               * `allow_privilege_escalation` = (Optional)
        :param pulumi.Input[str] name: The name of the PodSecurityPolicyTemplate (string)
        :param pulumi.Input[bool] privileged: (bool)
        :param pulumi.Input[bool] read_only_root_filesystem: (bool)
        :param pulumi.Input[list] required_drop_capabilities: (list)
        :param pulumi.Input[dict] run_as_group: (list maxitems:1)
        :param pulumi.Input[dict] run_as_user: (list maxitems:1)
        :param pulumi.Input[dict] runtime_class: (list maxitems:1)
        :param pulumi.Input[dict] se_linux: (list maxitems:1)
        :param pulumi.Input[dict] supplemental_group: (list maxitems:1)
        :param pulumi.Input[list] volumes: (list)

        The **allowed_csi_drivers** object supports the following:

          * `name` (`pulumi.Input[str]`) - The name of the PodSecurityPolicyTemplate (string)

        The **allowed_flex_volumes** object supports the following:

          * `driver` (`pulumi.Input[str]`)

        The **allowed_host_paths** object supports the following:

          * `pathPrefix` (`pulumi.Input[str]`) - (string)
          * `readOnly` (`pulumi.Input[bool]`) - (string)

        The **fs_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **host_ports** object supports the following:

          * `max` (`pulumi.Input[float]`) - (int)
          * `min` (`pulumi.Input[float]`) - (int)

        The **run_as_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **run_as_user** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)

        The **runtime_class** object supports the following:

          * `allowedRuntimeClassNames` (`pulumi.Input[list]`) - (list)
          * `defaultRuntimeClassName` (`pulumi.Input[str]`) - (string)

        The **se_linux** object supports the following:

          * `rule` (`pulumi.Input[str]`) - (string)
          * `seLinuxOption` (`pulumi.Input[dict]`) - (list maxitems:1)
            * `level` (`pulumi.Input[str]`) - (string)
            * `role` (`pulumi.Input[str]`) - (string)
            * `type` (`pulumi.Input[str]`) - (string)
            * `user` (`pulumi.Input[str]`) - (string)

        The **supplemental_group** object supports the following:

          * `ranges` (`pulumi.Input[list]`) - (list)
            * `max` (`pulumi.Input[float]`) - (int)
            * `min` (`pulumi.Input[float]`) - (int)

          * `rule` (`pulumi.Input[str]`) - (string)
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
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

