// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getClusterV2({
 *     fleetNamespace: "fleet-ns",
 *     name: "foo",
 * }));
 * ```
 */
export function getClusterV2(args: GetClusterV2Args, opts?: pulumi.InvokeOptions): Promise<GetClusterV2Result> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterV2:getClusterV2", {
        "fleetNamespace": args.fleetNamespace,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterV2.
 */
export interface GetClusterV2Args {
    /**
     * The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
     */
    fleetNamespace?: string;
    /**
     * The name of the Cluster v2 (string)
     */
    name: string;
}

/**
 * A collection of values returned by getClusterV2.
 */
export interface GetClusterV2Result {
    /**
     * (Computed) Optional Agent Env Vars for Rancher agent (list)
     */
    readonly agentEnvVars: outputs.GetClusterV2AgentEnvVar[];
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Cluster V2 cloud credential secret name (string)
     */
    readonly cloudCredentialSecretName: string;
    /**
     * (Computed/Sensitive) Cluster Registration Token generated for the cluster v2 (list maxitems:1)
     */
    readonly clusterRegistrationToken: outputs.GetClusterV2ClusterRegistrationToken;
    /**
     * (Computed) Cluster v1 id for cluster v2 (string)
     */
    readonly clusterV1Id: string;
    /**
     * (Computed) Cluster V2 default cluster role for project members (string)
     */
    readonly defaultClusterRoleForProjectMembers: string;
    /**
     * (Computed) Cluster V2 default pod security policy template name (string)
     */
    readonly defaultPodSecurityPolicyTemplateName: string;
    /**
     * (Computed) Enable k8s network policy at Cluster V2 (bool)
     */
    readonly enableNetworkPolicy: boolean;
    readonly fleetNamespace?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed/Sensitive) Kube Config generated for the cluster v2 (string)
     */
    readonly kubeConfig: string;
    /**
     * (Computed) The kubernetes version of the Cluster v2 (list maxitems:1)
     */
    readonly kubernetesVersion: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) Cluster v2 k8s resource version (string)
     */
    readonly resourceVersion: string;
    /**
     * (Computed) The RKE configuration for `k3s` and `rke2` Clusters v2. (list maxitems:1)
     */
    readonly rkeConfig: outputs.GetClusterV2RkeConfig;
}

export function getClusterV2Output(args: GetClusterV2OutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterV2Result> {
    return pulumi.output(args).apply(a => getClusterV2(a, opts))
}

/**
 * A collection of arguments for invoking getClusterV2.
 */
export interface GetClusterV2OutputArgs {
    /**
     * The fleet namespace of the Cluster v2. Default: `\"fleet-default\"` (string)
     */
    fleetNamespace?: pulumi.Input<string>;
    /**
     * The name of the Cluster v2 (string)
     */
    name: pulumi.Input<string>;
}
