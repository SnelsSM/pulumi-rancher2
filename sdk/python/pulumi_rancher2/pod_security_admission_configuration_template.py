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

__all__ = ['PodSecurityAdmissionConfigurationTemplateArgs', 'PodSecurityAdmissionConfigurationTemplate']

@pulumi.input_type
class PodSecurityAdmissionConfigurationTemplateArgs:
    def __init__(__self__, *,
                 defaults: pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs'],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exemptions: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PodSecurityAdmissionConfigurationTemplate resource.
        :param pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs'] defaults: defaults allows the user to define admission control mode for Pod Security
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations of the resource
        :param pulumi.Input[str] description: Pod Security Admission Configuration template description
        :param pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs'] exemptions: exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
               prohibited
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels of the resource
        :param pulumi.Input[str] name: Pod Security Admission Configuration template name
        """
        pulumi.set(__self__, "defaults", defaults)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exemptions is not None:
            pulumi.set(__self__, "exemptions", exemptions)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def defaults(self) -> pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs']:
        """
        defaults allows the user to define admission control mode for Pod Security
        """
        return pulumi.get(self, "defaults")

    @defaults.setter
    def defaults(self, value: pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs']):
        pulumi.set(self, "defaults", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Pod Security Admission Configuration template description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def exemptions(self) -> Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']]:
        """
        exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
        prohibited
        """
        return pulumi.get(self, "exemptions")

    @exemptions.setter
    def exemptions(self, value: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']]):
        pulumi.set(self, "exemptions", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Labels of the resource
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Pod Security Admission Configuration template name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PodSecurityAdmissionConfigurationTemplateState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 defaults: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exemptions: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PodSecurityAdmissionConfigurationTemplate resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations of the resource
        :param pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs'] defaults: defaults allows the user to define admission control mode for Pod Security
        :param pulumi.Input[str] description: Pod Security Admission Configuration template description
        :param pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs'] exemptions: exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
               prohibited
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels of the resource
        :param pulumi.Input[str] name: Pod Security Admission Configuration template name
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if defaults is not None:
            pulumi.set(__self__, "defaults", defaults)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exemptions is not None:
            pulumi.set(__self__, "exemptions", exemptions)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def defaults(self) -> Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs']]:
        """
        defaults allows the user to define admission control mode for Pod Security
        """
        return pulumi.get(self, "defaults")

    @defaults.setter
    def defaults(self, value: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateDefaultsArgs']]):
        pulumi.set(self, "defaults", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Pod Security Admission Configuration template description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def exemptions(self) -> Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']]:
        """
        exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
        prohibited
        """
        return pulumi.get(self, "exemptions")

    @exemptions.setter
    def exemptions(self, value: Optional[pulumi.Input['PodSecurityAdmissionConfigurationTemplateExemptionsArgs']]):
        pulumi.set(self, "exemptions", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Labels of the resource
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Pod Security Admission Configuration template name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class PodSecurityAdmissionConfigurationTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 defaults: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateDefaultsArgs', 'PodSecurityAdmissionConfigurationTemplateDefaultsArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exemptions: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateExemptionsArgs', 'PodSecurityAdmissionConfigurationTemplateExemptionsArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a PodSecurityAdmissionConfigurationTemplate resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations of the resource
        :param pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateDefaultsArgs', 'PodSecurityAdmissionConfigurationTemplateDefaultsArgsDict']] defaults: defaults allows the user to define admission control mode for Pod Security
        :param pulumi.Input[str] description: Pod Security Admission Configuration template description
        :param pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateExemptionsArgs', 'PodSecurityAdmissionConfigurationTemplateExemptionsArgsDict']] exemptions: exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
               prohibited
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels of the resource
        :param pulumi.Input[str] name: Pod Security Admission Configuration template name
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PodSecurityAdmissionConfigurationTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a PodSecurityAdmissionConfigurationTemplate resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param PodSecurityAdmissionConfigurationTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PodSecurityAdmissionConfigurationTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 defaults: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateDefaultsArgs', 'PodSecurityAdmissionConfigurationTemplateDefaultsArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exemptions: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateExemptionsArgs', 'PodSecurityAdmissionConfigurationTemplateExemptionsArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PodSecurityAdmissionConfigurationTemplateArgs.__new__(PodSecurityAdmissionConfigurationTemplateArgs)

            __props__.__dict__["annotations"] = annotations
            if defaults is None and not opts.urn:
                raise TypeError("Missing required property 'defaults'")
            __props__.__dict__["defaults"] = defaults
            __props__.__dict__["description"] = description
            __props__.__dict__["exemptions"] = exemptions
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
        super(PodSecurityAdmissionConfigurationTemplate, __self__).__init__(
            'rancher2:index/podSecurityAdmissionConfigurationTemplate:PodSecurityAdmissionConfigurationTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            defaults: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateDefaultsArgs', 'PodSecurityAdmissionConfigurationTemplateDefaultsArgsDict']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            exemptions: Optional[pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateExemptionsArgs', 'PodSecurityAdmissionConfigurationTemplateExemptionsArgsDict']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'PodSecurityAdmissionConfigurationTemplate':
        """
        Get an existing PodSecurityAdmissionConfigurationTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] annotations: Annotations of the resource
        :param pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateDefaultsArgs', 'PodSecurityAdmissionConfigurationTemplateDefaultsArgsDict']] defaults: defaults allows the user to define admission control mode for Pod Security
        :param pulumi.Input[str] description: Pod Security Admission Configuration template description
        :param pulumi.Input[Union['PodSecurityAdmissionConfigurationTemplateExemptionsArgs', 'PodSecurityAdmissionConfigurationTemplateExemptionsArgsDict']] exemptions: exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
               prohibited
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Labels of the resource
        :param pulumi.Input[str] name: Pod Security Admission Configuration template name
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PodSecurityAdmissionConfigurationTemplateState.__new__(_PodSecurityAdmissionConfigurationTemplateState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["defaults"] = defaults
        __props__.__dict__["description"] = description
        __props__.__dict__["exemptions"] = exemptions
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        return PodSecurityAdmissionConfigurationTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def defaults(self) -> pulumi.Output['outputs.PodSecurityAdmissionConfigurationTemplateDefaults']:
        """
        defaults allows the user to define admission control mode for Pod Security
        """
        return pulumi.get(self, "defaults")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Pod Security Admission Configuration template description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def exemptions(self) -> pulumi.Output[Optional['outputs.PodSecurityAdmissionConfigurationTemplateExemptions']]:
        """
        exemptions allows the creation of pods for specific Usernames, RuntimeClassNames, and Namespaces that would otherwise be
        prohibited
        """
        return pulumi.get(self, "exemptions")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Labels of the resource
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Pod Security Admission Configuration template name
        """
        return pulumi.get(self, "name")

