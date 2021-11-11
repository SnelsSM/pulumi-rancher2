// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Rancher2
{
    public static class GetGlobalRole
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetGlobalRole.InvokeAsync(new Rancher2.GetGlobalRoleArgs
        ///         {
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGlobalRoleResult> InvokeAsync(GetGlobalRoleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGlobalRoleResult>("rancher2:index/getGlobalRole:getGlobalRole", args ?? new GetGlobalRoleArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetGlobalRole.InvokeAsync(new Rancher2.GetGlobalRoleArgs
        ///         {
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGlobalRoleResult> Invoke(GetGlobalRoleInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetGlobalRoleResult>("rancher2:index/getGlobalRole:getGlobalRole", args ?? new GetGlobalRoleInvokeArgs(), options.WithVersion());
    }


    public sealed class GetGlobalRoleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Global Role (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGlobalRoleArgs()
        {
        }
    }

    public sealed class GetGlobalRoleInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Global Role (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGlobalRoleInvokeArgs()
        {
        }
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

            ImmutableDictionary<string, object> labels,

            string name,

            bool newUserDefault,

            ImmutableArray<Outputs.GetGlobalRoleRuleResult> rules)
        {
            Annotations = annotations;
            Builtin = builtin;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            NewUserDefault = newUserDefault;
            Rules = rules;
        }
    }
}
