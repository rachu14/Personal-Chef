package com.example.receipeapp.Listeners;

import com.example.receipeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> response,String message);
    void didError(String message);
}
