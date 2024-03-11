// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ConfigMapV2Args;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ConfigMapV2State;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher ConfigMap v2 resource. This can be used to create k8s configMaps for Rancher v2 environments and retrieve their information. ConfigMap v2 resource is available at Rancher v2.5.x and above.
 * 
 * ## Import
 * 
 * V2 configMaps can be imported using the Rancher cluster ID, ConfigMap V2 namespace and name.
 * 
 * ```sh
 * $ pulumi import rancher2:index/configMapV2:ConfigMapV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;SECRET_V2_NAMESPACE&amp;gt;/&amp;lt;SECRET_V2_NAME&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/configMapV2:ConfigMapV2")
public class ConfigMapV2 extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for the configMap v2 (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for the configMap v2 (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id of the configMap V2 (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster id of the configMap V2 (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The data of the configMap v2 (map)
     * 
     */
    @Export(name="data", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> data;

    /**
     * @return The data of the configMap v2 (map)
     * 
     */
    public Output<Map<String,Object>> data() {
        return this.data;
    }
    /**
     * If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     * 
     */
    @Export(name="immutable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> immutable;

    /**
     * @return If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> immutable() {
        return Codegen.optional(this.immutable);
    }
    /**
     * Labels for the configMap v2 (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for the configMap v2 (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the configMap v2 (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the configMap v2 (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespaces of the configMap v2. Default: `default` (string)
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespaces of the configMap v2. Default: `default` (string)
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * (Computed) The k8s resource version (string)
     * 
     */
    @Export(name="resourceVersion", refs={String.class}, tree="[0]")
    private Output<String> resourceVersion;

    /**
     * @return (Computed) The k8s resource version (string)
     * 
     */
    public Output<String> resourceVersion() {
        return this.resourceVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigMapV2(String name) {
        this(name, ConfigMapV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigMapV2(String name, ConfigMapV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigMapV2(String name, ConfigMapV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/configMapV2:ConfigMapV2", name, args == null ? ConfigMapV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigMapV2(String name, Output<String> id, @Nullable ConfigMapV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/configMapV2:ConfigMapV2", name, state, makeResourceOptions(options, id));
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
    public static ConfigMapV2 get(String name, Output<String> id, @Nullable ConfigMapV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigMapV2(name, id, state, options);
    }
}
