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

/** HTTP version to use for a Synthetic test. */
@JsonSerialize(
    using = SyntheticsTestOptionsHTTPVersion.SyntheticsTestOptionsHTTPVersionSerializer.class)
public class SyntheticsTestOptionsHTTPVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("http1", "http2", "any"));

  public static final SyntheticsTestOptionsHTTPVersion HTTP1 =
      new SyntheticsTestOptionsHTTPVersion("http1");
  public static final SyntheticsTestOptionsHTTPVersion HTTP2 =
      new SyntheticsTestOptionsHTTPVersion("http2");
  public static final SyntheticsTestOptionsHTTPVersion ANY =
      new SyntheticsTestOptionsHTTPVersion("any");

  SyntheticsTestOptionsHTTPVersion(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestOptionsHTTPVersionSerializer
      extends StdSerializer<SyntheticsTestOptionsHTTPVersion> {
    public SyntheticsTestOptionsHTTPVersionSerializer(Class<SyntheticsTestOptionsHTTPVersion> t) {
      super(t);
    }

    public SyntheticsTestOptionsHTTPVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestOptionsHTTPVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestOptionsHTTPVersion fromValue(String value) {
    return new SyntheticsTestOptionsHTTPVersion(value);
  }
}
