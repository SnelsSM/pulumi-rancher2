# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class ClusterAlertRule(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    The cluster alert rule annotations (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The cluster id where create cluster alert rule (string)
    """
    event_rule: pulumi.Output[dict]
    """
    The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)

      * `eventType` (`str`) - Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
      * `resourceKind` (`str`) - Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)
    """
    group_id: pulumi.Output[str]
    """
    The cluster alert rule alert group ID (string)
    """
    group_interval_seconds: pulumi.Output[float]
    """
    The cluster alert rule group interval seconds. Default: `180` (int)
    """
    group_wait_seconds: pulumi.Output[float]
    """
    The cluster alert rule group wait seconds. Default: `180` (int)
    """
    inherited: pulumi.Output[bool]
    """
    The cluster alert rule inherited. Default: `true` (bool)
    """
    labels: pulumi.Output[dict]
    """
    The cluster alert rule labels (map)
    """
    metric_rule: pulumi.Output[dict]
    """
    The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)

      * `comparison` (`str`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
      * `description` (`str`) - Metric rule description (string)
      * `duration` (`str`) - Metric rule duration (string)
      * `expression` (`str`) - Metric rule expression (string)
      * `thresholdValue` (`float`) - Metric rule threshold value (float64)
    """
    name: pulumi.Output[str]
    """
    The cluster alert rule name (string)
    """
    node_rule: pulumi.Output[dict]
    """
    The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)

      * `condition` (`str`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
      * `cpuThreshold` (`float`) - Node rule cpu threshold. Default: `70` (int)
      * `memThreshold` (`float`) - Node rule mem threshold. Default: `70` (int)
      * `nodeId` (`str`) - Node ID (string)
      * `selector` (`dict`) - Node rule selector (map)
    """
    repeat_interval_seconds: pulumi.Output[float]
    """
    The cluster alert rule wait seconds. Default: `3600` (int)
    """
    severity: pulumi.Output[str]
    """
    The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
    """
    system_service_rule: pulumi.Output[dict]
    """
    The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)

      * `condition` (`str`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, event_rule=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, inherited=None, labels=None, metric_rule=None, name=None, node_rule=None, repeat_interval_seconds=None, severity=None, system_service_rule=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Cluster Alert Group
        foo_cluster_alert_group = rancher2.ClusterAlertGroup("fooClusterAlertGroup",
            cluster_id="<cluster_id>",
            description="Terraform cluster alert group",
            group_interval_seconds=300,
            repeat_interval_seconds=3600)
        # Create a new Rancher2 Cluster Alert Rule
        foo_cluster_alert_rule = rancher2.ClusterAlertRule("fooClusterAlertRule",
            cluster_id=foo_cluster_alert_group.cluster_id,
            group_id=foo_cluster_alert_group.id,
            group_interval_seconds=600,
            repeat_interval_seconds=6000)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The cluster alert rule annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert rule (string)
        :param pulumi.Input[dict] event_rule: The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] group_id: The cluster alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The cluster alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[dict] labels: The cluster alert rule labels (map)
        :param pulumi.Input[dict] metric_rule: The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The cluster alert rule name (string)
        :param pulumi.Input[dict] node_rule: The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[dict] system_service_rule: The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)

        The **event_rule** object supports the following:

          * `eventType` (`pulumi.Input[str]`) - Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
          * `resourceKind` (`pulumi.Input[str]`) - Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)

        The **metric_rule** object supports the following:

          * `comparison` (`pulumi.Input[str]`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
          * `description` (`pulumi.Input[str]`) - Metric rule description (string)
          * `duration` (`pulumi.Input[str]`) - Metric rule duration (string)
          * `expression` (`pulumi.Input[str]`) - Metric rule expression (string)
          * `thresholdValue` (`pulumi.Input[float]`) - Metric rule threshold value (float64)

        The **node_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
          * `cpuThreshold` (`pulumi.Input[float]`) - Node rule cpu threshold. Default: `70` (int)
          * `memThreshold` (`pulumi.Input[float]`) - Node rule mem threshold. Default: `70` (int)
          * `nodeId` (`pulumi.Input[str]`) - Node ID (string)
          * `selector` (`pulumi.Input[dict]`) - Node rule selector (map)

        The **system_service_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['event_rule'] = event_rule
            if group_id is None:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            __props__['group_interval_seconds'] = group_interval_seconds
            __props__['group_wait_seconds'] = group_wait_seconds
            __props__['inherited'] = inherited
            __props__['labels'] = labels
            __props__['metric_rule'] = metric_rule
            __props__['name'] = name
            __props__['node_rule'] = node_rule
            __props__['repeat_interval_seconds'] = repeat_interval_seconds
            __props__['severity'] = severity
            __props__['system_service_rule'] = system_service_rule
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="rancher2:index/clusterAlterRule:ClusterAlterRule")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ClusterAlertRule, __self__).__init__(
            'rancher2:index/clusterAlertRule:ClusterAlertRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, event_rule=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, inherited=None, labels=None, metric_rule=None, name=None, node_rule=None, repeat_interval_seconds=None, severity=None, system_service_rule=None):
        """
        Get an existing ClusterAlertRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The cluster alert rule annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert rule (string)
        :param pulumi.Input[dict] event_rule: The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] group_id: The cluster alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The cluster alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[dict] labels: The cluster alert rule labels (map)
        :param pulumi.Input[dict] metric_rule: The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The cluster alert rule name (string)
        :param pulumi.Input[dict] node_rule: The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[dict] system_service_rule: The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)

        The **event_rule** object supports the following:

          * `eventType` (`pulumi.Input[str]`) - Event type. Supported values : `"Warning" | "Normal"`. Default: `Warning` (string)
          * `resourceKind` (`pulumi.Input[str]`) - Resource kind. Supported values : `"DaemonSet" | "Deployment" | "Node" | "Pod" | "StatefulSet"` (string)

        The **metric_rule** object supports the following:

          * `comparison` (`pulumi.Input[str]`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
          * `description` (`pulumi.Input[str]`) - Metric rule description (string)
          * `duration` (`pulumi.Input[str]`) - Metric rule duration (string)
          * `expression` (`pulumi.Input[str]`) - Metric rule expression (string)
          * `thresholdValue` (`pulumi.Input[float]`) - Metric rule threshold value (float64)

        The **node_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
          * `cpuThreshold` (`pulumi.Input[float]`) - Node rule cpu threshold. Default: `70` (int)
          * `memThreshold` (`pulumi.Input[float]`) - Node rule mem threshold. Default: `70` (int)
          * `nodeId` (`pulumi.Input[str]`) - Node ID (string)
          * `selector` (`pulumi.Input[dict]`) - Node rule selector (map)

        The **system_service_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["event_rule"] = event_rule
        __props__["group_id"] = group_id
        __props__["group_interval_seconds"] = group_interval_seconds
        __props__["group_wait_seconds"] = group_wait_seconds
        __props__["inherited"] = inherited
        __props__["labels"] = labels
        __props__["metric_rule"] = metric_rule
        __props__["name"] = name
        __props__["node_rule"] = node_rule
        __props__["repeat_interval_seconds"] = repeat_interval_seconds
        __props__["severity"] = severity
        __props__["system_service_rule"] = system_service_rule
        return ClusterAlertRule(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
