# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['CloudCredential']


class CloudCredential(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amazonec2_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialAmazonec2CredentialConfigArgs']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 azure_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialAzureCredentialConfigArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 digitalocean_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialDigitaloceanCredentialConfigArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialLinodeCredentialConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 openstack_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialOpenstackCredentialConfigArgs']]] = None,
                 vsphere_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialVsphereCredentialConfigArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Cloud Credential resource. This can be used to create Cloud Credential for Rancher v2.2.x and retrieve their information.

        amazonec2, azure, digitalocean, linode, openstack and vsphere credentials config are supported for Cloud Credential.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Cloud Credential
        foo = rancher2.CloudCredential("foo",
            amazonec2_credential_config=rancher2.CloudCredentialAmazonec2CredentialConfigArgs(
                access_key="<AWS_ACCESS_KEY>",
                secret_key="<AWS_SECRET_KEY>",
            ),
            description="foo test")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['CloudCredentialAmazonec2CredentialConfigArgs']] amazonec2_credential_config: AWS config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Cloud Credential object (map)
        :param pulumi.Input[pulumi.InputType['CloudCredentialAzureCredentialConfigArgs']] azure_credential_config: Azure config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[str] description: Description for the Cloud Credential (string)
        :param pulumi.Input[pulumi.InputType['CloudCredentialDigitaloceanCredentialConfigArgs']] digitalocean_credential_config: DigitalOcean config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Cloud Credential object (map)
        :param pulumi.Input[pulumi.InputType['CloudCredentialLinodeCredentialConfigArgs']] linode_credential_config: Linode config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[str] name: The name of the Cloud Credential (string)
        :param pulumi.Input[pulumi.InputType['CloudCredentialOpenstackCredentialConfigArgs']] openstack_credential_config: OpenStack config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['CloudCredentialVsphereCredentialConfigArgs']] vsphere_credential_config: vSphere config for the Cloud Credential (list maxitems:1)
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

            __props__['amazonec2_credential_config'] = amazonec2_credential_config
            __props__['annotations'] = annotations
            __props__['azure_credential_config'] = azure_credential_config
            __props__['description'] = description
            __props__['digitalocean_credential_config'] = digitalocean_credential_config
            __props__['labels'] = labels
            __props__['linode_credential_config'] = linode_credential_config
            __props__['name'] = name
            __props__['openstack_credential_config'] = openstack_credential_config
            __props__['vsphere_credential_config'] = vsphere_credential_config
            __props__['driver'] = None
        super(CloudCredential, __self__).__init__(
            'rancher2:index/cloudCredential:CloudCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            amazonec2_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialAmazonec2CredentialConfigArgs']]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            azure_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialAzureCredentialConfigArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            digitalocean_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialDigitaloceanCredentialConfigArgs']]] = None,
            driver: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            linode_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialLinodeCredentialConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            openstack_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialOpenstackCredentialConfigArgs']]] = None,
            vsphere_credential_config: Optional[pulumi.Input[pulumi.InputType['CloudCredentialVsphereCredentialConfigArgs']]] = None) -> 'CloudCredential':
        """
        Get an existing CloudCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['CloudCredentialAmazonec2CredentialConfigArgs']] amazonec2_credential_config: AWS config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Cloud Credential object (map)
        :param pulumi.Input[pulumi.InputType['CloudCredentialAzureCredentialConfigArgs']] azure_credential_config: Azure config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[str] description: Description for the Cloud Credential (string)
        :param pulumi.Input[pulumi.InputType['CloudCredentialDigitaloceanCredentialConfigArgs']] digitalocean_credential_config: DigitalOcean config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[str] driver: (Computed) The driver of the Cloud Credential (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Cloud Credential object (map)
        :param pulumi.Input[pulumi.InputType['CloudCredentialLinodeCredentialConfigArgs']] linode_credential_config: Linode config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[str] name: The name of the Cloud Credential (string)
        :param pulumi.Input[pulumi.InputType['CloudCredentialOpenstackCredentialConfigArgs']] openstack_credential_config: OpenStack config for the Cloud Credential (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['CloudCredentialVsphereCredentialConfigArgs']] vsphere_credential_config: vSphere config for the Cloud Credential (list maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["amazonec2_credential_config"] = amazonec2_credential_config
        __props__["annotations"] = annotations
        __props__["azure_credential_config"] = azure_credential_config
        __props__["description"] = description
        __props__["digitalocean_credential_config"] = digitalocean_credential_config
        __props__["driver"] = driver
        __props__["labels"] = labels
        __props__["linode_credential_config"] = linode_credential_config
        __props__["name"] = name
        __props__["openstack_credential_config"] = openstack_credential_config
        __props__["vsphere_credential_config"] = vsphere_credential_config
        return CloudCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="amazonec2CredentialConfig")
    def amazonec2_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialAmazonec2CredentialConfig']]:
        """
        AWS config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "amazonec2_credential_config")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Cloud Credential object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="azureCredentialConfig")
    def azure_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialAzureCredentialConfig']]:
        """
        Azure config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "azure_credential_config")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description for the Cloud Credential (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="digitaloceanCredentialConfig")
    def digitalocean_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialDigitaloceanCredentialConfig']]:
        """
        DigitalOcean config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "digitalocean_credential_config")

    @property
    @pulumi.getter
    def driver(self) -> pulumi.Output[str]:
        """
        (Computed) The driver of the Cloud Credential (string)
        """
        return pulumi.get(self, "driver")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Cloud Credential object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="linodeCredentialConfig")
    def linode_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialLinodeCredentialConfig']]:
        """
        Linode config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "linode_credential_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Cloud Credential (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="openstackCredentialConfig")
    def openstack_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialOpenstackCredentialConfig']]:
        """
        OpenStack config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "openstack_credential_config")

    @property
    @pulumi.getter(name="vsphereCredentialConfig")
    def vsphere_credential_config(self) -> pulumi.Output[Optional['outputs.CloudCredentialVsphereCredentialConfig']]:
        """
        vSphere config for the Cloud Credential (list maxitems:1)
        """
        return pulumi.get(self, "vsphere_credential_config")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

