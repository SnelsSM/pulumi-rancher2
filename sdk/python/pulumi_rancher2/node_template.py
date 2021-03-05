# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['NodeTemplate']


class NodeTemplate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amazonec2_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateAmazonec2ConfigArgs']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 auth_certificate_authority: Optional[pulumi.Input[str]] = None,
                 auth_key: Optional[pulumi.Input[str]] = None,
                 azure_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateAzureConfigArgs']]] = None,
                 cloud_credential_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 digitalocean_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateDigitaloceanConfigArgs']]] = None,
                 driver_id: Optional[pulumi.Input[str]] = None,
                 engine_env: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 engine_insecure_registries: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 engine_install_url: Optional[pulumi.Input[str]] = None,
                 engine_label: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 engine_opt: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 engine_registry_mirrors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 engine_storage_driver: Optional[pulumi.Input[str]] = None,
                 hetzner_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateHetznerConfigArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateLinodeConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeTemplateNodeTaintArgs']]]]] = None,
                 opennebula_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateOpennebulaConfigArgs']]] = None,
                 openstack_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateOpenstackConfigArgs']]] = None,
                 use_internal_ip_address: Optional[pulumi.Input[bool]] = None,
                 vsphere_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateVsphereConfigArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.

        amazonec2, azure, digitalocean, linode, opennebula, openstack, hetzner, and vsphere drivers are supported for node templates.

        **Note** If you are upgrading to Rancher v2.3.3, please take a look to final section

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Node Template up to Rancher 2.1.x
        foo = rancher2.NodeTemplate("foo",
            amazonec2_config=rancher2.NodeTemplateAmazonec2ConfigArgs(
                access_key="AWS_ACCESS_KEY",
                ami="<AMI_ID>",
                region="<REGION>",
                secret_key="<AWS_SECRET_KEY>",
                security_groups=["<AWS_SECURITY_GROUP>"],
                subnet_id="<SUBNET_ID>",
                vpc_id="<VPC_ID>",
                zone="<ZONE>",
            ),
            description="foo test")
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Node Template from Rancher 2.2.x
        foo_cloud_credential = rancher2.CloudCredential("fooCloudCredential",
            description="foo test",
            amazonec2_credential_config=rancher2.CloudCredentialAmazonec2CredentialConfigArgs(
                access_key="<AWS_ACCESS_KEY>",
                secret_key="<AWS_SECRET_KEY>",
            ))
        foo_node_template = rancher2.NodeTemplate("fooNodeTemplate",
            description="foo test",
            cloud_credential_id=foo_cloud_credential.id,
            amazonec2_config=rancher2.NodeTemplateAmazonec2ConfigArgs(
                ami="<AMI_ID>",
                region="<REGION>",
                security_groups=["<AWS_SECURITY_GROUP>"],
                subnet_id="<SUBNET_ID>",
                vpc_id="<VPC_ID>",
                zone="<ZONE>",
            ))
        ```
        ### Using the Hetzner Node Driver

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Node Template using hetzner node_driver
        hetzner_node_driver = rancher2.NodeDriver("hetznerNodeDriver",
            active=True,
            builtin=False,
            ui_url="https://storage.googleapis.com/hcloud-rancher-v2-ui-driver/component.js",
            url="https://github.com/JonasProgrammer/docker-machine-driver-hetzner/releases/download/3.0.0/docker-machine-driver-hetzner_3.0.0_linux_amd64.tar.gz",
            whitelist_domains=["storage.googleapis.com"])
        my_hetzner_node_template = rancher2.NodeTemplate("myHetznerNodeTemplate",
            driver_id=hetzner_node_driver.id,
            hetzner_config=rancher2.NodeTemplateHetznerConfigArgs(
                api_token="XXXXXXXXXX",
                image="ubuntu-18.04",
                server_location="nbg1",
                server_type="cx11",
            ))
        ```

        ## Import

        Node Template can be imported using the Rancher Node Template ID

        ```sh
         $ pulumi import rancher2:index/nodeTemplate:NodeTemplate foo &lt;node_template_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['NodeTemplateAmazonec2ConfigArgs']] amazonec2_config: AWS config for the Node Template (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Node Template object (map)
        :param pulumi.Input[str] auth_certificate_authority: Auth certificate authority for the Node Template (string)
        :param pulumi.Input[str] auth_key: Auth key for the Node Template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateAzureConfigArgs']] azure_config: Azure config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] cloud_credential_id: Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        :param pulumi.Input[str] description: Description for the Node Template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateDigitaloceanConfigArgs']] digitalocean_config: Digitalocean config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] driver_id: The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        :param pulumi.Input[Mapping[str, Any]] engine_env: Engine environment for the node template (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] engine_insecure_registries: Insecure registry for the node template (list)
        :param pulumi.Input[str] engine_install_url: Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        :param pulumi.Input[Mapping[str, Any]] engine_label: Engine label for the node template (string)
        :param pulumi.Input[Mapping[str, Any]] engine_opt: Engine options for the node template (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] engine_registry_mirrors: Engine registry mirror for the node template (list)
        :param pulumi.Input[str] engine_storage_driver: Engine storage driver for the node template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateHetznerConfigArgs']] hetzner_config: Hetzner config for the Node Template (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Node Template object (map)
        :param pulumi.Input[pulumi.InputType['NodeTemplateLinodeConfigArgs']] linode_config: Linode config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] name: The name of the Node Template (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeTemplateNodeTaintArgs']]]] node_taints: Node taints. For Rancher v2.3.3 or above (List)
        :param pulumi.Input[pulumi.InputType['NodeTemplateOpennebulaConfigArgs']] opennebula_config: Opennebula config for the Node Template (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['NodeTemplateOpenstackConfigArgs']] openstack_config: Openstack config for the Node Template (list maxitems:1)
        :param pulumi.Input[bool] use_internal_ip_address: Engine storage driver for the node template (bool)
        :param pulumi.Input[pulumi.InputType['NodeTemplateVsphereConfigArgs']] vsphere_config: vSphere config for the Node Template (list maxitems:1)
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

            __props__['amazonec2_config'] = amazonec2_config
            __props__['annotations'] = annotations
            __props__['auth_certificate_authority'] = auth_certificate_authority
            __props__['auth_key'] = auth_key
            __props__['azure_config'] = azure_config
            __props__['cloud_credential_id'] = cloud_credential_id
            __props__['description'] = description
            __props__['digitalocean_config'] = digitalocean_config
            __props__['driver_id'] = driver_id
            __props__['engine_env'] = engine_env
            __props__['engine_insecure_registries'] = engine_insecure_registries
            __props__['engine_install_url'] = engine_install_url
            __props__['engine_label'] = engine_label
            __props__['engine_opt'] = engine_opt
            __props__['engine_registry_mirrors'] = engine_registry_mirrors
            __props__['engine_storage_driver'] = engine_storage_driver
            __props__['hetzner_config'] = hetzner_config
            __props__['labels'] = labels
            __props__['linode_config'] = linode_config
            __props__['name'] = name
            __props__['node_taints'] = node_taints
            __props__['opennebula_config'] = opennebula_config
            __props__['openstack_config'] = openstack_config
            __props__['use_internal_ip_address'] = use_internal_ip_address
            __props__['vsphere_config'] = vsphere_config
            __props__['driver'] = None
        super(NodeTemplate, __self__).__init__(
            'rancher2:index/nodeTemplate:NodeTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            amazonec2_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateAmazonec2ConfigArgs']]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            auth_certificate_authority: Optional[pulumi.Input[str]] = None,
            auth_key: Optional[pulumi.Input[str]] = None,
            azure_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateAzureConfigArgs']]] = None,
            cloud_credential_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            digitalocean_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateDigitaloceanConfigArgs']]] = None,
            driver: Optional[pulumi.Input[str]] = None,
            driver_id: Optional[pulumi.Input[str]] = None,
            engine_env: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            engine_insecure_registries: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            engine_install_url: Optional[pulumi.Input[str]] = None,
            engine_label: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            engine_opt: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            engine_registry_mirrors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            engine_storage_driver: Optional[pulumi.Input[str]] = None,
            hetzner_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateHetznerConfigArgs']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            linode_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateLinodeConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeTemplateNodeTaintArgs']]]]] = None,
            opennebula_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateOpennebulaConfigArgs']]] = None,
            openstack_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateOpenstackConfigArgs']]] = None,
            use_internal_ip_address: Optional[pulumi.Input[bool]] = None,
            vsphere_config: Optional[pulumi.Input[pulumi.InputType['NodeTemplateVsphereConfigArgs']]] = None) -> 'NodeTemplate':
        """
        Get an existing NodeTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['NodeTemplateAmazonec2ConfigArgs']] amazonec2_config: AWS config for the Node Template (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Node Template object (map)
        :param pulumi.Input[str] auth_certificate_authority: Auth certificate authority for the Node Template (string)
        :param pulumi.Input[str] auth_key: Auth key for the Node Template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateAzureConfigArgs']] azure_config: Azure config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] cloud_credential_id: Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        :param pulumi.Input[str] description: Description for the Node Template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateDigitaloceanConfigArgs']] digitalocean_config: Digitalocean config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] driver: (Computed) The driver of the node template (string)
        :param pulumi.Input[str] driver_id: The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        :param pulumi.Input[Mapping[str, Any]] engine_env: Engine environment for the node template (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] engine_insecure_registries: Insecure registry for the node template (list)
        :param pulumi.Input[str] engine_install_url: Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        :param pulumi.Input[Mapping[str, Any]] engine_label: Engine label for the node template (string)
        :param pulumi.Input[Mapping[str, Any]] engine_opt: Engine options for the node template (map)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] engine_registry_mirrors: Engine registry mirror for the node template (list)
        :param pulumi.Input[str] engine_storage_driver: Engine storage driver for the node template (string)
        :param pulumi.Input[pulumi.InputType['NodeTemplateHetznerConfigArgs']] hetzner_config: Hetzner config for the Node Template (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Node Template object (map)
        :param pulumi.Input[pulumi.InputType['NodeTemplateLinodeConfigArgs']] linode_config: Linode config for the Node Template (list maxitems:1)
        :param pulumi.Input[str] name: The name of the Node Template (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodeTemplateNodeTaintArgs']]]] node_taints: Node taints. For Rancher v2.3.3 or above (List)
        :param pulumi.Input[pulumi.InputType['NodeTemplateOpennebulaConfigArgs']] opennebula_config: Opennebula config for the Node Template (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['NodeTemplateOpenstackConfigArgs']] openstack_config: Openstack config for the Node Template (list maxitems:1)
        :param pulumi.Input[bool] use_internal_ip_address: Engine storage driver for the node template (bool)
        :param pulumi.Input[pulumi.InputType['NodeTemplateVsphereConfigArgs']] vsphere_config: vSphere config for the Node Template (list maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["amazonec2_config"] = amazonec2_config
        __props__["annotations"] = annotations
        __props__["auth_certificate_authority"] = auth_certificate_authority
        __props__["auth_key"] = auth_key
        __props__["azure_config"] = azure_config
        __props__["cloud_credential_id"] = cloud_credential_id
        __props__["description"] = description
        __props__["digitalocean_config"] = digitalocean_config
        __props__["driver"] = driver
        __props__["driver_id"] = driver_id
        __props__["engine_env"] = engine_env
        __props__["engine_insecure_registries"] = engine_insecure_registries
        __props__["engine_install_url"] = engine_install_url
        __props__["engine_label"] = engine_label
        __props__["engine_opt"] = engine_opt
        __props__["engine_registry_mirrors"] = engine_registry_mirrors
        __props__["engine_storage_driver"] = engine_storage_driver
        __props__["hetzner_config"] = hetzner_config
        __props__["labels"] = labels
        __props__["linode_config"] = linode_config
        __props__["name"] = name
        __props__["node_taints"] = node_taints
        __props__["opennebula_config"] = opennebula_config
        __props__["openstack_config"] = openstack_config
        __props__["use_internal_ip_address"] = use_internal_ip_address
        __props__["vsphere_config"] = vsphere_config
        return NodeTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="amazonec2Config")
    def amazonec2_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateAmazonec2Config']]:
        """
        AWS config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "amazonec2_config")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Node Template object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="authCertificateAuthority")
    def auth_certificate_authority(self) -> pulumi.Output[Optional[str]]:
        """
        Auth certificate authority for the Node Template (string)
        """
        return pulumi.get(self, "auth_certificate_authority")

    @property
    @pulumi.getter(name="authKey")
    def auth_key(self) -> pulumi.Output[Optional[str]]:
        """
        Auth key for the Node Template (string)
        """
        return pulumi.get(self, "auth_key")

    @property
    @pulumi.getter(name="azureConfig")
    def azure_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateAzureConfig']]:
        """
        Azure config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "azure_config")

    @property
    @pulumi.getter(name="cloudCredentialId")
    def cloud_credential_id(self) -> pulumi.Output[Optional[str]]:
        """
        Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        """
        return pulumi.get(self, "cloud_credential_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description for the Node Template (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="digitaloceanConfig")
    def digitalocean_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateDigitaloceanConfig']]:
        """
        Digitalocean config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "digitalocean_config")

    @property
    @pulumi.getter
    def driver(self) -> pulumi.Output[str]:
        """
        (Computed) The driver of the node template (string)
        """
        return pulumi.get(self, "driver")

    @property
    @pulumi.getter(name="driverId")
    def driver_id(self) -> pulumi.Output[str]:
        """
        The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        """
        return pulumi.get(self, "driver_id")

    @property
    @pulumi.getter(name="engineEnv")
    def engine_env(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Engine environment for the node template (string)
        """
        return pulumi.get(self, "engine_env")

    @property
    @pulumi.getter(name="engineInsecureRegistries")
    def engine_insecure_registries(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Insecure registry for the node template (list)
        """
        return pulumi.get(self, "engine_insecure_registries")

    @property
    @pulumi.getter(name="engineInstallUrl")
    def engine_install_url(self) -> pulumi.Output[Optional[str]]:
        """
        Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        """
        return pulumi.get(self, "engine_install_url")

    @property
    @pulumi.getter(name="engineLabel")
    def engine_label(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Engine label for the node template (string)
        """
        return pulumi.get(self, "engine_label")

    @property
    @pulumi.getter(name="engineOpt")
    def engine_opt(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Engine options for the node template (map)
        """
        return pulumi.get(self, "engine_opt")

    @property
    @pulumi.getter(name="engineRegistryMirrors")
    def engine_registry_mirrors(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Engine registry mirror for the node template (list)
        """
        return pulumi.get(self, "engine_registry_mirrors")

    @property
    @pulumi.getter(name="engineStorageDriver")
    def engine_storage_driver(self) -> pulumi.Output[Optional[str]]:
        """
        Engine storage driver for the node template (string)
        """
        return pulumi.get(self, "engine_storage_driver")

    @property
    @pulumi.getter(name="hetznerConfig")
    def hetzner_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateHetznerConfig']]:
        """
        Hetzner config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "hetzner_config")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Node Template object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="linodeConfig")
    def linode_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateLinodeConfig']]:
        """
        Linode config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "linode_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Node Template (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeTaints")
    def node_taints(self) -> pulumi.Output[Optional[Sequence['outputs.NodeTemplateNodeTaint']]]:
        """
        Node taints. For Rancher v2.3.3 or above (List)
        """
        return pulumi.get(self, "node_taints")

    @property
    @pulumi.getter(name="opennebulaConfig")
    def opennebula_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateOpennebulaConfig']]:
        """
        Opennebula config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "opennebula_config")

    @property
    @pulumi.getter(name="openstackConfig")
    def openstack_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateOpenstackConfig']]:
        """
        Openstack config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "openstack_config")

    @property
    @pulumi.getter(name="useInternalIpAddress")
    def use_internal_ip_address(self) -> pulumi.Output[Optional[bool]]:
        """
        Engine storage driver for the node template (bool)
        """
        return pulumi.get(self, "use_internal_ip_address")

    @property
    @pulumi.getter(name="vsphereConfig")
    def vsphere_config(self) -> pulumi.Output[Optional['outputs.NodeTemplateVsphereConfig']]:
        """
        vSphere config for the Node Template (list maxitems:1)
        """
        return pulumi.get(self, "vsphere_config")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

