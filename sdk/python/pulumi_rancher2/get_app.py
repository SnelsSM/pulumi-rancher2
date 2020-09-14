# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = [
    'GetAppResult',
    'AwaitableGetAppResult',
    'get_app',
]

@pulumi.output_type
class GetAppResult:
    """
    A collection of values returned by getApp.
    """
    def __init__(__self__, annotations=None, answers=None, catalog_name=None, description=None, external_id=None, id=None, labels=None, name=None, project_id=None, revision_id=None, target_namespace=None, template_name=None, template_version=None, values_yaml=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if answers and not isinstance(answers, dict):
            raise TypeError("Expected argument 'answers' to be a dict")
        pulumi.set(__self__, "answers", answers)
        if catalog_name and not isinstance(catalog_name, str):
            raise TypeError("Expected argument 'catalog_name' to be a str")
        pulumi.set(__self__, "catalog_name", catalog_name)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if external_id and not isinstance(external_id, str):
            raise TypeError("Expected argument 'external_id' to be a str")
        pulumi.set(__self__, "external_id", external_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if revision_id and not isinstance(revision_id, str):
            raise TypeError("Expected argument 'revision_id' to be a str")
        pulumi.set(__self__, "revision_id", revision_id)
        if target_namespace and not isinstance(target_namespace, str):
            raise TypeError("Expected argument 'target_namespace' to be a str")
        pulumi.set(__self__, "target_namespace", target_namespace)
        if template_name and not isinstance(template_name, str):
            raise TypeError("Expected argument 'template_name' to be a str")
        pulumi.set(__self__, "template_name", template_name)
        if template_version and not isinstance(template_version, str):
            raise TypeError("Expected argument 'template_version' to be a str")
        pulumi.set(__self__, "template_version", template_version)
        if values_yaml and not isinstance(values_yaml, str):
            raise TypeError("Expected argument 'values_yaml' to be a str")
        pulumi.set(__self__, "values_yaml", values_yaml)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for the catalog (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def answers(self) -> Mapping[str, Any]:
        """
        (Computed) Answers for the app (map)
        """
        return pulumi.get(self, "answers")

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> str:
        """
        (Computed) Catalog name of the app (string)
        """
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) Description for the app (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> str:
        """
        (Computed) The URL of the helm catalog app (string)
        """
        return pulumi.get(self, "external_id")

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
        (Computed) Labels for the catalog (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> str:
        """
        (Computed) Current revision id for the app (string)
        """
        return pulumi.get(self, "revision_id")

    @property
    @pulumi.getter(name="targetNamespace")
    def target_namespace(self) -> str:
        return pulumi.get(self, "target_namespace")

    @property
    @pulumi.getter(name="templateName")
    def template_name(self) -> str:
        """
        (Computed) Template name of the app (string)
        """
        return pulumi.get(self, "template_name")

    @property
    @pulumi.getter(name="templateVersion")
    def template_version(self) -> str:
        """
        (Computed) Template version of the app (string)
        """
        return pulumi.get(self, "template_version")

    @property
    @pulumi.getter(name="valuesYaml")
    def values_yaml(self) -> str:
        """
        (Computed) values.yaml base64 encoded file content for the app (string)
        """
        return pulumi.get(self, "values_yaml")


class AwaitableGetAppResult(GetAppResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppResult(
            annotations=self.annotations,
            answers=self.answers,
            catalog_name=self.catalog_name,
            description=self.description,
            external_id=self.external_id,
            id=self.id,
            labels=self.labels,
            name=self.name,
            project_id=self.project_id,
            revision_id=self.revision_id,
            target_namespace=self.target_namespace,
            template_name=self.template_name,
            template_version=self.template_version,
            values_yaml=self.values_yaml)


def get_app(annotations: Optional[Mapping[str, Any]] = None,
            name: Optional[str] = None,
            project_id: Optional[str] = None,
            target_namespace: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppResult:
    """
    Use this data source to retrieve information about a Rancher v2 app.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    rancher2 = rancher2.get_app(name="foo",
        project_id="<project_id>",
        target_namespace="<namespace_name>")
    ```


    :param Mapping[str, Any] annotations: (Computed) Annotations for the catalog (map)
    :param str name: The app name (string)
    :param str project_id: The id of the project where the app is deployed (string)
    :param str target_namespace: The namespace name where the app is deployed (string)
    """
    __args__ = dict()
    __args__['annotations'] = annotations
    __args__['name'] = name
    __args__['projectId'] = project_id
    __args__['targetNamespace'] = target_namespace
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getApp:getApp', __args__, opts=opts, typ=GetAppResult).value

    return AwaitableGetAppResult(
        annotations=__ret__.annotations,
        answers=__ret__.answers,
        catalog_name=__ret__.catalog_name,
        description=__ret__.description,
        external_id=__ret__.external_id,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        project_id=__ret__.project_id,
        revision_id=__ret__.revision_id,
        target_namespace=__ret__.target_namespace,
        template_name=__ret__.template_name,
        template_version=__ret__.template_version,
        values_yaml=__ret__.values_yaml)
