# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['AuthConfigPingArgs', 'AuthConfigPing']

@pulumi.input_type
class AuthConfigPingArgs:
    def __init__(__self__, *,
                 display_name_field: pulumi.Input[str],
                 groups_field: pulumi.Input[str],
                 idp_metadata_content: pulumi.Input[str],
                 rancher_api_host: pulumi.Input[str],
                 sp_cert: pulumi.Input[str],
                 sp_key: pulumi.Input[str],
                 uid_field: pulumi.Input[str],
                 user_name_field: pulumi.Input[str],
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a AuthConfigPing resource.
        :param pulumi.Input[str] display_name_field: Ping display name field (string)
        :param pulumi.Input[str] groups_field: Ping group field (string)
        :param pulumi.Input[str] idp_metadata_content: Ping IDP metadata content (string)
        :param pulumi.Input[str] rancher_api_host: Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: Ping SP cert (string)
        :param pulumi.Input[str] sp_key: Ping SP key (string)
        :param pulumi.Input[str] uid_field: Ping UID field (string)
        :param pulumi.Input[str] user_name_field: Ping user name field (string)
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        """
        pulumi.set(__self__, "display_name_field", display_name_field)
        pulumi.set(__self__, "groups_field", groups_field)
        pulumi.set(__self__, "idp_metadata_content", idp_metadata_content)
        pulumi.set(__self__, "rancher_api_host", rancher_api_host)
        pulumi.set(__self__, "sp_cert", sp_cert)
        pulumi.set(__self__, "sp_key", sp_key)
        pulumi.set(__self__, "uid_field", uid_field)
        pulumi.set(__self__, "user_name_field", user_name_field)
        if access_mode is not None:
            pulumi.set(__self__, "access_mode", access_mode)
        if allowed_principal_ids is not None:
            pulumi.set(__self__, "allowed_principal_ids", allowed_principal_ids)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)

    @property
    @pulumi.getter(name="displayNameField")
    def display_name_field(self) -> pulumi.Input[str]:
        """
        Ping display name field (string)
        """
        return pulumi.get(self, "display_name_field")

    @display_name_field.setter
    def display_name_field(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name_field", value)

    @property
    @pulumi.getter(name="groupsField")
    def groups_field(self) -> pulumi.Input[str]:
        """
        Ping group field (string)
        """
        return pulumi.get(self, "groups_field")

    @groups_field.setter
    def groups_field(self, value: pulumi.Input[str]):
        pulumi.set(self, "groups_field", value)

    @property
    @pulumi.getter(name="idpMetadataContent")
    def idp_metadata_content(self) -> pulumi.Input[str]:
        """
        Ping IDP metadata content (string)
        """
        return pulumi.get(self, "idp_metadata_content")

    @idp_metadata_content.setter
    def idp_metadata_content(self, value: pulumi.Input[str]):
        pulumi.set(self, "idp_metadata_content", value)

    @property
    @pulumi.getter(name="rancherApiHost")
    def rancher_api_host(self) -> pulumi.Input[str]:
        """
        Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        """
        return pulumi.get(self, "rancher_api_host")

    @rancher_api_host.setter
    def rancher_api_host(self, value: pulumi.Input[str]):
        pulumi.set(self, "rancher_api_host", value)

    @property
    @pulumi.getter(name="spCert")
    def sp_cert(self) -> pulumi.Input[str]:
        """
        Ping SP cert (string)
        """
        return pulumi.get(self, "sp_cert")

    @sp_cert.setter
    def sp_cert(self, value: pulumi.Input[str]):
        pulumi.set(self, "sp_cert", value)

    @property
    @pulumi.getter(name="spKey")
    def sp_key(self) -> pulumi.Input[str]:
        """
        Ping SP key (string)
        """
        return pulumi.get(self, "sp_key")

    @sp_key.setter
    def sp_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "sp_key", value)

    @property
    @pulumi.getter(name="uidField")
    def uid_field(self) -> pulumi.Input[str]:
        """
        Ping UID field (string)
        """
        return pulumi.get(self, "uid_field")

    @uid_field.setter
    def uid_field(self, value: pulumi.Input[str]):
        pulumi.set(self, "uid_field", value)

    @property
    @pulumi.getter(name="userNameField")
    def user_name_field(self) -> pulumi.Input[str]:
        """
        Ping user name field (string)
        """
        return pulumi.get(self, "user_name_field")

    @user_name_field.setter
    def user_name_field(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name_field", value)

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
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
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
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)


class AuthConfigPing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 display_name_field: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 groups_field: Optional[pulumi.Input[str]] = None,
                 idp_metadata_content: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 rancher_api_host: Optional[pulumi.Input[str]] = None,
                 sp_cert: Optional[pulumi.Input[str]] = None,
                 sp_key: Optional[pulumi.Input[str]] = None,
                 uid_field: Optional[pulumi.Input[str]] = None,
                 user_name_field: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Auth Config Ping resource. This can be used to configure and enable Auth Config Ping for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config Ping
        ping = rancher2.AuthConfigPing("ping",
            display_name_field="<DISPLAY_NAME_FIELD>",
            groups_field="<GROUPS_FIELD>",
            idp_metadata_content="<IDP_METADATA_CONTENT>",
            rancher_api_host="https://<RANCHER_API_HOST>",
            sp_cert="<SP_CERT>",
            sp_key="<SP_KEY>",
            uid_field="<UID_FIELD>",
            user_name_field="<USER_NAME_FIELD>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: Ping display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: Ping group field (string)
        :param pulumi.Input[str] idp_metadata_content: Ping IDP metadata content (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] rancher_api_host: Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: Ping SP cert (string)
        :param pulumi.Input[str] sp_key: Ping SP key (string)
        :param pulumi.Input[str] uid_field: Ping UID field (string)
        :param pulumi.Input[str] user_name_field: Ping user name field (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthConfigPingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Auth Config Ping resource. This can be used to configure and enable Auth Config Ping for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config Ping
        ping = rancher2.AuthConfigPing("ping",
            display_name_field="<DISPLAY_NAME_FIELD>",
            groups_field="<GROUPS_FIELD>",
            idp_metadata_content="<IDP_METADATA_CONTENT>",
            rancher_api_host="https://<RANCHER_API_HOST>",
            sp_cert="<SP_CERT>",
            sp_key="<SP_KEY>",
            uid_field="<UID_FIELD>",
            user_name_field="<USER_NAME_FIELD>")
        ```

        :param str resource_name: The name of the resource.
        :param AuthConfigPingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthConfigPingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 display_name_field: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 groups_field: Optional[pulumi.Input[str]] = None,
                 idp_metadata_content: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 rancher_api_host: Optional[pulumi.Input[str]] = None,
                 sp_cert: Optional[pulumi.Input[str]] = None,
                 sp_key: Optional[pulumi.Input[str]] = None,
                 uid_field: Optional[pulumi.Input[str]] = None,
                 user_name_field: Optional[pulumi.Input[str]] = None,
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

            __props__['access_mode'] = access_mode
            __props__['allowed_principal_ids'] = allowed_principal_ids
            __props__['annotations'] = annotations
            if display_name_field is None and not opts.urn:
                raise TypeError("Missing required property 'display_name_field'")
            __props__['display_name_field'] = display_name_field
            __props__['enabled'] = enabled
            if groups_field is None and not opts.urn:
                raise TypeError("Missing required property 'groups_field'")
            __props__['groups_field'] = groups_field
            if idp_metadata_content is None and not opts.urn:
                raise TypeError("Missing required property 'idp_metadata_content'")
            __props__['idp_metadata_content'] = idp_metadata_content
            __props__['labels'] = labels
            if rancher_api_host is None and not opts.urn:
                raise TypeError("Missing required property 'rancher_api_host'")
            __props__['rancher_api_host'] = rancher_api_host
            if sp_cert is None and not opts.urn:
                raise TypeError("Missing required property 'sp_cert'")
            __props__['sp_cert'] = sp_cert
            if sp_key is None and not opts.urn:
                raise TypeError("Missing required property 'sp_key'")
            __props__['sp_key'] = sp_key
            if uid_field is None and not opts.urn:
                raise TypeError("Missing required property 'uid_field'")
            __props__['uid_field'] = uid_field
            if user_name_field is None and not opts.urn:
                raise TypeError("Missing required property 'user_name_field'")
            __props__['user_name_field'] = user_name_field
            __props__['name'] = None
            __props__['type'] = None
        super(AuthConfigPing, __self__).__init__(
            'rancher2:index/authConfigPing:AuthConfigPing',
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
            display_name_field: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            groups_field: Optional[pulumi.Input[str]] = None,
            idp_metadata_content: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rancher_api_host: Optional[pulumi.Input[str]] = None,
            sp_cert: Optional[pulumi.Input[str]] = None,
            sp_key: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uid_field: Optional[pulumi.Input[str]] = None,
            user_name_field: Optional[pulumi.Input[str]] = None) -> 'AuthConfigPing':
        """
        Get an existing AuthConfigPing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: Ping display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: Ping group field (string)
        :param pulumi.Input[str] idp_metadata_content: Ping IDP metadata content (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_api_host: Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: Ping SP cert (string)
        :param pulumi.Input[str] sp_key: Ping SP key (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        :param pulumi.Input[str] uid_field: Ping UID field (string)
        :param pulumi.Input[str] user_name_field: Ping user name field (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_mode"] = access_mode
        __props__["allowed_principal_ids"] = allowed_principal_ids
        __props__["annotations"] = annotations
        __props__["display_name_field"] = display_name_field
        __props__["enabled"] = enabled
        __props__["groups_field"] = groups_field
        __props__["idp_metadata_content"] = idp_metadata_content
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["rancher_api_host"] = rancher_api_host
        __props__["sp_cert"] = sp_cert
        __props__["sp_key"] = sp_key
        __props__["type"] = type
        __props__["uid_field"] = uid_field
        __props__["user_name_field"] = user_name_field
        return AuthConfigPing(resource_name, opts=opts, __props__=__props__)

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
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
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
    @pulumi.getter(name="displayNameField")
    def display_name_field(self) -> pulumi.Output[str]:
        """
        Ping display name field (string)
        """
        return pulumi.get(self, "display_name_field")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="groupsField")
    def groups_field(self) -> pulumi.Output[str]:
        """
        Ping group field (string)
        """
        return pulumi.get(self, "groups_field")

    @property
    @pulumi.getter(name="idpMetadataContent")
    def idp_metadata_content(self) -> pulumi.Output[str]:
        """
        Ping IDP metadata content (string)
        """
        return pulumi.get(self, "idp_metadata_content")

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
    @pulumi.getter(name="rancherApiHost")
    def rancher_api_host(self) -> pulumi.Output[str]:
        """
        Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        """
        return pulumi.get(self, "rancher_api_host")

    @property
    @pulumi.getter(name="spCert")
    def sp_cert(self) -> pulumi.Output[str]:
        """
        Ping SP cert (string)
        """
        return pulumi.get(self, "sp_cert")

    @property
    @pulumi.getter(name="spKey")
    def sp_key(self) -> pulumi.Output[str]:
        """
        Ping SP key (string)
        """
        return pulumi.get(self, "sp_key")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        (Computed) The type of the resource (string)
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="uidField")
    def uid_field(self) -> pulumi.Output[str]:
        """
        Ping UID field (string)
        """
        return pulumi.get(self, "uid_field")

    @property
    @pulumi.getter(name="userNameField")
    def user_name_field(self) -> pulumi.Output[str]:
        """
        Ping user name field (string)
        """
        return pulumi.get(self, "user_name_field")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

