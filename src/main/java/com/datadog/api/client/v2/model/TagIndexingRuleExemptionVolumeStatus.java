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
 * Indicates whether <code>estimated_change_in_volume</code> is available and, if not, why. <code>ok
 * </code> indicates a fresh estimate. <code>unindexed_tags</code> indicates that the matching rule
 * uses tags that are not indexed for the metric. <code>unavailable</code> indicates that the
 * estimate is stale, was not computed, or could not be retrieved.
 */
@JsonSerialize(
    using =
        TagIndexingRuleExemptionVolumeStatus.TagIndexingRuleExemptionVolumeStatusSerializer.class)
public class TagIndexingRuleExemptionVolumeStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ok", "unindexed_tags", "unavailable"));

  public static final TagIndexingRuleExemptionVolumeStatus OK =
      new TagIndexingRuleExemptionVolumeStatus("ok");
  public static final TagIndexingRuleExemptionVolumeStatus UNINDEXED_TAGS =
      new TagIndexingRuleExemptionVolumeStatus("unindexed_tags");
  public static final TagIndexingRuleExemptionVolumeStatus UNAVAILABLE =
      new TagIndexingRuleExemptionVolumeStatus("unavailable");

  TagIndexingRuleExemptionVolumeStatus(String value) {
    super(value, allowedValues);
  }

  public static class TagIndexingRuleExemptionVolumeStatusSerializer
      extends StdSerializer<TagIndexingRuleExemptionVolumeStatus> {
    public TagIndexingRuleExemptionVolumeStatusSerializer(
        Class<TagIndexingRuleExemptionVolumeStatus> t) {
      super(t);
    }

    public TagIndexingRuleExemptionVolumeStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagIndexingRuleExemptionVolumeStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagIndexingRuleExemptionVolumeStatus fromValue(String value) {
    return new TagIndexingRuleExemptionVolumeStatus(value);
  }
}
