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

/** The definition of <code>DORAListFailuresRequestDataType</code> object. */
@JsonSerialize(
    using = DORAListFailuresRequestDataType.DORAListFailuresRequestDataTypeSerializer.class)
public class DORAListFailuresRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dora_failures_list_request"));

  public static final DORAListFailuresRequestDataType DORA_FAILURES_LIST_REQUEST =
      new DORAListFailuresRequestDataType("dora_failures_list_request");

  DORAListFailuresRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class DORAListFailuresRequestDataTypeSerializer
      extends StdSerializer<DORAListFailuresRequestDataType> {
    public DORAListFailuresRequestDataTypeSerializer(Class<DORAListFailuresRequestDataType> t) {
      super(t);
    }

    public DORAListFailuresRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DORAListFailuresRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DORAListFailuresRequestDataType fromValue(String value) {
    return new DORAListFailuresRequestDataType(value);
  }
}
