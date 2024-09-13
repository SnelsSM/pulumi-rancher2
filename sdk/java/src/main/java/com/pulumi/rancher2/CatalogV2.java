// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.CatalogV2Args;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.CatalogV2State;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher Catalog v2 resource. This can be used to create cluster helm catalogs for Rancher v2 environments and retrieve their information. Catalog v2 resource is available at Rancher v2.5.x and above.
 * 
 * ## Import
 * 
 * V2 catalogs can be imported using the Rancher cluster ID and Catalog V2 name.
 * 
 * ```sh
 * $ pulumi import rancher2:index/catalogV2:CatalogV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;CATALOG_V2_NAME&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/catalogV2:CatalogV2")
public class CatalogV2 extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for the catalog v2 (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations for the catalog v2 (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
     * 
     */
    @Export(name="caBundle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> caBundle;

    /**
     * @return CA certificate in base64-encoded DER format which will be used to validate the repo&#39;s certificate (string)
     * 
     */
    public Output<Optional<String>> caBundle() {
        return Codegen.optional(this.caBundle);
    }
    /**
     * The cluster id of the catalog V2 (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster id of the catalog V2 (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Maximum number of retries before returning error
     * 
     */
    @Export(name="exponentialBackoffMaxRetries", refs={Integer.class}, tree="[0]")
    private Output<Integer> exponentialBackoffMaxRetries;

    /**
     * @return Maximum number of retries before returning error
     * 
     */
    public Output<Integer> exponentialBackoffMaxRetries() {
        return this.exponentialBackoffMaxRetries;
    }
    /**
     * Maximum amount of seconds to wait before retrying
     * 
     */
    @Export(name="exponentialBackoffMaxWait", refs={Integer.class}, tree="[0]")
    private Output<Integer> exponentialBackoffMaxWait;

    /**
     * @return Maximum amount of seconds to wait before retrying
     * 
     */
    public Output<Integer> exponentialBackoffMaxWait() {
        return this.exponentialBackoffMaxWait;
    }
    /**
     * Minimum amount of seconds to wait before retrying
     * 
     */
    @Export(name="exponentialBackoffMinWait", refs={Integer.class}, tree="[0]")
    private Output<Integer> exponentialBackoffMinWait;

    /**
     * @return Minimum amount of seconds to wait before retrying
     * 
     */
    public Output<Integer> exponentialBackoffMinWait() {
        return this.exponentialBackoffMinWait;
    }
    /**
     * Git Repository branch containing Helm chart definitions. Default `master` (string)
     * 
     */
    @Export(name="gitBranch", refs={String.class}, tree="[0]")
    private Output<String> gitBranch;

    /**
     * @return Git Repository branch containing Helm chart definitions. Default `master` (string)
     * 
     */
    public Output<String> gitBranch() {
        return this.gitBranch;
    }
    /**
     * The url of the catalog v2 repo. Conflicts with `url` (string)
     * 
     */
    @Export(name="gitRepo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gitRepo;

    /**
     * @return The url of the catalog v2 repo. Conflicts with `url` (string)
     * 
     */
    public Output<Optional<String>> gitRepo() {
        return Codegen.optional(this.gitRepo);
    }
    /**
     * Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
     * 
     */
    @Export(name="insecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> insecure;

    /**
     * @return Use insecure HTTPS to download the repo&#39;s index. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> insecure() {
        return Codegen.optional(this.insecure);
    }
    /**
     * Only valid for OCI URL&#39;s. Allows insecure connections to registries without enforcing TLS checks
     * 
     */
    @Export(name="insecurePlainHttp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> insecurePlainHttp;

    /**
     * @return Only valid for OCI URL&#39;s. Allows insecure connections to registries without enforcing TLS checks
     * 
     */
    public Output<Optional<Boolean>> insecurePlainHttp() {
        return Codegen.optional(this.insecurePlainHttp);
    }
    /**
     * Labels for the catalog v2 (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for the catalog v2 (map)
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The name of the catalog v2 (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the catalog v2 (string)
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * K8s secret name to be used to connect to the repo (string)
     * 
     */
    @Export(name="secretName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretName;

    /**
     * @return K8s secret name to be used to connect to the repo (string)
     * 
     */
    public Output<Optional<String>> secretName() {
        return Codegen.optional(this.secretName);
    }
    /**
     * K8s secret namespace (string)
     * 
     */
    @Export(name="secretNamespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretNamespace;

    /**
     * @return K8s secret namespace (string)
     * 
     */
    public Output<Optional<String>> secretNamespace() {
        return Codegen.optional(this.secretNamespace);
    }
    /**
     * K8s service account used to deploy charts instead of the end users credentials (string)
     * 
     */
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccount;

    /**
     * @return K8s service account used to deploy charts instead of the end users credentials (string)
     * 
     */
    public Output<Optional<String>> serviceAccount() {
        return Codegen.optional(this.serviceAccount);
    }
    /**
     * The username to access the catalog if needed (string)
     * 
     */
    @Export(name="serviceAccountNamespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccountNamespace;

    /**
     * @return The username to access the catalog if needed (string)
     * 
     */
    public Output<Optional<String>> serviceAccountNamespace() {
        return Codegen.optional(this.serviceAccountNamespace);
    }
    /**
     * URL to an index generated by Helm. Conflicts with `git_repo` (string)
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> url;

    /**
     * @return URL to an index generated by Helm. Conflicts with `git_repo` (string)
     * 
     */
    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogV2(java.lang.String name) {
        this(name, CatalogV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogV2(java.lang.String name, CatalogV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogV2(java.lang.String name, CatalogV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/catalogV2:CatalogV2", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CatalogV2(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/catalogV2:CatalogV2", name, state, makeResourceOptions(options, id), false);
    }

    private static CatalogV2Args makeArgs(CatalogV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CatalogV2Args.Empty : args;
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
    public static CatalogV2 get(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CatalogV2(name, id, state, options);
    }
}
