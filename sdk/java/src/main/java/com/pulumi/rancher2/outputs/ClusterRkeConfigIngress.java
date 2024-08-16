// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigIngressToleration;
import com.pulumi.rancher2.outputs.ClusterRkeConfigIngressUpdateStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigIngress {
    /**
     * @return Enable ingress default backend. Default: `true` (bool)
     * 
     */
    private @Nullable Boolean defaultBackend;
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    private @Nullable String dnsPolicy;
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    private @Nullable Map<String,String> extraArgs;
    /**
     * @return HTTP port for RKE Ingress (int)
     * 
     */
    private @Nullable Integer httpPort;
    /**
     * @return HTTPS port for RKE Ingress (int)
     * 
     */
    private @Nullable Integer httpsPort;
    /**
     * @return Network mode for RKE Ingress (string)
     * 
     */
    private @Nullable String networkMode;
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    private @Nullable Map<String,String> nodeSelector;
    /**
     * @return RKE options for network (map)
     * 
     */
    private @Nullable Map<String,String> options;
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    private @Nullable String provider;
    /**
     * @return Ingress add-on tolerations
     * 
     */
    private @Nullable List<ClusterRkeConfigIngressToleration> tolerations;
    /**
     * @return Update daemon set strategy
     * 
     */
    private @Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy;

    private ClusterRkeConfigIngress() {}
    /**
     * @return Enable ingress default backend. Default: `true` (bool)
     * 
     */
    public Optional<Boolean> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    /**
     * @return Ingress controller DNS policy. `ClusterFirstWithHostNet`, `ClusterFirst`, `Default`, and `None` are supported. [K8S dns Policy](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy) (string)
     * 
     */
    public Optional<String> dnsPolicy() {
        return Optional.ofNullable(this.dnsPolicy);
    }
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Map<String,String> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return HTTP port for RKE Ingress (int)
     * 
     */
    public Optional<Integer> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * @return HTTPS port for RKE Ingress (int)
     * 
     */
    public Optional<Integer> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * @return Network mode for RKE Ingress (string)
     * 
     */
    public Optional<String> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Map<String,String> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * @return RKE options for network (map)
     * 
     */
    public Map<String,String> options() {
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
     * @return Ingress add-on tolerations
     * 
     */
    public List<ClusterRkeConfigIngressToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return Update daemon set strategy
     * 
     */
    public Optional<ClusterRkeConfigIngressUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean defaultBackend;
        private @Nullable String dnsPolicy;
        private @Nullable Map<String,String> extraArgs;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable String networkMode;
        private @Nullable Map<String,String> nodeSelector;
        private @Nullable Map<String,String> options;
        private @Nullable String provider;
        private @Nullable List<ClusterRkeConfigIngressToleration> tolerations;
        private @Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy;
        public Builder() {}
        public Builder(ClusterRkeConfigIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.extraArgs = defaults.extraArgs;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.networkMode = defaults.networkMode;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        @CustomType.Setter
        public Builder defaultBackend(@Nullable Boolean defaultBackend) {

            this.defaultBackend = defaultBackend;
            return this;
        }
        @CustomType.Setter
        public Builder dnsPolicy(@Nullable String dnsPolicy) {

            this.dnsPolicy = dnsPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,String> extraArgs) {

            this.extraArgs = extraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(@Nullable Integer httpPort) {

            this.httpPort = httpPort;
            return this;
        }
        @CustomType.Setter
        public Builder httpsPort(@Nullable Integer httpsPort) {

            this.httpsPort = httpsPort;
            return this;
        }
        @CustomType.Setter
        public Builder networkMode(@Nullable String networkMode) {

            this.networkMode = networkMode;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,String> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,String> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<ClusterRkeConfigIngressToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterRkeConfigIngressToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable ClusterRkeConfigIngressUpdateStrategy updateStrategy) {

            this.updateStrategy = updateStrategy;
            return this;
        }
        public ClusterRkeConfigIngress build() {
            final var _resultValue = new ClusterRkeConfigIngress();
            _resultValue.defaultBackend = defaultBackend;
            _resultValue.dnsPolicy = dnsPolicy;
            _resultValue.extraArgs = extraArgs;
            _resultValue.httpPort = httpPort;
            _resultValue.httpsPort = httpsPort;
            _resultValue.networkMode = networkMode;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            return _resultValue;
        }
    }
}
