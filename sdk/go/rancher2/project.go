// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
//
//
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/project.html.markdown.
type Project struct {
	pulumi.CustomResourceState

	// Annotations for Node Pool object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrOutput `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrOutput `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the project (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrOutput `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputOutput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrOutput `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrOutput `pulumi:"waitForCluster"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil {
		args = &ProjectArgs{}
	}
	var resource Project
	err := ctx.RegisterResource("rancher2:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("rancher2:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId *string `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit *ProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description *string `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring *bool `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project (string)
	Name *string `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId *string `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput *ProjectProjectMonitoringInput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *ProjectResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

type ProjectState struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The cluster id where create project (string)
	ClusterId pulumi.StringPtrInput
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrInput
	// A project description (string)
	Description pulumi.StringPtrInput
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the project (string)
	Name pulumi.StringPtrInput
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrInput
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputPtrInput
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId string `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit *ProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description *string `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring *bool `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project (string)
	Name *string `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId *string `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput *ProjectProjectMonitoringInput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *ProjectResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The cluster id where create project (string)
	ClusterId pulumi.StringInput
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrInput
	// A project description (string)
	Description pulumi.StringPtrInput
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the project (string)
	Name pulumi.StringPtrInput
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrInput
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputPtrInput
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}
