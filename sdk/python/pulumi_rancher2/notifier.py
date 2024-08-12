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

__all__ = ['NotifierArgs', 'Notifier']

@pulumi.input_type
class NotifierArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dingtalk_config: Optional[pulumi.Input['NotifierDingtalkConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 msteams_config: Optional[pulumi.Input['NotifierMsteamsConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_config: Optional[pulumi.Input['NotifierPagerdutyConfigArgs']] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slack_config: Optional[pulumi.Input['NotifierSlackConfigArgs']] = None,
                 smtp_config: Optional[pulumi.Input['NotifierSmtpConfigArgs']] = None,
                 webhook_config: Optional[pulumi.Input['NotifierWebhookConfigArgs']] = None,
                 wechat_config: Optional[pulumi.Input['NotifierWechatConfigArgs']] = None):
        """
        The set of arguments for constructing a Notifier resource.
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] description: The notifier description (string)
        :param pulumi.Input['NotifierDingtalkConfigArgs'] dingtalk_config: Dingtalk config for notifier (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for notifier object (map)
        :param pulumi.Input['NotifierMsteamsConfigArgs'] msteams_config: MSTeams config for notifier (list maxitems:1)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input['NotifierPagerdutyConfigArgs'] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[bool] send_resolved: = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input['NotifierSlackConfigArgs'] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierSmtpConfigArgs'] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierWebhookConfigArgs'] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierWechatConfigArgs'] wechat_config: Wechat config for notifier (list maxitems:1)
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dingtalk_config is not None:
            pulumi.set(__self__, "dingtalk_config", dingtalk_config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if msteams_config is not None:
            pulumi.set(__self__, "msteams_config", msteams_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pagerduty_config is not None:
            pulumi.set(__self__, "pagerduty_config", pagerduty_config)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slack_config is not None:
            pulumi.set(__self__, "slack_config", slack_config)
        if smtp_config is not None:
            pulumi.set(__self__, "smtp_config", smtp_config)
        if webhook_config is not None:
            pulumi.set(__self__, "webhook_config", webhook_config)
        if wechat_config is not None:
            pulumi.set(__self__, "wechat_config", wechat_config)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The cluster id where create notifier (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for notifier object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The notifier description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dingtalkConfig")
    def dingtalk_config(self) -> Optional[pulumi.Input['NotifierDingtalkConfigArgs']]:
        """
        Dingtalk config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "dingtalk_config")

    @dingtalk_config.setter
    def dingtalk_config(self, value: Optional[pulumi.Input['NotifierDingtalkConfigArgs']]):
        pulumi.set(self, "dingtalk_config", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for notifier object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="msteamsConfig")
    def msteams_config(self) -> Optional[pulumi.Input['NotifierMsteamsConfigArgs']]:
        """
        MSTeams config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "msteams_config")

    @msteams_config.setter
    def msteams_config(self, value: Optional[pulumi.Input['NotifierMsteamsConfigArgs']]):
        pulumi.set(self, "msteams_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notifier (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pagerdutyConfig")
    def pagerduty_config(self) -> Optional[pulumi.Input['NotifierPagerdutyConfigArgs']]:
        """
        Pagerduty config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "pagerduty_config")

    @pagerduty_config.setter
    def pagerduty_config(self, value: Optional[pulumi.Input['NotifierPagerdutyConfigArgs']]):
        pulumi.set(self, "pagerduty_config", value)

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> Optional[pulumi.Input[bool]]:
        """
        = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        """
        return pulumi.get(self, "send_resolved")

    @send_resolved.setter
    def send_resolved(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_resolved", value)

    @property
    @pulumi.getter(name="slackConfig")
    def slack_config(self) -> Optional[pulumi.Input['NotifierSlackConfigArgs']]:
        """
        Slack config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "slack_config")

    @slack_config.setter
    def slack_config(self, value: Optional[pulumi.Input['NotifierSlackConfigArgs']]):
        pulumi.set(self, "slack_config", value)

    @property
    @pulumi.getter(name="smtpConfig")
    def smtp_config(self) -> Optional[pulumi.Input['NotifierSmtpConfigArgs']]:
        """
        SMTP config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "smtp_config")

    @smtp_config.setter
    def smtp_config(self, value: Optional[pulumi.Input['NotifierSmtpConfigArgs']]):
        pulumi.set(self, "smtp_config", value)

    @property
    @pulumi.getter(name="webhookConfig")
    def webhook_config(self) -> Optional[pulumi.Input['NotifierWebhookConfigArgs']]:
        """
        Webhook config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "webhook_config")

    @webhook_config.setter
    def webhook_config(self, value: Optional[pulumi.Input['NotifierWebhookConfigArgs']]):
        pulumi.set(self, "webhook_config", value)

    @property
    @pulumi.getter(name="wechatConfig")
    def wechat_config(self) -> Optional[pulumi.Input['NotifierWechatConfigArgs']]:
        """
        Wechat config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "wechat_config")

    @wechat_config.setter
    def wechat_config(self, value: Optional[pulumi.Input['NotifierWechatConfigArgs']]):
        pulumi.set(self, "wechat_config", value)


