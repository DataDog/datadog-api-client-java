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

/** The definition of <code>UpdateFlakyTestsResponseDataType</code> object. */
@JsonSerialize(
    using = UpdateFlakyTestsResponseDataType.UpdateFlakyTestsResponseDataTypeSerializer.class)
public class UpdateFlakyTestsResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("update_flaky_test_state_response"));

  public static final UpdateFlakyTestsResponseDataType UPDATE_FLAKY_TEST_STATE_RESPONSE =
      new UpdateFlakyTestsResponseDataType("update_flaky_test_state_response");

  UpdateFlakyTestsResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class UpdateFlakyTestsResponseDataTypeSerializer
      extends StdSerializer<UpdateFlakyTestsResponseDataType> {
    public UpdateFlakyTestsResponseDataTypeSerializer(Class<UpdateFlakyTestsResponseDataType> t) {
      super(t);
    }

    public UpdateFlakyTestsResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UpdateFlakyTestsResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UpdateFlakyTestsResponseDataType fromValue(String value) {
    return new UpdateFlakyTestsResponseDataType(value);
  }
}
