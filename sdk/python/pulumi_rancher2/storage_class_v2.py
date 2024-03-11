# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['StorageClassV2Args', 'StorageClassV2']

@pulumi.input_type
class StorageClassV2Args:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 k8s_provisioner: pulumi.Input[str],
                 allow_volume_expansion: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 mount_options: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 reclaim_policy: Optional[pulumi.Input[str]] = None,
                 volume_binding_mode: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a StorageClassV2 resource.
        :param pulumi.Input[str] cluster_id: The cluster id of the storageClass V2 (string)
        :param pulumi.Input[str] k8s_provisioner: The provisioner of the storageClass v2 (string)
        :param pulumi.Input[bool] allow_volume_expansion: Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the storageClass v2 (map)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the storageClass v2 (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] mount_options: The mount options for storageClass v2 (list)
        :param pulumi.Input[str] name: The name of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] parameters: The parameters for storageClass v2 (string)
        :param pulumi.Input[str] reclaim_policy: The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        :param pulumi.Input[str] volume_binding_mode: The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "k8s_provisioner", k8s_provisioner)
        if allow_volume_expansion is not None:
            pulumi.set(__self__, "allow_volume_expansion", allow_volume_expansion)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if mount_options is not None:
            pulumi.set(__self__, "mount_options", mount_options)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if reclaim_policy is not None:
            pulumi.set(__self__, "reclaim_policy", reclaim_policy)
        if volume_binding_mode is not None:
            pulumi.set(__self__, "volume_binding_mode", volume_binding_mode)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The cluster id of the storageClass V2 (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="k8sProvisioner")
    def k8s_provisioner(self) -> pulumi.Input[str]:
        """
        The provisioner of the storageClass v2 (string)
        """
        return pulumi.get(self, "k8s_provisioner")

    @k8s_provisioner.setter
    def k8s_provisioner(self, value: pulumi.Input[str]):
        pulumi.set(self, "k8s_provisioner", value)

    @property
    @pulumi.getter(name="allowVolumeExpansion")
    def allow_volume_expansion(self) -> Optional[pulumi.Input[bool]]:
        """
        Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        """
        return pulumi.get(self, "allow_volume_expansion")

    @allow_volume_expansion.setter
    def allow_volume_expansion(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_volume_expansion", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the storageClass v2 (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the storageClass v2 (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="mountOptions")
    def mount_options(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The mount options for storageClass v2 (list)
        """
        return pulumi.get(self, "mount_options")

    @mount_options.setter
    def mount_options(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mount_options", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the storageClass v2 (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The parameters for storageClass v2 (string)
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter(name="reclaimPolicy")
    def reclaim_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        """
        return pulumi.get(self, "reclaim_policy")

    @reclaim_policy.setter
    def reclaim_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reclaim_policy", value)

    @property
    @pulumi.getter(name="volumeBindingMode")
    def volume_binding_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        return pulumi.get(self, "volume_binding_mode")

    @volume_binding_mode.setter
    def volume_binding_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume_binding_mode", value)


@pulumi.input_type
class _StorageClassV2State:
    def __init__(__self__, *,
                 allow_volume_expansion: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 k8s_provisioner: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 mount_options: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 reclaim_policy: Optional[pulumi.Input[str]] = None,
                 resource_version: Optional[pulumi.Input[str]] = None,
                 volume_binding_mode: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StorageClassV2 resources.
        :param pulumi.Input[bool] allow_volume_expansion: Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the storageClass v2 (map)
        :param pulumi.Input[str] cluster_id: The cluster id of the storageClass V2 (string)
        :param pulumi.Input[str] k8s_provisioner: The provisioner of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the storageClass v2 (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] mount_options: The mount options for storageClass v2 (list)
        :param pulumi.Input[str] name: The name of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] parameters: The parameters for storageClass v2 (string)
        :param pulumi.Input[str] reclaim_policy: The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        :param pulumi.Input[str] resource_version: (Computed) The k8s resource version (string)
        :param pulumi.Input[str] volume_binding_mode: The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        if allow_volume_expansion is not None:
            pulumi.set(__self__, "allow_volume_expansion", allow_volume_expansion)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if k8s_provisioner is not None:
            pulumi.set(__self__, "k8s_provisioner", k8s_provisioner)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if mount_options is not None:
            pulumi.set(__self__, "mount_options", mount_options)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if reclaim_policy is not None:
            pulumi.set(__self__, "reclaim_policy", reclaim_policy)
        if resource_version is not None:
            pulumi.set(__self__, "resource_version", resource_version)
        if volume_binding_mode is not None:
            pulumi.set(__self__, "volume_binding_mode", volume_binding_mode)

    @property
    @pulumi.getter(name="allowVolumeExpansion")
    def allow_volume_expansion(self) -> Optional[pulumi.Input[bool]]:
        """
        Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        """
        return pulumi.get(self, "allow_volume_expansion")

    @allow_volume_expansion.setter
    def allow_volume_expansion(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_volume_expansion", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the storageClass v2 (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id of the storageClass V2 (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="k8sProvisioner")
    def k8s_provisioner(self) -> Optional[pulumi.Input[str]]:
        """
        The provisioner of the storageClass v2 (string)
        """
        return pulumi.get(self, "k8s_provisioner")

    @k8s_provisioner.setter
    def k8s_provisioner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "k8s_provisioner", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the storageClass v2 (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="mountOptions")
    def mount_options(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The mount options for storageClass v2 (list)
        """
        return pulumi.get(self, "mount_options")

    @mount_options.setter
    def mount_options(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mount_options", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the storageClass v2 (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The parameters for storageClass v2 (string)
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter(name="reclaimPolicy")
    def reclaim_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        """
        return pulumi.get(self, "reclaim_policy")

    @reclaim_policy.setter
    def reclaim_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reclaim_policy", value)

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @resource_version.setter
    def resource_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_version", value)

    @property
    @pulumi.getter(name="volumeBindingMode")
    def volume_binding_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        return pulumi.get(self, "volume_binding_mode")

    @volume_binding_mode.setter
    def volume_binding_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume_binding_mode", value)


class StorageClassV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_volume_expansion: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 k8s_provisioner: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 mount_options: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 reclaim_policy: Optional[pulumi.Input[str]] = None,
                 volume_binding_mode: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher Storage Class v2 resource. This can be used to manage k8s storage classes for Rancher v2 clusters and retrieve their information. Storage Class v2 resource is available at Rancher v2.5.x and above.

        ## Import

        V2 storage classs can be imported using the Rancher cluster ID and StorageClass V2 name.

        ```sh
        $ pulumi import rancher2:index/storageClassV2:StorageClassV2 foo &lt;CLUSTER_ID&gt;.&lt;STORAGE_CLASS_V2_NAME&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_volume_expansion: Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the storageClass v2 (map)
        :param pulumi.Input[str] cluster_id: The cluster id of the storageClass V2 (string)
        :param pulumi.Input[str] k8s_provisioner: The provisioner of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the storageClass v2 (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] mount_options: The mount options for storageClass v2 (list)
        :param pulumi.Input[str] name: The name of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] parameters: The parameters for storageClass v2 (string)
        :param pulumi.Input[str] reclaim_policy: The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        :param pulumi.Input[str] volume_binding_mode: The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StorageClassV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher Storage Class v2 resource. This can be used to manage k8s storage classes for Rancher v2 clusters and retrieve their information. Storage Class v2 resource is available at Rancher v2.5.x and above.

        ## Import

        V2 storage classs can be imported using the Rancher cluster ID and StorageClass V2 name.

        ```sh
        $ pulumi import rancher2:index/storageClassV2:StorageClassV2 foo &lt;CLUSTER_ID&gt;.&lt;STORAGE_CLASS_V2_NAME&gt;
        ```

        :param str resource_name: The name of the resource.
        :param StorageClassV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageClassV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_volume_expansion: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 k8s_provisioner: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 mount_options: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 reclaim_policy: Optional[pulumi.Input[str]] = None,
                 volume_binding_mode: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageClassV2Args.__new__(StorageClassV2Args)

            __props__.__dict__["allow_volume_expansion"] = allow_volume_expansion
            __props__.__dict__["annotations"] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if k8s_provisioner is None and not opts.urn:
                raise TypeError("Missing required property 'k8s_provisioner'")
            __props__.__dict__["k8s_provisioner"] = k8s_provisioner
            __props__.__dict__["labels"] = labels
            __props__.__dict__["mount_options"] = mount_options
            __props__.__dict__["name"] = name
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["reclaim_policy"] = reclaim_policy
            __props__.__dict__["volume_binding_mode"] = volume_binding_mode
            __props__.__dict__["resource_version"] = None
        super(StorageClassV2, __self__).__init__(
            'rancher2:index/storageClassV2:StorageClassV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_volume_expansion: Optional[pulumi.Input[bool]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            k8s_provisioner: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            mount_options: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            reclaim_policy: Optional[pulumi.Input[str]] = None,
            resource_version: Optional[pulumi.Input[str]] = None,
            volume_binding_mode: Optional[pulumi.Input[str]] = None) -> 'StorageClassV2':
        """
        Get an existing StorageClassV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_volume_expansion: Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the storageClass v2 (map)
        :param pulumi.Input[str] cluster_id: The cluster id of the storageClass V2 (string)
        :param pulumi.Input[str] k8s_provisioner: The provisioner of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the storageClass v2 (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] mount_options: The mount options for storageClass v2 (list)
        :param pulumi.Input[str] name: The name of the storageClass v2 (string)
        :param pulumi.Input[Mapping[str, Any]] parameters: The parameters for storageClass v2 (string)
        :param pulumi.Input[str] reclaim_policy: The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        :param pulumi.Input[str] resource_version: (Computed) The k8s resource version (string)
        :param pulumi.Input[str] volume_binding_mode: The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageClassV2State.__new__(_StorageClassV2State)

        __props__.__dict__["allow_volume_expansion"] = allow_volume_expansion
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["k8s_provisioner"] = k8s_provisioner
        __props__.__dict__["labels"] = labels
        __props__.__dict__["mount_options"] = mount_options
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["reclaim_policy"] = reclaim_policy
        __props__.__dict__["resource_version"] = resource_version
        __props__.__dict__["volume_binding_mode"] = volume_binding_mode
        return StorageClassV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowVolumeExpansion")
    def allow_volume_expansion(self) -> pulumi.Output[bool]:
        """
        Is the provisioner of the storageClass v2 allowing volume expansion? (bool)
        """
        return pulumi.get(self, "allow_volume_expansion")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for the storageClass v2 (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id of the storageClass V2 (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="k8sProvisioner")
    def k8s_provisioner(self) -> pulumi.Output[str]:
        """
        The provisioner of the storageClass v2 (string)
        """
        return pulumi.get(self, "k8s_provisioner")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for the storageClass v2 (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="mountOptions")
    def mount_options(self) -> pulumi.Output[Sequence[str]]:
        """
        The mount options for storageClass v2 (list)
        """
        return pulumi.get(self, "mount_options")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the storageClass v2 (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The parameters for storageClass v2 (string)
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="reclaimPolicy")
    def reclaim_policy(self) -> pulumi.Output[Optional[str]]:
        """
        The reclaim policy for storageClass v2. `Delete`, `Recycle` and `Retain` values are allowed. Default: `Delete` (string)
        """
        return pulumi.get(self, "reclaim_policy")

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> pulumi.Output[str]:
        """
        (Computed) The k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @property
    @pulumi.getter(name="volumeBindingMode")
    def volume_binding_mode(self) -> pulumi.Output[Optional[str]]:
        """
        The volume binding mode for storageClass v2. `Immediate` and `WaitForFirstConsumer` values are allowed. Default: `Immediate` (string)
        """
        return pulumi.get(self, "volume_binding_mode")

