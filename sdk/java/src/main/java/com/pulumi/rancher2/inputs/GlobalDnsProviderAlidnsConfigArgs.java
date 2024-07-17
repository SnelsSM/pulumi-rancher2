// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GlobalDnsProviderAlidnsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsProviderAlidnsConfigArgs Empty = new GlobalDnsProviderAlidnsConfigArgs();

    /**
     * The AWS Access key (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The AWS Access key (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The AWS Secret key (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The AWS Secret key (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    private GlobalDnsProviderAlidnsConfigArgs() {}

    private GlobalDnsProviderAlidnsConfigArgs(GlobalDnsProviderAlidnsConfigArgs $) {
        this.accessKey = $.accessKey;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsProviderAlidnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsProviderAlidnsConfigArgs $;

        public Builder() {
            $ = new GlobalDnsProviderAlidnsConfigArgs();
        }

        public Builder(GlobalDnsProviderAlidnsConfigArgs defaults) {
            $ = new GlobalDnsProviderAlidnsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The AWS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The AWS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param secretKey The AWS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The AWS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public GlobalDnsProviderAlidnsConfigArgs build() {
            if ($.accessKey == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderAlidnsConfigArgs", "accessKey");
            }
            if ($.secretKey == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderAlidnsConfigArgs", "secretKey");
            }
            return $;
        }
    }

}
