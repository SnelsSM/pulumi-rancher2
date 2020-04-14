// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 user
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	var rv LookupUserResult
	err := ctx.Invoke("rancher2:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// Set is the user if the user is external. Default: `false` (bool)
	IsExternal *bool `pulumi:"isExternal"`
	// The name of the user (string)
	Name *string `pulumi:"name"`
	// The username of the user (string)
	Username *string `pulumi:"username"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) The user is enabled (bool)
	Enabled bool `pulumi:"enabled"`
	// id is the provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	IsExternal *bool  `pulumi:"isExternal"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The user common name (string)
	Name string `pulumi:"name"`
	// (Computed) The user principal IDs (list)
	PrincipalIds []string `pulumi:"principalIds"`
	Username     string   `pulumi:"username"`
}
