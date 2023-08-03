// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateVsphereConfig {
    /**
     * @return vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
     * 
     */
    private @Nullable String boot2dockerUrl;
    /**
     * @return vSphere vm configuration parameters (used for guestinfo) (list)
     * 
     */
    private @Nullable List<String> cfgparams;
    /**
     * @return If you choose creation type vm (clone vm) a name of what vm you want to clone is required. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String cloneFrom;
    /**
     * @return Cloud Config YAML content to inject as user-data. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String cloudConfig;
    /**
     * @return vSphere cloud-init file or url to set in the guestinfo (string)
     * 
     */
    private @Nullable String cloudinit;
    /**
     * @return If you choose to clone from a content library template specify the name of the library. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String contentLibrary;
    /**
     * @return CPU count, Default `2` (string)
     * 
     */
    private @Nullable String cpuCount;
    /**
     * @return Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy`. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String creationType;
    /**
     * @return vSphere custom attributes, format key/value e.g. `200=my custom value`. From Rancher v2.3.3 (List)
     * 
     */
    private @Nullable List<String> customAttributes;
    /**
     * @return vSphere datacenter for docker VM (string)
     * 
     */
    private @Nullable String datacenter;
    /**
     * @return vSphere datastore for docker VM (string)
     * 
     */
    private @Nullable String datastore;
    /**
     * @return vSphere datastore cluster for virtual machine. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String datastoreCluster;
    /**
     * @return Disk size if using managed disk. For Rancher v2.3.x and above. Default `30` (string)
     * 
     */
    private @Nullable String diskSize;
    /**
     * @return vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
     * 
     */
    private @Nullable String folder;
    /**
     * @return vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
     * 
     */
    private @Nullable String hostsystem;
    /**
     * @return Memory size (in GiB), Default `4` (string)
     * 
     */
    private @Nullable String memorySize;
    /**
     * @return vSphere network where the docker VM will be attached (list)
     * 
     */
    private @Nullable List<String> networks;
    /**
     * @return Set the password for the XML-RPC API authentication (string)
     * 
     */
    private @Nullable String password;
    /**
     * @return vSphere resource pool for docker VM (string)
     * 
     */
    private @Nullable String pool;
    /**
     * @return SSH password (string)
     * 
     */
    private @Nullable String sshPassword;
    /**
     * @return SSH port. Default `22` (string)
     * 
     */
    private @Nullable String sshPort;
    /**
     * @return Set the name of the ssh user (string)
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return If using a non-B2D image the uploaded keys will need chown&#39;ed. Default `staff`. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String sshUserGroup;
    /**
     * @return AWS Tags (e.g. key1,value1,key2,value2) (string)
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return OpenStack username (string)
     * 
     */
    private @Nullable String username;
    /**
     * @return vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
     * 
     */
    private @Nullable String vappIpAllocationPolicy;
    /**
     * @return vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
     * 
     */
    private @Nullable String vappIpProtocol;
    /**
     * @return vSphere vApp properties (list)
     * 
     */
    private @Nullable List<String> vappProperties;
    /**
     * @return vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
     * 
     */
    private @Nullable String vappTransport;
    /**
     * @return vSphere IP/hostname for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private @Nullable String vcenter;
    /**
     * @return vSphere Port for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x. Default `443` (string)
     * 
     */
    private @Nullable String vcenterPort;

    private NodeTemplateVsphereConfig() {}
    /**
     * @return vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
     * 
     */
    public Optional<String> boot2dockerUrl() {
        return Optional.ofNullable(this.boot2dockerUrl);
    }
    /**
     * @return vSphere vm configuration parameters (used for guestinfo) (list)
     * 
     */
    public List<String> cfgparams() {
        return this.cfgparams == null ? List.of() : this.cfgparams;
    }
    /**
     * @return If you choose creation type vm (clone vm) a name of what vm you want to clone is required. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> cloneFrom() {
        return Optional.ofNullable(this.cloneFrom);
    }
    /**
     * @return Cloud Config YAML content to inject as user-data. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> cloudConfig() {
        return Optional.ofNullable(this.cloudConfig);
    }
    /**
     * @return vSphere cloud-init file or url to set in the guestinfo (string)
     * 
     */
    public Optional<String> cloudinit() {
        return Optional.ofNullable(this.cloudinit);
    }
    /**
     * @return If you choose to clone from a content library template specify the name of the library. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> contentLibrary() {
        return Optional.ofNullable(this.contentLibrary);
    }
    /**
     * @return CPU count, Default `2` (string)
     * 
     */
    public Optional<String> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }
    /**
     * @return Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> creationType() {
        return Optional.ofNullable(this.creationType);
    }
    /**
     * @return vSphere custom attributes, format key/value e.g. `200=my custom value`. From Rancher v2.3.3 (List)
     * 
     */
    public List<String> customAttributes() {
        return this.customAttributes == null ? List.of() : this.customAttributes;
    }
    /**
     * @return vSphere datacenter for docker VM (string)
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }
    /**
     * @return vSphere datastore for docker VM (string)
     * 
     */
    public Optional<String> datastore() {
        return Optional.ofNullable(this.datastore);
    }
    /**
     * @return vSphere datastore cluster for virtual machine. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> datastoreCluster() {
        return Optional.ofNullable(this.datastoreCluster);
    }
    /**
     * @return Disk size if using managed disk. For Rancher v2.3.x and above. Default `30` (string)
     * 
     */
    public Optional<String> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * @return vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
     * 
     */
    public Optional<String> hostsystem() {
        return Optional.ofNullable(this.hostsystem);
    }
    /**
     * @return Memory size (in GiB), Default `4` (string)
     * 
     */
    public Optional<String> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    /**
     * @return vSphere network where the docker VM will be attached (list)
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return Set the password for the XML-RPC API authentication (string)
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return vSphere resource pool for docker VM (string)
     * 
     */
    public Optional<String> pool() {
        return Optional.ofNullable(this.pool);
    }
    /**
     * @return SSH password (string)
     * 
     */
    public Optional<String> sshPassword() {
        return Optional.ofNullable(this.sshPassword);
    }
    /**
     * @return SSH port. Default `22` (string)
     * 
     */
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    /**
     * @return Set the name of the ssh user (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return If using a non-B2D image the uploaded keys will need chown&#39;ed. Default `staff`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUserGroup() {
        return Optional.ofNullable(this.sshUserGroup);
    }
    /**
     * @return AWS Tags (e.g. key1,value1,key2,value2) (string)
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return OpenStack username (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
     * 
     */
    public Optional<String> vappIpAllocationPolicy() {
        return Optional.ofNullable(this.vappIpAllocationPolicy);
    }
    /**
     * @return vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
     * 
     */
    public Optional<String> vappIpProtocol() {
        return Optional.ofNullable(this.vappIpProtocol);
    }
    /**
     * @return vSphere vApp properties (list)
     * 
     */
    public List<String> vappProperties() {
        return this.vappProperties == null ? List.of() : this.vappProperties;
    }
    /**
     * @return vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
     * 
     */
    public Optional<String> vappTransport() {
        return Optional.ofNullable(this.vappTransport);
    }
    /**
     * @return vSphere IP/hostname for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> vcenter() {
        return Optional.ofNullable(this.vcenter);
    }
    /**
     * @return vSphere Port for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x. Default `443` (string)
     * 
     */
    public Optional<String> vcenterPort() {
        return Optional.ofNullable(this.vcenterPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateVsphereConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String boot2dockerUrl;
        private @Nullable List<String> cfgparams;
        private @Nullable String cloneFrom;
        private @Nullable String cloudConfig;
        private @Nullable String cloudinit;
        private @Nullable String contentLibrary;
        private @Nullable String cpuCount;
        private @Nullable String creationType;
        private @Nullable List<String> customAttributes;
        private @Nullable String datacenter;
        private @Nullable String datastore;
        private @Nullable String datastoreCluster;
        private @Nullable String diskSize;
        private @Nullable String folder;
        private @Nullable String hostsystem;
        private @Nullable String memorySize;
        private @Nullable List<String> networks;
        private @Nullable String password;
        private @Nullable String pool;
        private @Nullable String sshPassword;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String sshUserGroup;
        private @Nullable List<String> tags;
        private @Nullable String username;
        private @Nullable String vappIpAllocationPolicy;
        private @Nullable String vappIpProtocol;
        private @Nullable List<String> vappProperties;
        private @Nullable String vappTransport;
        private @Nullable String vcenter;
        private @Nullable String vcenterPort;
        public Builder() {}
        public Builder(NodeTemplateVsphereConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boot2dockerUrl = defaults.boot2dockerUrl;
    	      this.cfgparams = defaults.cfgparams;
    	      this.cloneFrom = defaults.cloneFrom;
    	      this.cloudConfig = defaults.cloudConfig;
    	      this.cloudinit = defaults.cloudinit;
    	      this.contentLibrary = defaults.contentLibrary;
    	      this.cpuCount = defaults.cpuCount;
    	      this.creationType = defaults.creationType;
    	      this.customAttributes = defaults.customAttributes;
    	      this.datacenter = defaults.datacenter;
    	      this.datastore = defaults.datastore;
    	      this.datastoreCluster = defaults.datastoreCluster;
    	      this.diskSize = defaults.diskSize;
    	      this.folder = defaults.folder;
    	      this.hostsystem = defaults.hostsystem;
    	      this.memorySize = defaults.memorySize;
    	      this.networks = defaults.networks;
    	      this.password = defaults.password;
    	      this.pool = defaults.pool;
    	      this.sshPassword = defaults.sshPassword;
    	      this.sshPort = defaults.sshPort;
    	      this.sshUser = defaults.sshUser;
    	      this.sshUserGroup = defaults.sshUserGroup;
    	      this.tags = defaults.tags;
    	      this.username = defaults.username;
    	      this.vappIpAllocationPolicy = defaults.vappIpAllocationPolicy;
    	      this.vappIpProtocol = defaults.vappIpProtocol;
    	      this.vappProperties = defaults.vappProperties;
    	      this.vappTransport = defaults.vappTransport;
    	      this.vcenter = defaults.vcenter;
    	      this.vcenterPort = defaults.vcenterPort;
        }

        @CustomType.Setter
        public Builder boot2dockerUrl(@Nullable String boot2dockerUrl) {
            this.boot2dockerUrl = boot2dockerUrl;
            return this;
        }
        @CustomType.Setter
        public Builder cfgparams(@Nullable List<String> cfgparams) {
            this.cfgparams = cfgparams;
            return this;
        }
        public Builder cfgparams(String... cfgparams) {
            return cfgparams(List.of(cfgparams));
        }
        @CustomType.Setter
        public Builder cloneFrom(@Nullable String cloneFrom) {
            this.cloneFrom = cloneFrom;
            return this;
        }
        @CustomType.Setter
        public Builder cloudConfig(@Nullable String cloudConfig) {
            this.cloudConfig = cloudConfig;
            return this;
        }
        @CustomType.Setter
        public Builder cloudinit(@Nullable String cloudinit) {
            this.cloudinit = cloudinit;
            return this;
        }
        @CustomType.Setter
        public Builder contentLibrary(@Nullable String contentLibrary) {
            this.contentLibrary = contentLibrary;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCount(@Nullable String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        @CustomType.Setter
        public Builder creationType(@Nullable String creationType) {
            this.creationType = creationType;
            return this;
        }
        @CustomType.Setter
        public Builder customAttributes(@Nullable List<String> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(String... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }
        @CustomType.Setter
        public Builder datacenter(@Nullable String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder datastore(@Nullable String datastore) {
            this.datastore = datastore;
            return this;
        }
        @CustomType.Setter
        public Builder datastoreCluster(@Nullable String datastoreCluster) {
            this.datastoreCluster = datastoreCluster;
            return this;
        }
        @CustomType.Setter
        public Builder diskSize(@Nullable String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {
            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder hostsystem(@Nullable String hostsystem) {
            this.hostsystem = hostsystem;
            return this;
        }
        @CustomType.Setter
        public Builder memorySize(@Nullable String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder pool(@Nullable String pool) {
            this.pool = pool;
            return this;
        }
        @CustomType.Setter
        public Builder sshPassword(@Nullable String sshPassword) {
            this.sshPassword = sshPassword;
            return this;
        }
        @CustomType.Setter
        public Builder sshPort(@Nullable String sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {
            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder sshUserGroup(@Nullable String sshUserGroup) {
            this.sshUserGroup = sshUserGroup;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder vappIpAllocationPolicy(@Nullable String vappIpAllocationPolicy) {
            this.vappIpAllocationPolicy = vappIpAllocationPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder vappIpProtocol(@Nullable String vappIpProtocol) {
            this.vappIpProtocol = vappIpProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder vappProperties(@Nullable List<String> vappProperties) {
            this.vappProperties = vappProperties;
            return this;
        }
        public Builder vappProperties(String... vappProperties) {
            return vappProperties(List.of(vappProperties));
        }
        @CustomType.Setter
        public Builder vappTransport(@Nullable String vappTransport) {
            this.vappTransport = vappTransport;
            return this;
        }
        @CustomType.Setter
        public Builder vcenter(@Nullable String vcenter) {
            this.vcenter = vcenter;
            return this;
        }
        @CustomType.Setter
        public Builder vcenterPort(@Nullable String vcenterPort) {
            this.vcenterPort = vcenterPort;
            return this;
        }
        public NodeTemplateVsphereConfig build() {
            final var o = new NodeTemplateVsphereConfig();
            o.boot2dockerUrl = boot2dockerUrl;
            o.cfgparams = cfgparams;
            o.cloneFrom = cloneFrom;
            o.cloudConfig = cloudConfig;
            o.cloudinit = cloudinit;
            o.contentLibrary = contentLibrary;
            o.cpuCount = cpuCount;
            o.creationType = creationType;
            o.customAttributes = customAttributes;
            o.datacenter = datacenter;
            o.datastore = datastore;
            o.datastoreCluster = datastoreCluster;
            o.diskSize = diskSize;
            o.folder = folder;
            o.hostsystem = hostsystem;
            o.memorySize = memorySize;
            o.networks = networks;
            o.password = password;
            o.pool = pool;
            o.sshPassword = sshPassword;
            o.sshPort = sshPort;
            o.sshUser = sshUser;
            o.sshUserGroup = sshUserGroup;
            o.tags = tags;
            o.username = username;
            o.vappIpAllocationPolicy = vappIpAllocationPolicy;
            o.vappIpProtocol = vappIpProtocol;
            o.vappProperties = vappProperties;
            o.vappTransport = vappTransport;
            o.vcenter = vcenter;
            o.vcenterPort = vcenterPort;
            return o;
        }
    }
}
