package com.example.receipeapp.Models;

import com.example.receipeapp.Models.Equipment;
import com.example.receipeapp.Models.Ingredient;
import com.example.receipeapp.Models.Length;

import java.util.ArrayList;

public class Step {
    public int number;
    public String step;
    public ArrayList<Ingredient> ingredients;
    public ArrayList<Equipment> equipment;
    public Length length;
}
