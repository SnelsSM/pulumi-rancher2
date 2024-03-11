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
    'GetSecretResult',
    'AwaitableGetSecretResult',
    'get_secret',
    'get_secret_output',
]

@pulumi.output_type
class GetSecretResult:
    """
    A collection of values returned by getSecret.
    """
    def __init__(__self__, annotations=None, data=None, description=None, id=None, labels=None, name=None, namespace_id=None, project_id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if data and not isinstance(data, dict):
            raise TypeError("Expected argument 'data' to be a dict")
        pulumi.set(__self__, "data", data)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for secret object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def data(self) -> Mapping[str, Any]:
        """
        (Computed) Secret key/value data. Base64 encoding required for values (map)
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) A secret description (string)
        """
        return pulumi.get(self, "description")

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
        (Computed) Labels for secret object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[str]:
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")


class AwaitableGetSecretResult(GetSecretResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretResult(
            annotations=self.annotations,
            data=self.data,
            description=self.description,
            id=self.id,
            labels=self.labels,
            name=self.name,
            namespace_id=self.namespace_id,
            project_id=self.project_id)


def get_secret(name: Optional[str] = None,
               namespace_id: Optional[str] = None,
               project_id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretResult:
    """
    Use this data source to retrieve information about a Rancher v2 secret.

    Depending of the availability, there are 2 types of Rancher v2 secrets:
    - Project secret: Available to all namespaces in the `project_id`
    - Namespaced secret: Available to just `namespace_id` in the `project_id`

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_secret(name="<name>",
        project_id="<project_id>")
    ```
    <!--End PulumiCodeChooser -->

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_secret(name="<name>",
        namespace_id="<namespace_id>",
        project_id="<project_id>")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the secret (string)
    :param str namespace_id: The namespace id where to assign the namespaced secret (string)
    :param str project_id: The project id where to assign the secret (string)
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['namespaceId'] = namespace_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getSecret:getSecret', __args__, opts=opts, typ=GetSecretResult).value

    return AwaitableGetSecretResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        data=pulumi.get(__ret__, 'data'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        namespace_id=pulumi.get(__ret__, 'namespace_id'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_secret)
def get_secret_output(name: Optional[pulumi.Input[str]] = None,
                      namespace_id: Optional[pulumi.Input[Optional[str]]] = None,
                      project_id: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretResult]:
    """
    Use this data source to retrieve information about a Rancher v2 secret.

    Depending of the availability, there are 2 types of Rancher v2 secrets:
    - Project secret: Available to all namespaces in the `project_id`
    - Namespaced secret: Available to just `namespace_id` in the `project_id`

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_secret(name="<name>",
        project_id="<project_id>")
    ```
    <!--End PulumiCodeChooser -->

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_secret(name="<name>",
        namespace_id="<namespace_id>",
        project_id="<project_id>")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the secret (string)
    :param str namespace_id: The namespace id where to assign the namespaced secret (string)
    :param str project_id: The project id where to assign the secret (string)
    """
    ...
