// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetPrincipal
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Principal resource.
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
        ///         var foo = Output.Create(Rancher2.GetPrincipal.InvokeAsync(new Rancher2.GetPrincipalArgs
        ///         {
        ///             Name = "user@example.com",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrincipalResult> InvokeAsync(GetPrincipalArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPrincipalResult>("rancher2:index/getPrincipal:getPrincipal", args ?? new GetPrincipalArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Principal resource.
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
        ///         var foo = Output.Create(Rancher2.GetPrincipal.InvokeAsync(new Rancher2.GetPrincipalArgs
        ///         {
        ///             Name = "user@example.com",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrincipalResult> Invoke(GetPrincipalInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetPrincipalResult>("rancher2:index/getPrincipal:getPrincipal", args ?? new GetPrincipalInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrincipalArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The full name of the principal (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The type of the identity (string). Defaults to `user`. Only `user` and `group` values are supported (string)
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetPrincipalArgs()
        {
        }
    }

    public sealed class GetPrincipalInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The full name of the principal (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of the identity (string). Defaults to `user`. Only `user` and `group` values are supported (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetPrincipalInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPrincipalResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string? Type;

        [OutputConstructor]
        private GetPrincipalResult(
            string id,

            string name,

            string? type)
        {
            Id = id;
            Name = name;
            Type = type;
        }
    }
}
