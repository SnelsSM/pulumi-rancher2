// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster role template binding.
//
//
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterRole.html.markdown.
func LookupClusterRoleTemplateBinding(ctx *pulumi.Context, args *LookupClusterRoleTemplateBindingArgs, opts ...pulumi.InvokeOption) (*LookupClusterRoleTemplateBindingResult, error) {
	var rv LookupClusterRoleTemplateBindingResult
	err := ctx.Invoke("rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingArgs struct {
	// The cluster id where bind cluster role template (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the cluster role template binding (string)
	Name string `pulumi:"name"`
	// The role template id from create cluster role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
}

// A collection of values returned by getClusterRoleTemplateBinding.
type LookupClusterRoleTemplateBindingResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The group ID to assign cluster role template binding (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The groupPrincipal ID to assign cluster role template binding (string)
	GroupPrincipalId string `pulumi:"groupPrincipalId"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels         map[string]interface{} `pulumi:"labels"`
	Name           string                 `pulumi:"name"`
	RoleTemplateId string                 `pulumi:"roleTemplateId"`
	// (Computed) The user ID to assign cluster role template binding (string)
	UserId string `pulumi:"userId"`
	// (Computed) The userPrincipal ID to assign cluster role template binding (string)
	UserPrincipalId string `pulumi:"userPrincipalId"`
}
