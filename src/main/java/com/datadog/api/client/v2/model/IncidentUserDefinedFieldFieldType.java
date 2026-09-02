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
 * The data type of the field. 1=dropdown, 2=multiselect, 3=textbox, 4=textarray, 5=metrictag,
 * 6=autocomplete, 7=number, 8=datetime.
 */
@JsonSerialize(
    using = IncidentUserDefinedFieldFieldType.IncidentUserDefinedFieldFieldTypeSerializer.class)
public class IncidentUserDefinedFieldFieldType extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

  public static final IncidentUserDefinedFieldFieldType DROPDOWN =
      new IncidentUserDefinedFieldFieldType(1);
  public static final IncidentUserDefinedFieldFieldType MULTISELECT =
      new IncidentUserDefinedFieldFieldType(2);
  public static final IncidentUserDefinedFieldFieldType TEXTBOX =
      new IncidentUserDefinedFieldFieldType(3);
  public static final IncidentUserDefinedFieldFieldType TEXTARRAY =
      new IncidentUserDefinedFieldFieldType(4);
  public static final IncidentUserDefinedFieldFieldType METRICTAG =
      new IncidentUserDefinedFieldFieldType(5);
  public static final IncidentUserDefinedFieldFieldType AUTOCOMPLETE =
      new IncidentUserDefinedFieldFieldType(6);
  public static final IncidentUserDefinedFieldFieldType NUMBER =
      new IncidentUserDefinedFieldFieldType(7);
  public static final IncidentUserDefinedFieldFieldType DATETIME =
      new IncidentUserDefinedFieldFieldType(8);

  IncidentUserDefinedFieldFieldType(Integer value) {
    super(value, allowedValues);
  }

  public static class IncidentUserDefinedFieldFieldTypeSerializer
      extends StdSerializer<IncidentUserDefinedFieldFieldType> {
    public IncidentUserDefinedFieldFieldTypeSerializer(Class<IncidentUserDefinedFieldFieldType> t) {
      super(t);
    }

    public IncidentUserDefinedFieldFieldTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentUserDefinedFieldFieldType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentUserDefinedFieldFieldType fromValue(Integer value) {
    return new IncidentUserDefinedFieldFieldType(value);
  }
}
