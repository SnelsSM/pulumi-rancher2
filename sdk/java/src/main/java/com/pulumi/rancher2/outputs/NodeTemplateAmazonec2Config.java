// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateAmazonec2Config {
    /**
     * @return Outscale Access Key (string)
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return AWS machine image (string)
     * 
     */
    private String ami;
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    private @Nullable String blockDurationMinutes;
    /**
     * @return AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    private @Nullable String deviceName;
    /**
     * @return Encrypt EBS volume. Default `false` (bool)
     * 
     */
    private @Nullable Boolean encryptEbsVolume;
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return Enables or disables the HTTP metadata endpoint on your instances (string)
     * 
     */
    private @Nullable String httpEndpoint;
    /**
     * @return The state of token usage for your instance metadata requests (string)
     * 
     */
    private @Nullable String httpTokens;
    /**
     * @return AWS IAM Instance Profile (string)
     * 
     */
    private @Nullable String iamInstanceProfile;
    /**
     * @return Disable SSL when sending requests (bool)
     * 
     */
    private @Nullable Boolean insecureTransport;
    /**
     * @return Outscale VM type. Default `tinav2.c1r2p3` (string)
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    private @Nullable String kmsKey;
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean monitoring;
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    private @Nullable List<String> openPorts;
    /**
     * @return Only use a private IP address. Default `false` (bool)
     * 
     */
    private @Nullable Boolean privateAddressOnly;
    /**
     * @return AWS region. Default `eu-west-2` (string)
     * 
     */
    private String region;
    /**
     * @return Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    private @Nullable Boolean requestSpotInstance;
    /**
     * @return Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    private @Nullable String retries;
    /**
     * @return AWS root disk size (in GB). Default `16` (string)
     * 
     */
    private @Nullable String rootSize;
    /**
     * @return Outscale Secret Key (string)
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return Skip adding default rules to security groups (bool)
     * 
     */
    private @Nullable Boolean securityGroupReadonly;
    /**
     * @return AWS VPC security group. (list)
     * 
     */
    private List<String> securityGroups;
    /**
     * @return AWS Session Token (string)
     * 
     */
    private @Nullable String sessionToken;
    /**
     * @return AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    private @Nullable String spotPrice;
    private @Nullable String sshKeypath;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return AWS VPC subnet id (string)
     * 
     */
    private String subnetId;
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    private @Nullable String tags;
    /**
     * @return Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    private @Nullable Boolean useEbsOptimizedInstance;
    /**
     * @return Force the usage of private IP address. Default `false` (bool)
     * 
     */
    private @Nullable Boolean usePrivateAddress;
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
     * 
     */
    private @Nullable String userdata;
    /**
     * @return OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
     * 
     */
    private @Nullable String volumeType;
    /**
     * @return AWS VPC id. (string)
     * 
     */
    private String vpcId;
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    private String zone;

    private NodeTemplateAmazonec2Config() {}
    /**
     * @return Outscale Access Key (string)
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return AWS machine image (string)
     * 
     */
    public String ami() {
        return this.ami;
    }
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    public Optional<String> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * @return AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Encrypt EBS volume. Default `false` (bool)
     * 
     */
    public Optional<Boolean> encryptEbsVolume() {
        return Optional.ofNullable(this.encryptEbsVolume);
    }
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return Enables or disables the HTTP metadata endpoint on your instances (string)
     * 
     */
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    /**
     * @return The state of token usage for your instance metadata requests (string)
     * 
     */
    public Optional<String> httpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }
    /**
     * @return AWS IAM Instance Profile (string)
     * 
     */
    public Optional<String> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }
    /**
     * @return Disable SSL when sending requests (bool)
     * 
     */
    public Optional<Boolean> insecureTransport() {
        return Optional.ofNullable(this.insecureTransport);
    }
    /**
     * @return Outscale VM type. Default `tinav2.c1r2p3` (string)
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    public List<String> openPorts() {
        return this.openPorts == null ? List.of() : this.openPorts;
    }
    /**
     * @return Only use a private IP address. Default `false` (bool)
     * 
     */
    public Optional<Boolean> privateAddressOnly() {
        return Optional.ofNullable(this.privateAddressOnly);
    }
    /**
     * @return AWS region. Default `eu-west-2` (string)
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    public Optional<Boolean> requestSpotInstance() {
        return Optional.ofNullable(this.requestSpotInstance);
    }
    /**
     * @return Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    public Optional<String> retries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * @return AWS root disk size (in GB). Default `16` (string)
     * 
     */
    public Optional<String> rootSize() {
        return Optional.ofNullable(this.rootSize);
    }
    /**
     * @return Outscale Secret Key (string)
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Skip adding default rules to security groups (bool)
     * 
     */
    public Optional<Boolean> securityGroupReadonly() {
        return Optional.ofNullable(this.securityGroupReadonly);
    }
    /**
     * @return AWS VPC security group. (list)
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return AWS Session Token (string)
     * 
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * @return AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    public Optional<String> sshKeypath() {
        return Optional.ofNullable(this.sshKeypath);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return AWS VPC subnet id (string)
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    public Optional<Boolean> useEbsOptimizedInstance() {
        return Optional.ofNullable(this.useEbsOptimizedInstance);
    }
    /**
     * @return Force the usage of private IP address. Default `false` (bool)
     * 
     */
    public Optional<Boolean> usePrivateAddress() {
        return Optional.ofNullable(this.usePrivateAddress);
    }
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }
    /**
     * @return OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }
    /**
     * @return AWS VPC id. (string)
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateAmazonec2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private String ami;
        private @Nullable String blockDurationMinutes;
        private @Nullable String deviceName;
        private @Nullable Boolean encryptEbsVolume;
        private @Nullable String endpoint;
        private @Nullable String httpEndpoint;
        private @Nullable String httpTokens;
        private @Nullable String iamInstanceProfile;
        private @Nullable Boolean insecureTransport;
        private @Nullable String instanceType;
        private @Nullable String kmsKey;
        private @Nullable Boolean monitoring;
        private @Nullable List<String> openPorts;
        private @Nullable Boolean privateAddressOnly;
        private String region;
        private @Nullable Boolean requestSpotInstance;
        private @Nullable String retries;
        private @Nullable String rootSize;
        private @Nullable String secretKey;
        private @Nullable Boolean securityGroupReadonly;
        private List<String> securityGroups;
        private @Nullable String sessionToken;
        private @Nullable String spotPrice;
        private @Nullable String sshKeypath;
        private @Nullable String sshUser;
        private String subnetId;
        private @Nullable String tags;
        private @Nullable Boolean useEbsOptimizedInstance;
        private @Nullable Boolean usePrivateAddress;
        private @Nullable String userdata;
        private @Nullable String volumeType;
        private String vpcId;
        private String zone;
        public Builder() {}
        public Builder(NodeTemplateAmazonec2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.ami = defaults.ami;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.deviceName = defaults.deviceName;
    	      this.encryptEbsVolume = defaults.encryptEbsVolume;
    	      this.endpoint = defaults.endpoint;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpTokens = defaults.httpTokens;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.insecureTransport = defaults.insecureTransport;
    	      this.instanceType = defaults.instanceType;
    	      this.kmsKey = defaults.kmsKey;
    	      this.monitoring = defaults.monitoring;
    	      this.openPorts = defaults.openPorts;
    	      this.privateAddressOnly = defaults.privateAddressOnly;
    	      this.region = defaults.region;
    	      this.requestSpotInstance = defaults.requestSpotInstance;
    	      this.retries = defaults.retries;
    	      this.rootSize = defaults.rootSize;
    	      this.secretKey = defaults.secretKey;
    	      this.securityGroupReadonly = defaults.securityGroupReadonly;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sessionToken = defaults.sessionToken;
    	      this.spotPrice = defaults.spotPrice;
    	      this.sshKeypath = defaults.sshKeypath;
    	      this.sshUser = defaults.sshUser;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.useEbsOptimizedInstance = defaults.useEbsOptimizedInstance;
    	      this.usePrivateAddress = defaults.usePrivateAddress;
    	      this.userdata = defaults.userdata;
    	      this.volumeType = defaults.volumeType;
    	      this.vpcId = defaults.vpcId;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder ami(String ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }
        @CustomType.Setter
        public Builder blockDurationMinutes(@Nullable String blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder encryptEbsVolume(@Nullable Boolean encryptEbsVolume) {
            this.encryptEbsVolume = encryptEbsVolume;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(@Nullable String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpTokens(@Nullable String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        @CustomType.Setter
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        @CustomType.Setter
        public Builder insecureTransport(@Nullable Boolean insecureTransport) {
            this.insecureTransport = insecureTransport;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder openPorts(@Nullable List<String> openPorts) {
            this.openPorts = openPorts;
            return this;
        }
        public Builder openPorts(String... openPorts) {
            return openPorts(List.of(openPorts));
        }
        @CustomType.Setter
        public Builder privateAddressOnly(@Nullable Boolean privateAddressOnly) {
            this.privateAddressOnly = privateAddressOnly;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder requestSpotInstance(@Nullable Boolean requestSpotInstance) {
            this.requestSpotInstance = requestSpotInstance;
            return this;
        }
        @CustomType.Setter
        public Builder retries(@Nullable String retries) {
            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder rootSize(@Nullable String rootSize) {
            this.rootSize = rootSize;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupReadonly(@Nullable Boolean securityGroupReadonly) {
            this.securityGroupReadonly = securityGroupReadonly;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder sessionToken(@Nullable String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        @CustomType.Setter
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeypath(@Nullable String sshKeypath) {
            this.sshKeypath = sshKeypath;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {
            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder useEbsOptimizedInstance(@Nullable Boolean useEbsOptimizedInstance) {
            this.useEbsOptimizedInstance = useEbsOptimizedInstance;
            return this;
        }
        @CustomType.Setter
        public Builder usePrivateAddress(@Nullable Boolean usePrivateAddress) {
            this.usePrivateAddress = usePrivateAddress;
            return this;
        }
        @CustomType.Setter
        public Builder userdata(@Nullable String userdata) {
            this.userdata = userdata;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public NodeTemplateAmazonec2Config build() {
            final var o = new NodeTemplateAmazonec2Config();
            o.accessKey = accessKey;
            o.ami = ami;
            o.blockDurationMinutes = blockDurationMinutes;
            o.deviceName = deviceName;
            o.encryptEbsVolume = encryptEbsVolume;
            o.endpoint = endpoint;
            o.httpEndpoint = httpEndpoint;
            o.httpTokens = httpTokens;
            o.iamInstanceProfile = iamInstanceProfile;
            o.insecureTransport = insecureTransport;
            o.instanceType = instanceType;
            o.kmsKey = kmsKey;
            o.monitoring = monitoring;
            o.openPorts = openPorts;
            o.privateAddressOnly = privateAddressOnly;
            o.region = region;
            o.requestSpotInstance = requestSpotInstance;
            o.retries = retries;
            o.rootSize = rootSize;
            o.secretKey = secretKey;
            o.securityGroupReadonly = securityGroupReadonly;
            o.securityGroups = securityGroups;
            o.sessionToken = sessionToken;
            o.spotPrice = spotPrice;
            o.sshKeypath = sshKeypath;
            o.sshUser = sshUser;
            o.subnetId = subnetId;
            o.tags = tags;
            o.useEbsOptimizedInstance = useEbsOptimizedInstance;
            o.usePrivateAddress = usePrivateAddress;
            o.userdata = userdata;
            o.volumeType = volumeType;
            o.vpcId = vpcId;
            o.zone = zone;
            return o;
        }
    }
}
