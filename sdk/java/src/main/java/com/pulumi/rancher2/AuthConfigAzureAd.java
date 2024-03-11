// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigAzureAdArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigAzureAdState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.AuthConfigAzureAd;
 * import com.pulumi.rancher2.AuthConfigAzureAdArgs;
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
 *         var azuread = new AuthConfigAzureAd(&#34;azuread&#34;, AuthConfigAzureAdArgs.builder()        
 *             .applicationId(&#34;&lt;AZUREAD_APP_ID&gt;&#34;)
 *             .applicationSecret(&#34;&lt;AZUREAD_APP_SECRET&gt;&#34;)
 *             .authEndpoint(&#34;&lt;AZUREAD_AUTH_ENDPOINT&gt;&#34;)
 *             .graphEndpoint(&#34;&lt;AZUREAD_GRAPH_ENDPOINT&gt;&#34;)
 *             .rancherUrl(&#34;&lt;RANCHER_URL&gt;&#34;)
 *             .tenantId(&#34;&lt;AZUREAD_TENANT_ID&gt;&#34;)
 *             .tokenEndpoint(&#34;&lt;AZUREAD_TOKEN_ENDPOINT&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="rancher2:index/authConfigAzureAd:AuthConfigAzureAd")
public class AuthConfigAzureAd extends com.pulumi.resources.CustomResource {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Export(name="accessMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Output<Optional<String>> accessMode() {
        return Codegen.optional(this.accessMode);
    }
    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Export(name="allowedPrincipalIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    public Output<Optional<List<String>>> allowedPrincipalIds() {
        return Codegen.optional(this.allowedPrincipalIds);
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * AzureAD auth application ID (string)
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return AzureAD auth application ID (string)
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * AzureAD auth application secret (string)
     * 
     */
    @Export(name="applicationSecret", refs={String.class}, tree="[0]")
    private Output<String> applicationSecret;

    /**
     * @return AzureAD auth application secret (string)
     * 
     */
    public Output<String> applicationSecret() {
        return this.applicationSecret;
    }
    /**
     * AzureAD auth endpoint (string)
     * 
     */
    @Export(name="authEndpoint", refs={String.class}, tree="[0]")
    private Output<String> authEndpoint;

    /**
     * @return AzureAD auth endpoint (string)
     * 
     */
    public Output<String> authEndpoint() {
        return this.authEndpoint;
    }
    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * AzureAD graph endpoint (string)
     * 
     */
    @Export(name="graphEndpoint", refs={String.class}, tree="[0]")
    private Output<String> graphEndpoint;

    /**
     * @return AzureAD graph endpoint (string)
     * 
     */
    public Output<String> graphEndpoint() {
        return this.graphEndpoint;
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * (Computed) The name of the resource (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    @Export(name="rancherUrl", refs={String.class}, tree="[0]")
    private Output<String> rancherUrl;

    /**
     * @return Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    public Output<String> rancherUrl() {
        return this.rancherUrl;
    }
    /**
     * AzureAD tenant ID (string)
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return AzureAD tenant ID (string)
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * AzureAD token endpoint (string)
     * 
     */
    @Export(name="tokenEndpoint", refs={String.class}, tree="[0]")
    private Output<String> tokenEndpoint;

    /**
     * @return AzureAD token endpoint (string)
     * 
     */
    public Output<String> tokenEndpoint() {
        return this.tokenEndpoint;
    }
    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigAzureAd(String name) {
        this(name, AuthConfigAzureAdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigAzureAd(String name, AuthConfigAzureAdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigAzureAd(String name, AuthConfigAzureAdArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, args == null ? AuthConfigAzureAdArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthConfigAzureAd(String name, Output<String> id, @Nullable AuthConfigAzureAdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "applicationId",
                "applicationSecret"
            ))
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
    public static AuthConfigAzureAd get(String name, Output<String> id, @Nullable AuthConfigAzureAdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigAzureAd(name, id, state, options);
    }
}
