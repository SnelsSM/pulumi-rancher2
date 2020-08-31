# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['Catalog']


class Catalog(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 refresh: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Global Catalog
        foo_global = rancher2.Catalog("foo-global", url="https://<CATALOG_URL>")
        # Create a new Rancher2 Cluster Catalog
        foo_cluster = rancher2.Catalog("foo-cluster",
            scope="cluster",
            url="https://<CATALOG_URL>")
        # Create a new Rancher2 Project Catalog
        foo_project = rancher2.Catalog("foo-project",
            scope="project",
            url="https://<CATALOG_URL>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
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
            __props__['branch'] = branch
            __props__['cluster_id'] = cluster_id
            __props__['description'] = description
            __props__['kind'] = kind
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['password'] = password
            __props__['project_id'] = project_id
            __props__['refresh'] = refresh
            __props__['scope'] = scope
            if url is None:
                raise TypeError("Missing required property 'url'")
            __props__['url'] = url
            __props__['username'] = username
            __props__['version'] = version
        super(Catalog, __self__).__init__(
            'rancher2:index/catalog:Catalog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            branch: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            refresh: Optional[pulumi.Input[bool]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'Catalog':
        """
        Get an existing Catalog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["branch"] = branch
        __props__["cluster_id"] = cluster_id
        __props__["description"] = description
        __props__["kind"] = kind
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["password"] = password
        __props__["project_id"] = project_id
        __props__["refresh"] = refresh
        __props__["scope"] = scope
        __props__["url"] = url
        __props__["username"] = username
        __props__["version"] = version
        return Catalog(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for the catalog (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Output[Optional[str]]:
        """
        The branch of the catalog repo to use. Default `master` (string)
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[Optional[str]]:
        """
        The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A catalog description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[Optional[str]]:
        """
        The kind of the catalog. Just helm by the moment (string)
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for the catalog (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the catalog (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password to access the catalog if needed (string)
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        The project id of the catalog. Mandatory if `scope = project` (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def refresh(self) -> pulumi.Output[Optional[bool]]:
        """
        Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        """
        return pulumi.get(self, "refresh")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The url of the catalog repo (string)
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        The username to access the catalog if needed (string)
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        return pulumi.get(self, "version")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

