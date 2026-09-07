/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** OAuth2 client credentials resource type. */
@JsonSerialize(
    using = WebhooksOAuth2ClientCredentialsType.WebhooksOAuth2ClientCredentialsTypeSerializer.class)
public class WebhooksOAuth2ClientCredentialsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("webhooks-auth-method-oauth2-client-credentials"));

  public static final WebhooksOAuth2ClientCredentialsType
      WEBHOOKS_AUTH_METHOD_OAUTH2_CLIENT_CREDENTIALS =
          new WebhooksOAuth2ClientCredentialsType("webhooks-auth-method-oauth2-client-credentials");

  WebhooksOAuth2ClientCredentialsType(String value) {
    super(value, allowedValues);
  }

  public static class WebhooksOAuth2ClientCredentialsTypeSerializer
      extends StdSerializer<WebhooksOAuth2ClientCredentialsType> {
    public WebhooksOAuth2ClientCredentialsTypeSerializer(
        Class<WebhooksOAuth2ClientCredentialsType> t) {
      super(t);
    }

    public WebhooksOAuth2ClientCredentialsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WebhooksOAuth2ClientCredentialsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WebhooksOAuth2ClientCredentialsType fromValue(String value) {
    return new WebhooksOAuth2ClientCredentialsType(value);
  }
}
