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

/**
 * The section in which the field appears: "what_happened" or "why_it_happened". When null, the
 * field appears in the Attributes section.
 */
@JsonSerialize(
    using = IncidentUserDefinedFieldCategory.IncidentUserDefinedFieldCategorySerializer.class)
public class IncidentUserDefinedFieldCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("what_happened", "why_it_happened"));

  public static final IncidentUserDefinedFieldCategory WHAT_HAPPENED =
      new IncidentUserDefinedFieldCategory("what_happened");
  public static final IncidentUserDefinedFieldCategory WHY_IT_HAPPENED =
      new IncidentUserDefinedFieldCategory("why_it_happened");

  IncidentUserDefinedFieldCategory(String value) {
    super(value, allowedValues);
  }

  public static class IncidentUserDefinedFieldCategorySerializer
      extends StdSerializer<IncidentUserDefinedFieldCategory> {
    public IncidentUserDefinedFieldCategorySerializer(Class<IncidentUserDefinedFieldCategory> t) {
      super(t);
    }

    public IncidentUserDefinedFieldCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentUserDefinedFieldCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentUserDefinedFieldCategory fromValue(String value) {
    return new IncidentUserDefinedFieldCategory(value);
  }
}
