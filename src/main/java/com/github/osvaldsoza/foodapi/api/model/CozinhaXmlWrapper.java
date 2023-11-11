package com.github.osvaldsoza.foodapi.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.github.osvaldsoza.foodapi.domain.model.Cozinha;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@JacksonXmlRootElement(localName = "cozinhas")
@Data
public class CozinhaXmlWrapper {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("cozinha")
    @NonNull
    private List<Cozinha> cozinhas;
}