@pulumi.input_type
class _NotifierState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dingtalk_config: Optional[pulumi.Input['NotifierDingtalkConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 msteams_config: Optional[pulumi.Input['NotifierMsteamsConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_config: Optional[pulumi.Input['NotifierPagerdutyConfigArgs']] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slack_config: Optional[pulumi.Input['NotifierSlackConfigArgs']] = None,
                 smtp_config: Optional[pulumi.Input['NotifierSmtpConfigArgs']] = None,
                 webhook_config: Optional[pulumi.Input['NotifierWebhookConfigArgs']] = None,
                 wechat_config: Optional[pulumi.Input['NotifierWechatConfigArgs']] = None):
        """
        Input properties used for looking up and filtering Notifier resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[str] description: The notifier description (string)
        :param pulumi.Input['NotifierDingtalkConfigArgs'] dingtalk_config: Dingtalk config for notifier (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for notifier object (map)
        :param pulumi.Input['NotifierMsteamsConfigArgs'] msteams_config: MSTeams config for notifier (list maxitems:1)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input['NotifierPagerdutyConfigArgs'] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[bool] send_resolved: = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input['NotifierSlackConfigArgs'] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierSmtpConfigArgs'] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierWebhookConfigArgs'] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input['NotifierWechatConfigArgs'] wechat_config: Wechat config for notifier (list maxitems:1)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dingtalk_config is not None:
            pulumi.set(__self__, "dingtalk_config", dingtalk_config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if msteams_config is not None:
            pulumi.set(__self__, "msteams_config", msteams_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pagerduty_config is not None:
            pulumi.set(__self__, "pagerduty_config", pagerduty_config)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slack_config is not None:
            pulumi.set(__self__, "slack_config", slack_config)
        if smtp_config is not None:
            pulumi.set(__self__, "smtp_config", smtp_config)
        if webhook_config is not None:
            pulumi.set(__self__, "webhook_config", webhook_config)
        if wechat_config is not None:
            pulumi.set(__self__, "wechat_config", wechat_config)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for notifier object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id where create notifier (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The notifier description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dingtalkConfig")
    def dingtalk_config(self) -> Optional[pulumi.Input['NotifierDingtalkConfigArgs']]:
        """
        Dingtalk config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "dingtalk_config")

    @dingtalk_config.setter
    def dingtalk_config(self, value: Optional[pulumi.Input['NotifierDingtalkConfigArgs']]):
        pulumi.set(self, "dingtalk_config", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for notifier object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="msteamsConfig")
    def msteams_config(self) -> Optional[pulumi.Input['NotifierMsteamsConfigArgs']]:
        """
        MSTeams config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "msteams_config")

    @msteams_config.setter
    def msteams_config(self, value: Optional[pulumi.Input['NotifierMsteamsConfigArgs']]):
        pulumi.set(self, "msteams_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notifier (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pagerdutyConfig")
    def pagerduty_config(self) -> Optional[pulumi.Input['NotifierPagerdutyConfigArgs']]:
        """
        Pagerduty config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "pagerduty_config")

    @pagerduty_config.setter
    def pagerduty_config(self, value: Optional[pulumi.Input['NotifierPagerdutyConfigArgs']]):
        pulumi.set(self, "pagerduty_config", value)

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> Optional[pulumi.Input[bool]]:
        """
        = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        """
        return pulumi.get(self, "send_resolved")

    @send_resolved.setter
    def send_resolved(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_resolved", value)

    @property
    @pulumi.getter(name="slackConfig")
    def slack_config(self) -> Optional[pulumi.Input['NotifierSlackConfigArgs']]:
        """
        Slack config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "slack_config")

    @slack_config.setter
    def slack_config(self, value: Optional[pulumi.Input['NotifierSlackConfigArgs']]):
        pulumi.set(self, "slack_config", value)

    @property
    @pulumi.getter(name="smtpConfig")
    def smtp_config(self) -> Optional[pulumi.Input['NotifierSmtpConfigArgs']]:
        """
        SMTP config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "smtp_config")

    @smtp_config.setter
    def smtp_config(self, value: Optional[pulumi.Input['NotifierSmtpConfigArgs']]):
        pulumi.set(self, "smtp_config", value)

    @property
    @pulumi.getter(name="webhookConfig")
    def webhook_config(self) -> Optional[pulumi.Input['NotifierWebhookConfigArgs']]:
        """
        Webhook config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "webhook_config")

    @webhook_config.setter
    def webhook_config(self, value: Optional[pulumi.Input['NotifierWebhookConfigArgs']]):
        pulumi.set(self, "webhook_config", value)

    @property
    @pulumi.getter(name="wechatConfig")
    def wechat_config(self) -> Optional[pulumi.Input['NotifierWechatConfigArgs']]:
        """
        Wechat config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "wechat_config")

    @wechat_config.setter
    def wechat_config(self, value: Optional[pulumi.Input['NotifierWechatConfigArgs']]):
        pulumi.set(self, "wechat_config", value)


