/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Update request of a custom variable object.  *All properties are optional.*
 */
@ApiModel(description = "Update request of a custom variable object.  *All properties are optional.*")
@JsonPropertyOrder(
    {
        WebhooksIntegrationCustomVariableUpdateRequest.JSON_PROPERTY_IS_SECRET,
        WebhooksIntegrationCustomVariableUpdateRequest.JSON_PROPERTY_NAME,
        WebhooksIntegrationCustomVariableUpdateRequest.JSON_PROPERTY_VALUE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksIntegrationCustomVariableUpdateRequest {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_IS_SECRET = "is_secret";
    private Boolean isSecret;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_VALUE = "value";
    private String value;

    public WebhooksIntegrationCustomVariableUpdateRequest isSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * Make custom variable is secret or not. If the custom variable is secret, the value is not returned in the response payload.
     * @return isSecret
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Make custom variable is secret or not. If the custom variable is secret, the value is not returned in the response payload."
    )
    @JsonProperty(JSON_PROPERTY_IS_SECRET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }

    public WebhooksIntegrationCustomVariableUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable. It corresponds with &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;. It must only contains upper-case characters, integers or underscores.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "CUSTOM_VARIABLE_NAME",
        value = "The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`. It must only contains upper-case characters, integers or underscores."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhooksIntegrationCustomVariableUpdateRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Value of the custom variable.
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "CUSTOM_VARIABLE_VALUE", value = "Value of the custom variable.")
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Return true if this WebhooksIntegrationCustomVariableUpdateRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksIntegrationCustomVariableUpdateRequest webhooksIntegrationCustomVariableUpdateRequest = (WebhooksIntegrationCustomVariableUpdateRequest) o;
        return (
            Objects.equals(this.isSecret, webhooksIntegrationCustomVariableUpdateRequest.isSecret) &&
            Objects.equals(this.name, webhooksIntegrationCustomVariableUpdateRequest.name) &&
            Objects.equals(this.value, webhooksIntegrationCustomVariableUpdateRequest.value)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSecret, name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksIntegrationCustomVariableUpdateRequest {\n");
        sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
