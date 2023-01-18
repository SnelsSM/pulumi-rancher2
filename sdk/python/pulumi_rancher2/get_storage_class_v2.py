# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetStorageClassV2Result',
    'AwaitableGetStorageClassV2Result',
    'get_storage_class_v2',
    'get_storage_class_v2_output',
]

@pulumi.output_type
class GetStorageClassV2Result:
    """
    A collection of values returned by getStorageClassV2.
    """
    def __init__(__self__, allow_volume_expansion=None, annotations=None, cluster_id=None, id=None, k8s_provisioner=None, labels=None, mount_options=None, name=None, parameters=None, reclaim_policy=None, resource_version=None, volume_binding_mode=None):
        if allow_volume_expansion and not isinstance(allow_volume_expansion, bool):
            raise TypeError("Expected argument 'allow_volume_expansion' to be a bool")
        pulumi.set(__self__, "allow_volume_expansion", allow_volume_expansion)
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if k8s_provisioner and not isinstance(k8s_provisioner, str):
            raise TypeError("Expected argument 'k8s_provisioner' to be a str")
        pulumi.set(__self__, "k8s_provisioner", k8s_provisioner)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if mount_options and not isinstance(mount_options, list):
            raise TypeError("Expected argument 'mount_options' to be a list")
        pulumi.set(__self__, "mount_options", mount_options)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parameters and not isinstance(parameters, dict):
            raise TypeError("Expected argument 'parameters' to be a dict")
        pulumi.set(__self__, "parameters", parameters)
        if reclaim_policy and not isinstance(reclaim_policy, str):
            raise TypeError("Expected argument 'reclaim_policy' to be a str")
        pulumi.set(__self__, "reclaim_policy", reclaim_policy)
        if resource_version and not isinstance(resource_version, str):
            raise TypeError("Expected argument 'resource_version' to be a str")
        pulumi.set(__self__, "resource_version", resource_version)
        if volume_binding_mode and not isinstance(volume_binding_mode, str):
            raise TypeError("Expected argument 'volume_binding_mode' to be a str")
        pulumi.set(__self__, "volume_binding_mode", volume_binding_mode)

    @property
    @pulumi.getter(name="allowVolumeExpansion")
    def allow_volume_expansion(self) -> bool:
        """
        (Computed) Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        """
        return pulumi.get(self, "allow_volume_expansion")

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for the storageClass v2 (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="k8sProvisioner")
    def k8s_provisioner(self) -> str:
        """
        (Computed) The provisioner of the storageClass v2 (string)
        """
        return pulumi.get(self, "k8s_provisioner")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (Computed) Labels for the storageClass v2 (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="mountOptions")
    def mount_options(self) -> Sequence[str]:
        """
        (Computed) The mount options for storageClass v2 (list)
        """
        return pulumi.get(self, "mount_options")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> Mapping[str, Any]:
        """
        (Computed) The parameters for storageClass v2 (string)
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="reclaimPolicy")
    def reclaim_policy(self) -> str:
        """
        (Computed) The reclaim policy for storageClass v2 (string)
        """
        return pulumi.get(self, "reclaim_policy")

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> str:
        """
        (Computed) The k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @property
    @pulumi.getter(name="volumeBindingMode")
    def volume_binding_mode(self) -> str:
        """
        (Computed) The volume binding mode for storageClass v2 (string)
        """
        return pulumi.get(self, "volume_binding_mode")


class AwaitableGetStorageClassV2Result(GetStorageClassV2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStorageClassV2Result(
            allow_volume_expansion=self.allow_volume_expansion,
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            id=self.id,
            k8s_provisioner=self.k8s_provisioner,
            labels=self.labels,
            mount_options=self.mount_options,
            name=self.name,
            parameters=self.parameters,
            reclaim_policy=self.reclaim_policy,
            resource_version=self.resource_version,
            volume_binding_mode=self.volume_binding_mode)


def get_storage_class_v2(cluster_id: Optional[str] = None,
                         name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStorageClassV2Result:
    """
    Use this data source to retrieve information about a Rancher2 Storage Class v2. Storage Class v2 resource is available at Rancher v2.5.x and above.


    :param str cluster_id: The cluster id of the storageClass V2 (string)
    :param str name: The name of the storageClass v2 (string)
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getStorageClassV2:getStorageClassV2', __args__, opts=opts, typ=GetStorageClassV2Result).value

    return AwaitableGetStorageClassV2Result(
        allow_volume_expansion=__ret__.allow_volume_expansion,
        annotations=__ret__.annotations,
        cluster_id=__ret__.cluster_id,
        id=__ret__.id,
        k8s_provisioner=__ret__.k8s_provisioner,
        labels=__ret__.labels,
        mount_options=__ret__.mount_options,
        name=__ret__.name,
        parameters=__ret__.parameters,
        reclaim_policy=__ret__.reclaim_policy,
        resource_version=__ret__.resource_version,
        volume_binding_mode=__ret__.volume_binding_mode)


@_utilities.lift_output_func(get_storage_class_v2)
def get_storage_class_v2_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                name: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStorageClassV2Result]:
    """
    Use this data source to retrieve information about a Rancher2 Storage Class v2. Storage Class v2 resource is available at Rancher v2.5.x and above.


    :param str cluster_id: The cluster id of the storageClass V2 (string)
    :param str name: The name of the storageClass v2 (string)
    """
    ...
