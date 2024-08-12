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

__all__ = [
    'GetRoleTemplateResult',
    'AwaitableGetRoleTemplateResult',
    'get_role_template',
    'get_role_template_output',
]

@pulumi.output_type
class GetRoleTemplateResult:
    """
    A collection of values returned by getRoleTemplate.
    """
    def __init__(__self__, administrative=None, annotations=None, builtin=None, context=None, default_role=None, description=None, external=None, external_rules=None, hidden=None, id=None, labels=None, locked=None, name=None, role_template_ids=None, rules=None):
        if administrative and not isinstance(administrative, bool):
            raise TypeError("Expected argument 'administrative' to be a bool")
        pulumi.set(__self__, "administrative", administrative)
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if builtin and not isinstance(builtin, bool):
            raise TypeError("Expected argument 'builtin' to be a bool")
        pulumi.set(__self__, "builtin", builtin)
        if context and not isinstance(context, str):
            raise TypeError("Expected argument 'context' to be a str")
        pulumi.set(__self__, "context", context)
        if default_role and not isinstance(default_role, bool):
            raise TypeError("Expected argument 'default_role' to be a bool")
        pulumi.set(__self__, "default_role", default_role)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if external and not isinstance(external, bool):
            raise TypeError("Expected argument 'external' to be a bool")
        pulumi.set(__self__, "external", external)
        if external_rules and not isinstance(external_rules, list):
            raise TypeError("Expected argument 'external_rules' to be a list")
        pulumi.set(__self__, "external_rules", external_rules)
        if hidden and not isinstance(hidden, bool):
            raise TypeError("Expected argument 'hidden' to be a bool")
        pulumi.set(__self__, "hidden", hidden)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        pulumi.set(__self__, "locked", locked)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if role_template_ids and not isinstance(role_template_ids, list):
            raise TypeError("Expected argument 'role_template_ids' to be a list")
        pulumi.set(__self__, "role_template_ids", role_template_ids)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def administrative(self) -> bool:
        """
        (Computed) Administrative role template (bool)
        """
        return pulumi.get(self, "administrative")

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for role template object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> bool:
        """
        (Computed) Builtin role template (string)
        """
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def context(self) -> str:
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> bool:
        """
        (Computed) Default role template for new created cluster or project (bool)
        """
        return pulumi.get(self, "default_role")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) Role template description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def external(self) -> bool:
        """
        (Computed) External role template (bool)
        """
        return pulumi.get(self, "external")

    @property
    @pulumi.getter(name="externalRules")
    def external_rules(self) -> Sequence['outputs.GetRoleTemplateExternalRuleResult']:
        """
        (Computed) External rules used for authorization. (list)
        """
        return pulumi.get(self, "external_rules")

    @property
    @pulumi.getter
    def hidden(self) -> bool:
        """
        (Computed) Hidden role template (bool)
        """
        return pulumi.get(self, "hidden")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (Computed) Labels for role template object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        (Computed) Locked role template (bool)
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleTemplateIds")
    def role_template_ids(self) -> Sequence[str]:
        """
        (Computed) Inherit role template IDs (list)
        """
        return pulumi.get(self, "role_template_ids")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRoleTemplateRuleResult']:
        """
        (Computed) Role template policy rules (list)
        """
        return pulumi.get(self, "rules")


class AwaitableGetRoleTemplateResult(GetRoleTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoleTemplateResult(
            administrative=self.administrative,
            annotations=self.annotations,
            builtin=self.builtin,
            context=self.context,
            default_role=self.default_role,
            description=self.description,
            external=self.external,
            external_rules=self.external_rules,
            hidden=self.hidden,
            id=self.id,
            labels=self.labels,
            locked=self.locked,
            name=self.name,
            role_template_ids=self.role_template_ids,
            rules=self.rules)


def get_role_template(context: Optional[str] = None,
                      external_rules: Optional[Sequence[Union['GetRoleTemplateExternalRuleArgs', 'GetRoleTemplateExternalRuleArgsDict']]] = None,
                      name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoleTemplateResult:
    """
    Use this data source to retrieve information about a Rancher v2 role template resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_role_template(name="foo")
    ```


    :param str context: Role template context. `cluster` and `project` values are supported (string)
    :param Sequence[Union['GetRoleTemplateExternalRuleArgs', 'GetRoleTemplateExternalRuleArgsDict']] external_rules: (Computed) External rules used for authorization. (list)
    :param str name: The name of the Role Template (string)
    """
    __args__ = dict()
    __args__['context'] = context
    __args__['externalRules'] = external_rules
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getRoleTemplate:getRoleTemplate', __args__, opts=opts, typ=GetRoleTemplateResult).value

    return AwaitableGetRoleTemplateResult(
        administrative=pulumi.get(__ret__, 'administrative'),
        annotations=pulumi.get(__ret__, 'annotations'),
        builtin=pulumi.get(__ret__, 'builtin'),
        context=pulumi.get(__ret__, 'context'),
        default_role=pulumi.get(__ret__, 'default_role'),
        description=pulumi.get(__ret__, 'description'),
        external=pulumi.get(__ret__, 'external'),
        external_rules=pulumi.get(__ret__, 'external_rules'),
        hidden=pulumi.get(__ret__, 'hidden'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        locked=pulumi.get(__ret__, 'locked'),
        name=pulumi.get(__ret__, 'name'),
        role_template_ids=pulumi.get(__ret__, 'role_template_ids'),
        rules=pulumi.get(__ret__, 'rules'))


@_utilities.lift_output_func(get_role_template)
def get_role_template_output(context: Optional[pulumi.Input[Optional[str]]] = None,
                             external_rules: Optional[pulumi.Input[Optional[Sequence[Union['GetRoleTemplateExternalRuleArgs', 'GetRoleTemplateExternalRuleArgsDict']]]]] = None,
                             name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRoleTemplateResult]:
    """
    Use this data source to retrieve information about a Rancher v2 role template resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_role_template(name="foo")
    ```


    :param str context: Role template context. `cluster` and `project` values are supported (string)
    :param Sequence[Union['GetRoleTemplateExternalRuleArgs', 'GetRoleTemplateExternalRuleArgsDict']] external_rules: (Computed) External rules used for authorization. (list)
    :param str name: The name of the Role Template (string)
    """
    ...
