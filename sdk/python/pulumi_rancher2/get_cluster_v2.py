# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetClusterV2Result',
    'AwaitableGetClusterV2Result',
    'get_cluster_v2',
]

@pulumi.output_type
class GetClusterV2Result:
    """
    A collection of values returned by getClusterV2.
    """
    def __init__(__self__, agent_env_vars=None, annotations=None, cloud_credential_secret_name=None, cluster_registration_token=None, cluster_v1_id=None, default_cluster_role_for_project_members=None, default_pod_security_policy_template_name=None, enable_network_policy=None, fleet_namespace=None, id=None, kube_config=None, kubernetes_version=None, labels=None, name=None, resource_version=None, rke_config=None):
        if agent_env_vars and not isinstance(agent_env_vars, list):
            raise TypeError("Expected argument 'agent_env_vars' to be a list")
        pulumi.set(__self__, "agent_env_vars", agent_env_vars)
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cloud_credential_secret_name and not isinstance(cloud_credential_secret_name, str):
            raise TypeError("Expected argument 'cloud_credential_secret_name' to be a str")
        pulumi.set(__self__, "cloud_credential_secret_name", cloud_credential_secret_name)
        if cluster_registration_token and not isinstance(cluster_registration_token, dict):
            raise TypeError("Expected argument 'cluster_registration_token' to be a dict")
        pulumi.set(__self__, "cluster_registration_token", cluster_registration_token)
        if cluster_v1_id and not isinstance(cluster_v1_id, str):
            raise TypeError("Expected argument 'cluster_v1_id' to be a str")
        pulumi.set(__self__, "cluster_v1_id", cluster_v1_id)
        if default_cluster_role_for_project_members and not isinstance(default_cluster_role_for_project_members, str):
            raise TypeError("Expected argument 'default_cluster_role_for_project_members' to be a str")
        pulumi.set(__self__, "default_cluster_role_for_project_members", default_cluster_role_for_project_members)
        if default_pod_security_policy_template_name and not isinstance(default_pod_security_policy_template_name, str):
            raise TypeError("Expected argument 'default_pod_security_policy_template_name' to be a str")
        pulumi.set(__self__, "default_pod_security_policy_template_name", default_pod_security_policy_template_name)
        if enable_network_policy and not isinstance(enable_network_policy, bool):
            raise TypeError("Expected argument 'enable_network_policy' to be a bool")
        pulumi.set(__self__, "enable_network_policy", enable_network_policy)
        if fleet_namespace and not isinstance(fleet_namespace, str):
            raise TypeError("Expected argument 'fleet_namespace' to be a str")
        pulumi.set(__self__, "fleet_namespace", fleet_namespace)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kube_config and not isinstance(kube_config, str):
            raise TypeError("Expected argument 'kube_config' to be a str")
        pulumi.set(__self__, "kube_config", kube_config)
        if kubernetes_version and not isinstance(kubernetes_version, str):
            raise TypeError("Expected argument 'kubernetes_version' to be a str")
        pulumi.set(__self__, "kubernetes_version", kubernetes_version)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_version and not isinstance(resource_version, str):
            raise TypeError("Expected argument 'resource_version' to be a str")
        pulumi.set(__self__, "resource_version", resource_version)
        if rke_config and not isinstance(rke_config, dict):
            raise TypeError("Expected argument 'rke_config' to be a dict")
        pulumi.set(__self__, "rke_config", rke_config)

    @property
    @pulumi.getter(name="agentEnvVars")
    def agent_env_vars(self) -> Sequence['outputs.GetClusterV2AgentEnvVarResult']:
        """
        (Computed) Optional Agent Env Vars for Rancher agent (list)
        """
        return pulumi.get(self, "agent_env_vars")

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="cloudCredentialSecretName")
    def cloud_credential_secret_name(self) -> str:
        """
        (Computed) Cluster V2 cloud credential secret name (string)
        """
        return pulumi.get(self, "cloud_credential_secret_name")

    @property
    @pulumi.getter(name="clusterRegistrationToken")
    def cluster_registration_token(self) -> 'outputs.GetClusterV2ClusterRegistrationTokenResult':
        """
        (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
        """
        return pulumi.get(self, "cluster_registration_token")

    @property
    @pulumi.getter(name="clusterV1Id")
    def cluster_v1_id(self) -> str:
        """
        (Computed) Cluster v1 id for cluster v2 (string)
        """
        return pulumi.get(self, "cluster_v1_id")

    @property
    @pulumi.getter(name="defaultClusterRoleForProjectMembers")
    def default_cluster_role_for_project_members(self) -> str:
        """
        (Computed) Cluster V2 default cluster role for project members (string)
        """
        return pulumi.get(self, "default_cluster_role_for_project_members")

    @property
    @pulumi.getter(name="defaultPodSecurityPolicyTemplateName")
    def default_pod_security_policy_template_name(self) -> str:
        """
        (Computed) Cluster V2 default pod security policy template name (string)
        """
        return pulumi.get(self, "default_pod_security_policy_template_name")

    @property
    @pulumi.getter(name="enableNetworkPolicy")
    def enable_network_policy(self) -> bool:
        """
        (Computed) Enable k8s network policy at Cluster V2 (bool)
        """
        return pulumi.get(self, "enable_network_policy")

    @property
    @pulumi.getter(name="fleetNamespace")
    def fleet_namespace(self) -> Optional[str]:
        return pulumi.get(self, "fleet_namespace")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kubeConfig")
    def kube_config(self) -> str:
        """
        (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
        """
        return pulumi.get(self, "kube_config")

    @property
    @pulumi.getter(name="kubernetesVersion")
    def kubernetes_version(self) -> str:
        """
        (Computed) The kubernetes version of the Cluster v2 (list maxitems:1)
        """
        return pulumi.get(self, "kubernetes_version")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> str:
        """
        (Computed) Cluster v2 k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @property
    @pulumi.getter(name="rkeConfig")
    def rke_config(self) -> 'outputs.GetClusterV2RkeConfigResult':
        """
        (Computed) The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
        """
        return pulumi.get(self, "rke_config")


class AwaitableGetClusterV2Result(GetClusterV2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterV2Result(
            agent_env_vars=self.agent_env_vars,
            annotations=self.annotations,
            cloud_credential_secret_name=self.cloud_credential_secret_name,
            cluster_registration_token=self.cluster_registration_token,
            cluster_v1_id=self.cluster_v1_id,
            default_cluster_role_for_project_members=self.default_cluster_role_for_project_members,
            default_pod_security_policy_template_name=self.default_pod_security_policy_template_name,
            enable_network_policy=self.enable_network_policy,
            fleet_namespace=self.fleet_namespace,
            id=self.id,
            kube_config=self.kube_config,
            kubernetes_version=self.kubernetes_version,
            labels=self.labels,
            name=self.name,
            resource_version=self.resource_version,
            rke_config=self.rke_config)


def get_cluster_v2(fleet_namespace: Optional[str] = None,
                   name: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterV2Result:
    """
    Use this data source to retrieve information about a Rancher v2 cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_v2(fleet_namespace="fleet-ns",
        name="foo")
    ```


    :param str fleet_namespace: The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
    :param str name: The name of the Cluster v2 (string)
    """
    __args__ = dict()
    __args__['fleetNamespace'] = fleet_namespace
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterV2:getClusterV2', __args__, opts=opts, typ=GetClusterV2Result).value

    return AwaitableGetClusterV2Result(
        agent_env_vars=__ret__.agent_env_vars,
        annotations=__ret__.annotations,
        cloud_credential_secret_name=__ret__.cloud_credential_secret_name,
        cluster_registration_token=__ret__.cluster_registration_token,
        cluster_v1_id=__ret__.cluster_v1_id,
        default_cluster_role_for_project_members=__ret__.default_cluster_role_for_project_members,
        default_pod_security_policy_template_name=__ret__.default_pod_security_policy_template_name,
        enable_network_policy=__ret__.enable_network_policy,
        fleet_namespace=__ret__.fleet_namespace,
        id=__ret__.id,
        kube_config=__ret__.kube_config,
        kubernetes_version=__ret__.kubernetes_version,
        labels=__ret__.labels,
        name=__ret__.name,
        resource_version=__ret__.resource_version,
        rke_config=__ret__.rke_config)
