/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using = StructuredAnalysisTransformation.StructuredAnalysisTransformationDeserializer.class)
@JsonSerialize(
    using = StructuredAnalysisTransformation.StructuredAnalysisTransformationSerializer.class)
public class StructuredAnalysisTransformation extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(StructuredAnalysisTransformation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class StructuredAnalysisTransformationSerializer
      extends StdSerializer<StructuredAnalysisTransformation> {
    public StructuredAnalysisTransformationSerializer(Class<StructuredAnalysisTransformation> t) {
      super(t);
    }

    public StructuredAnalysisTransformationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StructuredAnalysisTransformation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class StructuredAnalysisTransformationDeserializer
      extends StdDeserializer<StructuredAnalysisTransformation> {
    public StructuredAnalysisTransformationDeserializer() {
      this(StructuredAnalysisTransformation.class);
    }

    public StructuredAnalysisTransformationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public StructuredAnalysisTransformation deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize StructuredAnalysisFilter
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisFilter.class.equals(Integer.class)
            || StructuredAnalysisFilter.class.equals(Long.class)
            || StructuredAnalysisFilter.class.equals(Float.class)
            || StructuredAnalysisFilter.class.equals(Double.class)
            || StructuredAnalysisFilter.class.equals(Boolean.class)
            || StructuredAnalysisFilter.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisFilter.class.equals(Integer.class)
                        || StructuredAnalysisFilter.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisFilter.class.equals(Float.class)
                        || StructuredAnalysisFilter.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisFilter.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisFilter.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisFilter.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisFilter) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisFilter'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisFilter'", e);
      }

      // deserialize StructuredAnalysisColumnExtraction
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisColumnExtraction.class.equals(Integer.class)
            || StructuredAnalysisColumnExtraction.class.equals(Long.class)
            || StructuredAnalysisColumnExtraction.class.equals(Float.class)
            || StructuredAnalysisColumnExtraction.class.equals(Double.class)
            || StructuredAnalysisColumnExtraction.class.equals(Boolean.class)
            || StructuredAnalysisColumnExtraction.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisColumnExtraction.class.equals(Integer.class)
                        || StructuredAnalysisColumnExtraction.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisColumnExtraction.class.equals(Float.class)
                        || StructuredAnalysisColumnExtraction.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisColumnExtraction.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisColumnExtraction.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisColumnExtraction.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisColumnExtraction) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisColumnExtraction'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'StructuredAnalysisColumnExtraction'",
            e);
      }

      // deserialize StructuredAnalysisAggregation
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisAggregation.class.equals(Integer.class)
            || StructuredAnalysisAggregation.class.equals(Long.class)
            || StructuredAnalysisAggregation.class.equals(Float.class)
            || StructuredAnalysisAggregation.class.equals(Double.class)
            || StructuredAnalysisAggregation.class.equals(Boolean.class)
            || StructuredAnalysisAggregation.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisAggregation.class.equals(Integer.class)
                        || StructuredAnalysisAggregation.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisAggregation.class.equals(Float.class)
                        || StructuredAnalysisAggregation.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisAggregation.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisAggregation.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisAggregation.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisAggregation) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisAggregation'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisAggregation'", e);
      }

      // deserialize StructuredAnalysisSort
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisSort.class.equals(Integer.class)
            || StructuredAnalysisSort.class.equals(Long.class)
            || StructuredAnalysisSort.class.equals(Float.class)
            || StructuredAnalysisSort.class.equals(Double.class)
            || StructuredAnalysisSort.class.equals(Boolean.class)
            || StructuredAnalysisSort.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisSort.class.equals(Integer.class)
                        || StructuredAnalysisSort.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisSort.class.equals(Float.class)
                        || StructuredAnalysisSort.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisSort.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisSort.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisSort.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisSort) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisSort'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisSort'", e);
      }

      // deserialize StructuredAnalysisLimit
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisLimit.class.equals(Integer.class)
            || StructuredAnalysisLimit.class.equals(Long.class)
            || StructuredAnalysisLimit.class.equals(Float.class)
            || StructuredAnalysisLimit.class.equals(Double.class)
            || StructuredAnalysisLimit.class.equals(Boolean.class)
            || StructuredAnalysisLimit.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisLimit.class.equals(Integer.class)
                        || StructuredAnalysisLimit.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisLimit.class.equals(Float.class)
                        || StructuredAnalysisLimit.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisLimit.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisLimit.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisLimit.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisLimit) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisLimit'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisLimit'", e);
      }

      // deserialize StructuredAnalysisCalculatedField
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisCalculatedField.class.equals(Integer.class)
            || StructuredAnalysisCalculatedField.class.equals(Long.class)
            || StructuredAnalysisCalculatedField.class.equals(Float.class)
            || StructuredAnalysisCalculatedField.class.equals(Double.class)
            || StructuredAnalysisCalculatedField.class.equals(Boolean.class)
            || StructuredAnalysisCalculatedField.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisCalculatedField.class.equals(Integer.class)
                        || StructuredAnalysisCalculatedField.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisCalculatedField.class.equals(Float.class)
                        || StructuredAnalysisCalculatedField.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisCalculatedField.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisCalculatedField.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisCalculatedField.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisCalculatedField) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisCalculatedField'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'StructuredAnalysisCalculatedField'", e);
      }

      // deserialize StructuredAnalysisCast
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisCast.class.equals(Integer.class)
            || StructuredAnalysisCast.class.equals(Long.class)
            || StructuredAnalysisCast.class.equals(Float.class)
            || StructuredAnalysisCast.class.equals(Double.class)
            || StructuredAnalysisCast.class.equals(Boolean.class)
            || StructuredAnalysisCast.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisCast.class.equals(Integer.class)
                        || StructuredAnalysisCast.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisCast.class.equals(Float.class)
                        || StructuredAnalysisCast.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisCast.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisCast.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisCast.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisCast) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisCast'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisCast'", e);
      }

      // deserialize StructuredAnalysisJoin
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisJoin.class.equals(Integer.class)
            || StructuredAnalysisJoin.class.equals(Long.class)
            || StructuredAnalysisJoin.class.equals(Float.class)
            || StructuredAnalysisJoin.class.equals(Double.class)
            || StructuredAnalysisJoin.class.equals(Boolean.class)
            || StructuredAnalysisJoin.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisJoin.class.equals(Integer.class)
                        || StructuredAnalysisJoin.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisJoin.class.equals(Float.class)
                        || StructuredAnalysisJoin.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisJoin.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisJoin.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisJoin.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisJoin) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisJoin'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisJoin'", e);
      }

      // deserialize StructuredAnalysisProjection
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisProjection.class.equals(Integer.class)
            || StructuredAnalysisProjection.class.equals(Long.class)
            || StructuredAnalysisProjection.class.equals(Float.class)
            || StructuredAnalysisProjection.class.equals(Double.class)
            || StructuredAnalysisProjection.class.equals(Boolean.class)
            || StructuredAnalysisProjection.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisProjection.class.equals(Integer.class)
                        || StructuredAnalysisProjection.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisProjection.class.equals(Float.class)
                        || StructuredAnalysisProjection.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisProjection.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisProjection.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisProjection.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisProjection) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisProjection'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisProjection'", e);
      }

      // deserialize StructuredAnalysisDestructure
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisDestructure.class.equals(Integer.class)
            || StructuredAnalysisDestructure.class.equals(Long.class)
            || StructuredAnalysisDestructure.class.equals(Float.class)
            || StructuredAnalysisDestructure.class.equals(Double.class)
            || StructuredAnalysisDestructure.class.equals(Boolean.class)
            || StructuredAnalysisDestructure.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisDestructure.class.equals(Integer.class)
                        || StructuredAnalysisDestructure.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisDestructure.class.equals(Float.class)
                        || StructuredAnalysisDestructure.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisDestructure.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisDestructure.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisDestructure.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisDestructure) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisDestructure'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StructuredAnalysisDestructure'", e);
      }

      StructuredAnalysisTransformation ret = new StructuredAnalysisTransformation();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public StructuredAnalysisTransformation getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "StructuredAnalysisTransformation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public StructuredAnalysisTransformation() {
    super("oneOf", Boolean.FALSE);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisFilter o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisColumnExtraction o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisAggregation o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisSort o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisLimit o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisCalculatedField o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisCast o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisJoin o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisProjection o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StructuredAnalysisTransformation(StructuredAnalysisDestructure o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("StructuredAnalysisFilter", new GenericType<StructuredAnalysisFilter>() {});
    schemas.put(
        "StructuredAnalysisColumnExtraction",
        new GenericType<StructuredAnalysisColumnExtraction>() {});
    schemas.put(
        "StructuredAnalysisAggregation", new GenericType<StructuredAnalysisAggregation>() {});
    schemas.put("StructuredAnalysisSort", new GenericType<StructuredAnalysisSort>() {});
    schemas.put("StructuredAnalysisLimit", new GenericType<StructuredAnalysisLimit>() {});
    schemas.put(
        "StructuredAnalysisCalculatedField",
        new GenericType<StructuredAnalysisCalculatedField>() {});
    schemas.put("StructuredAnalysisCast", new GenericType<StructuredAnalysisCast>() {});
    schemas.put("StructuredAnalysisJoin", new GenericType<StructuredAnalysisJoin>() {});
    schemas.put("StructuredAnalysisProjection", new GenericType<StructuredAnalysisProjection>() {});
    schemas.put(
        "StructuredAnalysisDestructure", new GenericType<StructuredAnalysisDestructure>() {});
    JSON.registerDescendants(
        StructuredAnalysisTransformation.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return StructuredAnalysisTransformation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: StructuredAnalysisFilter, StructuredAnalysisColumnExtraction,
   * StructuredAnalysisAggregation, StructuredAnalysisSort, StructuredAnalysisLimit,
   * StructuredAnalysisCalculatedField, StructuredAnalysisCast, StructuredAnalysisJoin,
   * StructuredAnalysisProjection, StructuredAnalysisDestructure
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(StructuredAnalysisFilter.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        StructuredAnalysisColumnExtraction.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisAggregation.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisSort.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisLimit.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        StructuredAnalysisCalculatedField.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisCast.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisJoin.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisProjection.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StructuredAnalysisDestructure.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be StructuredAnalysisFilter,"
            + " StructuredAnalysisColumnExtraction, StructuredAnalysisAggregation,"
            + " StructuredAnalysisSort, StructuredAnalysisLimit, StructuredAnalysisCalculatedField,"
            + " StructuredAnalysisCast, StructuredAnalysisJoin, StructuredAnalysisProjection,"
            + " StructuredAnalysisDestructure");
  }

  /**
   * Get the actual instance, which can be the following: StructuredAnalysisFilter,
   * StructuredAnalysisColumnExtraction, StructuredAnalysisAggregation, StructuredAnalysisSort,
   * StructuredAnalysisLimit, StructuredAnalysisCalculatedField, StructuredAnalysisCast,
   * StructuredAnalysisJoin, StructuredAnalysisProjection, StructuredAnalysisDestructure
   *
   * @return The actual instance (StructuredAnalysisFilter, StructuredAnalysisColumnExtraction,
   *     StructuredAnalysisAggregation, StructuredAnalysisSort, StructuredAnalysisLimit,
   *     StructuredAnalysisCalculatedField, StructuredAnalysisCast, StructuredAnalysisJoin,
   *     StructuredAnalysisProjection, StructuredAnalysisDestructure)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisFilter`. If the actual instance is not
   * `StructuredAnalysisFilter`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisFilter`
   * @throws ClassCastException if the instance is not `StructuredAnalysisFilter`
   */
  public StructuredAnalysisFilter getStructuredAnalysisFilter() throws ClassCastException {
    return (StructuredAnalysisFilter) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisColumnExtraction`. If the actual instance is not
   * `StructuredAnalysisColumnExtraction`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisColumnExtraction`
   * @throws ClassCastException if the instance is not `StructuredAnalysisColumnExtraction`
   */
  public StructuredAnalysisColumnExtraction getStructuredAnalysisColumnExtraction()
      throws ClassCastException {
    return (StructuredAnalysisColumnExtraction) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisAggregation`. If the actual instance is not
   * `StructuredAnalysisAggregation`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisAggregation`
   * @throws ClassCastException if the instance is not `StructuredAnalysisAggregation`
   */
  public StructuredAnalysisAggregation getStructuredAnalysisAggregation()
      throws ClassCastException {
    return (StructuredAnalysisAggregation) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisSort`. If the actual instance is not
   * `StructuredAnalysisSort`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisSort`
   * @throws ClassCastException if the instance is not `StructuredAnalysisSort`
   */
  public StructuredAnalysisSort getStructuredAnalysisSort() throws ClassCastException {
    return (StructuredAnalysisSort) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisLimit`. If the actual instance is not
   * `StructuredAnalysisLimit`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisLimit`
   * @throws ClassCastException if the instance is not `StructuredAnalysisLimit`
   */
  public StructuredAnalysisLimit getStructuredAnalysisLimit() throws ClassCastException {
    return (StructuredAnalysisLimit) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisCalculatedField`. If the actual instance is not
   * `StructuredAnalysisCalculatedField`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisCalculatedField`
   * @throws ClassCastException if the instance is not `StructuredAnalysisCalculatedField`
   */
  public StructuredAnalysisCalculatedField getStructuredAnalysisCalculatedField()
      throws ClassCastException {
    return (StructuredAnalysisCalculatedField) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisCast`. If the actual instance is not
   * `StructuredAnalysisCast`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisCast`
   * @throws ClassCastException if the instance is not `StructuredAnalysisCast`
   */
  public StructuredAnalysisCast getStructuredAnalysisCast() throws ClassCastException {
    return (StructuredAnalysisCast) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisJoin`. If the actual instance is not
   * `StructuredAnalysisJoin`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisJoin`
   * @throws ClassCastException if the instance is not `StructuredAnalysisJoin`
   */
  public StructuredAnalysisJoin getStructuredAnalysisJoin() throws ClassCastException {
    return (StructuredAnalysisJoin) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisProjection`. If the actual instance is not
   * `StructuredAnalysisProjection`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisProjection`
   * @throws ClassCastException if the instance is not `StructuredAnalysisProjection`
   */
  public StructuredAnalysisProjection getStructuredAnalysisProjection() throws ClassCastException {
    return (StructuredAnalysisProjection) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisDestructure`. If the actual instance is not
   * `StructuredAnalysisDestructure`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisDestructure`
   * @throws ClassCastException if the instance is not `StructuredAnalysisDestructure`
   */
  public StructuredAnalysisDestructure getStructuredAnalysisDestructure()
      throws ClassCastException {
    return (StructuredAnalysisDestructure) super.getActualInstance();
  }
}
