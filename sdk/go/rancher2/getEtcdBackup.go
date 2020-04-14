// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 etcd backup.
func LookupEtcdBackup(ctx *pulumi.Context, args *LookupEtcdBackupArgs, opts ...pulumi.InvokeOption) (*LookupEtcdBackupResult, error) {
	var rv LookupEtcdBackupResult
	err := ctx.Invoke("rancher2:index/getEtcdBackup:getEtcdBackup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEtcdBackup.
type LookupEtcdBackupArgs struct {
	// Cluster ID to config Etcd Backup (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the Etcd Backup (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getEtcdBackup.
type LookupEtcdBackupResult struct {
	// (Computed) Annotations for Etcd Backup object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Backup config for etcd backup (list maxitems:1)
	BackupConfig GetEtcdBackupBackupConfig `pulumi:"backupConfig"`
	ClusterId    string                    `pulumi:"clusterId"`
	// (Computed) Filename of the Etcd Backup (string)
	Filename string `pulumi:"filename"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Etcd Backup object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) Manual execution of the Etcd Backup. Default `false` (bool)
	Manual bool   `pulumi:"manual"`
	Name   string `pulumi:"name"`
	// (Computed) Description for the Etcd Backup (string)
	NamespaceId string `pulumi:"namespaceId"`
}
