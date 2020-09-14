# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetNamespaceResult',
    'AwaitableGetNamespaceResult',
    'get_namespace',
]

@pulumi.output_type
class GetNamespaceResult:
    """
    A collection of values returned by getNamespace.
    """
    def __init__(__self__, annotations=None, container_resource_limit=None, description=None, id=None, labels=None, name=None, project_id=None, resource_quota=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if container_resource_limit and not isinstance(container_resource_limit, dict):
            raise TypeError("Expected argument 'container_resource_limit' to be a dict")
        pulumi.set(__self__, "container_resource_limit", container_resource_limit)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
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
        if resource_quota and not isinstance(resource_quota, dict):
            raise TypeError("Expected argument 'resource_quota' to be a dict")
        pulumi.set(__self__, "resource_quota", resource_quota)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="containerResourceLimit")
    def container_resource_limit(self) -> 'outputs.GetNamespaceContainerResourceLimitResult':
        """
        (Computed) Default containers resource limits on namespace (List maxitem:1)
        """
        return pulumi.get(self, "container_resource_limit")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) A namespace description (string)
        """
        return pulumi.get(self, "description")

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
        (Computed) Labels for Node Pool object (map)
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
    @pulumi.getter(name="resourceQuota")
    def resource_quota(self) -> 'outputs.GetNamespaceResourceQuotaResult':
        """
        (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        """
        return pulumi.get(self, "resource_quota")


class AwaitableGetNamespaceResult(GetNamespaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNamespaceResult(
            annotations=self.annotations,
            container_resource_limit=self.container_resource_limit,
            description=self.description,
            id=self.id,
            labels=self.labels,
            name=self.name,
            project_id=self.project_id,
            resource_quota=self.resource_quota)


def get_namespace(name: Optional[str] = None,
                  project_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNamespaceResult:
    """
    Use this data source to retrieve information about a Rancher v2 namespace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_namespace(name="foo",
        project_id=rancher2_cluster["foo-custom"]["default_project_id"])
    ```


    :param str name: The name of the namespace (string)
    :param str project_id: The project id where namespace is assigned (string)
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getNamespace:getNamespace', __args__, opts=opts, typ=GetNamespaceResult).value

    return AwaitableGetNamespaceResult(
        annotations=__ret__.annotations,
        container_resource_limit=__ret__.container_resource_limit,
        description=__ret__.description,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        project_id=__ret__.project_id,
        resource_quota=__ret__.resource_quota)
