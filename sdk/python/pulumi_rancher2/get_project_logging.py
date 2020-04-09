# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetProjectLoggingResult:
    """
    A collection of values returned by getProjectLogging.
    """
    def __init__(__self__, annotations=None, custom_target_config=None, elasticsearch_config=None, enable_json_parsing=None, fluentd_config=None, id=None, kafka_config=None, kind=None, labels=None, name=None, namespace_id=None, output_flush_interval=None, output_tags=None, project_id=None, splunk_config=None, syslog_config=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations for Cluster Logging object (map)
        """
        if custom_target_config and not isinstance(custom_target_config, dict):
            raise TypeError("Expected argument 'custom_target_config' to be a dict")
        __self__.custom_target_config = custom_target_config
        if elasticsearch_config and not isinstance(elasticsearch_config, dict):
            raise TypeError("Expected argument 'elasticsearch_config' to be a dict")
        __self__.elasticsearch_config = elasticsearch_config
        """
        (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
        """
        if enable_json_parsing and not isinstance(enable_json_parsing, bool):
            raise TypeError("Expected argument 'enable_json_parsing' to be a bool")
        __self__.enable_json_parsing = enable_json_parsing
        if fluentd_config and not isinstance(fluentd_config, dict):
            raise TypeError("Expected argument 'fluentd_config' to be a dict")
        __self__.fluentd_config = fluentd_config
        """
        (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
        if kafka_config and not isinstance(kafka_config, dict):
            raise TypeError("Expected argument 'kafka_config' to be a dict")
        __self__.kafka_config = kafka_config
        """
        (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
        """
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        __self__.kind = kind
        """
        (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        """
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        __self__.labels = labels
        """
        (Computed) Labels for Cluster Logging object (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        """
        (Computed) The name of the cluster logging config (string)
        """
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        __self__.namespace_id = namespace_id
        """
        (Computed) The namespace id from cluster logging (string)
        """
        if output_flush_interval and not isinstance(output_flush_interval, float):
            raise TypeError("Expected argument 'output_flush_interval' to be a float")
        __self__.output_flush_interval = output_flush_interval
        """
        (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
        """
        if output_tags and not isinstance(output_tags, dict):
            raise TypeError("Expected argument 'output_tags' to be a dict")
        __self__.output_tags = output_tags
        """
        (computed) The output tags for Cluster Logging (map)
        """
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        __self__.project_id = project_id
        if splunk_config and not isinstance(splunk_config, dict):
            raise TypeError("Expected argument 'splunk_config' to be a dict")
        __self__.splunk_config = splunk_config
        """
        (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
        """
        if syslog_config and not isinstance(syslog_config, dict):
            raise TypeError("Expected argument 'syslog_config' to be a dict")
        __self__.syslog_config = syslog_config
        """
        (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
        """
class AwaitableGetProjectLoggingResult(GetProjectLoggingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectLoggingResult(
            annotations=self.annotations,
            custom_target_config=self.custom_target_config,
            elasticsearch_config=self.elasticsearch_config,
            enable_json_parsing=self.enable_json_parsing,
            fluentd_config=self.fluentd_config,
            id=self.id,
            kafka_config=self.kafka_config,
            kind=self.kind,
            labels=self.labels,
            name=self.name,
            namespace_id=self.namespace_id,
            output_flush_interval=self.output_flush_interval,
            output_tags=self.output_tags,
            project_id=self.project_id,
            splunk_config=self.splunk_config,
            syslog_config=self.syslog_config)

def get_project_logging(project_id=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 Project Logging.



    > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/projectLogging.html.markdown.


    :param str project_id: The project id to configure logging (string)
    """
    __args__ = dict()


    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProjectLogging:getProjectLogging', __args__, opts=opts).value

    return AwaitableGetProjectLoggingResult(
        annotations=__ret__.get('annotations'),
        custom_target_config=__ret__.get('customTargetConfig'),
        elasticsearch_config=__ret__.get('elasticsearchConfig'),
        enable_json_parsing=__ret__.get('enableJsonParsing'),
        fluentd_config=__ret__.get('fluentdConfig'),
        id=__ret__.get('id'),
        kafka_config=__ret__.get('kafkaConfig'),
        kind=__ret__.get('kind'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        namespace_id=__ret__.get('namespaceId'),
        output_flush_interval=__ret__.get('outputFlushInterval'),
        output_tags=__ret__.get('outputTags'),
        project_id=__ret__.get('projectId'),
        splunk_config=__ret__.get('splunkConfig'),
        syslog_config=__ret__.get('syslogConfig'))
