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

/** Case status */
@JsonSerialize(using = CaseStatus.CaseStatusSerializer.class)
public class CaseStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OPEN", "IN_PROGRESS", "CLOSED"));

  public static final CaseStatus OPEN = new CaseStatus("OPEN");
  public static final CaseStatus IN_PROGRESS = new CaseStatus("IN_PROGRESS");
  public static final CaseStatus CLOSED = new CaseStatus("CLOSED");

  CaseStatus(String value) {
    super(value, allowedValues);
  }

  public static class CaseStatusSerializer extends StdSerializer<CaseStatus> {
    public CaseStatusSerializer(Class<CaseStatus> t) {
      super(t);
    }

    public CaseStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(CaseStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseStatus fromValue(String value) {
    return new CaseStatus(value);
  }
}
