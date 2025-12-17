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

/** The sort parameters when querying security findings. */
@JsonSerialize(using = SecurityFindingsSort.SecurityFindingsSortSerializer.class)
public class SecurityFindingsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("@detection_changed_at", "-@detection_changed_at"));

  public static final SecurityFindingsSort DETECTION_CHANGED_AT_ASC =
      new SecurityFindingsSort("@detection_changed_at");
  public static final SecurityFindingsSort DETECTION_CHANGED_AT_DESC =
      new SecurityFindingsSort("-@detection_changed_at");

  SecurityFindingsSort(String value) {
    super(value, allowedValues);
  }

  public static class SecurityFindingsSortSerializer extends StdSerializer<SecurityFindingsSort> {
    public SecurityFindingsSortSerializer(Class<SecurityFindingsSort> t) {
      super(t);
    }

    public SecurityFindingsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityFindingsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityFindingsSort fromValue(String value) {
    return new SecurityFindingsSort(value);
  }
}
