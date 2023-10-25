# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 password: pulumi.Input[str],
                 username: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[str] username: The user username (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
        :param pulumi.Input[str] name: The user full name (string)
        """
        UserArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            password=password,
            username=username,
            annotations=annotations,
            enabled=enabled,
            labels=labels,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             password: Optional[pulumi.Input[str]] = None,
             username: Optional[pulumi.Input[str]] = None,
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if password is None:
            raise TypeError("Missing 'password' argument")
        if username is None:
            raise TypeError("Missing 'username' argument")

        _setter("password", password)
        _setter("username", username)
        if annotations is not None:
            _setter("annotations", annotations)
        if enabled is not None:
            _setter("enabled", enabled)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)

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
        Annotations for global role binding (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role binding (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The user full name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
        :param pulumi.Input[str] name: The user full name (string)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principal_ids: (Computed) The user principal IDs (list)
        :param pulumi.Input[str] username: The user username (string)
        """
        _UserState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            annotations=annotations,
            enabled=enabled,
            labels=labels,
            name=name,
            password=password,
            principal_ids=principal_ids,
            username=username,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             password: Optional[pulumi.Input[str]] = None,
             principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             username: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if principal_ids is None and 'principalIds' in kwargs:
            principal_ids = kwargs['principalIds']

        if annotations is not None:
            _setter("annotations", annotations)
        if enabled is not None:
            _setter("enabled", enabled)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if password is not None:
            _setter("password", password)
        if principal_ids is not None:
            _setter("principal_ids", principal_ids)
        if username is not None:
            _setter("username", username)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for global role binding (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role binding (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The user full name (string)
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
    @pulumi.getter(name="principalIds")
    def principal_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Computed) The user principal IDs (list)
        """
        return pulumi.get(self, "principal_ids")

    @principal_ids.setter
    def principal_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "principal_ids", value)

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


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 User resource. This can be used to create Users for Rancher v2 environments and retrieve their information.

        When a Rancher User is created, it doesn't have a global role binding. At least, `user-base` global role binding in needed in order to enable user login.

        ## Import

        Users can be imported using the Rancher User ID

        ```sh
         $ pulumi import rancher2:index/user:User foo &lt;user_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
        :param pulumi.Input[str] name: The user full name (string)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[str] username: The user username (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 User resource. This can be used to create Users for Rancher v2 environments and retrieve their information.

        When a Rancher User is created, it doesn't have a global role binding. At least, `user-base` global role binding in needed in order to enable user login.

        ## Import

        Users can be imported using the Rancher User ID

        ```sh
         $ pulumi import rancher2:index/user:User foo &lt;user_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["principal_ids"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(User, __self__).__init__(
            'rancher2:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
        :param pulumi.Input[str] name: The user full name (string)
        :param pulumi.Input[str] password: The user password (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principal_ids: (Computed) The user principal IDs (list)
        :param pulumi.Input[str] username: The user username (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["principal_ids"] = principal_ids
        __props__.__dict__["username"] = username
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for global role binding (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for global role binding (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The user full name (string)
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
    @pulumi.getter(name="principalIds")
    def principal_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        (Computed) The user principal IDs (list)
        """
        return pulumi.get(self, "principal_ids")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The user username (string)
        """
        return pulumi.get(self, "username")

