// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.
//
// amazonec2, azure, digitalocean, harvester, linode, opennebula, openstack, outscale, hetzner and vsphere drivers are supported for node templates.
//
// **Note:** If you are upgrading to Rancher v2.3.3, please take a look to final section
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new rancher2 Node Template up to Rancher 2.1.x
//			_, err := rancher2.NewNodeTemplate(ctx, "foo", &rancher2.NodeTemplateArgs{
//				Name:        pulumi.String("foo"),
//				Description: pulumi.String("foo test"),
//				Amazonec2Config: &rancher2.NodeTemplateAmazonec2ConfigArgs{
//					AccessKey: pulumi.String("AWS_ACCESS_KEY"),
//					SecretKey: pulumi.String("<AWS_SECRET_KEY>"),
//					Ami:       pulumi.String("<AMI_ID>"),
//					Region:    pulumi.String("<REGION>"),
//					SecurityGroups: pulumi.StringArray{
//						pulumi.String("<AWS_SECURITY_GROUP>"),
//					},
//					SubnetId: pulumi.String("<SUBNET_ID>"),
//					VpcId:    pulumi.String("<VPC_ID>"),
//					Zone:     pulumi.String("<ZONE>"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new rancher2 Node Template from Rancher 2.2.x
//			foo, err := rancher2.NewCloudCredential(ctx, "foo", &rancher2.CloudCredentialArgs{
//				Name:        pulumi.String("foo"),
//				Description: pulumi.String("foo test"),
//				Amazonec2CredentialConfig: &rancher2.CloudCredentialAmazonec2CredentialConfigArgs{
//					AccessKey: pulumi.String("<AWS_ACCESS_KEY>"),
//					SecretKey: pulumi.String("<AWS_SECRET_KEY>"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewNodeTemplate(ctx, "foo", &rancher2.NodeTemplateArgs{
//				Name:              pulumi.String("foo"),
//				Description:       pulumi.String("foo test"),
//				CloudCredentialId: foo.ID(),
//				Amazonec2Config: &rancher2.NodeTemplateAmazonec2ConfigArgs{
//					Ami:    pulumi.String("<AMI_ID>"),
//					Region: pulumi.String("<REGION>"),
//					SecurityGroups: pulumi.StringArray{
//						pulumi.String("<AWS_SECURITY_GROUP>"),
//					},
//					SubnetId: pulumi.String("<SUBNET_ID>"),
//					VpcId:    pulumi.String("<VPC_ID>"),
//					Zone:     pulumi.String("<ZONE>"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Using the Harvester Node Driver
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Get imported harvester cluster info
//			foo_harvester, err := rancher2.LookupClusterV2(ctx, &rancher2.LookupClusterV2Args{
//				Name: "foo-harvester",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// Create a new Cloud Credential for an imported Harvester cluster
//			_, err = rancher2.NewCloudCredential(ctx, "foo-harvester", &rancher2.CloudCredentialArgs{
//				Name: pulumi.String("foo-harvester"),
//				HarvesterCredentialConfig: &rancher2.CloudCredentialHarvesterCredentialConfigArgs{
//					ClusterId:         pulumi.String(foo_harvester.ClusterV1Id),
//					ClusterType:       pulumi.String("imported"),
//					KubeconfigContent: pulumi.String(foo_harvester.KubeConfig),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Create a new rancher2 Node Template using harvester node_driver
//			_, err = rancher2.NewNodeTemplate(ctx, "foo-harvester", &rancher2.NodeTemplateArgs{
//				Name:              pulumi.String("foo-harvester"),
//				CloudCredentialId: foo_harvesterCloudCredential.ID(),
//				EngineInstallUrl:  pulumi.String("https://releases.rancher.com/install-docker/20.10.sh"),
//				HarvesterConfig: &rancher2.NodeTemplateHarvesterConfigArgs{
//					VmNamespace: pulumi.String("default"),
//					CpuCount:    pulumi.String("2"),
//					MemorySize:  pulumi.String("4"),
//					DiskInfo: pulumi.String(`    {
//	        "disks": [{
//	            "imageName": "harvester-public/image-57hzg",
//	            "size": 40,
//	            "bootOrder": 1
//	        }]
//	    }
//
// `),
//
//					NetworkInfo: pulumi.String(`    {
//	        "interfaces": [{
//	            "networkName": "harvester-public/vlan1"
//	        }]
//	    }
//
// `),
//
//					SshUser: pulumi.String("ubuntu"),
//					UserData: pulumi.String(`    package_update: true
//	    packages:
//	      - qemu-guest-agent
//	      - iptables
//	    runcmd:
//	      - - systemctl
//	        - enable
//	        - '--now'
//	        - qemu-guest-agent.service
//
// `),
//
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Using the Hetzner Node Driver
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new rancher2 Node Template using hetzner node_driver
//			hetznerNodeDriver, err := rancher2.NewNodeDriver(ctx, "hetzner_node_driver", &rancher2.NodeDriverArgs{
//				Active:  pulumi.Bool(true),
//				Builtin: pulumi.Bool(false),
//				Name:    pulumi.String("Hetzner"),
//				UiUrl:   pulumi.String("https://storage.googleapis.com/hcloud-rancher-v2-ui-driver/component.js"),
//				Url:     pulumi.String("https://github.com/JonasProgrammer/docker-machine-driver-hetzner/releases/download/3.6.0/docker-machine-driver-hetzner_3.6.0_linux_amd64.tar.gz"),
//				WhitelistDomains: pulumi.StringArray{
//					pulumi.String("storage.googleapis.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewNodeTemplate(ctx, "my_hetzner_node_template", &rancher2.NodeTemplateArgs{
//				Name:     pulumi.String("my-hetzner-node-template"),
//				DriverId: hetznerNodeDriver.ID(),
//				HetznerConfig: &rancher2.NodeTemplateHetznerConfigArgs{
//					ApiToken:       pulumi.String("XXXXXXXXXX"),
//					Image:          pulumi.String("ubuntu-18.04"),
//					ServerLocation: pulumi.String("nbg1"),
//					ServerType:     pulumi.String("cx11"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Upgrading to Rancher v2.3.3
//
// **Important** This process could update `NodeTemplate` data on tfstate file. Be sure to save a copy of tfstate file before proceed
//
// Due to [this feature](https://github.com/rancher/rancher/pull/23718) included on Rancher v2.3.3, `NodeTemplate` are now global scoped objects with RBAC around them, instead of user scoped objects as they were. This means that existing node templates `id` field is changing on upgrade. Provider implements `fixNodeTemplateID()` that will update tfstate with proper id.
type NodeTemplate struct {
	pulumi.CustomResourceState

	// AWS config for the Node Template (list maxitems:1)
	Amazonec2Config NodeTemplateAmazonec2ConfigPtrOutput `pulumi:"amazonec2Config"`
	// Annotations for Node Template object (map)
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// Auth certificate authority for the Node Template (string)
	AuthCertificateAuthority pulumi.StringPtrOutput `pulumi:"authCertificateAuthority"`
	// Auth key for the Node Template (string)
	AuthKey pulumi.StringPtrOutput `pulumi:"authKey"`
	// Azure config for the Node Template (list maxitems:1)
	AzureConfig NodeTemplateAzureConfigPtrOutput `pulumi:"azureConfig"`
	// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId pulumi.StringPtrOutput `pulumi:"cloudCredentialId"`
	// Description for the Node Template (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Digitalocean config for the Node Template (list maxitems:1)
	DigitaloceanConfig NodeTemplateDigitaloceanConfigPtrOutput `pulumi:"digitaloceanConfig"`
	// (Computed) The driver of the node template (string)
	Driver pulumi.StringOutput `pulumi:"driver"`
	// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
	DriverId pulumi.StringOutput `pulumi:"driverId"`
	// Engine environment for the node template (string)
	EngineEnv pulumi.StringMapOutput `pulumi:"engineEnv"`
	// Insecure registry for the node template (list)
	EngineInsecureRegistries pulumi.StringArrayOutput `pulumi:"engineInsecureRegistries"`
	// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
	EngineInstallUrl pulumi.StringOutput `pulumi:"engineInstallUrl"`
	// Engine label for the node template (string)
	EngineLabel pulumi.StringMapOutput `pulumi:"engineLabel"`
	// Engine options for the node template (map)
	EngineOpt pulumi.StringMapOutput `pulumi:"engineOpt"`
	// Engine registry mirror for the node template (list)
	EngineRegistryMirrors pulumi.StringArrayOutput `pulumi:"engineRegistryMirrors"`
	// Engine storage driver for the node template (string)
	EngineStorageDriver pulumi.StringPtrOutput `pulumi:"engineStorageDriver"`
	// Harvester config for the Node Template (list maxitems:1)
	HarvesterConfig NodeTemplateHarvesterConfigPtrOutput `pulumi:"harvesterConfig"`
	// Hetzner config for the Node Template (list maxitems:1)
	HetznerConfig NodeTemplateHetznerConfigPtrOutput `pulumi:"hetznerConfig"`
	// Labels for Node Template object (map)
	//
	// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Linode config for the Node Template (list maxitems:1)
	LinodeConfig NodeTemplateLinodeConfigPtrOutput `pulumi:"linodeConfig"`
	// The name of the Node Template (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 and above (List)
	NodeTaints NodeTemplateNodeTaintArrayOutput `pulumi:"nodeTaints"`
	// Opennebula config for the Node Template (list maxitems:1)
	OpennebulaConfig NodeTemplateOpennebulaConfigPtrOutput `pulumi:"opennebulaConfig"`
	// Openstack config for the Node Template (list maxitems:1)
	OpenstackConfig NodeTemplateOpenstackConfigPtrOutput `pulumi:"openstackConfig"`
	// Outscale config for the Node Template (list maxitems:1)
	OutscaleConfig NodeTemplateOutscaleConfigPtrOutput `pulumi:"outscaleConfig"`
	// Engine storage driver for the node template (bool)
	UseInternalIpAddress pulumi.BoolPtrOutput `pulumi:"useInternalIpAddress"`
	// vSphere config for the Node Template (list maxitems:1)
	VsphereConfig NodeTemplateVsphereConfigPtrOutput `pulumi:"vsphereConfig"`
}

