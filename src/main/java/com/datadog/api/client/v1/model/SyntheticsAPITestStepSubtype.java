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

/** The subtype of the Synthetic multi-step API test step. */
@JsonSerialize(using = SyntheticsAPITestStepSubtype.SyntheticsAPITestStepSubtypeSerializer.class)
public class SyntheticsAPITestStepSubtype extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("http", "grpc", "ssl", "dns", "tcp", "udp", "icmp", "websocket"));

  public static final SyntheticsAPITestStepSubtype HTTP = new SyntheticsAPITestStepSubtype("http");
  public static final SyntheticsAPITestStepSubtype GRPC = new SyntheticsAPITestStepSubtype("grpc");
  public static final SyntheticsAPITestStepSubtype SSL = new SyntheticsAPITestStepSubtype("ssl");
  public static final SyntheticsAPITestStepSubtype DNS = new SyntheticsAPITestStepSubtype("dns");
  public static final SyntheticsAPITestStepSubtype TCP = new SyntheticsAPITestStepSubtype("tcp");
  public static final SyntheticsAPITestStepSubtype UDP = new SyntheticsAPITestStepSubtype("udp");
  public static final SyntheticsAPITestStepSubtype ICMP = new SyntheticsAPITestStepSubtype("icmp");
  public static final SyntheticsAPITestStepSubtype WEBSOCKET =
      new SyntheticsAPITestStepSubtype("websocket");

  SyntheticsAPITestStepSubtype(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAPITestStepSubtypeSerializer
      extends StdSerializer<SyntheticsAPITestStepSubtype> {
    public SyntheticsAPITestStepSubtypeSerializer(Class<SyntheticsAPITestStepSubtype> t) {
      super(t);
    }

    public SyntheticsAPITestStepSubtypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAPITestStepSubtype value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAPITestStepSubtype fromValue(String value) {
    return new SyntheticsAPITestStepSubtype(value);
  }
}
