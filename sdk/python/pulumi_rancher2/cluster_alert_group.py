# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ClusterAlertGroupArgs', 'ClusterAlertGroup']

@pulumi.input_type
class ClusterAlertGroupArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a ClusterAlertGroup resource.
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
        """
        ClusterAlertGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            annotations=annotations,
            description=description,
            group_interval_seconds=group_interval_seconds,
            group_wait_seconds=group_wait_seconds,
            labels=labels,
            name=name,
            recipients=recipients,
            repeat_interval_seconds=repeat_interval_seconds,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             group_interval_seconds: Optional[pulumi.Input[int]] = None,
             group_wait_seconds: Optional[pulumi.Input[int]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             recipients: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]] = None,
             repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_id is None:
            raise TypeError("Missing 'cluster_id' argument")
        if group_interval_seconds is None and 'groupIntervalSeconds' in kwargs:
            group_interval_seconds = kwargs['groupIntervalSeconds']
        if group_wait_seconds is None and 'groupWaitSeconds' in kwargs:
            group_wait_seconds = kwargs['groupWaitSeconds']
        if repeat_interval_seconds is None and 'repeatIntervalSeconds' in kwargs:
            repeat_interval_seconds = kwargs['repeatIntervalSeconds']

        _setter("cluster_id", cluster_id)
        if annotations is not None:
            _setter("annotations", annotations)
        if description is not None:
            _setter("description", description)
        if group_interval_seconds is not None:
            _setter("group_interval_seconds", group_interval_seconds)
        if group_wait_seconds is not None:
            _setter("group_wait_seconds", group_wait_seconds)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if recipients is not None:
            _setter("recipients", recipients)
        if repeat_interval_seconds is not None:
            _setter("repeat_interval_seconds", repeat_interval_seconds)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The cluster id where create cluster alert group (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The cluster alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster alert group description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @group_interval_seconds.setter
    def group_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_interval_seconds", value)

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @group_wait_seconds.setter
    def group_wait_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_wait_seconds", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The cluster alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster alert group name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def recipients(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]]:
        """
        The cluster alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @recipients.setter
    def recipients(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]]):
        pulumi.set(self, "recipients", value)

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @repeat_interval_seconds.setter
    def repeat_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "repeat_interval_seconds", value)


@pulumi.input_type
class _ClusterAlertGroupState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering ClusterAlertGroup resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
        """
        _ClusterAlertGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            annotations=annotations,
            cluster_id=cluster_id,
            description=description,
            group_interval_seconds=group_interval_seconds,
            group_wait_seconds=group_wait_seconds,
            labels=labels,
            name=name,
            recipients=recipients,
            repeat_interval_seconds=repeat_interval_seconds,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             group_interval_seconds: Optional[pulumi.Input[int]] = None,
             group_wait_seconds: Optional[pulumi.Input[int]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             recipients: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]] = None,
             repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if group_interval_seconds is None and 'groupIntervalSeconds' in kwargs:
            group_interval_seconds = kwargs['groupIntervalSeconds']
        if group_wait_seconds is None and 'groupWaitSeconds' in kwargs:
            group_wait_seconds = kwargs['groupWaitSeconds']
        if repeat_interval_seconds is None and 'repeatIntervalSeconds' in kwargs:
            repeat_interval_seconds = kwargs['repeatIntervalSeconds']

        if annotations is not None:
            _setter("annotations", annotations)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if description is not None:
            _setter("description", description)
        if group_interval_seconds is not None:
            _setter("group_interval_seconds", group_interval_seconds)
        if group_wait_seconds is not None:
            _setter("group_wait_seconds", group_wait_seconds)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if recipients is not None:
            _setter("recipients", recipients)
        if repeat_interval_seconds is not None:
            _setter("repeat_interval_seconds", repeat_interval_seconds)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The cluster alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id where create cluster alert group (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster alert group description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @group_interval_seconds.setter
    def group_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_interval_seconds", value)

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @group_wait_seconds.setter
    def group_wait_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_wait_seconds", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The cluster alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster alert group name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def recipients(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]]:
        """
        The cluster alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @recipients.setter
    def recipients(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterAlertGroupRecipientArgs']]]]):
        pulumi.set(self, "recipients", value)

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The cluster alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @repeat_interval_seconds.setter
    def repeat_interval_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "repeat_interval_seconds", value)


class ClusterAlertGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.

        ## Import

        Cluster Alert Group can be imported using the Rancher cluster alert group ID

        ```sh
         $ pulumi import rancher2:index/clusterAlertGroup:ClusterAlertGroup foo &lt;CLUSTER_ALERT_GROUP_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterAlertGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.

        ## Import

        Cluster Alert Group can be imported using the Rancher cluster alert group ID

        ```sh
         $ pulumi import rancher2:index/clusterAlertGroup:ClusterAlertGroup foo &lt;CLUSTER_ALERT_GROUP_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ClusterAlertGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterAlertGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ClusterAlertGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterAlertGroupArgs.__new__(ClusterAlertGroupArgs)

            __props__.__dict__["annotations"] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["description"] = description
            __props__.__dict__["group_interval_seconds"] = group_interval_seconds
            __props__.__dict__["group_wait_seconds"] = group_wait_seconds
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["recipients"] = recipients
            __props__.__dict__["repeat_interval_seconds"] = repeat_interval_seconds
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="rancher2:index/clusterAlterGroup:ClusterAlterGroup")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ClusterAlertGroup, __self__).__init__(
            'rancher2:index/clusterAlertGroup:ClusterAlertGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[int]] = None,
            group_wait_seconds: Optional[pulumi.Input[int]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            recipients: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[int]] = None) -> 'ClusterAlertGroup':
        """
        Get an existing ClusterAlertGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[int] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[int] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[int] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterAlertGroupState.__new__(_ClusterAlertGroupState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["description"] = description
        __props__.__dict__["group_interval_seconds"] = group_interval_seconds
        __props__.__dict__["group_wait_seconds"] = group_wait_seconds
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["recipients"] = recipients
        __props__.__dict__["repeat_interval_seconds"] = repeat_interval_seconds
        return ClusterAlertGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The cluster alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id where create cluster alert group (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The cluster alert group description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The cluster alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The cluster alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The cluster alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The cluster alert group name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def recipients(self) -> pulumi.Output[Optional[Sequence['outputs.ClusterAlertGroupRecipient']]]:
        """
        The cluster alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The cluster alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

