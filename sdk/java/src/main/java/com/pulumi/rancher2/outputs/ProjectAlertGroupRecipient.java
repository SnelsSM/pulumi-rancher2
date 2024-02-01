// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAlertGroupRecipient {
    /**
     * @return Use notifier default recipient
     * 
     */
    private @Nullable Boolean defaultRecipient;
    /**
     * @return Recipient notifier ID (string)
     * 
     */
    private String notifierId;
    /**
     * @return Recipient notifier ID. Supported values : `&#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
     * 
     */
    private @Nullable String notifierType;
    /**
     * @return Recipient (string)
     * 
     */
    private @Nullable String recipient;

    private ProjectAlertGroupRecipient() {}
    /**
     * @return Use notifier default recipient
     * 
     */
    public Optional<Boolean> defaultRecipient() {
        return Optional.ofNullable(this.defaultRecipient);
    }
    /**
     * @return Recipient notifier ID (string)
     * 
     */
    public String notifierId() {
        return this.notifierId;
    }
    /**
     * @return Recipient notifier ID. Supported values : `&#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
     * 
     */
    public Optional<String> notifierType() {
        return Optional.ofNullable(this.notifierType);
    }
    /**
     * @return Recipient (string)
     * 
     */
    public Optional<String> recipient() {
        return Optional.ofNullable(this.recipient);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAlertGroupRecipient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean defaultRecipient;
        private String notifierId;
        private @Nullable String notifierType;
        private @Nullable String recipient;
        public Builder() {}
        public Builder(ProjectAlertGroupRecipient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRecipient = defaults.defaultRecipient;
    	      this.notifierId = defaults.notifierId;
    	      this.notifierType = defaults.notifierType;
    	      this.recipient = defaults.recipient;
        }

        @CustomType.Setter
        public Builder defaultRecipient(@Nullable Boolean defaultRecipient) {

            this.defaultRecipient = defaultRecipient;
            return this;
        }
        @CustomType.Setter
        public Builder notifierId(String notifierId) {
            if (notifierId == null) {
              throw new MissingRequiredPropertyException("ProjectAlertGroupRecipient", "notifierId");
            }
            this.notifierId = notifierId;
            return this;
        }
        @CustomType.Setter
        public Builder notifierType(@Nullable String notifierType) {

            this.notifierType = notifierType;
            return this;
        }
        @CustomType.Setter
        public Builder recipient(@Nullable String recipient) {

            this.recipient = recipient;
            return this;
        }
        public ProjectAlertGroupRecipient build() {
            final var _resultValue = new ProjectAlertGroupRecipient();
            _resultValue.defaultRecipient = defaultRecipient;
            _resultValue.notifierId = notifierId;
            _resultValue.notifierType = notifierType;
            _resultValue.recipient = recipient;
            return _resultValue;
        }
    }
}
