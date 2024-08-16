// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterAlertRuleEventRuleArgs;
import com.pulumi.rancher2.inputs.ClusterAlertRuleMetricRuleArgs;
import com.pulumi.rancher2.inputs.ClusterAlertRuleNodeRuleArgs;
import com.pulumi.rancher2.inputs.ClusterAlertRuleSystemServiceRuleArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAlertRuleState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlertRuleState Empty = new ClusterAlertRuleState();

    /**
     * The cluster alert rule annotations (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return The cluster alert rule annotations (map)
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The cluster id where create cluster alert rule (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The cluster id where create cluster alert rule (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="eventRule")
    private @Nullable Output<ClusterAlertRuleEventRuleArgs> eventRule;

    /**
     * @return The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ClusterAlertRuleEventRuleArgs>> eventRule() {
        return Optional.ofNullable(this.eventRule);
    }

    /**
     * The cluster alert rule alert group ID (string)
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The cluster alert rule alert group ID (string)
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     * 
     */
    @Import(name="groupIntervalSeconds")
    private @Nullable Output<Integer> groupIntervalSeconds;

    /**
     * @return The cluster alert rule group interval seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupIntervalSeconds() {
        return Optional.ofNullable(this.groupIntervalSeconds);
    }

    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     * 
     */
    @Import(name="groupWaitSeconds")
    private @Nullable Output<Integer> groupWaitSeconds;

    /**
     * @return The cluster alert rule group wait seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupWaitSeconds() {
        return Optional.ofNullable(this.groupWaitSeconds);
    }

    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     * 
     */
    @Import(name="inherited")
    private @Nullable Output<Boolean> inherited;

    /**
     * @return The cluster alert rule inherited. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> inherited() {
        return Optional.ofNullable(this.inherited);
    }

    /**
     * The cluster alert rule labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The cluster alert rule labels (map)
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="metricRule")
    private @Nullable Output<ClusterAlertRuleMetricRuleArgs> metricRule;

    /**
     * @return The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ClusterAlertRuleMetricRuleArgs>> metricRule() {
        return Optional.ofNullable(this.metricRule);
    }

    /**
     * The cluster alert rule name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The cluster alert rule name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="nodeRule")
    private @Nullable Output<ClusterAlertRuleNodeRuleArgs> nodeRule;

    /**
     * @return The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ClusterAlertRuleNodeRuleArgs>> nodeRule() {
        return Optional.ofNullable(this.nodeRule);
    }

    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     * 
     */
    @Import(name="repeatIntervalSeconds")
    private @Nullable Output<Integer> repeatIntervalSeconds;

    /**
     * @return The cluster alert rule wait seconds. Default: `3600` (int)
     * 
     */
    public Optional<Output<Integer>> repeatIntervalSeconds() {
        return Optional.ofNullable(this.repeatIntervalSeconds);
    }

    /**
     * The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
     * 
     */
    @Import(name="systemServiceRule")
    private @Nullable Output<ClusterAlertRuleSystemServiceRuleArgs> systemServiceRule;

    /**
     * @return The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
     * 
     */
    public Optional<Output<ClusterAlertRuleSystemServiceRuleArgs>> systemServiceRule() {
        return Optional.ofNullable(this.systemServiceRule);
    }

    private ClusterAlertRuleState() {}

    private ClusterAlertRuleState(ClusterAlertRuleState $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.eventRule = $.eventRule;
        this.groupId = $.groupId;
        this.groupIntervalSeconds = $.groupIntervalSeconds;
        this.groupWaitSeconds = $.groupWaitSeconds;
        this.inherited = $.inherited;
        this.labels = $.labels;
        this.metricRule = $.metricRule;
        this.name = $.name;
        this.nodeRule = $.nodeRule;
        this.repeatIntervalSeconds = $.repeatIntervalSeconds;
        this.severity = $.severity;
        this.systemServiceRule = $.systemServiceRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlertRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlertRuleState $;

        public Builder() {
            $ = new ClusterAlertRuleState();
        }

        public Builder(ClusterAlertRuleState defaults) {
            $ = new ClusterAlertRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The cluster alert rule annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The cluster alert rule annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId The cluster id where create cluster alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id where create cluster alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param eventRule The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder eventRule(@Nullable Output<ClusterAlertRuleEventRuleArgs> eventRule) {
            $.eventRule = eventRule;
            return this;
        }

        /**
         * @param eventRule The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder eventRule(ClusterAlertRuleEventRuleArgs eventRule) {
            return eventRule(Output.of(eventRule));
        }

        /**
         * @param groupId The cluster alert rule alert group ID (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The cluster alert rule alert group ID (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupIntervalSeconds The cluster alert rule group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(@Nullable Output<Integer> groupIntervalSeconds) {
            $.groupIntervalSeconds = groupIntervalSeconds;
            return this;
        }

        /**
         * @param groupIntervalSeconds The cluster alert rule group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(Integer groupIntervalSeconds) {
            return groupIntervalSeconds(Output.of(groupIntervalSeconds));
        }

        /**
         * @param groupWaitSeconds The cluster alert rule group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(@Nullable Output<Integer> groupWaitSeconds) {
            $.groupWaitSeconds = groupWaitSeconds;
            return this;
        }

        /**
         * @param groupWaitSeconds The cluster alert rule group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(Integer groupWaitSeconds) {
            return groupWaitSeconds(Output.of(groupWaitSeconds));
        }

        /**
         * @param inherited The cluster alert rule inherited. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder inherited(@Nullable Output<Boolean> inherited) {
            $.inherited = inherited;
            return this;
        }

        /**
         * @param inherited The cluster alert rule inherited. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder inherited(Boolean inherited) {
            return inherited(Output.of(inherited));
        }

        /**
         * @param labels The cluster alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The cluster alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param metricRule The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metricRule(@Nullable Output<ClusterAlertRuleMetricRuleArgs> metricRule) {
            $.metricRule = metricRule;
            return this;
        }

        /**
         * @param metricRule The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metricRule(ClusterAlertRuleMetricRuleArgs metricRule) {
            return metricRule(Output.of(metricRule));
        }

        /**
         * @param name The cluster alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The cluster alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeRule The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder nodeRule(@Nullable Output<ClusterAlertRuleNodeRuleArgs> nodeRule) {
            $.nodeRule = nodeRule;
            return this;
        }

        /**
         * @param nodeRule The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder nodeRule(ClusterAlertRuleNodeRuleArgs nodeRule) {
            return nodeRule(Output.of(nodeRule));
        }

        /**
         * @param repeatIntervalSeconds The cluster alert rule wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(@Nullable Output<Integer> repeatIntervalSeconds) {
            $.repeatIntervalSeconds = repeatIntervalSeconds;
            return this;
        }

        /**
         * @param repeatIntervalSeconds The cluster alert rule wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(Integer repeatIntervalSeconds) {
            return repeatIntervalSeconds(Output.of(repeatIntervalSeconds));
        }

        /**
         * @param severity The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param systemServiceRule The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder systemServiceRule(@Nullable Output<ClusterAlertRuleSystemServiceRuleArgs> systemServiceRule) {
            $.systemServiceRule = systemServiceRule;
            return this;
        }

        /**
         * @param systemServiceRule The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder systemServiceRule(ClusterAlertRuleSystemServiceRuleArgs systemServiceRule) {
            return systemServiceRule(Output.of(systemServiceRule));
        }

        public ClusterAlertRuleState build() {
            return $;
        }
    }

}
