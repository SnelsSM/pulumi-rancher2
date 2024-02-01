// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiResult
    {
        /// <summary>
        /// Cluster admission configuration
        /// </summary>
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationResult? AdmissionConfiguration;
        public readonly bool? AlwaysPullImages;
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogResult? AuditLog;
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitResult? EventRateLimit;
        public readonly ImmutableDictionary<string, object> ExtraArgs;
        public readonly ImmutableArray<string> ExtraBinds;
        public readonly ImmutableArray<string> ExtraEnvs;
        public readonly string Image;
        public readonly bool? PodSecurityPolicy;
        public readonly Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigResult? SecretsEncryptionConfig;
        public readonly string ServiceClusterIpRange;
        public readonly string ServiceNodePortRange;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiResult(
            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationResult? admissionConfiguration,

            bool? alwaysPullImages,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogResult? auditLog,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitResult? eventRateLimit,

            ImmutableDictionary<string, object> extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            string image,

            bool? podSecurityPolicy,

            Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigResult? secretsEncryptionConfig,

            string serviceClusterIpRange,

            string serviceNodePortRange)
        {
            AdmissionConfiguration = admissionConfiguration;
            AlwaysPullImages = alwaysPullImages;
            AuditLog = auditLog;
            EventRateLimit = eventRateLimit;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Image = image;
            PodSecurityPolicy = podSecurityPolicy;
            SecretsEncryptionConfig = secretsEncryptionConfig;
            ServiceClusterIpRange = serviceClusterIpRange;
            ServiceNodePortRange = serviceNodePortRange;
        }
    }
}
