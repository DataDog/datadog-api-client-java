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

/** OAuth 2.0 response type that a registered client may use. */
@JsonSerialize(
    using = OAuthClientRegistrationResponseType.OAuthClientRegistrationResponseTypeSerializer.class)
public class OAuthClientRegistrationResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("code"));

  public static final OAuthClientRegistrationResponseType CODE =
      new OAuthClientRegistrationResponseType("code");

  OAuthClientRegistrationResponseType(String value) {
    super(value, allowedValues);
  }

  public static class OAuthClientRegistrationResponseTypeSerializer
      extends StdSerializer<OAuthClientRegistrationResponseType> {
    public OAuthClientRegistrationResponseTypeSerializer(
        Class<OAuthClientRegistrationResponseType> t) {
      super(t);
    }

    public OAuthClientRegistrationResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OAuthClientRegistrationResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OAuthClientRegistrationResponseType fromValue(String value) {
    return new OAuthClientRegistrationResponseType(value);
  }
}
