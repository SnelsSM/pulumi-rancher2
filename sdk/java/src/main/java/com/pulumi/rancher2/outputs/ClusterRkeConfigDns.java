// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigDnsLinearAutoscalerParams;
import com.pulumi.rancher2.outputs.ClusterRkeConfigDnsNodelocal;
import com.pulumi.rancher2.outputs.ClusterRkeConfigDnsToleration;
import com.pulumi.rancher2.outputs.ClusterRkeConfigDnsUpdateStrategy;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigDns {
    /**
     * @return Linear Autoscaler Params
     * 
     */
    private @Nullable ClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams;
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    private @Nullable Map<String,Object> nodeSelector;
    /**
     * @return Nodelocal dns
     * 
     */
    private @Nullable ClusterRkeConfigDnsNodelocal nodelocal;
    /**
     * @return RKE options for network (map)
     * 
     */
    private @Nullable Map<String,Object> options;
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    private @Nullable String provider;
    /**
     * @return DNS add-on reverse cidr  (list)
     * 
     */
    private @Nullable List<String> reverseCidrs;
    /**
     * @return DNS service tolerations
     * 
     */
    private @Nullable List<ClusterRkeConfigDnsToleration> tolerations;
    /**
     * @return Update deployment strategy
     * 
     */
    private @Nullable ClusterRkeConfigDnsUpdateStrategy updateStrategy;
    /**
     * @return DNS add-on upstream nameservers  (list)
     * 
     */
    private @Nullable List<String> upstreamNameservers;

    private ClusterRkeConfigDns() {}
    /**
     * @return Linear Autoscaler Params
     * 
     */
    public Optional<ClusterRkeConfigDnsLinearAutoscalerParams> linearAutoscalerParams() {
        return Optional.ofNullable(this.linearAutoscalerParams);
    }
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * @return Nodelocal dns
     * 
     */
    public Optional<ClusterRkeConfigDnsNodelocal> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }
    /**
     * @return RKE options for network (map)
     * 
     */
    public Map<String,Object> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return DNS add-on reverse cidr  (list)
     * 
     */
    public List<String> reverseCidrs() {
        return this.reverseCidrs == null ? List.of() : this.reverseCidrs;
    }
    /**
     * @return DNS service tolerations
     * 
     */
    public List<ClusterRkeConfigDnsToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return Update deployment strategy
     * 
     */
    public Optional<ClusterRkeConfigDnsUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }
    /**
     * @return DNS add-on upstream nameservers  (list)
     * 
     */
    public List<String> upstreamNameservers() {
        return this.upstreamNameservers == null ? List.of() : this.upstreamNameservers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams;
        private @Nullable Map<String,Object> nodeSelector;
        private @Nullable ClusterRkeConfigDnsNodelocal nodelocal;
        private @Nullable Map<String,Object> options;
        private @Nullable String provider;
        private @Nullable List<String> reverseCidrs;
        private @Nullable List<ClusterRkeConfigDnsToleration> tolerations;
        private @Nullable ClusterRkeConfigDnsUpdateStrategy updateStrategy;
        private @Nullable List<String> upstreamNameservers;
        public Builder() {}
        public Builder(ClusterRkeConfigDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linearAutoscalerParams = defaults.linearAutoscalerParams;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.nodelocal = defaults.nodelocal;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.reverseCidrs = defaults.reverseCidrs;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.upstreamNameservers = defaults.upstreamNameservers;
        }

        @CustomType.Setter
        public Builder linearAutoscalerParams(@Nullable ClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams) {

            this.linearAutoscalerParams = linearAutoscalerParams;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder nodelocal(@Nullable ClusterRkeConfigDnsNodelocal nodelocal) {

            this.nodelocal = nodelocal;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,Object> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder reverseCidrs(@Nullable List<String> reverseCidrs) {

            this.reverseCidrs = reverseCidrs;
            return this;
        }
        public Builder reverseCidrs(String... reverseCidrs) {
            return reverseCidrs(List.of(reverseCidrs));
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<ClusterRkeConfigDnsToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterRkeConfigDnsToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable ClusterRkeConfigDnsUpdateStrategy updateStrategy) {

            this.updateStrategy = updateStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder upstreamNameservers(@Nullable List<String> upstreamNameservers) {

            this.upstreamNameservers = upstreamNameservers;
            return this;
        }
        public Builder upstreamNameservers(String... upstreamNameservers) {
            return upstreamNameservers(List.of(upstreamNameservers));
        }
        public ClusterRkeConfigDns build() {
            final var _resultValue = new ClusterRkeConfigDns();
            _resultValue.linearAutoscalerParams = linearAutoscalerParams;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.nodelocal = nodelocal;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.reverseCidrs = reverseCidrs;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            _resultValue.upstreamNameservers = upstreamNameservers;
            return _resultValue;
        }
    }
}
