// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs();

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs $) {
        this.mode = $.mode;
        this.options = $.options;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorizationArgs build() {
            return $;
        }
    }

}
