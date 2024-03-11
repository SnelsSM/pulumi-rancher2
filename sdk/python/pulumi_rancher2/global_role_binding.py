# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GlobalRoleBindingArgs', 'GlobalRoleBinding']

@pulumi.input_type
class GlobalRoleBindingArgs:
    def __init__(__self__, *,
                 global_role_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GlobalRoleBinding resource.
        :param pulumi.Input[str] global_role_id: The role id from create global role binding (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[str] group_principal_id: The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
               
               **Note:** user `user_id` OR group `group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the global role binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign global role binding (string)
        """
        pulumi.set(__self__, "global_role_id", global_role_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if group_principal_id is not None:
            pulumi.set(__self__, "group_principal_id", group_principal_id)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="globalRoleId")
    def global_role_id(self) -> pulumi.Input[str]:
        """
        The role id from create global role binding (string)
        """
        return pulumi.get(self, "global_role_id")

    @global_role_id.setter
    def global_role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "global_role_id", value)

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
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        """
        return pulumi.get(self, "group_principal_id")

    @group_principal_id.setter
    def group_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_principal_id", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role binding (map)

        **Note:** user `user_id` OR group `group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the global role binding (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user ID to assign global role binding (string)
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _GlobalRoleBindingState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 global_role_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GlobalRoleBinding resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[str] global_role_id: The role id from create global role binding (string)
        :param pulumi.Input[str] group_principal_id: The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
               
               **Note:** user `user_id` OR group `group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the global role binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign global role binding (string)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if global_role_id is not None:
            pulumi.set(__self__, "global_role_id", global_role_id)
        if group_principal_id is not None:
            pulumi.set(__self__, "group_principal_id", group_principal_id)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

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
    @pulumi.getter(name="globalRoleId")
    def global_role_id(self) -> Optional[pulumi.Input[str]]:
        """
        The role id from create global role binding (string)
        """
        return pulumi.get(self, "global_role_id")

    @global_role_id.setter
    def global_role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "global_role_id", value)

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        """
        return pulumi.get(self, "group_principal_id")

    @group_principal_id.setter
    def group_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_principal_id", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role binding (map)

        **Note:** user `user_id` OR group `group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the global role binding (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user ID to assign global role binding (string)
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class GlobalRoleBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 global_role_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global Role Binding using user_id
        foo = rancher2.GlobalRoleBinding("foo",
            global_role_id="admin",
            user_id="user-XXXXX")
        # Create a new rancher2 Global Role Binding using group_principal_id
        foo2 = rancher2.GlobalRoleBinding("foo2",
            global_role_id="admin",
            group_principal_id="local://g-XXXXX")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Global Role Bindings can be imported using the Rancher Global Role Binding ID

        ```sh
        $ pulumi import rancher2:index/globalRoleBinding:GlobalRoleBinding foo &lt;GLOBAL_ROLE_BINDING_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[str] global_role_id: The role id from create global role binding (string)
        :param pulumi.Input[str] group_principal_id: The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
               
               **Note:** user `user_id` OR group `group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the global role binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign global role binding (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GlobalRoleBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global Role Binding using user_id
        foo = rancher2.GlobalRoleBinding("foo",
            global_role_id="admin",
            user_id="user-XXXXX")
        # Create a new rancher2 Global Role Binding using group_principal_id
        foo2 = rancher2.GlobalRoleBinding("foo2",
            global_role_id="admin",
            group_principal_id="local://g-XXXXX")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Global Role Bindings can be imported using the Rancher Global Role Binding ID

        ```sh
        $ pulumi import rancher2:index/globalRoleBinding:GlobalRoleBinding foo &lt;GLOBAL_ROLE_BINDING_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param GlobalRoleBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalRoleBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 global_role_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalRoleBindingArgs.__new__(GlobalRoleBindingArgs)

            __props__.__dict__["annotations"] = annotations
            if global_role_id is None and not opts.urn:
                raise TypeError("Missing required property 'global_role_id'")
            __props__.__dict__["global_role_id"] = global_role_id
            __props__.__dict__["group_principal_id"] = group_principal_id
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["user_id"] = user_id
        super(GlobalRoleBinding, __self__).__init__(
            'rancher2:index/globalRoleBinding:GlobalRoleBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            global_role_id: Optional[pulumi.Input[str]] = None,
            group_principal_id: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'GlobalRoleBinding':
        """
        Get an existing GlobalRoleBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role binding (map)
        :param pulumi.Input[str] global_role_id: The role id from create global role binding (string)
        :param pulumi.Input[str] group_principal_id: The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role binding (map)
               
               **Note:** user `user_id` OR group `group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the global role binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign global role binding (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalRoleBindingState.__new__(_GlobalRoleBindingState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["global_role_id"] = global_role_id
        __props__.__dict__["group_principal_id"] = group_principal_id
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["user_id"] = user_id
        return GlobalRoleBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for global role binding (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="globalRoleId")
    def global_role_id(self) -> pulumi.Output[str]:
        """
        The role id from create global role binding (string)
        """
        return pulumi.get(self, "global_role_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> pulumi.Output[str]:
        """
        The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
        """
        return pulumi.get(self, "group_principal_id")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for global role binding (map)

        **Note:** user `user_id` OR group `group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the global role binding (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The user ID to assign global role binding (string)
        """
        return pulumi.get(self, "user_id")

