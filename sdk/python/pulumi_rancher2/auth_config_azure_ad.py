# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AuthConfigAzureAdArgs', 'AuthConfigAzureAd']

@pulumi.input_type
class AuthConfigAzureAdArgs:
    def __init__(__self__, *,
                 application_id: pulumi.Input[str],
                 application_secret: pulumi.Input[str],
                 auth_endpoint: pulumi.Input[str],
                 graph_endpoint: pulumi.Input[str],
                 rancher_url: pulumi.Input[str],
                 tenant_id: pulumi.Input[str],
                 token_endpoint: pulumi.Input[str],
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a AuthConfigAzureAd resource.
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        """
        AuthConfigAzureAdArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_id=application_id,
            application_secret=application_secret,
            auth_endpoint=auth_endpoint,
            graph_endpoint=graph_endpoint,
            rancher_url=rancher_url,
            tenant_id=tenant_id,
            token_endpoint=token_endpoint,
            access_mode=access_mode,
            allowed_principal_ids=allowed_principal_ids,
            annotations=annotations,
            enabled=enabled,
            endpoint=endpoint,
            labels=labels,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_id: pulumi.Input[str],
             application_secret: pulumi.Input[str],
             auth_endpoint: pulumi.Input[str],
             graph_endpoint: pulumi.Input[str],
             rancher_url: pulumi.Input[str],
             tenant_id: pulumi.Input[str],
             token_endpoint: pulumi.Input[str],
             access_mode: Optional[pulumi.Input[str]] = None,
             allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             endpoint: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'applicationId' in kwargs:
            application_id = kwargs['applicationId']
        if 'applicationSecret' in kwargs:
            application_secret = kwargs['applicationSecret']
        if 'authEndpoint' in kwargs:
            auth_endpoint = kwargs['authEndpoint']
        if 'graphEndpoint' in kwargs:
            graph_endpoint = kwargs['graphEndpoint']
        if 'rancherUrl' in kwargs:
            rancher_url = kwargs['rancherUrl']
        if 'tenantId' in kwargs:
            tenant_id = kwargs['tenantId']
        if 'tokenEndpoint' in kwargs:
            token_endpoint = kwargs['tokenEndpoint']
        if 'accessMode' in kwargs:
            access_mode = kwargs['accessMode']
        if 'allowedPrincipalIds' in kwargs:
            allowed_principal_ids = kwargs['allowedPrincipalIds']

        _setter("application_id", application_id)
        _setter("application_secret", application_secret)
        _setter("auth_endpoint", auth_endpoint)
        _setter("graph_endpoint", graph_endpoint)
        _setter("rancher_url", rancher_url)
        _setter("tenant_id", tenant_id)
        _setter("token_endpoint", token_endpoint)
        if access_mode is not None:
            _setter("access_mode", access_mode)
        if allowed_principal_ids is not None:
            _setter("allowed_principal_ids", allowed_principal_ids)
        if annotations is not None:
            _setter("annotations", annotations)
        if enabled is not None:
            _setter("enabled", enabled)
        if endpoint is not None:
            _setter("endpoint", endpoint)
        if labels is not None:
            _setter("labels", labels)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Input[str]:
        """
        AzureAD auth application ID (string)
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="applicationSecret")
    def application_secret(self) -> pulumi.Input[str]:
        """
        AzureAD auth application secret (string)
        """
        return pulumi.get(self, "application_secret")

    @application_secret.setter
    def application_secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_secret", value)

    @property
    @pulumi.getter(name="authEndpoint")
    def auth_endpoint(self) -> pulumi.Input[str]:
        """
        AzureAD auth endpoint (string)
        """
        return pulumi.get(self, "auth_endpoint")

    @auth_endpoint.setter
    def auth_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_endpoint", value)

    @property
    @pulumi.getter(name="graphEndpoint")
    def graph_endpoint(self) -> pulumi.Input[str]:
        """
        AzureAD graph endpoint (string)
        """
        return pulumi.get(self, "graph_endpoint")

    @graph_endpoint.setter
    def graph_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "graph_endpoint", value)

    @property
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> pulumi.Input[str]:
        """
        Rancher URL (string). "<rancher_url>/verify-auth-azure"
        """
        return pulumi.get(self, "rancher_url")

    @rancher_url.setter
    def rancher_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "rancher_url", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        AzureAD tenant ID (string)
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> pulumi.Input[str]:
        """
        AzureAD token endpoint (string)
        """
        return pulumi.get(self, "token_endpoint")

    @token_endpoint.setter
    def token_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "token_endpoint", value)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        """
        return pulumi.get(self, "access_mode")

    @access_mode.setter
    def access_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_mode", value)

    @property
    @pulumi.getter(name="allowedPrincipalIds")
    def allowed_principal_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        """
        return pulumi.get(self, "allowed_principal_ids")

    @allowed_principal_ids.setter
    def allowed_principal_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_principal_ids", value)

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
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

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


