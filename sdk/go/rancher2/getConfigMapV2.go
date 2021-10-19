// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher2 configMap v2. ConfigMap v2 resource is available at Rancher v2.5.x and above.
func LookupConfigMapV2(ctx *pulumi.Context, args *LookupConfigMapV2Args, opts ...pulumi.InvokeOption) (*LookupConfigMapV2Result, error) {
	var rv LookupConfigMapV2Result
	err := ctx.Invoke("rancher2:index/getConfigMapV2:getConfigMapV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigMapV2.
type LookupConfigMapV2Args struct {
	// The cluster id of the configMap V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the configMap v2 (string)
	Name string `pulumi:"name"`
	// The namespaces of the configMap v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
}

// A collection of values returned by getConfigMapV2.
type LookupConfigMapV2Result struct {
	// (Computed) Annotations for the configMap v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The data of the configMap v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) If set to true, any configMap update will remove and recreate the configMap. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate (bool)
	Immutable bool `pulumi:"immutable"`
	// (Computed) Labels for the configMap v2 (map)
	Labels    map[string]interface{} `pulumi:"labels"`
	Name      string                 `pulumi:"name"`
	Namespace *string                `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion string `pulumi:"resourceVersion"`
}