// NewNodeTemplate registers a new resource with the given unique name, arguments, and options.
func NewNodeTemplate(ctx *pulumi.Context,
	name string, args *NodeTemplateArgs, opts ...pulumi.ResourceOption) (*NodeTemplate, error) {
	if args == nil {
		args = &NodeTemplateArgs{}
	}

	if args.AuthCertificateAuthority != nil {
		args.AuthCertificateAuthority = pulumi.ToSecret(args.AuthCertificateAuthority).(pulumi.StringPtrInput)
	}
	if args.AuthKey != nil {
		args.AuthKey = pulumi.ToSecret(args.AuthKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"authCertificateAuthority",
		"authKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NodeTemplate
	err := ctx.RegisterResource("rancher2:index/nodeTemplate:NodeTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeTemplate gets an existing NodeTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeTemplateState, opts ...pulumi.ResourceOption) (*NodeTemplate, error) {
	var resource NodeTemplate
	err := ctx.ReadResource("rancher2:index/nodeTemplate:NodeTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeTemplate resources.
type nodeTemplateState struct {
	// AWS config for the Node Template (list maxitems:1)
	Amazonec2Config *NodeTemplateAmazonec2Config `pulumi:"amazonec2Config"`
	// Annotations for Node Template object (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Auth certificate authority for the Node Template (string)
	AuthCertificateAuthority *string `pulumi:"authCertificateAuthority"`
	// Auth key for the Node Template (string)
	AuthKey *string `pulumi:"authKey"`
	// Azure config for the Node Template (list maxitems:1)
	AzureConfig *NodeTemplateAzureConfig `pulumi:"azureConfig"`
	// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId *string `pulumi:"cloudCredentialId"`
	// Description for the Node Template (string)
	Description *string `pulumi:"description"`
	// Digitalocean config for the Node Template (list maxitems:1)
	DigitaloceanConfig *NodeTemplateDigitaloceanConfig `pulumi:"digitaloceanConfig"`
	// (Computed) The driver of the node template (string)
	Driver *string `pulumi:"driver"`
	// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
	DriverId *string `pulumi:"driverId"`
	// Engine environment for the node template (string)
	EngineEnv map[string]string `pulumi:"engineEnv"`
	// Insecure registry for the node template (list)
	EngineInsecureRegistries []string `pulumi:"engineInsecureRegistries"`
	// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
	EngineInstallUrl *string `pulumi:"engineInstallUrl"`
	// Engine label for the node template (string)
	EngineLabel map[string]string `pulumi:"engineLabel"`
	// Engine options for the node template (map)
	EngineOpt map[string]string `pulumi:"engineOpt"`
	// Engine registry mirror for the node template (list)
	EngineRegistryMirrors []string `pulumi:"engineRegistryMirrors"`
	// Engine storage driver for the node template (string)
	EngineStorageDriver *string `pulumi:"engineStorageDriver"`
	// Harvester config for the Node Template (list maxitems:1)
	HarvesterConfig *NodeTemplateHarvesterConfig `pulumi:"harvesterConfig"`
	// Hetzner config for the Node Template (list maxitems:1)
	HetznerConfig *NodeTemplateHetznerConfig `pulumi:"hetznerConfig"`
	// Labels for Node Template object (map)
	//
	// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
	Labels map[string]string `pulumi:"labels"`
	// Linode config for the Node Template (list maxitems:1)
	LinodeConfig *NodeTemplateLinodeConfig `pulumi:"linodeConfig"`
	// The name of the Node Template (string)
	Name *string `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 and above (List)
	NodeTaints []NodeTemplateNodeTaint `pulumi:"nodeTaints"`
	// Opennebula config for the Node Template (list maxitems:1)
	OpennebulaConfig *NodeTemplateOpennebulaConfig `pulumi:"opennebulaConfig"`
	// Openstack config for the Node Template (list maxitems:1)
	OpenstackConfig *NodeTemplateOpenstackConfig `pulumi:"openstackConfig"`
	// Outscale config for the Node Template (list maxitems:1)
	OutscaleConfig *NodeTemplateOutscaleConfig `pulumi:"outscaleConfig"`
	// Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
	// vSphere config for the Node Template (list maxitems:1)
	VsphereConfig *NodeTemplateVsphereConfig `pulumi:"vsphereConfig"`
}

type NodeTemplateState struct {
	// AWS config for the Node Template (list maxitems:1)
	Amazonec2Config NodeTemplateAmazonec2ConfigPtrInput
	// Annotations for Node Template object (map)
	Annotations pulumi.StringMapInput
	// Auth certificate authority for the Node Template (string)
	AuthCertificateAuthority pulumi.StringPtrInput
	// Auth key for the Node Template (string)
	AuthKey pulumi.StringPtrInput
	// Azure config for the Node Template (list maxitems:1)
	AzureConfig NodeTemplateAzureConfigPtrInput
	// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId pulumi.StringPtrInput
	// Description for the Node Template (string)
	Description pulumi.StringPtrInput
	// Digitalocean config for the Node Template (list maxitems:1)
	DigitaloceanConfig NodeTemplateDigitaloceanConfigPtrInput
	// (Computed) The driver of the node template (string)
	Driver pulumi.StringPtrInput
	// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
	DriverId pulumi.StringPtrInput
	// Engine environment for the node template (string)
	EngineEnv pulumi.StringMapInput
	// Insecure registry for the node template (list)
	EngineInsecureRegistries pulumi.StringArrayInput
	// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
	EngineInstallUrl pulumi.StringPtrInput
	// Engine label for the node template (string)
	EngineLabel pulumi.StringMapInput
	// Engine options for the node template (map)
	EngineOpt pulumi.StringMapInput
	// Engine registry mirror for the node template (list)
	EngineRegistryMirrors pulumi.StringArrayInput
	// Engine storage driver for the node template (string)
	EngineStorageDriver pulumi.StringPtrInput
	// Harvester config for the Node Template (list maxitems:1)
	HarvesterConfig NodeTemplateHarvesterConfigPtrInput
	// Hetzner config for the Node Template (list maxitems:1)
	HetznerConfig NodeTemplateHetznerConfigPtrInput
	// Labels for Node Template object (map)
	//
	// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
	Labels pulumi.StringMapInput
	// Linode config for the Node Template (list maxitems:1)
	LinodeConfig NodeTemplateLinodeConfigPtrInput
	// The name of the Node Template (string)
	Name pulumi.StringPtrInput
	// Node taints. For Rancher v2.3.3 and above (List)
	NodeTaints NodeTemplateNodeTaintArrayInput
	// Opennebula config for the Node Template (list maxitems:1)
	OpennebulaConfig NodeTemplateOpennebulaConfigPtrInput
	// Openstack config for the Node Template (list maxitems:1)
	OpenstackConfig NodeTemplateOpenstackConfigPtrInput
	// Outscale config for the Node Template (list maxitems:1)
	OutscaleConfig NodeTemplateOutscaleConfigPtrInput
	// Engine storage driver for the node template (bool)
	UseInternalIpAddress pulumi.BoolPtrInput
	// vSphere config for the Node Template (list maxitems:1)
	VsphereConfig NodeTemplateVsphereConfigPtrInput
}

func (NodeTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeTemplateState)(nil)).Elem()
}

type nodeTemplateArgs struct {
	// AWS config for the Node Template (list maxitems:1)
	Amazonec2Config *NodeTemplateAmazonec2Config `pulumi:"amazonec2Config"`
	// Annotations for Node Template object (map)
	Annotations map[string]string `pulumi:"annotations"`
	// Auth certificate authority for the Node Template (string)
	AuthCertificateAuthority *string `pulumi:"authCertificateAuthority"`
	// Auth key for the Node Template (string)
	AuthKey *string `pulumi:"authKey"`
	// Azure config for the Node Template (list maxitems:1)
	AzureConfig *NodeTemplateAzureConfig `pulumi:"azureConfig"`
	// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId *string `pulumi:"cloudCredentialId"`
	// Description for the Node Template (string)
	Description *string `pulumi:"description"`
	// Digitalocean config for the Node Template (list maxitems:1)
	DigitaloceanConfig *NodeTemplateDigitaloceanConfig `pulumi:"digitaloceanConfig"`
	// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
	DriverId *string `pulumi:"driverId"`
	// Engine environment for the node template (string)
	EngineEnv map[string]string `pulumi:"engineEnv"`
	// Insecure registry for the node template (list)
	EngineInsecureRegistries []string `pulumi:"engineInsecureRegistries"`
	// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
	EngineInstallUrl *string `pulumi:"engineInstallUrl"`
	// Engine label for the node template (string)
	EngineLabel map[string]string `pulumi:"engineLabel"`
	// Engine options for the node template (map)
	EngineOpt map[string]string `pulumi:"engineOpt"`
	// Engine registry mirror for the node template (list)
	EngineRegistryMirrors []string `pulumi:"engineRegistryMirrors"`
	// Engine storage driver for the node template (string)
	EngineStorageDriver *string `pulumi:"engineStorageDriver"`
	// Harvester config for the Node Template (list maxitems:1)
	HarvesterConfig *NodeTemplateHarvesterConfig `pulumi:"harvesterConfig"`
	// Hetzner config for the Node Template (list maxitems:1)
	HetznerConfig *NodeTemplateHetznerConfig `pulumi:"hetznerConfig"`
	// Labels for Node Template object (map)
	//
	// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
	Labels map[string]string `pulumi:"labels"`
	// Linode config for the Node Template (list maxitems:1)
	LinodeConfig *NodeTemplateLinodeConfig `pulumi:"linodeConfig"`
	// The name of the Node Template (string)
	Name *string `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 and above (List)
	NodeTaints []NodeTemplateNodeTaint `pulumi:"nodeTaints"`
	// Opennebula config for the Node Template (list maxitems:1)
	OpennebulaConfig *NodeTemplateOpennebulaConfig `pulumi:"opennebulaConfig"`
	// Openstack config for the Node Template (list maxitems:1)
	OpenstackConfig *NodeTemplateOpenstackConfig `pulumi:"openstackConfig"`
	// Outscale config for the Node Template (list maxitems:1)
	OutscaleConfig *NodeTemplateOutscaleConfig `pulumi:"outscaleConfig"`
	// Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
	// vSphere config for the Node Template (list maxitems:1)
	VsphereConfig *NodeTemplateVsphereConfig `pulumi:"vsphereConfig"`
}

// The set of arguments for constructing a NodeTemplate resource.
type NodeTemplateArgs struct {
	// AWS config for the Node Template (list maxitems:1)
	Amazonec2Config NodeTemplateAmazonec2ConfigPtrInput
	// Annotations for Node Template object (map)
	Annotations pulumi.StringMapInput
	// Auth certificate authority for the Node Template (string)
	AuthCertificateAuthority pulumi.StringPtrInput
	// Auth key for the Node Template (string)
	AuthKey pulumi.StringPtrInput
	// Azure config for the Node Template (list maxitems:1)
	AzureConfig NodeTemplateAzureConfigPtrInput
	// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId pulumi.StringPtrInput
	// Description for the Node Template (string)
	Description pulumi.StringPtrInput
	// Digitalocean config for the Node Template (list maxitems:1)
	DigitaloceanConfig NodeTemplateDigitaloceanConfigPtrInput
	// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
	DriverId pulumi.StringPtrInput
	// Engine environment for the node template (string)
	EngineEnv pulumi.StringMapInput
	// Insecure registry for the node template (list)
	EngineInsecureRegistries pulumi.StringArrayInput
	// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
	EngineInstallUrl pulumi.StringPtrInput
	// Engine label for the node template (string)
	EngineLabel pulumi.StringMapInput
	// Engine options for the node template (map)
	EngineOpt pulumi.StringMapInput
	// Engine registry mirror for the node template (list)
	EngineRegistryMirrors pulumi.StringArrayInput
	// Engine storage driver for the node template (string)
	EngineStorageDriver pulumi.StringPtrInput
	// Harvester config for the Node Template (list maxitems:1)
	HarvesterConfig NodeTemplateHarvesterConfigPtrInput
	// Hetzner config for the Node Template (list maxitems:1)
	HetznerConfig NodeTemplateHetznerConfigPtrInput
	// Labels for Node Template object (map)
	//
	// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
	Labels pulumi.StringMapInput
	// Linode config for the Node Template (list maxitems:1)
	LinodeConfig NodeTemplateLinodeConfigPtrInput
	// The name of the Node Template (string)
	Name pulumi.StringPtrInput
	// Node taints. For Rancher v2.3.3 and above (List)
	NodeTaints NodeTemplateNodeTaintArrayInput
	// Opennebula config for the Node Template (list maxitems:1)
	OpennebulaConfig NodeTemplateOpennebulaConfigPtrInput
	// Openstack config for the Node Template (list maxitems:1)
	OpenstackConfig NodeTemplateOpenstackConfigPtrInput
	// Outscale config for the Node Template (list maxitems:1)
	OutscaleConfig NodeTemplateOutscaleConfigPtrInput
	// Engine storage driver for the node template (bool)
	UseInternalIpAddress pulumi.BoolPtrInput
	// vSphere config for the Node Template (list maxitems:1)
	VsphereConfig NodeTemplateVsphereConfigPtrInput
}

func (NodeTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeTemplateArgs)(nil)).Elem()
}

type NodeTemplateInput interface {
	pulumi.Input

	ToNodeTemplateOutput() NodeTemplateOutput
	ToNodeTemplateOutputWithContext(ctx context.Context) NodeTemplateOutput
}

func (*NodeTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeTemplate)(nil)).Elem()
}

func (i *NodeTemplate) ToNodeTemplateOutput() NodeTemplateOutput {
	return i.ToNodeTemplateOutputWithContext(context.Background())
}

func (i *NodeTemplate) ToNodeTemplateOutputWithContext(ctx context.Context) NodeTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeTemplateOutput)
}

