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


public final class NodeDriverState extends com.pulumi.resources.ResourceArgs {

    public static final NodeDriverState Empty = new NodeDriverState();

    /**
     * Specify if the node driver state (bool)
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Specify if the node driver state (bool)
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
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
     * Specify wheter the node driver is an internal node driver or not (bool)
     * 
     */
    @Import(name="builtin")
    private @Nullable Output<Boolean> builtin;

    /**
     * @return Specify wheter the node driver is an internal node driver or not (bool)
     * 
     */
    public Optional<Output<Boolean>> builtin() {
        return Optional.ofNullable(this.builtin);
    }

    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    @Import(name="checksum")
    private @Nullable Output<String> checksum;

    /**
     * @return Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    public Optional<Output<String>> checksum() {
        return Optional.ofNullable(this.checksum);
    }

    /**
     * Description of the node driver (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the node driver (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * External ID (string)
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return External ID (string)
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
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
     * Name of the node driver (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the node driver (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL to load for customized Add Nodes screen for this driver (string)
     * 
     */
    @Import(name="uiUrl")
    private @Nullable Output<String> uiUrl;

    /**
     * @return The URL to load for customized Add Nodes screen for this driver (string)
     * 
     */
    public Optional<Output<String>> uiUrl() {
        return Optional.ofNullable(this.uiUrl);
    }

    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Domains to whitelist for the ui (list)
     * 
     */
    @Import(name="whitelistDomains")
    private @Nullable Output<List<String>> whitelistDomains;

    /**
     * @return Domains to whitelist for the ui (list)
     * 
     */
    public Optional<Output<List<String>>> whitelistDomains() {
        return Optional.ofNullable(this.whitelistDomains);
    }

    private NodeDriverState() {}

    private NodeDriverState(NodeDriverState $) {
        this.active = $.active;
        this.annotations = $.annotations;
        this.builtin = $.builtin;
        this.checksum = $.checksum;
        this.description = $.description;
        this.externalId = $.externalId;
        this.labels = $.labels;
        this.name = $.name;
        this.uiUrl = $.uiUrl;
        this.url = $.url;
        this.whitelistDomains = $.whitelistDomains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeDriverState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeDriverState $;

        public Builder() {
            $ = new NodeDriverState();
        }

        public Builder(NodeDriverState defaults) {
            $ = new NodeDriverState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Specify if the node driver state (bool)
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Specify if the node driver state (bool)
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
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
         * @param builtin Specify wheter the node driver is an internal node driver or not (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(@Nullable Output<Boolean> builtin) {
            $.builtin = builtin;
            return this;
        }

        /**
         * @param builtin Specify wheter the node driver is an internal node driver or not (bool)
         * 
         * @return builder
         * 
         */
        public Builder builtin(Boolean builtin) {
            return builtin(Output.of(builtin));
        }

        /**
         * @param checksum Verify that the downloaded driver matches the expected checksum (string)
         * 
         * @return builder
         * 
         */
        public Builder checksum(@Nullable Output<String> checksum) {
            $.checksum = checksum;
            return this;
        }

        /**
         * @param checksum Verify that the downloaded driver matches the expected checksum (string)
         * 
         * @return builder
         * 
         */
        public Builder checksum(String checksum) {
            return checksum(Output.of(checksum));
        }

        /**
         * @param description Description of the node driver (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the node driver (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param externalId External ID (string)
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId External ID (string)
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
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
         * @param name Name of the node driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the node driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param uiUrl The URL to load for customized Add Nodes screen for this driver (string)
         * 
         * @return builder
         * 
         */
        public Builder uiUrl(@Nullable Output<String> uiUrl) {
            $.uiUrl = uiUrl;
            return this;
        }

        /**
         * @param uiUrl The URL to load for customized Add Nodes screen for this driver (string)
         * 
         * @return builder
         * 
         */
        public Builder uiUrl(String uiUrl) {
            return uiUrl(Output.of(uiUrl));
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(@Nullable Output<List<String>> whitelistDomains) {
            $.whitelistDomains = whitelistDomains;
            return this;
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(List<String> whitelistDomains) {
            return whitelistDomains(Output.of(whitelistDomains));
        }

        /**
         * @param whitelistDomains Domains to whitelist for the ui (list)
         * 
         * @return builder
         * 
         */
        public Builder whitelistDomains(String... whitelistDomains) {
            return whitelistDomains(List.of(whitelistDomains));
        }

        public NodeDriverState build() {
            return $;
        }
    }

}
