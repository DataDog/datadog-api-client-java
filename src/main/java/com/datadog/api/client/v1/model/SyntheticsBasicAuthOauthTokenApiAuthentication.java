/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of token to use when performing the authentication. */
@JsonSerialize(
    using =
        SyntheticsBasicAuthOauthTokenApiAuthentication
            .SyntheticsBasicAuthOauthTokenApiAuthenticationSerializer.class)
public class SyntheticsBasicAuthOauthTokenApiAuthentication extends ModelEnum<String> {

  public static final SyntheticsBasicAuthOauthTokenApiAuthentication HEADER =
      new SyntheticsBasicAuthOauthTokenApiAuthentication("header");
  public static final SyntheticsBasicAuthOauthTokenApiAuthentication BODY =
      new SyntheticsBasicAuthOauthTokenApiAuthentication("body");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("header", "body"));

  SyntheticsBasicAuthOauthTokenApiAuthentication(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SyntheticsBasicAuthOauthTokenApiAuthenticationSerializer
      extends StdSerializer<SyntheticsBasicAuthOauthTokenApiAuthentication> {
    public SyntheticsBasicAuthOauthTokenApiAuthenticationSerializer(
        Class<SyntheticsBasicAuthOauthTokenApiAuthentication> t) {
      super(t);
    }

    public SyntheticsBasicAuthOauthTokenApiAuthenticationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuthOauthTokenApiAuthentication value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBasicAuthOauthTokenApiAuthentication fromValue(String value) {
    return new SyntheticsBasicAuthOauthTokenApiAuthentication(value);
  }
}
