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

/** The type of basic authentication to use when performing the test. */
@JsonSerialize(
    using = SyntheticsBasicAuthOauthClientType.SyntheticsBasicAuthOauthClientTypeSerializer.class)
public class SyntheticsBasicAuthOauthClientType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("oauth-client"));

  public static final SyntheticsBasicAuthOauthClientType OAUTH_CLIENT =
      new SyntheticsBasicAuthOauthClientType("oauth-client");

  SyntheticsBasicAuthOauthClientType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBasicAuthOauthClientTypeSerializer
      extends StdSerializer<SyntheticsBasicAuthOauthClientType> {
    public SyntheticsBasicAuthOauthClientTypeSerializer(
        Class<SyntheticsBasicAuthOauthClientType> t) {
      super(t);
    }

    public SyntheticsBasicAuthOauthClientTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuthOauthClientType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBasicAuthOauthClientType fromValue(String value) {
    return new SyntheticsBasicAuthOauthClientType(value);
  }
}
