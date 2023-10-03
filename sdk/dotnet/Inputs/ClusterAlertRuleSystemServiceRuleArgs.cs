// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlertRuleSystemServiceRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// System service rule condition. Supported values : `"controller-manager" | "etcd" | "scheduler"`. Default: `scheduler` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        public ClusterAlertRuleSystemServiceRuleArgs()
        {
        }
        public static new ClusterAlertRuleSystemServiceRuleArgs Empty => new ClusterAlertRuleSystemServiceRuleArgs();
    }
}
