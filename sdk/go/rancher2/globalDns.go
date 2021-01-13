// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher V2 Global DNS resource. This can be used to create Global DNS records for Rancher V2.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooGlobalDnsProvider, err := rancher2.NewGlobalDnsProvider(ctx, "fooGlobalDnsProvider", &rancher2.GlobalDnsProviderArgs{
// 			RootDomain: pulumi.String("example.com"),
// 			Route53Config: &rancher2.GlobalDnsProviderRoute53ConfigArgs{
// 				AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
// 				SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
// 				ZoneType:  pulumi.String("private"),
// 				Region:    pulumi.String("us-east-1"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewGlobalDns(ctx, "fooGlobalDns", &rancher2.GlobalDnsArgs{
// 			Fqdn:       pulumi.String("foo.example.com"),
// 			ProviderId: fooGlobalDnsProvider.ID(),
// 			ProjectIds: pulumi.StringArray{
// 				pulumi.String("project1"),
// 				pulumi.String("project2"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooGlobalDnsProvider, err := rancher2.NewGlobalDnsProvider(ctx, "fooGlobalDnsProvider", &rancher2.GlobalDnsProviderArgs{
// 			RootDomain: pulumi.String("example.com"),
// 			Route53Config: &rancher2.GlobalDnsProviderRoute53ConfigArgs{
// 				AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
// 				SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
// 				ZoneType:  pulumi.String("private"),
// 				Region:    pulumi.String("us-east-1"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewGlobalDns(ctx, "fooGlobalDns", &rancher2.GlobalDnsArgs{
// 			Fqdn:              pulumi.String("foo.example.com"),
// 			ProviderId:        fooGlobalDnsProvider.ID(),
// 			MultiClusterAppId: pulumi.String("<MCA_ID>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Global DNS Entry can be imported using the Rancher Global DNS ID
//
// ```sh
//  $ pulumi import rancher2:index/globalDns:GlobalDns foo <global_dns_id>
// ```
type GlobalDns struct {
	pulumi.CustomResourceState

	// Annotations for Global DNS (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrOutput `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayOutput `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringOutput `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
}

// NewGlobalDns registers a new resource with the given unique name, arguments, and options.
func NewGlobalDns(ctx *pulumi.Context,
	name string, args *GlobalDnsArgs, opts ...pulumi.ResourceOption) (*GlobalDns, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Fqdn == nil {
		return nil, errors.New("invalid value for required argument 'Fqdn'")
	}
	if args.ProviderId == nil {
		return nil, errors.New("invalid value for required argument 'ProviderId'")
	}
	var resource GlobalDns
	err := ctx.RegisterResource("rancher2:index/globalDns:GlobalDns", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalDns gets an existing GlobalDns resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalDns(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalDnsState, opts ...pulumi.ResourceOption) (*GlobalDns, error) {
	var resource GlobalDns
	err := ctx.ReadResource("rancher2:index/globalDns:GlobalDns", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalDns resources.
type globalDnsState struct {
	// Annotations for Global DNS (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn *string `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId *string `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name *string `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds []string `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId *string `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl *int `pulumi:"ttl"`
}

type GlobalDnsState struct {
	// Annotations for Global DNS (map)
	Annotations pulumi.MapInput
	// The Global DNS record (string)
	Fqdn pulumi.StringPtrInput
	// Labels for Global DNS (map)
	Labels pulumi.MapInput
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrInput
	// The name of the Global DNS (string)
	Name pulumi.StringPtrInput
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayInput
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringPtrInput
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrInput
}

func (GlobalDnsState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsState)(nil)).Elem()
}

type globalDnsArgs struct {
	// Annotations for Global DNS (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn string `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId *string `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name *string `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds []string `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId string `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a GlobalDns resource.
type GlobalDnsArgs struct {
	// Annotations for Global DNS (map)
	Annotations pulumi.MapInput
	// The Global DNS record (string)
	Fqdn pulumi.StringInput
	// Labels for Global DNS (map)
	Labels pulumi.MapInput
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrInput
	// The name of the Global DNS (string)
	Name pulumi.StringPtrInput
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayInput
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringInput
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrInput
}

func (GlobalDnsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsArgs)(nil)).Elem()
}

type GlobalDnsInput interface {
	pulumi.Input

	ToGlobalDnsOutput() GlobalDnsOutput
	ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput
}

func (GlobalDns) ElementType() reflect.Type {
	return reflect.TypeOf((*GlobalDns)(nil)).Elem()
}

func (i GlobalDns) ToGlobalDnsOutput() GlobalDnsOutput {
	return i.ToGlobalDnsOutputWithContext(context.Background())
}

func (i GlobalDns) ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsOutput)
}

type GlobalDnsOutput struct {
	*pulumi.OutputState
}

func (GlobalDnsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GlobalDnsOutput)(nil)).Elem()
}

func (o GlobalDnsOutput) ToGlobalDnsOutput() GlobalDnsOutput {
	return o
}

func (o GlobalDnsOutput) ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(GlobalDnsOutput{})
}
