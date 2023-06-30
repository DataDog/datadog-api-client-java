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
    using = SyntheticsBasicAuthOauthROPType.SyntheticsBasicAuthOauthROPTypeSerializer.class)
public class SyntheticsBasicAuthOauthROPType extends ModelEnum<String> {

  public static final SyntheticsBasicAuthOauthROPType OAUTH_ROP =
      new SyntheticsBasicAuthOauthROPType("oauth-rop");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("oauth-rop"));

  SyntheticsBasicAuthOauthROPType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SyntheticsBasicAuthOauthROPTypeSerializer
      extends StdSerializer<SyntheticsBasicAuthOauthROPType> {
    public SyntheticsBasicAuthOauthROPTypeSerializer(Class<SyntheticsBasicAuthOauthROPType> t) {
      super(t);
    }

    public SyntheticsBasicAuthOauthROPTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuthOauthROPType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBasicAuthOauthROPType fromValue(String value) {
    return new SyntheticsBasicAuthOauthROPType(value);
  }
}
