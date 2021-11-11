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
    public static class GetGlobalRoleBinding
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role binding.
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
        ///         var foo = Output.Create(Rancher2.GetGlobalRoleBinding.InvokeAsync(new Rancher2.GetGlobalRoleBindingArgs
        ///         {
        ///             GlobalRoleId = "foo_id",
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGlobalRoleBindingResult> InvokeAsync(GetGlobalRoleBindingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGlobalRoleBindingResult>("rancher2:index/getGlobalRoleBinding:getGlobalRoleBinding", args ?? new GetGlobalRoleBindingArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 global role binding.
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
        ///         var foo = Output.Create(Rancher2.GetGlobalRoleBinding.InvokeAsync(new Rancher2.GetGlobalRoleBindingArgs
        ///         {
        ///             GlobalRoleId = "foo_id",
        ///             Name = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGlobalRoleBindingResult> Invoke(GetGlobalRoleBindingInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetGlobalRoleBindingResult>("rancher2:index/getGlobalRoleBinding:getGlobalRoleBinding", args ?? new GetGlobalRoleBindingInvokeArgs(), options.WithVersion());
    }


    public sealed class GetGlobalRoleBindingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The global role id (string)
        /// </summary>
        [Input("globalRoleId")]
        public string? GlobalRoleId { get; set; }

        /// <summary>
        /// The name of the global role binding (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGlobalRoleBindingArgs()
        {
        }
    }

    public sealed class GetGlobalRoleBindingInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The global role id (string)
        /// </summary>
        [Input("globalRoleId")]
        public Input<string>? GlobalRoleId { get; set; }

        /// <summary>
        /// The name of the global role binding (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGlobalRoleBindingInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGlobalRoleBindingResult
    {
        /// <summary>
        /// (Computed) Annotations of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string GlobalRoleId;
        /// <summary>
        /// (Computed) The group principal ID to assign global role binding. Rancher v2.4.0 or higher is required (string)
        /// </summary>
        public readonly string GroupPrincipalId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) The user ID to assign global role binding (string)
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetGlobalRoleBindingResult(
            ImmutableDictionary<string, object> annotations,

            string globalRoleId,

            string groupPrincipalId,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            string userId)
        {
            Annotations = annotations;
            GlobalRoleId = globalRoleId;
            GroupPrincipalId = groupPrincipalId;
            Id = id;
            Labels = labels;
            Name = name;
            UserId = userId;
        }
    }
}
