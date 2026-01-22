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

/** The definition of <code>UpdateFlakyTestsRequestDataType</code> object. */
@JsonSerialize(
    using = UpdateFlakyTestsRequestDataType.UpdateFlakyTestsRequestDataTypeSerializer.class)
public class UpdateFlakyTestsRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("update_flaky_test_state_request"));

  public static final UpdateFlakyTestsRequestDataType UPDATE_FLAKY_TEST_STATE_REQUEST =
      new UpdateFlakyTestsRequestDataType("update_flaky_test_state_request");

  UpdateFlakyTestsRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class UpdateFlakyTestsRequestDataTypeSerializer
      extends StdSerializer<UpdateFlakyTestsRequestDataType> {
    public UpdateFlakyTestsRequestDataTypeSerializer(Class<UpdateFlakyTestsRequestDataType> t) {
      super(t);
    }

    public UpdateFlakyTestsRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UpdateFlakyTestsRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UpdateFlakyTestsRequestDataType fromValue(String value) {
    return new UpdateFlakyTestsRequestDataType(value);
  }
}
