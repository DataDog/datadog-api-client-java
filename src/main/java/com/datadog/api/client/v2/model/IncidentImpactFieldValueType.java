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

/** The type of an impact field. */
@JsonSerialize(using = IncidentImpactFieldValueType.IncidentImpactFieldValueTypeSerializer.class)
public class IncidentImpactFieldValueType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "dropdown", "text", "textarray", "metrictag", "number", "datetime", "multiselect"));

  public static final IncidentImpactFieldValueType DROPDOWN =
      new IncidentImpactFieldValueType("dropdown");
  public static final IncidentImpactFieldValueType TEXT = new IncidentImpactFieldValueType("text");
  public static final IncidentImpactFieldValueType TEXTARRAY =
      new IncidentImpactFieldValueType("textarray");
  public static final IncidentImpactFieldValueType METRICTAG =
      new IncidentImpactFieldValueType("metrictag");
  public static final IncidentImpactFieldValueType NUMBER =
      new IncidentImpactFieldValueType("number");
  public static final IncidentImpactFieldValueType DATETIME =
      new IncidentImpactFieldValueType("datetime");
  public static final IncidentImpactFieldValueType MULTISELECT =
      new IncidentImpactFieldValueType("multiselect");

  IncidentImpactFieldValueType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentImpactFieldValueTypeSerializer
      extends StdSerializer<IncidentImpactFieldValueType> {
    public IncidentImpactFieldValueTypeSerializer(Class<IncidentImpactFieldValueType> t) {
      super(t);
    }

    public IncidentImpactFieldValueTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentImpactFieldValueType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentImpactFieldValueType fromValue(String value) {
    return new IncidentImpactFieldValueType(value);
  }
}
