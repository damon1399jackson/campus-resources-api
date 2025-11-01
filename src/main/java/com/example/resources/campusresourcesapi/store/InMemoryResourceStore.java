package com.example.resources.campusresourcesapi.store;

import com.example.resources.campusresourcesapi.dto.ResourceDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryResourceStore {
    private final Map<String, ResourceDTO> byId = new HashMap<>();
    private final List<ResourceDTO> all  = new ArrayList<>();

}

