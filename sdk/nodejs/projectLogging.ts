// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Project Logging resource. This can be used to create Project Logging for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new rancher2 Project Logging
 * const foo = new rancher2.ProjectLogging("foo", {
 *     kind: "syslog",
 *     projectId: "<project_id>",
 *     syslogConfig: {
 *         endpoint: "<syslog_endpoint>",
 *         protocol: "udp",
 *         severity: "notice",
 *         sslVerify: false,
 *     },
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/projectLogging.html.markdown.
 */
export class ProjectLogging extends pulumi.CustomResource {
    /**
     * Get an existing ProjectLogging resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectLoggingState, opts?: pulumi.CustomResourceOptions): ProjectLogging {
        return new ProjectLogging(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectLogging:ProjectLogging';

    /**
     * Returns true if the given object is an instance of ProjectLogging.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectLogging {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectLogging.__pulumiType;
    }

    /**
     * Annotations for Project Logging object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly customTargetConfig!: pulumi.Output<outputs.ProjectLoggingCustomTargetConfig | undefined>;
    /**
     * The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly elasticsearchConfig!: pulumi.Output<outputs.ProjectLoggingElasticsearchConfig | undefined>;
    /**
     * Enable json log parsing. Default: `false` (bool)
     */
    public readonly enableJsonParsing!: pulumi.Output<boolean | undefined>;
    /**
     * The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly fluentdConfig!: pulumi.Output<outputs.ProjectLoggingFluentdConfig | undefined>;
    /**
     * The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly kafkaConfig!: pulumi.Output<outputs.ProjectLoggingKafkaConfig | undefined>;
    /**
     * The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Labels for Project Logging object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the Project Logging config (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace id from Project logging (string)
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    public readonly outputFlushInterval!: pulumi.Output<number | undefined>;
    /**
     * The output tags for Project Logging (map)
     */
    public readonly outputTags!: pulumi.Output<{[key: string]: any}>;
    /**
     * The project id to configure logging (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    public readonly splunkConfig!: pulumi.Output<outputs.ProjectLoggingSplunkConfig | undefined>;
    /**
     * The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    public readonly syslogConfig!: pulumi.Output<outputs.ProjectLoggingSyslogConfig | undefined>;

    /**
     * Create a ProjectLogging resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectLoggingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectLoggingArgs | ProjectLoggingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectLoggingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["customTargetConfig"] = state ? state.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = state ? state.elasticsearchConfig : undefined;
            inputs["enableJsonParsing"] = state ? state.enableJsonParsing : undefined;
            inputs["fluentdConfig"] = state ? state.fluentdConfig : undefined;
            inputs["kafkaConfig"] = state ? state.kafkaConfig : undefined;
            inputs["kind"] = state ? state.kind : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
            inputs["outputFlushInterval"] = state ? state.outputFlushInterval : undefined;
            inputs["outputTags"] = state ? state.outputTags : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["splunkConfig"] = state ? state.splunkConfig : undefined;
            inputs["syslogConfig"] = state ? state.syslogConfig : undefined;
        } else {
            const args = argsOrState as ProjectLoggingArgs | undefined;
            if (!args || args.kind === undefined) {
                throw new Error("Missing required property 'kind'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["customTargetConfig"] = args ? args.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = args ? args.elasticsearchConfig : undefined;
            inputs["enableJsonParsing"] = args ? args.enableJsonParsing : undefined;
            inputs["fluentdConfig"] = args ? args.fluentdConfig : undefined;
            inputs["kafkaConfig"] = args ? args.kafkaConfig : undefined;
            inputs["kind"] = args ? args.kind : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
            inputs["outputFlushInterval"] = args ? args.outputFlushInterval : undefined;
            inputs["outputTags"] = args ? args.outputTags : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["splunkConfig"] = args ? args.splunkConfig : undefined;
            inputs["syslogConfig"] = args ? args.syslogConfig : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ProjectLogging.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectLogging resources.
 */
export interface ProjectLoggingState {
    /**
     * Annotations for Project Logging object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly customTargetConfig?: pulumi.Input<inputs.ProjectLoggingCustomTargetConfig>;
    /**
     * The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly elasticsearchConfig?: pulumi.Input<inputs.ProjectLoggingElasticsearchConfig>;
    /**
     * Enable json log parsing. Default: `false` (bool)
     */
    readonly enableJsonParsing?: pulumi.Input<boolean>;
    /**
     * The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly fluentdConfig?: pulumi.Input<inputs.ProjectLoggingFluentdConfig>;
    /**
     * The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly kafkaConfig?: pulumi.Input<inputs.ProjectLoggingKafkaConfig>;
    /**
     * The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    readonly kind?: pulumi.Input<string>;
    /**
     * Labels for Project Logging object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Project Logging config (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace id from Project logging (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    readonly outputFlushInterval?: pulumi.Input<number>;
    /**
     * The output tags for Project Logging (map)
     */
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project id to configure logging (string)
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    readonly splunkConfig?: pulumi.Input<inputs.ProjectLoggingSplunkConfig>;
    /**
     * The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    readonly syslogConfig?: pulumi.Input<inputs.ProjectLoggingSyslogConfig>;
}

/**
 * The set of arguments for constructing a ProjectLogging resource.
 */
export interface ProjectLoggingArgs {
    /**
     * Annotations for Project Logging object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly customTargetConfig?: pulumi.Input<inputs.ProjectLoggingCustomTargetConfig>;
    /**
     * The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly elasticsearchConfig?: pulumi.Input<inputs.ProjectLoggingElasticsearchConfig>;
    /**
     * Enable json log parsing. Default: `false` (bool)
     */
    readonly enableJsonParsing?: pulumi.Input<boolean>;
    /**
     * The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly fluentdConfig?: pulumi.Input<inputs.ProjectLoggingFluentdConfig>;
    /**
     * The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly kafkaConfig?: pulumi.Input<inputs.ProjectLoggingKafkaConfig>;
    /**
     * The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    readonly kind: pulumi.Input<string>;
    /**
     * Labels for Project Logging object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Project Logging config (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace id from Project logging (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    readonly outputFlushInterval?: pulumi.Input<number>;
    /**
     * The output tags for Project Logging (map)
     */
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project id to configure logging (string)
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    readonly splunkConfig?: pulumi.Input<inputs.ProjectLoggingSplunkConfig>;
    /**
     * The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    readonly syslogConfig?: pulumi.Input<inputs.ProjectLoggingSyslogConfig>;
}
