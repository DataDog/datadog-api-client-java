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

/** Type for a JSON Patch request on a Synthetic test suite, <code>suites_json_patch</code>. */
@JsonSerialize(using = SuiteJsonPatchType.SuiteJsonPatchTypeSerializer.class)
public class SuiteJsonPatchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("suites_json_patch"));

  public static final SuiteJsonPatchType SUITES_JSON_PATCH =
      new SuiteJsonPatchType("suites_json_patch");

  SuiteJsonPatchType(String value) {
    super(value, allowedValues);
  }

  public static class SuiteJsonPatchTypeSerializer extends StdSerializer<SuiteJsonPatchType> {
    public SuiteJsonPatchTypeSerializer(Class<SuiteJsonPatchType> t) {
      super(t);
    }

    public SuiteJsonPatchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SuiteJsonPatchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SuiteJsonPatchType fromValue(String value) {
    return new SuiteJsonPatchType(value);
  }
}
