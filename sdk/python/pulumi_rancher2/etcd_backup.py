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
from ._inputs import *

__all__ = ['EtcdBackupArgs', 'EtcdBackup']

@pulumi.input_type
class EtcdBackupArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 backup_config: Optional[pulumi.Input['EtcdBackupBackupConfigArgs']] = None,
                 filename: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 manual: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EtcdBackup resource.
        :param pulumi.Input[str] cluster_id: Cluster ID to config Etcd Backup (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Etcd Backup object (map)
        :param pulumi.Input['EtcdBackupBackupConfigArgs'] backup_config: Backup config for etcd backup (list maxitems:1)
        :param pulumi.Input[str] filename: Filename of the Etcd Backup (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Etcd Backup object (map)
        :param pulumi.Input[bool] manual: Manual execution of the Etcd Backup. Default `false` (bool)
        :param pulumi.Input[str] name: The name of the Etcd Backup (string)
        :param pulumi.Input[str] namespace_id: Description for the Etcd Backup (string)
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if backup_config is not None:
            pulumi.set(__self__, "backup_config", backup_config)
        if filename is not None:
            pulumi.set(__self__, "filename", filename)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if manual is not None:
            pulumi.set(__self__, "manual", manual)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        Cluster ID to config Etcd Backup (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for Etcd Backup object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="backupConfig")
    def backup_config(self) -> Optional[pulumi.Input['EtcdBackupBackupConfigArgs']]:
        """
        Backup config for etcd backup (list maxitems:1)
        """
        return pulumi.get(self, "backup_config")

    @backup_config.setter
    def backup_config(self, value: Optional[pulumi.Input['EtcdBackupBackupConfigArgs']]):
        pulumi.set(self, "backup_config", value)

    @property
    @pulumi.getter
    def filename(self) -> Optional[pulumi.Input[str]]:
        """
        Filename of the Etcd Backup (string)
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filename", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for Etcd Backup object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def manual(self) -> Optional[pulumi.Input[bool]]:
        """
        Manual execution of the Etcd Backup. Default `false` (bool)
        """
        return pulumi.get(self, "manual")

    @manual.setter
    def manual(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "manual", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Etcd Backup (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        Description for the Etcd Backup (string)
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)


@pulumi.input_type
class _EtcdBackupState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 backup_config: Optional[pulumi.Input['EtcdBackupBackupConfigArgs']] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 filename: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 manual: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EtcdBackup resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Etcd Backup object (map)
        :param pulumi.Input['EtcdBackupBackupConfigArgs'] backup_config: Backup config for etcd backup (list maxitems:1)
        :param pulumi.Input[str] cluster_id: Cluster ID to config Etcd Backup (string)
        :param pulumi.Input[str] filename: Filename of the Etcd Backup (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Etcd Backup object (map)
        :param pulumi.Input[bool] manual: Manual execution of the Etcd Backup. Default `false` (bool)
        :param pulumi.Input[str] name: The name of the Etcd Backup (string)
        :param pulumi.Input[str] namespace_id: Description for the Etcd Backup (string)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if backup_config is not None:
            pulumi.set(__self__, "backup_config", backup_config)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if filename is not None:
            pulumi.set(__self__, "filename", filename)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if manual is not None:
            pulumi.set(__self__, "manual", manual)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for Etcd Backup object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="backupConfig")
    def backup_config(self) -> Optional[pulumi.Input['EtcdBackupBackupConfigArgs']]:
        """
        Backup config for etcd backup (list maxitems:1)
        """
        return pulumi.get(self, "backup_config")

    @backup_config.setter
    def backup_config(self, value: Optional[pulumi.Input['EtcdBackupBackupConfigArgs']]):
        pulumi.set(self, "backup_config", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster ID to config Etcd Backup (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def filename(self) -> Optional[pulumi.Input[str]]:
        """
        Filename of the Etcd Backup (string)
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filename", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for Etcd Backup object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def manual(self) -> Optional[pulumi.Input[bool]]:
        """
        Manual execution of the Etcd Backup. Default `false` (bool)
        """
        return pulumi.get(self, "manual")

    @manual.setter
    def manual(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "manual", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Etcd Backup (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        Description for the Etcd Backup (string)
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)


class EtcdBackup(pulumi.CustomResource):
    @overload
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
                 __props__=None):
        """
        Provides a Rancher v2 Etcd Backup resource. This can be used to create an Etcd Backup for Rancher v2.2.x and above, and to retrieve their information.

        The `EtcdBackup` resource is used to define extra etcd backups for a `Cluster`, which will be created as a local or S3 backup in accordance with the etcd backup config for the cluster. The main etcd backup config for the cluster should be set on the cluster config

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Etcd Backup
        foo = rancher2.EtcdBackup("foo",
            backup_config=rancher2.EtcdBackupBackupConfigArgs(
                enabled=True,
                interval_hours=20,
                retention=10,
                s3_backup_config=rancher2.EtcdBackupBackupConfigS3BackupConfigArgs(
                    access_key="access_key",
                    bucket_name="bucket_name",
                    endpoint="endpoint",
                    folder="/folder",
                    region="region",
                    secret_key="secret_key",
                ),
            ),
            cluster_id="<CLUSTER_ID>",
            filename="<FILENAME>")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Etcd Backup can be imported using the Rancher etcd backup ID

        ```sh
        $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
        ```

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
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EtcdBackupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Etcd Backup resource. This can be used to create an Etcd Backup for Rancher v2.2.x and above, and to retrieve their information.

        The `EtcdBackup` resource is used to define extra etcd backups for a `Cluster`, which will be created as a local or S3 backup in accordance with the etcd backup config for the cluster. The main etcd backup config for the cluster should be set on the cluster config

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Etcd Backup
        foo = rancher2.EtcdBackup("foo",
            backup_config=rancher2.EtcdBackupBackupConfigArgs(
                enabled=True,
                interval_hours=20,
                retention=10,
                s3_backup_config=rancher2.EtcdBackupBackupConfigS3BackupConfigArgs(
                    access_key="access_key",
                    bucket_name="bucket_name",
                    endpoint="endpoint",
                    folder="/folder",
                    region="region",
                    secret_key="secret_key",
                ),
            ),
            cluster_id="<CLUSTER_ID>",
            filename="<FILENAME>")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Etcd Backup can be imported using the Rancher etcd backup ID

        ```sh
        $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param EtcdBackupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EtcdBackupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
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
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EtcdBackupArgs.__new__(EtcdBackupArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["backup_config"] = backup_config
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["filename"] = filename
            __props__.__dict__["labels"] = labels
            __props__.__dict__["manual"] = manual
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace_id"] = namespace_id
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

        __props__ = _EtcdBackupState.__new__(_EtcdBackupState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["backup_config"] = backup_config
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["filename"] = filename
        __props__.__dict__["labels"] = labels
        __props__.__dict__["manual"] = manual
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace_id"] = namespace_id
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

