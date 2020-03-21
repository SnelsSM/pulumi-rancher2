# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class ClusterLogging(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for Cluster Logging object (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The cluster id to configure logging (string)
    """
    elasticsearch_config: pulumi.Output[dict]
    """
    The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)

      * `authPassword` (`str`) - User password for the elascticsearch service (string)
      * `authUsername` (`str`) - Username for the elascticsearch service (string)
      * `certificate` (`str`) - SSL certificate for the syslog service (string)
      * `clientCert` (`str`) - SSL client certificate for the syslog service (string)
      * `clientKey` (`str`) - SSL client key for the syslog service (string)
      * `clientKeyPass` (`str`) - SSL client key password for the splunk service (string)
      * `dateFormat` (`str`) - Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
      * `endpoint` (`str`) - Endpoint of the syslog service (string)
      * `indexPrefix` (`str`) - Index prefix for the elascticsearch logs. Default: `local` (string)
      * `sslVerify` (`bool`) - SSL verify for the syslog service (bool)
      * `sslVersion` (`str`) - SSL version for the elascticsearch service (string)
    """
    fluentd_config: pulumi.Output[dict]
    """
    The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)

      * `certificate` (`str`) - SSL certificate for the syslog service (string)
      * `compress` (`bool`) - Compress data for the fluentd service (bool)
      * `enableTls` (`bool`) - Enable TLS for the fluentd service (bool)
      * `fluentServers` (`list`) - Servers for the fluentd service (list)
        * `endpoint` (`str`) - Endpoint of the syslog service (string)
        * `hostname` (`str`) - Hostname of the fluentd service (string)
        * `password` (`str`) - User password of the fluentd service (string)
        * `sharedKey` (`str`) - Shared key of the fluentd service (string)
        * `standby` (`bool`) - Standby server of the fluentd service (bool)
        * `username` (`str`) - Username of the fluentd service (string)
        * `weight` (`float`) - Weight of the fluentd server (int)
    """
    kafka_config: pulumi.Output[dict]
    """
    The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)

      * `brokerEndpoints` (`list`) - Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
      * `certificate` (`str`) - SSL certificate for the syslog service (string)
      * `clientCert` (`str`) - SSL client certificate for the syslog service (string)
      * `clientKey` (`str`) - SSL client key for the syslog service (string)
      * `topic` (`str`) - Topic to publish on the kafka service (string)
      * `zookeeperEndpoint` (`str`) - Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)
    """
    kind: pulumi.Output[str]
    """
    The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels for Cluster Logging object (map)
    """
    name: pulumi.Output[str]
    """
    The name of the cluster logging config (string)
    """
    namespace_id: pulumi.Output[str]
    """
    The namespace id from cluster logging (string)
    """
    output_flush_interval: pulumi.Output[float]
    """
    How often buffered logs would be flushed. Default: `3` seconds (int)
    """
    output_tags: pulumi.Output[dict]
    """
    The output tags for Cluster Logging (map)
    """
    splunk_config: pulumi.Output[dict]
    """
    The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)

      * `certificate` (`str`) - SSL certificate for the syslog service (string)
      * `clientCert` (`str`) - SSL client certificate for the syslog service (string)
      * `clientKey` (`str`) - SSL client key for the syslog service (string)
      * `clientKeyPass` (`str`) - SSL client key password for the splunk service (string)
      * `endpoint` (`str`) - Endpoint of the syslog service (string)
      * `index` (`str`) - Index prefix for the splunk logs (string)
      * `source` (`str`) - Date format for the splunk logs (string)
      * `sslVerify` (`bool`) - SSL verify for the syslog service (bool)
      * `token` (`str`) - Token for the syslog service (string)
    """
    syslog_config: pulumi.Output[dict]
    """
    The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)

      * `certificate` (`str`) - SSL certificate for the syslog service (string)
      * `clientCert` (`str`) - SSL client certificate for the syslog service (string)
      * `clientKey` (`str`) - SSL client key for the syslog service (string)
      * `endpoint` (`str`) - Endpoint of the syslog service (string)
      * `program` (`str`) - Program for the syslog service (string)
      * `protocol` (`str`) - Protocol for the syslog service. `tcp` and `udp` are supported. Default: `udp` (string)
      * `severity` (`str`) - Date format for the syslog logs. `emergency`, `alert`, `critical`, `error`, `warning`, `notice`, `info` and `debug` are supported. Default: `notice` (string)
      * `sslVerify` (`bool`) - SSL verify for the syslog service (bool)
      * `token` (`str`) - Token for the syslog service (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, elasticsearch_config=None, fluentd_config=None, kafka_config=None, kind=None, labels=None, name=None, namespace_id=None, output_flush_interval=None, output_tags=None, splunk_config=None, syslog_config=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Cluster Logging resource. This can be used to configure Cluster Logging for Rancher v2 environments and retrieve their information.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterLogging.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Cluster Logging object (map)
        :param pulumi.Input[str] cluster_id: The cluster id to configure logging (string)
        :param pulumi.Input[dict] elasticsearch_config: The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] fluentd_config: The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] kafka_config: The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[str] kind: The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        :param pulumi.Input[dict] labels: Labels for Cluster Logging object (map)
        :param pulumi.Input[str] name: The name of the cluster logging config (string)
        :param pulumi.Input[str] namespace_id: The namespace id from cluster logging (string)
        :param pulumi.Input[float] output_flush_interval: How often buffered logs would be flushed. Default: `3` seconds (int)
        :param pulumi.Input[dict] output_tags: The output tags for Cluster Logging (map)
        :param pulumi.Input[dict] splunk_config: The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] syslog_config: The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)

        The **elasticsearch_config** object supports the following:

          * `authPassword` (`pulumi.Input[str]`) - User password for the elascticsearch service (string)
          * `authUsername` (`pulumi.Input[str]`) - Username for the elascticsearch service (string)
          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `clientKeyPass` (`pulumi.Input[str]`) - SSL client key password for the splunk service (string)
          * `dateFormat` (`pulumi.Input[str]`) - Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `indexPrefix` (`pulumi.Input[str]`) - Index prefix for the elascticsearch logs. Default: `local` (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `sslVersion` (`pulumi.Input[str]`) - SSL version for the elascticsearch service (string)

        The **fluentd_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `compress` (`pulumi.Input[bool]`) - Compress data for the fluentd service (bool)
          * `enableTls` (`pulumi.Input[bool]`) - Enable TLS for the fluentd service (bool)
          * `fluentServers` (`pulumi.Input[list]`) - Servers for the fluentd service (list)
            * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
            * `hostname` (`pulumi.Input[str]`) - Hostname of the fluentd service (string)
            * `password` (`pulumi.Input[str]`) - User password of the fluentd service (string)
            * `sharedKey` (`pulumi.Input[str]`) - Shared key of the fluentd service (string)
            * `standby` (`pulumi.Input[bool]`) - Standby server of the fluentd service (bool)
            * `username` (`pulumi.Input[str]`) - Username of the fluentd service (string)
            * `weight` (`pulumi.Input[float]`) - Weight of the fluentd server (int)

        The **kafka_config** object supports the following:

          * `brokerEndpoints` (`pulumi.Input[list]`) - Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `topic` (`pulumi.Input[str]`) - Topic to publish on the kafka service (string)
          * `zookeeperEndpoint` (`pulumi.Input[str]`) - Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)

        The **splunk_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `clientKeyPass` (`pulumi.Input[str]`) - SSL client key password for the splunk service (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `index` (`pulumi.Input[str]`) - Index prefix for the splunk logs (string)
          * `source` (`pulumi.Input[str]`) - Date format for the splunk logs (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `token` (`pulumi.Input[str]`) - Token for the syslog service (string)

        The **syslog_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `program` (`pulumi.Input[str]`) - Program for the syslog service (string)
          * `protocol` (`pulumi.Input[str]`) - Protocol for the syslog service. `tcp` and `udp` are supported. Default: `udp` (string)
          * `severity` (`pulumi.Input[str]`) - Date format for the syslog logs. `emergency`, `alert`, `critical`, `error`, `warning`, `notice`, `info` and `debug` are supported. Default: `notice` (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `token` (`pulumi.Input[str]`) - Token for the syslog service (string)
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
            __props__['elasticsearch_config'] = elasticsearch_config
            __props__['fluentd_config'] = fluentd_config
            __props__['kafka_config'] = kafka_config
            if kind is None:
                raise TypeError("Missing required property 'kind'")
            __props__['kind'] = kind
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            __props__['output_flush_interval'] = output_flush_interval
            __props__['output_tags'] = output_tags
            __props__['splunk_config'] = splunk_config
            __props__['syslog_config'] = syslog_config
        super(ClusterLogging, __self__).__init__(
            'rancher2:index/clusterLogging:ClusterLogging',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, elasticsearch_config=None, fluentd_config=None, kafka_config=None, kind=None, labels=None, name=None, namespace_id=None, output_flush_interval=None, output_tags=None, splunk_config=None, syslog_config=None):
        """
        Get an existing ClusterLogging resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Cluster Logging object (map)
        :param pulumi.Input[str] cluster_id: The cluster id to configure logging (string)
        :param pulumi.Input[dict] elasticsearch_config: The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] fluentd_config: The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] kafka_config: The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[str] kind: The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        :param pulumi.Input[dict] labels: Labels for Cluster Logging object (map)
        :param pulumi.Input[str] name: The name of the cluster logging config (string)
        :param pulumi.Input[str] namespace_id: The namespace id from cluster logging (string)
        :param pulumi.Input[float] output_flush_interval: How often buffered logs would be flushed. Default: `3` seconds (int)
        :param pulumi.Input[dict] output_tags: The output tags for Cluster Logging (map)
        :param pulumi.Input[dict] splunk_config: The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        :param pulumi.Input[dict] syslog_config: The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)

        The **elasticsearch_config** object supports the following:

          * `authPassword` (`pulumi.Input[str]`) - User password for the elascticsearch service (string)
          * `authUsername` (`pulumi.Input[str]`) - Username for the elascticsearch service (string)
          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `clientKeyPass` (`pulumi.Input[str]`) - SSL client key password for the splunk service (string)
          * `dateFormat` (`pulumi.Input[str]`) - Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `indexPrefix` (`pulumi.Input[str]`) - Index prefix for the elascticsearch logs. Default: `local` (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `sslVersion` (`pulumi.Input[str]`) - SSL version for the elascticsearch service (string)

        The **fluentd_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `compress` (`pulumi.Input[bool]`) - Compress data for the fluentd service (bool)
          * `enableTls` (`pulumi.Input[bool]`) - Enable TLS for the fluentd service (bool)
          * `fluentServers` (`pulumi.Input[list]`) - Servers for the fluentd service (list)
            * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
            * `hostname` (`pulumi.Input[str]`) - Hostname of the fluentd service (string)
            * `password` (`pulumi.Input[str]`) - User password of the fluentd service (string)
            * `sharedKey` (`pulumi.Input[str]`) - Shared key of the fluentd service (string)
            * `standby` (`pulumi.Input[bool]`) - Standby server of the fluentd service (bool)
            * `username` (`pulumi.Input[str]`) - Username of the fluentd service (string)
            * `weight` (`pulumi.Input[float]`) - Weight of the fluentd server (int)

        The **kafka_config** object supports the following:

          * `brokerEndpoints` (`pulumi.Input[list]`) - Kafka endpoints for kafka service. Conflicts with `zookeeper_endpoint` (list)
          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `topic` (`pulumi.Input[str]`) - Topic to publish on the kafka service (string)
          * `zookeeperEndpoint` (`pulumi.Input[str]`) - Zookeeper endpoint for kafka service. Conflicts with `broker_endpoints` (string)

        The **splunk_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `clientKeyPass` (`pulumi.Input[str]`) - SSL client key password for the splunk service (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `index` (`pulumi.Input[str]`) - Index prefix for the splunk logs (string)
          * `source` (`pulumi.Input[str]`) - Date format for the splunk logs (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `token` (`pulumi.Input[str]`) - Token for the syslog service (string)

        The **syslog_config** object supports the following:

          * `certificate` (`pulumi.Input[str]`) - SSL certificate for the syslog service (string)
          * `clientCert` (`pulumi.Input[str]`) - SSL client certificate for the syslog service (string)
          * `clientKey` (`pulumi.Input[str]`) - SSL client key for the syslog service (string)
          * `endpoint` (`pulumi.Input[str]`) - Endpoint of the syslog service (string)
          * `program` (`pulumi.Input[str]`) - Program for the syslog service (string)
          * `protocol` (`pulumi.Input[str]`) - Protocol for the syslog service. `tcp` and `udp` are supported. Default: `udp` (string)
          * `severity` (`pulumi.Input[str]`) - Date format for the syslog logs. `emergency`, `alert`, `critical`, `error`, `warning`, `notice`, `info` and `debug` are supported. Default: `notice` (string)
          * `sslVerify` (`pulumi.Input[bool]`) - SSL verify for the syslog service (bool)
          * `token` (`pulumi.Input[str]`) - Token for the syslog service (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["elasticsearch_config"] = elasticsearch_config
        __props__["fluentd_config"] = fluentd_config
        __props__["kafka_config"] = kafka_config
        __props__["kind"] = kind
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["output_flush_interval"] = output_flush_interval
        __props__["output_tags"] = output_tags
        __props__["splunk_config"] = splunk_config
        __props__["syslog_config"] = syslog_config
        return ClusterLogging(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

