// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetUser
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 user
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetUser.Invoke(new()
        ///     {
        ///         Username = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("rancher2:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 user
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Rancher2.GetUser.Invoke(new()
        ///     {
        ///         Username = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("rancher2:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set is the user if the user is external. Default: `false` (bool)
        /// </summary>
        [Input("isExternal")]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// The name of the user (string)
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The username of the user (string)
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Set is the user if the user is external. Default: `false` (bool)
        /// </summary>
        [Input("isExternal")]
        public Input<bool>? IsExternal { get; set; }

        /// <summary>
        /// The name of the user (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The username of the user (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// (Computed) Annotations of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        /// <summary>
        /// (Computed) The user is enabled (bool)
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IsExternal;
        /// <summary>
        /// (Computed) Labels of the resource (map)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// (Computed) The user common name (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Computed) The user principal IDs (list)
        /// </summary>
        public readonly ImmutableArray<string> PrincipalIds;
        public readonly string Username;

        [OutputConstructor]
        private GetUserResult(
            ImmutableDictionary<string, string> annotations,

            bool enabled,

            string id,

            bool? isExternal,

            ImmutableDictionary<string, string> labels,

            string name,

            ImmutableArray<string> principalIds,

            string username)
        {
            Annotations = annotations;
            Enabled = enabled;
            Id = id;
            IsExternal = isExternal;
            Labels = labels;
            Name = name;
            PrincipalIds = principalIds;
            Username = username;
        }
    }
}
