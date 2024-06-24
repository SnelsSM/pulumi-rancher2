# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CustomUserTokenArgs', 'CustomUserToken']

@pulumi.input_type
class CustomUserTokenArgs:
    def __init__(__self__, *,
                 password: pulumi.Input[str],
                 username: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 renew: Optional[pulumi.Input[bool]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a CustomUserToken resource.
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[str] username: The user username (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: (Computed) Annotations of the token (map)
        :param pulumi.Input[str] cluster_id: Cluster ID for scoped token (string)
        :param pulumi.Input[str] description: Token description (string)
        :param pulumi.Input[Mapping[str, Any]] labels: (Computed) Labels of the token (map)
        :param pulumi.Input[bool] renew: Renew expired or disabled token
        :param pulumi.Input[int] ttl: Token time to live in seconds. Default `0` (int) 
               
               From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        """
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "username", username)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if renew is not None:
            pulumi.set(__self__, "renew", renew)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        The user password (string)
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The user username (string)
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        (Computed) Annotations of the token (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster ID for scoped token (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Token description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        (Computed) Labels of the token (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def renew(self) -> Optional[pulumi.Input[bool]]:
        """
        Renew expired or disabled token
        """
        return pulumi.get(self, "renew")

    @renew.setter
    def renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "renew", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        Token time to live in seconds. Default `0` (int) 

        From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


@pulumi.input_type
class _CustomUserTokenState:
    def __init__(__self__, *,
                 access_key: Optional[pulumi.Input[str]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 expired: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 renew: Optional[pulumi.Input[bool]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 temp_token: Optional[pulumi.Input[str]] = None,
                 temp_token_id: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomUserToken resources.
        :param pulumi.Input[str] access_key: (Computed) Token access key part (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: (Computed) Annotations of the token (map)
        :param pulumi.Input[str] cluster_id: Cluster ID for scoped token (string)
        :param pulumi.Input[str] description: Token description (string)
        :param pulumi.Input[bool] enabled: (Computed) Token is enabled (bool)
        :param pulumi.Input[bool] expired: (Computed) Token is expired (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: (Computed) Labels of the token (map)
        :param pulumi.Input[str] name: (Computed) Token name (string)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[bool] renew: Renew expired or disabled token
        :param pulumi.Input[str] secret_key: (Computed/Sensitive) Token secret key part (string)
        :param pulumi.Input[str] temp_token: (Computed) Generated API temporary token as helper. Should be empty (string)
        :param pulumi.Input[str] temp_token_id: (Computed) Generated API temporary token id as helper. Should be empty (string)
        :param pulumi.Input[str] token: (Computed/Sensitive) Token value (string)
        :param pulumi.Input[int] ttl: Token time to live in seconds. Default `0` (int) 
               
               From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        :param pulumi.Input[str] user_id: (Computed) Token user ID (string)
        :param pulumi.Input[str] username: The user username (string)
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if expired is not None:
            pulumi.set(__self__, "expired", expired)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if renew is not None:
            pulumi.set(__self__, "renew", renew)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)
        if temp_token is not None:
            pulumi.set(__self__, "temp_token", temp_token)
        if temp_token_id is not None:
            pulumi.set(__self__, "temp_token_id", temp_token_id)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Token access key part (string)
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        (Computed) Annotations of the token (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster ID for scoped token (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Token description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        (Computed) Token is enabled (bool)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def expired(self) -> Optional[pulumi.Input[bool]]:
        """
        (Computed) Token is expired (bool)
        """
        return pulumi.get(self, "expired")

    @expired.setter
    def expired(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "expired", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        (Computed) Labels of the token (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Token name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The user password (string)
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def renew(self) -> Optional[pulumi.Input[bool]]:
        """
        Renew expired or disabled token
        """
        return pulumi.get(self, "renew")

    @renew.setter
    def renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "renew", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed/Sensitive) Token secret key part (string)
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter(name="tempToken")
    def temp_token(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Generated API temporary token as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token")

    @temp_token.setter
    def temp_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "temp_token", value)

    @property
    @pulumi.getter(name="tempTokenId")
    def temp_token_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Generated API temporary token id as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token_id")

    @temp_token_id.setter
    def temp_token_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "temp_token_id", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed/Sensitive) Token value (string)
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        Token time to live in seconds. Default `0` (int) 

        From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Token user ID (string)
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The user username (string)
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class CustomUserToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 renew: Optional[pulumi.Input[bool]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Token resource, specifically to create tokens for custom users (i.e. not the 'admin' user configured with the provider config). Custom user tokens can f.e. be used as service account tokens with the Rancher v2 API having limited permissions. To create a custom user token the username/password for the Rancher User must be known.

        There are 2 kind of tokens:
        - not scoped: valid for global system.
        - scoped: valid for just a specific cluster (`cluster_id` should be provided).

        Tokens can only be created for a Rancher User with at least the `user-base` global role binding in order to enable user login.

        Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a rancher2 Token
        foo = rancher2.User("foo",
            name="foo",
            username="foo",
            password="changeme",
            enabled=True)
        foo_login = rancher2.GlobalRoleBinding("foo-login",
            name="foo-login-binding",
            global_role_id="user-base",
            user_id=foo.id)
        foo_custom_user_token = rancher2.CustomUserToken("foo",
            username=foo.username,
            password=foo.password,
            description="foo token",
            ttl=0,
            opts = pulumi.ResourceOptions(depends_on=[foo_login]))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: (Computed) Annotations of the token (map)
        :param pulumi.Input[str] cluster_id: Cluster ID for scoped token (string)
        :param pulumi.Input[str] description: Token description (string)
        :param pulumi.Input[Mapping[str, Any]] labels: (Computed) Labels of the token (map)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[bool] renew: Renew expired or disabled token
        :param pulumi.Input[int] ttl: Token time to live in seconds. Default `0` (int) 
               
               From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        :param pulumi.Input[str] username: The user username (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomUserTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Token resource, specifically to create tokens for custom users (i.e. not the 'admin' user configured with the provider config). Custom user tokens can f.e. be used as service account tokens with the Rancher v2 API having limited permissions. To create a custom user token the username/password for the Rancher User must be known.

        There are 2 kind of tokens:
        - not scoped: valid for global system.
        - scoped: valid for just a specific cluster (`cluster_id` should be provided).

        Tokens can only be created for a Rancher User with at least the `user-base` global role binding in order to enable user login.

        Tokens can't be updated once created. Any diff in token data will recreate the token. If any token expire, Rancher2 provider will generate a diff to regenerate it.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a rancher2 Token
        foo = rancher2.User("foo",
            name="foo",
            username="foo",
            password="changeme",
            enabled=True)
        foo_login = rancher2.GlobalRoleBinding("foo-login",
            name="foo-login-binding",
            global_role_id="user-base",
            user_id=foo.id)
        foo_custom_user_token = rancher2.CustomUserToken("foo",
            username=foo.username,
            password=foo.password,
            description="foo token",
            ttl=0,
            opts = pulumi.ResourceOptions(depends_on=[foo_login]))
        ```

        :param str resource_name: The name of the resource.
        :param CustomUserTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomUserTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 renew: Optional[pulumi.Input[bool]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomUserTokenArgs.__new__(CustomUserTokenArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["renew"] = renew
            __props__.__dict__["ttl"] = ttl
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["access_key"] = None
            __props__.__dict__["enabled"] = None
            __props__.__dict__["expired"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["secret_key"] = None
            __props__.__dict__["temp_token"] = None
            __props__.__dict__["temp_token_id"] = None
            __props__.__dict__["token"] = None
            __props__.__dict__["user_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password", "secretKey", "tempToken", "token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(CustomUserToken, __self__).__init__(
            'rancher2:index/customUserToken:CustomUserToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key: Optional[pulumi.Input[str]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            expired: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            renew: Optional[pulumi.Input[bool]] = None,
            secret_key: Optional[pulumi.Input[str]] = None,
            temp_token: Optional[pulumi.Input[str]] = None,
            temp_token_id: Optional[pulumi.Input[str]] = None,
            token: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'CustomUserToken':
        """
        Get an existing CustomUserToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: (Computed) Token access key part (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: (Computed) Annotations of the token (map)
        :param pulumi.Input[str] cluster_id: Cluster ID for scoped token (string)
        :param pulumi.Input[str] description: Token description (string)
        :param pulumi.Input[bool] enabled: (Computed) Token is enabled (bool)
        :param pulumi.Input[bool] expired: (Computed) Token is expired (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: (Computed) Labels of the token (map)
        :param pulumi.Input[str] name: (Computed) Token name (string)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[bool] renew: Renew expired or disabled token
        :param pulumi.Input[str] secret_key: (Computed/Sensitive) Token secret key part (string)
        :param pulumi.Input[str] temp_token: (Computed) Generated API temporary token as helper. Should be empty (string)
        :param pulumi.Input[str] temp_token_id: (Computed) Generated API temporary token id as helper. Should be empty (string)
        :param pulumi.Input[str] token: (Computed/Sensitive) Token value (string)
        :param pulumi.Input[int] ttl: Token time to live in seconds. Default `0` (int) 
               
               From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        :param pulumi.Input[str] user_id: (Computed) Token user ID (string)
        :param pulumi.Input[str] username: The user username (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomUserTokenState.__new__(_CustomUserTokenState)

        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["expired"] = expired
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["renew"] = renew
        __props__.__dict__["secret_key"] = secret_key
        __props__.__dict__["temp_token"] = temp_token
        __props__.__dict__["temp_token_id"] = temp_token_id
        __props__.__dict__["token"] = token
        __props__.__dict__["ttl"] = ttl
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["username"] = username
        return CustomUserToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[str]:
        """
        (Computed) Token access key part (string)
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        (Computed) Annotations of the token (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster ID for scoped token (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Token description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        (Computed) Token is enabled (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def expired(self) -> pulumi.Output[bool]:
        """
        (Computed) Token is expired (bool)
        """
        return pulumi.get(self, "expired")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        (Computed) Labels of the token (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        (Computed) Token name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        The user password (string)
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def renew(self) -> pulumi.Output[Optional[bool]]:
        """
        Renew expired or disabled token
        """
        return pulumi.get(self, "renew")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[str]:
        """
        (Computed/Sensitive) Token secret key part (string)
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter(name="tempToken")
    def temp_token(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API temporary token as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token")

    @property
    @pulumi.getter(name="tempTokenId")
    def temp_token_id(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API temporary token id as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token_id")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        (Computed/Sensitive) Token value (string)
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[Optional[int]]:
        """
        Token time to live in seconds. Default `0` (int) 

        From Rancher v2.4.6 `ttl` is read in minutes at Rancher API. To avoid breaking change on the provider, we still read in seconds but rounding up division if required.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        (Computed) Token user ID (string)
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The user username (string)
        """
        return pulumi.get(self, "username")

