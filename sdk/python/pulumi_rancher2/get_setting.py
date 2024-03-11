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
    'GetSettingResult',
    'AwaitableGetSettingResult',
    'get_setting',
    'get_setting_output',
]

@pulumi.output_type
class GetSettingResult:
    """
    A collection of values returned by getSetting.
    """
    def __init__(__self__, id=None, name=None, value=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        the settting's value.
        """
        return pulumi.get(self, "value")


class AwaitableGetSettingResult(GetSettingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSettingResult(
            id=self.id,
            name=self.name,
            value=self.value)


def get_setting(name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSettingResult:
    """
    Use this data source to retrieve information about a Rancher v2 setting.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    server_image = rancher2.get_setting(name="server-image")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The setting name.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getSetting:getSetting', __args__, opts=opts, typ=GetSettingResult).value

    return AwaitableGetSettingResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        value=pulumi.get(__ret__, 'value'))


@_utilities.lift_output_func(get_setting)
def get_setting_output(name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSettingResult]:
    """
    Use this data source to retrieve information about a Rancher v2 setting.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    server_image = rancher2.get_setting(name="server-image")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The setting name.
    """
    ...
