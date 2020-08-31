# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['App']


class App(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 answers: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 catalog_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_upgrade: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 revision_id: Optional[pulumi.Input[str]] = None,
                 target_namespace: Optional[pulumi.Input[str]] = None,
                 template_name: Optional[pulumi.Input[str]] = None,
                 template_version: Optional[pulumi.Input[str]] = None,
                 values_yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a App resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for App object (map)
        :param pulumi.Input[Mapping[str, Any]] answers: Answers for the app template. If modified, app will be upgraded (map)
        :param pulumi.Input[str] catalog_name: Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
               * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
               * add project ID before name, `p-XXXXX:<name>`
        :param pulumi.Input[str] description: Description for the app (string)
        :param pulumi.Input[bool] force_upgrade: Force app upgrade (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for App object (map)
        :param pulumi.Input[str] name: The name of the app (string)
        :param pulumi.Input[str] project_id: The project id where the app will be installed (string)
        :param pulumi.Input[str] revision_id: Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        :param pulumi.Input[str] target_namespace: The namespace name where the app will be installed (string)
        :param pulumi.Input[str] template_name: Template name of the app. If modified, app will be upgraded (string)
        :param pulumi.Input[str] template_version: Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        :param pulumi.Input[str] values_yaml: values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
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
            __props__['answers'] = answers
            if catalog_name is None:
                raise TypeError("Missing required property 'catalog_name'")
            __props__['catalog_name'] = catalog_name
            __props__['description'] = description
            __props__['force_upgrade'] = force_upgrade
            __props__['labels'] = labels
            __props__['name'] = name
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['revision_id'] = revision_id
            if target_namespace is None:
                raise TypeError("Missing required property 'target_namespace'")
            __props__['target_namespace'] = target_namespace
            if template_name is None:
                raise TypeError("Missing required property 'template_name'")
            __props__['template_name'] = template_name
            __props__['template_version'] = template_version
            __props__['values_yaml'] = values_yaml
            __props__['external_id'] = None
        super(App, __self__).__init__(
            'rancher2:index/app:App',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            answers: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            catalog_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            external_id: Optional[pulumi.Input[str]] = None,
            force_upgrade: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            revision_id: Optional[pulumi.Input[str]] = None,
            target_namespace: Optional[pulumi.Input[str]] = None,
            template_name: Optional[pulumi.Input[str]] = None,
            template_version: Optional[pulumi.Input[str]] = None,
            values_yaml: Optional[pulumi.Input[str]] = None) -> 'App':
        """
        Get an existing App resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for App object (map)
        :param pulumi.Input[Mapping[str, Any]] answers: Answers for the app template. If modified, app will be upgraded (map)
        :param pulumi.Input[str] catalog_name: Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
               * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
               * add project ID before name, `p-XXXXX:<name>`
        :param pulumi.Input[str] description: Description for the app (string)
        :param pulumi.Input[str] external_id: (Computed) The url of the app template on a catalog (string)
        :param pulumi.Input[bool] force_upgrade: Force app upgrade (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for App object (map)
        :param pulumi.Input[str] name: The name of the app (string)
        :param pulumi.Input[str] project_id: The project id where the app will be installed (string)
        :param pulumi.Input[str] revision_id: Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        :param pulumi.Input[str] target_namespace: The namespace name where the app will be installed (string)
        :param pulumi.Input[str] template_name: Template name of the app. If modified, app will be upgraded (string)
        :param pulumi.Input[str] template_version: Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        :param pulumi.Input[str] values_yaml: values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["answers"] = answers
        __props__["catalog_name"] = catalog_name
        __props__["description"] = description
        __props__["external_id"] = external_id
        __props__["force_upgrade"] = force_upgrade
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["project_id"] = project_id
        __props__["revision_id"] = revision_id
        __props__["target_namespace"] = target_namespace
        __props__["template_name"] = template_name
        __props__["template_version"] = template_version
        __props__["values_yaml"] = values_yaml
        return App(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for App object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def answers(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Answers for the app template. If modified, app will be upgraded (map)
        """
        return pulumi.get(self, "answers")

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> pulumi.Output[str]:
        """
        Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
        * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
        * add project ID before name, `p-XXXXX:<name>`
        """
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description for the app (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> pulumi.Output[str]:
        """
        (Computed) The url of the app template on a catalog (string)
        """
        return pulumi.get(self, "external_id")

    @property
    @pulumi.getter(name="forceUpgrade")
    def force_upgrade(self) -> pulumi.Output[Optional[bool]]:
        """
        Force app upgrade (string)
        """
        return pulumi.get(self, "force_upgrade")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for App object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the app (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id where the app will be installed (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> pulumi.Output[str]:
        """
        Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
        """
        return pulumi.get(self, "revision_id")

    @property
    @pulumi.getter(name="targetNamespace")
    def target_namespace(self) -> pulumi.Output[str]:
        """
        The namespace name where the app will be installed (string)
        """
        return pulumi.get(self, "target_namespace")

    @property
    @pulumi.getter(name="templateName")
    def template_name(self) -> pulumi.Output[str]:
        """
        Template name of the app. If modified, app will be upgraded (string)
        """
        return pulumi.get(self, "template_name")

    @property
    @pulumi.getter(name="templateVersion")
    def template_version(self) -> pulumi.Output[str]:
        """
        Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
        """
        return pulumi.get(self, "template_version")

    @property
    @pulumi.getter(name="valuesYaml")
    def values_yaml(self) -> pulumi.Output[Optional[str]]:
        """
        values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
        """
        return pulumi.get(self, "values_yaml")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

