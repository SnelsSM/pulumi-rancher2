// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration"` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("configuration")]
        public Input<string>? Configuration { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs()
        {
        }
        public static new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs Empty => new ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs();
    }
}
