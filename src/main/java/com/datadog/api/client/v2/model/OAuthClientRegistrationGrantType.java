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

/** OAuth 2.0 grant type that a registered client may use. */
@JsonSerialize(
    using = OAuthClientRegistrationGrantType.OAuthClientRegistrationGrantTypeSerializer.class)
public class OAuthClientRegistrationGrantType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("authorization_code", "refresh_token"));

  public static final OAuthClientRegistrationGrantType AUTHORIZATION_CODE =
      new OAuthClientRegistrationGrantType("authorization_code");
  public static final OAuthClientRegistrationGrantType REFRESH_TOKEN =
      new OAuthClientRegistrationGrantType("refresh_token");

  OAuthClientRegistrationGrantType(String value) {
    super(value, allowedValues);
  }

  public static class OAuthClientRegistrationGrantTypeSerializer
      extends StdSerializer<OAuthClientRegistrationGrantType> {
    public OAuthClientRegistrationGrantTypeSerializer(Class<OAuthClientRegistrationGrantType> t) {
      super(t);
    }

    public OAuthClientRegistrationGrantTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OAuthClientRegistrationGrantType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OAuthClientRegistrationGrantType fromValue(String value) {
    return new OAuthClientRegistrationGrantType(value);
  }
}
