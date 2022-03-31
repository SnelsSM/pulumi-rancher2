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
 * const foo_custom = pulumi.output(rancher2.getCluster({
 *     name: "foo-custom",
 * }));
 * ```
 */
export function getCluster(args: GetClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("rancher2:index/getCluster:getCluster", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCluster.
 */
export interface GetClusterArgs {
    /**
     * The name of the Cluster (string)
     */
    name: string;
}

/**
 * A collection of values returned by getCluster.
 */
export interface GetClusterResult {
    /**
     * (Computed) Optional Agent Env Vars for Rancher agent. Just for Rancher v2.5.6 and above (list)
     */
    readonly agentEnvVars: string[];
    /**
     * (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly aksConfig: outputs.GetClusterAksConfig;
    /**
     * (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aksConfig`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` `k3sConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly aksConfigV2: outputs.GetClusterAksConfigV2;
    /**
     * (Computed) Annotations for Node Pool object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) K8s cluster ca cert (string)
     */
    readonly caCert: string;
    /**
     * (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
     */
    readonly clusterAuthEndpoint: outputs.GetClusterClusterAuthEndpoint;
    /**
     * (Computed) Cluster monitoring config (list maxitems:1)
     */
    readonly clusterMonitoringInput: outputs.GetClusterClusterMonitoringInput;
    /**
     * (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
     */
    readonly clusterRegistrationToken: outputs.GetClusterClusterRegistrationToken;
    /**
     * (Computed) Cluster template answers (list maxitems:1)
     */
    readonly clusterTemplateAnswers: outputs.GetClusterClusterTemplateAnswers;
    /**
     * (Computed) Cluster template ID (string)
     */
    readonly clusterTemplateId: string;
    /**
     * (Computed) Cluster template questions (list)
     */
    readonly clusterTemplateQuestions: outputs.GetClusterClusterTemplateQuestion[];
    /**
     * (Computed) Cluster template revision ID (string)
     */
    readonly clusterTemplateRevisionId: string;
    /**
     * (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
     */
    readonly defaultPodSecurityPolicyTemplateId: string;
    /**
     * (Computed) Default project ID for the cluster (string)
     */
    readonly defaultProjectId: string;
    /**
     * (Computed) The description for Cluster (string)
     */
    readonly description: string;
    /**
     * (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
     */
    readonly driver: string;
    /**
     * (Computed) The Amazon eks configuration for `eks` Conflicts with `aksConfig`, `aksConfigV2`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly eksConfig: outputs.GetClusterEksConfig;
    /**
     * (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.x or above (list maxitems:1)
     */
    readonly eksConfigV2: outputs.GetClusterEksConfigV2;
    readonly enableClusterAlerting: boolean;
    /**
     * (Computed) Enable built-in cluster monitoring. Default `false` (bool)
     */
    readonly enableClusterMonitoring: boolean;
    /**
     * (Computed) Enable project network isolation. Default `false` (bool)
     */
    readonly enableNetworkPolicy: boolean;
    /**
     * (Computed) Fleet workspace name (string)
     */
    readonly fleetWorkspaceName: string;
    /**
     * (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfigV2`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1) (list maxitems:1)
     */
    readonly gkeConfig: outputs.GetClusterGkeConfig;
    /**
     * (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig`. For Rancher v2.5.8 or above (list maxitems:1)
     */
    readonly gkeConfigV2: outputs.GetClusterGkeConfigV2;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly k3sConfig: outputs.GetClusterK3sConfig;
    /**
     * (Computed) Kube Config generated for the cluster (string)
     */
    readonly kubeConfig: string;
    /**
     * (Computed) Labels for Node Pool object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `k3sConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly okeConfig: outputs.GetClusterOkeConfig;
    /**
     * (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `gkeConfig`, `okeConfig`, `k3sConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly rke2Config: outputs.GetClusterRke2Config;
    /**
     * (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aksConfig`, `aksConfigV2`, `eksConfig`, `eksConfigV2`, `gkeConfig`, `gkeConfigV2`, `okeConfig` and `k3sConfig` (list maxitems:1)
     */
    readonly rkeConfig: outputs.GetClusterRkeConfig;
    readonly scheduledClusterScans: outputs.GetClusterScheduledClusterScan[];
    /**
     * (Computed) System project ID for the cluster (string)
     */
    readonly systemProjectId: string;
}

export function getClusterOutput(args: GetClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterResult> {
    return pulumi.output(args).apply(a => getCluster(a, opts))
}

/**
 * A collection of arguments for invoking getCluster.
 */
export interface GetClusterOutputArgs {
    /**
     * The name of the Cluster (string)
     */
    name: pulumi.Input<string>;
}
