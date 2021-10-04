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
    public sealed class ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig
    {
        /// <summary>
        /// Secrets encryption yaml encoded custom configuration. `"apiVersion"` and `"kind":"EncryptionConfiguration"` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string) Ex:
        /// </summary>
        public readonly string? CustomConfig;
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig(
            string? customConfig,

            bool? enabled)
        {
            CustomConfig = customConfig;
            Enabled = enabled;
        }
    }
}
