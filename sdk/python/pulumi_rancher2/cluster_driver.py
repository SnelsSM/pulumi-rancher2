# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['ClusterDriverArgs', 'ClusterDriver']

@pulumi.input_type
class ClusterDriverArgs:
    def __init__(__self__, *,
                 active: pulumi.Input[bool],
                 builtin: pulumi.Input[bool],
                 url: pulumi.Input[str],
                 actual_url: Optional[pulumi.Input[str]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 checksum: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ui_url: Optional[pulumi.Input[str]] = None,
                 whitelist_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ClusterDriver resource.
        :param pulumi.Input[bool] active: Specify the cluster driver state (bool)
        :param pulumi.Input[bool] builtin: Specify whether the cluster driver is an internal cluster driver or not (bool)
        :param pulumi.Input[str] url: The URL to download the machine driver binary for 64-bit Linux (string)
        :param pulumi.Input[str] actual_url: Actual url of the cluster driver (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] checksum: Verify that the downloaded driver matches the expected checksum (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: Name of the cluster driver (string)
        :param pulumi.Input[str] ui_url: The URL to load for customized Add Clusters screen for this driver (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelist_domains: Domains to whitelist for the ui (list)
        """
        pulumi.set(__self__, "active", active)
        pulumi.set(__self__, "builtin", builtin)
        pulumi.set(__self__, "url", url)
        if actual_url is not None:
            pulumi.set(__self__, "actual_url", actual_url)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if checksum is not None:
            pulumi.set(__self__, "checksum", checksum)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ui_url is not None:
            pulumi.set(__self__, "ui_url", ui_url)
        if whitelist_domains is not None:
            pulumi.set(__self__, "whitelist_domains", whitelist_domains)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Input[bool]:
        """
        Specify the cluster driver state (bool)
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: pulumi.Input[bool]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def builtin(self) -> pulumi.Input[bool]:
        """
        Specify whether the cluster driver is an internal cluster driver or not (bool)
        """
        return pulumi.get(self, "builtin")

    @builtin.setter
    def builtin(self, value: pulumi.Input[bool]):
        pulumi.set(self, "builtin", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL to download the machine driver binary for 64-bit Linux (string)
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="actualUrl")
    def actual_url(self) -> Optional[pulumi.Input[str]]:
        """
        Actual url of the cluster driver (string)
        """
        return pulumi.get(self, "actual_url")

    @actual_url.setter
    def actual_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "actual_url", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def checksum(self) -> Optional[pulumi.Input[str]]:
        """
        Verify that the downloaded driver matches the expected checksum (string)
        """
        return pulumi.get(self, "checksum")

    @checksum.setter
    def checksum(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "checksum", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the cluster driver (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="uiUrl")
    def ui_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL to load for customized Add Clusters screen for this driver (string)
        """
        return pulumi.get(self, "ui_url")

    @ui_url.setter
    def ui_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ui_url", value)

    @property
    @pulumi.getter(name="whitelistDomains")
    def whitelist_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Domains to whitelist for the ui (list)
        """
        return pulumi.get(self, "whitelist_domains")

    @whitelist_domains.setter
    def whitelist_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "whitelist_domains", value)


class ClusterDriver(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 actual_url: Optional[pulumi.Input[str]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 builtin: Optional[pulumi.Input[bool]] = None,
                 checksum: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ui_url: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 whitelist_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Cluster Driver resource. This can be used to create Cluster Driver for Rancher v2.2.x Kontainer Engine clusters and retrieve their information.

        ## Import

        Cluster Driver can be imported using the Rancher Cluster Driver ID

        ```sh
         $ pulumi import rancher2:index/clusterDriver:ClusterDriver foo &lt;CLUSTER_DRIVER_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Specify the cluster driver state (bool)
        :param pulumi.Input[str] actual_url: Actual url of the cluster driver (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[bool] builtin: Specify whether the cluster driver is an internal cluster driver or not (bool)
        :param pulumi.Input[str] checksum: Verify that the downloaded driver matches the expected checksum (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: Name of the cluster driver (string)
        :param pulumi.Input[str] ui_url: The URL to load for customized Add Clusters screen for this driver (string)
        :param pulumi.Input[str] url: The URL to download the machine driver binary for 64-bit Linux (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelist_domains: Domains to whitelist for the ui (list)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterDriverArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Cluster Driver resource. This can be used to create Cluster Driver for Rancher v2.2.x Kontainer Engine clusters and retrieve their information.

        ## Import

        Cluster Driver can be imported using the Rancher Cluster Driver ID

        ```sh
         $ pulumi import rancher2:index/clusterDriver:ClusterDriver foo &lt;CLUSTER_DRIVER_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ClusterDriverArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterDriverArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 actual_url: Optional[pulumi.Input[str]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 builtin: Optional[pulumi.Input[bool]] = None,
                 checksum: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ui_url: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 whitelist_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            if active is None and not opts.urn:
                raise TypeError("Missing required property 'active'")
            __props__['active'] = active
            __props__['actual_url'] = actual_url
            __props__['annotations'] = annotations
            if builtin is None and not opts.urn:
                raise TypeError("Missing required property 'builtin'")
            __props__['builtin'] = builtin
            __props__['checksum'] = checksum
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['ui_url'] = ui_url
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__['url'] = url
            __props__['whitelist_domains'] = whitelist_domains
        super(ClusterDriver, __self__).__init__(
            'rancher2:index/clusterDriver:ClusterDriver',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            actual_url: Optional[pulumi.Input[str]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            builtin: Optional[pulumi.Input[bool]] = None,
            checksum: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ui_url: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            whitelist_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ClusterDriver':
        """
        Get an existing ClusterDriver resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Specify the cluster driver state (bool)
        :param pulumi.Input[str] actual_url: Actual url of the cluster driver (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[bool] builtin: Specify whether the cluster driver is an internal cluster driver or not (bool)
        :param pulumi.Input[str] checksum: Verify that the downloaded driver matches the expected checksum (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: Name of the cluster driver (string)
        :param pulumi.Input[str] ui_url: The URL to load for customized Add Clusters screen for this driver (string)
        :param pulumi.Input[str] url: The URL to download the machine driver binary for 64-bit Linux (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelist_domains: Domains to whitelist for the ui (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["active"] = active
        __props__["actual_url"] = actual_url
        __props__["annotations"] = annotations
        __props__["builtin"] = builtin
        __props__["checksum"] = checksum
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["ui_url"] = ui_url
        __props__["url"] = url
        __props__["whitelist_domains"] = whitelist_domains
        return ClusterDriver(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        Specify the cluster driver state (bool)
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="actualUrl")
    def actual_url(self) -> pulumi.Output[Optional[str]]:
        """
        Actual url of the cluster driver (string)
        """
        return pulumi.get(self, "actual_url")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> pulumi.Output[bool]:
        """
        Specify whether the cluster driver is an internal cluster driver or not (bool)
        """
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def checksum(self) -> pulumi.Output[Optional[str]]:
        """
        Verify that the downloaded driver matches the expected checksum (string)
        """
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the cluster driver (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="uiUrl")
    def ui_url(self) -> pulumi.Output[Optional[str]]:
        """
        The URL to load for customized Add Clusters screen for this driver (string)
        """
        return pulumi.get(self, "ui_url")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL to download the machine driver binary for 64-bit Linux (string)
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="whitelistDomains")
    def whitelist_domains(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Domains to whitelist for the ui (list)
        """
        return pulumi.get(self, "whitelist_domains")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

