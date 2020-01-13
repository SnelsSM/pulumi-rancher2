# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

_SNAKE_TO_CAMEL_CASE_TABLE = {
    "access_key": "accessKey",
    "access_mode": "accessMode",
    "actual_url": "actualUrl",
    "aks_config": "aksConfig",
    "allowed_principal_ids": "allowedPrincipalIds",
    "amazonec2_config": "amazonec2Config",
    "amazonec2_credential_config": "amazonec2CredentialConfig",
    "api_url": "apiUrl",
    "application_id": "applicationId",
    "application_secret": "applicationSecret",
    "auth_certificate_authority": "authCertificateAuthority",
    "auth_endpoint": "authEndpoint",
    "auth_key": "authKey",
    "azure_config": "azureConfig",
    "azure_credential_config": "azureCredentialConfig",
    "backup_config": "backupConfig",
    "ca_certs": "caCerts",
    "catalog_name": "catalogName",
    "client_id": "clientId",
    "client_secret": "clientSecret",
    "cloud_credential_id": "cloudCredentialId",
    "cluster_auth_endpoint": "clusterAuthEndpoint",
    "cluster_id": "clusterId",
    "cluster_monitoring_input": "clusterMonitoringInput",
    "cluster_registration_token": "clusterRegistrationToken",
    "cluster_template_answers": "clusterTemplateAnswers",
    "cluster_template_id": "clusterTemplateId",
    "cluster_template_questions": "clusterTemplateQuestions",
    "cluster_template_revision_id": "clusterTemplateRevisionId",
    "connection_timeout": "connectionTimeout",
    "container_resource_limit": "containerResourceLimit",
    "control_plane": "controlPlane",
    "current_password": "currentPassword",
    "default_login_domain": "defaultLoginDomain",
    "default_pod_security_policy_template_id": "defaultPodSecurityPolicyTemplateId",
    "default_project_id": "defaultProjectId",
    "default_revision_id": "defaultRevisionId",
    "default_role": "defaultRole",
    "desired_agent_image": "desiredAgentImage",
    "desired_auth_image": "desiredAuthImage",
    "digitalocean_config": "digitaloceanConfig",
    "digitalocean_credential_config": "digitaloceanCredentialConfig",
    "display_name_field": "displayNameField",
    "docker_root_dir": "dockerRootDir",
    "eks_config": "eksConfig",
    "elasticsearch_config": "elasticsearchConfig",
    "enable_cluster_alerting": "enableClusterAlerting",
    "enable_cluster_istio": "enableClusterIstio",
    "enable_cluster_monitoring": "enableClusterMonitoring",
    "enable_network_policy": "enableNetworkPolicy",
    "enable_project_monitoring": "enableProjectMonitoring",
    "engine_env": "engineEnv",
    "engine_insecure_registries": "engineInsecureRegistries",
    "engine_install_url": "engineInstallUrl",
    "engine_label": "engineLabel",
    "engine_opt": "engineOpt",
    "engine_registry_mirrors": "engineRegistryMirrors",
    "engine_storage_driver": "engineStorageDriver",
    "event_rule": "eventRule",
    "external_id": "externalId",
    "fluentd_config": "fluentdConfig",
    "force_upgrade": "forceUpgrade",
    "gke_config": "gkeConfig",
    "global_role_id": "globalRoleId",
    "graph_endpoint": "graphEndpoint",
    "group_dn_attribute": "groupDnAttribute",
    "group_id": "groupId",
    "group_interval_seconds": "groupIntervalSeconds",
    "group_member_mapping_attribute": "groupMemberMappingAttribute",
    "group_member_user_attribute": "groupMemberUserAttribute",
    "group_name_attribute": "groupNameAttribute",
    "group_object_class": "groupObjectClass",
    "group_principal_id": "groupPrincipalId",
    "group_search_attribute": "groupSearchAttribute",
    "group_search_base": "groupSearchBase",
    "group_search_filter": "groupSearchFilter",
    "group_wait_seconds": "groupWaitSeconds",
    "groups_field": "groupsField",
    "hostname_prefix": "hostnamePrefix",
    "idp_metadata_content": "idpMetadataContent",
    "kafka_config": "kafkaConfig",
    "kube_config": "kubeConfig",
    "metric_rule": "metricRule",
    "namespace_id": "namespaceId",
    "nested_group_membership_enabled": "nestedGroupMembershipEnabled",
    "node_pool_ids": "nodePoolIds",
    "node_rule": "nodeRule",
    "node_template_id": "nodeTemplateId",
    "openstack_config": "openstackConfig",
    "openstack_credential_config": "openstackCredentialConfig",
    "output_flush_interval": "outputFlushInterval",
    "output_tags": "outputTags",
    "pagerduty_config": "pagerdutyConfig",
    "pod_rule": "podRule",
    "pod_security_policy_template_id": "podSecurityPolicyTemplateId",
    "principal_ids": "principalIds",
    "project_id": "projectId",
    "project_monitoring_input": "projectMonitoringInput",
    "rancher_api_host": "rancherApiHost",
    "rancher_url": "rancherUrl",
    "repeat_interval_seconds": "repeatIntervalSeconds",
    "resource_quota": "resourceQuota",
    "revision_history_limit": "revisionHistoryLimit",
    "revision_id": "revisionId",
    "rke_config": "rkeConfig",
    "role_template_id": "roleTemplateId",
    "role_template_ids": "roleTemplateIds",
    "secret_key": "secretKey",
    "service_account_distinguished_name": "serviceAccountDistinguishedName",
    "service_account_password": "serviceAccountPassword",
    "service_account_username": "serviceAccountUsername",
    "slack_config": "slackConfig",
    "smtp_config": "smtpConfig",
    "sp_cert": "spCert",
    "sp_key": "spKey",
    "splunk_config": "splunkConfig",
    "syslog_config": "syslogConfig",
    "system_project_id": "systemProjectId",
    "system_service_rule": "systemServiceRule",
    "target_namespace": "targetNamespace",
    "temp_token": "tempToken",
    "temp_token_id": "tempTokenId",
    "template_name": "templateName",
    "template_revisions": "templateRevisions",
    "template_version": "templateVersion",
    "template_version_id": "templateVersionId",
    "tenant_id": "tenantId",
    "token_endpoint": "tokenEndpoint",
    "token_id": "tokenId",
    "token_key": "tokenKey",
    "token_ttl": "tokenTtl",
    "token_update": "tokenUpdate",
    "ui_url": "uiUrl",
    "uid_field": "uidField",
    "upgrade_strategy": "upgradeStrategy",
    "use_internal_ip_address": "useInternalIpAddress",
    "user_disabled_bit_mask": "userDisabledBitMask",
    "user_enabled_attribute": "userEnabledAttribute",
    "user_id": "userId",
    "user_login_attribute": "userLoginAttribute",
    "user_member_attribute": "userMemberAttribute",
    "user_name_attribute": "userNameAttribute",
    "user_name_field": "userNameField",
    "user_object_class": "userObjectClass",
    "user_principal_id": "userPrincipalId",
    "user_search_attribute": "userSearchAttribute",
    "user_search_base": "userSearchBase",
    "user_search_filter": "userSearchFilter",
    "values_yaml": "valuesYaml",
    "vsphere_config": "vsphereConfig",
    "vsphere_credential_config": "vsphereCredentialConfig",
    "wait_for_cluster": "waitForCluster",
    "webhook_config": "webhookConfig",
    "wechat_config": "wechatConfig",
    "whitelist_domains": "whitelistDomains",
    "workload_rule": "workloadRule",
}

