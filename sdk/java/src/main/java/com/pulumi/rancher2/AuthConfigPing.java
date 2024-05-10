// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigPingArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigPingState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Auth Config Ping resource. This can be used to configure and enable Auth Config Ping for Rancher v2 RKE clusters and retrieve their information.
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
 * import com.pulumi.rancher2.AuthConfigPing;
 * import com.pulumi.rancher2.AuthConfigPingArgs;
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
 *         // Create a new rancher2 Auth Config Ping
 *         var ping = new AuthConfigPing("ping", AuthConfigPingArgs.builder()        
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
@ResourceType(type="rancher2:index/authConfigPing:AuthConfigPing")
public class AuthConfigPing extends com.pulumi.resources.CustomResource {
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
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Export(name="allowedPrincipalIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
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
     * Ping display name field (string)
     * 
     */
    @Export(name="displayNameField", refs={String.class}, tree="[0]")
    private Output<String> displayNameField;

    /**
     * @return Ping display name field (string)
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
     * Ping entity ID field (string)
     * 
     */
    @Export(name="entityIdField", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> entityIdField;

    /**
     * @return Ping entity ID field (string)
     * 
     */
    public Output<Optional<String>> entityIdField() {
        return Codegen.optional(this.entityIdField);
    }
    /**
     * Ping group field (string)
     * 
     */
    @Export(name="groupsField", refs={String.class}, tree="[0]")
    private Output<String> groupsField;

    /**
     * @return Ping group field (string)
     * 
     */
    public Output<String> groupsField() {
        return this.groupsField;
    }
    /**
     * Ping IDP metadata content (string)
     * 
     */
    @Export(name="idpMetadataContent", refs={String.class}, tree="[0]")
    private Output<String> idpMetadataContent;

    /**
     * @return Ping IDP metadata content (string)
     * 
     */
    public Output<String> idpMetadataContent() {
        return this.idpMetadataContent;
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
     * Ping SP cert (string)
     * 
     */
    @Export(name="spCert", refs={String.class}, tree="[0]")
    private Output<String> spCert;

    /**
     * @return Ping SP cert (string)
     * 
     */
    public Output<String> spCert() {
        return this.spCert;
    }
    /**
     * Ping SP key (string)
     * 
     */
    @Export(name="spKey", refs={String.class}, tree="[0]")
    private Output<String> spKey;

    /**
     * @return Ping SP key (string)
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
     * Ping UID field (string)
     * 
     */
    @Export(name="uidField", refs={String.class}, tree="[0]")
    private Output<String> uidField;

    /**
     * @return Ping UID field (string)
     * 
     */
    public Output<String> uidField() {
        return this.uidField;
    }
    /**
     * Ping user name field (string)
     * 
     */
    @Export(name="userNameField", refs={String.class}, tree="[0]")
    private Output<String> userNameField;

    /**
     * @return Ping user name field (string)
     * 
     */
    public Output<String> userNameField() {
        return this.userNameField;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigPing(String name) {
        this(name, AuthConfigPingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigPing(String name, AuthConfigPingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigPing(String name, AuthConfigPingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigPing:AuthConfigPing", name, args == null ? AuthConfigPingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthConfigPing(String name, Output<String> id, @Nullable AuthConfigPingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigPing:AuthConfigPing", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static AuthConfigPing get(String name, Output<String> id, @Nullable AuthConfigPingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigPing(name, id, state, options);
    }
}
