# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ProjectAlertGroupArgs', 'ProjectAlertGroup']

@pulumi.input_type
class ProjectAlertGroupArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectAlertGroupRecipientArgs']]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a ProjectAlertGroup resource.
        :param pulumi.Input[str] project_id: The project id where create project alert group (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert group annotations (map)
        :param pulumi.Input[str] description: The project alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert group labels (map)
        :param pulumi.Input[str] name: The project alert group name (string)
        :param pulumi.Input[Sequence[pulumi.Input['ProjectAlertGroupRecipientArgs']]] recipients: The project alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert group wait seconds. Default: `3600` (int)
        """
        pulumi.set(__self__, "project_id", project_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if group_interval_seconds is not None:
            pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds is not None:
            pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recipients is not None:
            pulumi.set(__self__, "recipients", recipients)
        if repeat_interval_seconds is not None:
            pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The project id where create project alert group (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert group description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @group_interval_seconds.setter
    def group_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_interval_seconds", value)

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @group_wait_seconds.setter
    def group_wait_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_wait_seconds", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The project alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The project alert group name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def recipients(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProjectAlertGroupRecipientArgs']]]]:
        """
        The project alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @recipients.setter
    def recipients(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectAlertGroupRecipientArgs']]]]):
        pulumi.set(self, "recipients", value)

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The project alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @repeat_interval_seconds.setter
    def repeat_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "repeat_interval_seconds", value)


class ProjectAlertGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectAlertGroupRecipientArgs']]]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Project Alert Group resource. This can be used to create Project Alert Group for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Project Alert Group
        foo = rancher2.ProjectAlertGroup("foo",
            description="Terraform project alert group",
            group_interval_seconds=300,
            project_id="<project_id>",
            repeat_interval_seconds=3600)
        ```

        ## Import

        Project Alert Group can be imported using the Rancher project alert group ID

        ```sh
         $ pulumi import rancher2:index/projectAlertGroup:ProjectAlertGroup foo &lt;project_alert_group_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert group annotations (map)
        :param pulumi.Input[str] description: The project alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert group labels (map)
        :param pulumi.Input[str] name: The project alert group name (string)
        :param pulumi.Input[str] project_id: The project id where create project alert group (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectAlertGroupRecipientArgs']]]] recipients: The project alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert group wait seconds. Default: `3600` (int)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectAlertGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Project Alert Group resource. This can be used to create Project Alert Group for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Project Alert Group
        foo = rancher2.ProjectAlertGroup("foo",
            description="Terraform project alert group",
            group_interval_seconds=300,
            project_id="<project_id>",
            repeat_interval_seconds=3600)
        ```

        ## Import

        Project Alert Group can be imported using the Rancher project alert group ID

        ```sh
         $ pulumi import rancher2:index/projectAlertGroup:ProjectAlertGroup foo &lt;project_alert_group_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ProjectAlertGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectAlertGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectAlertGroupRecipientArgs']]]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['annotations'] = annotations
            __props__['description'] = description
            __props__['group_interval_seconds'] = group_interval_seconds
            __props__['group_wait_seconds'] = group_wait_seconds
            __props__['labels'] = labels
            __props__['name'] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['recipients'] = recipients
            __props__['repeat_interval_seconds'] = repeat_interval_seconds
        super(ProjectAlertGroup, __self__).__init__(
            'rancher2:index/projectAlertGroup:ProjectAlertGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[int]] = None,
            group_wait_seconds: Optional[pulumi.Input[int]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectAlertGroupRecipientArgs']]]]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[int]] = None) -> 'ProjectAlertGroup':
        """
        Get an existing ProjectAlertGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert group annotations (map)
        :param pulumi.Input[str] description: The project alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The project alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The project alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert group labels (map)
        :param pulumi.Input[str] name: The project alert group name (string)
        :param pulumi.Input[str] project_id: The project id where create project alert group (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectAlertGroupRecipientArgs']]]] recipients: The project alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The project alert group wait seconds. Default: `3600` (int)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["description"] = description
        __props__["group_interval_seconds"] = group_interval_seconds
        __props__["group_wait_seconds"] = group_wait_seconds
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["project_id"] = project_id
        __props__["recipients"] = recipients
        __props__["repeat_interval_seconds"] = repeat_interval_seconds
        return ProjectAlertGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The project alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The project alert group description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The project alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The project alert group name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id where create project alert group (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def recipients(self) -> pulumi.Output[Optional[Sequence['outputs.ProjectAlertGroupRecipient']]]:
        """
        The project alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The project alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