// NodeTemplateArrayInput is an input type that accepts NodeTemplateArray and NodeTemplateArrayOutput values.
// You can construct a concrete instance of `NodeTemplateArrayInput` via:
//
//	NodeTemplateArray{ NodeTemplateArgs{...} }
type NodeTemplateArrayInput interface {
	pulumi.Input

	ToNodeTemplateArrayOutput() NodeTemplateArrayOutput
	ToNodeTemplateArrayOutputWithContext(context.Context) NodeTemplateArrayOutput
}

type NodeTemplateArray []NodeTemplateInput

func (NodeTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeTemplate)(nil)).Elem()
}

func (i NodeTemplateArray) ToNodeTemplateArrayOutput() NodeTemplateArrayOutput {
	return i.ToNodeTemplateArrayOutputWithContext(context.Background())
}

func (i NodeTemplateArray) ToNodeTemplateArrayOutputWithContext(ctx context.Context) NodeTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeTemplateArrayOutput)
}

// NodeTemplateMapInput is an input type that accepts NodeTemplateMap and NodeTemplateMapOutput values.
// You can construct a concrete instance of `NodeTemplateMapInput` via:
//
//	NodeTemplateMap{ "key": NodeTemplateArgs{...} }
type NodeTemplateMapInput interface {
	pulumi.Input

	ToNodeTemplateMapOutput() NodeTemplateMapOutput
	ToNodeTemplateMapOutputWithContext(context.Context) NodeTemplateMapOutput
}

