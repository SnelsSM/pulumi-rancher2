// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audit log format. Default: 'json' (string)
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// Audit log max age. Default: `30` (int)
        /// </summary>
        [Input("maxAge")]
        public Input<int>? MaxAge { get; set; }

        /// <summary>
        /// Audit log max backup. Default: `10` (int)
        /// </summary>
        [Input("maxBackup")]
        public Input<int>? MaxBackup { get; set; }

        /// <summary>
        /// The EKS node group maximum size. Default `2` (int)
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Audit policy yaml encoded definition. `apiVersion` and `kind: Policy\nrules:"` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/audit-log/) (string) Ex:
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
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs()
        {
        }
        public static new ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs Empty => new ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs();
    }
}
