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

/** Error code that can be returned by a Synthetic test. */
@JsonSerialize(using = SyntheticsApiTestFailureCode.SyntheticsApiTestFailureCodeSerializer.class)
public class SyntheticsApiTestFailureCode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "BODY_TOO_LARGE",
              "DENIED",
              "TOO_MANY_REDIRECTS",
              "AUTHENTICATION_ERROR",
              "DECRYPTION",
              "INVALID_CHAR_IN_HEADER",
              "HEADER_TOO_LARGE",
              "HEADERS_INCOMPATIBLE_CONTENT_LENGTH",
              "INVALID_REQUEST",
              "REQUIRES_UPDATE",
              "UNESCAPED_CHARACTERS_IN_REQUEST_PATH",
              "MALFORMED_RESPONSE",
              "INCORRECT_ASSERTION",
              "CONNREFUSED",
              "CONNRESET",
              "DNS",
              "HOSTUNREACH",
              "NETUNREACH",
              "TIMEOUT",
              "SSL",
              "OCSP",
              "INVALID_TEST",
              "TUNNEL",
              "WEBSOCKET",
              "UNKNOWN",
              "INTERNAL_ERROR"));

  public static final SyntheticsApiTestFailureCode BODY_TOO_LARGE =
      new SyntheticsApiTestFailureCode("BODY_TOO_LARGE");
  public static final SyntheticsApiTestFailureCode DENIED =
      new SyntheticsApiTestFailureCode("DENIED");
  public static final SyntheticsApiTestFailureCode TOO_MANY_REDIRECTS =
      new SyntheticsApiTestFailureCode("TOO_MANY_REDIRECTS");
  public static final SyntheticsApiTestFailureCode AUTHENTICATION_ERROR =
      new SyntheticsApiTestFailureCode("AUTHENTICATION_ERROR");
  public static final SyntheticsApiTestFailureCode DECRYPTION =
      new SyntheticsApiTestFailureCode("DECRYPTION");
  public static final SyntheticsApiTestFailureCode INVALID_CHAR_IN_HEADER =
      new SyntheticsApiTestFailureCode("INVALID_CHAR_IN_HEADER");
  public static final SyntheticsApiTestFailureCode HEADER_TOO_LARGE =
      new SyntheticsApiTestFailureCode("HEADER_TOO_LARGE");
  public static final SyntheticsApiTestFailureCode HEADERS_INCOMPATIBLE_CONTENT_LENGTH =
      new SyntheticsApiTestFailureCode("HEADERS_INCOMPATIBLE_CONTENT_LENGTH");
  public static final SyntheticsApiTestFailureCode INVALID_REQUEST =
      new SyntheticsApiTestFailureCode("INVALID_REQUEST");
  public static final SyntheticsApiTestFailureCode REQUIRES_UPDATE =
      new SyntheticsApiTestFailureCode("REQUIRES_UPDATE");
  public static final SyntheticsApiTestFailureCode UNESCAPED_CHARACTERS_IN_REQUEST_PATH =
      new SyntheticsApiTestFailureCode("UNESCAPED_CHARACTERS_IN_REQUEST_PATH");
  public static final SyntheticsApiTestFailureCode MALFORMED_RESPONSE =
      new SyntheticsApiTestFailureCode("MALFORMED_RESPONSE");
  public static final SyntheticsApiTestFailureCode INCORRECT_ASSERTION =
      new SyntheticsApiTestFailureCode("INCORRECT_ASSERTION");
  public static final SyntheticsApiTestFailureCode CONNREFUSED =
      new SyntheticsApiTestFailureCode("CONNREFUSED");
  public static final SyntheticsApiTestFailureCode CONNRESET =
      new SyntheticsApiTestFailureCode("CONNRESET");
  public static final SyntheticsApiTestFailureCode DNS = new SyntheticsApiTestFailureCode("DNS");
  public static final SyntheticsApiTestFailureCode HOSTUNREACH =
      new SyntheticsApiTestFailureCode("HOSTUNREACH");
  public static final SyntheticsApiTestFailureCode NETUNREACH =
      new SyntheticsApiTestFailureCode("NETUNREACH");
  public static final SyntheticsApiTestFailureCode TIMEOUT =
      new SyntheticsApiTestFailureCode("TIMEOUT");
  public static final SyntheticsApiTestFailureCode SSL = new SyntheticsApiTestFailureCode("SSL");
  public static final SyntheticsApiTestFailureCode OCSP = new SyntheticsApiTestFailureCode("OCSP");
  public static final SyntheticsApiTestFailureCode INVALID_TEST =
      new SyntheticsApiTestFailureCode("INVALID_TEST");
  public static final SyntheticsApiTestFailureCode TUNNEL =
      new SyntheticsApiTestFailureCode("TUNNEL");
  public static final SyntheticsApiTestFailureCode WEBSOCKET =
      new SyntheticsApiTestFailureCode("WEBSOCKET");
  public static final SyntheticsApiTestFailureCode UNKNOWN =
      new SyntheticsApiTestFailureCode("UNKNOWN");
  public static final SyntheticsApiTestFailureCode INTERNAL_ERROR =
      new SyntheticsApiTestFailureCode("INTERNAL_ERROR");

  SyntheticsApiTestFailureCode(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsApiTestFailureCodeSerializer
      extends StdSerializer<SyntheticsApiTestFailureCode> {
    public SyntheticsApiTestFailureCodeSerializer(Class<SyntheticsApiTestFailureCode> t) {
      super(t);
    }

    public SyntheticsApiTestFailureCodeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsApiTestFailureCode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsApiTestFailureCode fromValue(String value) {
    return new SyntheticsApiTestFailureCode(value);
  }
}
