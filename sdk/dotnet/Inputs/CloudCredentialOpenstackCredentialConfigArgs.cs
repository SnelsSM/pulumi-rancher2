// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class CloudCredentialOpenstackCredentialConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// vSphere password (string)
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CloudCredentialOpenstackCredentialConfigArgs()
        {
        }
        public static new CloudCredentialOpenstackCredentialConfigArgs Empty => new CloudCredentialOpenstackCredentialConfigArgs();
    }
}
