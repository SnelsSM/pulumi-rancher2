# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetNamespaceResult:
    """
    A collection of values returned by getNamespace.
    """
    def __init__(__self__, annotations=None, container_resource_limit=None, description=None, id=None, labels=None, name=None, project_id=None, resource_quota=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations for Node Pool object (map)
        """
        if container_resource_limit and not isinstance(container_resource_limit, dict):
            raise TypeError("Expected argument 'container_resource_limit' to be a dict")
        __self__.container_resource_limit = container_resource_limit
        """
        (Computed) Default containers resource limits on namespace (List maxitem:1)
        """
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        """
        (Computed) A namespace description (string)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        __self__.labels = labels
        """
        (Computed) Labels for Node Pool object (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        __self__.project_id = project_id
        if resource_quota and not isinstance(resource_quota, dict):
            raise TypeError("Expected argument 'resource_quota' to be a dict")
        __self__.resource_quota = resource_quota
        """
        (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
        """
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

def get_namespace(name=None,project_id=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 namespace.




    :param str name: The name of the namespace (string)
    :param str project_id: The project id where namespace is assigned (string)
    """
    __args__ = dict()


    __args__['name'] = name
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getNamespace:getNamespace', __args__, opts=opts).value

    return AwaitableGetNamespaceResult(
        annotations=__ret__.get('annotations'),
        container_resource_limit=__ret__.get('containerResourceLimit'),
        description=__ret__.get('description'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        project_id=__ret__.get('projectId'),
        resource_quota=__ret__.get('resourceQuota'))
