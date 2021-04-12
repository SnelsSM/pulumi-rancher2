# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'GetProjectRoleTemplateBindingResult',
    'AwaitableGetProjectRoleTemplateBindingResult',
    'get_project_role_template_binding',
]

@pulumi.output_type
class GetProjectRoleTemplateBindingResult:
    """
    A collection of values returned by getProjectRoleTemplateBinding.
    """
    def __init__(__self__, annotations=None, group_id=None, group_principal_id=None, id=None, labels=None, name=None, project_id=None, role_template_id=None, user_id=None, user_principal_id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        pulumi.set(__self__, "group_id", group_id)
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
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if role_template_id and not isinstance(role_template_id, str):
            raise TypeError("Expected argument 'role_template_id' to be a str")
        pulumi.set(__self__, "role_template_id", role_template_id)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)
        if user_principal_id and not isinstance(user_principal_id, str):
            raise TypeError("Expected argument 'user_principal_id' to be a str")
        pulumi.set(__self__, "user_principal_id", user_principal_id)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        (Computed) The group ID to assign project role template binding (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> str:
        """
        (Computed) The group_principal ID to assign project role template binding (string)
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
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> str:
        return pulumi.get(self, "role_template_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        (Computed) The user ID to assign project role template binding (string)
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> str:
        """
        (Computed) The user_principal ID to assign project role template binding (string)
        """
        return pulumi.get(self, "user_principal_id")


class AwaitableGetProjectRoleTemplateBindingResult(GetProjectRoleTemplateBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectRoleTemplateBindingResult(
            annotations=self.annotations,
            group_id=self.group_id,
            group_principal_id=self.group_principal_id,
            id=self.id,
            labels=self.labels,
            name=self.name,
            project_id=self.project_id,
            role_template_id=self.role_template_id,
            user_id=self.user_id,
            user_principal_id=self.user_principal_id)


def get_project_role_template_binding(name: Optional[str] = None,
                                      project_id: Optional[str] = None,
                                      role_template_id: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectRoleTemplateBindingResult:
    """
    Use this data source to retrieve information about a Rancher v2 project role template binding.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_project_role_template_binding(name="foo",
        project_id="foo_id")
    ```


    :param str name: The name of the project role template binding (string)
    :param str project_id: The project id where bind project role template (string)
    :param str role_template_id: The role template id from create project role template binding (string)
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    __args__['roleTemplateId'] = role_template_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProjectRoleTemplateBinding:getProjectRoleTemplateBinding', __args__, opts=opts, typ=GetProjectRoleTemplateBindingResult).value

    return AwaitableGetProjectRoleTemplateBindingResult(
        annotations=__ret__.annotations,
        group_id=__ret__.group_id,
        group_principal_id=__ret__.group_principal_id,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        project_id=__ret__.project_id,
        role_template_id=__ret__.role_template_id,
        user_id=__ret__.user_id,
        user_principal_id=__ret__.user_principal_id)
