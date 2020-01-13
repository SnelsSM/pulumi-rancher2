# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetProjectResult:
    """
    A collection of values returned by getProject.
    """
    def __init__(__self__, annotations=None, cluster_id=None, container_resource_limit=None, description=None, enable_project_monitoring=None, labels=None, name=None, pod_security_policy_template_id=None, resource_quota=None, uuid=None, id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations of the rancher2 project (map)
        """
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        __self__.cluster_id = cluster_id
        if container_resource_limit and not isinstance(container_resource_limit, dict):
            raise TypeError("Expected argument 'container_resource_limit' to be a dict")
        __self__.container_resource_limit = container_resource_limit
        """
        (Computed) Default containers resource limits on project (List maxitem:1)
        """
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        """
        (Computed) The project's description (string)
        """
        if enable_project_monitoring and not isinstance(enable_project_monitoring, bool):
            raise TypeError("Expected argument 'enable_project_monitoring' to be a bool")
        __self__.enable_project_monitoring = enable_project_monitoring
        """
        (Computed) Enable built-in project monitoring. Default `false` (bool)
        """
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        __self__.labels = labels
        """
        (Computed) Labels of the rancher2 project (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if pod_security_policy_template_id and not isinstance(pod_security_policy_template_id, str):
            raise TypeError("Expected argument 'pod_security_policy_template_id' to be a str")
        __self__.pod_security_policy_template_id = pod_security_policy_template_id
        """
        (Computed) Default Pod Security Policy ID for the project (string)
        """
        if resource_quota and not isinstance(resource_quota, dict):
            raise TypeError("Expected argument 'resource_quota' to be a dict")
        __self__.resource_quota = resource_quota
        """
        (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        """
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        __self__.uuid = uuid
        """
        (Computed) UUID of the project as stored by Rancher 2 (string)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
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
            enable_project_monitoring=self.enable_project_monitoring,
            labels=self.labels,
            name=self.name,
            pod_security_policy_template_id=self.pod_security_policy_template_id,
            resource_quota=self.resource_quota,
            uuid=self.uuid,
            id=self.id)

def get_project(cluster_id=None,name=None,opts=None):
    """
    Use this data source to access information about an existing resource.
    
    :param str cluster_id: ID of the Rancher 2 cluster (string)
    :param str name: The project name (string)

    > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/project.html.markdown.
    """
    __args__ = dict()

    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProject:getProject', __args__, opts=opts).value

    return AwaitableGetProjectResult(
        annotations=__ret__.get('annotations'),
        cluster_id=__ret__.get('clusterId'),
        container_resource_limit=__ret__.get('containerResourceLimit'),
        description=__ret__.get('description'),
        enable_project_monitoring=__ret__.get('enableProjectMonitoring'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        pod_security_policy_template_id=__ret__.get('podSecurityPolicyTemplateId'),
        resource_quota=__ret__.get('resourceQuota'),
        uuid=__ret__.get('uuid'),
        id=__ret__.get('id'))
