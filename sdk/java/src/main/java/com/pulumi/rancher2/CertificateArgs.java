// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Annotations for certificate object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations for certificate object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Base64 encoded public certs (string)
     * 
     */
    @Import(name="certs", required=true)
    private Output<String> certs;

    /**
     * @return Base64 encoded public certs (string)
     * 
     */
    public Output<String> certs() {
        return this.certs;
    }

    /**
     * A certificate description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A certificate description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Base64 encoded private key (string)
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Base64 encoded private key (string)
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Labels for certificate object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for certificate object (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the certificate (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the certificate (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace id where the namespaced certificate should be created (string)
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The namespace id where the namespaced certificate should be created (string)
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The project id where the certificate should be created  (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The project id where the certificate should be created  (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.annotations = $.annotations;
        this.certs = $.certs;
        this.description = $.description;
        this.key = $.key;
        this.labels = $.labels;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for certificate object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for certificate object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param certs Base64 encoded public certs (string)
         * 
         * @return builder
         * 
         */
        public Builder certs(Output<String> certs) {
            $.certs = certs;
            return this;
        }

        /**
         * @param certs Base64 encoded public certs (string)
         * 
         * @return builder
         * 
         */
        public Builder certs(String certs) {
            return certs(Output.of(certs));
        }

        /**
         * @param description A certificate description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A certificate description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key Base64 encoded private key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Base64 encoded private key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param labels Labels for certificate object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for certificate object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the certificate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the certificate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The namespace id where the namespaced certificate should be created (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The namespace id where the namespaced certificate should be created (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param projectId The project id where the certificate should be created  (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where the certificate should be created  (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public CertificateArgs build() {
            if ($.certs == null) {
                throw new MissingRequiredPropertyException("CertificateArgs", "certs");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("CertificateArgs", "key");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("CertificateArgs", "projectId");
            }
            return $;
        }
    }

}
