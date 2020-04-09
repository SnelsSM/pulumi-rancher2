# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetNodePoolResult:
    """
    A collection of values returned by getNodePool.
    """
    def __init__(__self__, annotations=None, cluster_id=None, control_plane=None, delete_not_ready_after_secs=None, etcd=None, hostname_prefix=None, id=None, labels=None, name=None, node_taints=None, node_template_id=None, quantity=None, worker=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations for Node Pool object (map)
        """
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        __self__.cluster_id = cluster_id
        if control_plane and not isinstance(control_plane, bool):
            raise TypeError("Expected argument 'control_plane' to be a bool")
        __self__.control_plane = control_plane
        """
        (Computed) RKE control plane role for created nodes (bool)
        """
        if delete_not_ready_after_secs and not isinstance(delete_not_ready_after_secs, float):
            raise TypeError("Expected argument 'delete_not_ready_after_secs' to be a float")
        __self__.delete_not_ready_after_secs = delete_not_ready_after_secs
        """
        (Computed) Delete not ready node after secs. Default `0` (int)
        """
        if etcd and not isinstance(etcd, bool):
            raise TypeError("Expected argument 'etcd' to be a bool")
        __self__.etcd = etcd
        """
        (Computed) RKE etcd role for created nodes (bool)
        """
        if hostname_prefix and not isinstance(hostname_prefix, str):
            raise TypeError("Expected argument 'hostname_prefix' to be a str")
        __self__.hostname_prefix = hostname_prefix
        """
        (Computed) The prefix for created nodes of the Node Pool (string)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        __self__.labels = labels
        """
        (Computed) Labels for Node Pool object (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if node_taints and not isinstance(node_taints, list):
            raise TypeError("Expected argument 'node_taints' to be a list")
        __self__.node_taints = node_taints
        """
        (Computed) Node taints (List)
        """
        if node_template_id and not isinstance(node_template_id, str):
            raise TypeError("Expected argument 'node_template_id' to be a str")
        __self__.node_template_id = node_template_id
        if quantity and not isinstance(quantity, float):
            raise TypeError("Expected argument 'quantity' to be a float")
        __self__.quantity = quantity
        """
        (Computed) The number of nodes to create on Node Pool (int)
        """
        if worker and not isinstance(worker, bool):
            raise TypeError("Expected argument 'worker' to be a bool")
        __self__.worker = worker
        """
        (Computed) RKE role role for created nodes (bool)
        """
class AwaitableGetNodePoolResult(GetNodePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodePoolResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            control_plane=self.control_plane,
            delete_not_ready_after_secs=self.delete_not_ready_after_secs,
            etcd=self.etcd,
            hostname_prefix=self.hostname_prefix,
            id=self.id,
            labels=self.labels,
            name=self.name,
            node_taints=self.node_taints,
            node_template_id=self.node_template_id,
            quantity=self.quantity,
            worker=self.worker)

def get_node_pool(cluster_id=None,name=None,node_template_id=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 Node Pool resource.



    > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/nodePool.html.markdown.


    :param str cluster_id: The RKE cluster id to use Node Pool (string)
    :param str name: The name of the Node Pool (string)
    :param str node_template_id: The Node Template ID to use for node creation (string)
    """
    __args__ = dict()


    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    __args__['nodeTemplateId'] = node_template_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getNodePool:getNodePool', __args__, opts=opts).value

    return AwaitableGetNodePoolResult(
        annotations=__ret__.get('annotations'),
        cluster_id=__ret__.get('clusterId'),
        control_plane=__ret__.get('controlPlane'),
        delete_not_ready_after_secs=__ret__.get('deleteNotReadyAfterSecs'),
        etcd=__ret__.get('etcd'),
        hostname_prefix=__ret__.get('hostnamePrefix'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        node_taints=__ret__.get('nodeTaints'),
        node_template_id=__ret__.get('nodeTemplateId'),
        quantity=__ret__.get('quantity'),
        worker=__ret__.get('worker'))
