// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateAmazonec2ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateAmazonec2ConfigArgs Empty = new NodeTemplateAmazonec2ConfigArgs();

    /**
     * AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * AWS machine image (string)
     * 
     */
    @Import(name="ami", required=true)
    private Output<String> ami;

    /**
     * @return AWS machine image (string)
     * 
     */
    public Output<String> ami() {
        return this.ami;
    }

    /**
     * AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    @Import(name="blockDurationMinutes")
    private @Nullable Output<String> blockDurationMinutes;

    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    public Optional<Output<String>> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }

    /**
     * AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Encrypt EBS volume. Default `false` (bool)
     * 
     */
    @Import(name="encryptEbsVolume")
    private @Nullable Output<Boolean> encryptEbsVolume;

    /**
     * @return Encrypt EBS volume. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> encryptEbsVolume() {
        return Optional.ofNullable(this.encryptEbsVolume);
    }

    /**
     * Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Enables or disables the HTTP metadata endpoint on your instances (string)
     * 
     */
    @Import(name="httpEndpoint")
    private @Nullable Output<String> httpEndpoint;

    /**
     * @return Enables or disables the HTTP metadata endpoint on your instances (string)
     * 
     */
    public Optional<Output<String>> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    /**
     * The state of token usage for your instance metadata requests (string)
     * 
     */
    @Import(name="httpTokens")
    private @Nullable Output<String> httpTokens;

    /**
     * @return The state of token usage for your instance metadata requests (string)
     * 
     */
    public Optional<Output<String>> httpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }

    /**
     * AWS IAM Instance Profile (string)
     * 
     */
    @Import(name="iamInstanceProfile")
    private @Nullable Output<String> iamInstanceProfile;

    /**
     * @return AWS IAM Instance Profile (string)
     * 
     */
    public Optional<Output<String>> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }

    /**
     * Disable SSL when sending requests (bool)
     * 
     */
    @Import(name="insecureTransport")
    private @Nullable Output<Boolean> insecureTransport;

    /**
     * @return Disable SSL when sending requests (bool)
     * 
     */
    public Optional<Output<Boolean>> insecureTransport() {
        return Optional.ofNullable(this.insecureTransport);
    }

    /**
     * AWS instance type. Default `t2.micro` (string)
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return AWS instance type. Default `t2.micro` (string)
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * OpenStack keypair to use to SSH to the instance (string)
     * 
     */
    @Import(name="keypairName")
    private @Nullable Output<String> keypairName;

    /**
     * @return OpenStack keypair to use to SSH to the instance (string)
     * 
     */
    public Optional<Output<String>> keypairName() {
        return Optional.ofNullable(this.keypairName);
    }

    /**
     * Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * Set this flag to enable CloudWatch monitoring. Deafult `false` (bool)
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<Boolean> monitoring;

    /**
     * @return Set this flag to enable CloudWatch monitoring. Deafult `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * Make the specified port number accessible from the Internet. (list)
     * 
     */
    @Import(name="openPorts")
    private @Nullable Output<List<String>> openPorts;

    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    public Optional<Output<List<String>>> openPorts() {
        return Optional.ofNullable(this.openPorts);
    }

    /**
     * Only use a private IP address. Default `false` (bool)
     * 
     */
    @Import(name="privateAddressOnly")
    private @Nullable Output<Boolean> privateAddressOnly;

    /**
     * @return Only use a private IP address. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> privateAddressOnly() {
        return Optional.ofNullable(this.privateAddressOnly);
    }

    /**
     * AWS region. (string)
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return AWS region. (string)
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    @Import(name="requestSpotInstance")
    private @Nullable Output<Boolean> requestSpotInstance;

    /**
     * @return Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> requestSpotInstance() {
        return Optional.ofNullable(this.requestSpotInstance);
    }

    /**
     * Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    @Import(name="retries")
    private @Nullable Output<String> retries;

    /**
     * @return Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    public Optional<Output<String>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * AWS root disk size (in GB). Default `16` (string)
     * 
     */
    @Import(name="rootSize")
    private @Nullable Output<String> rootSize;

    /**
     * @return AWS root disk size (in GB). Default `16` (string)
     * 
     */
    public Optional<Output<String>> rootSize() {
        return Optional.ofNullable(this.rootSize);
    }

    /**
     * AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * Skip adding default rules to security groups (bool)
     * 
     */
    @Import(name="securityGroupReadonly")
    private @Nullable Output<Boolean> securityGroupReadonly;

    /**
     * @return Skip adding default rules to security groups (bool)
     * 
     */
    public Optional<Output<Boolean>> securityGroupReadonly() {
        return Optional.ofNullable(this.securityGroupReadonly);
    }

    /**
     * AWS VPC security group. (list)
     * 
     */
    @Import(name="securityGroups", required=true)
    private Output<List<String>> securityGroups;

    /**
     * @return AWS VPC security group. (list)
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }

    /**
     * AWS Session Token (string)
     * 
     */
    @Import(name="sessionToken")
    private @Nullable Output<String> sessionToken;

    /**
     * @return AWS Session Token (string)
     * 
     */
    public Optional<Output<String>> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }

    /**
     * AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    @Import(name="spotPrice")
    private @Nullable Output<String> spotPrice;

    /**
     * @return AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    public Optional<Output<String>> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }

    @Import(name="sshKeypath")
    private @Nullable Output<String> sshKeypath;

    public Optional<Output<String>> sshKeypath() {
        return Optional.ofNullable(this.sshKeypath);
    }

    /**
     * Set the name of the ssh user (string)
     * 
     */
    @Import(name="sshUser")
    private @Nullable Output<String> sshUser;

    /**
     * @return Set the name of the ssh user (string)
     * 
     */
    public Optional<Output<String>> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }

    /**
     * AWS VPC subnet id (string)
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return AWS VPC subnet id (string)
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * AWS Tags (e.g. key1,value1,key2,value2) (string)
     * 
     */
    @Import(name="tags")
    private @Nullable Output<String> tags;

    /**
     * @return AWS Tags (e.g. key1,value1,key2,value2) (string)
     * 
     */
    public Optional<Output<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    @Import(name="useEbsOptimizedInstance")
    private @Nullable Output<Boolean> useEbsOptimizedInstance;

    /**
     * @return Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> useEbsOptimizedInstance() {
        return Optional.ofNullable(this.useEbsOptimizedInstance);
    }

    /**
     * Force the usage of private IP address. Default `false` (bool)
     * 
     */
    @Import(name="usePrivateAddress")
    private @Nullable Output<Boolean> usePrivateAddress;

    /**
     * @return Force the usage of private IP address. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> usePrivateAddress() {
        return Optional.ofNullable(this.usePrivateAddress);
    }

    /**
     * Path to file with cloud-init user data (string)
     * 
     * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
     * 
     */
    @Import(name="userdata")
    private @Nullable Output<String> userdata;

    /**
     * @return Path to file with cloud-init user data (string)
     * 
     * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
     * 
     */
    public Optional<Output<String>> userdata() {
        return Optional.ofNullable(this.userdata);
    }

    /**
     * Amazon EBS volume type. Default `gp2` (string)
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    /**
     * @return Amazon EBS volume type. Default `gp2` (string)
     * 
     */
    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    /**
     * AWS VPC id. (string)
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return AWS VPC id. (string)
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private NodeTemplateAmazonec2ConfigArgs() {}

    private NodeTemplateAmazonec2ConfigArgs(NodeTemplateAmazonec2ConfigArgs $) {
        this.accessKey = $.accessKey;
        this.ami = $.ami;
        this.blockDurationMinutes = $.blockDurationMinutes;
        this.deviceName = $.deviceName;
        this.encryptEbsVolume = $.encryptEbsVolume;
        this.endpoint = $.endpoint;
        this.httpEndpoint = $.httpEndpoint;
        this.httpTokens = $.httpTokens;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.insecureTransport = $.insecureTransport;
        this.instanceType = $.instanceType;
        this.keypairName = $.keypairName;
        this.kmsKey = $.kmsKey;
        this.monitoring = $.monitoring;
        this.openPorts = $.openPorts;
        this.privateAddressOnly = $.privateAddressOnly;
        this.region = $.region;
        this.requestSpotInstance = $.requestSpotInstance;
        this.retries = $.retries;
        this.rootSize = $.rootSize;
        this.secretKey = $.secretKey;
        this.securityGroupReadonly = $.securityGroupReadonly;
        this.securityGroups = $.securityGroups;
        this.sessionToken = $.sessionToken;
        this.spotPrice = $.spotPrice;
        this.sshKeypath = $.sshKeypath;
        this.sshUser = $.sshUser;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.useEbsOptimizedInstance = $.useEbsOptimizedInstance;
        this.usePrivateAddress = $.usePrivateAddress;
        this.userdata = $.userdata;
        this.volumeType = $.volumeType;
        this.vpcId = $.vpcId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateAmazonec2ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateAmazonec2ConfigArgs $;

        public Builder() {
            $ = new NodeTemplateAmazonec2ConfigArgs();
        }

        public Builder(NodeTemplateAmazonec2ConfigArgs defaults) {
            $ = new NodeTemplateAmazonec2ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param ami AWS machine image (string)
         * 
         * @return builder
         * 
         */
        public Builder ami(Output<String> ami) {
            $.ami = ami;
            return this;
        }

        /**
         * @param ami AWS machine image (string)
         * 
         * @return builder
         * 
         */
        public Builder ami(String ami) {
            return ami(Output.of(ami));
        }

        /**
         * @param blockDurationMinutes AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
         * 
         * @return builder
         * 
         */
        public Builder blockDurationMinutes(@Nullable Output<String> blockDurationMinutes) {
            $.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        /**
         * @param blockDurationMinutes AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
         * 
         * @return builder
         * 
         */
        public Builder blockDurationMinutes(String blockDurationMinutes) {
            return blockDurationMinutes(Output.of(blockDurationMinutes));
        }

        /**
         * @param deviceName AWS root device name. Default `/dev/sda1` (string)
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName AWS root device name. Default `/dev/sda1` (string)
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param encryptEbsVolume Encrypt EBS volume. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder encryptEbsVolume(@Nullable Output<Boolean> encryptEbsVolume) {
            $.encryptEbsVolume = encryptEbsVolume;
            return this;
        }

        /**
         * @param encryptEbsVolume Encrypt EBS volume. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder encryptEbsVolume(Boolean encryptEbsVolume) {
            return encryptEbsVolume(Output.of(encryptEbsVolume));
        }

        /**
         * @param endpoint Optional endpoint URL (hostname only or fully qualified URI) (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Optional endpoint URL (hostname only or fully qualified URI) (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances (string)
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances (string)
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(String httpEndpoint) {
            return httpEndpoint(Output.of(httpEndpoint));
        }

        /**
         * @param httpTokens The state of token usage for your instance metadata requests (string)
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(@Nullable Output<String> httpTokens) {
            $.httpTokens = httpTokens;
            return this;
        }

        /**
         * @param httpTokens The state of token usage for your instance metadata requests (string)
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(String httpTokens) {
            return httpTokens(Output.of(httpTokens));
        }

        /**
         * @param iamInstanceProfile AWS IAM Instance Profile (string)
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * @param iamInstanceProfile AWS IAM Instance Profile (string)
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            return iamInstanceProfile(Output.of(iamInstanceProfile));
        }

        /**
         * @param insecureTransport Disable SSL when sending requests (bool)
         * 
         * @return builder
         * 
         */
        public Builder insecureTransport(@Nullable Output<Boolean> insecureTransport) {
            $.insecureTransport = insecureTransport;
            return this;
        }

        /**
         * @param insecureTransport Disable SSL when sending requests (bool)
         * 
         * @return builder
         * 
         */
        public Builder insecureTransport(Boolean insecureTransport) {
            return insecureTransport(Output.of(insecureTransport));
        }

        /**
         * @param instanceType AWS instance type. Default `t2.micro` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType AWS instance type. Default `t2.micro` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param keypairName OpenStack keypair to use to SSH to the instance (string)
         * 
         * @return builder
         * 
         */
        public Builder keypairName(@Nullable Output<String> keypairName) {
            $.keypairName = keypairName;
            return this;
        }

        /**
         * @param keypairName OpenStack keypair to use to SSH to the instance (string)
         * 
         * @return builder
         * 
         */
        public Builder keypairName(String keypairName) {
            return keypairName(Output.of(keypairName));
        }

        /**
         * @param kmsKey Custom KMS key ID using the AWS Managed CMK (string)
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey Custom KMS key ID using the AWS Managed CMK (string)
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param monitoring Set this flag to enable CloudWatch monitoring. Deafult `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Set this flag to enable CloudWatch monitoring. Deafult `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder monitoring(Boolean monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param openPorts Make the specified port number accessible from the Internet. (list)
         * 
         * @return builder
         * 
         */
        public Builder openPorts(@Nullable Output<List<String>> openPorts) {
            $.openPorts = openPorts;
            return this;
        }

        /**
         * @param openPorts Make the specified port number accessible from the Internet. (list)
         * 
         * @return builder
         * 
         */
        public Builder openPorts(List<String> openPorts) {
            return openPorts(Output.of(openPorts));
        }

        /**
         * @param openPorts Make the specified port number accessible from the Internet. (list)
         * 
         * @return builder
         * 
         */
        public Builder openPorts(String... openPorts) {
            return openPorts(List.of(openPorts));
        }

        /**
         * @param privateAddressOnly Only use a private IP address. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder privateAddressOnly(@Nullable Output<Boolean> privateAddressOnly) {
            $.privateAddressOnly = privateAddressOnly;
            return this;
        }

        /**
         * @param privateAddressOnly Only use a private IP address. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder privateAddressOnly(Boolean privateAddressOnly) {
            return privateAddressOnly(Output.of(privateAddressOnly));
        }

        /**
         * @param region AWS region. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region AWS region. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestSpotInstance Set this flag to request spot instance. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder requestSpotInstance(@Nullable Output<Boolean> requestSpotInstance) {
            $.requestSpotInstance = requestSpotInstance;
            return this;
        }

        /**
         * @param requestSpotInstance Set this flag to request spot instance. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder requestSpotInstance(Boolean requestSpotInstance) {
            return requestSpotInstance(Output.of(requestSpotInstance));
        }

        /**
         * @param retries Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<String> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
         * 
         * @return builder
         * 
         */
        public Builder retries(String retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param rootSize AWS root disk size (in GB). Default `16` (string)
         * 
         * @return builder
         * 
         */
        public Builder rootSize(@Nullable Output<String> rootSize) {
            $.rootSize = rootSize;
            return this;
        }

        /**
         * @param rootSize AWS root disk size (in GB). Default `16` (string)
         * 
         * @return builder
         * 
         */
        public Builder rootSize(String rootSize) {
            return rootSize(Output.of(rootSize));
        }

        /**
         * @param secretKey AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param securityGroupReadonly Skip adding default rules to security groups (bool)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupReadonly(@Nullable Output<Boolean> securityGroupReadonly) {
            $.securityGroupReadonly = securityGroupReadonly;
            return this;
        }

        /**
         * @param securityGroupReadonly Skip adding default rules to security groups (bool)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupReadonly(Boolean securityGroupReadonly) {
            return securityGroupReadonly(Output.of(securityGroupReadonly));
        }

        /**
         * @param securityGroups AWS VPC security group. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups AWS VPC security group. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups AWS VPC security group. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param sessionToken AWS Session Token (string)
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(@Nullable Output<String> sessionToken) {
            $.sessionToken = sessionToken;
            return this;
        }

        /**
         * @param sessionToken AWS Session Token (string)
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(String sessionToken) {
            return sessionToken(Output.of(sessionToken));
        }

        /**
         * @param spotPrice AWS spot instance bid price (in dollar). Default `0.50` (string)
         * 
         * @return builder
         * 
         */
        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            $.spotPrice = spotPrice;
            return this;
        }

        /**
         * @param spotPrice AWS spot instance bid price (in dollar). Default `0.50` (string)
         * 
         * @return builder
         * 
         */
        public Builder spotPrice(String spotPrice) {
            return spotPrice(Output.of(spotPrice));
        }

        public Builder sshKeypath(@Nullable Output<String> sshKeypath) {
            $.sshKeypath = sshKeypath;
            return this;
        }

        public Builder sshKeypath(String sshKeypath) {
            return sshKeypath(Output.of(sshKeypath));
        }

        /**
         * @param sshUser Set the name of the ssh user (string)
         * 
         * @return builder
         * 
         */
        public Builder sshUser(@Nullable Output<String> sshUser) {
            $.sshUser = sshUser;
            return this;
        }

        /**
         * @param sshUser Set the name of the ssh user (string)
         * 
         * @return builder
         * 
         */
        public Builder sshUser(String sshUser) {
            return sshUser(Output.of(sshUser));
        }

        /**
         * @param subnetId AWS VPC subnet id (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId AWS VPC subnet id (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags AWS Tags (e.g. key1,value1,key2,value2) (string)
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags AWS Tags (e.g. key1,value1,key2,value2) (string)
         * 
         * @return builder
         * 
         */
        public Builder tags(String tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param useEbsOptimizedInstance Create an EBS optimized instance. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder useEbsOptimizedInstance(@Nullable Output<Boolean> useEbsOptimizedInstance) {
            $.useEbsOptimizedInstance = useEbsOptimizedInstance;
            return this;
        }

        /**
         * @param useEbsOptimizedInstance Create an EBS optimized instance. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder useEbsOptimizedInstance(Boolean useEbsOptimizedInstance) {
            return useEbsOptimizedInstance(Output.of(useEbsOptimizedInstance));
        }

        /**
         * @param usePrivateAddress Force the usage of private IP address. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder usePrivateAddress(@Nullable Output<Boolean> usePrivateAddress) {
            $.usePrivateAddress = usePrivateAddress;
            return this;
        }

        /**
         * @param usePrivateAddress Force the usage of private IP address. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder usePrivateAddress(Boolean usePrivateAddress) {
            return usePrivateAddress(Output.of(usePrivateAddress));
        }

        /**
         * @param userdata Path to file with cloud-init user data (string)
         * 
         * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
         * 
         * @return builder
         * 
         */
        public Builder userdata(@Nullable Output<String> userdata) {
            $.userdata = userdata;
            return this;
        }

        /**
         * @param userdata Path to file with cloud-init user data (string)
         * 
         * &gt; **Note:**: You need to install the Hetzner Docker Machine Driver first as shown as in the examples section.
         * 
         * @return builder
         * 
         */
        public Builder userdata(String userdata) {
            return userdata(Output.of(userdata));
        }

        /**
         * @param volumeType Amazon EBS volume type. Default `gp2` (string)
         * 
         * @return builder
         * 
         */
        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType Amazon EBS volume type. Default `gp2` (string)
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        /**
         * @param vpcId AWS VPC id. (string)
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId AWS VPC id. (string)
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param zone AWS zone for instance (i.e. a,b,c,d,e) (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone AWS zone for instance (i.e. a,b,c,d,e) (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public NodeTemplateAmazonec2ConfigArgs build() {
            $.ami = Objects.requireNonNull($.ami, "expected parameter 'ami' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.securityGroups = Objects.requireNonNull($.securityGroups, "expected parameter 'securityGroups' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
