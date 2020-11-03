# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['AuthConfigFreeIpa']


class AuthConfigFreeIpa(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 connection_timeout: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 group_dn_attribute: Optional[pulumi.Input[str]] = None,
                 group_member_mapping_attribute: Optional[pulumi.Input[str]] = None,
                 group_member_user_attribute: Optional[pulumi.Input[str]] = None,
                 group_name_attribute: Optional[pulumi.Input[str]] = None,
                 group_object_class: Optional[pulumi.Input[str]] = None,
                 group_search_attribute: Optional[pulumi.Input[str]] = None,
                 group_search_base: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 nested_group_membership_enabled: Optional[pulumi.Input[bool]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_account_distinguished_name: Optional[pulumi.Input[str]] = None,
                 service_account_password: Optional[pulumi.Input[str]] = None,
                 test_password: Optional[pulumi.Input[str]] = None,
                 test_username: Optional[pulumi.Input[str]] = None,
                 tls: Optional[pulumi.Input[bool]] = None,
                 user_disabled_bit_mask: Optional[pulumi.Input[int]] = None,
                 user_enabled_attribute: Optional[pulumi.Input[str]] = None,
                 user_login_attribute: Optional[pulumi.Input[str]] = None,
                 user_member_attribute: Optional[pulumi.Input[str]] = None,
                 user_name_attribute: Optional[pulumi.Input[str]] = None,
                 user_object_class: Optional[pulumi.Input[str]] = None,
                 user_search_attribute: Optional[pulumi.Input[str]] = None,
                 user_search_base: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Auth Config FreeIpa resource. This can be used to configure and enable Auth Config FreeIpa for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] certificate: Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
        :param pulumi.Input[int] connection_timeout: FreeIpa connection timeout. Default `5000` (int)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] group_dn_attribute: Group DN attribute. Default `entryDN` (string)
        :param pulumi.Input[str] group_member_mapping_attribute: Group member mapping attribute. Default `member` (string)
        :param pulumi.Input[str] group_member_user_attribute: Group member user attribute. Default `entryDN` (string)
        :param pulumi.Input[str] group_name_attribute: Group name attribute. Default `cn` (string)
        :param pulumi.Input[str] group_object_class: Group object class. Default `groupOfNames` (string)
        :param pulumi.Input[str] group_search_attribute: Group search attribute. Default `cn` (string)
        :param pulumi.Input[str] group_search_base: Group search base (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[bool] nested_group_membership_enabled: Nested group membership enable. Default `false` (bool)
        :param pulumi.Input[int] port: FreeIpa port. Default `389` (int)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] servers: FreeIpa servers list (list)
        :param pulumi.Input[str] service_account_distinguished_name: Service account DN for access FreeIpa service (string)
        :param pulumi.Input[str] service_account_password: Service account password for access FreeIpa service (string)
        :param pulumi.Input[str] test_password: Password for test access to FreeIpa service (string)
        :param pulumi.Input[str] test_username: Username for test access to FreeIpa service (string)
        :param pulumi.Input[bool] tls: Enable TLS connection (bool)
        :param pulumi.Input[int] user_disabled_bit_mask: User disabled bit mask (int)
        :param pulumi.Input[str] user_enabled_attribute: User enable attribute (string)
        :param pulumi.Input[str] user_login_attribute: User login attribute. Default `uid` (string)
        :param pulumi.Input[str] user_member_attribute: User member attribute. Default `memberOf` (string)
        :param pulumi.Input[str] user_name_attribute: User name attribute. Default `givenName` (string)
        :param pulumi.Input[str] user_object_class: User object class. Default `inetorgperson` (string)
        :param pulumi.Input[str] user_search_attribute: User search attribute. Default `uid|sn|givenName` (string)
        :param pulumi.Input[str] user_search_base: User search base DN (string)
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
            __props__['certificate'] = certificate
            __props__['connection_timeout'] = connection_timeout
            __props__['enabled'] = enabled
            __props__['group_dn_attribute'] = group_dn_attribute
            __props__['group_member_mapping_attribute'] = group_member_mapping_attribute
            __props__['group_member_user_attribute'] = group_member_user_attribute
            __props__['group_name_attribute'] = group_name_attribute
            __props__['group_object_class'] = group_object_class
            __props__['group_search_attribute'] = group_search_attribute
            __props__['group_search_base'] = group_search_base
            __props__['labels'] = labels
            __props__['nested_group_membership_enabled'] = nested_group_membership_enabled
            __props__['port'] = port
            if servers is None:
                raise TypeError("Missing required property 'servers'")
            __props__['servers'] = servers
            if service_account_distinguished_name is None:
                raise TypeError("Missing required property 'service_account_distinguished_name'")
            __props__['service_account_distinguished_name'] = service_account_distinguished_name
            if service_account_password is None:
                raise TypeError("Missing required property 'service_account_password'")
            __props__['service_account_password'] = service_account_password
            if test_password is None:
                raise TypeError("Missing required property 'test_password'")
            __props__['test_password'] = test_password
            if test_username is None:
                raise TypeError("Missing required property 'test_username'")
            __props__['test_username'] = test_username
            __props__['tls'] = tls
            __props__['user_disabled_bit_mask'] = user_disabled_bit_mask
            __props__['user_enabled_attribute'] = user_enabled_attribute
            __props__['user_login_attribute'] = user_login_attribute
            __props__['user_member_attribute'] = user_member_attribute
            __props__['user_name_attribute'] = user_name_attribute
            __props__['user_object_class'] = user_object_class
            __props__['user_search_attribute'] = user_search_attribute
            if user_search_base is None:
                raise TypeError("Missing required property 'user_search_base'")
            __props__['user_search_base'] = user_search_base
            __props__['name'] = None
            __props__['type'] = None
        super(AuthConfigFreeIpa, __self__).__init__(
            'rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa',
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
            certificate: Optional[pulumi.Input[str]] = None,
            connection_timeout: Optional[pulumi.Input[int]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            group_dn_attribute: Optional[pulumi.Input[str]] = None,
            group_member_mapping_attribute: Optional[pulumi.Input[str]] = None,
            group_member_user_attribute: Optional[pulumi.Input[str]] = None,
            group_name_attribute: Optional[pulumi.Input[str]] = None,
            group_object_class: Optional[pulumi.Input[str]] = None,
            group_search_attribute: Optional[pulumi.Input[str]] = None,
            group_search_base: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            nested_group_membership_enabled: Optional[pulumi.Input[bool]] = None,
            port: Optional[pulumi.Input[int]] = None,
            servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            service_account_distinguished_name: Optional[pulumi.Input[str]] = None,
            service_account_password: Optional[pulumi.Input[str]] = None,
            test_password: Optional[pulumi.Input[str]] = None,
            test_username: Optional[pulumi.Input[str]] = None,
            tls: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None,
            user_disabled_bit_mask: Optional[pulumi.Input[int]] = None,
            user_enabled_attribute: Optional[pulumi.Input[str]] = None,
            user_login_attribute: Optional[pulumi.Input[str]] = None,
            user_member_attribute: Optional[pulumi.Input[str]] = None,
            user_name_attribute: Optional[pulumi.Input[str]] = None,
            user_object_class: Optional[pulumi.Input[str]] = None,
            user_search_attribute: Optional[pulumi.Input[str]] = None,
            user_search_base: Optional[pulumi.Input[str]] = None) -> 'AuthConfigFreeIpa':
        """
        Get an existing AuthConfigFreeIpa resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] certificate: Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
        :param pulumi.Input[int] connection_timeout: FreeIpa connection timeout. Default `5000` (int)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] group_dn_attribute: Group DN attribute. Default `entryDN` (string)
        :param pulumi.Input[str] group_member_mapping_attribute: Group member mapping attribute. Default `member` (string)
        :param pulumi.Input[str] group_member_user_attribute: Group member user attribute. Default `entryDN` (string)
        :param pulumi.Input[str] group_name_attribute: Group name attribute. Default `cn` (string)
        :param pulumi.Input[str] group_object_class: Group object class. Default `groupOfNames` (string)
        :param pulumi.Input[str] group_search_attribute: Group search attribute. Default `cn` (string)
        :param pulumi.Input[str] group_search_base: Group search base (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[bool] nested_group_membership_enabled: Nested group membership enable. Default `false` (bool)
        :param pulumi.Input[int] port: FreeIpa port. Default `389` (int)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] servers: FreeIpa servers list (list)
        :param pulumi.Input[str] service_account_distinguished_name: Service account DN for access FreeIpa service (string)
        :param pulumi.Input[str] service_account_password: Service account password for access FreeIpa service (string)
        :param pulumi.Input[str] test_password: Password for test access to FreeIpa service (string)
        :param pulumi.Input[str] test_username: Username for test access to FreeIpa service (string)
        :param pulumi.Input[bool] tls: Enable TLS connection (bool)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        :param pulumi.Input[int] user_disabled_bit_mask: User disabled bit mask (int)
        :param pulumi.Input[str] user_enabled_attribute: User enable attribute (string)
        :param pulumi.Input[str] user_login_attribute: User login attribute. Default `uid` (string)
        :param pulumi.Input[str] user_member_attribute: User member attribute. Default `memberOf` (string)
        :param pulumi.Input[str] user_name_attribute: User name attribute. Default `givenName` (string)
        :param pulumi.Input[str] user_object_class: User object class. Default `inetorgperson` (string)
        :param pulumi.Input[str] user_search_attribute: User search attribute. Default `uid|sn|givenName` (string)
        :param pulumi.Input[str] user_search_base: User search base DN (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_mode"] = access_mode
        __props__["allowed_principal_ids"] = allowed_principal_ids
        __props__["annotations"] = annotations
        __props__["certificate"] = certificate
        __props__["connection_timeout"] = connection_timeout
        __props__["enabled"] = enabled
        __props__["group_dn_attribute"] = group_dn_attribute
        __props__["group_member_mapping_attribute"] = group_member_mapping_attribute
        __props__["group_member_user_attribute"] = group_member_user_attribute
        __props__["group_name_attribute"] = group_name_attribute
        __props__["group_object_class"] = group_object_class
        __props__["group_search_attribute"] = group_search_attribute
        __props__["group_search_base"] = group_search_base
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["nested_group_membership_enabled"] = nested_group_membership_enabled
        __props__["port"] = port
        __props__["servers"] = servers
        __props__["service_account_distinguished_name"] = service_account_distinguished_name
        __props__["service_account_password"] = service_account_password
        __props__["test_password"] = test_password
        __props__["test_username"] = test_username
        __props__["tls"] = tls
        __props__["type"] = type
        __props__["user_disabled_bit_mask"] = user_disabled_bit_mask
        __props__["user_enabled_attribute"] = user_enabled_attribute
        __props__["user_login_attribute"] = user_login_attribute
        __props__["user_member_attribute"] = user_member_attribute
        __props__["user_name_attribute"] = user_name_attribute
        __props__["user_object_class"] = user_object_class
        __props__["user_search_attribute"] = user_search_attribute
        __props__["user_search_base"] = user_search_base
        return AuthConfigFreeIpa(resource_name, opts=opts, __props__=__props__)

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
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://<DN>`  `freeipa_group://<DN>` (list)
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
    @pulumi.getter
    def certificate(self) -> pulumi.Output[Optional[str]]:
        """
        Base64 encoded CA certificate for TLS if self-signed. Use filebase64(<FILE>) for encoding file (string)
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="connectionTimeout")
    def connection_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        FreeIpa connection timeout. Default `5000` (int)
        """
        return pulumi.get(self, "connection_timeout")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="groupDnAttribute")
    def group_dn_attribute(self) -> pulumi.Output[str]:
        """
        Group DN attribute. Default `entryDN` (string)
        """
        return pulumi.get(self, "group_dn_attribute")

    @property
    @pulumi.getter(name="groupMemberMappingAttribute")
    def group_member_mapping_attribute(self) -> pulumi.Output[str]:
        """
        Group member mapping attribute. Default `member` (string)
        """
        return pulumi.get(self, "group_member_mapping_attribute")

    @property
    @pulumi.getter(name="groupMemberUserAttribute")
    def group_member_user_attribute(self) -> pulumi.Output[str]:
        """
        Group member user attribute. Default `entryDN` (string)
        """
        return pulumi.get(self, "group_member_user_attribute")

    @property
    @pulumi.getter(name="groupNameAttribute")
    def group_name_attribute(self) -> pulumi.Output[str]:
        """
        Group name attribute. Default `cn` (string)
        """
        return pulumi.get(self, "group_name_attribute")

    @property
    @pulumi.getter(name="groupObjectClass")
    def group_object_class(self) -> pulumi.Output[str]:
        """
        Group object class. Default `groupOfNames` (string)
        """
        return pulumi.get(self, "group_object_class")

    @property
    @pulumi.getter(name="groupSearchAttribute")
    def group_search_attribute(self) -> pulumi.Output[str]:
        """
        Group search attribute. Default `cn` (string)
        """
        return pulumi.get(self, "group_search_attribute")

    @property
    @pulumi.getter(name="groupSearchBase")
    def group_search_base(self) -> pulumi.Output[str]:
        """
        Group search base (string)
        """
        return pulumi.get(self, "group_search_base")

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
    @pulumi.getter(name="nestedGroupMembershipEnabled")
    def nested_group_membership_enabled(self) -> pulumi.Output[bool]:
        """
        Nested group membership enable. Default `false` (bool)
        """
        return pulumi.get(self, "nested_group_membership_enabled")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[int]]:
        """
        FreeIpa port. Default `389` (int)
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def servers(self) -> pulumi.Output[Sequence[str]]:
        """
        FreeIpa servers list (list)
        """
        return pulumi.get(self, "servers")

    @property
    @pulumi.getter(name="serviceAccountDistinguishedName")
    def service_account_distinguished_name(self) -> pulumi.Output[str]:
        """
        Service account DN for access FreeIpa service (string)
        """
        return pulumi.get(self, "service_account_distinguished_name")

    @property
    @pulumi.getter(name="serviceAccountPassword")
    def service_account_password(self) -> pulumi.Output[str]:
        """
        Service account password for access FreeIpa service (string)
        """
        return pulumi.get(self, "service_account_password")

    @property
    @pulumi.getter(name="testPassword")
    def test_password(self) -> pulumi.Output[str]:
        """
        Password for test access to FreeIpa service (string)
        """
        return pulumi.get(self, "test_password")

    @property
    @pulumi.getter(name="testUsername")
    def test_username(self) -> pulumi.Output[str]:
        """
        Username for test access to FreeIpa service (string)
        """
        return pulumi.get(self, "test_username")

    @property
    @pulumi.getter
    def tls(self) -> pulumi.Output[bool]:
        """
        Enable TLS connection (bool)
        """
        return pulumi.get(self, "tls")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        (Computed) The type of the resource (string)
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userDisabledBitMask")
    def user_disabled_bit_mask(self) -> pulumi.Output[int]:
        """
        User disabled bit mask (int)
        """
        return pulumi.get(self, "user_disabled_bit_mask")

    @property
    @pulumi.getter(name="userEnabledAttribute")
    def user_enabled_attribute(self) -> pulumi.Output[str]:
        """
        User enable attribute (string)
        """
        return pulumi.get(self, "user_enabled_attribute")

    @property
    @pulumi.getter(name="userLoginAttribute")
    def user_login_attribute(self) -> pulumi.Output[str]:
        """
        User login attribute. Default `uid` (string)
        """
        return pulumi.get(self, "user_login_attribute")

    @property
    @pulumi.getter(name="userMemberAttribute")
    def user_member_attribute(self) -> pulumi.Output[str]:
        """
        User member attribute. Default `memberOf` (string)
        """
        return pulumi.get(self, "user_member_attribute")

    @property
    @pulumi.getter(name="userNameAttribute")
    def user_name_attribute(self) -> pulumi.Output[str]:
        """
        User name attribute. Default `givenName` (string)
        """
        return pulumi.get(self, "user_name_attribute")

    @property
    @pulumi.getter(name="userObjectClass")
    def user_object_class(self) -> pulumi.Output[str]:
        """
        User object class. Default `inetorgperson` (string)
        """
        return pulumi.get(self, "user_object_class")

    @property
    @pulumi.getter(name="userSearchAttribute")
    def user_search_attribute(self) -> pulumi.Output[str]:
        """
        User search attribute. Default `uid|sn|givenName` (string)
        """
        return pulumi.get(self, "user_search_attribute")

    @property
    @pulumi.getter(name="userSearchBase")
    def user_search_base(self) -> pulumi.Output[str]:
        """
        User search base DN (string)
        """
        return pulumi.get(self, "user_search_base")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

