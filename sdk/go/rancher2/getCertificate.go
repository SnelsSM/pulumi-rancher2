// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 certificate.
// 
// Depending of the availability, there are 2 types of Rancher v2 certificates:
// - Project certificate: Available to all namespaces in the `projectId`
// - Namespaced certificate: Available to just `namespaceId` in the `projectId`
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/certificate.html.markdown.
func LookupCertificate(ctx *pulumi.Context, args *LookupCertificateArgs, opts ...pulumi.InvokeOption) (*LookupCertificateResult, error) {
	var rv LookupCertificateResult
	err := ctx.Invoke("rancher2:index/getCertificate:getCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateArgs struct {
	// The name of the certificate (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced certificate (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the certificate (string)
	ProjectId string `pulumi:"projectId"`
}


// A collection of values returned by getCertificate.
type LookupCertificateResult struct {
	// (Computed) Annotations for certificate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Base64 encoded certs (string)
	Certs string `pulumi:"certs"`
	// (Computed) A certificate description (string)
	Description string `pulumi:"description"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for certificate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name string `pulumi:"name"`
	NamespaceId *string `pulumi:"namespaceId"`
	ProjectId string `pulumi:"projectId"`
}