type NodeTemplateMap map[string]NodeTemplateInput

func (NodeTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeTemplate)(nil)).Elem()
}

func (i NodeTemplateMap) ToNodeTemplateMapOutput() NodeTemplateMapOutput {
	return i.ToNodeTemplateMapOutputWithContext(context.Background())
}

func (i NodeTemplateMap) ToNodeTemplateMapOutputWithContext(ctx context.Context) NodeTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeTemplateMapOutput)
}

type NodeTemplateOutput struct{ *pulumi.OutputState }

func (NodeTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeTemplate)(nil)).Elem()
}

func (o NodeTemplateOutput) ToNodeTemplateOutput() NodeTemplateOutput {
	return o
}

func (o NodeTemplateOutput) ToNodeTemplateOutputWithContext(ctx context.Context) NodeTemplateOutput {
	return o
}

// AWS config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) Amazonec2Config() NodeTemplateAmazonec2ConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateAmazonec2ConfigPtrOutput { return v.Amazonec2Config }).(NodeTemplateAmazonec2ConfigPtrOutput)
}

// Annotations for Node Template object (map)
func (o NodeTemplateOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// Auth certificate authority for the Node Template (string)
func (o NodeTemplateOutput) AuthCertificateAuthority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringPtrOutput { return v.AuthCertificateAuthority }).(pulumi.StringPtrOutput)
}

