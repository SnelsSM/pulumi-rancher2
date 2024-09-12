# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetProjectResult',
    'AwaitableGetProjectResult',
    'get_project',
    'get_project_output',
]

@pulumi.output_type
class GetProjectResult:
    """
    A collection of values returned by getProject.
    """
    def __init__(__self__, annotations=None, cluster_id=None, container_resource_limit=None, description=None, id=None, labels=None, name=None, resource_quota=None, uuid=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
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
        if resource_quota and not isinstance(resource_quota, dict):
            raise TypeError("Expected argument 'resource_quota' to be a dict")
        pulumi.set(__self__, "resource_quota", resource_quota)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, str]:
        """
        (Computed) Annotations of the rancher2 project (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="containerResourceLimit")
    def container_resource_limit(self) -> 'outputs.GetProjectContainerResourceLimitResult':
        """
        (Computed) Default containers resource limits on project (List maxitem:1)
        """
        return pulumi.get(self, "container_resource_limit")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) The project's description (string)
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
    def labels(self) -> Mapping[str, str]:
        """
        (Computed) Labels of the rancher2 project (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceQuota")
    def resource_quota(self) -> 'outputs.GetProjectResourceQuotaResult':
        """
        (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        """
        return pulumi.get(self, "resource_quota")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        (Computed) UUID of the project as stored by Rancher 2 (string)
        """
        return pulumi.get(self, "uuid")


class AwaitableGetProjectResult(GetProjectResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            container_resource_limit=self.container_resource_limit,
            description=self.description,
            id=self.id,
            labels=self.labels,
            name=self.name,
            resource_quota=self.resource_quota,
            uuid=self.uuid)


def get_project(cluster_id: Optional[str] = None,
                name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectResult:
    """
    ## Example Usage


    :param str cluster_id: ID of the Rancher 2 cluster (string)
    :param str name: The project name (string)
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProject:getProject', __args__, opts=opts, typ=GetProjectResult).value

    return AwaitableGetProjectResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        container_resource_limit=pulumi.get(__ret__, 'container_resource_limit'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        resource_quota=pulumi.get(__ret__, 'resource_quota'),
        uuid=pulumi.get(__ret__, 'uuid'))


@_utilities.lift_output_func(get_project)
def get_project_output(cluster_id: Optional[pulumi.Input[str]] = None,
                       name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectResult]:
    """
    ## Example Usage


    :param str cluster_id: ID of the Rancher 2 cluster (string)
    :param str name: The project name (string)
    """
    ...
