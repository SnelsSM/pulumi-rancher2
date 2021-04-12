# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ProjectArgs', 'Project']

@pulumi.input_type
class ProjectArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 container_resource_limit: Optional[pulumi.Input['ProjectContainerResourceLimitArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
                 project_monitoring_input: Optional[pulumi.Input['ProjectProjectMonitoringInputArgs']] = None,
                 resource_quota: Optional[pulumi.Input['ProjectResourceQuotaArgs']] = None,
                 wait_for_cluster: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Project resource.
        :param pulumi.Input[str] cluster_id: The cluster id where create project (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input['ProjectContainerResourceLimitArgs'] container_resource_limit: Default containers resource limits on project (List maxitem:1)
        :param pulumi.Input[str] description: A project description (string)
        :param pulumi.Input[bool] enable_project_monitoring: Enable built-in project monitoring. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[str] name: The name of the project (string)
        :param pulumi.Input[str] pod_security_policy_template_id: Default Pod Security Policy ID for the project (string)
        :param pulumi.Input['ProjectProjectMonitoringInputArgs'] project_monitoring_input: Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
        :param pulumi.Input['ProjectResourceQuotaArgs'] resource_quota: Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        :param pulumi.Input[bool] wait_for_cluster: Wait for cluster becomes active. Default `false` (bool)
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if container_resource_limit is not None:
            pulumi.set(__self__, "container_resource_limit", container_resource_limit)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enable_project_monitoring is not None:
            pulumi.set(__self__, "enable_project_monitoring", enable_project_monitoring)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pod_security_policy_template_id is not None:
            pulumi.set(__self__, "pod_security_policy_template_id", pod_security_policy_template_id)
        if project_monitoring_input is not None:
            pulumi.set(__self__, "project_monitoring_input", project_monitoring_input)
        if resource_quota is not None:
            pulumi.set(__self__, "resource_quota", resource_quota)
        if wait_for_cluster is not None:
            pulumi.set(__self__, "wait_for_cluster", wait_for_cluster)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The cluster id where create project (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="containerResourceLimit")
    def container_resource_limit(self) -> Optional[pulumi.Input['ProjectContainerResourceLimitArgs']]:
        """
        Default containers resource limits on project (List maxitem:1)
        """
        return pulumi.get(self, "container_resource_limit")

    @container_resource_limit.setter
    def container_resource_limit(self, value: Optional[pulumi.Input['ProjectContainerResourceLimitArgs']]):
        pulumi.set(self, "container_resource_limit", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A project description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="enableProjectMonitoring")
    def enable_project_monitoring(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable built-in project monitoring. Default `false` (bool)
        """
        return pulumi.get(self, "enable_project_monitoring")

    @enable_project_monitoring.setter
    def enable_project_monitoring(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_project_monitoring", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the project (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="podSecurityPolicyTemplateId")
    def pod_security_policy_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Default Pod Security Policy ID for the project (string)
        """
        return pulumi.get(self, "pod_security_policy_template_id")

    @pod_security_policy_template_id.setter
    def pod_security_policy_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pod_security_policy_template_id", value)

    @property
    @pulumi.getter(name="projectMonitoringInput")
    def project_monitoring_input(self) -> Optional[pulumi.Input['ProjectProjectMonitoringInputArgs']]:
        """
        Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
        """
        return pulumi.get(self, "project_monitoring_input")

    @project_monitoring_input.setter
    def project_monitoring_input(self, value: Optional[pulumi.Input['ProjectProjectMonitoringInputArgs']]):
        pulumi.set(self, "project_monitoring_input", value)

    @property
    @pulumi.getter(name="resourceQuota")
    def resource_quota(self) -> Optional[pulumi.Input['ProjectResourceQuotaArgs']]:
        """
        Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        """
        return pulumi.get(self, "resource_quota")

    @resource_quota.setter
    def resource_quota(self, value: Optional[pulumi.Input['ProjectResourceQuotaArgs']]):
        pulumi.set(self, "resource_quota", value)

    @property
    @pulumi.getter(name="waitForCluster")
    def wait_for_cluster(self) -> Optional[pulumi.Input[bool]]:
        """
        Wait for cluster becomes active. Default `false` (bool)
        """
        return pulumi.get(self, "wait_for_cluster")

    @wait_for_cluster.setter
    def wait_for_cluster(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_cluster", value)


class Project(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_resource_limit: Optional[pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
                 project_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']]] = None,
                 resource_quota: Optional[pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']]] = None,
                 wait_for_cluster: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project
        foo = rancher2.Project("foo",
            cluster_id="<CLUSTER_ID>",
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ),
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
            ))
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project enabling and customizing monitoring
        foo = rancher2.Project("foo",
            cluster_id="<CLUSTER_ID>",
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ),
            enable_project_monitoring=True,
            project_monitoring_input=rancher2.ProjectProjectMonitoringInputArgs(
                answers={
                    "exporter-kubelets.https": True,
                    "exporter-node.enabled": True,
                    "exporter-node.ports.metrics.port": 9796,
                    "exporter-node.resources.limits.cpu": "200m",
                    "exporter-node.resources.limits.memory": "200Mi",
                    "grafana.persistence.enabled": False,
                    "grafana.persistence.size": "10Gi",
                    "grafana.persistence.storageClass": "default",
                    "operator.resources.limits.memory": "500Mi",
                    "prometheus.persistence.enabled": "false",
                    "prometheus.persistence.size": "50Gi",
                    "prometheus.persistence.storageClass": "default",
                    "prometheus.persistent.useReleaseName": "true",
                    "prometheus.resources.core.limits.cpu": "1000m",
                    "prometheus.resources.core.limits.memory": "1500Mi",
                    "prometheus.resources.core.requests.cpu": "750m",
                    "prometheus.resources.core.requests.memory": "750Mi",
                    "prometheus.retention": "12h",
                },
            ),
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
            ))
        ```

        ## Import

        Projects can be imported using the Rancher Project ID

        ```sh
         $ pulumi import rancher2:index/project:Project foo &lt;project_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create project (string)
        :param pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']] container_resource_limit: Default containers resource limits on project (List maxitem:1)
        :param pulumi.Input[str] description: A project description (string)
        :param pulumi.Input[bool] enable_project_monitoring: Enable built-in project monitoring. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[str] name: The name of the project (string)
        :param pulumi.Input[str] pod_security_policy_template_id: Default Pod Security Policy ID for the project (string)
        :param pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']] project_monitoring_input: Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']] resource_quota: Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        :param pulumi.Input[bool] wait_for_cluster: Wait for cluster becomes active. Default `false` (bool)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project
        foo = rancher2.Project("foo",
            cluster_id="<CLUSTER_ID>",
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ),
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
            ))
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project enabling and customizing monitoring
        foo = rancher2.Project("foo",
            cluster_id="<CLUSTER_ID>",
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ),
            enable_project_monitoring=True,
            project_monitoring_input=rancher2.ProjectProjectMonitoringInputArgs(
                answers={
                    "exporter-kubelets.https": True,
                    "exporter-node.enabled": True,
                    "exporter-node.ports.metrics.port": 9796,
                    "exporter-node.resources.limits.cpu": "200m",
                    "exporter-node.resources.limits.memory": "200Mi",
                    "grafana.persistence.enabled": False,
                    "grafana.persistence.size": "10Gi",
                    "grafana.persistence.storageClass": "default",
                    "operator.resources.limits.memory": "500Mi",
                    "prometheus.persistence.enabled": "false",
                    "prometheus.persistence.size": "50Gi",
                    "prometheus.persistence.storageClass": "default",
                    "prometheus.persistent.useReleaseName": "true",
                    "prometheus.resources.core.limits.cpu": "1000m",
                    "prometheus.resources.core.limits.memory": "1500Mi",
                    "prometheus.resources.core.requests.cpu": "750m",
                    "prometheus.resources.core.requests.memory": "750Mi",
                    "prometheus.retention": "12h",
                },
            ),
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
            ))
        ```

        ## Import

        Projects can be imported using the Rancher Project ID

        ```sh
         $ pulumi import rancher2:index/project:Project foo &lt;project_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_resource_limit: Optional[pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
                 project_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']]] = None,
                 resource_quota: Optional[pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']]] = None,
                 wait_for_cluster: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['annotations'] = annotations
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['container_resource_limit'] = container_resource_limit
            __props__['description'] = description
            __props__['enable_project_monitoring'] = enable_project_monitoring
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['pod_security_policy_template_id'] = pod_security_policy_template_id
            __props__['project_monitoring_input'] = project_monitoring_input
            __props__['resource_quota'] = resource_quota
            __props__['wait_for_cluster'] = wait_for_cluster
        super(Project, __self__).__init__(
            'rancher2:index/project:Project',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            container_resource_limit: Optional[pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
            project_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']]] = None,
            resource_quota: Optional[pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']]] = None,
            wait_for_cluster: Optional[pulumi.Input[bool]] = None) -> 'Project':
        """
        Get an existing Project resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create project (string)
        :param pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']] container_resource_limit: Default containers resource limits on project (List maxitem:1)
        :param pulumi.Input[str] description: A project description (string)
        :param pulumi.Input[bool] enable_project_monitoring: Enable built-in project monitoring. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Node Pool object (map)
        :param pulumi.Input[str] name: The name of the project (string)
        :param pulumi.Input[str] pod_security_policy_template_id: Default Pod Security Policy ID for the project (string)
        :param pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']] project_monitoring_input: Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']] resource_quota: Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        :param pulumi.Input[bool] wait_for_cluster: Wait for cluster becomes active. Default `false` (bool)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["container_resource_limit"] = container_resource_limit
        __props__["description"] = description
        __props__["enable_project_monitoring"] = enable_project_monitoring
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["pod_security_policy_template_id"] = pod_security_policy_template_id
        __props__["project_monitoring_input"] = project_monitoring_input
        __props__["resource_quota"] = resource_quota
        __props__["wait_for_cluster"] = wait_for_cluster
        return Project(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster id where create project (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="containerResourceLimit")
    def container_resource_limit(self) -> pulumi.Output[Optional['outputs.ProjectContainerResourceLimit']]:
        """
        Default containers resource limits on project (List maxitem:1)
        """
        return pulumi.get(self, "container_resource_limit")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A project description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableProjectMonitoring")
    def enable_project_monitoring(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable built-in project monitoring. Default `false` (bool)
        """
        return pulumi.get(self, "enable_project_monitoring")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the project (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="podSecurityPolicyTemplateId")
    def pod_security_policy_template_id(self) -> pulumi.Output[Optional[str]]:
        """
        Default Pod Security Policy ID for the project (string)
        """
        return pulumi.get(self, "pod_security_policy_template_id")

    @property
    @pulumi.getter(name="projectMonitoringInput")
    def project_monitoring_input(self) -> pulumi.Output[Optional['outputs.ProjectProjectMonitoringInput']]:
        """
        Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
        """
        return pulumi.get(self, "project_monitoring_input")

    @property
    @pulumi.getter(name="resourceQuota")
    def resource_quota(self) -> pulumi.Output[Optional['outputs.ProjectResourceQuota']]:
        """
        Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
        """
        return pulumi.get(self, "resource_quota")

    @property
    @pulumi.getter(name="waitForCluster")
    def wait_for_cluster(self) -> pulumi.Output[Optional[bool]]:
        """
        Wait for cluster becomes active. Default `false` (bool)
        """
        return pulumi.get(self, "wait_for_cluster")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

