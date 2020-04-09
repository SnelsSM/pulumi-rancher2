// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static partial class Invokes
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 multi cluster app.
        /// 
        /// 
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/multiClusterApp.html.markdown.
        /// </summary>
        [Obsolete("Use GetMultiClusterApp.InvokeAsync() instead")]
        public static Task<GetMultiClusterAppResult> GetMultiClusterApp(GetMultiClusterAppArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMultiClusterAppResult>("rancher2:index/getMultiClusterApp:getMultiClusterApp", args ?? InvokeArgs.Empty, options.WithVersion());
    }
    public static class GetMultiClusterApp
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 multi cluster app.
        /// 
        /// 
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/multiClusterApp.html.markdown.
        /// </summary>
        public static Task<GetMultiClusterAppResult> InvokeAsync(GetMultiClusterAppArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMultiClusterAppResult>("rancher2:index/getMultiClusterApp:getMultiClusterApp", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetMultiClusterAppArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The multi cluster app name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetMultiClusterAppArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetMultiClusterAppResult
    {
        /// <summary>
        /// (Computed) Annotations for multi cluster app object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) The multi cluster app answers (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMultiClusterAppAnswersResult> Answers;
        /// <summary>
        /// (Computed) The multi cluster app catalog name (string)
        /// </summary>
        public readonly string CatalogName;
        /// <summary>
        /// (Computed) Labels for multi cluster app object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) The multi cluster app members (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMultiClusterAppMembersResult> Members;
        public readonly string Name;
        /// <summary>
        /// (Computed) The multi cluster app revision history limit (int)
        /// </summary>
        public readonly int RevisionHistoryLimit;
        /// <summary>
        /// (Computed) Current revision id for the multi cluster app (string)
        /// </summary>
        public readonly string RevisionId;
        /// <summary>
        /// (Computed) The multi cluster app roles (list)
        /// </summary>
        public readonly ImmutableArray<string> Roles;
        /// <summary>
        /// (Computed) The multi cluster app target projects (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMultiClusterAppTargetsResult> Targets;
        /// <summary>
        /// (Computed) The multi cluster app template name (string)
        /// </summary>
        public readonly string TemplateName;
        /// <summary>
        /// (Computed) The multi cluster app template version (string)
        /// </summary>
        public readonly string TemplateVersion;
        /// <summary>
        /// (Computed) The multi cluster app template version ID (string)
        /// </summary>
        public readonly string TemplateVersionId;
        /// <summary>
        /// (Computed) The multi cluster app upgrade strategy (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMultiClusterAppUpgradeStrategiesResult> UpgradeStrategies;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetMultiClusterAppResult(
            ImmutableDictionary<string, object> annotations,
            ImmutableArray<Outputs.GetMultiClusterAppAnswersResult> answers,
            string catalogName,
            ImmutableDictionary<string, object> labels,
            ImmutableArray<Outputs.GetMultiClusterAppMembersResult> members,
            string name,
            int revisionHistoryLimit,
            string revisionId,
            ImmutableArray<string> roles,
            ImmutableArray<Outputs.GetMultiClusterAppTargetsResult> targets,
            string templateName,
            string templateVersion,
            string templateVersionId,
            ImmutableArray<Outputs.GetMultiClusterAppUpgradeStrategiesResult> upgradeStrategies,
            string id)
        {
            Annotations = annotations;
            Answers = answers;
            CatalogName = catalogName;
            Labels = labels;
            Members = members;
            Name = name;
            RevisionHistoryLimit = revisionHistoryLimit;
            RevisionId = revisionId;
            Roles = roles;
            Targets = targets;
            TemplateName = templateName;
            TemplateVersion = templateVersion;
            TemplateVersionId = templateVersionId;
            UpgradeStrategies = upgradeStrategies;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetMultiClusterAppAnswersResult
    {
        public readonly string ClusterId;
        public readonly string ProjectId;
        public readonly ImmutableDictionary<string, object> Values;

        [OutputConstructor]
        private GetMultiClusterAppAnswersResult(
            string clusterId,
            string projectId,
            ImmutableDictionary<string, object> values)
        {
            ClusterId = clusterId;
            ProjectId = projectId;
            Values = values;
        }
    }

    [OutputType]
    public sealed class GetMultiClusterAppMembersResult
    {
        public readonly string? AccessType;
        public readonly string? GroupPrincipalId;
        public readonly string? UserPrincipalId;

        [OutputConstructor]
        private GetMultiClusterAppMembersResult(
            string? accessType,
            string? groupPrincipalId,
            string? userPrincipalId)
        {
            AccessType = accessType;
            GroupPrincipalId = groupPrincipalId;
            UserPrincipalId = userPrincipalId;
        }
    }

    [OutputType]
    public sealed class GetMultiClusterAppTargetsResult
    {
        public readonly string AppId;
        public readonly string HealthState;
        public readonly string ProjectId;
        public readonly string State;

        [OutputConstructor]
        private GetMultiClusterAppTargetsResult(
            string appId,
            string healthState,
            string projectId,
            string state)
        {
            AppId = appId;
            HealthState = healthState;
            ProjectId = projectId;
            State = state;
        }
    }

    [OutputType]
    public sealed class GetMultiClusterAppUpgradeStrategiesResult
    {
        public readonly GetMultiClusterAppUpgradeStrategiesRollingUpdateResult? RollingUpdate;

        [OutputConstructor]
        private GetMultiClusterAppUpgradeStrategiesResult(GetMultiClusterAppUpgradeStrategiesRollingUpdateResult? rollingUpdate)
        {
            RollingUpdate = rollingUpdate;
        }
    }

    [OutputType]
    public sealed class GetMultiClusterAppUpgradeStrategiesRollingUpdateResult
    {
        public readonly int? BatchSize;
        public readonly int? Interval;

        [OutputConstructor]
        private GetMultiClusterAppUpgradeStrategiesRollingUpdateResult(
            int? batchSize,
            int? interval)
        {
            BatchSize = batchSize;
            Interval = interval;
        }
    }
    }
}