// Auth key for the Node Template (string)
func (o NodeTemplateOutput) AuthKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringPtrOutput { return v.AuthKey }).(pulumi.StringPtrOutput)
}

// Azure config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) AzureConfig() NodeTemplateAzureConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateAzureConfigPtrOutput { return v.AzureConfig }).(NodeTemplateAzureConfigPtrOutput)
}

// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
func (o NodeTemplateOutput) CloudCredentialId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringPtrOutput { return v.CloudCredentialId }).(pulumi.StringPtrOutput)
}

// Description for the Node Template (string)
func (o NodeTemplateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Digitalocean config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) DigitaloceanConfig() NodeTemplateDigitaloceanConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateDigitaloceanConfigPtrOutput { return v.DigitaloceanConfig }).(NodeTemplateDigitaloceanConfigPtrOutput)
}

// (Computed) The driver of the node template (string)
func (o NodeTemplateOutput) Driver() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringOutput { return v.Driver }).(pulumi.StringOutput)
}

// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
func (o NodeTemplateOutput) DriverId() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringOutput { return v.DriverId }).(pulumi.StringOutput)
}

// Engine environment for the node template (string)
func (o NodeTemplateOutput) EngineEnv() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringMapOutput { return v.EngineEnv }).(pulumi.StringMapOutput)
}