@pulumi.input_type
class _AuthConfigAzureAdState:
    def __init__(__self__, *,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 application_secret: Optional[pulumi.Input[str]] = None,
                 auth_endpoint: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 graph_endpoint: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthConfigAzureAd resources.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        """
        _AuthConfigAzureAdState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_mode=access_mode,
            allowed_principal_ids=allowed_principal_ids,
            annotations=annotations,
            application_id=application_id,
            application_secret=application_secret,
            auth_endpoint=auth_endpoint,
            enabled=enabled,
            endpoint=endpoint,
            graph_endpoint=graph_endpoint,
            labels=labels,
            name=name,
            rancher_url=rancher_url,
            tenant_id=tenant_id,
            token_endpoint=token_endpoint,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_mode: Optional[pulumi.Input[str]] = None,
             allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             application_id: Optional[pulumi.Input[str]] = None,
             application_secret: Optional[pulumi.Input[str]] = None,
             auth_endpoint: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             endpoint: Optional[pulumi.Input[str]] = None,
             graph_endpoint: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             rancher_url: Optional[pulumi.Input[str]] = None,
             tenant_id: Optional[pulumi.Input[str]] = None,
             token_endpoint: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'accessMode' in kwargs:
            access_mode = kwargs['accessMode']
        if 'allowedPrincipalIds' in kwargs:
            allowed_principal_ids = kwargs['allowedPrincipalIds']
        if 'applicationId' in kwargs:
            application_id = kwargs['applicationId']
        if 'applicationSecret' in kwargs:
            application_secret = kwargs['applicationSecret']
        if 'authEndpoint' in kwargs:
            auth_endpoint = kwargs['authEndpoint']
        if 'graphEndpoint' in kwargs:
            graph_endpoint = kwargs['graphEndpoint']
        if 'rancherUrl' in kwargs:
            rancher_url = kwargs['rancherUrl']
        if 'tenantId' in kwargs:
            tenant_id = kwargs['tenantId']
        if 'tokenEndpoint' in kwargs:
            token_endpoint = kwargs['tokenEndpoint']

        if access_mode is not None:
            _setter("access_mode", access_mode)
        if allowed_principal_ids is not None:
            _setter("allowed_principal_ids", allowed_principal_ids)
        if annotations is not None:
            _setter("annotations", annotations)
        if application_id is not None:
            _setter("application_id", application_id)
        if application_secret is not None:
            _setter("application_secret", application_secret)
        if auth_endpoint is not None:
            _setter("auth_endpoint", auth_endpoint)
        if enabled is not None:
            _setter("enabled", enabled)
        if endpoint is not None:
            _setter("endpoint", endpoint)
        if graph_endpoint is not None:
            _setter("graph_endpoint", graph_endpoint)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if rancher_url is not None:
            _setter("rancher_url", rancher_url)
        if tenant_id is not None:
            _setter("tenant_id", tenant_id)
        if token_endpoint is not None:
            _setter("token_endpoint", token_endpoint)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        """
        return pulumi.get(self, "access_mode")

    @access_mode.setter
    def access_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_mode", value)

    @property
    @pulumi.getter(name="allowedPrincipalIds")
    def allowed_principal_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        """
        return pulumi.get(self, "allowed_principal_ids")

    @allowed_principal_ids.setter
    def allowed_principal_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_principal_ids", value)

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
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD auth application ID (string)
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="applicationSecret")
    def application_secret(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD auth application secret (string)
        """
        return pulumi.get(self, "application_secret")

    @application_secret.setter
    def application_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_secret", value)

    @property
    @pulumi.getter(name="authEndpoint")
    def auth_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD auth endpoint (string)
        """
        return pulumi.get(self, "auth_endpoint")

    @auth_endpoint.setter
    def auth_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_endpoint", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="graphEndpoint")
    def graph_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD graph endpoint (string)
        """
        return pulumi.get(self, "graph_endpoint")

    @graph_endpoint.setter
    def graph_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "graph_endpoint", value)

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
        (Computed) The name of the resource (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> Optional[pulumi.Input[str]]:
        """
        Rancher URL (string). "<rancher_url>/verify-auth-azure"
        """
        return pulumi.get(self, "rancher_url")

    @rancher_url.setter
    def rancher_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rancher_url", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD tenant ID (string)
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        AzureAD token endpoint (string)
        """
        return pulumi.get(self, "token_endpoint")

    @token_endpoint.setter
    def token_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_endpoint", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The type of the resource (string)
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AuthConfigAzureAd(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 application_secret: Optional[pulumi.Input[str]] = None,
                 auth_endpoint: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 graph_endpoint: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config AzureAD
        azuread = rancher2.AuthConfigAzureAd("azuread",
            application_id="<AZUREAD_APP_ID>",
            application_secret="<AZUREAD_APP_SECRET>",
            auth_endpoint="<AZUREAD_AUTH_ENDPOINT>",
            graph_endpoint="<AZUREAD_GRAPH_ENDPOINT>",
            rancher_url="<RANCHER_URL>",
            tenant_id="<AZUREAD_TENANT_ID>",
            token_endpoint="<AZUREAD_TOKEN_ENDPOINT>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthConfigAzureAdArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config AzureAD
        azuread = rancher2.AuthConfigAzureAd("azuread",
            application_id="<AZUREAD_APP_ID>",
            application_secret="<AZUREAD_APP_SECRET>",
            auth_endpoint="<AZUREAD_AUTH_ENDPOINT>",
            graph_endpoint="<AZUREAD_GRAPH_ENDPOINT>",
            rancher_url="<RANCHER_URL>",
            tenant_id="<AZUREAD_TENANT_ID>",
            token_endpoint="<AZUREAD_TOKEN_ENDPOINT>")
        ```

        :param str resource_name: The name of the resource.
        :param AuthConfigAzureAdArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthConfigAzureAdArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AuthConfigAzureAdArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 application_secret: Optional[pulumi.Input[str]] = None,
                 auth_endpoint: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 graph_endpoint: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthConfigAzureAdArgs.__new__(AuthConfigAzureAdArgs)

            __props__.__dict__["access_mode"] = access_mode
            __props__.__dict__["allowed_principal_ids"] = allowed_principal_ids
            __props__.__dict__["annotations"] = annotations
            if application_id is None and not opts.urn:
                raise TypeError("Missing required property 'application_id'")
            __props__.__dict__["application_id"] = None if application_id is None else pulumi.Output.secret(application_id)
            if application_secret is None and not opts.urn:
                raise TypeError("Missing required property 'application_secret'")
            __props__.__dict__["application_secret"] = None if application_secret is None else pulumi.Output.secret(application_secret)
            if auth_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'auth_endpoint'")
            __props__.__dict__["auth_endpoint"] = auth_endpoint
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["endpoint"] = endpoint
            if graph_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'graph_endpoint'")
            __props__.__dict__["graph_endpoint"] = graph_endpoint
            __props__.__dict__["labels"] = labels
            if rancher_url is None and not opts.urn:
                raise TypeError("Missing required property 'rancher_url'")
            __props__.__dict__["rancher_url"] = rancher_url
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = tenant_id
            if token_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'token_endpoint'")
            __props__.__dict__["token_endpoint"] = token_endpoint
            __props__.__dict__["name"] = None
            __props__.__dict__["type"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["applicationId", "applicationSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AuthConfigAzureAd, __self__).__init__(
            'rancher2:index/authConfigAzureAd:AuthConfigAzureAd',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_mode: Optional[pulumi.Input[str]] = None,
            allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            application_secret: Optional[pulumi.Input[str]] = None,
            auth_endpoint: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            graph_endpoint: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rancher_url: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None,
            token_endpoint: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AuthConfigAzureAd':
        """
        Get an existing AuthConfigAzureAd resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthConfigAzureAdState.__new__(_AuthConfigAzureAdState)

        __props__.__dict__["access_mode"] = access_mode
        __props__.__dict__["allowed_principal_ids"] = allowed_principal_ids
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["application_secret"] = application_secret
        __props__.__dict__["auth_endpoint"] = auth_endpoint
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["graph_endpoint"] = graph_endpoint
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["rancher_url"] = rancher_url
        __props__.__dict__["tenant_id"] = tenant_id
        __props__.__dict__["token_endpoint"] = token_endpoint
        __props__.__dict__["type"] = type
        return AuthConfigAzureAd(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        """
        return pulumi.get(self, "access_mode")

    @property
    @pulumi.getter(name="allowedPrincipalIds")
    def allowed_principal_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        """
        return pulumi.get(self, "allowed_principal_ids")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        AzureAD auth application ID (string)
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="applicationSecret")
    def application_secret(self) -> pulumi.Output[str]:
        """
        AzureAD auth application secret (string)
        """
        return pulumi.get(self, "application_secret")

    @property
    @pulumi.getter(name="authEndpoint")
    def auth_endpoint(self) -> pulumi.Output[str]:
        """
        AzureAD auth endpoint (string)
        """
        return pulumi.get(self, "auth_endpoint")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="graphEndpoint")
    def graph_endpoint(self) -> pulumi.Output[str]:
        """
        AzureAD graph endpoint (string)
        """
        return pulumi.get(self, "graph_endpoint")

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
        (Computed) The name of the resource (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> pulumi.Output[str]:
        """
        Rancher URL (string). "<rancher_url>/verify-auth-azure"
        """
        return pulumi.get(self, "rancher_url")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[str]:
        """
        AzureAD tenant ID (string)
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> pulumi.Output[str]:
        """
        AzureAD token endpoint (string)
        """
        return pulumi.get(self, "token_endpoint")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        (Computed) The type of the resource (string)
        """
        return pulumi.get(self, "type")

