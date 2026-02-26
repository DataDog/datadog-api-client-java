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

/** Type of the Synthetic suite, <code>suite</code>. */
@JsonSerialize(using = SyntheticsSuiteType.SyntheticsSuiteTypeSerializer.class)
public class SyntheticsSuiteType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("suite"));

  public static final SyntheticsSuiteType SUITE = new SyntheticsSuiteType("suite");

  SyntheticsSuiteType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsSuiteTypeSerializer extends StdSerializer<SyntheticsSuiteType> {
    public SyntheticsSuiteTypeSerializer(Class<SyntheticsSuiteType> t) {
      super(t);
    }

    public SyntheticsSuiteTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsSuiteType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsSuiteType fromValue(String value) {
    return new SyntheticsSuiteType(value);
  }
}