// Insecure registry for the node template (list)
func (o NodeTemplateOutput) EngineInsecureRegistries() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringArrayOutput { return v.EngineInsecureRegistries }).(pulumi.StringArrayOutput)
}

// Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
func (o NodeTemplateOutput) EngineInstallUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringOutput { return v.EngineInstallUrl }).(pulumi.StringOutput)
}

// Engine label for the node template (string)
func (o NodeTemplateOutput) EngineLabel() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringMapOutput { return v.EngineLabel }).(pulumi.StringMapOutput)
}

// Engine options for the node template (map)
func (o NodeTemplateOutput) EngineOpt() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringMapOutput { return v.EngineOpt }).(pulumi.StringMapOutput)
}

// Engine registry mirror for the node template (list)
func (o NodeTemplateOutput) EngineRegistryMirrors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringArrayOutput { return v.EngineRegistryMirrors }).(pulumi.StringArrayOutput)
}

// Engine storage driver for the node template (string)
func (o NodeTemplateOutput) EngineStorageDriver() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringPtrOutput { return v.EngineStorageDriver }).(pulumi.StringPtrOutput)
}

// Harvester config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) HarvesterConfig() NodeTemplateHarvesterConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateHarvesterConfigPtrOutput { return v.HarvesterConfig }).(NodeTemplateHarvesterConfigPtrOutput)
}

