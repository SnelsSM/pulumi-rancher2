// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetGlobalRole
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role resource.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetGlobalRole.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetGlobalRoleResult> InvokeAsync(GetGlobalRoleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGlobalRoleResult>("rancher2:index/getGlobalRole:getGlobalRole", args ?? new GetGlobalRoleArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role resource.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetGlobalRole.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetGlobalRoleResult> Invoke(GetGlobalRoleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGlobalRoleResult>("rancher2:index/getGlobalRole:getGlobalRole", args ?? new GetGlobalRoleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGlobalRoleArgs : global::Pulumi.InvokeArgs
    {
        [Input("inheritedClusterRoles")]
        private List<string>? _inheritedClusterRoles;

        /// <summary>
        /// (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
        /// </summary>
        public List<string> InheritedClusterRoles
        {
            get => _inheritedClusterRoles ?? (_inheritedClusterRoles = new List<string>());
            set => _inheritedClusterRoles = value;
        }

        /// <summary>
        /// The name of the Global Role (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGlobalRoleArgs()
        {
        }
        public static new GetGlobalRoleArgs Empty => new GetGlobalRoleArgs();
    }

    public sealed class GetGlobalRoleInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("inheritedClusterRoles")]
        private InputList<string>? _inheritedClusterRoles;

        /// <summary>
        /// (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
        /// </summary>
        public InputList<string> InheritedClusterRoles
        {
            get => _inheritedClusterRoles ?? (_inheritedClusterRoles = new InputList<string>());
            set => _inheritedClusterRoles = value;
        }

        /// <summary>
        /// The name of the Global Role (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGlobalRoleInvokeArgs()
        {
        }
        public static new GetGlobalRoleInvokeArgs Empty => new GetGlobalRoleInvokeArgs();
    }


    [OutputType]
    public sealed class GetGlobalRoleResult
    {
        /// <summary>
        /// (Computed) Annotations for global role object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Builtin global role (bool)
        /// </summary>
        public readonly bool Builtin;
        /// <summary>
        /// (Computed) Global role description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional) Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster (list)
        /// </summary>
        public readonly ImmutableArray<string> InheritedClusterRoles;
        /// <summary>
        /// (Computed) Labels for global role object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) Whether or not this role should be added to new users (bool)
        /// </summary>
        public readonly bool NewUserDefault;
        /// <summary>
        /// (Computed) Global role policy rules (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGlobalRoleRuleResult> Rules;

        [OutputConstructor]
        private GetGlobalRoleResult(
            ImmutableDictionary<string, object> annotations,

            bool builtin,

            string description,

            string id,

            ImmutableArray<string> inheritedClusterRoles,

            ImmutableDictionary<string, object> labels,

            string name,

            bool newUserDefault,

            ImmutableArray<Outputs.GetGlobalRoleRuleResult> rules)
        {
            Annotations = annotations;
            Builtin = builtin;
            Description = description;
            Id = id;
            InheritedClusterRoles = inheritedClusterRoles;
            Labels = labels;
            Name = name;
            NewUserDefault = newUserDefault;
            Rules = rules;
        }
    }
}
