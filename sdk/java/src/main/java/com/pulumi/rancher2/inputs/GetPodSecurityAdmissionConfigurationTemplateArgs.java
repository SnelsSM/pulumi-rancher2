// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityAdmissionConfigurationTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityAdmissionConfigurationTemplateArgs Empty = new GetPodSecurityAdmissionConfigurationTemplateArgs();

    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GetPodSecurityAdmissionConfigurationTemplateArgs() {}

    private GetPodSecurityAdmissionConfigurationTemplateArgs(GetPodSecurityAdmissionConfigurationTemplateArgs $) {
        this.annotations = $.annotations;
        this.labels = $.labels;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityAdmissionConfigurationTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityAdmissionConfigurationTemplateArgs $;

        public Builder() {
            $ = new GetPodSecurityAdmissionConfigurationTemplateArgs();
        }

        public Builder(GetPodSecurityAdmissionConfigurationTemplateArgs defaults) {
            $ = new GetPodSecurityAdmissionConfigurationTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetPodSecurityAdmissionConfigurationTemplateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityAdmissionConfigurationTemplateArgs", "name");
            }
            return $;
        }
    }

}
