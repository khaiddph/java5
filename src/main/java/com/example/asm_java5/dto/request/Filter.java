package com.example.asm_java5.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public  class Filter {
  @JsonProperty
  int offset;
  @JsonProperty
  int limit;
}
