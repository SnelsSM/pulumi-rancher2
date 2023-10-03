# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ClusterRoleTemplateBindingArgs', 'ClusterRoleTemplateBinding']

@pulumi.input_type
class ClusterRoleTemplateBindingArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 role_template_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_principal_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClusterRoleTemplateBinding resource.
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster role template binding (map)
               
               **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
        """
        ClusterRoleTemplateBindingArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            role_template_id=role_template_id,
            annotations=annotations,
            group_id=group_id,
            group_principal_id=group_principal_id,
            labels=labels,
            name=name,
            user_id=user_id,
            user_principal_id=user_principal_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: pulumi.Input[str],
             role_template_id: pulumi.Input[str],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             group_id: Optional[pulumi.Input[str]] = None,
             group_principal_id: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             user_principal_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cluster_id", cluster_id)
        _setter("role_template_id", role_template_id)
        if annotations is not None:
            _setter("annotations", annotations)
        if group_id is not None:
            _setter("group_id", group_id)
        if group_principal_id is not None:
            _setter("group_principal_id", group_principal_id)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if user_id is not None:
            _setter("user_id", user_id)
        if user_principal_id is not None:
            _setter("user_principal_id", user_principal_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The cluster id where bind cluster role template binding (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> pulumi.Input[str]:
        """
        The role template id from create cluster role template binding (string)
        """
        return pulumi.get(self, "role_template_id")

    @role_template_id.setter
    def role_template_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_template_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for cluster role template binding (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_principal_id")

    @group_principal_id.setter
    def group_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_principal_id", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for cluster role template binding (map)

        **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cluster role template binding (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_principal_id")

    @user_principal_id.setter
    def user_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_principal_id", value)


@pulumi.input_type
class _ClusterRoleTemplateBindingState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_principal_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClusterRoleTemplateBinding resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster role template binding (map)
               
               **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
        """
        _ClusterRoleTemplateBindingState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            annotations=annotations,
            cluster_id=cluster_id,
            group_id=group_id,
            group_principal_id=group_principal_id,
            labels=labels,
            name=name,
            role_template_id=role_template_id,
            user_id=user_id,
            user_principal_id=user_principal_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             group_id: Optional[pulumi.Input[str]] = None,
             group_principal_id: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             role_template_id: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             user_principal_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if annotations is not None:
            _setter("annotations", annotations)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if group_id is not None:
            _setter("group_id", group_id)
        if group_principal_id is not None:
            _setter("group_principal_id", group_principal_id)
        if labels is not None:
            _setter("labels", labels)
        if name is not None:
            _setter("name", name)
        if role_template_id is not None:
            _setter("role_template_id", role_template_id)
        if user_id is not None:
            _setter("user_id", user_id)
        if user_principal_id is not None:
            _setter("user_principal_id", user_principal_id)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for cluster role template binding (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id where bind cluster role template binding (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_principal_id")

    @group_principal_id.setter
    def group_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_principal_id", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for cluster role template binding (map)

        **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cluster role template binding (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        The role template id from create cluster role template binding (string)
        """
        return pulumi.get(self, "role_template_id")

    @role_template_id.setter
    def role_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_template_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_principal_id")

    @user_principal_id.setter
    def user_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_principal_id", value)


class ClusterRoleTemplateBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_principal_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Cluster Role Template Binding
        foo = rancher2.ClusterRoleTemplateBinding("foo",
            cluster_id="<cluster_id>",
            role_template_id="<role_template_id>",
            user_id="<user_id>")
        ```

        ## Import

        Cluster Role Template Bindings can be imported using the Rancher cluster Role Template Binding ID

        ```sh
         $ pulumi import rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding foo &lt;CLUSTER_ROLE_TEMPLATE_BINDING_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster role template binding (map)
               
               **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterRoleTemplateBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Cluster Role Template Binding
        foo = rancher2.ClusterRoleTemplateBinding("foo",
            cluster_id="<cluster_id>",
            role_template_id="<role_template_id>",
            user_id="<user_id>")
        ```

        ## Import

        Cluster Role Template Bindings can be imported using the Rancher cluster Role Template Binding ID

        ```sh
         $ pulumi import rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding foo &lt;CLUSTER_ROLE_TEMPLATE_BINDING_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ClusterRoleTemplateBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterRoleTemplateBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ClusterRoleTemplateBindingArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_principal_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterRoleTemplateBindingArgs.__new__(ClusterRoleTemplateBindingArgs)

            __props__.__dict__["annotations"] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["group_principal_id"] = group_principal_id
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if role_template_id is None and not opts.urn:
                raise TypeError("Missing required property 'role_template_id'")
            __props__.__dict__["role_template_id"] = role_template_id
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["user_principal_id"] = user_principal_id
        super(ClusterRoleTemplateBinding, __self__).__init__(
            'rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_principal_id: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            role_template_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            user_principal_id: Optional[pulumi.Input[str]] = None) -> 'ClusterRoleTemplateBinding':
        """
        Get an existing ClusterRoleTemplateBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster role template binding (map)
               
               **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterRoleTemplateBindingState.__new__(_ClusterRoleTemplateBindingState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["group_principal_id"] = group_principal_id
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["role_template_id"] = role_template_id
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["user_principal_id"] = user_principal_id
        return ClusterRoleTemplateBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for cluster role template binding (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id where bind cluster role template binding (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The group ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> pulumi.Output[str]:
        """
        The group_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_principal_id")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for cluster role template binding (map)

        **Note:** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the cluster role template binding (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> pulumi.Output[str]:
        """
        The role template id from create cluster role template binding (string)
        """
        return pulumi.get(self, "role_template_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The user ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> pulumi.Output[str]:
        """
        The user_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_principal_id")

