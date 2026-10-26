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

/** Sort field for tag indexing rule exemptions. */
@JsonSerialize(using = TagIndexingRuleExemptionSort.TagIndexingRuleExemptionSortSerializer.class)
public class TagIndexingRuleExemptionSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "name", "-name", "estimated_change_in_volume", "-estimated_change_in_volume"));

  public static final TagIndexingRuleExemptionSort NAME = new TagIndexingRuleExemptionSort("name");
  public static final TagIndexingRuleExemptionSort NAME_DESCENDING =
      new TagIndexingRuleExemptionSort("-name");
  public static final TagIndexingRuleExemptionSort ESTIMATED_CHANGE_IN_VOLUME =
      new TagIndexingRuleExemptionSort("estimated_change_in_volume");
  public static final TagIndexingRuleExemptionSort ESTIMATED_CHANGE_IN_VOLUME_DESCENDING =
      new TagIndexingRuleExemptionSort("-estimated_change_in_volume");

  TagIndexingRuleExemptionSort(String value) {
    super(value, allowedValues);
  }

  public static class TagIndexingRuleExemptionSortSerializer
      extends StdSerializer<TagIndexingRuleExemptionSort> {
    public TagIndexingRuleExemptionSortSerializer(Class<TagIndexingRuleExemptionSort> t) {
      super(t);
    }

    public TagIndexingRuleExemptionSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagIndexingRuleExemptionSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagIndexingRuleExemptionSort fromValue(String value) {
    return new TagIndexingRuleExemptionSort(value);
  }
}