// Hetzner config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) HetznerConfig() NodeTemplateHetznerConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateHetznerConfigPtrOutput { return v.HetznerConfig }).(NodeTemplateHetznerConfigPtrOutput)
}

// Labels for Node Template object (map)
//
// **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Node Template
func (o NodeTemplateOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Linode config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) LinodeConfig() NodeTemplateLinodeConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateLinodeConfigPtrOutput { return v.LinodeConfig }).(NodeTemplateLinodeConfigPtrOutput)
}

// The name of the Node Template (string)
func (o NodeTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Node taints. For Rancher v2.3.3 and above (List)
func (o NodeTemplateOutput) NodeTaints() NodeTemplateNodeTaintArrayOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateNodeTaintArrayOutput { return v.NodeTaints }).(NodeTemplateNodeTaintArrayOutput)
}

// Opennebula config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) OpennebulaConfig() NodeTemplateOpennebulaConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateOpennebulaConfigPtrOutput { return v.OpennebulaConfig }).(NodeTemplateOpennebulaConfigPtrOutput)
}

// Openstack config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) OpenstackConfig() NodeTemplateOpenstackConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateOpenstackConfigPtrOutput { return v.OpenstackConfig }).(NodeTemplateOpenstackConfigPtrOutput)
}

