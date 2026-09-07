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

/** Type of the request body. */
@JsonSerialize(using = SyntheticsTestRequestBodyType.SyntheticsTestRequestBodyTypeSerializer.class)
public class SyntheticsTestRequestBodyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "text/plain",
              "application/json",
              "text/xml",
              "text/html",
              "application/x-www-form-urlencoded",
              "graphql",
              "application/octet-stream",
              "multipart/form-data"));

  public static final SyntheticsTestRequestBodyType TEXT_PLAIN =
      new SyntheticsTestRequestBodyType("text/plain");
  public static final SyntheticsTestRequestBodyType APPLICATION_JSON =
      new SyntheticsTestRequestBodyType("application/json");
  public static final SyntheticsTestRequestBodyType TEXT_XML =
      new SyntheticsTestRequestBodyType("text/xml");
  public static final SyntheticsTestRequestBodyType TEXT_HTML =
      new SyntheticsTestRequestBodyType("text/html");
  public static final SyntheticsTestRequestBodyType APPLICATION_X_WWW_FORM_URLENCODED =
      new SyntheticsTestRequestBodyType("application/x-www-form-urlencoded");
  public static final SyntheticsTestRequestBodyType GRAPHQL =
      new SyntheticsTestRequestBodyType("graphql");
  public static final SyntheticsTestRequestBodyType APPLICATION_OCTET_STREAM =
      new SyntheticsTestRequestBodyType("application/octet-stream");
  public static final SyntheticsTestRequestBodyType MULTIPART_FORM_DATA =
      new SyntheticsTestRequestBodyType("multipart/form-data");

  SyntheticsTestRequestBodyType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestRequestBodyTypeSerializer
      extends StdSerializer<SyntheticsTestRequestBodyType> {
    public SyntheticsTestRequestBodyTypeSerializer(Class<SyntheticsTestRequestBodyType> t) {
      super(t);
    }

    public SyntheticsTestRequestBodyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestRequestBodyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestRequestBodyType fromValue(String value) {
    return new SyntheticsTestRequestBodyType(value);
  }
}
