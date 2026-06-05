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

/** Algorithm to use for the JWT authentication. */
@JsonSerialize(
    using = SyntheticsBasicAuthJWTAlgorithm.SyntheticsBasicAuthJWTAlgorithmSerializer.class)
public class SyntheticsBasicAuthJWTAlgorithm extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("HS256", "RS256", "ES256"));

  public static final SyntheticsBasicAuthJWTAlgorithm HS256 =
      new SyntheticsBasicAuthJWTAlgorithm("HS256");
  public static final SyntheticsBasicAuthJWTAlgorithm RS256 =
      new SyntheticsBasicAuthJWTAlgorithm("RS256");
  public static final SyntheticsBasicAuthJWTAlgorithm ES256 =
      new SyntheticsBasicAuthJWTAlgorithm("ES256");

  SyntheticsBasicAuthJWTAlgorithm(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBasicAuthJWTAlgorithmSerializer
      extends StdSerializer<SyntheticsBasicAuthJWTAlgorithm> {
    public SyntheticsBasicAuthJWTAlgorithmSerializer(Class<SyntheticsBasicAuthJWTAlgorithm> t) {
      super(t);
    }

    public SyntheticsBasicAuthJWTAlgorithmSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuthJWTAlgorithm value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBasicAuthJWTAlgorithm fromValue(String value) {
    return new SyntheticsBasicAuthJWTAlgorithm(value);
  }
}