class Notifier(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dingtalk_config: Optional[pulumi.Input[Union['NotifierDingtalkConfigArgs', 'NotifierDingtalkConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 msteams_config: Optional[pulumi.Input[Union['NotifierMsteamsConfigArgs', 'NotifierMsteamsConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_config: Optional[pulumi.Input[Union['NotifierPagerdutyConfigArgs', 'NotifierPagerdutyConfigArgsDict']]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slack_config: Optional[pulumi.Input[Union['NotifierSlackConfigArgs', 'NotifierSlackConfigArgsDict']]] = None,
                 smtp_config: Optional[pulumi.Input[Union['NotifierSmtpConfigArgs', 'NotifierSmtpConfigArgsDict']]] = None,
                 webhook_config: Optional[pulumi.Input[Union['NotifierWebhookConfigArgs', 'NotifierWebhookConfigArgsDict']]] = None,
                 wechat_config: Optional[pulumi.Input[Union['NotifierWechatConfigArgs', 'NotifierWechatConfigArgsDict']]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Notifier
        foo = rancher2.Notifier("foo",
            name="foo",
            cluster_id="<cluster_id>",
            description="Terraform notifier acceptance test",
            send_resolved=True,
            pagerduty_config={
                "service_key": "XXXXXXXX",
                "proxy_url": "http://proxy.test.io",
            })
        ```

        ## Import

        Notifiers can be imported using the Rancher nNtifier ID

        ```sh
        $ pulumi import rancher2:index/notifier:Notifier foo &lt;notifier_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[str] description: The notifier description (string)
        :param pulumi.Input[Union['NotifierDingtalkConfigArgs', 'NotifierDingtalkConfigArgsDict']] dingtalk_config: Dingtalk config for notifier (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for notifier object (map)
        :param pulumi.Input[Union['NotifierMsteamsConfigArgs', 'NotifierMsteamsConfigArgsDict']] msteams_config: MSTeams config for notifier (list maxitems:1)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input[Union['NotifierPagerdutyConfigArgs', 'NotifierPagerdutyConfigArgsDict']] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[bool] send_resolved: = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input[Union['NotifierSlackConfigArgs', 'NotifierSlackConfigArgsDict']] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierSmtpConfigArgs', 'NotifierSmtpConfigArgsDict']] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierWebhookConfigArgs', 'NotifierWebhookConfigArgsDict']] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierWechatConfigArgs', 'NotifierWechatConfigArgsDict']] wechat_config: Wechat config for notifier (list maxitems:1)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotifierArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Notifier
        foo = rancher2.Notifier("foo",
            name="foo",
            cluster_id="<cluster_id>",
            description="Terraform notifier acceptance test",
            send_resolved=True,
            pagerduty_config={
                "service_key": "XXXXXXXX",
                "proxy_url": "http://proxy.test.io",
            })
        ```

        ## Import

        Notifiers can be imported using the Rancher nNtifier ID

        ```sh
        $ pulumi import rancher2:index/notifier:Notifier foo &lt;notifier_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param NotifierArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotifierArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dingtalk_config: Optional[pulumi.Input[Union['NotifierDingtalkConfigArgs', 'NotifierDingtalkConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 msteams_config: Optional[pulumi.Input[Union['NotifierMsteamsConfigArgs', 'NotifierMsteamsConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_config: Optional[pulumi.Input[Union['NotifierPagerdutyConfigArgs', 'NotifierPagerdutyConfigArgsDict']]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slack_config: Optional[pulumi.Input[Union['NotifierSlackConfigArgs', 'NotifierSlackConfigArgsDict']]] = None,
                 smtp_config: Optional[pulumi.Input[Union['NotifierSmtpConfigArgs', 'NotifierSmtpConfigArgsDict']]] = None,
                 webhook_config: Optional[pulumi.Input[Union['NotifierWebhookConfigArgs', 'NotifierWebhookConfigArgsDict']]] = None,
                 wechat_config: Optional[pulumi.Input[Union['NotifierWechatConfigArgs', 'NotifierWechatConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotifierArgs.__new__(NotifierArgs)

            __props__.__dict__["annotations"] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["description"] = description
            __props__.__dict__["dingtalk_config"] = dingtalk_config
            __props__.__dict__["labels"] = labels
            __props__.__dict__["msteams_config"] = msteams_config
            __props__.__dict__["name"] = name
            __props__.__dict__["pagerduty_config"] = pagerduty_config
            __props__.__dict__["send_resolved"] = send_resolved
            __props__.__dict__["slack_config"] = slack_config
            __props__.__dict__["smtp_config"] = smtp_config
            __props__.__dict__["webhook_config"] = webhook_config
            __props__.__dict__["wechat_config"] = wechat_config
        super(Notifier, __self__).__init__(
            'rancher2:index/notifier:Notifier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            dingtalk_config: Optional[pulumi.Input[Union['NotifierDingtalkConfigArgs', 'NotifierDingtalkConfigArgsDict']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            msteams_config: Optional[pulumi.Input[Union['NotifierMsteamsConfigArgs', 'NotifierMsteamsConfigArgsDict']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pagerduty_config: Optional[pulumi.Input[Union['NotifierPagerdutyConfigArgs', 'NotifierPagerdutyConfigArgsDict']]] = None,
            send_resolved: Optional[pulumi.Input[bool]] = None,
            slack_config: Optional[pulumi.Input[Union['NotifierSlackConfigArgs', 'NotifierSlackConfigArgsDict']]] = None,
            smtp_config: Optional[pulumi.Input[Union['NotifierSmtpConfigArgs', 'NotifierSmtpConfigArgsDict']]] = None,
            webhook_config: Optional[pulumi.Input[Union['NotifierWebhookConfigArgs', 'NotifierWebhookConfigArgsDict']]] = None,
            wechat_config: Optional[pulumi.Input[Union['NotifierWechatConfigArgs', 'NotifierWechatConfigArgsDict']]] = None) -> 'Notifier':
        """
        Get an existing Notifier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[str] description: The notifier description (string)
        :param pulumi.Input[Union['NotifierDingtalkConfigArgs', 'NotifierDingtalkConfigArgsDict']] dingtalk_config: Dingtalk config for notifier (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for notifier object (map)
        :param pulumi.Input[Union['NotifierMsteamsConfigArgs', 'NotifierMsteamsConfigArgsDict']] msteams_config: MSTeams config for notifier (list maxitems:1)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input[Union['NotifierPagerdutyConfigArgs', 'NotifierPagerdutyConfigArgsDict']] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[bool] send_resolved: = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input[Union['NotifierSlackConfigArgs', 'NotifierSlackConfigArgsDict']] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierSmtpConfigArgs', 'NotifierSmtpConfigArgsDict']] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierWebhookConfigArgs', 'NotifierWebhookConfigArgsDict']] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input[Union['NotifierWechatConfigArgs', 'NotifierWechatConfigArgsDict']] wechat_config: Wechat config for notifier (list maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotifierState.__new__(_NotifierState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["description"] = description
        __props__.__dict__["dingtalk_config"] = dingtalk_config
        __props__.__dict__["labels"] = labels
        __props__.__dict__["msteams_config"] = msteams_config
        __props__.__dict__["name"] = name
        __props__.__dict__["pagerduty_config"] = pagerduty_config
        __props__.__dict__["send_resolved"] = send_resolved
        __props__.__dict__["slack_config"] = slack_config
        __props__.__dict__["smtp_config"] = smtp_config
        __props__.__dict__["webhook_config"] = webhook_config
        __props__.__dict__["wechat_config"] = wechat_config
        return Notifier(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for notifier object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id where create notifier (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The notifier description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dingtalkConfig")
    def dingtalk_config(self) -> pulumi.Output[Optional['outputs.NotifierDingtalkConfig']]:
        """
        Dingtalk config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "dingtalk_config")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for notifier object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="msteamsConfig")
    def msteams_config(self) -> pulumi.Output[Optional['outputs.NotifierMsteamsConfig']]:
        """
        MSTeams config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "msteams_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the notifier (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pagerdutyConfig")
    def pagerduty_config(self) -> pulumi.Output[Optional['outputs.NotifierPagerdutyConfig']]:
        """
        Pagerduty config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "pagerduty_config")

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> pulumi.Output[Optional[bool]]:
        """
        = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        """
        return pulumi.get(self, "send_resolved")

    @property
    @pulumi.getter(name="slackConfig")
    def slack_config(self) -> pulumi.Output[Optional['outputs.NotifierSlackConfig']]:
        """
        Slack config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "slack_config")

    @property
    @pulumi.getter(name="smtpConfig")
    def smtp_config(self) -> pulumi.Output[Optional['outputs.NotifierSmtpConfig']]:
        """
        SMTP config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "smtp_config")

    @property
    @pulumi.getter(name="webhookConfig")
    def webhook_config(self) -> pulumi.Output[Optional['outputs.NotifierWebhookConfig']]:
        """
        Webhook config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "webhook_config")

    @property
    @pulumi.getter(name="wechatConfig")
    def wechat_config(self) -> pulumi.Output[Optional['outputs.NotifierWechatConfig']]:
        """
        Wechat config for notifier (list maxitems:1)
        """
        return pulumi.get(self, "wechat_config")

