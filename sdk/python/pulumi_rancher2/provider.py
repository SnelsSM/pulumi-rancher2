# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_url: pulumi.Input[str],
                 access_key: Optional[pulumi.Input[str]] = None,
                 bootstrap: Optional[pulumi.Input[bool]] = None,
                 ca_certs: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 token_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] api_url: The URL to the rancher API
        :param pulumi.Input[str] access_key: API Key used to authenticate with the rancher server
        :param pulumi.Input[bool] bootstrap: Bootstrap rancher server
        :param pulumi.Input[str] ca_certs: CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        :param pulumi.Input[bool] insecure: Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
        :param pulumi.Input[int] retries: Rancher connection retries
        :param pulumi.Input[str] secret_key: API secret used to authenticate with the rancher server
        :param pulumi.Input[str] timeout: Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
        :param pulumi.Input[str] token_key: API token used to authenticate with the rancher server
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_url=api_url,
            access_key=access_key,
            bootstrap=bootstrap,
            ca_certs=ca_certs,
            insecure=insecure,
            retries=retries,
            secret_key=secret_key,
            timeout=timeout,
            token_key=token_key,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_url: pulumi.Input[str],
             access_key: Optional[pulumi.Input[str]] = None,
             bootstrap: Optional[pulumi.Input[bool]] = None,
             ca_certs: Optional[pulumi.Input[str]] = None,
             insecure: Optional[pulumi.Input[bool]] = None,
             retries: Optional[pulumi.Input[int]] = None,
             secret_key: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[str]] = None,
             token_key: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("api_url", api_url)
        if access_key is not None:
            _setter("access_key", access_key)
        if bootstrap is None:
            bootstrap = (_utilities.get_env_bool('RANCHER_BOOTSTRAP') or False)
        if bootstrap is not None:
            _setter("bootstrap", bootstrap)
        if ca_certs is not None:
            _setter("ca_certs", ca_certs)
        if insecure is None:
            insecure = (_utilities.get_env_bool('RANCHER_INSECURE') or False)
        if insecure is not None:
            _setter("insecure", insecure)
        if retries is not None:
            warnings.warn("""Use timeout instead""", DeprecationWarning)
            pulumi.log.warn("""retries is deprecated: Use timeout instead""")
        if retries is not None:
            _setter("retries", retries)
        if secret_key is not None:
            _setter("secret_key", secret_key)
        if timeout is not None:
            _setter("timeout", timeout)
        if token_key is not None:
            _setter("token_key", token_key)

    @property
    @pulumi.getter(name="apiUrl")
    def api_url(self) -> pulumi.Input[str]:
        """
        The URL to the rancher API
        """
        return pulumi.get(self, "api_url")

    @api_url.setter
    def api_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_url", value)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        API Key used to authenticate with the rancher server
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter
    def bootstrap(self) -> Optional[pulumi.Input[bool]]:
        """
        Bootstrap rancher server
        """
        return pulumi.get(self, "bootstrap")

    @bootstrap.setter
    def bootstrap(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "bootstrap", value)

    @property
    @pulumi.getter(name="caCerts")
    def ca_certs(self) -> Optional[pulumi.Input[str]]:
        """
        CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        """
        return pulumi.get(self, "ca_certs")

    @ca_certs.setter
    def ca_certs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ca_certs", value)

    @property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[int]]:
        """
        Rancher connection retries
        """
        warnings.warn("""Use timeout instead""", DeprecationWarning)
        pulumi.log.warn("""retries is deprecated: Use timeout instead""")

        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        API secret used to authenticate with the rancher server
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[str]]:
        """
        Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="tokenKey")
    def token_key(self) -> Optional[pulumi.Input[str]]:
        """
        API token used to authenticate with the rancher server
        """
        return pulumi.get(self, "token_key")

    @token_key.setter
    def token_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_key", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key: Optional[pulumi.Input[str]] = None,
                 api_url: Optional[pulumi.Input[str]] = None,
                 bootstrap: Optional[pulumi.Input[bool]] = None,
                 ca_certs: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 token_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the rancher2 package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: API Key used to authenticate with the rancher server
        :param pulumi.Input[str] api_url: The URL to the rancher API
        :param pulumi.Input[bool] bootstrap: Bootstrap rancher server
        :param pulumi.Input[str] ca_certs: CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        :param pulumi.Input[bool] insecure: Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
        :param pulumi.Input[int] retries: Rancher connection retries
        :param pulumi.Input[str] secret_key: API secret used to authenticate with the rancher server
        :param pulumi.Input[str] timeout: Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
        :param pulumi.Input[str] token_key: API token used to authenticate with the rancher server
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the rancher2 package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key: Optional[pulumi.Input[str]] = None,
                 api_url: Optional[pulumi.Input[str]] = None,
                 bootstrap: Optional[pulumi.Input[bool]] = None,
                 ca_certs: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 token_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["access_key"] = None if access_key is None else pulumi.Output.secret(access_key)
            if api_url is None and not opts.urn:
                raise TypeError("Missing required property 'api_url'")
            __props__.__dict__["api_url"] = api_url
            if bootstrap is None:
                bootstrap = (_utilities.get_env_bool('RANCHER_BOOTSTRAP') or False)
            __props__.__dict__["bootstrap"] = pulumi.Output.from_input(bootstrap).apply(pulumi.runtime.to_json) if bootstrap is not None else None
            __props__.__dict__["ca_certs"] = ca_certs
            if insecure is None:
                insecure = (_utilities.get_env_bool('RANCHER_INSECURE') or False)
            __props__.__dict__["insecure"] = pulumi.Output.from_input(insecure).apply(pulumi.runtime.to_json) if insecure is not None else None
            __props__.__dict__["retries"] = pulumi.Output.from_input(retries).apply(pulumi.runtime.to_json) if retries is not None else None
            __props__.__dict__["secret_key"] = None if secret_key is None else pulumi.Output.secret(secret_key)
            __props__.__dict__["timeout"] = timeout
            __props__.__dict__["token_key"] = None if token_key is None else pulumi.Output.secret(token_key)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accessKey", "secretKey", "tokenKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'rancher2',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[Optional[str]]:
        """
        API Key used to authenticate with the rancher server
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="apiUrl")
    def api_url(self) -> pulumi.Output[str]:
        """
        The URL to the rancher API
        """
        return pulumi.get(self, "api_url")

    @property
    @pulumi.getter(name="caCerts")
    def ca_certs(self) -> pulumi.Output[Optional[str]]:
        """
        CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        """
        return pulumi.get(self, "ca_certs")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[Optional[str]]:
        """
        API secret used to authenticate with the rancher server
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[Optional[str]]:
        """
        Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter(name="tokenKey")
    def token_key(self) -> pulumi.Output[Optional[str]]:
        """
        API token used to authenticate with the rancher server
        """
        return pulumi.get(self, "token_key")

