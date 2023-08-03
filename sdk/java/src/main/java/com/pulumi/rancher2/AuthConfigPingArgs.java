// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigPingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigPingArgs Empty = new AuthConfigPingArgs();

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
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
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
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Ping display name field (string)
     * 
     */
    @Import(name="displayNameField", required=true)
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
     * Ping entity ID field (string)
     * 
     */
    @Import(name="entityIdField")
    private @Nullable Output<String> entityIdField;

    /**
     * @return Ping entity ID field (string)
     * 
     */
    public Optional<Output<String>> entityIdField() {
        return Optional.ofNullable(this.entityIdField);
    }

    /**
     * Ping group field (string)
     * 
     */
    @Import(name="groupsField", required=true)
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
    @Import(name="idpMetadataContent", required=true)
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
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
     * 
     */
    @Import(name="rancherApiHost", required=true)
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
    @Import(name="spCert", required=true)
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
    @Import(name="spKey", required=true)
    private Output<String> spKey;

    /**
     * @return Ping SP key (string)
     * 
     */
    public Output<String> spKey() {
        return this.spKey;
    }

    /**
     * Ping UID field (string)
     * 
     */
    @Import(name="uidField", required=true)
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
    @Import(name="userNameField", required=true)
    private Output<String> userNameField;

    /**
     * @return Ping user name field (string)
     * 
     */
    public Output<String> userNameField() {
        return this.userNameField;
    }

    private AuthConfigPingArgs() {}

    private AuthConfigPingArgs(AuthConfigPingArgs $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.displayNameField = $.displayNameField;
        this.enabled = $.enabled;
        this.entityIdField = $.entityIdField;
        this.groupsField = $.groupsField;
        this.idpMetadataContent = $.idpMetadataContent;
        this.labels = $.labels;
        this.rancherApiHost = $.rancherApiHost;
        this.spCert = $.spCert;
        this.spKey = $.spKey;
        this.uidField = $.uidField;
        this.userNameField = $.userNameField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigPingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigPingArgs $;

        public Builder() {
            $ = new AuthConfigPingArgs();
        }

        public Builder(AuthConfigPingArgs defaults) {
            $ = new AuthConfigPingArgs(Objects.requireNonNull(defaults));
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
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `ping_user://&lt;USER_ID&gt;`  `ping_group://&lt;GROUP_ID&gt;` (list)
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
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param displayNameField Ping display name field (string)
         * 
         * @return builder
         * 
         */
        public Builder displayNameField(Output<String> displayNameField) {
            $.displayNameField = displayNameField;
            return this;
        }

        /**
         * @param displayNameField Ping display name field (string)
         * 
         * @return builder
         * 
         */
        public Builder displayNameField(String displayNameField) {
            return displayNameField(Output.of(displayNameField));
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
         * @param entityIdField Ping entity ID field (string)
         * 
         * @return builder
         * 
         */
        public Builder entityIdField(@Nullable Output<String> entityIdField) {
            $.entityIdField = entityIdField;
            return this;
        }

        /**
         * @param entityIdField Ping entity ID field (string)
         * 
         * @return builder
         * 
         */
        public Builder entityIdField(String entityIdField) {
            return entityIdField(Output.of(entityIdField));
        }

        /**
         * @param groupsField Ping group field (string)
         * 
         * @return builder
         * 
         */
        public Builder groupsField(Output<String> groupsField) {
            $.groupsField = groupsField;
            return this;
        }

        /**
         * @param groupsField Ping group field (string)
         * 
         * @return builder
         * 
         */
        public Builder groupsField(String groupsField) {
            return groupsField(Output.of(groupsField));
        }

        /**
         * @param idpMetadataContent Ping IDP metadata content (string)
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataContent(Output<String> idpMetadataContent) {
            $.idpMetadataContent = idpMetadataContent;
            return this;
        }

        /**
         * @param idpMetadataContent Ping IDP metadata content (string)
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataContent(String idpMetadataContent) {
            return idpMetadataContent(Output.of(idpMetadataContent));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param rancherApiHost Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
         * 
         * @return builder
         * 
         */
        public Builder rancherApiHost(Output<String> rancherApiHost) {
            $.rancherApiHost = rancherApiHost;
            return this;
        }

        /**
         * @param rancherApiHost Rancher URL. URL scheme needs to be specified, `https://&lt;RANCHER_API_HOST&gt;` (string)
         * 
         * @return builder
         * 
         */
        public Builder rancherApiHost(String rancherApiHost) {
            return rancherApiHost(Output.of(rancherApiHost));
        }

        /**
         * @param spCert Ping SP cert (string)
         * 
         * @return builder
         * 
         */
        public Builder spCert(Output<String> spCert) {
            $.spCert = spCert;
            return this;
        }

        /**
         * @param spCert Ping SP cert (string)
         * 
         * @return builder
         * 
         */
        public Builder spCert(String spCert) {
            return spCert(Output.of(spCert));
        }

        /**
         * @param spKey Ping SP key (string)
         * 
         * @return builder
         * 
         */
        public Builder spKey(Output<String> spKey) {
            $.spKey = spKey;
            return this;
        }

        /**
         * @param spKey Ping SP key (string)
         * 
         * @return builder
         * 
         */
        public Builder spKey(String spKey) {
            return spKey(Output.of(spKey));
        }

        /**
         * @param uidField Ping UID field (string)
         * 
         * @return builder
         * 
         */
        public Builder uidField(Output<String> uidField) {
            $.uidField = uidField;
            return this;
        }

        /**
         * @param uidField Ping UID field (string)
         * 
         * @return builder
         * 
         */
        public Builder uidField(String uidField) {
            return uidField(Output.of(uidField));
        }

        /**
         * @param userNameField Ping user name field (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameField(Output<String> userNameField) {
            $.userNameField = userNameField;
            return this;
        }

        /**
         * @param userNameField Ping user name field (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameField(String userNameField) {
            return userNameField(Output.of(userNameField));
        }

        public AuthConfigPingArgs build() {
            $.displayNameField = Objects.requireNonNull($.displayNameField, "expected parameter 'displayNameField' to be non-null");
            $.groupsField = Objects.requireNonNull($.groupsField, "expected parameter 'groupsField' to be non-null");
            $.idpMetadataContent = Objects.requireNonNull($.idpMetadataContent, "expected parameter 'idpMetadataContent' to be non-null");
            $.rancherApiHost = Objects.requireNonNull($.rancherApiHost, "expected parameter 'rancherApiHost' to be non-null");
            $.spCert = Objects.requireNonNull($.spCert, "expected parameter 'spCert' to be non-null");
            $.spKey = Objects.requireNonNull($.spKey, "expected parameter 'spKey' to be non-null");
            $.uidField = Objects.requireNonNull($.uidField, "expected parameter 'uidField' to be non-null");
            $.userNameField = Objects.requireNonNull($.userNameField, "expected parameter 'userNameField' to be non-null");
            return $;
        }
    }

}
