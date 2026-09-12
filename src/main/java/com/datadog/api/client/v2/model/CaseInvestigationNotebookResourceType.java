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

/** Case investigation notebook resource type. */
@JsonSerialize(
    using =
        CaseInvestigationNotebookResourceType.CaseInvestigationNotebookResourceTypeSerializer.class)
public class CaseInvestigationNotebookResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("notebook"));

  public static final CaseInvestigationNotebookResourceType NOTEBOOK =
      new CaseInvestigationNotebookResourceType("notebook");

  CaseInvestigationNotebookResourceType(String value) {
    super(value, allowedValues);
  }

  public static class CaseInvestigationNotebookResourceTypeSerializer
      extends StdSerializer<CaseInvestigationNotebookResourceType> {
    public CaseInvestigationNotebookResourceTypeSerializer(
        Class<CaseInvestigationNotebookResourceType> t) {
      super(t);
    }

    public CaseInvestigationNotebookResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CaseInvestigationNotebookResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseInvestigationNotebookResourceType fromValue(String value) {
    return new CaseInvestigationNotebookResourceType(value);
  }
}
