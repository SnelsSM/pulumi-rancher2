# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['EtcdBackup']


class EtcdBackup(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 backup_config: Optional[pulumi.Input[pulumi.InputType['EtcdBackupBackupConfigArgs']]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 filename: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 manual: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a EtcdBackup resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Etcd Backup object (map)
        :param pulumi.Input[pulumi.InputType['EtcdBackupBackupConfigArgs']] backup_config: Backup config for etcd backup (list maxitems:1)
        :param pulumi.Input[str] cluster_id: Cluster ID to config Etcd Backup (string)
        :param pulumi.Input[str] filename: Filename of the Etcd Backup (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Etcd Backup object (map)
        :param pulumi.Input[bool] manual: Manual execution of the Etcd Backup. Default `false` (bool)
        :param pulumi.Input[str] name: The name of the Etcd Backup (string)
        :param pulumi.Input[str] namespace_id: Description for the Etcd Backup (string)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            __props__['backup_config'] = backup_config
            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['filename'] = filename
            __props__['labels'] = labels
            __props__['manual'] = manual
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
        super(EtcdBackup, __self__).__init__(
            'rancher2:index/etcdBackup:EtcdBackup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            backup_config: Optional[pulumi.Input[pulumi.InputType['EtcdBackupBackupConfigArgs']]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            filename: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            manual: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None) -> 'EtcdBackup':
        """
        Get an existing EtcdBackup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Etcd Backup object (map)
        :param pulumi.Input[pulumi.InputType['EtcdBackupBackupConfigArgs']] backup_config: Backup config for etcd backup (list maxitems:1)
        :param pulumi.Input[str] cluster_id: Cluster ID to config Etcd Backup (string)
        :param pulumi.Input[str] filename: Filename of the Etcd Backup (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Etcd Backup object (map)
        :param pulumi.Input[bool] manual: Manual execution of the Etcd Backup. Default `false` (bool)
        :param pulumi.Input[str] name: The name of the Etcd Backup (string)
        :param pulumi.Input[str] namespace_id: Description for the Etcd Backup (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["backup_config"] = backup_config
        __props__["cluster_id"] = cluster_id
        __props__["filename"] = filename
        __props__["labels"] = labels
        __props__["manual"] = manual
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        return EtcdBackup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Etcd Backup object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="backupConfig")
    def backup_config(self) -> pulumi.Output['outputs.EtcdBackupBackupConfig']:
        """
        Backup config for etcd backup (list maxitems:1)
        """
        return pulumi.get(self, "backup_config")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        Cluster ID to config Etcd Backup (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def filename(self) -> pulumi.Output[str]:
        """
        Filename of the Etcd Backup (string)
        """
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Etcd Backup object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def manual(self) -> pulumi.Output[Optional[bool]]:
        """
        Manual execution of the Etcd Backup. Default `false` (bool)
        """
        return pulumi.get(self, "manual")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Etcd Backup (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[str]:
        """
        Description for the Etcd Backup (string)
        """
        return pulumi.get(self, "namespace_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

