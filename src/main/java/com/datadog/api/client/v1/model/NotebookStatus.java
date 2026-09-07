/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Publication status of the notebook. For now, always "published". */
@JsonSerialize(using = NotebookStatus.NotebookStatusSerializer.class)
public class NotebookStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("published"));

  public static final NotebookStatus PUBLISHED = new NotebookStatus("published");

  NotebookStatus(String value) {
    super(value, allowedValues);
  }

  public static class NotebookStatusSerializer extends StdSerializer<NotebookStatus> {
    public NotebookStatusSerializer(Class<NotebookStatus> t) {
      super(t);
    }

    public NotebookStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(NotebookStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotebookStatus fromValue(String value) {
    return new NotebookStatus(value);
  }
}
