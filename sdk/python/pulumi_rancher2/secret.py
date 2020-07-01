# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class Secret(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for secret object (map)
    """
    data: pulumi.Output[dict]
    """
    Secret key/value data. Base64 encoding required for values (map)
    """
    description: pulumi.Output[str]
    """
    A secret description (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels for secret object (map)
    """
    name: pulumi.Output[str]
    """
    The name of the secret (string)
    """
    namespace_id: pulumi.Output[str]
    """
    The namespace id where to assign the namespaced secret (string)
    """
    project_id: pulumi.Output[str]
    """
    The project id where to assign the secret (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, data=None, description=None, labels=None, name=None, namespace_id=None, project_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Secret resource. This can be used to create secrets for Rancher v2 environments and retrieve their information.

        Depending of the availability, there are 2 types of Rancher v2 secrets:
        - Project secret: Available to all namespaces in the `project_id`
        - Namespaced secret: Available to just `namespace_id` in the `project_id`

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for secret object (map)
        :param pulumi.Input[dict] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[str] description: A secret description (string)
        :param pulumi.Input[dict] labels: Labels for secret object (map)
        :param pulumi.Input[str] name: The name of the secret (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced secret (string)
        :param pulumi.Input[str] project_id: The project id where to assign the secret (string)
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            if data is None:
                raise TypeError("Missing required property 'data'")
            __props__['data'] = data
            __props__['description'] = description
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
        super(Secret, __self__).__init__(
            'rancher2:index/secret:Secret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, data=None, description=None, labels=None, name=None, namespace_id=None, project_id=None):
        """
        Get an existing Secret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for secret object (map)
        :param pulumi.Input[dict] data: Secret key/value data. Base64 encoding required for values (map)
        :param pulumi.Input[str] description: A secret description (string)
        :param pulumi.Input[dict] labels: Labels for secret object (map)
        :param pulumi.Input[str] name: The name of the secret (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced secret (string)
        :param pulumi.Input[str] project_id: The project id where to assign the secret (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["data"] = data
        __props__["description"] = description
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["project_id"] = project_id
        return Secret(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
