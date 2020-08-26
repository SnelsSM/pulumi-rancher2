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
    'GetClusterAlertGroupResult',
    'AwaitableGetClusterAlertGroupResult',
    'get_cluster_alert_group',
]

@pulumi.output_type
class GetClusterAlertGroupResult:
    """
    A collection of values returned by getClusterAlertGroup.
    """
    def __init__(__self__, annotations=None, cluster_id=None, description=None, group_interval_seconds=None, group_wait_seconds=None, id=None, labels=None, name=None, recipients=None, repeat_interval_seconds=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if group_interval_seconds and not isinstance(group_interval_seconds, float):
            raise TypeError("Expected argument 'group_interval_seconds' to be a float")
        pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds and not isinstance(group_wait_seconds, float):
            raise TypeError("Expected argument 'group_wait_seconds' to be a float")
        pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if recipients and not isinstance(recipients, list):
            raise TypeError("Expected argument 'recipients' to be a list")
        pulumi.set(__self__, "recipients", recipients)
        if repeat_interval_seconds and not isinstance(repeat_interval_seconds, float):
            raise TypeError("Expected argument 'repeat_interval_seconds' to be a float")
        pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) The cluster alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) The cluster alert group description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> float:
        """
        (Computed) The cluster alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> float:
        """
        (Computed) The cluster alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

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
        (Computed) The cluster alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def recipients(self) -> List['outputs.GetClusterAlertGroupRecipientResult']:
        """
        (Computed) The cluster alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> float:
        """
        (Computed) The cluster alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")


class AwaitableGetClusterAlertGroupResult(GetClusterAlertGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterAlertGroupResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            description=self.description,
            group_interval_seconds=self.group_interval_seconds,
            group_wait_seconds=self.group_wait_seconds,
            id=self.id,
            labels=self.labels,
            name=self.name,
            recipients=self.recipients,
            repeat_interval_seconds=self.repeat_interval_seconds)


def get_cluster_alert_group(cluster_id: Optional[str] = None,
                            name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterAlertGroupResult:
    """
    Use this data source to retrieve information about a Rancher v2 cluster alert group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_alert_group(cluster_id="<cluster_id>",
        name="<cluster_alert_group_name>")
    ```


    :param str cluster_id: The cluster id where create cluster alert group (string)
    :param str name: The cluster alert group name (string)
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterAlertGroup:getClusterAlertGroup', __args__, opts=opts, typ=GetClusterAlertGroupResult).value

    return AwaitableGetClusterAlertGroupResult(
        annotations=__ret__.annotations,
        cluster_id=__ret__.cluster_id,
        description=__ret__.description,
        group_interval_seconds=__ret__.group_interval_seconds,
        group_wait_seconds=__ret__.group_wait_seconds,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        recipients=__ret__.recipients,
        repeat_interval_seconds=__ret__.repeat_interval_seconds)