// Outscale config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) OutscaleConfig() NodeTemplateOutscaleConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateOutscaleConfigPtrOutput { return v.OutscaleConfig }).(NodeTemplateOutscaleConfigPtrOutput)
}

// Engine storage driver for the node template (bool)
func (o NodeTemplateOutput) UseInternalIpAddress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) pulumi.BoolPtrOutput { return v.UseInternalIpAddress }).(pulumi.BoolPtrOutput)
}

// vSphere config for the Node Template (list maxitems:1)
func (o NodeTemplateOutput) VsphereConfig() NodeTemplateVsphereConfigPtrOutput {
	return o.ApplyT(func(v *NodeTemplate) NodeTemplateVsphereConfigPtrOutput { return v.VsphereConfig }).(NodeTemplateVsphereConfigPtrOutput)
}

type NodeTemplateArrayOutput struct{ *pulumi.OutputState }

func (NodeTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeTemplate)(nil)).Elem()
}

func (o NodeTemplateArrayOutput) ToNodeTemplateArrayOutput() NodeTemplateArrayOutput {
	return o
}

func (o NodeTemplateArrayOutput) ToNodeTemplateArrayOutputWithContext(ctx context.Context) NodeTemplateArrayOutput {
	return o
}

func (o NodeTemplateArrayOutput) Index(i pulumi.IntInput) NodeTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NodeTemplate {
		return vs[0].([]*NodeTemplate)[vs[1].(int)]
	}).(NodeTemplateOutput)
}

type NodeTemplateMapOutput struct{ *pulumi.OutputState }

func (NodeTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeTemplate)(nil)).Elem()
}

func (o NodeTemplateMapOutput) ToNodeTemplateMapOutput() NodeTemplateMapOutput {
	return o
}

func (o NodeTemplateMapOutput) ToNodeTemplateMapOutputWithContext(ctx context.Context) NodeTemplateMapOutput {
	return o
}

func (o NodeTemplateMapOutput) MapIndex(k pulumi.StringInput) NodeTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NodeTemplate {
		return vs[0].(map[string]*NodeTemplate)[vs[1].(string)]
	}).(NodeTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NodeTemplateInput)(nil)).Elem(), &NodeTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeTemplateArrayInput)(nil)).Elem(), NodeTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeTemplateMapInput)(nil)).Elem(), NodeTemplateMap{})
	pulumi.RegisterOutputType(NodeTemplateOutput{})
	pulumi.RegisterOutputType(NodeTemplateArrayOutput{})
	pulumi.RegisterOutputType(NodeTemplateMapOutput{})
}
