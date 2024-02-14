// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterV2AgentEnvVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2AgentEnvVarArgs Empty = new ClusterV2AgentEnvVarArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The taint value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The taint value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ClusterV2AgentEnvVarArgs() {}

    private ClusterV2AgentEnvVarArgs(ClusterV2AgentEnvVarArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2AgentEnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2AgentEnvVarArgs $;

        public Builder() {
            $ = new ClusterV2AgentEnvVarArgs();
        }

        public Builder(ClusterV2AgentEnvVarArgs defaults) {
            $ = new ClusterV2AgentEnvVarArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The taint value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The taint value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterV2AgentEnvVarArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterV2AgentEnvVarArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ClusterV2AgentEnvVarArgs", "value");
            }
            return $;
        }
    }

}