_CAMEL_TO_SNAKE_CASE_TABLE = {
    "accessKey": "access_key",
    "accessMode": "access_mode",
    "actualUrl": "actual_url",
    "aksConfig": "aks_config",
    "allowedPrincipalIds": "allowed_principal_ids",
    "amazonec2Config": "amazonec2_config",
    "amazonec2CredentialConfig": "amazonec2_credential_config",
    "apiUrl": "api_url",
    "applicationId": "application_id",
    "applicationSecret": "application_secret",
    "authCertificateAuthority": "auth_certificate_authority",
    "authEndpoint": "auth_endpoint",
    "authKey": "auth_key",
    "azureConfig": "azure_config",
    "azureCredentialConfig": "azure_credential_config",
    "backupConfig": "backup_config",
    "caCerts": "ca_certs",
    "catalogName": "catalog_name",
    "clientId": "client_id",
    "clientSecret": "client_secret",
    "cloudCredentialId": "cloud_credential_id",
    "clusterAuthEndpoint": "cluster_auth_endpoint",
    "clusterId": "cluster_id",
    "clusterMonitoringInput": "cluster_monitoring_input",
    "clusterRegistrationToken": "cluster_registration_token",
    "clusterTemplateAnswers": "cluster_template_answers",
    "clusterTemplateId": "cluster_template_id",
    "clusterTemplateQuestions": "cluster_template_questions",
    "clusterTemplateRevisionId": "cluster_template_revision_id",
    "connectionTimeout": "connection_timeout",
    "containerResourceLimit": "container_resource_limit",
    "controlPlane": "control_plane",
    "currentPassword": "current_password",
    "defaultLoginDomain": "default_login_domain",
    "defaultPodSecurityPolicyTemplateId": "default_pod_security_policy_template_id",
    "defaultProjectId": "default_project_id",
    "defaultRevisionId": "default_revision_id",
    "defaultRole": "default_role",
    "desiredAgentImage": "desired_agent_image",
    "desiredAuthImage": "desired_auth_image",
    "digitaloceanConfig": "digitalocean_config",
    "digitaloceanCredentialConfig": "digitalocean_credential_config",
    "displayNameField": "display_name_field",
    "dockerRootDir": "docker_root_dir",
    "eksConfig": "eks_config",
    "elasticsearchConfig": "elasticsearch_config",
    "enableClusterAlerting": "enable_cluster_alerting",
    "enableClusterIstio": "enable_cluster_istio",
    "enableClusterMonitoring": "enable_cluster_monitoring",
    "enableNetworkPolicy": "enable_network_policy",
    "enableProjectMonitoring": "enable_project_monitoring",
    "engineEnv": "engine_env",
    "engineInsecureRegistries": "engine_insecure_registries",
    "engineInstallUrl": "engine_install_url",
    "engineLabel": "engine_label",
    "engineOpt": "engine_opt",
    "engineRegistryMirrors": "engine_registry_mirrors",
    "engineStorageDriver": "engine_storage_driver",
    "eventRule": "event_rule",
    "externalId": "external_id",
    "fluentdConfig": "fluentd_config",
    "forceUpgrade": "force_upgrade",
    "gkeConfig": "gke_config",
    "globalRoleId": "global_role_id",
    "graphEndpoint": "graph_endpoint",
    "groupDnAttribute": "group_dn_attribute",
    "groupId": "group_id",
    "groupIntervalSeconds": "group_interval_seconds",
    "groupMemberMappingAttribute": "group_member_mapping_attribute",
    "groupMemberUserAttribute": "group_member_user_attribute",
    "groupNameAttribute": "group_name_attribute",
    "groupObjectClass": "group_object_class",
    "groupPrincipalId": "group_principal_id",
    "groupSearchAttribute": "group_search_attribute",
    "groupSearchBase": "group_search_base",
    "groupSearchFilter": "group_search_filter",
    "groupWaitSeconds": "group_wait_seconds",
    "groupsField": "groups_field",
    "hostnamePrefix": "hostname_prefix",
    "idpMetadataContent": "idp_metadata_content",
    "kafkaConfig": "kafka_config",
    "kubeConfig": "kube_config",
    "metricRule": "metric_rule",
    "namespaceId": "namespace_id",
    "nestedGroupMembershipEnabled": "nested_group_membership_enabled",
    "nodePoolIds": "node_pool_ids",
    "nodeRule": "node_rule",
    "nodeTemplateId": "node_template_id",
    "openstackConfig": "openstack_config",
    "openstackCredentialConfig": "openstack_credential_config",
    "outputFlushInterval": "output_flush_interval",
    "outputTags": "output_tags",
    "pagerdutyConfig": "pagerduty_config",
    "podRule": "pod_rule",
    "podSecurityPolicyTemplateId": "pod_security_policy_template_id",
    "principalIds": "principal_ids",
    "projectId": "project_id",
    "projectMonitoringInput": "project_monitoring_input",
    "rancherApiHost": "rancher_api_host",
    "rancherUrl": "rancher_url",
    "repeatIntervalSeconds": "repeat_interval_seconds",
    "resourceQuota": "resource_quota",
    "revisionHistoryLimit": "revision_history_limit",
    "revisionId": "revision_id",
    "rkeConfig": "rke_config",
    "roleTemplateId": "role_template_id",
    "roleTemplateIds": "role_template_ids",
    "secretKey": "secret_key",
    "serviceAccountDistinguishedName": "service_account_distinguished_name",
    "serviceAccountPassword": "service_account_password",
    "serviceAccountUsername": "service_account_username",
    "slackConfig": "slack_config",
    "smtpConfig": "smtp_config",
    "spCert": "sp_cert",
    "spKey": "sp_key",
    "splunkConfig": "splunk_config",
    "syslogConfig": "syslog_config",
    "systemProjectId": "system_project_id",
    "systemServiceRule": "system_service_rule",
    "targetNamespace": "target_namespace",
    "tempToken": "temp_token",
    "tempTokenId": "temp_token_id",
    "templateName": "template_name",
    "templateRevisions": "template_revisions",
    "templateVersion": "template_version",
    "templateVersionId": "template_version_id",
    "tenantId": "tenant_id",
    "tokenEndpoint": "token_endpoint",
    "tokenId": "token_id",
    "tokenKey": "token_key",
    "tokenTtl": "token_ttl",
    "tokenUpdate": "token_update",
    "uiUrl": "ui_url",
    "uidField": "uid_field",
    "upgradeStrategy": "upgrade_strategy",
    "useInternalIpAddress": "use_internal_ip_address",
    "userDisabledBitMask": "user_disabled_bit_mask",
    "userEnabledAttribute": "user_enabled_attribute",
    "userId": "user_id",
    "userLoginAttribute": "user_login_attribute",
    "userMemberAttribute": "user_member_attribute",
    "userNameAttribute": "user_name_attribute",
    "userNameField": "user_name_field",
    "userObjectClass": "user_object_class",
    "userPrincipalId": "user_principal_id",
    "userSearchAttribute": "user_search_attribute",
    "userSearchBase": "user_search_base",
    "userSearchFilter": "user_search_filter",
    "valuesYaml": "values_yaml",
    "vsphereConfig": "vsphere_config",
    "vsphereCredentialConfig": "vsphere_credential_config",
    "waitForCluster": "wait_for_cluster",
    "webhookConfig": "webhook_config",
    "wechatConfig": "wechat_config",
    "whitelistDomains": "whitelist_domains",
    "workloadRule": "workload_rule",
}
