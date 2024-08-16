// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigAzureAdState extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigAzureAdState Empty = new AuthConfigAzureAdState();

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Import(name="accessMode")
    private @Nullable Output<String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Optional<Output<String>> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }

    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    public Optional<Output<List<String>>> allowedPrincipalIds() {
        return Optional.ofNullable(this.allowedPrincipalIds);
    }

    /**
     * Annotations of the resource (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * AzureAD auth application ID (string)
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return AzureAD auth application ID (string)
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * AzureAD auth application secret (string)
     * 
     */
    @Import(name="applicationSecret")
    private @Nullable Output<String> applicationSecret;

    /**
     * @return AzureAD auth application secret (string)
     * 
     */
    public Optional<Output<String>> applicationSecret() {
        return Optional.ofNullable(this.applicationSecret);
    }

    /**
     * AzureAD auth endpoint (string)
     * 
     */
    @Import(name="authEndpoint")
    private @Nullable Output<String> authEndpoint;

    /**
     * @return AzureAD auth endpoint (string)
     * 
     */
    public Optional<Output<String>> authEndpoint() {
        return Optional.ofNullable(this.authEndpoint);
    }

    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * AzureAD graph endpoint (string)
     * 
     */
    @Import(name="graphEndpoint")
    private @Nullable Output<String> graphEndpoint;

    /**
     * @return AzureAD graph endpoint (string)
     * 
     */
    public Optional<Output<String>> graphEndpoint() {
        return Optional.ofNullable(this.graphEndpoint);
    }

    /**
     * Labels of the resource (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * (Computed) The name of the resource (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    @Import(name="rancherUrl")
    private @Nullable Output<String> rancherUrl;

    /**
     * @return Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    public Optional<Output<String>> rancherUrl() {
        return Optional.ofNullable(this.rancherUrl);
    }

    /**
     * AzureAD tenant ID (string)
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return AzureAD tenant ID (string)
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * AzureAD token endpoint (string)
     * 
     */
    @Import(name="tokenEndpoint")
    private @Nullable Output<String> tokenEndpoint;

    /**
     * @return AzureAD token endpoint (string)
     * 
     */
    public Optional<Output<String>> tokenEndpoint() {
        return Optional.ofNullable(this.tokenEndpoint);
    }

    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AuthConfigAzureAdState() {}

    private AuthConfigAzureAdState(AuthConfigAzureAdState $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.applicationId = $.applicationId;
        this.applicationSecret = $.applicationSecret;
        this.authEndpoint = $.authEndpoint;
        this.enabled = $.enabled;
        this.endpoint = $.endpoint;
        this.graphEndpoint = $.graphEndpoint;
        this.labels = $.labels;
        this.name = $.name;
        this.rancherUrl = $.rancherUrl;
        this.tenantId = $.tenantId;
        this.tokenEndpoint = $.tokenEndpoint;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigAzureAdState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigAzureAdState $;

        public Builder() {
            $ = new AuthConfigAzureAdState();
        }

        public Builder(AuthConfigAzureAdState defaults) {
            $ = new AuthConfigAzureAdState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(@Nullable Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(String... allowedPrincipalIds) {
            return allowedPrincipalIds(List.of(allowedPrincipalIds));
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param applicationId AzureAD auth application ID (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId AzureAD auth application ID (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param applicationSecret AzureAD auth application secret (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationSecret(@Nullable Output<String> applicationSecret) {
            $.applicationSecret = applicationSecret;
            return this;
        }

        /**
         * @param applicationSecret AzureAD auth application secret (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationSecret(String applicationSecret) {
            return applicationSecret(Output.of(applicationSecret));
        }

        /**
         * @param authEndpoint AzureAD auth endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder authEndpoint(@Nullable Output<String> authEndpoint) {
            $.authEndpoint = authEndpoint;
            return this;
        }

        /**
         * @param authEndpoint AzureAD auth endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder authEndpoint(String authEndpoint) {
            return authEndpoint(Output.of(authEndpoint));
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endpoint AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param graphEndpoint AzureAD graph endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder graphEndpoint(@Nullable Output<String> graphEndpoint) {
            $.graphEndpoint = graphEndpoint;
            return this;
        }

        /**
         * @param graphEndpoint AzureAD graph endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder graphEndpoint(String graphEndpoint) {
            return graphEndpoint(Output.of(graphEndpoint));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name (Computed) The name of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Computed) The name of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rancherUrl Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(@Nullable Output<String> rancherUrl) {
            $.rancherUrl = rancherUrl;
            return this;
        }

        /**
         * @param rancherUrl Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(String rancherUrl) {
            return rancherUrl(Output.of(rancherUrl));
        }

        /**
         * @param tenantId AzureAD tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId AzureAD tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param tokenEndpoint AzureAD token endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpoint(@Nullable Output<String> tokenEndpoint) {
            $.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * @param tokenEndpoint AzureAD token endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpoint(String tokenEndpoint) {
            return tokenEndpoint(Output.of(tokenEndpoint));
        }

        /**
         * @param type (Computed) The type of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Computed) The type of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AuthConfigAzureAdState build() {
            return $;
        }
    }

}
