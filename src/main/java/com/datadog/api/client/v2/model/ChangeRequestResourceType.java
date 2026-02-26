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

/** Change request resource type. */
@JsonSerialize(using = ChangeRequestResourceType.ChangeRequestResourceTypeSerializer.class)
public class ChangeRequestResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change_request"));

  public static final ChangeRequestResourceType CHANGE_REQUEST =
      new ChangeRequestResourceType("change_request");

  ChangeRequestResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeRequestResourceTypeSerializer
      extends StdSerializer<ChangeRequestResourceType> {
    public ChangeRequestResourceTypeSerializer(Class<ChangeRequestResourceType> t) {
      super(t);
    }

    public ChangeRequestResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeRequestResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeRequestResourceType fromValue(String value) {
    return new ChangeRequestResourceType(value);
  }
}
