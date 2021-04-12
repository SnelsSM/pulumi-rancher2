# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['CertificateArgs', 'Certificate']

@pulumi.input_type
class CertificateArgs:
    def __init__(__self__, *,
                 certs: pulumi.Input[str],
                 key: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Certificate resource.
        :param pulumi.Input[str] certs: Base64 encoded public certs (string)
        :param pulumi.Input[str] key: Base64 encoded private key (string)
        :param pulumi.Input[str] project_id: The project id where the certificate should be created  (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for certificate object (map)
        :param pulumi.Input[str] description: A certificate description (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for certificate object (map)
        :param pulumi.Input[str] name: The name of the certificate (string)
        :param pulumi.Input[str] namespace_id: The namespace id where the namespaced certificate should be created (string)
        """
        pulumi.set(__self__, "certs", certs)
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "project_id", project_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)

    @property
    @pulumi.getter
    def certs(self) -> pulumi.Input[str]:
        """
        Base64 encoded public certs (string)
        """
        return pulumi.get(self, "certs")

    @certs.setter
    def certs(self, value: pulumi.Input[str]):
        pulumi.set(self, "certs", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Base64 encoded private key (string)
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The project id where the certificate should be created  (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for certificate object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A certificate description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for certificate object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the certificate (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace id where the namespaced certificate should be created (string)
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)


class Certificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 certs: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 certificate resource. This can be used to create certificates for Rancher v2 environments and retrieve their information.

        There are 2 types of Rancher v2 certificates:
        - Project certificate: Available to all namespaces in the `project_id`
        - Namespaced certificate: Available to just `namespace_id` in the `project_id`

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for certificate object (map)
        :param pulumi.Input[str] certs: Base64 encoded public certs (string)
        :param pulumi.Input[str] description: A certificate description (string)
        :param pulumi.Input[str] key: Base64 encoded private key (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for certificate object (map)
        :param pulumi.Input[str] name: The name of the certificate (string)
        :param pulumi.Input[str] namespace_id: The namespace id where the namespaced certificate should be created (string)
        :param pulumi.Input[str] project_id: The project id where the certificate should be created  (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 certificate resource. This can be used to create certificates for Rancher v2 environments and retrieve their information.

        There are 2 types of Rancher v2 certificates:
        - Project certificate: Available to all namespaces in the `project_id`
        - Namespaced certificate: Available to just `namespace_id` in the `project_id`

        :param str resource_name: The name of the resource.
        :param CertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 certs: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
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

            __props__['annotations'] = annotations
            if certs is None and not opts.urn:
                raise TypeError("Missing required property 'certs'")
            __props__['certs'] = certs
            __props__['description'] = description
            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__['key'] = key
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
        super(Certificate, __self__).__init__(
            'rancher2:index/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            certs: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for certificate object (map)
        :param pulumi.Input[str] certs: Base64 encoded public certs (string)
        :param pulumi.Input[str] description: A certificate description (string)
        :param pulumi.Input[str] key: Base64 encoded private key (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for certificate object (map)
        :param pulumi.Input[str] name: The name of the certificate (string)
        :param pulumi.Input[str] namespace_id: The namespace id where the namespaced certificate should be created (string)
        :param pulumi.Input[str] project_id: The project id where the certificate should be created  (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["certs"] = certs
        __props__["description"] = description
        __props__["key"] = key
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["project_id"] = project_id
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for certificate object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def certs(self) -> pulumi.Output[str]:
        """
        Base64 encoded public certs (string)
        """
        return pulumi.get(self, "certs")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A certificate description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        Base64 encoded private key (string)
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for certificate object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the certificate (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace id where the namespaced certificate should be created (string)
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id where the certificate should be created  (string)
        """
        return pulumi.get(self, "project_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

