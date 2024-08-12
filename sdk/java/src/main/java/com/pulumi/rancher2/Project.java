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
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Project;
 * import com.pulumi.rancher2.ProjectArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectContainerResourceLimitArgs;
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
 *         // Create a new rancher2 Project
 *         var foo = new Project("foo", ProjectArgs.builder()
 *             .name("foo")
 *             .clusterId("<CLUSTER_ID>")
 *             .resourceQuota(ProjectResourceQuotaArgs.builder()
 *                 .projectLimit(ProjectResourceQuotaProjectLimitArgs.builder()
 *                     .limitsCpu("2000m")
 *                     .limitsMemory("2000Mi")
 *                     .requestsStorage("2Gi")
 *                     .build())
 *                 .namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs.builder()
 *                     .limitsCpu("2000m")
 *                     .limitsMemory("500Mi")
 *                     .requestsStorage("1Gi")
 *                     .build())
 *                 .build())
 *             .containerResourceLimit(ProjectContainerResourceLimitArgs.builder()
 *                 .limitsCpu("20m")
 *                 .limitsMemory("20Mi")
 *                 .requestsCpu("1m")
 *                 .requestsMemory("1Mi")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Project;
 * import com.pulumi.rancher2.ProjectArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectContainerResourceLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectProjectMonitoringInputArgs;
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
 *         // Create a new rancher2 Project enabling and customizing monitoring
 *         var foo = new Project("foo", ProjectArgs.builder()
 *             .name("foo")
 *             .clusterId("<CLUSTER_ID>")
 *             .resourceQuota(ProjectResourceQuotaArgs.builder()
 *                 .projectLimit(ProjectResourceQuotaProjectLimitArgs.builder()
 *                     .limitsCpu("2000m")
 *                     .limitsMemory("2000Mi")
 *                     .requestsStorage("2Gi")
 *                     .build())
 *                 .namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs.builder()
 *                     .limitsCpu("2000m")
 *                     .limitsMemory("500Mi")
 *                     .requestsStorage("1Gi")
 *                     .build())
 *                 .build())
 *             .containerResourceLimit(ProjectContainerResourceLimitArgs.builder()
 *                 .limitsCpu("20m")
 *                 .limitsMemory("20Mi")
 *                 .requestsCpu("1m")
 *                 .requestsMemory("1Mi")
 *                 .build())
 *             .enableProjectMonitoring(true)
 *             .projectMonitoringInput(ProjectProjectMonitoringInputArgs.builder()
 *                 .answers(Map.ofEntries(
 *                     Map.entry("exporter-kubelets.https", true),
 *                     Map.entry("exporter-node.enabled", true),
 *                     Map.entry("exporter-node.ports.metrics.port", 9796),
 *                     Map.entry("exporter-node.resources.limits.cpu", "200m"),
 *                     Map.entry("exporter-node.resources.limits.memory", "200Mi"),
 *                     Map.entry("grafana.persistence.enabled", false),
 *                     Map.entry("grafana.persistence.size", "10Gi"),
 *                     Map.entry("grafana.persistence.storageClass", "default"),
 *                     Map.entry("operator.resources.limits.memory", "500Mi"),
 *                     Map.entry("prometheus.persistence.enabled", "false"),
 *                     Map.entry("prometheus.persistence.size", "50Gi"),
 *                     Map.entry("prometheus.persistence.storageClass", "default"),
 *                     Map.entry("prometheus.persistent.useReleaseName", "true"),
 *                     Map.entry("prometheus.resources.core.limits.cpu", "1000m"),
 *                     Map.entry("prometheus.resources.core.limits.memory", "1500Mi"),
 *                     Map.entry("prometheus.resources.core.requests.cpu", "750m"),
 *                     Map.entry("prometheus.resources.core.requests.memory", "750Mi"),
 *                     Map.entry("prometheus.retention", "12h")
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Projects can be imported using the Rancher Project ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/project:Project foo &amp;lt;project_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Node Pool object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
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
    @Export(name="clusterId", refs={String.class}, tree="[0]")
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
    @Export(name="containerResourceLimit", refs={ProjectContainerResourceLimit.class}, tree="[0]")
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
    @Export(name="description", refs={String.class}, tree="[0]")
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
    @Export(name="enableProjectMonitoring", refs={Boolean.class}, tree="[0]")
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
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
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
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="podSecurityPolicyTemplateId", refs={String.class}, tree="[0]")
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
    @Export(name="projectMonitoringInput", refs={ProjectProjectMonitoringInput.class}, tree="[0]")
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
    @Export(name="resourceQuota", refs={ProjectResourceQuota.class}, tree="[0]")
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
    @Export(name="waitForCluster", refs={Boolean.class}, tree="[0]")
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
    public Project(java.lang.String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(java.lang.String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(java.lang.String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/project:Project", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Project(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/project:Project", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectArgs makeArgs(ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Project get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
