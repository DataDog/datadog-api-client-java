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

/** The JSON:API type for due date rules. */
@JsonSerialize(using = DueDateRuleType.DueDateRuleTypeSerializer.class)
public class DueDateRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("due_date_rules"));

  public static final DueDateRuleType DUE_DATE_RULES = new DueDateRuleType("due_date_rules");

  DueDateRuleType(String value) {
    super(value, allowedValues);
  }

  public static class DueDateRuleTypeSerializer extends StdSerializer<DueDateRuleType> {
    public DueDateRuleTypeSerializer(Class<DueDateRuleType> t) {
      super(t);
    }

    public DueDateRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DueDateRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DueDateRuleType fromValue(String value) {
    return new DueDateRuleType(value);
  }
}
