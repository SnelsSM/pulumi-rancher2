// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigOktaArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigOktaState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Auth Config OKTA resource. This can be used to configure and enable Auth Config OKTA for Rancher v2 RKE clusters and retrieve their information.
 * 
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
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
 * import com.pulumi.rancher2.AuthConfigOkta;
 * import com.pulumi.rancher2.AuthConfigOktaArgs;
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
 *         // Create a new rancher2 Auth Config OKTA
 *         var okta = new AuthConfigOkta("okta", AuthConfigOktaArgs.builder()
 *             .displayNameField("<DISPLAY_NAME_FIELD>")
 *             .groupsField("<GROUPS_FIELD>")
 *             .idpMetadataContent("<IDP_METADATA_CONTENT>")
 *             .rancherApiHost("https://<RANCHER_API_HOST>")
 *             .spCert("<SP_CERT>")
 *             .spKey("<SP_KEY>")
 *             .uidField("<UID_FIELD>")
 *             .userNameField("<USER_NAME_FIELD>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="rancher2:index/authConfigOkta:AuthConfigOkta")
public class AuthConfigOkta extends com.pulumi.resources.CustomResource {
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
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Export(name="allowedPrincipalIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `okta_user://&lt;USER_ID&gt;`  `okta_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    public Output<Optional<List<String>>> allowedPrincipalIds() {
        return Codegen.optional(this.allowedPrincipalIds);
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * OKTA display name field (string)
     * 
     */
    @Export(name="displayNameField", refs={String.class}, tree="[0]")
    private Output<String> displayNameField;

    /**
     * @return OKTA display name field (string)
     * 
     */
    public Output<String> displayNameField() {
        return this.displayNameField;
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
     * OKTA group field (string)
     * 
     */
    @Export(name="groupsField", refs={String.class}, tree="[0]")
    private Output<String> groupsField;

    /**
     * @return OKTA group field (string)
     * 
     */
    public Output<String> groupsField() {
        return this.groupsField;
    }
    /**
     * OKTA IDP metadata content (string)
     * 
     */
    @Export(name="idpMetadataContent", refs={String.class}, tree="[0]")
    private Output<String> idpMetadataContent;

    /**
     * @return OKTA IDP metadata content (string)
     * 
     */
    public Output<String> idpMetadataContent() {
        return this.idpMetadataContent;
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,String>> labels() {
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
     * Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
     * 
     */
    @Export(name="rancherApiHost", refs={String.class}, tree="[0]")
    private Output<String> rancherApiHost;

    /**
     * @return Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
     * 
     */
    public Output<String> rancherApiHost() {
        return this.rancherApiHost;
    }
    /**
     * OKTA SP cert (string)
     * 
     */
    @Export(name="spCert", refs={String.class}, tree="[0]")
    private Output<String> spCert;

    /**
     * @return OKTA SP cert (string)
     * 
     */
    public Output<String> spCert() {
        return this.spCert;
    }
    /**
     * OKTA SP key (string)
     * 
     */
    @Export(name="spKey", refs={String.class}, tree="[0]")
    private Output<String> spKey;

    /**
     * @return OKTA SP key (string)
     * 
     */
    public Output<String> spKey() {
        return this.spKey;
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
     * OKTA UID field (string)
     * 
     */
    @Export(name="uidField", refs={String.class}, tree="[0]")
    private Output<String> uidField;

    /**
     * @return OKTA UID field (string)
     * 
     */
    public Output<String> uidField() {
        return this.uidField;
    }
    /**
     * OKTA user name field (string)
     * 
     */
    @Export(name="userNameField", refs={String.class}, tree="[0]")
    private Output<String> userNameField;

    /**
     * @return OKTA user name field (string)
     * 
     */
    public Output<String> userNameField() {
        return this.userNameField;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigOkta(java.lang.String name) {
        this(name, AuthConfigOktaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigOkta(java.lang.String name, AuthConfigOktaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigOkta(java.lang.String name, AuthConfigOktaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigOkta:AuthConfigOkta", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AuthConfigOkta(java.lang.String name, Output<java.lang.String> id, @Nullable AuthConfigOktaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigOkta:AuthConfigOkta", name, state, makeResourceOptions(options, id), false);
    }

    private static AuthConfigOktaArgs makeArgs(AuthConfigOktaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AuthConfigOktaArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "idpMetadataContent",
                "spCert",
                "spKey"
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
    public static AuthConfigOkta get(java.lang.String name, Output<java.lang.String> id, @Nullable AuthConfigOktaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigOkta(name, id, state, options);
    }
}
