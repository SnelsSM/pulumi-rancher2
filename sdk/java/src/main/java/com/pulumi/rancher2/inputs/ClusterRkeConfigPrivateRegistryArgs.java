// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigPrivateRegistryEcrCredentialPluginArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigPrivateRegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigPrivateRegistryArgs Empty = new ClusterRkeConfigPrivateRegistryArgs();

    /**
     * ECR credential plugin config (list maxitems:1)
     * 
     */
    @Import(name="ecrCredentialPlugin")
    private @Nullable Output<ClusterRkeConfigPrivateRegistryEcrCredentialPluginArgs> ecrCredentialPlugin;

    /**
     * @return ECR credential plugin config (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigPrivateRegistryEcrCredentialPluginArgs>> ecrCredentialPlugin() {
        return Optional.ofNullable(this.ecrCredentialPlugin);
    }

    /**
     * Set as default registry. Default `false` (bool)
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Set as default registry. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * (string)
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * (string)
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return (string)
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * User to connect bastion host (string)
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return User to connect bastion host (string)
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private ClusterRkeConfigPrivateRegistryArgs() {}

    private ClusterRkeConfigPrivateRegistryArgs(ClusterRkeConfigPrivateRegistryArgs $) {
        this.ecrCredentialPlugin = $.ecrCredentialPlugin;
        this.isDefault = $.isDefault;
        this.password = $.password;
        this.url = $.url;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigPrivateRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigPrivateRegistryArgs $;

        public Builder() {
            $ = new ClusterRkeConfigPrivateRegistryArgs();
        }

        public Builder(ClusterRkeConfigPrivateRegistryArgs defaults) {
            $ = new ClusterRkeConfigPrivateRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ecrCredentialPlugin ECR credential plugin config (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ecrCredentialPlugin(@Nullable Output<ClusterRkeConfigPrivateRegistryEcrCredentialPluginArgs> ecrCredentialPlugin) {
            $.ecrCredentialPlugin = ecrCredentialPlugin;
            return this;
        }

        /**
         * @param ecrCredentialPlugin ECR credential plugin config (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ecrCredentialPlugin(ClusterRkeConfigPrivateRegistryEcrCredentialPluginArgs ecrCredentialPlugin) {
            return ecrCredentialPlugin(Output.of(ecrCredentialPlugin));
        }

        /**
         * @param isDefault Set as default registry. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Set as default registry. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param url (string)
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param user User to connect bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user User to connect bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ClusterRkeConfigPrivateRegistryArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
