package com.example.resources.campusresourcesapi.dto;


public class ResourceDTO {
    public record ResourceDTO(String id, String name, String category, String location, String url, List<String> tags){}
}
