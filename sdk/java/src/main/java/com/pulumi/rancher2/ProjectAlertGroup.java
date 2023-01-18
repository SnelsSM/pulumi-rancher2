// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ProjectAlertGroupArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ProjectAlertGroupState;
import com.pulumi.rancher2.outputs.ProjectAlertGroupRecipient;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Project Alert Group resource. This can be used to create Project Alert Group for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.ProjectAlertGroup;
 * import com.pulumi.rancher2.ProjectAlertGroupArgs;
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
 *         var foo = new ProjectAlertGroup(&#34;foo&#34;, ProjectAlertGroupArgs.builder()        
 *             .description(&#34;Terraform project alert group&#34;)
 *             .groupIntervalSeconds(300)
 *             .projectId(&#34;&lt;project_id&gt;&#34;)
 *             .repeatIntervalSeconds(3600)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Project Alert Group can be imported using the Rancher project alert group ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/projectAlertGroup:ProjectAlertGroup foo &amp;lt;project_alert_group_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/projectAlertGroup:ProjectAlertGroup")
public class ProjectAlertGroup extends com.pulumi.resources.CustomResource {
    /**
     * The project alert group annotations (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return The project alert group annotations (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The project alert group description (string)
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The project alert group description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The project alert group interval seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupIntervalSeconds;

    /**
     * @return The project alert group interval seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupIntervalSeconds() {
        return Codegen.optional(this.groupIntervalSeconds);
    }
    /**
     * The project alert group wait seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupWaitSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupWaitSeconds;

    /**
     * @return The project alert group wait seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupWaitSeconds() {
        return Codegen.optional(this.groupWaitSeconds);
    }
    /**
     * The project alert group labels (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return The project alert group labels (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The project alert group name (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The project alert group name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project id where create project alert group (string)
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The project id where create project alert group (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The project alert group recipients (list)
     * 
     */
    @Export(name="recipients", type=List.class, parameters={ProjectAlertGroupRecipient.class})
    private Output</* @Nullable */ List<ProjectAlertGroupRecipient>> recipients;

    /**
     * @return The project alert group recipients (list)
     * 
     */
    public Output<Optional<List<ProjectAlertGroupRecipient>>> recipients() {
        return Codegen.optional(this.recipients);
    }
    /**
     * The project alert group wait seconds. Default: `3600` (int)
     * 
     */
    @Export(name="repeatIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> repeatIntervalSeconds;

    /**
     * @return The project alert group wait seconds. Default: `3600` (int)
     * 
     */
    public Output<Optional<Integer>> repeatIntervalSeconds() {
        return Codegen.optional(this.repeatIntervalSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectAlertGroup(String name) {
        this(name, ProjectAlertGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectAlertGroup(String name, ProjectAlertGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectAlertGroup(String name, ProjectAlertGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, args == null ? ProjectAlertGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectAlertGroup(String name, Output<String> id, @Nullable ProjectAlertGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectAlertGroup:ProjectAlertGroup", name, state, makeResourceOptions(options, id));
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
    public static ProjectAlertGroup get(String name, Output<String> id, @Nullable ProjectAlertGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectAlertGroup(name, id, state, options);
    }
}
