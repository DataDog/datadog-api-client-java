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

/** Status group of the case. */
@JsonSerialize(using = CaseStatusGroup.CaseStatusGroupSerializer.class)
public class CaseStatusGroup extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("SG_OPEN", "SG_IN_PROGRESS", "SG_CLOSED"));

  public static final CaseStatusGroup SG_OPEN = new CaseStatusGroup("SG_OPEN");
  public static final CaseStatusGroup SG_IN_PROGRESS = new CaseStatusGroup("SG_IN_PROGRESS");
  public static final CaseStatusGroup SG_CLOSED = new CaseStatusGroup("SG_CLOSED");

  CaseStatusGroup(String value) {
    super(value, allowedValues);
  }

  public static class CaseStatusGroupSerializer extends StdSerializer<CaseStatusGroup> {
    public CaseStatusGroupSerializer(Class<CaseStatusGroup> t) {
      super(t);
    }

    public CaseStatusGroupSerializer() {
      this(null);
    }

    @Override
    public void serialize(CaseStatusGroup value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseStatusGroup fromValue(String value) {
    return new CaseStatusGroup(value);
  }
}
