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
    public sealed class GetPodSecurityPolicyTemplateAllowedHostPathResult
    {
        /// <summary>
        /// pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
        /// </summary>
        public readonly string PathPrefix;
        /// <summary>
        /// when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
        /// </summary>
        public readonly bool? ReadOnly;

        [OutputConstructor]
        private GetPodSecurityPolicyTemplateAllowedHostPathResult(
            string pathPrefix,

            bool? readOnly)
        {
            PathPrefix = pathPrefix;
            ReadOnly = readOnly;
        }
    }
}
