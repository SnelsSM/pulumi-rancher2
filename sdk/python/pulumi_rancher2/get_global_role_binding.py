# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetGlobalRoleBindingResult',
    'AwaitableGetGlobalRoleBindingResult',
    'get_global_role_binding',
    'get_global_role_binding_output',
]

@pulumi.output_type
class GetGlobalRoleBindingResult:
    """
    A collection of values returned by getGlobalRoleBinding.
    """
    def __init__(__self__, annotations=None, global_role_id=None, group_principal_id=None, id=None, labels=None, name=None, user_id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if global_role_id and not isinstance(global_role_id, str):
            raise TypeError("Expected argument 'global_role_id' to be a str")
        pulumi.set(__self__, "global_role_id", global_role_id)
        if group_principal_id and not isinstance(group_principal_id, str):
            raise TypeError("Expected argument 'group_principal_id' to be a str")
        pulumi.set(__self__, "group_principal_id", group_principal_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="globalRoleId")
    def global_role_id(self) -> str:
        return pulumi.get(self, "global_role_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> str:
        """
        (Computed) The group principal ID to assign global role binding. Rancher v2.4.0 or higher is required (string)
        """
        return pulumi.get(self, "group_principal_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (Computed) Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        (Computed) The user ID to assign global role binding (string)
        """
        return pulumi.get(self, "user_id")


class AwaitableGetGlobalRoleBindingResult(GetGlobalRoleBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalRoleBindingResult(
            annotations=self.annotations,
            global_role_id=self.global_role_id,
            group_principal_id=self.group_principal_id,
            id=self.id,
            labels=self.labels,
            name=self.name,
            user_id=self.user_id)


def get_global_role_binding(global_role_id: Optional[str] = None,
                            name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalRoleBindingResult:
    """
    Use this data source to retrieve information about a Rancher v2 global role binding.


    :param str global_role_id: The global role id (string)
    :param str name: The name of the global role binding (string)
    """
    __args__ = dict()
    __args__['globalRoleId'] = global_role_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getGlobalRoleBinding:getGlobalRoleBinding', __args__, opts=opts, typ=GetGlobalRoleBindingResult).value

    return AwaitableGetGlobalRoleBindingResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        global_role_id=pulumi.get(__ret__, 'global_role_id'),
        group_principal_id=pulumi.get(__ret__, 'group_principal_id'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        user_id=pulumi.get(__ret__, 'user_id'))


@_utilities.lift_output_func(get_global_role_binding)
def get_global_role_binding_output(global_role_id: Optional[pulumi.Input[Optional[str]]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalRoleBindingResult]:
    """
    Use this data source to retrieve information about a Rancher v2 global role binding.


    :param str global_role_id: The global role id (string)
    :param str name: The name of the global role binding (string)
    """
    ...
