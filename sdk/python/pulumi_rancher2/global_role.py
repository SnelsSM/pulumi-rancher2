# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['GlobalRoleArgs', 'GlobalRole']

@pulumi.input_type
class GlobalRoleArgs:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inherited_cluster_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_user_default: Optional[pulumi.Input[bool]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]] = None):
        """
        The set of arguments for constructing a GlobalRole resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role object (map)
        :param pulumi.Input[str] description: Global role description (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] inherited_cluster_roles: Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role object (map)
        :param pulumi.Input[str] name: Global role name (string)
        :param pulumi.Input[bool] new_user_default: Whether or not this role should be added to new users. Default `false` (bool)
        :param pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]] rules: Global role policy rules (list)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if inherited_cluster_roles is not None:
            pulumi.set(__self__, "inherited_cluster_roles", inherited_cluster_roles)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if new_user_default is not None:
            pulumi.set(__self__, "new_user_default", new_user_default)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for global role object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Global role description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="inheritedClusterRoles")
    def inherited_cluster_roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        """
        return pulumi.get(self, "inherited_cluster_roles")

    @inherited_cluster_roles.setter
    def inherited_cluster_roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "inherited_cluster_roles", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Global role name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="newUserDefault")
    def new_user_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not this role should be added to new users. Default `false` (bool)
        """
        return pulumi.get(self, "new_user_default")

    @new_user_default.setter
    def new_user_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "new_user_default", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]]:
        """
        Global role policy rules (list)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _GlobalRoleState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 builtin: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inherited_cluster_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_user_default: Optional[pulumi.Input[bool]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering GlobalRole resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role object (map)
        :param pulumi.Input[bool] builtin: (Computed) Builtin global role (bool)
        :param pulumi.Input[str] description: Global role description (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] inherited_cluster_roles: Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role object (map)
        :param pulumi.Input[str] name: Global role name (string)
        :param pulumi.Input[bool] new_user_default: Whether or not this role should be added to new users. Default `false` (bool)
        :param pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]] rules: Global role policy rules (list)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if builtin is not None:
            pulumi.set(__self__, "builtin", builtin)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if inherited_cluster_roles is not None:
            pulumi.set(__self__, "inherited_cluster_roles", inherited_cluster_roles)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if new_user_default is not None:
            pulumi.set(__self__, "new_user_default", new_user_default)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for global role object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def builtin(self) -> Optional[pulumi.Input[bool]]:
        """
        (Computed) Builtin global role (bool)
        """
        return pulumi.get(self, "builtin")

    @builtin.setter
    def builtin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "builtin", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Global role description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="inheritedClusterRoles")
    def inherited_cluster_roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        """
        return pulumi.get(self, "inherited_cluster_roles")

    @inherited_cluster_roles.setter
    def inherited_cluster_roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "inherited_cluster_roles", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for global role object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Global role name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="newUserDefault")
    def new_user_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not this role should be added to new users. Default `false` (bool)
        """
        return pulumi.get(self, "new_user_default")

    @new_user_default.setter
    def new_user_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "new_user_default", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]]:
        """
        Global role policy rules (list)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalRoleRuleArgs']]]]):
        pulumi.set(self, "rules", value)


class GlobalRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inherited_cluster_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_user_default: Optional[pulumi.Input[bool]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalRoleRuleArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Global Role resource. This can be used to create Global Role for Rancher v2 and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global Role
        foo = rancher2.GlobalRole("foo",
            description="Terraform global role acceptance test",
            new_user_default=True,
            rules=[rancher2.GlobalRoleRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ## Import

        Global Role can be imported using the Rancher Global Role ID

        ```sh
         $ pulumi import rancher2:index/globalRole:GlobalRole foo &lt;global_role_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role object (map)
        :param pulumi.Input[str] description: Global role description (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] inherited_cluster_roles: Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role object (map)
        :param pulumi.Input[str] name: Global role name (string)
        :param pulumi.Input[bool] new_user_default: Whether or not this role should be added to new users. Default `false` (bool)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalRoleRuleArgs']]]] rules: Global role policy rules (list)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GlobalRoleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Global Role resource. This can be used to create Global Role for Rancher v2 and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global Role
        foo = rancher2.GlobalRole("foo",
            description="Terraform global role acceptance test",
            new_user_default=True,
            rules=[rancher2.GlobalRoleRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ## Import

        Global Role can be imported using the Rancher Global Role ID

        ```sh
         $ pulumi import rancher2:index/globalRole:GlobalRole foo &lt;global_role_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param GlobalRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inherited_cluster_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_user_default: Optional[pulumi.Input[bool]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalRoleRuleArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalRoleArgs.__new__(GlobalRoleArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["description"] = description
            __props__.__dict__["inherited_cluster_roles"] = inherited_cluster_roles
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["new_user_default"] = new_user_default
            __props__.__dict__["rules"] = rules
            __props__.__dict__["builtin"] = None
        super(GlobalRole, __self__).__init__(
            'rancher2:index/globalRole:GlobalRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            builtin: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            inherited_cluster_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            new_user_default: Optional[pulumi.Input[bool]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalRoleRuleArgs']]]]] = None) -> 'GlobalRole':
        """
        Get an existing GlobalRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for global role object (map)
        :param pulumi.Input[bool] builtin: (Computed) Builtin global role (bool)
        :param pulumi.Input[str] description: Global role description (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] inherited_cluster_roles: Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for global role object (map)
        :param pulumi.Input[str] name: Global role name (string)
        :param pulumi.Input[bool] new_user_default: Whether or not this role should be added to new users. Default `false` (bool)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GlobalRoleRuleArgs']]]] rules: Global role policy rules (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalRoleState.__new__(_GlobalRoleState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["builtin"] = builtin
        __props__.__dict__["description"] = description
        __props__.__dict__["inherited_cluster_roles"] = inherited_cluster_roles
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["new_user_default"] = new_user_default
        __props__.__dict__["rules"] = rules
        return GlobalRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for global role object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> pulumi.Output[bool]:
        """
        (Computed) Builtin global role (bool)
        """
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Global role description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="inheritedClusterRoles")
    def inherited_cluster_roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
        """
        return pulumi.get(self, "inherited_cluster_roles")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for global role object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Global role name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="newUserDefault")
    def new_user_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not this role should be added to new users. Default `false` (bool)
        """
        return pulumi.get(self, "new_user_default")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.GlobalRoleRule']]:
        """
        Global role policy rules (list)
        """
        return pulumi.get(self, "rules")

