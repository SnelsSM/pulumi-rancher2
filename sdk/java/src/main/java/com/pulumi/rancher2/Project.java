// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ProjectArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ProjectState;
import com.pulumi.rancher2.outputs.ProjectContainerResourceLimit;
import com.pulumi.rancher2.outputs.ProjectProjectMonitoringInput;
import com.pulumi.rancher2.outputs.ProjectResourceQuota;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Project;
 * import com.pulumi.rancher2.ProjectArgs;
 * import com.pulumi.rancher2.inputs.ProjectContainerResourceLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new Project(&#34;foo&#34;, ProjectArgs.builder()        
 *             .clusterId(&#34;&lt;CLUSTER_ID&gt;&#34;)
 *             .containerResourceLimit(ProjectContainerResourceLimitArgs.builder()
 *                 .limitsCpu(&#34;20m&#34;)
 *                 .limitsMemory(&#34;20Mi&#34;)
 *                 .requestsCpu(&#34;1m&#34;)
 *                 .requestsMemory(&#34;1Mi&#34;)
 *                 .build())
 *             .resourceQuota(ProjectResourceQuotaArgs.builder()
 *                 .namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs.builder()
 *                     .limitsCpu(&#34;2000m&#34;)
 *                     .limitsMemory(&#34;500Mi&#34;)
 *                     .requestsStorage(&#34;1Gi&#34;)
 *                     .build())
 *                 .projectLimit(ProjectResourceQuotaProjectLimitArgs.builder()
 *                     .limitsCpu(&#34;2000m&#34;)
 *                     .limitsMemory(&#34;2000Mi&#34;)
 *                     .requestsStorage(&#34;2Gi&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Project;
 * import com.pulumi.rancher2.ProjectArgs;
 * import com.pulumi.rancher2.inputs.ProjectContainerResourceLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectProjectMonitoringInputArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new Project(&#34;foo&#34;, ProjectArgs.builder()        
 *             .clusterId(&#34;&lt;CLUSTER_ID&gt;&#34;)
 *             .containerResourceLimit(ProjectContainerResourceLimitArgs.builder()
 *                 .limitsCpu(&#34;20m&#34;)
 *                 .limitsMemory(&#34;20Mi&#34;)
 *                 .requestsCpu(&#34;1m&#34;)
 *                 .requestsMemory(&#34;1Mi&#34;)
 *                 .build())
 *             .enableProjectMonitoring(true)
 *             .projectMonitoringInput(ProjectProjectMonitoringInputArgs.builder()
 *                 .answers(Map.ofEntries(
 *                     Map.entry(&#34;exporter-kubelets.https&#34;, true),
 *                     Map.entry(&#34;exporter-node.enabled&#34;, true),
 *                     Map.entry(&#34;exporter-node.ports.metrics.port&#34;, 9796),
 *                     Map.entry(&#34;exporter-node.resources.limits.cpu&#34;, &#34;200m&#34;),
 *                     Map.entry(&#34;exporter-node.resources.limits.memory&#34;, &#34;200Mi&#34;),
 *                     Map.entry(&#34;grafana.persistence.enabled&#34;, false),
 *                     Map.entry(&#34;grafana.persistence.size&#34;, &#34;10Gi&#34;),
 *                     Map.entry(&#34;grafana.persistence.storageClass&#34;, &#34;default&#34;),
 *                     Map.entry(&#34;operator.resources.limits.memory&#34;, &#34;500Mi&#34;),
 *                     Map.entry(&#34;prometheus.persistence.enabled&#34;, &#34;false&#34;),
 *                     Map.entry(&#34;prometheus.persistence.size&#34;, &#34;50Gi&#34;),
 *                     Map.entry(&#34;prometheus.persistence.storageClass&#34;, &#34;default&#34;),
 *                     Map.entry(&#34;prometheus.persistent.useReleaseName&#34;, &#34;true&#34;),
 *                     Map.entry(&#34;prometheus.resources.core.limits.cpu&#34;, &#34;1000m&#34;),
 *                     Map.entry(&#34;prometheus.resources.core.limits.memory&#34;, &#34;1500Mi&#34;),
 *                     Map.entry(&#34;prometheus.resources.core.requests.cpu&#34;, &#34;750m&#34;),
 *                     Map.entry(&#34;prometheus.resources.core.requests.memory&#34;, &#34;750Mi&#34;),
 *                     Map.entry(&#34;prometheus.retention&#34;, &#34;12h&#34;)
 *                 ))
 *                 .build())
 *             .resourceQuota(ProjectResourceQuotaArgs.builder()
 *                 .namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs.builder()
 *                     .limitsCpu(&#34;2000m&#34;)
 *                     .limitsMemory(&#34;500Mi&#34;)
 *                     .requestsStorage(&#34;1Gi&#34;)
 *                     .build())
 *                 .projectLimit(ProjectResourceQuotaProjectLimitArgs.builder()
 *                     .limitsCpu(&#34;2000m&#34;)
 *                     .limitsMemory(&#34;2000Mi&#34;)
 *                     .requestsStorage(&#34;2Gi&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Projects can be imported using the Rancher Project ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/project:Project foo &amp;lt;project_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Node Pool object (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where create project (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster id where create project (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Default containers resource limits on project (List maxitem:1)
     * 
     */
    @Export(name="containerResourceLimit", type=ProjectContainerResourceLimit.class, parameters={})
    private Output</* @Nullable */ ProjectContainerResourceLimit> containerResourceLimit;

    /**
     * @return Default containers resource limits on project (List maxitem:1)
     * 
     */
    public Output<Optional<ProjectContainerResourceLimit>> containerResourceLimit() {
        return Codegen.optional(this.containerResourceLimit);
    }
    /**
     * A project description (string)
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A project description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable built-in project monitoring. Default `false` (bool)
     * 
     */
    @Export(name="enableProjectMonitoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableProjectMonitoring;

    /**
     * @return Enable built-in project monitoring. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> enableProjectMonitoring() {
        return Codegen.optional(this.enableProjectMonitoring);
    }
    /**
     * Labels for Node Pool object (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the project (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the project (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Default Pod Security Policy ID for the project (string)
     * 
     */
    @Export(name="podSecurityPolicyTemplateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> podSecurityPolicyTemplateId;

    /**
     * @return Default Pod Security Policy ID for the project (string)
     * 
     */
    public Output<Optional<String>> podSecurityPolicyTemplateId() {
        return Codegen.optional(this.podSecurityPolicyTemplateId);
    }
    /**
     * Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
     * 
     */
    @Export(name="projectMonitoringInput", type=ProjectProjectMonitoringInput.class, parameters={})
    private Output</* @Nullable */ ProjectProjectMonitoringInput> projectMonitoringInput;

    /**
     * @return Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
     * 
     */
    public Output<Optional<ProjectProjectMonitoringInput>> projectMonitoringInput() {
        return Codegen.optional(this.projectMonitoringInput);
    }
    /**
     * Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    @Export(name="resourceQuota", type=ProjectResourceQuota.class, parameters={})
    private Output</* @Nullable */ ProjectResourceQuota> resourceQuota;

    /**
     * @return Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    public Output<Optional<ProjectResourceQuota>> resourceQuota() {
        return Codegen.optional(this.resourceQuota);
    }
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     * 
     */
    @Export(name="waitForCluster", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForCluster;

    /**
     * @return Wait for cluster becomes active. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> waitForCluster() {
        return Codegen.optional(this.waitForCluster);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/project:Project", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
