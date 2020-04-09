# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class NodePool(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for Node Pool object (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The RKE cluster id to use Node Pool (string)
    """
    control_plane: pulumi.Output[bool]
    """
    RKE control plane role for created nodes (bool)
    """
    delete_not_ready_after_secs: pulumi.Output[float]
    """
    Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
    """
    etcd: pulumi.Output[bool]
    """
    RKE etcd role for created nodes (bool)
    """
    hostname_prefix: pulumi.Output[str]
    """
    The prefix for created nodes of the Node Pool (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels for Node Pool object (map)
    """
    name: pulumi.Output[str]
    """
    The name of the Node Pool (string)
    """
    node_taints: pulumi.Output[list]
    """
    Node taints. For Rancher v2.3.3 or above (List)

      * `effect` (`str`) - Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
      * `key` (`str`) - Taint key (string)
      * `timeAdded` (`str`) - Taint time added (string)
      * `value` (`str`) - Taint value (string)
    """
    node_template_id: pulumi.Output[str]
    """
    The Node Template ID to use for node creation (string)
    """
    quantity: pulumi.Output[float]
    """
    The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
    """
    worker: pulumi.Output[bool]
    """
    RKE role role for created nodes (bool)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, control_plane=None, delete_not_ready_after_secs=None, etcd=None, hostname_prefix=None, labels=None, name=None, node_taints=None, node_template_id=None, quantity=None, worker=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.



        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/nodePool.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[float] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
        :param pulumi.Input[bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[dict] labels: Labels for Node Pool object (map)
        :param pulumi.Input[str] name: The name of the Node Pool (string)
        :param pulumi.Input[list] node_taints: Node taints. For Rancher v2.3.3 or above (List)
        :param pulumi.Input[str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[float] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[bool] worker: RKE role role for created nodes (bool)

        The **node_taints** object supports the following:

          * `effect` (`pulumi.Input[str]`) - Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
          * `key` (`pulumi.Input[str]`) - Taint key (string)
          * `timeAdded` (`pulumi.Input[str]`) - Taint time added (string)
          * `value` (`pulumi.Input[str]`) - Taint value (string)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['control_plane'] = control_plane
            __props__['delete_not_ready_after_secs'] = delete_not_ready_after_secs
            __props__['etcd'] = etcd
            if hostname_prefix is None:
                raise TypeError("Missing required property 'hostname_prefix'")
            __props__['hostname_prefix'] = hostname_prefix
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['node_taints'] = node_taints
            if node_template_id is None:
                raise TypeError("Missing required property 'node_template_id'")
            __props__['node_template_id'] = node_template_id
            __props__['quantity'] = quantity
            __props__['worker'] = worker
        super(NodePool, __self__).__init__(
            'rancher2:index/nodePool:NodePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, control_plane=None, delete_not_ready_after_secs=None, etcd=None, hostname_prefix=None, labels=None, name=None, node_taints=None, node_template_id=None, quantity=None, worker=None):
        """
        Get an existing NodePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Node Pool object (map)
        :param pulumi.Input[str] cluster_id: The RKE cluster id to use Node Pool (string)
        :param pulumi.Input[bool] control_plane: RKE control plane role for created nodes (bool)
        :param pulumi.Input[float] delete_not_ready_after_secs: Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
        :param pulumi.Input[bool] etcd: RKE etcd role for created nodes (bool)
        :param pulumi.Input[str] hostname_prefix: The prefix for created nodes of the Node Pool (string)
        :param pulumi.Input[dict] labels: Labels for Node Pool object (map)
        :param pulumi.Input[str] name: The name of the Node Pool (string)
        :param pulumi.Input[list] node_taints: Node taints. For Rancher v2.3.3 or above (List)
        :param pulumi.Input[str] node_template_id: The Node Template ID to use for node creation (string)
        :param pulumi.Input[float] quantity: The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
        :param pulumi.Input[bool] worker: RKE role role for created nodes (bool)

        The **node_taints** object supports the following:

          * `effect` (`pulumi.Input[str]`) - Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
          * `key` (`pulumi.Input[str]`) - Taint key (string)
          * `timeAdded` (`pulumi.Input[str]`) - Taint time added (string)
          * `value` (`pulumi.Input[str]`) - Taint value (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["control_plane"] = control_plane
        __props__["delete_not_ready_after_secs"] = delete_not_ready_after_secs
        __props__["etcd"] = etcd
        __props__["hostname_prefix"] = hostname_prefix
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["node_taints"] = node_taints
        __props__["node_template_id"] = node_template_id
        __props__["quantity"] = quantity
        __props__["worker"] = worker
        return NodePool(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

