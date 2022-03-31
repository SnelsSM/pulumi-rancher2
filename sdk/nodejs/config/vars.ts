// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("rancher2");

/**
 * API Key used to authenticate with the rancher server
 */
export declare const accessKey: string | undefined;
Object.defineProperty(exports, "accessKey", {
    get() {
        return __config.get("accessKey");
    },
    enumerable: true,
});

/**
 * The URL to the rancher API
 */
export declare const apiUrl: string | undefined;
Object.defineProperty(exports, "apiUrl", {
    get() {
        return __config.get("apiUrl");
    },
    enumerable: true,
});

/**
 * Bootstrap rancher server
 */
export declare const bootstrap: boolean;
Object.defineProperty(exports, "bootstrap", {
    get() {
        return __config.getObject<boolean>("bootstrap") ?? (utilities.getEnvBoolean("RANCHER_BOOTSTRAP") || false);
    },
    enumerable: true,
});

/**
 * CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
 */
export declare const caCerts: string | undefined;
Object.defineProperty(exports, "caCerts", {
    get() {
        return __config.get("caCerts");
    },
    enumerable: true,
});

/**
 * Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
 */
export declare const insecure: boolean;
Object.defineProperty(exports, "insecure", {
    get() {
        return __config.getObject<boolean>("insecure") ?? (utilities.getEnvBoolean("RANCHER_INSECURE") || false);
    },
    enumerable: true,
});

/**
 * Rancher connection retries
 */
export declare const retries: number | undefined;
Object.defineProperty(exports, "retries", {
    get() {
        return __config.getObject<number>("retries");
    },
    enumerable: true,
});

/**
 * API secret used to authenticate with the rancher server
 */
export declare const secretKey: string | undefined;
Object.defineProperty(exports, "secretKey", {
    get() {
        return __config.get("secretKey");
    },
    enumerable: true,
});

/**
 * Rancher connection timeout (retry every 5s). Golang duration format, ex: "60s"
 */
export declare const timeout: string | undefined;
Object.defineProperty(exports, "timeout", {
    get() {
        return __config.get("timeout");
    },
    enumerable: true,
});

/**
 * API token used to authenticate with the rancher server
 */
export declare const tokenKey: string | undefined;
Object.defineProperty(exports, "tokenKey", {
    get() {
        return __config.get("tokenKey");
    },
    enumerable: true,
});

