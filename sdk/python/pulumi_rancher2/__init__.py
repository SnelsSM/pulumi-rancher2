# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .active_directory import *
from .app import *
from .app_v2 import *
from .auth_config_active_directory import *
from .auth_config_adfs import *
from .auth_config_azure_ad import *
from .auth_config_free_ipa import *
from .auth_config_github import *
from .auth_config_keycloak import *
from .auth_config_okta import *
from .auth_config_open_ldap import *
from .auth_config_ping import *
from .bootstrap import *
from .catalog import *
from .catalog_v2 import *
from .certificate import *
from .cloud_credential import *
from .cluster import *
from .cluster_alert_group import *
from .cluster_alert_rule import *
from .cluster_alter_group import *
from .cluster_alter_rule import *
from .cluster_driver import *
from .cluster_logging import *
from .cluster_role_template_binding import *
from .cluster_sync import *
from .cluster_template import *
from .cluster_v2 import *
from .config_map_v2 import *
from .etcd_backup import *
from .feature import *
from .get_app import *
from .get_catalog import *
from .get_catalog_v2 import *
from .get_certificate import *
from .get_cloud_credential import *
from .get_cluster import *
from .get_cluster_alert_group import *
from .get_cluster_alter_rule import *
from .get_cluster_driver import *
from .get_cluster_logging import *
from .get_cluster_role_template_binding import *
from .get_cluster_scan import *
from .get_cluster_template import *
from .get_cluster_v2 import *
from .get_config_map_v2 import *
from .get_etcd_backup import *
from .get_global_dns_provider import *
from .get_global_role import *
from .get_global_role_binding import *
from .get_multi_cluster_app import *
from .get_namespace import *
from .get_node_driver import *
from .get_node_pool import *
from .get_node_template import *
from .get_notifier import *
from .get_pod_security_policy_template import *
from .get_principal import *
from .get_project import *
from .get_project_alert_group import *
from .get_project_alert_rule import *
from .get_project_logging import *
from .get_project_role_template_binding import *
from .get_registry import *
from .get_role_tempalte import *
from .get_role_template import *
from .get_secret import *
from .get_secret_v2 import *
from .get_setting import *
from .get_storage_class_v2 import *
from .get_user import *
from .global_dns import *
from .global_dns_provider import *
from .global_role import *
from .global_role_binding import *
from .machine_config_v2 import *
from .multi_cluster_app import *
from .namespace import *
from .node_driver import *
from .node_pool import *
from .node_template import *
from .notifier import *
from .pod_security_policy_template import *
from .project import *
from .project_alert_group import *
from .project_alert_rule import *
from .project_logging import *
from .project_role_template_binding import *
from .provider import *
from .registry import *
from .role_tempalte import *
from .role_template import *
from .secret import *
from .secret_v2 import *
from .setting import *
from .storage_class_v2 import *
from .token import *
from .user import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_rancher2.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_rancher2.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "rancher2",
  "mod": "index/activeDirectory",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/activeDirectory:ActiveDirectory": "ActiveDirectory"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/app",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/app:App": "App"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/appV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/appV2:AppV2": "AppV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigActiveDirectory",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory": "AuthConfigActiveDirectory"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigAdfs",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigAdfs:AuthConfigAdfs": "AuthConfigAdfs"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigAzureAd",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigAzureAd:AuthConfigAzureAd": "AuthConfigAzureAd"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigFreeIpa",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa": "AuthConfigFreeIpa"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigGithub",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigGithub:AuthConfigGithub": "AuthConfigGithub"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigKeycloak",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigKeycloak:AuthConfigKeycloak": "AuthConfigKeycloak"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigOkta",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigOkta:AuthConfigOkta": "AuthConfigOkta"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigOpenLdap",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigOpenLdap:AuthConfigOpenLdap": "AuthConfigOpenLdap"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/authConfigPing",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/authConfigPing:AuthConfigPing": "AuthConfigPing"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/bootstrap",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/bootstrap:Bootstrap": "Bootstrap"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/catalog",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/catalog:Catalog": "Catalog"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/catalogV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/catalogV2:CatalogV2": "CatalogV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/certificate",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/certificate:Certificate": "Certificate"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/cloudCredential",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/cloudCredential:CloudCredential": "CloudCredential"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/cluster",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/cluster:Cluster": "Cluster"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterAlertGroup",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterAlertGroup:ClusterAlertGroup": "ClusterAlertGroup"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterAlertRule",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterAlertRule:ClusterAlertRule": "ClusterAlertRule"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterAlterGroup",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterAlterGroup:ClusterAlterGroup": "ClusterAlterGroup"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterAlterRule",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterAlterRule:ClusterAlterRule": "ClusterAlterRule"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterDriver",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterDriver:ClusterDriver": "ClusterDriver"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterLogging",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterLogging:ClusterLogging": "ClusterLogging"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterRoleTemplateBinding",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding": "ClusterRoleTemplateBinding"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterSync",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterSync:ClusterSync": "ClusterSync"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterTemplate",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterTemplate:ClusterTemplate": "ClusterTemplate"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/clusterV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/clusterV2:ClusterV2": "ClusterV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/configMapV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/configMapV2:ConfigMapV2": "ConfigMapV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/etcdBackup",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/etcdBackup:EtcdBackup": "EtcdBackup"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/feature",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/feature:Feature": "Feature"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/globalDns",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/globalDns:GlobalDns": "GlobalDns"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/globalDnsProvider",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/globalDnsProvider:GlobalDnsProvider": "GlobalDnsProvider"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/globalRole",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/globalRole:GlobalRole": "GlobalRole"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/globalRoleBinding",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/globalRoleBinding:GlobalRoleBinding": "GlobalRoleBinding"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/machineConfigV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/machineConfigV2:MachineConfigV2": "MachineConfigV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/multiClusterApp",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/multiClusterApp:MultiClusterApp": "MultiClusterApp"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/namespace",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/namespace:Namespace": "Namespace"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/nodeDriver",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/nodeDriver:NodeDriver": "NodeDriver"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/nodePool",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/nodePool:NodePool": "NodePool"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/nodeTemplate",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/nodeTemplate:NodeTemplate": "NodeTemplate"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/notifier",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/notifier:Notifier": "Notifier"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/podSecurityPolicyTemplate",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate": "PodSecurityPolicyTemplate"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/project",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/project:Project": "Project"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/projectAlertGroup",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/projectAlertGroup:ProjectAlertGroup": "ProjectAlertGroup"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/projectAlertRule",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/projectAlertRule:ProjectAlertRule": "ProjectAlertRule"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/projectLogging",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/projectLogging:ProjectLogging": "ProjectLogging"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/projectRoleTemplateBinding",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding": "ProjectRoleTemplateBinding"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/registry",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/registry:Registry": "Registry"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/roleTempalte",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/roleTempalte:RoleTempalte": "RoleTempalte"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/roleTemplate",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/roleTemplate:RoleTemplate": "RoleTemplate"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/secret",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/secret:Secret": "Secret"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/secretV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/secretV2:SecretV2": "SecretV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/setting",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/setting:Setting": "Setting"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/storageClassV2",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/storageClassV2:StorageClassV2": "StorageClassV2"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/token",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/token:Token": "Token"
  }
 },
 {
  "pkg": "rancher2",
  "mod": "index/user",
  "fqn": "pulumi_rancher2",
  "classes": {
   "rancher2:index/user:User": "User"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "rancher2",
  "token": "pulumi:providers:rancher2",
  "fqn": "pulumi_rancher2",
  "class": "Provider"
 }
]
"""
)
