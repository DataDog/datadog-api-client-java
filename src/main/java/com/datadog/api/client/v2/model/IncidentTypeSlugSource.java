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
 * When set to <code>servicenow</code>, incidents will display the ServiceNow record ID instead of
 * the public ID. If no ServiceNow integration exists, the public ID will be displayed.
 */
@JsonSerialize(using = IncidentTypeSlugSource.IncidentTypeSlugSourceSerializer.class)
public class IncidentTypeSlugSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "servicenow"));

  public static final IncidentTypeSlugSource DEFAULT = new IncidentTypeSlugSource("default");
  public static final IncidentTypeSlugSource SERVICENOW = new IncidentTypeSlugSource("servicenow");

  IncidentTypeSlugSource(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTypeSlugSourceSerializer
      extends StdSerializer<IncidentTypeSlugSource> {
    public IncidentTypeSlugSourceSerializer(Class<IncidentTypeSlugSource> t) {
      super(t);
    }

    public IncidentTypeSlugSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTypeSlugSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTypeSlugSource fromValue(String value) {
    return new IncidentTypeSlugSource(value);
  }
}
