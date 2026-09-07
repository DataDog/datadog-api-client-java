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

/** Timings scope for response time assertions. */
@JsonSerialize(
    using = SyntheticsAssertionTimingsScope.SyntheticsAssertionTimingsScopeSerializer.class)
public class SyntheticsAssertionTimingsScope extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("all", "withoutDNS"));

  public static final SyntheticsAssertionTimingsScope ALL =
      new SyntheticsAssertionTimingsScope("all");
  public static final SyntheticsAssertionTimingsScope WITHOUT_DNS =
      new SyntheticsAssertionTimingsScope("withoutDNS");

  SyntheticsAssertionTimingsScope(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionTimingsScopeSerializer
      extends StdSerializer<SyntheticsAssertionTimingsScope> {
    public SyntheticsAssertionTimingsScopeSerializer(Class<SyntheticsAssertionTimingsScope> t) {
      super(t);
    }

    public SyntheticsAssertionTimingsScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionTimingsScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAssertionTimingsScope fromValue(String value) {
    return new SyntheticsAssertionTimingsScope(value);
  }
}
