# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['AuthConfigOkta']


class AuthConfigOkta(pulumi.CustomResource):
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
        Provides a Rancher v2 Auth Config OKTA resource. This can be used to configure and enable Auth Config OKTA for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config OKTA
        okta = rancher2.AuthConfigOkta("okta",
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
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: OKTA display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: OKTA group field (string)
        :param pulumi.Input[str] idp_metadata_content: OKTA IDP metadata content (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] rancher_api_host: Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: OKTA SP cert (string)
        :param pulumi.Input[str] sp_key: OKTA SP key (string)
        :param pulumi.Input[str] uid_field: OKTA UID field (string)
        :param pulumi.Input[str] user_name_field: OKTA user name field (string)
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
        super(AuthConfigOkta, __self__).__init__(
            'rancher2:index/authConfigOkta:AuthConfigOkta',
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
            user_name_field: Optional[pulumi.Input[str]] = None) -> 'AuthConfigOkta':
        """
        Get an existing AuthConfigOkta resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: OKTA display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: OKTA group field (string)
        :param pulumi.Input[str] idp_metadata_content: OKTA IDP metadata content (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_api_host: Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: OKTA SP cert (string)
        :param pulumi.Input[str] sp_key: OKTA SP key (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        :param pulumi.Input[str] uid_field: OKTA UID field (string)
        :param pulumi.Input[str] user_name_field: OKTA user name field (string)
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
        return AuthConfigOkta(resource_name, opts=opts, __props__=__props__)

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
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
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
        OKTA display name field (string)
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
        OKTA group field (string)
        """
        return pulumi.get(self, "groups_field")

    @property
    @pulumi.getter(name="idpMetadataContent")
    def idp_metadata_content(self) -> pulumi.Output[str]:
        """
        OKTA IDP metadata content (string)
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
        OKTA SP cert (string)
        """
        return pulumi.get(self, "sp_cert")

    @property
    @pulumi.getter(name="spKey")
    def sp_key(self) -> pulumi.Output[str]:
        """
        OKTA SP key (string)
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
        OKTA UID field (string)
        """
        return pulumi.get(self, "uid_field")

    @property
    @pulumi.getter(name="userNameField")
    def user_name_field(self) -> pulumi.Output[str]:
        """
        OKTA user name field (string)
        """
        return pulumi.get(self, "user_name_field")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

