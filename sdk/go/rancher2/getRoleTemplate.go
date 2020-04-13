// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 role template resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/roleTemplate.html.markdown.
func GetRoleTemplate(ctx *pulumi.Context, args *GetRoleTemplateArgs, opts ...pulumi.InvokeOption) (*GetRoleTemplateResult, error) {
	var rv GetRoleTemplateResult
	err := ctx.Invoke("rancher2:index/getRoleTemplate:getRoleTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoleTemplate.
type GetRoleTemplateArgs struct {
	// Role template context. `cluster` and `project` values are supported (string)
	Context *string `pulumi:"context"`
	// The name of the Node Template (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getRoleTemplate.
type GetRoleTemplateResult struct {
	// (Computed) Administrative role template (bool)
	Administrative bool `pulumi:"administrative"`
	// (Computed) Annotations for role template object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Builtin role template (string)
	Builtin bool   `pulumi:"builtin"`
	Context string `pulumi:"context"`
	// (Computed) Default role template for new created cluster or project (bool)
	DefaultRole bool `pulumi:"defaultRole"`
	// (Computed) Role template description (string)
	Description string `pulumi:"description"`
	// (Computed) External role template (bool)
	External bool `pulumi:"external"`
	// (Computed) Hidden role template (bool)
	Hidden bool `pulumi:"hidden"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for role template object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) Locked role template (bool)
	Locked bool   `pulumi:"locked"`
	Name   string `pulumi:"name"`
	// (Computed) Inherit role template IDs (list)
	RoleTemplateIds []string `pulumi:"roleTemplateIds"`
	// (Computed) Role template policy rules (list)
	Rules []GetRoleTemplateRule `pulumi:"rules"`
}
