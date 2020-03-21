// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 secret.
//
// Depending of the availability, there are 2 types of Rancher v2 secrets:
// - Project secret: Available to all namespaces in the `projectId`
// - Namespaced secret: Available to just `namespaceId` in the `projectId`
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/secret.html.markdown.
func LookupSecret(ctx *pulumi.Context, args *LookupSecretArgs, opts ...pulumi.InvokeOption) (*LookupSecretResult, error) {
	var rv LookupSecretResult
	err := ctx.Invoke("rancher2:index/getSecret:getSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecret.
type LookupSecretArgs struct {
	// The name of the secret (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId string `pulumi:"projectId"`
}


// A collection of values returned by getSecret.
type LookupSecretResult struct {
	// (Computed) Annotations for secret object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Secret key/value data. Base64 encoding required for values (map)
	Data map[string]interface{} `pulumi:"data"`
	// (Computed) A secret description (string)
	Description string `pulumi:"description"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for secret object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name string `pulumi:"name"`
	NamespaceId *string `pulumi:"namespaceId"`
	ProjectId string `pulumi:"projectId"`
}

