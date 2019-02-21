package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EventType
 */
public enum EventType {
  PLANTING("PLANTING"),
    SOWING("SOWING"),
    PACKING("PACKING"),
    TABLE_SPREAD("TABLE_SPREAD"),
    CULTIVATION_OBSERVATION("CULTIVATION_OBSERVATION"),
    HARVEST("HARVEST"),
    WASTAGE("WASTAGE");

  private String value;

  EventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventType fromValue(String text) {
    for (EventType b : EventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
