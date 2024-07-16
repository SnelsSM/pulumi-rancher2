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
    public sealed class RoleTemplateExternalRule
    {
        /// <summary>
        /// Policy rule api groups
        /// </summary>
        public readonly ImmutableArray<string> ApiGroups;
        /// <summary>
        /// Policy rule non resource urls
        /// </summary>
        public readonly ImmutableArray<string> NonResourceUrls;
        /// <summary>
        /// Policy rule resource names
        /// </summary>
        public readonly ImmutableArray<string> ResourceNames;
        /// <summary>
        /// Policy rule resources
        /// </summary>
        public readonly ImmutableArray<string> Resources;
        /// <summary>
        /// Policy rule verbs
        /// </summary>
        public readonly ImmutableArray<string> Verbs;

        [OutputConstructor]
        private RoleTemplateExternalRule(
            ImmutableArray<string> apiGroups,

            ImmutableArray<string> nonResourceUrls,

            ImmutableArray<string> resourceNames,

            ImmutableArray<string> resources,

            ImmutableArray<string> verbs)
        {
            ApiGroups = apiGroups;
            NonResourceUrls = nonResourceUrls;
            ResourceNames = resourceNames;
            Resources = resources;
            Verbs = verbs;
        }
    }
}
