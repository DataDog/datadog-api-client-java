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
 * How the saved filter was authored. RULES indicates rule-based authoring and LIST indicates list
 * import. Both types return targeting rules and conditions.
 */
@JsonSerialize(using = SavedFilterCreationType.SavedFilterCreationTypeSerializer.class)
public class SavedFilterCreationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("RULES", "LIST"));

  public static final SavedFilterCreationType RULES = new SavedFilterCreationType("RULES");
  public static final SavedFilterCreationType LIST = new SavedFilterCreationType("LIST");

  SavedFilterCreationType(String value) {
    super(value, allowedValues);
  }

  public static class SavedFilterCreationTypeSerializer
      extends StdSerializer<SavedFilterCreationType> {
    public SavedFilterCreationTypeSerializer(Class<SavedFilterCreationType> t) {
      super(t);
    }

    public SavedFilterCreationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SavedFilterCreationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SavedFilterCreationType fromValue(String value) {
    return new SavedFilterCreationType(value);
  }
}
