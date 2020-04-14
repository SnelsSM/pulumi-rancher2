// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class RoleTempalteRuleArgs : Pulumi.ResourceArgs
    {
        [Input("apiGroups")]
        private InputList<string>? _apiGroups;

        /// <summary>
        /// Policy rule api groups (list)
        /// </summary>
        public InputList<string> ApiGroups
        {
            get => _apiGroups ?? (_apiGroups = new InputList<string>());
            set => _apiGroups = value;
        }

        [Input("nonResourceUrls")]
        private InputList<string>? _nonResourceUrls;

        /// <summary>
        /// Policy rule non resource urls (list)
        /// </summary>
        public InputList<string> NonResourceUrls
        {
            get => _nonResourceUrls ?? (_nonResourceUrls = new InputList<string>());
            set => _nonResourceUrls = value;
        }

        [Input("resourceNames")]
        private InputList<string>? _resourceNames;

        /// <summary>
        /// Policy rule resource names (list)
        /// </summary>
        public InputList<string> ResourceNames
        {
            get => _resourceNames ?? (_resourceNames = new InputList<string>());
            set => _resourceNames = value;
        }

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// Policy rule resources (list)
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        [Input("verbs")]
        private InputList<string>? _verbs;

        /// <summary>
        /// Policy rule verbs. `create`, `delete`, `get`, `list`, `patch`, `update`, `watch` and `*` values are supported (list)
        /// </summary>
        public InputList<string> Verbs
        {
            get => _verbs ?? (_verbs = new InputList<string>());
            set => _verbs = value;
        }

        public RoleTempalteRuleArgs()
        {
        }
    }
}
