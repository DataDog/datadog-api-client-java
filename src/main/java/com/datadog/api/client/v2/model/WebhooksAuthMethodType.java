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

/** Webhooks auth method resource type. */
@JsonSerialize(using = WebhooksAuthMethodType.WebhooksAuthMethodTypeSerializer.class)
public class WebhooksAuthMethodType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("webhooks-auth-method"));

  public static final WebhooksAuthMethodType WEBHOOKS_AUTH_METHOD =
      new WebhooksAuthMethodType("webhooks-auth-method");

  WebhooksAuthMethodType(String value) {
    super(value, allowedValues);
  }

  public static class WebhooksAuthMethodTypeSerializer
      extends StdSerializer<WebhooksAuthMethodType> {
    public WebhooksAuthMethodTypeSerializer(Class<WebhooksAuthMethodType> t) {
      super(t);
    }

    public WebhooksAuthMethodTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WebhooksAuthMethodType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WebhooksAuthMethodType fromValue(String value) {
    return new WebhooksAuthMethodType(value);
  }
}
