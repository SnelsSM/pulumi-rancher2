// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 app.
 */
export function getApp(args: GetAppArgs, opts?: pulumi.InvokeOptions): Promise<GetAppResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getApp:getApp", {
        "annotations": args.annotations,
        "name": args.name,
        "projectId": args.projectId,
        "targetNamespace": args.targetNamespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getApp.
 */
export interface GetAppArgs {
    /**
     * (Computed) Annotations for the catalog (map)
     */
    annotations?: {[key: string]: any};
    /**
     * The app name (string)
     */
    name: string;
    /**
     * The id of the project where the app is deployed (string)
     */
    projectId: string;
    /**
     * The namespace name where the app is deployed (string)
     */
    targetNamespace?: string;
}

/**
 * A collection of values returned by getApp.
 */
export interface GetAppResult {
    /**
     * (Computed) Annotations for the catalog (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Answers for the app (map)
     */
    readonly answers: {[key: string]: any};
    /**
     * (Computed) Catalog name of the app (string)
     */
    readonly catalogName: string;
    /**
     * (Computed) Description for the app (string)
     */
    readonly description: string;
    /**
     * (Computed) The URL of the helm catalog app (string)
     */
    readonly externalId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for the catalog (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly projectId: string;
    /**
     * (Computed) Current revision id for the app (string)
     */
    readonly revisionId: string;
    readonly targetNamespace: string;
    /**
     * (Computed) Template name of the app (string)
     */
    readonly templateName: string;
    /**
     * (Computed) Template version of the app (string)
     */
    readonly templateVersion: string;
    /**
     * (Computed) values.yaml base64 encoded file content for the app (string)
     */
    readonly valuesYaml: string;
}
/**
 * Use this data source to retrieve information about a Rancher v2 app.
 */
export function getAppOutput(args: GetAppOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppResult> {
    return pulumi.output(args).apply((a: any) => getApp(a, opts))
}

/**
 * A collection of arguments for invoking getApp.
 */
export interface GetAppOutputArgs {
    /**
     * (Computed) Annotations for the catalog (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The app name (string)
     */
    name: pulumi.Input<string>;
    /**
     * The id of the project where the app is deployed (string)
     */
    projectId: pulumi.Input<string>;
    /**
     * The namespace name where the app is deployed (string)
     */
    targetNamespace?: pulumi.Input<string>;
}
