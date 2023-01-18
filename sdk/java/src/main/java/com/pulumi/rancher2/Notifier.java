// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.NotifierArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.NotifierState;
import com.pulumi.rancher2.outputs.NotifierDingtalkConfig;
import com.pulumi.rancher2.outputs.NotifierMsteamsConfig;
import com.pulumi.rancher2.outputs.NotifierPagerdutyConfig;
import com.pulumi.rancher2.outputs.NotifierSlackConfig;
import com.pulumi.rancher2.outputs.NotifierSmtpConfig;
import com.pulumi.rancher2.outputs.NotifierWebhookConfig;
import com.pulumi.rancher2.outputs.NotifierWechatConfig;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Notifier;
 * import com.pulumi.rancher2.NotifierArgs;
 * import com.pulumi.rancher2.inputs.NotifierPagerdutyConfigArgs;
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
 *         var foo = new Notifier(&#34;foo&#34;, NotifierArgs.builder()        
 *             .clusterId(&#34;&lt;cluster_id&gt;&#34;)
 *             .description(&#34;Terraform notifier acceptance test&#34;)
 *             .pagerdutyConfig(NotifierPagerdutyConfigArgs.builder()
 *                 .proxyUrl(&#34;http://proxy.test.io&#34;)
 *                 .serviceKey(&#34;XXXXXXXX&#34;)
 *                 .build())
 *             .sendResolved(&#34;true&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Notifiers can be imported using the Rancher nNtifier ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/notifier:Notifier foo &amp;lt;notifier_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/notifier:Notifier")
public class Notifier extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for notifier object (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for notifier object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where create notifier (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster id where create notifier (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The notifier description (string)
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The notifier description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Dingtalk config for notifier (list maxitems:1)
     * 
     */
    @Export(name="dingtalkConfig", type=NotifierDingtalkConfig.class, parameters={})
    private Output</* @Nullable */ NotifierDingtalkConfig> dingtalkConfig;

    /**
     * @return Dingtalk config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierDingtalkConfig>> dingtalkConfig() {
        return Codegen.optional(this.dingtalkConfig);
    }
    /**
     * Labels for notifier object (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for notifier object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * MSTeams config for notifier (list maxitems:1)
     * 
     */
    @Export(name="msteamsConfig", type=NotifierMsteamsConfig.class, parameters={})
    private Output</* @Nullable */ NotifierMsteamsConfig> msteamsConfig;

    /**
     * @return MSTeams config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierMsteamsConfig>> msteamsConfig() {
        return Codegen.optional(this.msteamsConfig);
    }
    /**
     * The name of the notifier (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the notifier (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pagerduty config for notifier (list maxitems:1)
     * 
     */
    @Export(name="pagerdutyConfig", type=NotifierPagerdutyConfig.class, parameters={})
    private Output</* @Nullable */ NotifierPagerdutyConfig> pagerdutyConfig;

    /**
     * @return Pagerduty config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierPagerdutyConfig>> pagerdutyConfig() {
        return Codegen.optional(this.pagerdutyConfig);
    }
    /**
     * = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
     * 
     */
    @Export(name="sendResolved", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendResolved;

    /**
     * @return = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> sendResolved() {
        return Codegen.optional(this.sendResolved);
    }
    /**
     * Slack config for notifier (list maxitems:1)
     * 
     */
    @Export(name="slackConfig", type=NotifierSlackConfig.class, parameters={})
    private Output</* @Nullable */ NotifierSlackConfig> slackConfig;

    /**
     * @return Slack config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierSlackConfig>> slackConfig() {
        return Codegen.optional(this.slackConfig);
    }
    /**
     * SMTP config for notifier (list maxitems:1)
     * 
     */
    @Export(name="smtpConfig", type=NotifierSmtpConfig.class, parameters={})
    private Output</* @Nullable */ NotifierSmtpConfig> smtpConfig;

    /**
     * @return SMTP config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierSmtpConfig>> smtpConfig() {
        return Codegen.optional(this.smtpConfig);
    }
    /**
     * Webhook config for notifier (list maxitems:1)
     * 
     */
    @Export(name="webhookConfig", type=NotifierWebhookConfig.class, parameters={})
    private Output</* @Nullable */ NotifierWebhookConfig> webhookConfig;

    /**
     * @return Webhook config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierWebhookConfig>> webhookConfig() {
        return Codegen.optional(this.webhookConfig);
    }
    /**
     * Wechat config for notifier (list maxitems:1)
     * 
     */
    @Export(name="wechatConfig", type=NotifierWechatConfig.class, parameters={})
    private Output</* @Nullable */ NotifierWechatConfig> wechatConfig;

    /**
     * @return Wechat config for notifier (list maxitems:1)
     * 
     */
    public Output<Optional<NotifierWechatConfig>> wechatConfig() {
        return Codegen.optional(this.wechatConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notifier(String name) {
        this(name, NotifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notifier(String name, NotifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notifier(String name, NotifierArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/notifier:Notifier", name, args == null ? NotifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Notifier(String name, Output<String> id, @Nullable NotifierState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/notifier:Notifier", name, state, makeResourceOptions(options, id));
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
    public static Notifier get(String name, Output<String> id, @Nullable NotifierState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Notifier(name, id, state, options);
    }
}
